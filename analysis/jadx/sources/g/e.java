package G;

import B0.AbstractC0041g;
import B0.InterfaceC0059y;
import B0.K;
import B0.n0;
import C.k;
import M5.AbstractC0263y;
import c0.AbstractC0724l;
import i0.C1131c;
import m5.C1386y;
import r5.EnumC1580a;
import s5.i;
import w.C1789j;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0724l implements F0.a, InterfaceC0059y {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1789j f1969E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f1970F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c x0(e eVar, n0 n0Var, K k7) {
        C1131c c1131c;
        if (eVar.f10099D && eVar.f1970F) {
            n0 n0VarT = AbstractC0041g.t(eVar);
            if (!n0Var.B0().f10099D) {
                n0Var = null;
            }
            if (n0Var != null && (c1131c = (C1131c) k7.invoke()) != null) {
                C1131c c1131cI = n0VarT.I(n0Var, false);
                return c1131c.e((((long) Float.floatToRawIntBits(c1131cI.f13523b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1131cI.f13522a)) << 32));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F0.a
    public final Object X(n0 n0Var, K k7, i iVar) {
        Object objG = AbstractC0263y.g(new d(this, n0Var, k7, new k(this, n0Var, k7, 3), null), iVar);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0059y
    public final void j0(InterfaceC1953m interfaceC1953m) {
        this.f1970F = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }
}
