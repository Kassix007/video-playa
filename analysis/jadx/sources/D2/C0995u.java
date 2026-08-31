package d2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: d2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995u extends E1.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12214d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0995u(AbstractC0960G abstractC0960G, int i) {
        super(abstractC0960G);
        this.f12214d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int b(View view) {
        int right;
        int i;
        switch (this.f12214d) {
            case 0:
                C0961H c0961h = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                right = view.getRight() + ((C0961H) view.getLayoutParams()).f11990b.right;
                i = ((ViewGroup.MarginLayoutParams) c0961h).rightMargin;
                break;
            default:
                C0961H c0961h2 = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                right = view.getBottom() + ((C0961H) view.getLayoutParams()).f11990b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0961h2).bottomMargin;
                break;
        }
        return right + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int c(View view) {
        int iA;
        int i;
        switch (this.f12214d) {
            case 0:
                C0961H c0961h = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                iA = AbstractC0960G.A(view) + ((ViewGroup.MarginLayoutParams) c0961h).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0961h).rightMargin;
                break;
            default:
                C0961H c0961h2 = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                iA = AbstractC0960G.z(view) + ((ViewGroup.MarginLayoutParams) c0961h2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0961h2).bottomMargin;
                break;
        }
        return iA + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int d(View view) {
        int iZ;
        int i;
        switch (this.f12214d) {
            case 0:
                C0961H c0961h = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                iZ = AbstractC0960G.z(view) + ((ViewGroup.MarginLayoutParams) c0961h).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0961h).bottomMargin;
                break;
            default:
                C0961H c0961h2 = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                iZ = AbstractC0960G.A(view) + ((ViewGroup.MarginLayoutParams) c0961h2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0961h2).rightMargin;
                break;
        }
        return iZ + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int e(View view) {
        int left;
        int i;
        switch (this.f12214d) {
            case 0:
                C0961H c0961h = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                left = view.getLeft() - ((C0961H) view.getLayoutParams()).f11990b.left;
                i = ((ViewGroup.MarginLayoutParams) c0961h).leftMargin;
                break;
            default:
                C0961H c0961h2 = (C0961H) view.getLayoutParams();
                ((AbstractC0960G) this.f1633b).getClass();
                left = view.getTop() - ((C0961H) view.getLayoutParams()).f11990b.top;
                i = ((ViewGroup.MarginLayoutParams) c0961h2).topMargin;
                break;
        }
        return left - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int f() {
        switch (this.f12214d) {
            case 0:
                return ((AbstractC0960G) this.f1633b).f11987n;
            default:
                return ((AbstractC0960G) this.f1633b).f11988o;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int g() {
        int i;
        int iF;
        switch (this.f12214d) {
            case 0:
                AbstractC0960G abstractC0960G = (AbstractC0960G) this.f1633b;
                i = abstractC0960G.f11987n;
                iF = abstractC0960G.F();
                break;
            default:
                AbstractC0960G abstractC0960G2 = (AbstractC0960G) this.f1633b;
                i = abstractC0960G2.f11988o;
                iF = abstractC0960G2.D();
                break;
        }
        return i - iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int h() {
        switch (this.f12214d) {
            case 0:
                return ((AbstractC0960G) this.f1633b).F();
            default:
                return ((AbstractC0960G) this.f1633b).D();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int i() {
        switch (this.f12214d) {
            case 0:
                return ((AbstractC0960G) this.f1633b).f11985l;
            default:
                return ((AbstractC0960G) this.f1633b).f11986m;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int j() {
        switch (this.f12214d) {
            case 0:
                return ((AbstractC0960G) this.f1633b).f11986m;
            default:
                return ((AbstractC0960G) this.f1633b).f11985l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int k() {
        switch (this.f12214d) {
            case 0:
                return ((AbstractC0960G) this.f1633b).E();
            default:
                return ((AbstractC0960G) this.f1633b).G();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int l() {
        int iE;
        int iF;
        switch (this.f12214d) {
            case 0:
                AbstractC0960G abstractC0960G = (AbstractC0960G) this.f1633b;
                iE = abstractC0960G.f11987n - abstractC0960G.E();
                iF = abstractC0960G.F();
                break;
            default:
                AbstractC0960G abstractC0960G2 = (AbstractC0960G) this.f1633b;
                iE = abstractC0960G2.f11988o - abstractC0960G2.G();
                iF = abstractC0960G2.D();
                break;
        }
        return iE - iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int m(View view) {
        switch (this.f12214d) {
            case 0:
                AbstractC0960G abstractC0960G = (AbstractC0960G) this.f1633b;
                Rect rect = (Rect) this.f1634c;
                abstractC0960G.K(view, rect);
                return rect.right;
            default:
                AbstractC0960G abstractC0960G2 = (AbstractC0960G) this.f1633b;
                Rect rect2 = (Rect) this.f1634c;
                abstractC0960G2.K(view, rect2);
                return rect2.bottom;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final int n(View view) {
        switch (this.f12214d) {
            case 0:
                AbstractC0960G abstractC0960G = (AbstractC0960G) this.f1633b;
                Rect rect = (Rect) this.f1634c;
                abstractC0960G.K(view, rect);
                return rect.left;
            default:
                AbstractC0960G abstractC0960G2 = (AbstractC0960G) this.f1633b;
                Rect rect2 = (Rect) this.f1634c;
                abstractC0960G2.K(view, rect2);
                return rect2.top;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.g
    public final void o(int i) {
        switch (this.f12214d) {
            case 0:
                ((AbstractC0960G) this.f1633b).O(i);
                break;
            default:
                ((AbstractC0960G) this.f1633b).P(i);
                break;
        }
    }
}
