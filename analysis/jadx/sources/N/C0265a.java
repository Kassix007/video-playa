package N;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: N.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265a extends CancellationException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
