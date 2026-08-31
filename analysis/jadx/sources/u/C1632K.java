package u;

import P.C0345b;
import P.C0354f0;

/* JADX INFO: renamed from: u.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1632K extends O3.D0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f16805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f16806t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1632K(t.t tVar) {
        this.f16805s = C0345b.q(tVar);
        this.f16806t = C0345b.q(tVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final Object j() {
        return this.f16805s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final Object k() {
        return this.f16806t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final void l(Object obj) {
        this.f16805s.setValue(obj);
    }

    @Override // O3.D0
    public final void n() {
    }

    @Override // O3.D0
    public final void m(v0 v0Var) {
    }
}
