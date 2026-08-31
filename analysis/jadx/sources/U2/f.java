package U2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.c f7653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B5.c f7654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.c f7655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V2.i f7656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V2.g f7657e;
    public final V2.d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(B5.c cVar, B5.c cVar2, B5.c cVar3, V2.i iVar, V2.g gVar, V2.d dVar) {
        this.f7653a = cVar;
        this.f7654b = cVar2;
        this.f7655c = cVar3;
        this.f7656d = iVar;
        this.f7657e = gVar;
        this.f = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return kotlin.jvm.internal.m.a(this.f7653a, fVar.f7653a) && kotlin.jvm.internal.m.a(this.f7654b, fVar.f7654b) && kotlin.jvm.internal.m.a(this.f7655c, fVar.f7655c) && kotlin.jvm.internal.m.a(this.f7656d, fVar.f7656d) && this.f7657e == fVar.f7657e && this.f == fVar.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        B5.c cVar = this.f7653a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        B5.c cVar2 = this.f7654b;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        B5.c cVar3 = this.f7655c;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        V2.i iVar = this.f7656d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        V2.g gVar = this.f7657e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        V2.d dVar = this.f;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=null, fetcherCoroutineContext=null, decoderCoroutineContext=null, memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f7653a + ", errorFactory=" + this.f7654b + ", fallbackFactory=" + this.f7655c + ", sizeResolver=" + this.f7656d + ", scale=" + this.f7657e + ", precision=" + this.f + ')';
    }
}
