package w;

import B0.AbstractC0041g;
import B0.InterfaceC0047l;
import B0.InterfaceC0059y;
import E.C0128k;
import M5.AbstractC0263y;
import M5.EnumC0262x;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import i0.C1131c;
import z.AbstractC1923a;
import z0.InterfaceC1953m;

/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1789j extends AbstractC0724l implements InterfaceC0059y, InterfaceC0047l {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EnumC1778d0 f17997E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final H0 f17998F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f17999G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC1775c f18000H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC1953m f18002J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f18003K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f18004L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f18006N;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0128k f18001I = new C0128k(1);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f18005M = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1789j(EnumC1778d0 enumC1778d0, H0 h02, boolean z5, InterfaceC1775c interfaceC1775c) {
        this.f17997E = enumC1778d0;
        this.f17998F = h02;
        this.f17999G = z5;
        this.f18000H = interfaceC1775c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float x0(C1789j c1789j, InterfaceC1775c interfaceC1775c) {
        C1131c c1131c;
        int iCompare;
        if (W0.k.a(c1789j.f18005M, 0L)) {
            return 0.0f;
        }
        R.e eVar = c1789j.f18001I.f1572a;
        int i = eVar.f6678s - 1;
        Object[] objArr = eVar.f6676q;
        if (i < objArr.length) {
            c1131c = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                C1131c c1131c2 = (C1131c) ((C1783g) objArr[i]).f17969a.invoke();
                if (c1131c2 != null) {
                    long jB = c1131c2.b();
                    long jD0 = P1.d0(c1789j.f18005M);
                    int iOrdinal = c1789j.f17997E.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jD0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new C2.e();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jD0 >> 32)));
                    }
                    if (iCompare <= 0) {
                        c1131c = c1131c2;
                    } else if (c1131c == null) {
                        c1131c = c1131c2;
                    }
                }
                i--;
            }
        } else {
            c1131c = null;
        }
        if (c1131c == null) {
            C1131c c1131cY0 = c1789j.f18003K ? c1789j.y0() : null;
            if (c1131cY0 == null) {
                return 0.0f;
            }
            c1131c = c1131cY0;
        }
        long jD02 = P1.d0(c1789j.f18005M);
        int iOrdinal2 = c1789j.f17997E.ordinal();
        if (iOrdinal2 == 0) {
            float f = c1131c.f13523b;
            return interfaceC1775c.a(f, c1131c.f13525d - f, Float.intBitsToFloat((int) (jD02 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new C2.e();
        }
        float f7 = c1131c.f13522a;
        return interfaceC1775c.a(f7, c1131c.f13524c - f7, Float.intBitsToFloat((int) (jD02 >> 32)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0() {
        InterfaceC1775c interfaceC1775c = this.f18000H;
        if (interfaceC1775c == null) {
            interfaceC1775c = (InterfaceC1775c) AbstractC0041g.i(this, AbstractC1781f.f17959a);
        }
        if (this.f18006N) {
            AbstractC1923a.c("launchAnimation called when previous animation was running");
        }
        InterfaceC1775c.f17931a.getClass();
        j1 j1Var = new j1(C1773b.f17919b);
        AbstractC0263y.t(l0(), null, EnumC0262x.f3898t, new C1787i(this, j1Var, interfaceC1775c, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long B0(C1131c c1131c, long j) {
        long jFloatToRawIntBits;
        long j7;
        long jD0 = P1.d0(j);
        int iOrdinal = this.f17997E.ordinal();
        if (iOrdinal == 0) {
            InterfaceC1775c interfaceC1775c = this.f18000H;
            if (interfaceC1775c == null) {
                interfaceC1775c = (InterfaceC1775c) AbstractC0041g.i(this, AbstractC1781f.f17959a);
            }
            float f = c1131c.f13523b;
            float fA = interfaceC1775c.a(f, c1131c.f13525d - f, Float.intBitsToFloat((int) (jD0 & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j7 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new C2.e();
            }
            InterfaceC1775c interfaceC1775c2 = this.f18000H;
            if (interfaceC1775c2 == null) {
                interfaceC1775c2 = (InterfaceC1775c) AbstractC0041g.i(this, AbstractC1781f.f17959a);
            }
            float f7 = c1131c.f13522a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(interfaceC1775c2.a(f7, c1131c.f13524c - f7, Float.intBitsToFloat((int) (jD0 >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j7 = jFloatToRawIntBits3 << 32;
        }
        return j7 | (jFloatToRawIntBits & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0059y
    public final void q(long j) {
        int iF;
        C1131c c1131cY0;
        long j7 = this.f18005M;
        this.f18005M = j;
        int iOrdinal = this.f17997E.ordinal();
        if (iOrdinal == 0) {
            iF = kotlin.jvm.internal.m.f((int) (j & 4294967295L), (int) (4294967295L & j7));
        } else {
            if (iOrdinal != 1) {
                throw new C2.e();
            }
            iF = kotlin.jvm.internal.m.f((int) (j >> 32), (int) (j7 >> 32));
        }
        if (iF >= 0 || this.f18006N || this.f18003K || (c1131cY0 = y0()) == null || !z0(c1131cY0, j7)) {
            return;
        }
        this.f18004L = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c y0() {
        if (this.f10099D) {
            B0.n0 n0VarT = AbstractC0041g.t(this);
            InterfaceC1953m interfaceC1953m = this.f18002J;
            if (interfaceC1953m != null) {
                if (!interfaceC1953m.C()) {
                    interfaceC1953m = null;
                }
                if (interfaceC1953m != null) {
                    return n0VarT.I(interfaceC1953m, false);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z0(C1131c c1131c, long j) {
        long jB0 = B0(c1131c, j);
        return Math.abs(Float.intBitsToFloat((int) (jB0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jB0 & 4294967295L))) <= 0.5f;
    }
}
