package u;

import P.C0346b0;
import P.C0354f0;
import P.S0;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s0 f17007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B5.c f17008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.n f17009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f17010t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(p0 p0Var, s0 s0Var, B5.c cVar, B5.c cVar2) {
        this.f17010t = p0Var;
        this.f17007q = s0Var;
        this.f17008r = cVar;
        this.f17009s = (kotlin.jvm.internal.n) cVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r4v0, types: [B5.c, kotlin.jvm.internal.n] */
    public final void b(q0 q0Var) {
        s0 s0Var = this.f17007q;
        C0354f0 c0354f0 = s0Var.f17046w;
        C0354f0 c0354f02 = s0Var.f17041r;
        C0346b0 c0346b0 = s0Var.f17047x;
        Object objInvoke = this.f17009s.invoke(q0Var.c());
        if (this.f17010t.f17017c.g()) {
            s0Var.f(this.f17009s.invoke(q0Var.a()), objInvoke, (InterfaceC1671z) this.f17008r.invoke(q0Var));
            return;
        }
        InterfaceC1671z interfaceC1671z = (InterfaceC1671z) this.f17008r.invoke(q0Var);
        if (s0Var.f17048y) {
            n0 n0Var = s0Var.f17045v;
            if (kotlin.jvm.internal.m.a(objInvoke, n0Var != null ? n0Var.f16999c : null)) {
                return;
            }
        }
        if (kotlin.jvm.internal.m.a(c0354f02.getValue(), objInvoke) && c0346b0.e() == -1.0f) {
            return;
        }
        c0354f02.setValue(objInvoke);
        s0Var.f17042s.setValue(interfaceC1671z);
        s0Var.e(c0346b0.e() == -3.0f ? objInvoke : s0Var.f17049z.getValue(), !((Boolean) c0354f0.getValue()).booleanValue());
        c0354f0.setValue(Boolean.valueOf(c0346b0.e() == -3.0f));
        if (c0346b0.e() >= 0.0f) {
            s0Var.d(s0Var.b().b((long) (c0346b0.e() * s0Var.b().c())));
        } else if (c0346b0.e() == -3.0f) {
            s0Var.d(objInvoke);
        }
        s0Var.f17048y = false;
        c0346b0.f(-1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        b(this.f17010t.f17017c.f());
        return this.f17007q.f17049z.getValue();
    }
}
