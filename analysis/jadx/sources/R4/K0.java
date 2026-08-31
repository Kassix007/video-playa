package R4;

import android.R;
import android.os.Build;
import com.web2native.MainActivity;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K0 implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f6785r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ K0(C0498s0 c0498s0, int i) {
        this.f6784q = i;
        this.f6785r = c0498s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f6784q) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                C0498s0 c0498s0 = this.f6785r;
                if (i >= 30) {
                    c0498s0.d();
                } else {
                    c0498s0.c();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    MainActivity mainActivity = this.f6785r.f7180a;
                    mainActivity.getWindow().setFlags(1024, 1024);
                    mainActivity.getWindow().getDecorView().setSystemUiVisibility(4102);
                    mainActivity.getWindow().setStatusBarColor(mainActivity.getResources().getColor(R.color.transparent));
                    mainActivity.getWindow().setNavigationBarColor(mainActivity.getResources().getColor(R.color.transparent));
                    if (Build.VERSION.SDK_INT >= 28) {
                        mainActivity.getWindow().getAttributes().layoutInDisplayCutoutMode = 0;
                    }
                }
                break;
        }
        return C1386y.f15098a;
    }
}
