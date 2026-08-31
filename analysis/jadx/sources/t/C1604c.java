package t;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.S;
import m5.C1386y;
import r.C1548G;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604c extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a0.q f16596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1613l f16598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X.e f16599t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604c(a0.q qVar, Object obj, C1613l c1613l, X.e eVar) {
        super(3);
        this.f16596q = qVar;
        this.f16597r = obj;
        this.f16598s = c1613l;
        this.f16599t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        C0371o c0371o = (C0371o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? c0371o.g(pVar) : c0371o.i(pVar) ? 4 : 2;
        }
        if (c0371o.K(iIntValue & 1, (iIntValue & 19) != 18)) {
            a0.q qVar = this.f16596q;
            boolean zG = c0371o.g(qVar);
            Object obj4 = this.f16597r;
            boolean zI = zG | c0371o.i(obj4);
            C1613l c1613l = this.f16598s;
            boolean zI2 = zI | c0371o.i(c1613l);
            Object objH = c0371o.H();
            S s6 = C0363k.f5418a;
            if (zI2 || objH == s6) {
                objH = new A.J(qVar, obj4, c1613l, 10);
                c0371o.d0(objH);
            }
            C0345b.c(pVar, (B5.c) objH, c0371o);
            C1548G c1548g = c1613l.f16622d;
            kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c1548g.l(obj4, ((q) pVar).f16631a);
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                objH2 = new C1608g();
                c0371o.d0(objH2);
            }
            this.f16599t.invoke((C1608g) objH2, obj4, c0371o, 0);
        } else {
            c0371o.N();
        }
        return C1386y.f15098a;
    }
}
