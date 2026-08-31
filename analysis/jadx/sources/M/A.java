package M;

import P.C0345b;
import P.C0363k;
import P.C0368m0;
import P.C0371o;
import P.C0372o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new P.Q(C0215j.f3546w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(C0213i c0213i, C0 c02, O0 o02, X.e eVar, C0371o c0371o, int i) {
        int i7;
        C0 c03;
        c0371o.U(-2127166334);
        if ((i & 6) == 0) {
            i7 = (c0371o.g(c0213i) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= 16;
        }
        if ((i & 384) == 0) {
            i7 |= c0371o.g(o02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= c0371o.i(eVar) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c0371o.x()) {
            c0371o.N();
            c03 = c02;
        } else {
            c0371o.P();
            if ((i & 1) == 0 || c0371o.w()) {
                c03 = (C0) c0371o.k(D0.f3295a);
            } else {
                c0371o.N();
                c03 = c02;
            }
            c0371o.q();
            v.P pA = t0.a(0.0f, c0371o, 0, 7);
            long j = c0213i.f3512a;
            boolean zF = c0371o.f(j);
            Object objH = c0371o.H();
            if (zF || objH == C0363k.f5418a) {
                objH = new K.c(j, j0.o.b(j, 0.4f));
                c0371o.d0(objH);
            }
            C0345b.b(new C0368m0[]{AbstractC0217k.f3553a.a(c0213i), androidx.compose.foundation.c.f9255a.a(pA), L.p.f3051a.a(C0219l.f3563a), D0.f3295a.a(c03), K.d.f2846a.a((K.c) objH), P0.f3376a.a(o02)}, X.k.d(-1066563262, new B0.j0(7, o02, eVar), c0371o), c0371o, 56);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0237z(c0213i, c03, o02, eVar, i, 0);
        }
    }
}
