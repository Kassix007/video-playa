package c0;

import java.util.concurrent.CancellationException;
import v0.v;
import w.AbstractC1802p0;

/* JADX INFO: renamed from: c0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726n extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10110q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0726n(String str, int i) {
        super(str);
        this.f10110q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f10110q) {
            case 0:
                setStackTrace(AbstractC0727o.f10111a);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(v.f17496a);
                break;
            default:
                setStackTrace(AbstractC1802p0.f18044d);
                break;
        }
        return this;
    }
}
