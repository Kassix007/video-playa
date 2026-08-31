package a0;

import B0.C0029a;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0601c extends C0602d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final C0602d C(B5.c cVar, B5.c cVar2) {
        return (C0602d) ((AbstractC0606h) n.f(new m(new C0600b(cVar, cVar2, 0), 0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void c() {
        synchronized (n.f8680b) {
            o();
        }
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
        n.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final AbstractC0606h u(B5.c cVar) {
        return (C0605g) ((AbstractC0606h) n.f(new m(new C0029a(24, cVar), 0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
