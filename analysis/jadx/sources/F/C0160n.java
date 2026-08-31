package F;

import E.InterfaceC0132o;

/* JADX INFO: renamed from: F.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0160n implements InterfaceC0132o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0151e f1899a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0160n(C0151e c0151e) {
        this.f1899a = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int a() {
        return this.f1899a.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int b() {
        return Math.min(r0.l() - 1, ((C0158l) n5.l.r0(this.f1899a.k().f1760a)).f1888a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final boolean c() {
        return !this.f1899a.k().f1760a.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int d() {
        int i;
        C0151e c0151e = this.f1899a;
        if (c0151e.k().f1760a.size() == 0) {
            return 0;
        }
        int iF = Q2.g.F(c0151e.k());
        int i7 = c0151e.k().f1761b + c0151e.k().f1762c;
        if (i7 != 0 && (i = iF / i7) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int e() {
        return Math.max(0, this.f1899a.f1822e);
    }
}
