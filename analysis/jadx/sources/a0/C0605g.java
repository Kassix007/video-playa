package a0;

import B0.G0;

/* JADX INFO: renamed from: a0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605g extends AbstractC0606h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.c f8660e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0605g(long j, l lVar, B5.c cVar) {
        super(j, lVar);
        this.f8660e = cVar;
        this.f = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void c() {
        if (this.f8663c) {
            return;
        }
        l();
        this.f8663c = true;
        synchronized (n.f8680b) {
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final B5.c e() {
        return this.f8660e;
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
        this.f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
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
        n.d(this);
        return new C0604f(this.f8662b, this.f8661a, n.l(cVar, this.f8660e, true), this);
    }

    @Override // a0.AbstractC0606h
    public final void m() {
    }
}
