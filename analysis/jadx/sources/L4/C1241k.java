package l4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import q2.AbstractC1509n;
import q2.C1517v;

/* JADX INFO: renamed from: l4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1241k extends AbstractC1509n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void d(C1517v c1517v) {
        View view = c1517v.f16003b;
        if (view instanceof TextView) {
            c1517v.f16002a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void g(C1517v c1517v) {
        View view = c1517v.f16003b;
        if (view instanceof TextView) {
            c1517v.f16002a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final Animator k(ViewGroup viewGroup, C1517v c1517v, C1517v c1517v2) {
        if (c1517v == null || c1517v2 == null || !(c1517v.f16003b instanceof TextView)) {
            return null;
        }
        View view = c1517v2.f16003b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = c1517v.f16002a;
        HashMap map2 = c1517v2.f16002a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new c4.b(2, textView));
        return valueAnimatorOfFloat;
    }
}
