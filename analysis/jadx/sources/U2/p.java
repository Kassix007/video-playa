package U2;

/* JADX INFO: loaded from: classes.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2.n f7693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.h f7695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P2.a f7696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7697e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7698g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(I2.n nVar, g gVar, J2.h hVar, P2.a aVar, String str, boolean z5, boolean z6) {
        this.f7693a = nVar;
        this.f7694b = gVar;
        this.f7695c = hVar;
        this.f7696d = aVar;
        this.f7697e = str;
        this.f = z5;
        this.f7698g = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U2.j
    public final g a() {
        return this.f7694b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f7693a, pVar.f7693a) && kotlin.jvm.internal.m.a(this.f7694b, pVar.f7694b) && this.f7695c == pVar.f7695c && kotlin.jvm.internal.m.a(this.f7696d, pVar.f7696d) && kotlin.jvm.internal.m.a(this.f7697e, pVar.f7697e) && this.f == pVar.f && this.f7698g == pVar.f7698g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7695c.hashCode() + ((this.f7694b.hashCode() + (this.f7693a.hashCode() * 31)) * 31)) * 31;
        P2.a aVar = this.f7696d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f7697e;
        return Boolean.hashCode(this.f7698g) + k1.i.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SuccessResult(image=" + this.f7693a + ", request=" + this.f7694b + ", dataSource=" + this.f7695c + ", memoryCacheKey=" + this.f7696d + ", diskCacheKey=" + this.f7697e + ", isSampled=" + this.f + ", isPlaceholderCached=" + this.f7698g + ')';
    }
}
