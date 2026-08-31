package u;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements InterfaceC1668w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1669x f17088c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z0(int i, InterfaceC1669x interfaceC1669x, int i7) {
        this((i7 & 1) != 0 ? 300 : i, 0, (i7 & 4) != 0 ? AbstractC1670y.f17083a : interfaceC1669x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1657k
    public final B0 a(Z.m mVar) {
        return new P.Y(this.f17086a, this.f17087b, this.f17088c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (z0Var.f17086a == this.f17086a && z0Var.f17087b == this.f17087b && kotlin.jvm.internal.m.a(z0Var.f17088c, this.f17088c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f17088c.hashCode() + (this.f17086a * 31)) * 31) + this.f17087b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // u.InterfaceC1668w, u.InterfaceC1657k
    public final D0 a(Z.m mVar) {
        return new P.Y(this.f17086a, this.f17087b, this.f17088c);
    }

    public z0(int i, int i7, InterfaceC1669x interfaceC1669x) {
        this.f17086a = i;
        this.f17087b = i7;
        this.f17088c = interfaceC1669x;
    }
}
