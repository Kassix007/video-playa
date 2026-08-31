package com.google.android.material.datepicker;

import O3.D;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f11478b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0597a.O(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, V3.a.f7986o);
        D.o(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        D.o(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        D.o(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        D.o(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListZ = I1.Z(context, typedArrayObtainStyledAttributes, 7);
        this.f11477a = D.o(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        D.o(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f11478b = D.o(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListZ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
