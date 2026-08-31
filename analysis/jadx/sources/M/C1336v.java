package m;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: m.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1336v extends ImageButton {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W1.l f14899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E.Y f14900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14901s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1274P0.a(context);
        this.f14901s = false;
        AbstractC1272O0.a(this, getContext());
        W1.l lVar = new W1.l(this);
        this.f14899q = lVar;
        lVar.e(attributeSet, i);
        E.Y y6 = new E.Y(this);
        this.f14900r = y6;
        y6.l(attributeSet, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            lVar.a();
        }
        E.Y y6 = this.f14900r;
        if (y6 != null) {
            y6.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportImageTintList() {
        d6.h hVar;
        E.Y y6 = this.f14900r;
        if (y6 == null || (hVar = (d6.h) y6.f1521d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f12339c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportImageTintMode() {
        d6.h hVar;
        E.Y y6 = this.f14900r;
        if (y6 == null || (hVar = (d6.h) y6.f1521d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f12340d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f14900r.f1520c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        E.Y y6 = this.f14900r;
        if (y6 != null) {
            y6.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        E.Y y6 = this.f14900r;
        if (y6 != null && drawable != null && !this.f14901s) {
            y6.f1519b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (y6 != null) {
            y6.b();
            if (this.f14901s) {
                return;
            }
            ImageView imageView = (ImageView) y6.f1520c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(y6.f1519b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f14901s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        E.Y y6 = this.f14900r;
        ImageView imageView = (ImageView) y6.f1520c;
        if (i != 0) {
            Drawable drawableC = AbstractC0597a.C(imageView.getContext(), i);
            if (drawableC != null) {
                AbstractC1313j0.a(drawableC);
            }
            imageView.setImageDrawable(drawableC);
        } else {
            imageView.setImageDrawable(null);
        }
        y6.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        E.Y y6 = this.f14900r;
        if (y6 != null) {
            y6.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14899q;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        E.Y y6 = this.f14900r;
        if (y6 != null) {
            if (((d6.h) y6.f1521d) == null) {
                y6.f1521d = new d6.h();
            }
            d6.h hVar = (d6.h) y6.f1521d;
            hVar.f12339c = colorStateList;
            hVar.f12338b = true;
            y6.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        E.Y y6 = this.f14900r;
        if (y6 != null) {
            if (((d6.h) y6.f1521d) == null) {
                y6.f1521d = new d6.h();
            }
            d6.h hVar = (d6.h) y6.f1521d;
            hVar.f12340d = mode;
            hVar.f12337a = true;
            y6.b();
        }
    }
}
