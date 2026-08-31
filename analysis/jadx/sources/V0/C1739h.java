package v0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: v0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1739h extends CancellationException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1739h(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(v.f17496a);
        return this;
    }
}
