package C0;

import android.view.ViewGroup;
import c0.AbstractC0724l;
import i0.C1131c;
import j0.AbstractC1145B;
import m5.C1386y;

/* JADX INFO: renamed from: C0.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088l0 extends AbstractC0724l implements F0.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewGroup f1059E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F0.a
    public final Object X(B0.n0 n0Var, B0.K k7, s5.i iVar) {
        long jF = n0Var.F(0L);
        C1131c c1131c = (C1131c) k7.invoke();
        C1131c c1131cE = c1131c != null ? c1131c.e(jF) : null;
        if (c1131cE != null) {
            this.f1059E.requestRectangleOnScreen(AbstractC1145B.u(c1131cE), false);
        }
        return C1386y.f15098a;
    }
}
