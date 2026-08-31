package u;

/* JADX INFO: renamed from: u.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f16801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1669x f16802b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1630I(Float f, InterfaceC1669x interfaceC1669x) {
        this.f16801a = f;
        this.f16802b = interfaceC1669x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1630I)) {
            return false;
        }
        C1630I c1630i = (C1630I) obj;
        return c1630i.f16801a.equals(this.f16801a) && kotlin.jvm.internal.m.a(c1630i.f16802b, this.f16802b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16802b.hashCode() + k1.i.c(0, this.f16801a.hashCode() * 31, 31);
    }
}
