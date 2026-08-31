package u;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import m5.AbstractC1362a;
import m5.EnumC1370i;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f17085a = AbstractC1362a.c(EnumC1370i.f15078r, w0.f17078q);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [B5.c, kotlin.jvm.internal.n] */
    public static final p0 a(v0 v0Var, Z.m mVar, String str, C0371o c0371o, int i, int i7) {
        o0 o0Var;
        if ((i7 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zG = c0371o.g(v0Var);
        Object objH = c0371o.H();
        Object obj = C0363k.f5418a;
        if (zG || objH == obj) {
            objH = new p0(v0Var, mVar, str);
            c0371o.d0(objH);
        }
        p0 p0Var = (p0) objH;
        boolean zG2 = c0371o.g(v0Var) | c0371o.i(p0Var);
        Object objH2 = c0371o.H();
        if (zG2 || objH2 == obj) {
            objH2 = new A.Y(28, v0Var, p0Var);
            c0371o.d0(objH2);
        }
        C0345b.c(p0Var, (B5.c) objH2, c0371o);
        if (v0Var.g() && (o0Var = (o0) p0Var.f17016b.getValue()) != null) {
            v0 v0Var2 = p0Var.f17017c;
            o0Var.f17007q.f(o0Var.f17009s.invoke(v0Var2.f().a()), o0Var.f17009s.invoke(v0Var2.f().c()), (InterfaceC1671z) o0Var.f17008r.invoke(v0Var2.f()));
        }
        return p0Var;
    }
}
