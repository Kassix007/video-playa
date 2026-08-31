package u;

import P.C0345b;
import P.C0346b0;
import P.C0350d0;
import P.C0354f0;
import P.S0;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements S0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1663q f17035A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0350d0 f17036B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17037C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1649f0 f17038D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ v0 f17039E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z.m f17040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0354f0 f17041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f17042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f17043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S f17044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n0 f17045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0354f0 f17046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0346b0 f17047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0354f0 f17049z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s0(v0 v0Var, Object obj, AbstractC1663q abstractC1663q, Z.m mVar) {
        this.f17039E = v0Var;
        this.f17040q = mVar;
        C0354f0 c0354f0Q = C0345b.q(obj);
        this.f17041r = c0354f0Q;
        Object objInvoke = null;
        C0354f0 c0354f0Q2 = C0345b.q(AbstractC1644d.o(7, null));
        this.f17042s = c0354f0Q2;
        this.f17043t = C0345b.q(new n0((InterfaceC1671z) c0354f0Q2.getValue(), mVar, obj, c0354f0Q.getValue(), abstractC1663q));
        this.f17046w = C0345b.q(Boolean.TRUE);
        this.f17047x = new C0346b0(-1.0f);
        this.f17049z = C0345b.q(obj);
        this.f17035A = abstractC1663q;
        this.f17036B = new C0350d0(b().c());
        Float f = (Float) I0.f16803a.get(mVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC1663q abstractC1663q2 = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj);
            int iB = abstractC1663q2.b();
            for (int i = 0; i < iB; i++) {
                abstractC1663q2.e(i, fFloatValue);
            }
            objInvoke = ((B5.c) this.f17040q.f8312r).invoke(abstractC1663q2);
        }
        this.f17038D = AbstractC1644d.o(3, objInvoke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n0 b() {
        return (n0) this.f17043t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(long j) {
        if (this.f17047x.e() == -1.0f) {
            this.f17037C = true;
            if (kotlin.jvm.internal.m.a(b().f16999c, b().f17000d)) {
                d(b().f16999c);
            } else {
                d(b().b(j));
                this.f17035A = b().f(j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Object obj) {
        this.f17049z.setValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Object obj, boolean z5) {
        n0 n0Var = this.f17045v;
        Object obj2 = n0Var != null ? n0Var.f16999c : null;
        C0354f0 c0354f0 = this.f17041r;
        boolean zA = kotlin.jvm.internal.m.a(obj2, c0354f0.getValue());
        C0350d0 c0350d0 = this.f17036B;
        C0354f0 c0354f02 = this.f17043t;
        InterfaceC1671z interfaceC1671z = this.f17038D;
        if (zA) {
            c0354f02.setValue(new n0(interfaceC1671z, this.f17040q, obj, obj, this.f17035A.c()));
            this.f17048y = true;
            c0350d0.e(b().c());
            return;
        }
        C0354f0 c0354f03 = this.f17042s;
        if (!z5 || this.f17037C || (((InterfaceC1671z) c0354f03.getValue()) instanceof C1649f0)) {
            interfaceC1671z = (InterfaceC1671z) c0354f03.getValue();
        }
        v0 v0Var = this.f17039E;
        long jE = v0Var.e();
        C0354f0 c0354f04 = v0Var.f17075h;
        c0354f02.setValue(new n0(jE <= 0 ? interfaceC1671z : new C1651g0(interfaceC1671z, v0Var.e()), this.f17040q, obj, c0354f0.getValue(), this.f17035A));
        c0350d0.e(b().c());
        this.f17048y = false;
        c0354f04.setValue(Boolean.TRUE);
        if (v0Var.g()) {
            a0.q qVar = v0Var.i;
            int size = qVar.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                s0 s0Var = (s0) qVar.get(i);
                C0350d0 c0350d02 = s0Var.f17036B;
                jMax = Math.max(jMax, ((P.G0) a0.n.t(c0350d02.f5392r, c0350d02)).f5312c);
                s0Var.c(0L);
            }
            c0354f04.setValue(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Object obj, Object obj2, InterfaceC1671z interfaceC1671z) {
        this.f17041r.setValue(obj2);
        this.f17042s.setValue(interfaceC1671z);
        if (kotlin.jvm.internal.m.a(b().f17000d, obj) && kotlin.jvm.internal.m.a(b().f16999c, obj2)) {
            return;
        }
        e(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return this.f17049z.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "current value: " + this.f17049z.getValue() + ", target: " + this.f17041r.getValue() + ", spec: " + ((InterfaceC1671z) this.f17042s.getValue());
    }
}
