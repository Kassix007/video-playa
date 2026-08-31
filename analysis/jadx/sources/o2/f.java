package o2;

import R4.X1;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15366b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(m mVar, int i) {
        this.f15365a = i;
        this.f15366b = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        k kVar;
        switch (this.f15365a) {
            case 0:
                X1 x12 = (X1) this.f15366b;
                if (!x12.f15404s) {
                    x12.l();
                } else {
                    x12.f15391P.setAlpha(255);
                    x12.f15391P.start();
                    if (x12.f15396U && (kVar = x12.f15403r) != null) {
                        kVar.a();
                    }
                    x12.f15379D = x12.f15385J.getTop();
                }
                break;
            default:
                m mVar = this.f15366b;
                g gVar = new g(mVar, 1);
                mVar.f15393R = gVar;
                gVar.setDuration(150L);
                C1414a c1414a = mVar.f15385J;
                c1414a.f15332q = null;
                c1414a.clearAnimation();
                mVar.f15385J.startAnimation(mVar.f15393R);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f15365a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f15365a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
