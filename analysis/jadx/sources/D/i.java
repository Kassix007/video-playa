package D;

import A.C0014k;
import E.C;
import E.InterfaceC0140x;
import E.Y;
import P.C0371o;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0140x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f1216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f1217c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(y yVar, h hVar, Y y6) {
        this.f1215a = yVar;
        this.f1216b = hVar;
        this.f1217c = y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int a() {
        return this.f1216b.k().f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final Object b(int i) {
        Object objH = this.f1217c.h(i);
        return objH == null ? this.f1216b.l(i) : objH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final Object c(int i) {
        return this.f1216b.j(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final int d(Object obj) {
        return this.f1217c.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0140x
    public final void e(int i, C0371o c0371o, Object obj) {
        c0371o.S(1493551140);
        C.b(obj, i, this.f1215a.f1318q, X.k.d(726189336, new C0014k(i, 2, this), c0371o), c0371o, 3072);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f1216b, ((i) obj).f1216b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1216b.hashCode();
    }
}
