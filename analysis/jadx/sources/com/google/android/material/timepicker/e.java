package com.google.android.material.timepicker;

import C0.RunnableC0089m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import s4.j;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RunnableC0089m f11712G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f11713H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final s4.g f11714I;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        s4.g gVar = new s4.g();
        this.f11714I = gVar;
        s4.h hVar = new s4.h(0.5f);
        j jVarE = gVar.f16505q.f16479a.e();
        jVarE.f16520e = hVar;
        jVarE.f = hVar;
        jVarE.f16521g = hVar;
        jVarE.f16522h = hVar;
        gVar.setShapeAppearanceModel(jVarE.a());
        this.f11714I.k(ColorStateList.valueOf(-1));
        s4.g gVar2 = this.f11714I;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setBackground(gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7996y, R.attr.materialClockStyle, 0);
        this.f11713H = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11712G = new RunnableC0089m(14, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0089m runnableC0089m = this.f11712G;
            handler.removeCallbacks(runnableC0089m);
            handler.post(runnableC0089m);
        }
    }

    public abstract void l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0089m runnableC0089m = this.f11712G;
            handler.removeCallbacks(runnableC0089m);
            handler.post(runnableC0089m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f11714I.k(ColorStateList.valueOf(i));
    }
}
