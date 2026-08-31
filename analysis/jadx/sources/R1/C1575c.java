package r1;

import M5.C0247h;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1362a;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1575c extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0247h f16273q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1575c(C0247h c0247h) {
        super(false);
        this.f16273q = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f16273q.resumeWith(AbstractC1362a.b(th));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f16273q.resumeWith(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
