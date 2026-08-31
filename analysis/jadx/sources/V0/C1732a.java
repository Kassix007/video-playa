package v0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1732a extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1732a f17435q = new C1732a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(v.f17496a);
        return this;
    }
}
