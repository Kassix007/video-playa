package com.google.android.material.button;

import a.AbstractC0597a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.I1;
import d4.C1005b;
import d4.C1006c;
import d4.InterfaceC1004a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.AbstractC1175c;
import k1.i;
import k3.d;
import l4.m;
import m.C1322o;
import q4.AbstractC1521a;
import s4.j;
import s4.k;
import s4.u;
import w1.AbstractC1835K;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C1322o implements Checkable, u {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f11415H = {R.attr.state_checkable};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f11416I = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11417A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11418B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11419C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11420D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f11421E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f11422F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11423G;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1006c f11424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f11425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC1004a f11426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f11427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f11428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f11429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11430z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.wnapp.smspariaz.R.attr.materialButtonStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Button), attributeSet, com.wnapp.smspariaz.R.attr.materialButtonStyle);
        this.f11425u = new LinkedHashSet();
        this.f11421E = false;
        this.f11422F = false;
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, V3.a.f7984m, com.wnapp.smspariaz.R.attr.materialButtonStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f11420D = typedArrayG.getDimensionPixelSize(12, 0);
        int i = typedArrayG.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f11427w = m.i(i, mode);
        this.f11428x = I1.Z(getContext(), typedArrayG, 14);
        this.f11429y = I1.b0(getContext(), typedArrayG, 10);
        this.f11423G = typedArrayG.getInteger(11, 1);
        this.f11417A = typedArrayG.getDimensionPixelSize(13, 0);
        C1006c c1006c = new C1006c(this, k.b(context2, attributeSet, com.wnapp.smspariaz.R.attr.materialButtonStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Button).a());
        this.f11424t = c1006c;
        c1006c.f12275c = typedArrayG.getDimensionPixelOffset(1, 0);
        c1006c.f12276d = typedArrayG.getDimensionPixelOffset(2, 0);
        c1006c.f12277e = typedArrayG.getDimensionPixelOffset(3, 0);
        c1006c.f = typedArrayG.getDimensionPixelOffset(4, 0);
        if (typedArrayG.hasValue(8)) {
            int dimensionPixelSize = typedArrayG.getDimensionPixelSize(8, -1);
            c1006c.f12278g = dimensionPixelSize;
            float f = dimensionPixelSize;
            j jVarE = c1006c.f12274b.e();
            jVarE.f16520e = new s4.a(f);
            jVarE.f = new s4.a(f);
            jVarE.f16521g = new s4.a(f);
            jVarE.f16522h = new s4.a(f);
            c1006c.c(jVarE.a());
            c1006c.f12285p = true;
        }
        c1006c.f12279h = typedArrayG.getDimensionPixelSize(20, 0);
        c1006c.i = m.i(typedArrayG.getInt(7, -1), mode);
        c1006c.j = I1.Z(getContext(), typedArrayG, 6);
        c1006c.f12280k = I1.Z(getContext(), typedArrayG, 19);
        c1006c.f12281l = I1.Z(getContext(), typedArrayG, 16);
        c1006c.f12286q = typedArrayG.getBoolean(5, false);
        c1006c.f12289t = typedArrayG.getDimensionPixelSize(9, 0);
        c1006c.f12287r = typedArrayG.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayG.hasValue(0)) {
            c1006c.f12284o = true;
            setSupportBackgroundTintList(c1006c.j);
            setSupportBackgroundTintMode(c1006c.i);
        } else {
            c1006c.e();
        }
        setPaddingRelative(paddingStart + c1006c.f12275c, paddingTop + c1006c.f12277e, paddingEnd + c1006c.f12276d, paddingBottom + c1006c.f);
        typedArrayG.recycle();
        setCompoundDrawablePadding(this.f11420D);
        c(this.f11429y != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        C1006c c1006c = this.f11424t;
        return (c1006c == null || c1006c.f12284o) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = this.f11423G;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f11429y, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f11429y, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f11429y, null, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        Drawable drawable = this.f11429y;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f11429y = drawableMutate;
            drawableMutate.setTintList(this.f11428x);
            PorterDuff.Mode mode = this.f11427w;
            if (mode != null) {
                this.f11429y.setTintMode(mode);
            }
            int intrinsicWidth = this.f11417A;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f11429y.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f11417A;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f11429y.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11429y;
            int i = this.f11418B;
            int i7 = this.f11419C;
            drawable2.setBounds(i, i7, intrinsicWidth + i, intrinsicHeight + i7);
            this.f11429y.setVisible(true, z5);
        }
        if (z5) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i8 = this.f11423G;
        if (((i8 == 1 || i8 == 2) && drawable3 != this.f11429y) || (((i8 == 3 || i8 == 4) && drawable5 != this.f11429y) || ((i8 == 16 || i8 == 32) && drawable4 != this.f11429y))) {
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i7) {
        if (this.f11429y == null || getLayout() == null) {
            return;
        }
        int i8 = this.f11423G;
        if (i8 != 1 && i8 != 2 && i8 != 3 && i8 != 4) {
            if (i8 == 16 || i8 == 32) {
                this.f11418B = 0;
                if (i8 == 16) {
                    this.f11419C = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f11417A;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f11429y.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i7 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f11420D) - getPaddingBottom()) / 2);
                if (this.f11419C != iMax) {
                    this.f11419C = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f11419C = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f11423G;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f11418B = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f11417A;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f11429y.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f11420D) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f11423G == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f11418B != paddingEnd) {
            this.f11418B = paddingEnd;
            c(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f11430z)) {
            return this.f11430z;
        }
        C1006c c1006c = this.f11424t;
        return ((c1006c == null || !c1006c.f12286q) ? Button.class : CompoundButton.class).getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCornerRadius() {
        if (a()) {
            return this.f11424t.f12278g;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getIcon() {
        return this.f11429y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIconGravity() {
        return this.f11423G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIconPadding() {
        return this.f11420D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIconSize() {
        return this.f11417A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getIconTint() {
        return this.f11428x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getIconTintMode() {
        return this.f11427w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getInsetBottom() {
        return this.f11424t.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getInsetTop() {
        return this.f11424t.f12277e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f11424t.f12281l;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f11424t.f12274b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f11424t.f12280k;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getStrokeWidth() {
        if (a()) {
            return this.f11424t.f12279h;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f11424t.j : super.getSupportBackgroundTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f11424t.i : super.getSupportBackgroundTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11421E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            C3.a.Q(this, this.f11424t.b(false));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C1006c c1006c = this.f11424t;
        if (c1006c != null && c1006c.f12286q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11415H);
        }
        if (this.f11421E) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11416I);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f11421E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1006c c1006c = this.f11424t;
        accessibilityNodeInfo.setCheckable(c1006c != null && c1006c.f12286q);
        accessibilityNodeInfo.setChecked(this.f11421E);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1005b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1005b c1005b = (C1005b) parcelable;
        super.onRestoreInstanceState(c1005b.f1163q);
        setChecked(c1005b.f12272s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1005b c1005b = new C1005b(super.onSaveInstanceState());
        c1005b.f12272s = this.f11421E;
        return c1005b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i7, int i8) {
        super.onTextChanged(charSequence, i, i7, i8);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean performClick() {
        if (this.f11424t.f12287r) {
            toggle();
        }
        return super.performClick();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f11429y != null) {
            if (this.f11429y.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setA11yClassName(String str) {
        this.f11430z = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        C1006c c1006c = this.f11424t;
        if (c1006c.b(false) != null) {
            c1006c.b(false).setTint(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1006c c1006c = this.f11424t;
        c1006c.f12284o = true;
        MaterialButton materialButton = c1006c.f12273a;
        materialButton.setSupportBackgroundTintList(c1006c.j);
        materialButton.setSupportBackgroundTintMode(c1006c.i);
        super.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0597a.C(getContext(), i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        if (a()) {
            this.f11424t.f12286q = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        C1006c c1006c = this.f11424t;
        if (c1006c == null || !c1006c.f12286q || !isEnabled() || this.f11421E == z5) {
            return;
        }
        this.f11421E = z5;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z6 = this.f11421E;
            if (!materialButtonToggleGroup.f11437v) {
                materialButtonToggleGroup.b(getId(), z6);
            }
        }
        if (this.f11422F) {
            return;
        }
        this.f11422F = true;
        Iterator it = this.f11425u.iterator();
        if (it.hasNext()) {
            throw i.h(it);
        }
        this.f11422F = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCornerRadius(int i) {
        if (a()) {
            C1006c c1006c = this.f11424t;
            if (c1006c.f12285p && c1006c.f12278g == i) {
                return;
            }
            c1006c.f12278g = i;
            c1006c.f12285p = true;
            float f = i;
            j jVarE = c1006c.f12274b.e();
            jVarE.f16520e = new s4.a(f);
            jVarE.f = new s4.a(f);
            jVarE.f16521g = new s4.a(f);
            jVarE.f16522h = new s4.a(f);
            c1006c.c(jVarE.a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.f11424t.b(false).j(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        if (this.f11429y != drawable) {
            this.f11429y = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconGravity(int i) {
        if (this.f11423G != i) {
            this.f11423G = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconPadding(int i) {
        if (this.f11420D != i) {
            this.f11420D = i;
            setCompoundDrawablePadding(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0597a.C(getContext(), i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f11417A != i) {
            this.f11417A = i;
            c(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11428x != colorStateList) {
            this.f11428x = colorStateList;
            c(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11427w != mode) {
            this.f11427w = mode;
            c(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTintResource(int i) {
        setIconTint(AbstractC1175c.b(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setInsetBottom(int i) {
        C1006c c1006c = this.f11424t;
        c1006c.d(c1006c.f12277e, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setInsetTop(int i) {
        C1006c c1006c = this.f11424t;
        c1006c.d(i, c1006c.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnPressedChangeListenerInternal(InterfaceC1004a interfaceC1004a) {
        this.f11426v = interfaceC1004a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setPressed(boolean z5) {
        InterfaceC1004a interfaceC1004a = this.f11426v;
        if (interfaceC1004a != null) {
            ((MaterialButtonToggleGroup) ((d) interfaceC1004a).f14122r).invalidate();
        }
        super.setPressed(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C1006c c1006c = this.f11424t;
            MaterialButton materialButton = c1006c.f12273a;
            if (c1006c.f12281l != colorStateList) {
                c1006c.f12281l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1521a.b(colorStateList));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(AbstractC1175c.b(getContext(), i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.u
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f11424t.c(kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (a()) {
            C1006c c1006c = this.f11424t;
            c1006c.f12283n = z5;
            c1006c.f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C1006c c1006c = this.f11424t;
            if (c1006c.f12280k != colorStateList) {
                c1006c.f12280k = colorStateList;
                c1006c.f();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(AbstractC1175c.b(getContext(), i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeWidth(int i) {
        if (a()) {
            C1006c c1006c = this.f11424t;
            if (c1006c.f12279h != i) {
                c1006c.f12279h = i;
                c1006c.f();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1006c c1006c = this.f11424t;
        if (c1006c.j != colorStateList) {
            c1006c.j = colorStateList;
            if (c1006c.b(false) != null) {
                c1006c.b(false).setTintList(c1006c.j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1322o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1006c c1006c = this.f11424t;
        if (c1006c.i != mode) {
            c1006c.i = mode;
            if (c1006c.b(false) == null || c1006c.i == null) {
                return;
            }
            c1006c.b(false).setTintMode(c1006c.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f11424t.f12287r = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11421E);
    }
}
