package z0;

import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import B0.j0;
import B0.n0;
import P.C0345b;
import P.C0363k;
import P.C0367m;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import c0.AbstractC0727o;
import c0.C0722j;
import c0.InterfaceC0725m;
import i0.C1131c;

/* JADX INFO: renamed from: z0.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1938O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1929F f18676a = new C1929F(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(InterfaceC0725m interfaceC0725m, B5.e eVar, C0371o c0371o, int i) {
        c0371o.U(-1298353104);
        int i7 = i | 6 | (c0371o.i(eVar) ? 32 : 16);
        if (c0371o.K(i7 & 1, (i7 & 19) != 18)) {
            Object objH = c0371o.H();
            if (objH == C0363k.f5418a) {
                objH = new S(C1929F.f18659r);
                c0371o.d0(objH);
            }
            C0722j c0722j = C0722j.f10095q;
            b((S) objH, c0722j, eVar, c0371o, (i7 << 3) & 1008);
            interfaceC0725m = c0722j;
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new j0(i, 15, interfaceC0725m, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(S s6, InterfaceC0725m interfaceC0725m, B5.e eVar, C0371o c0371o, int i) {
        int i7;
        c0371o.U(-511989831);
        if ((i & 6) == 0) {
            i7 = (c0371o.i(s6) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= c0371o.i(eVar) ? 256 : 128;
        }
        if (c0371o.K(i7 & 1, (i7 & 147) != 146)) {
            int i8 = c0371o.f5454P;
            C0367m c0367mS = C0345b.s(c0371o);
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725m);
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(B0.D.f220q);
            } else {
                c0371o.g0();
            }
            C0345b.u(s6.f18681c, c0371o, s6);
            C0345b.u(s6.f18682d, c0371o, c0367mS);
            C0345b.u(s6.f18683e, c0371o, eVar);
            InterfaceC0046k.f452a.getClass();
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o, i8, c0044i);
            }
            c0371o.p(true);
            if (c0371o.x()) {
                c0371o.S(-26267397);
                c0371o.p(false);
            } else {
                c0371o.S(-26326018);
                boolean zI = c0371o.i(s6);
                Object objH = c0371o.H();
                if (zI || objH == C0363k.f5418a) {
                    objH = new v.F(3, s6);
                    c0371o.d0(objH);
                }
                C0345b.g((B5.a) objH, c0371o);
                c0371o.p(false);
            }
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new X.d(s6, interfaceC0725m, eVar, i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c(long j, long j7) {
        return Math.min(Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c d(InterfaceC1953m interfaceC1953m) {
        InterfaceC1953m interfaceC1953mH = interfaceC1953m.h();
        return interfaceC1953mH != null ? interfaceC1953mH.I(interfaceC1953m, true) : new C1131c(0.0f, 0.0f, (int) (interfaceC1953m.E() >> 32), (int) (interfaceC1953m.E() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c e(n0 n0Var) {
        InterfaceC1953m interfaceC1953mF = f(n0Var);
        float fE = (int) (interfaceC1953mF.E() >> 32);
        float fE2 = (int) (interfaceC1953mF.E() & 4294967295L);
        C1131c c1131cI = interfaceC1953mF.I(n0Var, true);
        float f = c1131cI.f13522a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fE) {
            f = fE;
        }
        float f7 = c1131cI.f13523b;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > fE2) {
            f7 = fE2;
        }
        float f8 = c1131cI.f13524c;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 <= fE) {
            fE = f8;
        }
        float f9 = c1131cI.f13525d;
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        if (f10 <= fE2) {
            fE2 = f10;
        }
        if (f == fE || f7 == fE2) {
            return C1131c.f13521e;
        }
        long jE = interfaceC1953mF.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
        long jE2 = interfaceC1953mF.e((((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE)) << 32));
        long jE3 = interfaceC1953mF.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L));
        long jE4 = interfaceC1953mF.e((((long) Float.floatToRawIntBits(fE2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new C1131c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC1953m f(InterfaceC1953m interfaceC1953m) {
        InterfaceC1953m interfaceC1953m2;
        InterfaceC1953m interfaceC1953mH = interfaceC1953m.h();
        while (true) {
            InterfaceC1953m interfaceC1953m3 = interfaceC1953mH;
            interfaceC1953m2 = interfaceC1953m;
            interfaceC1953m = interfaceC1953m3;
            if (interfaceC1953m == null) {
                break;
            }
            interfaceC1953mH = interfaceC1953m.h();
        }
        n0 n0Var = interfaceC1953m2 instanceof n0 ? (n0) interfaceC1953m2 : null;
        if (n0Var == null) {
            return interfaceC1953m2;
        }
        n0 n0Var2 = n0Var.f480D;
        while (true) {
            n0 n0Var3 = n0Var2;
            n0 n0Var4 = n0Var;
            n0Var = n0Var3;
            if (n0Var == null) {
                return n0Var4;
            }
            n0Var2 = n0Var.f480D;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B0.U g(B0.U u6) {
        B0.L l7 = u6.f325B.f478B;
        while (true) {
            B0.L lS = l7.s();
            B0.L l8 = null;
            if ((lS != null ? lS.f286x : null) == null) {
                B0.U uZ0 = l7.f268U.f431c.z0();
                kotlin.jvm.internal.m.b(uZ0);
                return uZ0;
            }
            B0.L lS2 = l7.s();
            if (lS2 != null) {
                l8 = lS2.f286x;
            }
            kotlin.jvm.internal.m.b(l8);
            B0.L lS3 = l7.s();
            kotlin.jvm.internal.m.b(lS3);
            l7 = lS3.f286x;
            kotlin.jvm.internal.m.b(l7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long h(long j, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
