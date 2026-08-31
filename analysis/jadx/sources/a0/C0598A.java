package a0;

import B0.G0;

/* JADX INFO: renamed from: a0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0598A extends AbstractC0606h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0606h f8641e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B5.c f8642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8643h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598A(AbstractC0606h abstractC0606h, B5.c cVar, boolean z5) {
        B5.c cVarE;
        super(0L, l.f8672u);
        G0 g02 = n.f8679a;
        this.f8641e = abstractC0606h;
        this.f = z5;
        this.f8642g = n.l(cVar, (abstractC0606h == null || (cVarE = abstractC0606h.e()) == null) ? n.i.f8651e : cVarE, false);
        this.f8643h = X.k.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void c() {
        AbstractC0606h abstractC0606h;
        this.f8663c = true;
        if (!this.f || (abstractC0606h = this.f8641e) == null) {
            return;
        }
        abstractC0606h.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final l d() {
        return v().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final B5.c e() {
        return this.f8642g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final boolean f() {
        return v().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final long g() {
        return v().g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final B5.c i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void k() {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void l() {
        r.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void m() {
        v().m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void n(u uVar) {
        v().n(uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final AbstractC0606h u(B5.c cVar) {
        return n.h(v().u(null), n.l(cVar, this.f8642g, true), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0606h v() {
        AbstractC0606h abstractC0606h = this.f8641e;
        return abstractC0606h == null ? n.i : abstractC0606h;
    }
}
