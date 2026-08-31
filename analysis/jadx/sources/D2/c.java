package D2;

import M5.AbstractC0257s;
import M5.H;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0257s f1365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0257s f1366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0257s f1367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0257s f1368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G2.a f1369e;
    public final E2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f1370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1371h;
    public final b i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f1372k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() {
        T5.e eVar = H.f3811a;
        N5.f fVar = R5.n.f7261a.f4044t;
        T5.d dVar = T5.d.f7468q;
        Bitmap.Config config = H2.f.f2138b;
        this.f1365a = fVar;
        this.f1366b = dVar;
        this.f1367c = dVar;
        this.f1368d = dVar;
        this.f1369e = G2.a.f1997a;
        this.f = E2.d.f1681s;
        this.f1370g = config;
        this.f1371h = true;
        b bVar = b.ENABLED;
        this.i = bVar;
        this.j = bVar;
        this.f1372k = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f1365a, cVar.f1365a) && kotlin.jvm.internal.m.a(this.f1366b, cVar.f1366b) && kotlin.jvm.internal.m.a(this.f1367c, cVar.f1367c) && kotlin.jvm.internal.m.a(this.f1368d, cVar.f1368d) && kotlin.jvm.internal.m.a(this.f1369e, cVar.f1369e) && this.f == cVar.f && this.f1370g == cVar.f1370g && this.f1371h == cVar.f1371h && this.i == cVar.i && this.j == cVar.j && this.f1372k == cVar.f1372k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f1368d.hashCode() + ((this.f1367c.hashCode() + ((this.f1366b.hashCode() + (this.f1365a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f1369e.getClass();
        return this.f1372k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + k1.i.e(k1.i.e((this.f1370g.hashCode() + ((this.f.hashCode() + ((G2.a.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f1371h), 923521, false)) * 31)) * 31);
    }
}
