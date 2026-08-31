package U2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V2.h f7687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V2.g f7688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V2.d f7689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7690e;
    public final q6.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f7691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f7692h;
    public final b i;
    public final I2.m j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(Context context, V2.h hVar, V2.g gVar, V2.d dVar, String str, q6.l lVar, b bVar, b bVar2, b bVar3, I2.m mVar) {
        this.f7686a = context;
        this.f7687b = hVar;
        this.f7688c = gVar;
        this.f7689d = dVar;
        this.f7690e = str;
        this.f = lVar;
        this.f7691g = bVar;
        this.f7692h = bVar2;
        this.i = bVar3;
        this.j = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f7686a, nVar.f7686a) && kotlin.jvm.internal.m.a(this.f7687b, nVar.f7687b) && this.f7688c == nVar.f7688c && this.f7689d == nVar.f7689d && kotlin.jvm.internal.m.a(this.f7690e, nVar.f7690e) && kotlin.jvm.internal.m.a(this.f, nVar.f) && this.f7691g == nVar.f7691g && this.f7692h == nVar.f7692h && this.i == nVar.i && kotlin.jvm.internal.m.a(this.j, nVar.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7689d.hashCode() + ((this.f7688c.hashCode() + ((this.f7687b.hashCode() + (this.f7686a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f7690e;
        return this.j.f2367a.hashCode() + ((this.i.hashCode() + ((this.f7692h.hashCode() + ((this.f7691g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Options(context=" + this.f7686a + ", size=" + this.f7687b + ", scale=" + this.f7688c + ", precision=" + this.f7689d + ", diskCacheKey=" + this.f7690e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.f7691g + ", diskCachePolicy=" + this.f7692h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
