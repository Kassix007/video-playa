package E2;

import M5.C0247h;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f1683q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(ImageView imageView) {
        this.f1683q = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3.a a(int i, int i7, int i8) {
        if (i == -2) {
            return b.f1677t;
        }
        int i9 = i - i8;
        if (i9 > 0) {
            return new a(i9);
        }
        int i10 = i7 - i8;
        if (i10 > 0) {
            return new a(i10);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h b() {
        ImageView imageView = this.f1683q;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C3.a aVarA = a(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (aVarA == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        C3.a aVarA2 = a(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (aVarA2 == null) {
            return null;
        }
        return new h(aVarA, aVarA2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f1683q.equals(((f) obj).f1683q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E2.i
    public Object f(t2.j jVar) {
        h hVarB = b();
        if (hVarB != null) {
            return hVarB;
        }
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(jVar));
        c0247h.s();
        ViewTreeObserver viewTreeObserver = this.f1683q.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, c0247h);
        viewTreeObserver.addOnPreDrawListener(kVar);
        c0247h.u(new j(this, viewTreeObserver, kVar));
        return c0247h.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1683q.hashCode() * 31);
    }
}
