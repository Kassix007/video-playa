package c4;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import d2.C0985k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10238b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, Object obj) {
        this.f10237a = i;
        this.f10238b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10237a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4.g gVar = ((BottomSheetBehavior) this.f10238b).i;
                if (gVar != null) {
                    s4.f fVar = gVar.f16505q;
                    if (fVar.i != fFloatValue) {
                        fVar.i = fFloatValue;
                        gVar.f16509u = true;
                        gVar.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0985k c0985k = (C0985k) this.f10238b;
                c0985k.f12140c.setAlpha(iFloatValue);
                c0985k.f12141d.setAlpha(iFloatValue);
                c0985k.f12153s.invalidate();
                break;
            case 2:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f10238b;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
            default:
                ((TextInputLayout) this.f10238b).f11623L0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
