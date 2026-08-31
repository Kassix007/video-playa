package u;

import P.C0345b;
import P.C0354f0;
import m5.C1386y;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1642c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.m f16877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1658l f16879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f16880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0354f0 f16881e;
    public final C1636O f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1649f0 f16882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1663q f16883h;
    public final AbstractC1663q i;
    public final AbstractC1663q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC1663q f16884k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1642c(Object obj, Z.m mVar, Object obj2) {
        this.f16877a = mVar;
        this.f16878b = obj2;
        C1658l c1658l = new C1658l(mVar, obj, null, 60);
        this.f16879c = c1658l;
        this.f16880d = C0345b.q(Boolean.FALSE);
        this.f16881e = C0345b.q(obj);
        this.f = new C1636O();
        this.f16882g = new C1649f0(1500.0f, obj2);
        AbstractC1663q abstractC1663q = c1658l.f16963s;
        boolean z5 = abstractC1663q instanceof C1659m;
        AbstractC1663q abstractC1663q2 = z5 ? AbstractC1644d.f16894e : abstractC1663q instanceof C1660n ? AbstractC1644d.f : abstractC1663q instanceof C1661o ? AbstractC1644d.f16895g : AbstractC1644d.f16896h;
        this.f16883h = abstractC1663q2;
        AbstractC1663q abstractC1663q3 = z5 ? AbstractC1644d.f16890a : abstractC1663q instanceof C1660n ? AbstractC1644d.f16891b : abstractC1663q instanceof C1661o ? AbstractC1644d.f16892c : AbstractC1644d.f16893d;
        this.i = abstractC1663q3;
        this.j = abstractC1663q2;
        this.f16884k = abstractC1663q3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object a(C1642c c1642c, Object obj) {
        Z.m mVar = c1642c.f16877a;
        AbstractC1663q abstractC1663q = c1642c.f16884k;
        AbstractC1663q abstractC1663q2 = c1642c.j;
        if (!kotlin.jvm.internal.m.a(abstractC1663q2, c1642c.f16883h) || !kotlin.jvm.internal.m.a(abstractC1663q, c1642c.i)) {
            AbstractC1663q abstractC1663q3 = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj);
            int iB = abstractC1663q3.b();
            boolean z5 = false;
            for (int i = 0; i < iB; i++) {
                if (abstractC1663q3.a(i) < abstractC1663q2.a(i) || abstractC1663q3.a(i) > abstractC1663q.a(i)) {
                    abstractC1663q3.e(i, D5.a.p(abstractC1663q3.a(i), abstractC1663q2.a(i), abstractC1663q.a(i)));
                    z5 = true;
                }
            }
            if (z5) {
                return ((B5.c) mVar.f8312r).invoke(abstractC1663q3);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C1642c c1642c) {
        C1658l c1658l = c1642c.f16879c;
        c1658l.f16963s.d();
        c1658l.f16964t = Long.MIN_VALUE;
        c1642c.f16880d.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object c(C1642c c1642c, Object obj, InterfaceC1657k interfaceC1657k, s5.i iVar, int i) {
        if ((i & 2) != 0) {
            interfaceC1657k = c1642c.f16882g;
        }
        InterfaceC1657k interfaceC1657k2 = interfaceC1657k;
        Object objInvoke = ((B5.c) c1642c.f16877a.f8312r).invoke(c1642c.f16879c.f16963s);
        Object objD = c1642c.d();
        Z.m mVar = c1642c.f16877a;
        return C1636O.a(c1642c.f, new C1638a(c1642c, objInvoke, new n0(interfaceC1657k2, mVar, objD, obj, (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(objInvoke)), c1642c.f16879c.f16964t, null), iVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        return this.f16879c.f16962r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(Object obj, s5.i iVar) {
        Object objA = C1636O.a(this.f, new C1640b(this, obj, null), iVar);
        return objA == EnumC1580a.f16356q ? objA : C1386y.f15098a;
    }
}
