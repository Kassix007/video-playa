package M;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3294b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ D(int i, Object obj) {
        this.f3293a = i;
        this.f3294b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackInvoked() {
        switch (this.f3293a) {
            case 0:
                ((B5.a) this.f3294b).invoke();
                break;
            case 1:
                ((b.w) this.f3294b).invoke();
                break;
            case 2:
                ((h.y) this.f3294b).C();
                break;
            default:
                ((Runnable) this.f3294b).run();
                break;
        }
    }
}
