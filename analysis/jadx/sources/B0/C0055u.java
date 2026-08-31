package B0;

import z0.AbstractC1933J;
import z0.C1952l;

/* JADX INFO: renamed from: B0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055u extends U {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final int Y(C1952l c1952l) {
        Y y6 = this.f325B.f478B.f269V.f312q;
        kotlin.jvm.internal.m.b(y6);
        M m4 = y6.f346G;
        P p7 = y6.f353v;
        if (p7.f302d == G.f226r) {
            m4.f292d = true;
            if (m4.f290b) {
                p7.f = true;
                p7.f304g = true;
            }
        } else {
            m4.f293e = true;
        }
        C0055u c0055u = y6.n().f518b0;
        if (c0055u != null) {
            c0055u.f322x = true;
        }
        y6.t();
        C0055u c0055u2 = y6.n().f518b0;
        if (c0055u2 != null) {
            c0055u2.f322x = false;
        }
        Integer num = (Integer) m4.f294g.get(c1952l);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f330G.g(iIntValue, c1952l);
        return iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1925B
    public final AbstractC1933J a(long j) {
        X(j);
        n0 n0Var = this.f325B;
        R.e eVarW = n0Var.f478B.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            Y y6 = ((L) objArr[i7]).f269V.f312q;
            kotlin.jvm.internal.m.b(y6);
            y6.f357z = I.f239s;
        }
        L l7 = n0Var.f478B;
        U.p0(this, l7.f260M.c(this, l7.m(), j));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.U
    public final void q0() {
        Y y6 = this.f325B.f478B.f269V.f312q;
        kotlin.jvm.internal.m.b(y6);
        y6.c0();
    }
}
