package com.google.android.material.timepicker;

import I2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import g1.C1079i;
import g1.C1080j;
import g1.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.AbstractC1175c;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ClockHandView f11679J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f11680K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RectF f11681L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f11682M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final SparseArray f11683N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final c f11684O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int[] f11685P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final float[] f11686Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f11687R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f11688S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f11689T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f11690U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String[] f11691V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f11692W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ColorStateList f11693a0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11680K = new Rect();
        this.f11681L = new RectF();
        this.f11682M = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f11683N = sparseArray;
        this.f11686Q = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListZ = I1.Z(context, typedArrayObtainStyledAttributes, 1);
        this.f11693a0 = colorStateListZ;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f11679J = clockHandView;
        this.f11687R = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListZ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListZ.getDefaultColor());
        this.f11685P = new int[]{colorForState, colorForState, colorStateListZ.getDefaultColor()};
        clockHandView.f11699s.add(this);
        int defaultColor = AbstractC1175c.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListZ2 = I1.Z(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListZ2 != null ? colorStateListZ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f11684O = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f11691V = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i = 0; i < Math.max(this.f11691V.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f11691V.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f11691V[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i7 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i7));
                z5 = i7 > 1 ? true : z5;
                AbstractC1835K.m(textView, this.f11684O);
                textView.setTextColor(this.f11693a0);
            }
        }
        ClockHandView clockHandView2 = this.f11679J;
        if (clockHandView2.f11698r && !z5) {
            clockHandView2.f11696C = 1;
        }
        clockHandView2.f11698r = z5;
        clockHandView2.invalidate();
        this.f11688S = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f11689T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f11690U = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.timepicker.e
    public final void l() {
        n nVar = new n();
        nVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i7 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i7 == null) {
                    i7 = 1;
                }
                if (!map.containsKey(i7)) {
                    map.put(i7, new ArrayList());
                }
                ((List) map.get(i7)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f11713H * 0.66f) : this.f11713H;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = nVar.f13023c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C1079i());
                }
                C1080j c1080j = ((C1079i) map2.get(Integer.valueOf(id))).f12930d;
                c1080j.f12996z = R.id.circle_center;
                c1080j.f12933A = iRound;
                c1080j.f12934B = size;
                size += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f11683N;
            if (i8 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i8)).setVisibility(0);
            i8++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f11679J.f11703w;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f11683N;
            int size = sparseArray.size();
            rect = this.f11680K;
            rectF = this.f11681L;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            TextView textView3 = (TextView) sparseArray.get(i7);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f11682M);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f11685P, this.f11686Q, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) l.a(1, this.f11691V.length, 1).f2365a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f11690U / Math.max(Math.max(this.f11688S / displayMetrics.heightPixels, this.f11689T / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
