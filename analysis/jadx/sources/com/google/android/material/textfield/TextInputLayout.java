package com.google.android.material.textfield;

import B0.G0;
import C0.RunnableC0089m;
import C0.Z0;
import a.AbstractC0597a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c4.b;
import c4.c;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.internal.CheckableImageButton;
import i3.C1136a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k1.AbstractC1175c;
import l4.AbstractC1233c;
import l4.C1232b;
import m.AbstractC1313j0;
import m.C1292Z;
import m.C1328r;
import n1.AbstractC1393a;
import p4.C1480a;
import p4.C1483d;
import q2.AbstractC1513r;
import q2.C1503h;
import s4.e;
import s4.f;
import s4.g;
import s4.i;
import s4.j;
import s4.k;
import u1.AbstractC1679f;
import u1.C1675b;
import v4.l;
import v4.m;
import v4.p;
import v4.q;
import v4.s;
import v4.u;
import v4.v;
import v4.w;
import v4.x;
import v4.y;
import w1.AbstractC1829E;
import w1.AbstractC1835K;
import x4.a;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final int[][] f11600S0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11601A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f11602A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11603B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f11604B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f11605C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f11606C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public x f11607D;
    public ColorStateList D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1292Z f11608E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f11609E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f11610F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f11611F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11612G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f11613G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f11614H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f11615H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f11616I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f11617I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1292Z f11618J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f11619J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f11620K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f11621K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11622L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final C1232b f11623L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1503h f11624M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f11625M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1503h f11626N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f11627N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ColorStateList f11628O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ValueAnimator f11629O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ColorStateList f11630P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f11631P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f11632Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f11633Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f11634R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f11635R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f11636S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f11637T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f11638U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public g f11639V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public g f11640W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public StateListDrawable f11641a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f11642b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g f11643c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public g f11644d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public k f11645e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f11646f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f11647g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f11648h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f11649i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f11650j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f11651k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f11652l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f11653m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f11654n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Rect f11655o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f11656p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FrameLayout f11657q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RectF f11658q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f11659r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Typeface f11660r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f11661s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorDrawable f11662s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f11663t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f11664t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f11665u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final LinkedHashSet f11666u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11667v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ColorDrawable f11668v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11669w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f11670w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11671x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f11672x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11673y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f11674y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q f11675z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f11676z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.wnapp.smspariaz.R.attr.textInputStyle, com.wnapp.smspariaz.R.style.Widget_Design_TextInputLayout), attributeSet, com.wnapp.smspariaz.R.attr.textInputStyle);
        this.f11667v = -1;
        this.f11669w = -1;
        this.f11671x = -1;
        this.f11673y = -1;
        this.f11675z = new q(this);
        this.f11607D = new Z0(25);
        this.f11655o0 = new Rect();
        this.f11656p0 = new Rect();
        this.f11658q0 = new RectF();
        this.f11666u0 = new LinkedHashSet();
        C1232b c1232b = new C1232b(this);
        this.f11623L0 = c1232b;
        this.f11635R0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11657q = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = W3.a.f8108a;
        c1232b.f14516Q = linearInterpolator;
        c1232b.h(false);
        c1232b.f14515P = linearInterpolator;
        c1232b.h(false);
        if (c1232b.f14537g != 8388659) {
            c1232b.f14537g = 8388659;
            c1232b.h(false);
        }
        G0 g0H = l4.m.h(context2, attributeSet, V3.a.f7973F, com.wnapp.smspariaz.R.attr.textInputStyle, com.wnapp.smspariaz.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        u uVar = new u(this, g0H);
        this.f11659r = uVar;
        TypedArray typedArray = (TypedArray) g0H.f235s;
        this.f11636S = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f11627N0 = typedArray.getBoolean(47, true);
        this.f11625M0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f11645e0 = k.b(context2, attributeSet, com.wnapp.smspariaz.R.attr.textInputStyle, com.wnapp.smspariaz.R.style.Widget_Design_TextInputLayout).a();
        this.f11647g0 = context2.getResources().getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f11649i0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f11651k0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f11652l0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f11650j0 = this.f11651k0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        j jVarE = this.f11645e0.e();
        if (dimension >= 0.0f) {
            jVarE.f16520e = new s4.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVarE.f = new s4.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVarE.f16521g = new s4.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVarE.f16522h = new s4.a(dimension4);
        }
        this.f11645e0 = jVarE.a();
        ColorStateList colorStateListY = I1.Y(context2, g0H, 7);
        if (colorStateListY != null) {
            int defaultColor = colorStateListY.getDefaultColor();
            this.f11609E0 = defaultColor;
            this.f11654n0 = defaultColor;
            if (colorStateListY.isStateful()) {
                this.f11611F0 = colorStateListY.getColorForState(new int[]{-16842910}, -1);
                this.f11613G0 = colorStateListY.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f11615H0 = colorStateListY.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f11613G0 = this.f11609E0;
                ColorStateList colorStateListB = AbstractC1175c.b(context2, com.wnapp.smspariaz.R.color.mtrl_filled_background_color);
                this.f11611F0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f11615H0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f11654n0 = 0;
            this.f11609E0 = 0;
            this.f11611F0 = 0;
            this.f11613G0 = 0;
            this.f11615H0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListW = g0H.w(1);
            this.f11676z0 = colorStateListW;
            this.f11674y0 = colorStateListW;
        }
        ColorStateList colorStateListY2 = I1.Y(context2, g0H, 14);
        this.f11606C0 = typedArray.getColor(14, 0);
        this.f11602A0 = context2.getColor(com.wnapp.smspariaz.R.color.mtrl_textinput_default_box_stroke_color);
        this.f11617I0 = context2.getColor(com.wnapp.smspariaz.R.color.mtrl_textinput_disabled_color);
        this.f11604B0 = context2.getColor(com.wnapp.smspariaz.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListY2 != null) {
            setBoxStrokeColorStateList(colorStateListY2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(I1.Y(context2, g0H, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f11632Q = g0H.w(24);
        this.f11634R = g0H.w(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z5 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z6 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z7 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f11612G = typedArray.getResourceId(22, 0);
        this.f11610F = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f11610F);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f11612G);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(g0H.w(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(g0H.w(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(g0H.w(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(g0H.w(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(g0H.w(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(g0H.w(58));
        }
        m mVar = new m(this, g0H);
        this.f11661s = mVar;
        boolean z8 = typedArray.getBoolean(0, true);
        g0H.R();
        setImportantForAccessibility(2);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 >= 26) {
            AbstractC1829E.b(this, 1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z8);
        setHelperTextEnabled(z6);
        setErrorEnabled(z5);
        setCounterEnabled(z7);
        setHelperText(text2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f11663t;
        if (!(editText instanceof AutoCompleteTextView) || I1.q0(editText)) {
            return this.f11639V;
        }
        int iD = Q2.g.D(this.f11663t, com.wnapp.smspariaz.R.attr.colorControlHighlight);
        int i = this.f11648h0;
        int[][] iArr = f11600S0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f11639V;
            int i7 = this.f11654n0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{Q2.g.I(0.1f, iD, i7), i7}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f11639V;
        TypedValue typedValueO = AbstractC0597a.O(context, com.wnapp.smspariaz.R.attr.colorSurface, "TextInputLayout");
        int i8 = typedValueO.resourceId;
        int color = i8 != 0 ? context.getColor(i8) : typedValueO.data;
        g gVar3 = new g(gVar2.f16505q.f16479a);
        int I6 = Q2.g.I(0.1f, iD, color);
        gVar3.k(new ColorStateList(iArr, new int[]{I6, 0}));
        gVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I6, color});
        g gVar4 = new g(gVar2.f16505q.f16479a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f11641a0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f11641a0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f11641a0.addState(new int[0], f(false));
        }
        return this.f11641a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f11640W == null) {
            this.f11640W = f(true);
        }
        return this.f11640W;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setEditText(EditText editText) {
        if (this.f11663t != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f11663t = editText;
        int i = this.f11667v;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f11671x);
        }
        int i7 = this.f11669w;
        if (i7 != -1) {
            setMaxEms(i7);
        } else {
            setMaxWidth(this.f11673y);
        }
        this.f11642b0 = false;
        i();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.f11663t.getTypeface();
        C1232b c1232b = this.f11623L0;
        c1232b.m(typeface);
        float textSize = this.f11663t.getTextSize();
        if (c1232b.f14538h != textSize) {
            c1232b.f14538h = textSize;
            c1232b.h(false);
        }
        int i8 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f11663t.getLetterSpacing();
        if (c1232b.f14522W != letterSpacing) {
            c1232b.f14522W = letterSpacing;
            c1232b.h(false);
        }
        int gravity = this.f11663t.getGravity();
        int i9 = (gravity & (-113)) | 48;
        if (c1232b.f14537g != i9) {
            c1232b.f14537g = i9;
            c1232b.h(false);
        }
        if (c1232b.f != gravity) {
            c1232b.f = gravity;
            c1232b.h(false);
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        this.f11619J0 = editText.getMinimumHeight();
        this.f11663t.addTextChangedListener(new v(this, editText));
        if (this.f11674y0 == null) {
            this.f11674y0 = this.f11663t.getHintTextColors();
        }
        if (this.f11636S) {
            if (TextUtils.isEmpty(this.f11637T)) {
                CharSequence hint = this.f11663t.getHint();
                this.f11665u = hint;
                setHint(hint);
                this.f11663t.setHint((CharSequence) null);
            }
            this.f11638U = true;
        }
        if (i8 >= 29) {
            p();
        }
        if (this.f11608E != null) {
            n(this.f11663t.getText());
        }
        r();
        this.f11675z.b();
        this.f11659r.bringToFront();
        m mVar = this.f11661s;
        mVar.bringToFront();
        Iterator it = this.f11666u0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f11637T)) {
            return;
        }
        this.f11637T = charSequence;
        C1232b c1232b = this.f11623L0;
        if (charSequence == null || !TextUtils.equals(c1232b.f14500A, charSequence)) {
            c1232b.f14500A = charSequence;
            c1232b.f14501B = null;
            Bitmap bitmap = c1232b.f14504E;
            if (bitmap != null) {
                bitmap.recycle();
                c1232b.f14504E = null;
            }
            c1232b.h(false);
        }
        if (this.f11621K0) {
            return;
        }
        j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f11616I == z5) {
            return;
        }
        if (z5) {
            C1292Z c1292z = this.f11618J;
            if (c1292z != null) {
                this.f11657q.addView(c1292z);
                this.f11618J.setVisibility(0);
            }
        } else {
            C1292Z c1292z2 = this.f11618J;
            if (c1292z2 != null) {
                c1292z2.setVisibility(8);
            }
            this.f11618J = null;
        }
        this.f11616I = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f) {
        C1232b c1232b = this.f11623L0;
        if (c1232b.f14528b == f) {
            return;
        }
        if (this.f11629O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11629O0 = valueAnimator;
            valueAnimator.setInterpolator(C3.a.N(getContext(), com.wnapp.smspariaz.R.attr.motionEasingEmphasizedInterpolator, W3.a.f8109b));
            this.f11629O0.setDuration(C3.a.M(getContext(), com.wnapp.smspariaz.R.attr.motionDurationMedium4, 167));
            this.f11629O0.addUpdateListener(new b(3, this));
        }
        this.f11629O0.setFloatValues(c1232b.f14528b, f);
        this.f11629O0.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f11657q;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i;
        int i7;
        g gVar = this.f11639V;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f16505q.f16479a;
        k kVar2 = this.f11645e0;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f11648h0 == 2 && (i = this.f11650j0) > -1 && (i7 = this.f11653m0) != 0) {
            g gVar2 = this.f11639V;
            gVar2.f16505q.j = i;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i7);
            f fVar = gVar2.f16505q;
            if (fVar.f16482d != colorStateListValueOf) {
                fVar.f16482d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iC = this.f11654n0;
        if (this.f11648h0 == 1) {
            iC = AbstractC1393a.c(this.f11654n0, Q2.g.C(getContext(), com.wnapp.smspariaz.R.attr.colorSurface, 0));
        }
        this.f11654n0 = iC;
        this.f11639V.k(ColorStateList.valueOf(iC));
        g gVar3 = this.f11643c0;
        if (gVar3 != null && this.f11644d0 != null) {
            if (this.f11650j0 > -1 && this.f11653m0 != 0) {
                gVar3.k(this.f11663t.isFocused() ? ColorStateList.valueOf(this.f11602A0) : ColorStateList.valueOf(this.f11653m0));
                this.f11644d0.k(ColorStateList.valueOf(this.f11653m0));
            }
            invalidate();
        }
        s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        float fD;
        if (!this.f11636S) {
            return 0;
        }
        int i = this.f11648h0;
        C1232b c1232b = this.f11623L0;
        if (i == 0) {
            fD = c1232b.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = c1232b.d() / 2.0f;
        }
        return (int) fD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1503h d() {
        C1503h c1503h = new C1503h();
        c1503h.f15984s = C3.a.M(getContext(), com.wnapp.smspariaz.R.attr.motionDurationShort2, 87);
        c1503h.f15985t = C3.a.N(getContext(), com.wnapp.smspariaz.R.attr.motionEasingLinearInterpolator, W3.a.f8108a);
        return c1503h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f11663t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f11665u != null) {
            boolean z5 = this.f11638U;
            this.f11638U = false;
            CharSequence hint = editText.getHint();
            this.f11663t.setHint(this.f11665u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f11663t.setHint(hint);
                this.f11638U = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f11657q;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i7 = 0; i7 < frameLayout.getChildCount(); i7++) {
            View childAt = frameLayout.getChildAt(i7);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i7);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f11663t) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f11633Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f11633Q0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z5 = this.f11636S;
        C1232b c1232b = this.f11623L0;
        if (z5) {
            TextPaint textPaint = c1232b.f14513N;
            RectF rectF = c1232b.f14534e;
            int iSave = canvas2.save();
            if (c1232b.f14501B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c1232b.f14506G);
                float f = c1232b.f14544p;
                float f7 = c1232b.f14545q;
                float f8 = c1232b.f14505F;
                if (f8 != 1.0f) {
                    canvas2.scale(f8, f8, f, f7);
                }
                if (c1232b.f14533d0 <= 1 || c1232b.f14502C) {
                    canvas2.translate(f, f7);
                    c1232b.f14524Y.draw(canvas2);
                } else {
                    float lineStart = c1232b.f14544p - c1232b.f14524Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f7);
                    float f9 = alpha;
                    textPaint.setAlpha((int) (c1232b.f14529b0 * f9));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f10 = c1232b.f14507H;
                        float f11 = c1232b.f14508I;
                        float f12 = c1232b.f14509J;
                        int i7 = c1232b.f14510K;
                        textPaint.setShadowLayer(f10, f11, f12, AbstractC1393a.e(i7, (textPaint.getAlpha() * Color.alpha(i7)) / 255));
                    }
                    c1232b.f14524Y.draw(canvas2);
                    textPaint.setAlpha((int) (c1232b.f14527a0 * f9));
                    if (i >= 31) {
                        float f13 = c1232b.f14507H;
                        float f14 = c1232b.f14508I;
                        float f15 = c1232b.f14509J;
                        int i8 = c1232b.f14510K;
                        textPaint.setShadowLayer(f13, f14, f15, AbstractC1393a.e(i8, (Color.alpha(i8) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c1232b.f14524Y.getLineBaseline(0);
                    CharSequence charSequence = c1232b.f14531c0;
                    float f16 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c1232b.f14507H, c1232b.f14508I, c1232b.f14509J, c1232b.f14510K);
                    }
                    String strTrim = c1232b.f14531c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c1232b.f14524Y.getLineEnd(0), str.length()), 0.0f, f16, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f11644d0 == null || (gVar = this.f11643c0) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f11663t.isFocused()) {
            Rect bounds = this.f11644d0.getBounds();
            Rect bounds2 = this.f11643c0.getBounds();
            float f17 = c1232b.f14528b;
            int iCenterX = bounds2.centerX();
            bounds.left = W3.a.c(f17, iCenterX, bounds2.left);
            bounds.right = W3.a.c(f17, iCenterX, bounds2.right);
            this.f11644d0.draw(canvas2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f11631P0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f11631P0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            l4.b r3 = r4.f11623L0
            if (r3 == 0) goto L2f
            r3.f14511L = r1
            android.content.res.ColorStateList r1 = r3.f14539k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f11663t
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = w1.AbstractC1835K.f18149a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f11631P0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.f11636S && !TextUtils.isEmpty(this.f11637T) && (this.f11639V instanceof v4.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g f(boolean z5) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f11663t;
        float popupElevation = editText instanceof s ? ((s) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        int i = 0;
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        s4.a aVar = new s4.a(f);
        s4.a aVar2 = new s4.a(f);
        s4.a aVar3 = new s4.a(dimensionPixelOffset);
        s4.a aVar4 = new s4.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f16525a = iVar;
        kVar.f16526b = iVar2;
        kVar.f16527c = iVar3;
        kVar.f16528d = iVar4;
        kVar.f16529e = aVar;
        kVar.f = aVar2;
        kVar.f16530g = aVar4;
        kVar.f16531h = aVar3;
        kVar.i = eVar;
        kVar.j = eVar2;
        kVar.f16532k = eVar3;
        kVar.f16533l = eVar4;
        EditText editText2 = this.f11663t;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof s ? ((s) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f16492M;
            TypedValue typedValueO = AbstractC0597a.O(context, com.wnapp.smspariaz.R.attr.colorSurface, g.class.getSimpleName());
            int i7 = typedValueO.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i7 != 0 ? context.getColor(i7) : typedValueO.data);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.k(dropDownBackgroundTintList);
        gVar.j(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f16505q;
        if (fVar.f16484g == null) {
            fVar.f16484g = new Rect();
        }
        gVar.f16505q.f16484g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int i, boolean z5) {
        return ((z5 || getPrefixText() == null) ? (!z5 || getSuffixText() == null) ? this.f11663t.getCompoundPaddingLeft() : this.f11661s.c() : this.f11659r.a()) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11663t;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g getBoxBackground() {
        int i = this.f11648h0;
        if (i == 1 || i == 2) {
            return this.f11639V;
        }
        throw new IllegalStateException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxBackgroundColor() {
        return this.f11654n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxBackgroundMode() {
        return this.f11648h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxCollapsedPaddingTop() {
        return this.f11649i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getBoxCornerRadiusBottomEnd() {
        boolean zF = l4.m.f(this);
        RectF rectF = this.f11658q0;
        return zF ? this.f11645e0.f16531h.a(rectF) : this.f11645e0.f16530g.a(rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getBoxCornerRadiusBottomStart() {
        boolean zF = l4.m.f(this);
        RectF rectF = this.f11658q0;
        return zF ? this.f11645e0.f16530g.a(rectF) : this.f11645e0.f16531h.a(rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getBoxCornerRadiusTopEnd() {
        boolean zF = l4.m.f(this);
        RectF rectF = this.f11658q0;
        return zF ? this.f11645e0.f16529e.a(rectF) : this.f11645e0.f.a(rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getBoxCornerRadiusTopStart() {
        boolean zF = l4.m.f(this);
        RectF rectF = this.f11658q0;
        return zF ? this.f11645e0.f.a(rectF) : this.f11645e0.f16529e.a(rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxStrokeColor() {
        return this.f11606C0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getBoxStrokeErrorColor() {
        return this.D0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxStrokeWidth() {
        return this.f11651k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBoxStrokeWidthFocused() {
        return this.f11652l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCounterMaxLength() {
        return this.f11603B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getCounterOverflowDescription() {
        C1292Z c1292z;
        if (this.f11601A && this.f11605C && (c1292z = this.f11608E) != null) {
            return c1292z.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCounterOverflowTextColor() {
        return this.f11630P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCounterTextColor() {
        return this.f11628O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCursorColor() {
        return this.f11632Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCursorErrorColor() {
        return this.f11634R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getDefaultHintTextColor() {
        return this.f11674y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EditText getEditText() {
        return this.f11663t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getEndIconContentDescription() {
        return this.f11661s.f17660w.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getEndIconDrawable() {
        return this.f11661s.f17660w.getDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getEndIconMinSize() {
        return this.f11661s.f17644C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getEndIconMode() {
        return this.f11661s.f17662y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f11661s.f17645D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CheckableImageButton getEndIconView() {
        return this.f11661s.f17660w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getError() {
        q qVar = this.f11675z;
        if (qVar.f17689q) {
            return qVar.f17688p;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getErrorAccessibilityLiveRegion() {
        return this.f11675z.f17692t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getErrorContentDescription() {
        return this.f11675z.f17691s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getErrorCurrentTextColors() {
        C1292Z c1292z = this.f11675z.f17690r;
        if (c1292z != null) {
            return c1292z.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getErrorIconDrawable() {
        return this.f11661s.f17656s.getDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getHelperText() {
        q qVar = this.f11675z;
        if (qVar.f17696x) {
            return qVar.f17695w;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getHelperTextCurrentTextColor() {
        C1292Z c1292z = this.f11675z.f17697y;
        if (c1292z != null) {
            return c1292z.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getHint() {
        if (this.f11636S) {
            return this.f11637T;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getHintCollapsedTextHeight() {
        return this.f11623L0.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getHintCurrentCollapsedTextColor() {
        C1232b c1232b = this.f11623L0;
        return c1232b.e(c1232b.f14539k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getHintTextColor() {
        return this.f11676z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x getLengthCounter() {
        return this.f11607D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxEms() {
        return this.f11669w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxWidth() {
        return this.f11673y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinEms() {
        return this.f11667v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinWidth() {
        return this.f11671x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11661s.f17660w.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11661s.f17660w.getDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getPlaceholderText() {
        if (this.f11616I) {
            return this.f11614H;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPlaceholderTextAppearance() {
        return this.f11622L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getPlaceholderTextColor() {
        return this.f11620K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getPrefixText() {
        return this.f11659r.f17714s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getPrefixTextColor() {
        return this.f11659r.f17713r.getTextColors();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView getPrefixTextView() {
        return this.f11659r.f17713r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k getShapeAppearanceModel() {
        return this.f11645e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getStartIconContentDescription() {
        return this.f11659r.f17715t.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getStartIconDrawable() {
        return this.f11659r.f17715t.getDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getStartIconMinSize() {
        return this.f11659r.f17718w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f11659r.f17719x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getSuffixText() {
        return this.f11661s.f17647F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSuffixTextColor() {
        return this.f11661s.f17648G.getTextColors();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView getSuffixTextView() {
        return this.f11661s.f17648G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface getTypeface() {
        return this.f11660r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(int i, boolean z5) {
        return i - ((z5 || getSuffixText() == null) ? (!z5 || getPrefixText() == null) ? this.f11663t.getCompoundPaddingRight() : this.f11659r.a() : this.f11661s.c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        int i = this.f11648h0;
        if (i == 0) {
            this.f11639V = null;
            this.f11643c0 = null;
            this.f11644d0 = null;
        } else if (i == 1) {
            this.f11639V = new g(this.f11645e0);
            this.f11643c0 = new g();
            this.f11644d0 = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f11648h0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f11636S || (this.f11639V instanceof v4.g)) {
                this.f11639V = new g(this.f11645e0);
            } else {
                k kVar = this.f11645e0;
                int i7 = v4.g.f17625O;
                if (kVar == null) {
                    kVar = new k();
                }
                v4.f fVar = new v4.f(kVar, new RectF());
                v4.g gVar = new v4.g(fVar);
                gVar.f17626N = fVar;
                this.f11639V = gVar;
            }
            this.f11643c0 = null;
            this.f11644d0 = null;
        }
        s();
        x();
        if (this.f11648h0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f11649i0 = getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (I1.s0(getContext())) {
                this.f11649i0 = getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f11663t != null && this.f11648h0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f11663t;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f11663t.getPaddingEnd(), getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (I1.s0(getContext())) {
                EditText editText2 = this.f11663t;
                WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f11663t.getPaddingEnd(), getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f11648h0 != 0) {
            t();
        }
        EditText editText3 = this.f11663t;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i8 = this.f11648h0;
                if (i8 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i8 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L8
            goto Lf0
        L8:
            android.widget.EditText r0 = r12.f11663t
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.f11663t
            int r1 = r1.getGravity()
            l4.b r2 = r12.f11623L0
            java.lang.CharSequence r3 = r2.f14500A
            boolean r3 = r2.b(r3)
            r2.f14502C = r3
            android.graphics.Rect r4 = r2.f14532d
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            r7 = 5
            r8 = 8388613(0x800005, float:1.175495E-38)
            r9 = 17
            if (r1 == r9) goto L51
            r10 = r1 & 7
            if (r10 != r6) goto L30
            goto L51
        L30:
            r10 = r1 & r8
            if (r10 == r8) goto L46
            r10 = r1 & 5
            if (r10 != r7) goto L39
            goto L46
        L39:
            if (r3 == 0) goto L42
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.f14525Z
        L40:
            float r3 = r3 - r10
            goto L57
        L42:
            int r3 = r4.left
        L44:
            float r3 = (float) r3
            goto L57
        L46:
            if (r3 == 0) goto L4b
            int r3 = r4.left
            goto L44
        L4b:
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.f14525Z
            goto L40
        L51:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.f14525Z
            float r10 = r10 / r5
            goto L40
        L57:
            int r10 = r4.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f11658q0
            r10.left = r3
            int r11 = r4.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r9) goto L8d
            r9 = r1 & 7
            if (r9 != r6) goto L6e
            goto L8d
        L6e:
            r0 = r1 & r8
            if (r0 == r8) goto L83
            r0 = r1 & 5
            if (r0 != r7) goto L77
            goto L83
        L77:
            boolean r0 = r2.f14502C
            if (r0 == 0) goto L7f
            int r0 = r4.right
        L7d:
            float r0 = (float) r0
            goto L93
        L7f:
            float r0 = r2.f14525Z
        L81:
            float r0 = r0 + r3
            goto L93
        L83:
            boolean r0 = r2.f14502C
            if (r0 == 0) goto L8a
            float r0 = r2.f14525Z
            goto L81
        L8a:
            int r0 = r4.right
            goto L7d
        L8d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.f14525Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L93:
            int r1 = r4.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r4.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb8
            goto Lf0
        Lb8:
            float r0 = r10.left
            int r1 = r12.f11647g0
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.f11650j0
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            s4.g r0 = r12.f11639V
            v4.g r0 = (v4.g) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.o(r1, r2, r3, r4)
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(C1292Z c1292z, int i) {
        try {
            c1292z.setTextAppearance(i);
            if (c1292z.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1292z.setTextAppearance(com.wnapp.smspariaz.R.style.TextAppearance_AppCompat_Caption);
        c1292z.setTextColor(getContext().getColor(com.wnapp.smspariaz.R.color.design_error));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m() {
        q qVar = this.f11675z;
        return (qVar.f17687o != 1 || qVar.f17690r == null || TextUtils.isEmpty(qVar.f17688p)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(Editable editable) {
        ((Z0) this.f11607D).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z5 = this.f11605C;
        int i = this.f11603B;
        if (i == -1) {
            this.f11608E.setText(String.valueOf(length));
            this.f11608E.setContentDescription(null);
            this.f11605C = false;
        } else {
            this.f11605C = length > i;
            Context context = getContext();
            this.f11608E.setContentDescription(context.getString(this.f11605C ? com.wnapp.smspariaz.R.string.character_counter_overflowed_content_description : com.wnapp.smspariaz.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f11603B)));
            if (z5 != this.f11605C) {
                o();
            }
            String str = C1675b.f17119b;
            C1675b c1675b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C1675b.f17122e : C1675b.f17121d;
            C1292Z c1292z = this.f11608E;
            String string = getContext().getString(com.wnapp.smspariaz.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f11603B));
            c1675b.getClass();
            c cVar = AbstractC1679f.f17129a;
            c1292z.setText(string != null ? c1675b.c(string).toString() : null);
        }
        if (this.f11663t == null || z5 == this.f11605C) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1292Z c1292z = this.f11608E;
        if (c1292z != null) {
            l(c1292z, this.f11605C ? this.f11610F : this.f11612G);
            if (!this.f11605C && (colorStateList2 = this.f11628O) != null) {
                this.f11608E.setTextColor(colorStateList2);
            }
            if (!this.f11605C || (colorStateList = this.f11630P) == null) {
                return;
            }
            this.f11608E.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11623L0.g(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        m mVar = this.f11661s;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z5 = false;
        this.f11635R0 = false;
        if (this.f11663t != null && this.f11663t.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f11659r.getMeasuredHeight()))) {
            this.f11663t.setMinimumHeight(iMax);
            z5 = true;
        }
        boolean zQ = q();
        if (z5 || zQ) {
            this.f11663t.post(new RunnableC0089m(24, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        EditText editText = this.f11663t;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1233c.f14555a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f11655o0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC1233c.f14555a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC1233c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC1233c.f14556b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f11643c0;
            if (gVar != null) {
                int i10 = rect.bottom;
                gVar.setBounds(rect.left, i10 - this.f11651k0, rect.right, i10);
            }
            g gVar2 = this.f11644d0;
            if (gVar2 != null) {
                int i11 = rect.bottom;
                gVar2.setBounds(rect.left, i11 - this.f11652l0, rect.right, i11);
            }
            if (this.f11636S) {
                float textSize = this.f11663t.getTextSize();
                C1232b c1232b = this.f11623L0;
                if (c1232b.f14538h != textSize) {
                    c1232b.f14538h = textSize;
                    c1232b.h(false);
                }
                int gravity = this.f11663t.getGravity();
                int i12 = (gravity & (-113)) | 48;
                if (c1232b.f14537g != i12) {
                    c1232b.f14537g = i12;
                    c1232b.h(false);
                }
                if (c1232b.f != gravity) {
                    c1232b.f = gravity;
                    c1232b.h(false);
                }
                if (this.f11663t == null) {
                    throw new IllegalStateException();
                }
                boolean zF = l4.m.f(this);
                int i13 = rect.bottom;
                Rect rect2 = this.f11656p0;
                rect2.bottom = i13;
                int i14 = this.f11648h0;
                if (i14 == 1) {
                    rect2.left = g(rect.left, zF);
                    rect2.top = rect.top + this.f11649i0;
                    rect2.right = h(rect.right, zF);
                } else if (i14 != 2) {
                    rect2.left = g(rect.left, zF);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zF);
                } else {
                    rect2.left = this.f11663t.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f11663t.getPaddingRight();
                }
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                int i18 = rect2.bottom;
                Rect rect3 = c1232b.f14532d;
                if (rect3.left != i15 || rect3.top != i16 || rect3.right != i17 || rect3.bottom != i18) {
                    rect3.set(i15, i16, i17, i18);
                    c1232b.f14512M = true;
                }
                if (this.f11663t == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c1232b.f14514O;
                textPaint.setTextSize(c1232b.f14538h);
                textPaint.setTypeface(c1232b.f14549u);
                textPaint.setLetterSpacing(c1232b.f14522W);
                float f = -textPaint.ascent();
                rect2.left = this.f11663t.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f11648h0 != 1 || this.f11663t.getMinLines() > 1) ? rect.top + this.f11663t.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f11663t.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f11648h0 != 1 || this.f11663t.getMinLines() > 1) ? rect.bottom - this.f11663t.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                Rect rect4 = c1232b.f14530c;
                if (rect4.left != i19 || rect4.top != i20 || rect4.right != i21 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i19, i20, i21, compoundPaddingBottom);
                    c1232b.f14512M = true;
                }
                c1232b.h(false);
                if (!e() || this.f11621K0) {
                    return;
                }
                j();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        EditText editText;
        super.onMeasure(i, i7);
        boolean z5 = this.f11635R0;
        m mVar = this.f11661s;
        if (!z5) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f11635R0 = true;
        }
        if (this.f11618J != null && (editText = this.f11663t) != null) {
            this.f11618J.setGravity(editText.getGravity());
            this.f11618J.setPadding(this.f11663t.getCompoundPaddingLeft(), this.f11663t.getCompoundPaddingTop(), this.f11663t.getCompoundPaddingRight(), this.f11663t.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.f1163q);
        setError(yVar.f17726s);
        if (yVar.f17727t) {
            post(new A1.b(26, this));
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z5 = i == 1;
        if (z5 != this.f11646f0) {
            s4.c cVar = this.f11645e0.f16529e;
            RectF rectF = this.f11658q0;
            float fA = cVar.a(rectF);
            float fA2 = this.f11645e0.f.a(rectF);
            float fA3 = this.f11645e0.f16531h.a(rectF);
            float fA4 = this.f11645e0.f16530g.a(rectF);
            k kVar = this.f11645e0;
            AbstractC1918b abstractC1918b = kVar.f16525a;
            AbstractC1918b abstractC1918b2 = kVar.f16526b;
            AbstractC1918b abstractC1918b3 = kVar.f16528d;
            AbstractC1918b abstractC1918b4 = kVar.f16527c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(abstractC1918b2);
            j.b(abstractC1918b);
            j.b(abstractC1918b4);
            j.b(abstractC1918b3);
            s4.a aVar = new s4.a(fA2);
            s4.a aVar2 = new s4.a(fA);
            s4.a aVar3 = new s4.a(fA4);
            s4.a aVar4 = new s4.a(fA3);
            k kVar2 = new k();
            kVar2.f16525a = abstractC1918b2;
            kVar2.f16526b = abstractC1918b;
            kVar2.f16527c = abstractC1918b3;
            kVar2.f16528d = abstractC1918b4;
            kVar2.f16529e = aVar;
            kVar2.f = aVar2;
            kVar2.f16530g = aVar4;
            kVar2.f16531h = aVar3;
            kVar2.i = eVar;
            kVar2.j = eVar2;
            kVar2.f16532k = eVar3;
            kVar2.f16533l = eVar4;
            this.f11646f0 = z5;
            setShapeAppearanceModel(kVar2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (m()) {
            yVar.f17726s = getError();
        }
        m mVar = this.f11661s;
        yVar.f17727t = mVar.f17662y != 0 && mVar.f17660w.f11559t;
        return yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f11632Q
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903291(0x7f0300fb, float:1.7413396E38)
            android.util.TypedValue r1 = a.AbstractC0597a.M(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = k1.AbstractC1175c.b(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f11663t
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = t1.AbstractC1614a.g(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f11663t
            android.graphics.drawable.Drawable r1 = t1.AbstractC1614a.g(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L49
            m.Z r2 = r4.f11608E
            if (r2 == 0) goto L4e
            boolean r2 = r4.f11605C
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f11634R
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f11663t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L20
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L5f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5f
        L20:
            v4.u r0 = r10.f11659r
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L5f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f11663t
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f11662s0
            if (r6 == 0) goto L3b
            int r6 = r10.f11664t0
            if (r6 == r0) goto L47
        L3b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f11662s0 = r6
            r10.f11664t0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L47:
            android.widget.EditText r0 = r10.f11663t
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f11662s0
            if (r6 == r7) goto L78
            android.widget.EditText r6 = r10.f11663t
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L76
        L5f:
            android.graphics.drawable.ColorDrawable r0 = r10.f11662s0
            if (r0 == 0) goto L78
            android.widget.EditText r0 = r10.f11663t
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f11663t
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.f11662s0 = r2
        L76:
            r0 = r5
            goto L79
        L78:
            r0 = r1
        L79:
            v4.m r6 = r10.f11661s
            boolean r7 = r6.e()
            if (r7 != 0) goto L8f
            int r7 = r6.f17662y
            if (r7 == 0) goto L8b
            boolean r7 = r6.d()
            if (r7 != 0) goto L8f
        L8b:
            java.lang.CharSequence r7 = r6.f17647F
            if (r7 == 0) goto L10d
        L8f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L10d
            m.Z r7 = r6.f17648G
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.f11663t
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto Lab
            com.google.android.material.internal.CheckableImageButton r2 = r6.f17656s
            goto Lb7
        Lab:
            int r8 = r6.f17662y
            if (r8 == 0) goto Lb7
            boolean r8 = r6.d()
            if (r8 == 0) goto Lb7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f17660w
        Lb7:
            if (r2 == 0) goto Lca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        Lca:
            android.widget.EditText r2 = r10.f11663t
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f11668v0
            if (r6 == 0) goto Leb
            int r8 = r10.f11670w0
            if (r8 == r7) goto Leb
            r10.f11670w0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.f11663t
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f11668v0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        Leb:
            if (r6 != 0) goto Lf9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f11668v0 = r6
            r10.f11670w0 = r7
            r6.setBounds(r1, r1, r7, r5)
        Lf9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f11668v0
            if (r3 == r6) goto L12f
            r10.f11672x0 = r3
            android.widget.EditText r0 = r10.f11663t
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        L10d:
            android.graphics.drawable.ColorDrawable r6 = r10.f11668v0
            if (r6 == 0) goto L12f
            android.widget.EditText r6 = r10.f11663t
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f11668v0
            if (r3 != r7) goto L12b
            android.widget.EditText r0 = r10.f11663t
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f11672x0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L12c
        L12b:
            r5 = r0
        L12c:
            r10.f11668v0 = r2
            return r5
        L12f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        Drawable background;
        C1292Z c1292z;
        EditText editText = this.f11663t;
        if (editText == null || this.f11648h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1313j0.f14820a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C1328r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f11605C && (c1292z = this.f11608E) != null) {
            drawableMutate.setColorFilter(C1328r.c(c1292z.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f11663t.refreshDrawableState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        EditText editText = this.f11663t;
        if (editText == null || this.f11639V == null) {
            return;
        }
        if ((this.f11642b0 || editText.getBackground() == null) && this.f11648h0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f11663t;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            editText2.setBackground(editTextBoxBackground);
            this.f11642b0 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxBackgroundColor(int i) {
        if (this.f11654n0 != i) {
            this.f11654n0 = i;
            this.f11609E0 = i;
            this.f11613G0 = i;
            this.f11615H0 = i;
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f11609E0 = defaultColor;
        this.f11654n0 = defaultColor;
        this.f11611F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f11613G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f11615H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxBackgroundMode(int i) {
        if (i == this.f11648h0) {
            return;
        }
        this.f11648h0 = i;
        if (this.f11663t != null) {
            i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxCollapsedPaddingTop(int i) {
        this.f11649i0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxCornerFamily(int i) {
        j jVarE = this.f11645e0.e();
        s4.c cVar = this.f11645e0.f16529e;
        AbstractC1918b abstractC1918bR = C3.a.r(i);
        jVarE.f16516a = abstractC1918bR;
        j.b(abstractC1918bR);
        jVarE.f16520e = cVar;
        s4.c cVar2 = this.f11645e0.f;
        AbstractC1918b abstractC1918bR2 = C3.a.r(i);
        jVarE.f16517b = abstractC1918bR2;
        j.b(abstractC1918bR2);
        jVarE.f = cVar2;
        s4.c cVar3 = this.f11645e0.f16531h;
        AbstractC1918b abstractC1918bR3 = C3.a.r(i);
        jVarE.f16519d = abstractC1918bR3;
        j.b(abstractC1918bR3);
        jVarE.f16522h = cVar3;
        s4.c cVar4 = this.f11645e0.f16530g;
        AbstractC1918b abstractC1918bR4 = C3.a.r(i);
        jVarE.f16518c = abstractC1918bR4;
        j.b(abstractC1918bR4);
        jVarE.f16521g = cVar4;
        this.f11645e0 = jVarE.a();
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeColor(int i) {
        if (this.f11606C0 != i) {
            this.f11606C0 = i;
            x();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f11602A0 = colorStateList.getDefaultColor();
            this.f11617I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f11604B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f11606C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f11606C0 != colorStateList.getDefaultColor()) {
            this.f11606C0 = colorStateList.getDefaultColor();
        }
        x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            x();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeWidth(int i) {
        this.f11651k0 = i;
        x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeWidthFocused(int i) {
        this.f11652l0 = i;
        x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterEnabled(boolean z5) {
        if (this.f11601A != z5) {
            q qVar = this.f11675z;
            if (z5) {
                C1292Z c1292z = new C1292Z(getContext(), null);
                this.f11608E = c1292z;
                c1292z.setId(com.wnapp.smspariaz.R.id.textinput_counter);
                Typeface typeface = this.f11660r0;
                if (typeface != null) {
                    this.f11608E.setTypeface(typeface);
                }
                this.f11608E.setMaxLines(1);
                qVar.a(this.f11608E, 2);
                ((ViewGroup.MarginLayoutParams) this.f11608E.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f11608E != null) {
                    EditText editText = this.f11663t;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.f11608E, 2);
                this.f11608E = null;
            }
            this.f11601A = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterMaxLength(int i) {
        if (this.f11603B != i) {
            if (i > 0) {
                this.f11603B = i;
            } else {
                this.f11603B = -1;
            }
            if (!this.f11601A || this.f11608E == null) {
                return;
            }
            EditText editText = this.f11663t;
            n(editText == null ? null : editText.getText());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterOverflowTextAppearance(int i) {
        if (this.f11610F != i) {
            this.f11610F = i;
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f11630P != colorStateList) {
            this.f11630P = colorStateList;
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterTextAppearance(int i) {
        if (this.f11612G != i) {
            this.f11612G = i;
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f11628O != colorStateList) {
            this.f11628O = colorStateList;
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f11632Q != colorStateList) {
            this.f11632Q = colorStateList;
            p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f11634R != colorStateList) {
            this.f11634R = colorStateList;
            if (m() || (this.f11608E != null && this.f11605C)) {
                p();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f11674y0 = colorStateList;
        this.f11676z0 = colorStateList;
        if (this.f11663t != null) {
            u(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setEnabled(boolean z5) {
        k(this, z5);
        super.setEnabled(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconActivated(boolean z5) {
        this.f11661s.f17660w.setActivated(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconCheckable(boolean z5) {
        this.f11661s.f17660w.setCheckable(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconContentDescription(int i) {
        m mVar = this.f11661s;
        CharSequence text = i != 0 ? mVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconDrawable(int i) {
        m mVar = this.f11661s;
        Drawable drawableC = i != 0 ? AbstractC0597a.C(mVar.getContext(), i) : null;
        TextInputLayout textInputLayout = mVar.f17654q;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        checkableImageButton.setImageDrawable(drawableC);
        if (drawableC != null) {
            K1.e(textInputLayout, checkableImageButton, mVar.f17642A, mVar.f17643B);
            K1.J(textInputLayout, checkableImageButton, mVar.f17642A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconMinSize(int i) {
        m mVar = this.f11661s;
        if (i < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != mVar.f17644C) {
            mVar.f17644C = i;
            CheckableImageButton checkableImageButton = mVar.f17660w;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = mVar.f17656s;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconMode(int i) {
        this.f11661s.g(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f11661s;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        View.OnLongClickListener onLongClickListener = mVar.f17646E;
        checkableImageButton.setOnClickListener(onClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f11661s;
        mVar.f17646E = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f11661s;
        mVar.f17645D = scaleType;
        mVar.f17660w.setScaleType(scaleType);
        mVar.f17656s.setScaleType(scaleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f11661s;
        if (mVar.f17642A != colorStateList) {
            mVar.f17642A = colorStateList;
            K1.e(mVar.f17654q, mVar.f17660w, colorStateList, mVar.f17643B);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11661s;
        if (mVar.f17643B != mode) {
            mVar.f17643B = mode;
            K1.e(mVar.f17654q, mVar.f17660w, mVar.f17642A, mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconVisible(boolean z5) {
        this.f11661s.h(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setError(CharSequence charSequence) {
        q qVar = this.f11675z;
        if (!qVar.f17689q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f17688p = charSequence;
        qVar.f17690r.setText(charSequence);
        int i = qVar.f17686n;
        if (i != 1) {
            qVar.f17687o = 1;
        }
        qVar.i(i, qVar.f17687o, qVar.h(qVar.f17690r, charSequence));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorAccessibilityLiveRegion(int i) {
        q qVar = this.f11675z;
        qVar.f17692t = i;
        C1292Z c1292z = qVar.f17690r;
        if (c1292z != null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            c1292z.setAccessibilityLiveRegion(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f11675z;
        qVar.f17691s = charSequence;
        C1292Z c1292z = qVar.f17690r;
        if (c1292z != null) {
            c1292z.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorEnabled(boolean z5) {
        q qVar = this.f11675z;
        TextInputLayout textInputLayout = qVar.f17682h;
        if (qVar.f17689q == z5) {
            return;
        }
        qVar.c();
        if (z5) {
            C1292Z c1292z = new C1292Z(qVar.f17681g, null);
            qVar.f17690r = c1292z;
            c1292z.setId(com.wnapp.smspariaz.R.id.textinput_error);
            qVar.f17690r.setTextAlignment(5);
            Typeface typeface = qVar.f17675B;
            if (typeface != null) {
                qVar.f17690r.setTypeface(typeface);
            }
            int i = qVar.f17693u;
            qVar.f17693u = i;
            C1292Z c1292z2 = qVar.f17690r;
            if (c1292z2 != null) {
                qVar.f17682h.l(c1292z2, i);
            }
            ColorStateList colorStateList = qVar.f17694v;
            qVar.f17694v = colorStateList;
            C1292Z c1292z3 = qVar.f17690r;
            if (c1292z3 != null && colorStateList != null) {
                c1292z3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f17691s;
            qVar.f17691s = charSequence;
            C1292Z c1292z4 = qVar.f17690r;
            if (c1292z4 != null) {
                c1292z4.setContentDescription(charSequence);
            }
            int i7 = qVar.f17692t;
            qVar.f17692t = i7;
            C1292Z c1292z5 = qVar.f17690r;
            if (c1292z5 != null) {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                c1292z5.setAccessibilityLiveRegion(i7);
            }
            qVar.f17690r.setVisibility(4);
            qVar.a(qVar.f17690r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f17690r, 0);
            qVar.f17690r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f17689q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconDrawable(int i) {
        m mVar = this.f11661s;
        mVar.i(i != 0 ? AbstractC0597a.C(mVar.getContext(), i) : null);
        K1.J(mVar.f17654q, mVar.f17656s, mVar.f17657t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f11661s;
        CheckableImageButton checkableImageButton = mVar.f17656s;
        View.OnLongClickListener onLongClickListener = mVar.f17659v;
        checkableImageButton.setOnClickListener(onClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f11661s;
        mVar.f17659v = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f17656s;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f11661s;
        if (mVar.f17657t != colorStateList) {
            mVar.f17657t = colorStateList;
            K1.e(mVar.f17654q, mVar.f17656s, colorStateList, mVar.f17658u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11661s;
        if (mVar.f17658u != mode) {
            mVar.f17658u = mode;
            K1.e(mVar.f17654q, mVar.f17656s, mVar.f17657t, mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorTextAppearance(int i) {
        q qVar = this.f11675z;
        qVar.f17693u = i;
        C1292Z c1292z = qVar.f17690r;
        if (c1292z != null) {
            qVar.f17682h.l(c1292z, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f11675z;
        qVar.f17694v = colorStateList;
        C1292Z c1292z = qVar.f17690r;
        if (c1292z == null || colorStateList == null) {
            return;
        }
        c1292z.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpandedHintEnabled(boolean z5) {
        if (this.f11625M0 != z5) {
            this.f11625M0 = z5;
            u(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f11675z;
        if (zIsEmpty) {
            if (qVar.f17696x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f17696x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f17695w = charSequence;
        qVar.f17697y.setText(charSequence);
        int i = qVar.f17686n;
        if (i != 2) {
            qVar.f17687o = 2;
        }
        qVar.i(i, qVar.f17687o, qVar.h(qVar.f17697y, charSequence));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f11675z;
        qVar.f17674A = colorStateList;
        C1292Z c1292z = qVar.f17697y;
        if (c1292z == null || colorStateList == null) {
            return;
        }
        c1292z.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHelperTextEnabled(boolean z5) {
        q qVar = this.f11675z;
        TextInputLayout textInputLayout = qVar.f17682h;
        if (qVar.f17696x == z5) {
            return;
        }
        qVar.c();
        if (z5) {
            C1292Z c1292z = new C1292Z(qVar.f17681g, null);
            qVar.f17697y = c1292z;
            c1292z.setId(com.wnapp.smspariaz.R.id.textinput_helper_text);
            qVar.f17697y.setTextAlignment(5);
            Typeface typeface = qVar.f17675B;
            if (typeface != null) {
                qVar.f17697y.setTypeface(typeface);
            }
            qVar.f17697y.setVisibility(4);
            qVar.f17697y.setAccessibilityLiveRegion(1);
            int i = qVar.f17698z;
            qVar.f17698z = i;
            C1292Z c1292z2 = qVar.f17697y;
            if (c1292z2 != null) {
                c1292z2.setTextAppearance(i);
            }
            ColorStateList colorStateList = qVar.f17674A;
            qVar.f17674A = colorStateList;
            C1292Z c1292z3 = qVar.f17697y;
            if (c1292z3 != null && colorStateList != null) {
                c1292z3.setTextColor(colorStateList);
            }
            qVar.a(qVar.f17697y, 1);
            qVar.f17697y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i7 = qVar.f17686n;
            if (i7 == 2) {
                qVar.f17687o = 0;
            }
            qVar.i(i7, qVar.f17687o, qVar.h(qVar.f17697y, ""));
            qVar.g(qVar.f17697y, 1);
            qVar.f17697y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f17696x = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHelperTextTextAppearance(int i) {
        q qVar = this.f11675z;
        qVar.f17698z = i;
        C1292Z c1292z = qVar.f17697y;
        if (c1292z != null) {
            c1292z.setTextAppearance(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        if (this.f11636S) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHintAnimationEnabled(boolean z5) {
        this.f11627N0 = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHintEnabled(boolean z5) {
        if (z5 != this.f11636S) {
            this.f11636S = z5;
            if (z5) {
                CharSequence hint = this.f11663t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f11637T)) {
                        setHint(hint);
                    }
                    this.f11663t.setHint((CharSequence) null);
                }
                this.f11638U = true;
            } else {
                this.f11638U = false;
                if (!TextUtils.isEmpty(this.f11637T) && TextUtils.isEmpty(this.f11663t.getHint())) {
                    this.f11663t.setHint(this.f11637T);
                }
                setHintInternal(null);
            }
            if (this.f11663t != null) {
                t();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHintTextAppearance(int i) {
        C1232b c1232b = this.f11623L0;
        TextInputLayout textInputLayout = c1232b.f14526a;
        C1483d c1483d = new C1483d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c1483d.j;
        if (colorStateList != null) {
            c1232b.f14539k = colorStateList;
        }
        float f = c1483d.f15894k;
        if (f != 0.0f) {
            c1232b.i = f;
        }
        ColorStateList colorStateList2 = c1483d.f15887a;
        if (colorStateList2 != null) {
            c1232b.f14520U = colorStateList2;
        }
        c1232b.f14518S = c1483d.f15891e;
        c1232b.f14519T = c1483d.f;
        c1232b.f14517R = c1483d.f15892g;
        c1232b.f14521V = c1483d.i;
        C1480a c1480a = c1232b.f14553y;
        if (c1480a != null) {
            c1480a.f15882e = true;
        }
        C1136a c1136a = new C1136a(2, c1232b);
        c1483d.a();
        c1232b.f14553y = new C1480a(c1136a, c1483d.f15897n);
        c1483d.c(textInputLayout.getContext(), c1232b.f14553y);
        c1232b.h(false);
        this.f11676z0 = c1232b.f14539k;
        if (this.f11663t != null) {
            u(false, false);
            t();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f11676z0 != colorStateList) {
            if (this.f11674y0 == null) {
                C1232b c1232b = this.f11623L0;
                if (c1232b.f14539k != colorStateList) {
                    c1232b.f14539k = colorStateList;
                    c1232b.h(false);
                }
            }
            this.f11676z0 = colorStateList;
            if (this.f11663t != null) {
                u(false, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLengthCounter(x xVar) {
        this.f11607D = xVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxEms(int i) {
        this.f11669w = i;
        EditText editText = this.f11663t;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxWidth(int i) {
        this.f11673y = i;
        EditText editText = this.f11663t;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinEms(int i) {
        this.f11667v = i;
        EditText editText = this.f11663t;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinWidth(int i) {
        this.f11671x = i;
        EditText editText = this.f11663t;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        m mVar = this.f11661s;
        mVar.f17660w.setContentDescription(i != 0 ? mVar.getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        m mVar = this.f11661s;
        mVar.f17660w.setImageDrawable(i != 0 ? AbstractC0597a.C(mVar.getContext(), i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        m mVar = this.f11661s;
        if (z5 && mVar.f17662y != 1) {
            mVar.g(1);
        } else if (z5) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f11661s;
        mVar.f17642A = colorStateList;
        K1.e(mVar.f17654q, mVar.f17660w, colorStateList, mVar.f17643B);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11661s;
        mVar.f17643B = mode;
        K1.e(mVar.f17654q, mVar.f17660w, mVar.f17642A, mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f11618J == null) {
            C1292Z c1292z = new C1292Z(getContext(), null);
            this.f11618J = c1292z;
            c1292z.setId(com.wnapp.smspariaz.R.id.textinput_placeholder);
            this.f11618J.setImportantForAccessibility(2);
            C1503h c1503hD = d();
            this.f11624M = c1503hD;
            c1503hD.f15983r = 67L;
            this.f11626N = d();
            setPlaceholderTextAppearance(this.f11622L);
            setPlaceholderTextColor(this.f11620K);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f11616I) {
                setPlaceholderTextEnabled(true);
            }
            this.f11614H = charSequence;
        }
        EditText editText = this.f11663t;
        v(editText != null ? editText.getText() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPlaceholderTextAppearance(int i) {
        this.f11622L = i;
        C1292Z c1292z = this.f11618J;
        if (c1292z != null) {
            c1292z.setTextAppearance(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f11620K != colorStateList) {
            this.f11620K = colorStateList;
            C1292Z c1292z = this.f11618J;
            if (c1292z == null || colorStateList == null) {
                return;
            }
            c1292z.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.f11659r;
        uVar.getClass();
        uVar.f17714s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.f17713r.setText(charSequence);
        uVar.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrefixTextAppearance(int i) {
        this.f11659r.f17713r.setTextAppearance(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f11659r.f17713r.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f11639V;
        if (gVar == null || gVar.f16505q.f16479a == kVar) {
            return;
        }
        this.f11645e0 = kVar;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconCheckable(boolean z5) {
        this.f11659r.f17715t.setCheckable(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0597a.C(getContext(), i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconMinSize(int i) {
        u uVar = this.f11659r;
        if (i < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != uVar.f17718w) {
            uVar.f17718w = i;
            CheckableImageButton checkableImageButton = uVar.f17715t;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f11659r;
        CheckableImageButton checkableImageButton = uVar.f17715t;
        View.OnLongClickListener onLongClickListener = uVar.f17720y;
        checkableImageButton.setOnClickListener(onClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f11659r;
        uVar.f17720y = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f17715t;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        K1.L(checkableImageButton, onLongClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f11659r;
        uVar.f17719x = scaleType;
        uVar.f17715t.setScaleType(scaleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f11659r;
        if (uVar.f17716u != colorStateList) {
            uVar.f17716u = colorStateList;
            K1.e(uVar.f17712q, uVar.f17715t, colorStateList, uVar.f17717v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f11659r;
        if (uVar.f17717v != mode) {
            uVar.f17717v = mode;
            K1.e(uVar.f17712q, uVar.f17715t, uVar.f17716u, mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconVisible(boolean z5) {
        this.f11659r.c(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f11661s;
        mVar.getClass();
        mVar.f17647F = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f17648G.setText(charSequence);
        mVar.n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSuffixTextAppearance(int i) {
        this.f11661s.f17648G.setTextAppearance(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f11661s.f17648G.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f11663t;
        if (editText != null) {
            AbstractC1835K.m(editText, wVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTypeface(Typeface typeface) {
        if (typeface != this.f11660r0) {
            this.f11660r0 = typeface;
            this.f11623L0.m(typeface);
            q qVar = this.f11675z;
            if (typeface != qVar.f17675B) {
                qVar.f17675B = typeface;
                C1292Z c1292z = qVar.f17690r;
                if (c1292z != null) {
                    c1292z.setTypeface(typeface);
                }
                C1292Z c1292z2 = qVar.f17697y;
                if (c1292z2 != null) {
                    c1292z2.setTypeface(typeface);
                }
            }
            C1292Z c1292z3 = this.f11608E;
            if (c1292z3 != null) {
                c1292z3.setTypeface(typeface);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        if (this.f11648h0 != 1) {
            FrameLayout frameLayout = this.f11657q;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        C1292Z c1292z;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f11663t;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f11663t;
        boolean z8 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f11674y0;
        C1232b c1232b = this.f11623L0;
        if (colorStateList2 != null) {
            c1232b.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f11674y0;
            c1232b.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f11617I0) : this.f11617I0));
        } else if (m()) {
            C1292Z c1292z2 = this.f11675z.f17690r;
            c1232b.i(c1292z2 != null ? c1292z2.getTextColors() : null);
        } else if (this.f11605C && (c1292z = this.f11608E) != null) {
            c1232b.i(c1292z.getTextColors());
        } else if (z8 && (colorStateList = this.f11676z0) != null && c1232b.f14539k != colorStateList) {
            c1232b.f14539k = colorStateList;
            c1232b.h(false);
        }
        m mVar = this.f11661s;
        u uVar = this.f11659r;
        if (z7 || !this.f11625M0 || (isEnabled() && z8)) {
            if (z6 || this.f11621K0) {
                ValueAnimator valueAnimator = this.f11629O0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f11629O0.cancel();
                }
                if (z5 && this.f11627N0) {
                    a(1.0f);
                } else {
                    c1232b.k(1.0f);
                }
                this.f11621K0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f11663t;
                v(editText3 != null ? editText3.getText() : null);
                uVar.f17721z = false;
                uVar.e();
                mVar.f17649H = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z6 || !this.f11621K0) {
            ValueAnimator valueAnimator2 = this.f11629O0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f11629O0.cancel();
            }
            if (z5 && this.f11627N0) {
                a(0.0f);
            } else {
                c1232b.k(0.0f);
            }
            if (e() && !((v4.g) this.f11639V).f17626N.f17624q.isEmpty() && e()) {
                ((v4.g) this.f11639V).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f11621K0 = true;
            C1292Z c1292z3 = this.f11618J;
            if (c1292z3 != null && this.f11616I) {
                c1292z3.setText((CharSequence) null);
                AbstractC1513r.a(this.f11657q, this.f11626N);
                this.f11618J.setVisibility(4);
            }
            uVar.f17721z = true;
            uVar.e();
            mVar.f17649H = true;
            mVar.n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(Editable editable) {
        ((Z0) this.f11607D).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f11657q;
        if (length != 0 || this.f11621K0) {
            C1292Z c1292z = this.f11618J;
            if (c1292z == null || !this.f11616I) {
                return;
            }
            c1292z.setText((CharSequence) null);
            AbstractC1513r.a(frameLayout, this.f11626N);
            this.f11618J.setVisibility(4);
            return;
        }
        if (this.f11618J == null || !this.f11616I || TextUtils.isEmpty(this.f11614H)) {
            return;
        }
        this.f11618J.setText(this.f11614H);
        AbstractC1513r.a(frameLayout, this.f11624M);
        this.f11618J.setVisibility(0);
        this.f11618J.bringToFront();
        announceForAccessibility(this.f11614H);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(boolean z5, boolean z6) {
        int defaultColor = this.D0.getDefaultColor();
        int colorForState = this.D0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.D0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.f11653m0 = colorForState2;
        } else if (z6) {
            this.f11653m0 = colorForState;
        } else {
            this.f11653m0 = defaultColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() {
        C1292Z c1292z;
        EditText editText;
        EditText editText2;
        if (this.f11639V == null || this.f11648h0 == 0) {
            return;
        }
        boolean z5 = false;
        boolean z6 = isFocused() || ((editText2 = this.f11663t) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f11663t) != null && editText.isHovered())) {
            z5 = true;
        }
        if (!isEnabled()) {
            this.f11653m0 = this.f11617I0;
        } else if (m()) {
            if (this.D0 != null) {
                w(z6, z5);
            } else {
                this.f11653m0 = getErrorCurrentTextColors();
            }
        } else if (!this.f11605C || (c1292z = this.f11608E) == null) {
            if (z6) {
                this.f11653m0 = this.f11606C0;
            } else if (z5) {
                this.f11653m0 = this.f11604B0;
            } else {
                this.f11653m0 = this.f11602A0;
            }
        } else if (this.D0 != null) {
            w(z6, z5);
        } else {
            this.f11653m0 = c1292z.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        m mVar = this.f11661s;
        TextInputLayout textInputLayout = mVar.f17654q;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        TextInputLayout textInputLayout2 = mVar.f17654q;
        mVar.l();
        K1.J(textInputLayout2, mVar.f17656s, mVar.f17657t);
        K1.J(textInputLayout2, checkableImageButton, mVar.f17642A);
        if (mVar.b() instanceof v4.j) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                K1.e(textInputLayout, checkableImageButton, mVar.f17642A, mVar.f17643B);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        u uVar = this.f11659r;
        K1.J(uVar.f17712q, uVar.f17715t, uVar.f17716u);
        if (this.f11648h0 == 2) {
            int i = this.f11650j0;
            if (z6 && isEnabled()) {
                this.f11650j0 = this.f11652l0;
            } else {
                this.f11650j0 = this.f11651k0;
            }
            if (this.f11650j0 != i && e() && !this.f11621K0) {
                if (e()) {
                    ((v4.g) this.f11639V).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f11648h0 == 1) {
            if (!isEnabled()) {
                this.f11654n0 = this.f11611F0;
            } else if (z5 && !z6) {
                this.f11654n0 = this.f11615H0;
            } else if (z6) {
                this.f11654n0 = this.f11613G0;
            } else {
                this.f11654n0 = this.f11609E0;
            }
        }
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11659r.f17715t;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconDrawable(Drawable drawable) {
        this.f11659r.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f11661s.f17660w.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f11661s.f17660w.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f11661s.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11661s.f17660w;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f11661s;
        TextInputLayout textInputLayout = mVar.f17654q;
        CheckableImageButton checkableImageButton = mVar.f17660w;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            K1.e(textInputLayout, checkableImageButton, mVar.f17642A, mVar.f17643B);
            K1.J(textInputLayout, checkableImageButton, mVar.f17642A);
        }
    }
}
