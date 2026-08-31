package com.google.android.material.chip;

import W3.b;
import a.AbstractC0597a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import c4.c;
import com.google.android.gms.internal.measurement.I1;
import g4.C1085b;
import g4.C1086c;
import g4.C1087d;
import g4.C1089f;
import g4.InterfaceC1088e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k1.AbstractC1175c;
import l4.C1240j;
import l4.InterfaceC1235e;
import l4.m;
import m.C1324p;
import o1.InterfaceC1413a;
import p4.C1483d;
import q4.AbstractC1521a;
import s4.k;
import s4.u;
import u1.AbstractC1679f;
import u1.C1675b;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C1324p implements InterfaceC1088e, u, Checkable {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Rect f11445M = new Rect();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int[] f11446N = {R.attr.state_selected};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f11447O = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11448A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f11449B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f11450C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f11451D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11452E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f11453F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f11454G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1087d f11455H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f11456I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f11457J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RectF f11458K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C1085b f11459L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1089f f11460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InsetDrawable f11461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RippleDrawable f11462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View.OnClickListener f11463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f11464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11465z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.wnapp.smspariaz.R.attr.chipStyle);
        this.f11457J = new Rect();
        this.f11458K = new RectF();
        this.f11459L = new C1085b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1089f c1089f = new C1089f(context2, attributeSet);
        Context context3 = c1089f.f13127u0;
        int[] iArr = V3.a.f7979e;
        TypedArray typedArrayG = m.g(context3, attributeSet, iArr, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c1089f.f13101U0 = typedArrayG.hasValue(37);
        Context context4 = c1089f.f13127u0;
        ColorStateList colorStateListZ = I1.Z(context4, typedArrayG, 24);
        if (c1089f.f13087N != colorStateListZ) {
            c1089f.f13087N = colorStateListZ;
            c1089f.onStateChange(c1089f.getState());
        }
        ColorStateList colorStateListZ2 = I1.Z(context4, typedArrayG, 11);
        if (c1089f.f13089O != colorStateListZ2) {
            c1089f.f13089O = colorStateListZ2;
            c1089f.onStateChange(c1089f.getState());
        }
        float dimension = typedArrayG.getDimension(19, 0.0f);
        if (c1089f.f13091P != dimension) {
            c1089f.f13091P = dimension;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        if (typedArrayG.hasValue(12)) {
            c1089f.B(typedArrayG.getDimension(12, 0.0f));
        }
        c1089f.G(I1.Z(context4, typedArrayG, 22));
        c1089f.H(typedArrayG.getDimension(23, 0.0f));
        c1089f.Q(I1.Z(context4, typedArrayG, 36));
        String text = typedArrayG.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c1089f.f13100U, text);
        C1240j c1240j = c1089f.f13075A0;
        if (!zEquals) {
            c1089f.f13100U = text;
            c1240j.f14575e = true;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        C1483d c1483d = (!typedArrayG.hasValue(0) || (resourceId3 = typedArrayG.getResourceId(0, 0)) == 0) ? null : new C1483d(context4, resourceId3);
        c1483d.f15894k = typedArrayG.getDimension(1, c1483d.f15894k);
        c1240j.b(c1483d, context4);
        int i = typedArrayG.getInt(3, 0);
        if (i == 1) {
            c1089f.f13096R0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c1089f.f13096R0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c1089f.f13096R0 = TextUtils.TruncateAt.END;
        }
        c1089f.F(typedArrayG.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1089f.F(typedArrayG.getBoolean(15, false));
        }
        c1089f.C(I1.b0(context4, typedArrayG, 14));
        if (typedArrayG.hasValue(17)) {
            c1089f.E(I1.Z(context4, typedArrayG, 17));
        }
        c1089f.D(typedArrayG.getDimension(16, -1.0f));
        c1089f.N(typedArrayG.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1089f.N(typedArrayG.getBoolean(26, false));
        }
        c1089f.I(I1.b0(context4, typedArrayG, 25));
        c1089f.M(I1.Z(context4, typedArrayG, 30));
        c1089f.K(typedArrayG.getDimension(28, 0.0f));
        c1089f.x(typedArrayG.getBoolean(6, false));
        c1089f.A(typedArrayG.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1089f.A(typedArrayG.getBoolean(8, false));
        }
        c1089f.y(I1.b0(context4, typedArrayG, 7));
        if (typedArrayG.hasValue(9)) {
            c1089f.z(I1.Z(context4, typedArrayG, 9));
        }
        c1089f.f13117k0 = (!typedArrayG.hasValue(39) || (resourceId2 = typedArrayG.getResourceId(39, 0)) == 0) ? null : b.a(context4, resourceId2);
        c1089f.f13118l0 = (!typedArrayG.hasValue(33) || (resourceId = typedArrayG.getResourceId(33, 0)) == 0) ? null : b.a(context4, resourceId);
        float dimension2 = typedArrayG.getDimension(21, 0.0f);
        if (c1089f.f13119m0 != dimension2) {
            c1089f.f13119m0 = dimension2;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        c1089f.P(typedArrayG.getDimension(35, 0.0f));
        c1089f.O(typedArrayG.getDimension(34, 0.0f));
        float dimension3 = typedArrayG.getDimension(41, 0.0f);
        if (c1089f.f13122p0 != dimension3) {
            c1089f.f13122p0 = dimension3;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        float dimension4 = typedArrayG.getDimension(40, 0.0f);
        if (c1089f.f13123q0 != dimension4) {
            c1089f.f13123q0 = dimension4;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        c1089f.L(typedArrayG.getDimension(29, 0.0f));
        c1089f.J(typedArrayG.getDimension(27, 0.0f));
        float dimension5 = typedArrayG.getDimension(13, 0.0f);
        if (c1089f.f13126t0 != dimension5) {
            c1089f.f13126t0 = dimension5;
            c1089f.invalidateSelf();
            c1089f.v();
        }
        c1089f.T0 = typedArrayG.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayG.recycle();
        m.a(context2, attributeSet, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action);
        this.f11451D = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f11453F = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c1089f);
        c1089f.j(AbstractC1826B.e(this));
        m.a(context2, attributeSet, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f11455H = new C1087d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new C1086c(this));
        }
        setChecked(this.f11465z);
        setText(c1089f.f13100U);
        setEllipsize(c1089f.f13096R0);
        g();
        if (!this.f11460u.f13098S0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f11451D) {
            setMinHeight(this.f11453F);
        }
        this.f11452E = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g4.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f13068a.f11464y;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f11458K;
        rectF.setEmpty();
        if (c() && this.f11463x != null) {
            C1089f c1089f = this.f11460u;
            Rect bounds = c1089f.getBounds();
            rectF.setEmpty();
            if (c1089f.T()) {
                float f = c1089f.f13126t0 + c1089f.f13125s0 + c1089f.f13111e0 + c1089f.f13124r0 + c1089f.f13123q0;
                if (c1089f.getLayoutDirection() == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f;
                } else {
                    float f8 = bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i7 = (int) closeIconTouchBounds.top;
        int i8 = (int) closeIconTouchBounds.right;
        int i9 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f11457J;
        rect.set(i, i7, i8, i9);
        return rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1483d getTextAppearance() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13075A0.f14576g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setCloseIconHovered(boolean z5) {
        if (this.f11449B != z5) {
            this.f11449B = z5;
            refreshDrawableState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setCloseIconPressed(boolean z5) {
        if (this.f11448A != z5) {
            this.f11448A = z5;
            refreshDrawableState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        this.f11453F = i;
        if (!this.f11451D) {
            InsetDrawable insetDrawable = this.f11461v;
            if (insetDrawable == null) {
                int[] iArr = AbstractC1521a.f16014a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f11461v = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC1521a.f16014a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f11460u.f13091P));
        int iMax2 = Math.max(0, i - this.f11460u.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f11461v;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC1521a.f16014a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f11461v = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC1521a.f16014a;
                    e();
                    return;
                }
                return;
            }
        }
        int i7 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i8 = iMax > 0 ? iMax / 2 : 0;
        if (this.f11461v != null) {
            Rect rect = new Rect();
            this.f11461v.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i7 && rect.right == i7) {
                int[] iArr5 = AbstractC1521a.f16014a;
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f11461v = new InsetDrawable((Drawable) this.f11460u, i7, i8, i7, i8);
        int[] iArr6 = AbstractC1521a.f16014a;
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        C1089f c1089f = this.f11460u;
        if (c1089f == null) {
            return false;
        }
        Object obj = c1089f.f13108b0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC1413a) {
            obj = null;
        }
        return obj != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        C1089f c1089f;
        if (!c() || (c1089f = this.f11460u) == null || !c1089f.f13107a0 || this.f11463x == null) {
            AbstractC1835K.m(this, null);
            this.f11456I = false;
        } else {
            AbstractC1835K.m(this, this.f11455H);
            this.f11456I = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f11456I
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            g4.d r0 = r10.f11455H
            android.view.accessibility.AccessibilityManager r1 = r0.f1330h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6f
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6f
        L1c:
            int r1 = r11.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L32
            goto L6f
        L32:
            int r1 = r0.f1333m
            if (r1 == r7) goto L6f
            if (r1 != r7) goto L39
            goto L75
        L39:
            r0.f1333m = r7
            r0.q(r7, r6)
            r0.q(r1, r5)
            return r4
        L42:
            float r1 = r11.getX()
            float r2 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f13072q
            boolean r9 = r8.c()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r2)
            if (r1 == 0) goto L5e
            r1 = r4
            goto L5f
        L5e:
            r1 = r3
        L5f:
            int r2 = r0.f1333m
            if (r2 != r1) goto L64
            goto L6c
        L64:
            r0.f1333m = r1
            r0.q(r1, r6)
            r0.q(r2, r5)
        L6c:
            if (r1 == r7) goto L6f
            goto L75
        L6f:
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L76
        L75:
            return r4
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f11456I
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            g4.d r0 = r9.f11455H
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f1332l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f13072q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f11463x
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f11456I
            if (r1 == 0) goto L85
            g4.d r1 = r5.f11455H
            r1.q(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f1332l
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.C1324p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C1089f c1089f = this.f11460u;
        boolean zW = false;
        if (c1089f != null && C1089f.u(c1089f.f13108b0)) {
            C1089f c1089f2 = this.f11460u;
            ?? IsEnabled = isEnabled();
            int i7 = IsEnabled;
            if (this.f11450C) {
                i7 = IsEnabled + 1;
            }
            int i8 = i7;
            if (this.f11449B) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (this.f11448A) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f11450C) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f11449B) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f11448A) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c1089f2.f13090O0, iArr)) {
                c1089f2.f13090O0 = iArr;
                if (c1089f2.T()) {
                    zW = c1089f2.w(c1089f2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        this.f11462w = new RippleDrawable(AbstractC1521a.b(this.f11460u.f13099T), getBackgroundDrawable(), null);
        this.f11460u.getClass();
        RippleDrawable rippleDrawable = this.f11462w;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setBackground(rippleDrawable);
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        C1089f c1089f;
        if (TextUtils.isEmpty(getText()) || (c1089f = this.f11460u) == null) {
            return;
        }
        int iR = (int) (c1089f.r() + c1089f.f13126t0 + c1089f.f13123q0);
        C1089f c1089f2 = this.f11460u;
        int iQ = (int) (c1089f2.q() + c1089f2.f13119m0 + c1089f2.f13122p0);
        if (this.f11461v != null) {
            Rect rect = new Rect();
            this.f11461v.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setPaddingRelative(iQ, paddingTop, iR, paddingBottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        TextPaint paint = getPaint();
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            paint.drawableState = c1089f.getState();
        }
        C1483d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f11459L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f11454G)) {
            return this.f11454G;
        }
        C1089f c1089f = this.f11460u;
        if (c1089f == null || !c1089f.f13113g0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11461v;
        return insetDrawable == null ? this.f11460u : insetDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getCheckedIcon() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13115i0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCheckedIconTint() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13116j0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getChipBackgroundColor() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13089O;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipCornerRadius() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return Math.max(0.0f, c1089f.s());
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getChipDrawable() {
        return this.f11460u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipEndPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13126t0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1089f c1089f = this.f11460u;
        if (c1089f == null || (drawable = c1089f.f13103W) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1413a)) {
            return drawable;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipIconSize() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13105Y;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getChipIconTint() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13104X;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipMinHeight() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13091P;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipStartPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13119m0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getChipStrokeColor() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13095R;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getChipStrokeWidth() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13097S;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1089f c1089f = this.f11460u;
        if (c1089f == null || (drawable = c1089f.f13108b0) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1413a)) {
            return drawable;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getCloseIconContentDescription() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13112f0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getCloseIconEndPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13125s0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getCloseIconSize() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13111e0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getCloseIconStartPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13124r0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getCloseIconTint() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13110d0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13096R0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f11456I) {
            C1087d c1087d = this.f11455H;
            if (c1087d.f1332l == 1 || c1087d.f1331k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b getHideMotionSpec() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13118l0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getIconEndPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13121o0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getIconStartPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13120n0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getRippleColor() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13099T;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k getShapeAppearanceModel() {
        return this.f11460u.f16505q.f16479a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b getShowMotionSpec() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13117k0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTextEndPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13123q0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTextStartPadding() {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            return c1089f.f13122p0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3.a.Q(this, this.f11460u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11446N);
        }
        C1089f c1089f = this.f11460u;
        if (c1089f != null && c1089f.f13113g0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11447O);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i, Rect rect) {
        super.onFocusChanged(z5, i, rect);
        if (this.f11456I) {
            C1087d c1087d = this.f11455H;
            int i7 = c1087d.f1332l;
            if (i7 != Integer.MIN_VALUE) {
                c1087d.j(i7);
            }
            if (z5) {
                c1087d.m(i, rect);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C1089f c1089f = this.f11460u;
        accessibilityNodeInfo.setCheckable(c1089f != null && c1089f.f13113g0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f11452E != i) {
            this.f11452E = i;
            f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f11448A
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f11448A
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f11463x
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f11456I
            if (r0 == 0) goto L43
            g4.d r0 = r5.f11455H
            r0.q(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f11454G = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11462w) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1324p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11462w) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1324p, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.x(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckableResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.x(c1089f.f13127u0.getResources().getBoolean(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null) {
            this.f11465z = z5;
        } else if (c1089f.f13113g0) {
            super.setChecked(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIcon(Drawable drawable) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.y(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.y(AbstractC0597a.C(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.z(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconTintResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.z(AbstractC1175c.b(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconVisible(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.A(c1089f.f13127u0.getResources().getBoolean(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13089O == colorStateList) {
            return;
        }
        c1089f.f13089O = colorStateList;
        c1089f.onStateChange(c1089f.getState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListB;
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13089O == (colorStateListB = AbstractC1175c.b(c1089f.f13127u0, i))) {
            return;
        }
        c1089f.f13089O = colorStateListB;
        c1089f.onStateChange(c1089f.getState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipCornerRadius(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.B(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.B(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipDrawable(C1089f c1089f) {
        C1089f c1089f2 = this.f11460u;
        if (c1089f2 != c1089f) {
            if (c1089f2 != null) {
                c1089f2.f13094Q0 = new WeakReference(null);
            }
            this.f11460u = c1089f;
            c1089f.f13098S0 = false;
            c1089f.f13094Q0 = new WeakReference(this);
            b(this.f11453F);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipEndPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13126t0 == f) {
            return;
        }
        c1089f.f13126t0 = f;
        c1089f.invalidateSelf();
        c1089f.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipEndPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float dimension = c1089f.f13127u0.getResources().getDimension(i);
            if (c1089f.f13126t0 != dimension) {
                c1089f.f13126t0 = dimension;
                c1089f.invalidateSelf();
                c1089f.v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIcon(Drawable drawable) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.C(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.C(AbstractC0597a.C(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconSize(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.D(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconSizeResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.D(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconTint(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.E(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconTintResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.E(AbstractC1175c.b(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconVisible(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.F(c1089f.f13127u0.getResources().getBoolean(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipMinHeight(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13091P == f) {
            return;
        }
        c1089f.f13091P = f;
        c1089f.invalidateSelf();
        c1089f.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipMinHeightResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float dimension = c1089f.f13127u0.getResources().getDimension(i);
            if (c1089f.f13091P != dimension) {
                c1089f.f13091P = dimension;
                c1089f.invalidateSelf();
                c1089f.v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStartPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13119m0 == f) {
            return;
        }
        c1089f.f13119m0 = f;
        c1089f.invalidateSelf();
        c1089f.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStartPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float dimension = c1089f.f13127u0.getResources().getDimension(i);
            if (c1089f.f13119m0 != dimension) {
                c1089f.f13119m0 = dimension;
                c1089f.invalidateSelf();
                c1089f.v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.G(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStrokeColorResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.G(AbstractC1175c.b(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStrokeWidth(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.H(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipStrokeWidthResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.H(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIcon(Drawable drawable) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.I(drawable);
        }
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13112f0 == charSequence) {
            return;
        }
        String str = C1675b.f17119b;
        C1675b c1675b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C1675b.f17122e : C1675b.f17121d;
        c1675b.getClass();
        c cVar = AbstractC1679f.f17129a;
        c1089f.f13112f0 = c1675b.c(charSequence);
        c1089f.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconEndPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.J(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconEndPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.J(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.I(AbstractC0597a.C(c1089f.f13127u0, i));
        }
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconSize(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.K(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconSizeResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.K(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconStartPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.L(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconStartPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.L(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconTint(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.M(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconTintResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.M(AbstractC1175c.b(c1089f.f13127u0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1324p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1324p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i7, int i8, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i7, int i8, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.j(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11460u == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13096R0 = truncateAt;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f11451D = z5;
        b(this.f11453F);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHideMotionSpec(b bVar) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13118l0 = bVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHideMotionSpecResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13118l0 = b.a(c1089f.f13127u0, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconEndPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.O(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconEndPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.O(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconStartPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.P(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconStartPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.P(c1089f.f13127u0.getResources().getDimension(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f11460u == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.T0 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11464y = onCheckedChangeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11463x = onClickListener;
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColor(ColorStateList colorStateList) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.Q(colorStateList);
        }
        this.f11460u.getClass();
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColorResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.Q(AbstractC1175c.b(c1089f.f13127u0, i));
            this.f11460u.getClass();
            e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.u
    public void setShapeAppearanceModel(k kVar) {
        this.f11460u.setShapeAppearanceModel(kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowMotionSpec(b bVar) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13117k0 = bVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowMotionSpecResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13117k0 = b.a(c1089f.f13127u0, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1089f.f13098S0 ? null : charSequence, bufferType);
        C1089f c1089f2 = this.f11460u;
        if (c1089f2 == null || TextUtils.equals(c1089f2.f13100U, charSequence)) {
            return;
        }
        c1089f2.f13100U = charSequence;
        c1089f2.f13075A0.f14575e = true;
        c1089f2.invalidateSelf();
        c1089f2.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearance(C1483d c1483d) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.f13075A0.b(c1483d, c1089f.f13127u0);
        }
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextEndPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13123q0 == f) {
            return;
        }
        c1089f.f13123q0 = f;
        c1089f.invalidateSelf();
        c1089f.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextEndPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float dimension = c1089f.f13127u0.getResources().getDimension(i);
            if (c1089f.f13123q0 != dimension) {
                c1089f.f13123q0 = dimension;
                c1089f.invalidateSelf();
                c1089f.v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C1240j c1240j = c1089f.f13075A0;
            C1483d c1483d = c1240j.f14576g;
            if (c1483d != null) {
                c1483d.f15894k = fApplyDimension;
                c1240j.f14571a.setTextSize(fApplyDimension);
                c1089f.a();
            }
        }
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextStartPadding(float f) {
        C1089f c1089f = this.f11460u;
        if (c1089f == null || c1089f.f13122p0 == f) {
            return;
        }
        c1089f.f13122p0 = f;
        c1089f.invalidateSelf();
        c1089f.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextStartPaddingResource(int i) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            float dimension = c1089f.f13127u0.getResources().getDimension(i);
            if (c1089f.f13122p0 != dimension) {
                c1089f.f13122p0 = dimension;
                c1089f.invalidateSelf();
                c1089f.v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCloseIconVisible(boolean z5) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.N(z5);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z5) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.A(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            c1089f.F(z5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            Context context2 = c1089f.f13127u0;
            c1089f.f13075A0.b(new C1483d(context2, i), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1089f c1089f = this.f11460u;
        if (c1089f != null) {
            Context context = c1089f.f13127u0;
            c1089f.f13075A0.b(new C1483d(context, i), context);
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1235e interfaceC1235e) {
    }
}
