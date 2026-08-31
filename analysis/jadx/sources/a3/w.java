package a3;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8882b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w(int i, Object obj) {
        this.f8881a = i;
        this.f8882b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8881a) {
            case 0:
                y yVar = (y) this.f8882b;
                EnumC0622a enumC0622a = yVar.f8913b0;
                if (enumC0622a == null) {
                    enumC0622a = EnumC0622a.f8809q;
                }
                if (enumC0622a != EnumC0622a.f8810r) {
                    j3.c cVar = yVar.f8890E;
                    if (cVar != null) {
                        cVar.r(yVar.f8921r.a());
                    }
                } else {
                    yVar.invalidateSelf();
                }
                break;
            case 1:
                v4.j jVar = (v4.j) this.f8882b;
                jVar.getClass();
                jVar.f17667d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((h.I) ((k3.d) this.f8882b).f14122r).f13241w.getParent()).invalidate();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ w(k3.d dVar, View view) {
        this.f8881a = 2;
        this.f8882b = dVar;
    }
}
