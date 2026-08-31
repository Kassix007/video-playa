package u;

import P.C0345b;
import P.C0354f0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.m f17015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0354f0 f17016b = C0345b.q(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f17017c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p0(v0 v0Var, Z.m mVar, String str) {
        this.f17017c = v0Var;
        this.f17015a = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public final o0 a(B5.c cVar, B5.c cVar2) {
        C0354f0 c0354f0 = this.f17016b;
        o0 o0Var = (o0) c0354f0.getValue();
        v0 v0Var = this.f17017c;
        if (o0Var == null) {
            Object objInvoke = cVar2.invoke(v0Var.f17069a.j());
            Object objInvoke2 = cVar2.invoke(v0Var.f17069a.j());
            Z.m mVar = this.f17015a;
            AbstractC1663q abstractC1663q = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(objInvoke2);
            abstractC1663q.d();
            s0 s0Var = new s0(v0Var, objInvoke, abstractC1663q, mVar);
            o0Var = new o0(this, s0Var, cVar, cVar2);
            c0354f0.setValue(o0Var);
            v0Var.i.add(s0Var);
        }
        o0Var.f17009s = (kotlin.jvm.internal.n) cVar2;
        o0Var.f17008r = cVar;
        o0Var.b(v0Var.f());
        return o0Var;
    }
}
