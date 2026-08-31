package t;

import A.C0028z;
import B0.T;
import c0.C0714b;
import c0.C0717e;
import u.o0;
import u.p0;
import u.v0;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: t.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1594C extends AbstractC1600I {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public v0 f16572E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1596E f16573F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B5.a f16574G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public u f16575H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f16576I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0717e f16577J;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        if (this.f16572E.f17069a.j() == this.f16572E.f17072d.getValue()) {
            this.f16577J = null;
        } else if (this.f16577J == null) {
            if (this.f16572E.f().b(t.f16637q, t.f16638r)) {
                L l7 = this.f16573F.f16582a;
            } else {
                L l8 = this.f16573F.f16582a;
            }
            this.f16577J = C0714b.f10076q;
        }
        boolean zR = t6.r();
        n5.t tVar = n5.t.f15300q;
        if (zR) {
            AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
            long j7 = (((long) abstractC1933JA.f18664q) << 32) | (((long) abstractC1933JA.f18665r) & 4294967295L);
            this.f16576I = j7;
            return t6.f((int) (j7 >> 32), (int) (4294967295L & j7), tVar, new C0028z(abstractC1933JA, 6));
        }
        if (!((Boolean) this.f16574G.invoke()).booleanValue()) {
            AbstractC1933J abstractC1933JA2 = interfaceC1925B.a(j);
            return t6.f(abstractC1933JA2.f18664q, abstractC1933JA2.f18665r, tVar, new C0028z(abstractC1933JA2, 7));
        }
        u uVar = this.f16575H;
        p0 p0Var = uVar.f16641a;
        p0 p0Var2 = uVar.f16642b;
        v0 v0Var = uVar.f16643c;
        C1595D c1595d = uVar.f16644d;
        C1596E c1596e = uVar.f16645e;
        p0 p0Var3 = uVar.f;
        o0 o0VarA = p0Var != null ? p0Var.a(new w(c1595d, c1596e, 0), new w(c1595d, c1596e, 1)) : null;
        o0 o0VarA2 = p0Var2 != null ? p0Var2.a(new w(c1595d, c1596e, 2), new w(c1595d, c1596e, 3)) : null;
        if (v0Var.f17069a.j() == t.f16637q) {
            L l9 = c1596e.f16582a;
        } else {
            L l10 = c1596e.f16582a;
        }
        A.J j8 = new A.J(o0VarA, o0VarA2, p0Var3 != null ? p0Var3.a(v.f16648t, new A.J(o0Var, c1595d, c1596e, 12)) : null, 11);
        AbstractC1933J abstractC1933JA3 = interfaceC1925B.a(j);
        long j9 = (((long) abstractC1933JA3.f18664q) << 32) | (((long) abstractC1933JA3.f18665r) & 4294967295L);
        long j10 = !W0.k.a(this.f16576I, r.f16632a) ? this.f16576I : j9;
        long jD = W0.b.d(j, j9);
        C0717e c0717e = this.f16577J;
        return t6.f((int) (jD >> 32), (int) (jD & 4294967295L), tVar, new C1592A(abstractC1933JA3, W0.i.c(c0717e != null ? c0717e.a(j10, jD, W0.l.f8022q) : 0L, 0L), 0L, j8, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        this.f16576I = r.f16632a;
    }
}
