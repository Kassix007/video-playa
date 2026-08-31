package a0;

import B0.G0;
import r.C1549H;

/* JADX INFO: loaded from: classes.dex */
public final class z extends C0602d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0602d f8717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f8719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B5.c f8720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B5.c f8721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8722t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public z(C0602d c0602d, B5.c cVar, B5.c cVar2, boolean z5, boolean z6) {
        B5.c cVarI;
        B5.c cVarE;
        G0 g02 = n.f8679a;
        super(0L, l.f8672u, n.l(cVar, (c0602d == null || (cVarE = c0602d.e()) == null) ? n.i.f8651e : cVarE, z5), n.b(cVar2, (c0602d == null || (cVarI = c0602d.i()) == null) ? n.i.f : cVarI));
        this.f8717o = c0602d;
        this.f8718p = z5;
        this.f8719q = z6;
        this.f8720r = this.f8651e;
        this.f8721s = this.f;
        this.f8722t = X.k.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final void B(C1549H c1549h) {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final C0602d C(B5.c cVar, B5.c cVar2) {
        B5.c cVarL = n.l(cVar, this.f8720r, true);
        B5.c cVarB = n.b(cVar2, this.f8721s);
        return !this.f8718p ? new z(D().C(null, cVarB), cVarL, cVarB, false, true) : D().C(cVarL, cVarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0602d D() {
        C0602d c0602d = this.f8717o;
        return c0602d == null ? n.i : c0602d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void c() {
        C0602d c0602d;
        this.f8663c = true;
        if (!this.f8719q || (c0602d = this.f8717o) == null) {
            return;
        }
        c0602d.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final l d() {
        return D().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final B5.c e() {
        return this.f8720r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final boolean f() {
        return D().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final long g() {
        return D().g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final int h() {
        return D().h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final B5.c i() {
        return this.f8721s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void k() {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void l() {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void m() {
        D().m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void n(u uVar) {
        D().n(uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void r(l lVar) {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void s(long j) {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void t(int i) {
        D().t(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final AbstractC0606h u(B5.c cVar) {
        B5.c cVarL = n.l(cVar, this.f8720r, true);
        return !this.f8718p ? n.h(D().u(null), cVarL, true) : D().u(cVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final r w() {
        return D().w();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final C1549H x() {
        return D().x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    /* JADX INFO: renamed from: y */
    public final B5.c e() {
        return this.f8720r;
    }
}
