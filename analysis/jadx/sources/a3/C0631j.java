package a3;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631j implements InterfaceC0621B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f8832b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0631j(LottieAnimationView lottieAnimationView, int i) {
        this.f8831a = i;
        switch (i) {
            case 1:
                this.f8832b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f8832b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.InterfaceC0621B
    public final void onResult(Object obj) {
        switch (this.f8831a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f8832b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.f10279w;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    InterfaceC0621B interfaceC0621B = lottieAnimationView.f10278v;
                    if (interfaceC0621B == null) {
                        interfaceC0621B = LottieAnimationView.f10269G;
                    }
                    interfaceC0621B.onResult(th);
                    break;
                }
                break;
            default:
                C0632k c0632k = (C0632k) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f8832b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(c0632k);
                    break;
                }
                break;
        }
    }
}
