package a0;

import B0.G0;

/* JADX INFO: renamed from: a0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604f extends AbstractC0606h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.c f8659e;
    public final AbstractC0606h f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0604f(long j, l lVar, B5.c cVar, AbstractC0606h abstractC0606h) {
        super(j, lVar);
        this.f8659e = cVar;
        this.f = abstractC0606h;
        abstractC0606h.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void c() {
        AbstractC0606h abstractC0606h = this.f;
        if (this.f8663c) {
            return;
        }
        if (this.f8662b != abstractC0606h.g()) {
            a();
        }
        abstractC0606h.l();
        this.f8663c = true;
        synchronized (n.f8680b) {
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final B5.c e() {
        return this.f8659e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final boolean f() {
        return true;
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
    public final void n(u uVar) {
        G0 g02 = n.f8679a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final AbstractC0606h u(B5.c cVar) {
        return new C0604f(this.f8662b, this.f8661a, n.l(cVar, this.f8659e, true), this.f);
    }

    @Override // a0.AbstractC0606h
    public final void m() {
    }
}
