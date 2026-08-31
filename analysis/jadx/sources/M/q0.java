package M;

import C0.AbstractC0103t0;
import C0.Z0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.P1;
import i0.C1133e;
import l0.C1224g;
import l0.InterfaceC1221d;
import n5.AbstractC1397A;
import u.AbstractC1644d;
import u.AbstractC1670y;
import u.C1626E;
import u.C1629H;
import u.C1630I;
import u.C1631J;
import u.C1665t;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0725m f3603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f3604c = 240;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f3605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f3606e;
    public static final C1665t f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f7 = 10;
        f3602a = f7;
        f3603b = androidx.compose.foundation.layout.b.c(I0.j.a(androidx.compose.ui.layout.a.a(C0222m0.f3579q), true, C0203d.f3447u), 0.0f, f7, 1);
        float f8 = O.i.f4173c;
        f3605d = f8;
        f3606e = O.i.f4174d - (f8 * 2);
        new C1665t(0.2f, 0.0f, 0.8f);
        new C1665t(0.4f, 0.0f, 1.0f);
        new C1665t(0.0f, 0.0f, 0.65f);
        new C1665t(0.1f, 0.0f, 0.45f);
        f = new C1665t(0.4f, 0.0f, 0.2f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(InterfaceC0725m interfaceC0725m, long j, float f7, long j7, int i, C0371o c0371o, int i7) {
        C0371o c0371o2;
        InterfaceC0725m interfaceC0725m2;
        int i8;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        c0371o.U(-115871647);
        int i9 = i7 | (c0371o.f(j) ? 32 : 16) | (c0371o.f(j7) ? 2048 : 1024) | (c0371o.e(i) ? 16384 : 8192);
        if ((i9 & 9363) == 9362 && c0371o.x()) {
            c0371o.N();
            interfaceC0725m2 = interfaceC0725m;
            c0371o2 = c0371o;
        } else {
            c0371o.P();
            if ((i7 & 1) != 0 && !c0371o.w()) {
                c0371o.N();
            }
            c0371o.q();
            C1224g c1224g = new C1224g(((W0.c) c0371o.k(AbstractC0103t0.f1116h)).u(f7), 0.0f, i, 0, 26);
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = new C1629H();
                c0371o.d0(objH);
            }
            C1629H c1629h = (C1629H) objH;
            c1629h.a(0, c0371o);
            Z.m mVar = u.A0.f16747b;
            Z0 z02 = AbstractC1670y.f17084b;
            C1626E c1626eI = AbstractC1644d.i(c1629h, 0, 5, mVar, AbstractC1644d.n(AbstractC1644d.p(6660, 2, z02)), c0371o, 33208, 16);
            c0371o2 = c0371o;
            C1626E c1626eF = AbstractC1644d.f(c1629h, 286.0f, AbstractC1644d.n(AbstractC1644d.p(1332, 2, z02)), c0371o2);
            U.l lVar = new U.l(7);
            lVar.f7510q = 1332;
            C1630I c1630iD = lVar.d(fValueOf2, 0);
            C1665t c1665t = f;
            c1630iD.f16802b = c1665t;
            lVar.d(fValueOf, 666);
            C1626E c1626eF2 = AbstractC1644d.f(c1629h, 290.0f, AbstractC1644d.n(new C1631J(lVar)), c0371o2);
            U.l lVar2 = new U.l(7);
            lVar2.f7510q = 1332;
            lVar2.d(fValueOf2, 666).f16802b = c1665t;
            lVar2.d(fValueOf, lVar2.f7510q);
            C1626E c1626eF3 = AbstractC1644d.f(c1629h, 290.0f, AbstractC1644d.n(new C1631J(lVar2)), c0371o2);
            interfaceC0725m2 = interfaceC0725m;
            InterfaceC0725m interfaceC0725mC = androidx.compose.foundation.layout.c.c(I0.j.a(interfaceC0725m2, true, v.r.f17380u), f3606e);
            boolean zI = ((((i9 & 7168) ^ 3072) > 2048 && c0371o2.f(j7)) || (i9 & 3072) == 2048) | c0371o2.i(c1224g) | c0371o2.g(c1626eI) | c0371o2.g(c1626eF2) | c0371o2.g(c1626eF3) | c0371o2.g(c1626eF) | ((((i9 & 112) ^ 48) > 32 && c0371o2.f(j)) || (i9 & 48) == 32);
            Object objH2 = c0371o2.H();
            if (zI || objH2 == s6) {
                i8 = 0;
                C0218k0 c0218k0 = new C0218k0(j7, c1224g, c1626eI, c1626eF2, c1626eF3, c1626eF, f7, j);
                c0371o2.d0(c0218k0);
                objH2 = c0218k0;
            } else {
                i8 = 0;
            }
            AbstractC1397A.b(interfaceC0725mC, (B5.c) objH2, c0371o2, i8);
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0220l0(interfaceC0725m2, j, f7, j7, i, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(B5.a aVar, InterfaceC0725m interfaceC0725m, long j, long j7, int i, float f7, B5.c cVar, C0371o c0371o, int i7) {
        float f8;
        B5.c cVar2;
        int i8;
        InterfaceC0725m interfaceC0725m2;
        float f9;
        B5.c cVar3;
        c0371o.U(-339970038);
        int i9 = i7 | (c0371o.i(aVar) ? 4 : 2) | (c0371o.f(j) ? 256 : 128) | (c0371o.f(j7) ? 2048 : 1024) | (c0371o.e(i) ? 16384 : 8192) | 720896;
        if ((599187 & i9) == 599186 && c0371o.x()) {
            c0371o.N();
            interfaceC0725m2 = interfaceC0725m;
            f9 = f7;
            cVar3 = cVar;
        } else {
            c0371o.P();
            int i10 = i7 & 1;
            Object obj = C0363k.f5418a;
            if (i10 == 0 || c0371o.w()) {
                f8 = AbstractC0216j0.f3552b;
                boolean z5 = ((i9 & 57344) == 16384) | ((((i9 & 896) ^ 384) > 256 && c0371o.f(j)) || (i9 & 384) == 256);
                Object objH = c0371o.H();
                if (z5 || objH == obj) {
                    objH = new C0224n0(j, i);
                    c0371o.d0(objH);
                }
                cVar2 = (B5.c) objH;
                i8 = i9 & (-3670017);
            } else {
                c0371o.N();
                i8 = i9 & (-3670017);
                f8 = f7;
                cVar2 = cVar;
            }
            c0371o.q();
            boolean z6 = (i8 & 14) == 4;
            Object objH2 = c0371o.H();
            if (z6 || objH2 == obj) {
                objH2 = new F.Q(aVar, 3);
                c0371o.d0(objH2);
            }
            B5.a aVar2 = (B5.a) objH2;
            interfaceC0725m2 = interfaceC0725m;
            InterfaceC0725m interfaceC0725mD = interfaceC0725m2.d(f3603b);
            boolean zG = c0371o.g(aVar2);
            Object objH3 = c0371o.H();
            if (zG || objH3 == obj) {
                objH3 = new Q(aVar2, 2);
                c0371o.d0(objH3);
            }
            InterfaceC0725m interfaceC0725mD2 = androidx.compose.foundation.layout.c.d(I0.j.a(interfaceC0725mD, true, (B5.c) objH3), f3604c, f3605d);
            boolean zG2 = ((((i8 & 7168) ^ 3072) > 2048 && c0371o.f(j7)) || (i8 & 3072) == 2048) | ((i8 & 57344) == 16384) | c0371o.g(aVar2) | ((((i8 & 896) ^ 384) > 256 && c0371o.f(j)) || (i8 & 384) == 256) | c0371o.g(cVar2);
            Object objH4 = c0371o.H();
            if (zG2 || objH4 == obj) {
                objH4 = new C0226o0(i, f8, aVar2, j7, j, cVar2);
                c0371o.d0(objH4);
            }
            AbstractC1397A.b(interfaceC0725mD2, (B5.c) objH4, c0371o, 0);
            f9 = f8;
            cVar3 = cVar2;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0228p0(aVar, interfaceC0725m2, j, j7, i, f9, cVar3, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(InterfaceC1221d interfaceC1221d, float f7, float f8, long j, float f9, int i) {
        float fD = C1133e.d(interfaceC1221d.d());
        float fB = C1133e.b(interfaceC1221d.d());
        float f10 = 2;
        float f11 = fB / f10;
        boolean z5 = interfaceC1221d.getLayoutDirection() == W0.l.f8022q;
        float f12 = (z5 ? f7 : 1.0f - f8) * fD;
        float f13 = (z5 ? f8 : 1.0f - f7) * fD;
        if (i == 0 || fB > fD) {
            interfaceC1221d.L(j, P1.b(f12, f11), P1.b(f13, f11), f9, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f14 = f9 / f10;
        G5.a aVar = new G5.a(f14, fD - f14);
        float fFloatValue = ((Number) D5.a.s(Float.valueOf(f12), aVar)).floatValue();
        float fFloatValue2 = ((Number) D5.a.s(Float.valueOf(f13), aVar)).floatValue();
        if (Math.abs(f8 - f7) > 0.0f) {
            interfaceC1221d.L(j, P1.b(fFloatValue, f11), P1.b(fFloatValue2, f11), f9, (480 & 16) != 0 ? 0 : i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(InterfaceC1221d interfaceC1221d, float f7, float f8, long j, C1224g c1224g) {
        float f9 = 2;
        float f10 = c1224g.f14431b / f9;
        float fD = C1133e.d(interfaceC1221d.d()) - (f9 * f10);
        interfaceC1221d.v(j, f7, f8, P1.b(f10, f10), AbstractC1397A.g(fD, fD), c1224g);
    }
}
