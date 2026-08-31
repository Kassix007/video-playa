package d2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: d2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0997w extends AbstractC0962I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f12217b = new Y(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0995u f12218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0995u f12219d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(View view, E1.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View c(AbstractC0960G abstractC0960G, E1.g gVar) {
        int iV = abstractC0960G.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = abstractC0960G.u(i7);
            int iAbs = Math.abs(((gVar.c(viewU) / 2) + gVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] a(AbstractC0960G abstractC0960G, View view) {
        int[] iArr = new int[2];
        if (abstractC0960G.d()) {
            iArr[0] = b(view, d(abstractC0960G));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0960G.e()) {
            iArr[1] = b(view, e(abstractC0960G));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final E1.g d(AbstractC0960G abstractC0960G) {
        C0995u c0995u = this.f12219d;
        if (c0995u == null || ((AbstractC0960G) c0995u.f1633b) != abstractC0960G) {
            this.f12219d = new C0995u(abstractC0960G, 0);
        }
        return this.f12219d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final E1.g e(AbstractC0960G abstractC0960G) {
        C0995u c0995u = this.f12218c;
        if (c0995u == null || ((AbstractC0960G) c0995u.f1633b) != abstractC0960G) {
            this.f12218c = new C0995u(abstractC0960G, 1);
        }
        return this.f12218c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        AbstractC0960G layoutManager;
        RecyclerView recyclerView = this.f12216a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewC = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.f12216a.Z(i, iArrA[1], false);
    }
}
