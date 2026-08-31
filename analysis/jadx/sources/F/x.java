package F;

import A.C0014k;
import E.InterfaceC0140x;
import E.Y;
import P.C0371o;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0140x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0151e f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E.C f1930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f1931c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(C0151e c0151e, w wVar, Y y6) {
        this.f1929a = c0151e;
        this.f1930b = wVar;
        this.f1931c = y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int a() {
        return this.f1930b.k().f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final Object b(int i) {
        Object objH = this.f1931c.h(i);
        return objH == null ? this.f1930b.l(i) : objH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int d(Object obj) {
        return this.f1931c.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final void e(int i, C0371o c0371o, Object obj) {
        c0371o.S(-1201380429);
        E.C.b(obj, i, this.f1929a.f1811A, X.k.d(1142237095, new C0014k(i, 3, this), c0371o), c0371o, 3072);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f1930b, ((x) obj).f1930b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1930b.hashCode();
    }
}
