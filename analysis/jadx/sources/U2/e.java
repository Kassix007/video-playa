package U2;

import M5.H;
import q5.C1530i;
import q5.InterfaceC1529h;
import q6.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f7641o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.l f7642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1529h f7643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1529h f7644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1529h f7645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f7646e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f7647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B5.c f7648h;
    public final B5.c i;
    public final B5.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V2.i f7649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V2.g f7650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V2.d f7651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I2.m f7652n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        t tVar = q6.l.f16071q;
        T5.e eVar = H.f3811a;
        T5.d dVar = T5.d.f7468q;
        V2.e eVar2 = V2.i.f7967a;
        V2.d dVar2 = V2.d.f7959q;
        I2.m mVar = I2.m.f2366b;
        C1530i c1530i = C1530i.f16022q;
        b bVar = b.ENABLED;
        Y2.i iVar = Y2.i.f8214q;
        f7641o = new e(tVar, c1530i, dVar, dVar, bVar, bVar, bVar, iVar, iVar, iVar, eVar2, V2.g.f7962q, dVar2, mVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(q6.l lVar, InterfaceC1529h interfaceC1529h, InterfaceC1529h interfaceC1529h2, InterfaceC1529h interfaceC1529h3, b bVar, b bVar2, b bVar3, B5.c cVar, B5.c cVar2, B5.c cVar3, V2.i iVar, V2.g gVar, V2.d dVar, I2.m mVar) {
        this.f7642a = lVar;
        this.f7643b = interfaceC1529h;
        this.f7644c = interfaceC1529h2;
        this.f7645d = interfaceC1529h3;
        this.f7646e = bVar;
        this.f = bVar2;
        this.f7647g = bVar3;
        this.f7648h = cVar;
        this.i = cVar2;
        this.j = cVar3;
        this.f7649k = iVar;
        this.f7650l = gVar;
        this.f7651m = dVar;
        this.f7652n = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f7642a, eVar.f7642a) && kotlin.jvm.internal.m.a(this.f7643b, eVar.f7643b) && kotlin.jvm.internal.m.a(this.f7644c, eVar.f7644c) && kotlin.jvm.internal.m.a(this.f7645d, eVar.f7645d) && this.f7646e == eVar.f7646e && this.f == eVar.f && this.f7647g == eVar.f7647g && kotlin.jvm.internal.m.a(this.f7648h, eVar.f7648h) && kotlin.jvm.internal.m.a(this.i, eVar.i) && kotlin.jvm.internal.m.a(this.j, eVar.j) && kotlin.jvm.internal.m.a(this.f7649k, eVar.f7649k) && this.f7650l == eVar.f7650l && this.f7651m == eVar.f7651m && kotlin.jvm.internal.m.a(this.f7652n, eVar.f7652n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7652n.f2367a.hashCode() + ((this.f7651m.hashCode() + ((this.f7650l.hashCode() + ((this.f7649k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f7648h.hashCode() + ((this.f7647g.hashCode() + ((this.f.hashCode() + ((this.f7646e.hashCode() + ((this.f7645d.hashCode() + ((this.f7644c.hashCode() + ((this.f7643b.hashCode() + (this.f7642a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Defaults(fileSystem=" + this.f7642a + ", interceptorCoroutineContext=" + this.f7643b + ", fetcherCoroutineContext=" + this.f7644c + ", decoderCoroutineContext=" + this.f7645d + ", memoryCachePolicy=" + this.f7646e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.f7647g + ", placeholderFactory=" + this.f7648h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.f7649k + ", scale=" + this.f7650l + ", precision=" + this.f7651m + ", extras=" + this.f7652n + ')';
    }
}
