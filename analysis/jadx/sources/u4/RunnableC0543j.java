package U4;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;

/* JADX INFO: renamed from: U4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0543j implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7835r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0543j(P.W w3, int i) {
        this.f7834q = i;
        this.f7835r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7834q) {
            case 0:
                Boolean bool = Boolean.TRUE;
                P.W w3 = this.f7835r;
                w3.setValue(bool);
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0543j(w3, 1), WorkRequest.MIN_BACKOFF_MILLIS);
                break;
            case 1:
                this.f7835r.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f7835r.setValue(Boolean.FALSE);
                break;
            default:
                this.f7835r.setValue(Boolean.FALSE);
                break;
        }
    }
}
