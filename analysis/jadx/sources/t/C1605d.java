package t;

import A.b0;
import A.e0;
import P.C0354f0;
import P.C0363k;
import P.C0371o;
import P.S;
import c0.InterfaceC0725m;
import m0.C1346a;
import m5.C1386y;
import u.q0;
import u.v0;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1605d extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v0 f16600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.c f16602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1613l f16603t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0.q f16604u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X.e f16605v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605d(v0 v0Var, Object obj, B5.c cVar, C1613l c1613l, a0.q qVar, X.e eVar) {
        super(2);
        this.f16600q = v0Var;
        this.f16601r = obj;
        this.f16602s = cVar;
        this.f16603t = c1613l;
        this.f16604u = qVar;
        this.f16605v = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objH = c0371o.H();
            B5.c cVar = this.f16602s;
            C1613l c1613l = this.f16603t;
            S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = (s) cVar.invoke(c1613l);
                c0371o.d0(objH);
            }
            s sVar = (s) objH;
            v0 v0Var = this.f16600q;
            q0 q0VarF = v0Var.f();
            C0354f0 c0354f0 = v0Var.f17072d;
            Object objC = q0VarF.c();
            Object obj3 = this.f16601r;
            boolean zH = c0371o.h(kotlin.jvm.internal.m.a(objC, obj3));
            Object objH2 = c0371o.H();
            if (zH || objH2 == s6) {
                objH2 = kotlin.jvm.internal.m.a(v0Var.f().c(), obj3) ? C1596E.f16580b : ((s) cVar.invoke(c1613l)).f16634b;
                c0371o.d0(objH2);
            }
            C1596E c1596e = (C1596E) objH2;
            Object objH3 = c0371o.H();
            if (objH3 == s6) {
                objH3 = new C1609h(kotlin.jvm.internal.m.a(obj3, c0354f0.getValue()));
                c0371o.d0(objH3);
            }
            C1609h c1609h = (C1609h) objH3;
            C1595D c1595d = sVar.f16633a;
            boolean zI = c0371o.i(sVar);
            Object objH4 = c0371o.H();
            if (zI || objH4 == s6) {
                objH4 = new b0(2, sVar);
                c0371o.d0(objH4);
            }
            InterfaceC0725m interfaceC0725mA = androidx.compose.ui.layout.a.a((B5.f) objH4);
            c1609h.f16608q.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a(obj3, c0354f0.getValue())));
            InterfaceC0725m interfaceC0725mD = interfaceC0725mA.d(c1609h);
            boolean zI2 = c0371o.i(obj3);
            Object objH5 = c0371o.H();
            if (zI2 || objH5 == s6) {
                objH5 = new C1346a(4, obj3);
                c0371o.d0(objH5);
            }
            B5.c cVar2 = (B5.c) objH5;
            boolean zG = c0371o.g(c1596e);
            Object objH6 = c0371o.H();
            if (zG || objH6 == s6) {
                objH6 = new e0(15, c1596e);
                c0371o.d0(objH6);
            }
            androidx.compose.animation.b.a(this.f16600q, cVar2, interfaceC0725mD, c1595d, c1596e, (B5.e) objH6, X.k.d(-616195562, new C1604c(this.f16604u, obj3, c1613l, this.f16605v), c0371o), c0371o, 12582912);
        } else {
            c0371o.N();
        }
        return C1386y.f15098a;
    }
}
