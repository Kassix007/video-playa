package m;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.measurement.P1;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: m.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1326q extends CheckedTextView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a6.j f14857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W1.l f14858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1284V f14859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1334u f14860t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1274P0.a(context);
        AbstractC1272O0.a(this, getContext());
        C1284V c1284v = new C1284V(this);
        this.f14859s = c1284v;
        c1284v.f(attributeSet, R.attr.checkedTextViewStyle);
        c1284v.b();
        W1.l lVar = new W1.l(this);
        this.f14858r = lVar;
        lVar.e(attributeSet, R.attr.checkedTextViewStyle);
        this.f14857q = new a6.j(this, 1);
        Context context2 = getContext();
        int[] iArr = AbstractC1066a.f12794l;
        B0.G0 g0N = B0.G0.N(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        AbstractC1835K.l(this, getContext(), iArr, attributeSet, (TypedArray) g0N.f235s, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0597a.C(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0597a.C(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0597a.C(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(g0N.w(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1313j0.b(typedArray.getInt(3, -1), null));
            }
            g0N.R();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            g0N.R();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1334u getEmojiTextViewHelper() {
        if (this.f14860t == null) {
            this.f14860t = new C1334u(this);
        }
        return this.f14860t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1284V c1284v = this.f14859s;
        if (c1284v != null) {
            c1284v.b();
        }
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            lVar.a();
        }
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            jVar.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P1.e0(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCheckMarkTintList() {
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            return (ColorStateList) jVar.f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f9039g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14859s.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14859s.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l6.d.y(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            if (jVar.f9037d) {
                jVar.f9037d = false;
            } else {
                jVar.f9037d = true;
                jVar.b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14859s;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14859s;
        if (c1284v != null) {
            c1284v.b();
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
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14858r;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            jVar.f = colorStateList;
            jVar.f9035b = true;
            jVar.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        a6.j jVar = this.f14857q;
        if (jVar != null) {
            jVar.f9039g = mode;
            jVar.f9036c = true;
            jVar.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1284V c1284v = this.f14859s;
        c1284v.k(colorStateList);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1284V c1284v = this.f14859s;
        c1284v.l(mode);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1284V c1284v = this.f14859s;
        if (c1284v != null) {
            c1284v.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0597a.C(getContext(), i));
    }
}
