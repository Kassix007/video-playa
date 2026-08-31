package C;

import A.C0014k;
import E.InterfaceC0140x;
import E.Y;
import P.C0371o;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0140x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0063c f605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y f606d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(A a7, g gVar, C0063c c0063c, Y y6) {
        this.f603a = a7;
        this.f604b = gVar;
        this.f605c = c0063c;
        this.f606d = y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int a() {
        return this.f604b.k().f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final Object b(int i) {
        Object objH = this.f606d.h(i);
        return objH == null ? this.f604b.l(i) : objH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final Object c(int i) {
        return this.f604b.j(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int d(Object obj) {
        return this.f606d.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final void e(int i, C0371o c0371o, Object obj) {
        c0371o.S(-462424778);
        E.C.b(obj, i, this.f603a.f576q, X.k.d(-824725566, new C0014k(i, 1, this), c0371o), c0371o, 3072);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f604b, ((h) obj).f604b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f604b.hashCode();
    }
}
