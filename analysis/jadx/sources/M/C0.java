package M;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.d f3288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H.d f3289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H.d f3290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H.d f3291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H.d f3292e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0() {
        H.d dVar = B0.f3282a;
        H.d dVar2 = B0.f3283b;
        H.d dVar3 = B0.f3284c;
        H.d dVar4 = B0.f3285d;
        H.d dVar5 = B0.f3286e;
        this.f3288a = dVar;
        this.f3289b = dVar2;
        this.f3290c = dVar3;
        this.f3291d = dVar4;
        this.f3292e = dVar5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return kotlin.jvm.internal.m.a(this.f3288a, c02.f3288a) && kotlin.jvm.internal.m.a(this.f3289b, c02.f3289b) && kotlin.jvm.internal.m.a(this.f3290c, c02.f3290c) && kotlin.jvm.internal.m.a(this.f3291d, c02.f3291d) && kotlin.jvm.internal.m.a(this.f3292e, c02.f3292e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3292e.hashCode() + ((this.f3291d.hashCode() + ((this.f3290c.hashCode() + ((this.f3289b.hashCode() + (this.f3288a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Shapes(extraSmall=" + this.f3288a + ", small=" + this.f3289b + ", medium=" + this.f3290c + ", large=" + this.f3291d + ", extraLarge=" + this.f3292e + ')';
    }
}
