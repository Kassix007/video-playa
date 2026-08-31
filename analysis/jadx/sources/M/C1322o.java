package m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.gms.internal.measurement.P1;

/* JADX INFO: renamed from: m.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1322o extends Button {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W1.l f14837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1284V f14838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1334u f14839s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1274P0.a(context);
        AbstractC1272O0.a(this, getContext());
        W1.l lVar = new W1.l(this);
        this.f14837q = lVar;
        lVar.e(attributeSet, i);
        C1284V c1284v = new C1284V(this);
        this.f14838r = c1284v;
        c1284v.f(attributeSet, i);
        c1284v.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1334u getEmojiTextViewHelper() {
        if (this.f14839s == null) {
            this.f14839s = new C1334u(this);
        }
        return this.f14839s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            lVar.a();
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f14792c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14780e);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f14792c) {
            return super.getAutoSizeMinTextSize();
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14779d);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f14792c) {
            return super.getAutoSizeStepGranularity();
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14778c);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f14792c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1284V c1284v = this.f14838r;
        return c1284v != null ? c1284v.i.f : new int[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f14792c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            return c1284v.i.f14776a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P1.e0(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14838r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14838r.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        C1284V c1284v = this.f14838r;
        if (c1284v == null || g1.f14792c) {
            return;
        }
        c1284v.i.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i7, int i8) {
        super.onTextChanged(charSequence, i, i7, i8);
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            C1303e0 c1303e0 = c1284v.i;
            if (g1.f14792c || !c1303e0.f()) {
                return;
            }
            c1303e0.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i7, int i8, int i9) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i7, i8, i9);
            return;
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.h(i, i7, i8, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.i(iArr, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.j(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P1.g0(callback, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6.d) getEmojiTextViewHelper().f14883b.f14120q).o(inputFilterArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportAllCaps(boolean z5) {
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.f14714a.setAllCaps(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14837q;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1284V c1284v = this.f14838r;
        c1284v.k(colorStateList);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1284V c1284v = this.f14838r;
        c1284v.l(mode);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            c1284v.g(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z5 = g1.f14792c;
        if (z5) {
            super.setTextSize(i, f);
            return;
        }
        C1284V c1284v = this.f14838r;
        if (c1284v != null) {
            C1303e0 c1303e0 = c1284v.i;
            if (z5 || c1303e0.f()) {
                return;
            }
            c1303e0.g(i, f);
        }
    }
}
