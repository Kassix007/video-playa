package A;

import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import P.C0345b;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0717e;
import c0.InterfaceC0725m;
import r.C1548G;
import z0.AbstractC1932I;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: A.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1548G f122a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1548G f123b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0016m f124c = C0016m.f119b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(InterfaceC0725m interfaceC0725m, C0371o c0371o, int i) {
        int i7;
        c0371o.U(-211209833);
        if ((i & 6) == 0) {
            i7 = (c0371o.g(interfaceC0725m) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            int i8 = c0371o.f5454P;
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725m);
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, f124c);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o, i8, c0044i);
            }
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0014k(i, 0, interfaceC0725m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, InterfaceC1925B interfaceC1925B, W0.l lVar, int i, int i7, C0717e c0717e) {
        C0717e c0717e2;
        Object objG = interfaceC1925B.g();
        C0013j c0013j = objG instanceof C0013j ? (C0013j) objG : null;
        AbstractC1932I.e(abstractC1932I, abstractC1933J, ((c0013j == null || (c0717e2 = c0013j.f111E) == null) ? c0717e : c0717e2).a((((long) abstractC1933J.f18664q) << 32) | (((long) abstractC1933J.f18665r) & 4294967295L), (((long) i) << 32) | (((long) i7) & 4294967295L), lVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1548G c(boolean z5) {
        C1548G c1548g = new C1548G(9);
        C0717e c0717e = C0714b.f10076q;
        c1548g.l(c0717e, new C0020q(c0717e, z5));
        C0717e c0717e2 = C0714b.f10077r;
        c1548g.l(c0717e2, new C0020q(c0717e2, z5));
        C0717e c0717e3 = C0714b.f10078s;
        c1548g.l(c0717e3, new C0020q(c0717e3, z5));
        C0717e c0717e4 = C0714b.f10079t;
        c1548g.l(c0717e4, new C0020q(c0717e4, z5));
        C0717e c0717e5 = C0714b.f10080u;
        c1548g.l(c0717e5, new C0020q(c0717e5, z5));
        C0717e c0717e6 = C0714b.f10081v;
        c1548g.l(c0717e6, new C0020q(c0717e6, z5));
        C0717e c0717e7 = C0714b.f10082w;
        c1548g.l(c0717e7, new C0020q(c0717e7, z5));
        C0717e c0717e8 = C0714b.f10083x;
        c1548g.l(c0717e8, new C0020q(c0717e8, z5));
        C0717e c0717e9 = C0714b.f10084y;
        c1548g.l(c0717e9, new C0020q(c0717e9, z5));
        return c1548g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC1926C d(C0717e c0717e, boolean z5) {
        InterfaceC1926C interfaceC1926C = (InterfaceC1926C) (z5 ? f122a : f123b).g(c0717e);
        return interfaceC1926C == null ? new C0020q(c0717e, z5) : interfaceC1926C;
    }
}
