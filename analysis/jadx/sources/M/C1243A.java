package m;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: m.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1243A extends RadioButton implements A1.o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a6.j f14612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W1.l f14613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1284V f14614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1334u f14615t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC1274P0.a(context);
        AbstractC1272O0.a(this, getContext());
        a6.j jVar = new a6.j(this, 2);
        this.f14612q = jVar;
        jVar.c(attributeSet, R.attr.radioButtonStyle);
        W1.l lVar = new W1.l(this);
        this.f14613r = lVar;
        lVar.e(attributeSet, R.attr.radioButtonStyle);
        C1284V c1284v = new C1284V(this);
        this.f14614s = c1284v;
        c1284v.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1334u getEmojiTextViewHelper() {
        if (this.f14615t == null) {
            this.f14615t = new C1334u(this);
        }
        return this.f14615t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            lVar.a();
        }
        C1284V c1284v = this.f14614s;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A1.o
    public ColorStateList getSupportButtonTintList() {
        a6.j jVar = this.f14612q;
        if (jVar != null) {
            return (ColorStateList) jVar.f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportButtonTintMode() {
        a6.j jVar = this.f14612q;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f9039g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14614s.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14614s.e();
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
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        a6.j jVar = this.f14612q;
        if (jVar != null) {
            if (jVar.f9037d) {
                jVar.f9037d = false;
            } else {
                jVar.f9037d = true;
                jVar.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14614s;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14614s;
        if (c1284v != null) {
            c1284v.b();
        }
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
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14613r;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A1.o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        a6.j jVar = this.f14612q;
        if (jVar != null) {
            jVar.f = colorStateList;
            jVar.f9035b = true;
            jVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A1.o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        a6.j jVar = this.f14612q;
        if (jVar != null) {
            jVar.f9039g = mode;
            jVar.f9036c = true;
            jVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1284V c1284v = this.f14614s;
        c1284v.k(colorStateList);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1284V c1284v = this.f14614s;
        c1284v.l(mode);
        c1284v.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0597a.C(getContext(), i));
    }
}
