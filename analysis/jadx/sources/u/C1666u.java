package u;

import e4.C1055e;
import i3.C1136a;
import t.AbstractC1599H;
import t.AbstractC1603b;
import t.C1598G;

/* JADX INFO: renamed from: u.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1666u implements InterfaceC1652h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E.c0 f17057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.m f17058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1663q f17060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1663q f17061e;
    public final AbstractC1663q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17063h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1666u(C1667v c1667v, Z.m mVar, Object obj, AbstractC1663q abstractC1663q) {
        E.c0 c0Var = new E.c0(c1667v.f17068a);
        this.f17057a = c0Var;
        this.f17058b = mVar;
        this.f17059c = obj;
        AbstractC1663q abstractC1663q2 = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj);
        this.f17060d = abstractC1663q2;
        this.f17061e = AbstractC1644d.j(abstractC1663q);
        this.f17062g = ((B5.c) mVar.f8312r).invoke(c0Var.t(abstractC1663q2, abstractC1663q));
        if (((AbstractC1663q) c0Var.f1554s) == null) {
            c0Var.f1554s = abstractC1663q2.c();
        }
        AbstractC1663q abstractC1663q3 = (AbstractC1663q) c0Var.f1554s;
        if (abstractC1663q3 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB = abstractC1663q3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            C1136a c1136a = (C1136a) c0Var.f1552q;
            abstractC1663q2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((C1055e) c1136a.f13562r).b(abstractC1663q.a(i)) / (((double) AbstractC1599H.f16587a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f17063h = jMax;
        AbstractC1663q abstractC1663qJ = AbstractC1644d.j(this.f17057a.u(jMax, this.f17060d, abstractC1663q));
        this.f = abstractC1663qJ;
        int iB2 = abstractC1663qJ.b();
        for (int i7 = 0; i7 < iB2; i7++) {
            AbstractC1663q abstractC1663q4 = this.f;
            float fA = abstractC1663q4.a(i7);
            this.f17057a.getClass();
            this.f17057a.getClass();
            abstractC1663q4.e(i7, D5.a.p(fA, -0.0f, 0.0f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final boolean a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Object b(long j) {
        if (g(j)) {
            return this.f17062g;
        }
        B5.c cVar = (B5.c) this.f17058b.f8312r;
        E.c0 c0Var = this.f17057a;
        AbstractC1663q abstractC1663q = (AbstractC1663q) c0Var.f1553r;
        AbstractC1663q abstractC1663q2 = this.f17060d;
        if (abstractC1663q == null) {
            c0Var.f1553r = abstractC1663q2.c();
        }
        AbstractC1663q abstractC1663q3 = (AbstractC1663q) c0Var.f1553r;
        if (abstractC1663q3 == null) {
            kotlin.jvm.internal.m.k("valueVector");
            throw null;
        }
        int iB = abstractC1663q3.b();
        for (int i = 0; i < iB; i++) {
            AbstractC1663q abstractC1663q4 = (AbstractC1663q) c0Var.f1553r;
            if (abstractC1663q4 == null) {
                kotlin.jvm.internal.m.k("valueVector");
                throw null;
            }
            C1136a c1136a = (C1136a) c0Var.f1552q;
            float fA = abstractC1663q2.a(i);
            long j7 = j / 1000000;
            C1598G c1598gA = ((C1055e) c1136a.f13562r).a(this.f17061e.a(i));
            long j8 = c1598gA.f16586c;
            abstractC1663q4.e(i, (Math.signum(c1598gA.f16584a) * c1598gA.f16585b * AbstractC1603b.a(j8 > 0 ? j7 / j8 : 1.0f).f16593a) + fA);
        }
        AbstractC1663q abstractC1663q5 = (AbstractC1663q) c0Var.f1553r;
        if (abstractC1663q5 != null) {
            return cVar.invoke(abstractC1663q5);
        }
        kotlin.jvm.internal.m.k("valueVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final long c() {
        return this.f17063h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Z.m d() {
        return this.f17058b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Object e() {
        return this.f17062g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final AbstractC1663q f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.f17057a.u(j, this.f17060d, this.f17061e);
    }
}
