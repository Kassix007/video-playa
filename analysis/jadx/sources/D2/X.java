package d2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public final class X extends C1839b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f12049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W f12050e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X(RecyclerView recyclerView) {
        this.f12049d = recyclerView;
        W w3 = this.f12050e;
        if (w3 != null) {
            this.f12050e = w3;
        } else {
            this.f12050e = new W(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f12049d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void d(View view, x1.e eVar) {
        this.f18187a.onInitializeAccessibilityNodeInfo(view, eVar.f18345a);
        RecyclerView recyclerView = this.f12049d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0960G layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f11978b;
        C0966M c0966m = recyclerView2.f9650r;
        C0971S c0971s = recyclerView2.f9653s0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f11978b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            eVar.m(true);
        }
        if (layoutManager.f11978b.canScrollVertically(1) || layoutManager.f11978b.canScrollHorizontally(1)) {
            eVar.a(4096);
            eVar.m(true);
        }
        eVar.j(I2.l.a(layoutManager.J(c0966m, c0971s), layoutManager.x(c0966m, c0971s), 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w1.C1839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f12049d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L8c
            d2.G r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            d2.G r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f11978b
            d2.M r2 = r0.f9650r
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f11988o
            int r2 = r4.G()
            int r0 = r0 - r2
            int r2 = r4.D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f11978b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f11987n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f11988o
            int r0 = r4.G()
            int r5 = r5 - r0
            int r0 = r4.D()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f11978b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f11987n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f11978b
            r4.Z(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.X.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
