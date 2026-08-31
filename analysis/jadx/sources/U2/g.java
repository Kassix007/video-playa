package U2;

import android.content.Context;
import java.util.Map;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q6.l f7661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1529h f7662e;
    public final InterfaceC1529h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1529h f7663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f7664h;
    public final b i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B5.c f7665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B5.c f7666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B5.c f7667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V2.i f7668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V2.g f7669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V2.d f7670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I2.m f7671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f7672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f7673s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(Context context, Object obj, Map map, q6.l lVar, InterfaceC1529h interfaceC1529h, InterfaceC1529h interfaceC1529h2, InterfaceC1529h interfaceC1529h3, b bVar, b bVar2, b bVar3, B5.c cVar, B5.c cVar2, B5.c cVar3, V2.i iVar, V2.g gVar, V2.d dVar, I2.m mVar, f fVar, e eVar) {
        this.f7658a = context;
        this.f7659b = obj;
        this.f7660c = map;
        this.f7661d = lVar;
        this.f7662e = interfaceC1529h;
        this.f = interfaceC1529h2;
        this.f7663g = interfaceC1529h3;
        this.f7664h = bVar;
        this.i = bVar2;
        this.j = bVar3;
        this.f7665k = cVar;
        this.f7666l = cVar2;
        this.f7667m = cVar3;
        this.f7668n = iVar;
        this.f7669o = gVar;
        this.f7670p = dVar;
        this.f7671q = mVar;
        this.f7672r = fVar;
        this.f7673s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f7658a, gVar.f7658a) && this.f7659b.equals(gVar.f7659b) && this.f7660c.equals(gVar.f7660c) && kotlin.jvm.internal.m.a(this.f7661d, gVar.f7661d) && kotlin.jvm.internal.m.a(this.f7662e, gVar.f7662e) && kotlin.jvm.internal.m.a(this.f, gVar.f) && kotlin.jvm.internal.m.a(this.f7663g, gVar.f7663g) && this.f7664h == gVar.f7664h && this.i == gVar.i && this.j == gVar.j && kotlin.jvm.internal.m.a(this.f7665k, gVar.f7665k) && kotlin.jvm.internal.m.a(this.f7666l, gVar.f7666l) && kotlin.jvm.internal.m.a(this.f7667m, gVar.f7667m) && kotlin.jvm.internal.m.a(this.f7668n, gVar.f7668n) && this.f7669o == gVar.f7669o && this.f7670p == gVar.f7670p && kotlin.jvm.internal.m.a(this.f7671q, gVar.f7671q) && this.f7672r.equals(gVar.f7672r) && kotlin.jvm.internal.m.a(this.f7673s, gVar.f7673s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7673s.hashCode() + ((this.f7672r.hashCode() + ((this.f7671q.f2367a.hashCode() + ((this.f7670p.hashCode() + ((this.f7669o.hashCode() + ((this.f7668n.hashCode() + ((this.f7667m.hashCode() + ((this.f7666l.hashCode() + ((this.f7665k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f7664h.hashCode() + ((this.f7663g.hashCode() + ((this.f.hashCode() + ((this.f7662e.hashCode() + ((this.f7661d.hashCode() + ((this.f7660c.hashCode() + ((this.f7659b.hashCode() + (this.f7658a.hashCode() * 31)) * 923521)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ImageRequest(context=" + this.f7658a + ", data=" + this.f7659b + ", target=null, listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.f7660c + ", diskCacheKey=null, fileSystem=" + this.f7661d + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f7662e + ", fetcherCoroutineContext=" + this.f + ", decoderCoroutineContext=" + this.f7663g + ", memoryCachePolicy=" + this.f7664h + ", diskCachePolicy=" + this.i + ", networkCachePolicy=" + this.j + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f7665k + ", errorFactory=" + this.f7666l + ", fallbackFactory=" + this.f7667m + ", sizeResolver=" + this.f7668n + ", scale=" + this.f7669o + ", precision=" + this.f7670p + ", extras=" + this.f7671q + ", defined=" + this.f7672r + ", defaults=" + this.f7673s + ')';
    }
}
