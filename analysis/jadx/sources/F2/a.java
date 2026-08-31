package F2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0643f, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f1946r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(ImageView imageView) {
        this.f1946r = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F2.b
    public final void d(Drawable drawable) {
        h(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.f1946r, ((a) obj).f1946r);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        Object drawable = this.f1946r.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f1945q) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Drawable drawable) {
        ImageView imageView = this.f1946r;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1946r.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F2.b
    public final void j(Drawable drawable) {
        h(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void n(InterfaceC0660x interfaceC0660x) {
        this.f1945q = true;
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F2.b
    public final void o(Drawable drawable) {
        h(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void v(InterfaceC0660x interfaceC0660x) {
        this.f1945q = false;
        g();
    }
}
