package M;

import B0.InterfaceC0048m;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements v.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3628c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u0(boolean z5, float f, long j) {
        this.f3626a = z5;
        this.f3627b = f;
        this.f3628c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v.V
    public final InterfaceC0048m b(y.i iVar) {
        return new C0230s(iVar, this.f3626a, this.f3627b, new k3.c(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f3626a == u0Var.f3626a && W0.f.a(this.f3627b, u0Var.f3627b)) {
            return j0.o.c(this.f3628c, u0Var.f3628c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v.V
    public final int hashCode() {
        int iB = k1.i.b(this.f3627b, Boolean.hashCode(this.f3626a) * 31, 961);
        int i = j0.o.f13723h;
        return Long.hashCode(this.f3628c) + iB;
    }
}
