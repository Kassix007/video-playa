package com.google.android.material.theme;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.button.MaterialButton;
import com.wnapp.smspariaz.R;
import f4.c;
import h.C1095B;
import l4.m;
import m.C1243A;
import m.C1292Z;
import m.C1320n;
import m.C1322o;
import m.C1324p;
import o4.C1418a;
import v4.s;
import w4.C1868a;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1095B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.C1095B
    public final C1320n a(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.C1095B
    public final C1322o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.C1095B
    public final C1324p c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.C1095B
    public final C1243A d(Context context, AttributeSet attributeSet) {
        C1418a c1418a = new C1418a(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c1418a.getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, V3.a.f7989r, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayG.hasValue(0)) {
            c1418a.setButtonTintList(I1.Z(context2, typedArrayG, 0));
        }
        c1418a.f15435v = typedArrayG.getBoolean(1, false);
        typedArrayG.recycle();
        return c1418a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.C1095B
    public final C1292Z e(Context context, AttributeSet attributeSet) {
        C1868a c1868a = new C1868a(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c1868a.getContext();
        if (AbstractC0597a.N(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = V3.a.f7992u;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iG = C1868a.g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, V3.a.f7991t);
                    int iG2 = C1868a.g(c1868a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        c1868a.setLineHeight(iG2);
                    }
                }
            }
        }
        return c1868a;
    }
}
