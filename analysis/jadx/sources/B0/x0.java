package B0;

import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements u0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1927D f532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final T f533r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x0(InterfaceC1927D interfaceC1927D, T t6) {
        this.f532q = interfaceC1927D;
        this.f533r = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.m.a(this.f532q, x0Var.f532q) && kotlin.jvm.internal.m.a(this.f533r, x0Var.f533r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f533r.hashCode() + (this.f532q.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PlaceableResult(result=" + this.f532q + ", placeable=" + this.f533r + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return this.f533r.d0().C();
    }
}
