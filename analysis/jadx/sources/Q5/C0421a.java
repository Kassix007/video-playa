package Q5;

import P5.InterfaceC0398i;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Q5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421a extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object f6598q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0421a(InterfaceC0398i interfaceC0398i) {
        super("Flow was aborted, no more elements needed");
        this.f6598q = interfaceC0398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
