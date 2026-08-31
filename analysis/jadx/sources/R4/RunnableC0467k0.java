package R4;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: renamed from: R4.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0467k0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f7040r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0467k0(C0498s0 c0498s0, int i) {
        this.f7039q = i;
        this.f7040r = c0498s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7039q) {
            case 0:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0467k0(this.f7040r, 1), 500L);
                break;
            default:
                Toast.makeText(this.f7040r.f7180a.getApplicationContext(), "File downloaded successfully in Downloads folder", 0).show();
                break;
        }
    }
}
