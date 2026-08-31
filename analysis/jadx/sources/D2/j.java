package D2;

import M5.AbstractC0257s;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC0654q;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f1395A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F2.b f1398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f1399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap.Config f1400e;
    public final E2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f1401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G2.a f1402h;
    public final d6.l i;
    public final s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f1407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f1408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f1409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0257s f1410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0257s f1411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0257s f1412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0257s f1413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC0654q f1414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E2.i f1415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E2.g f1416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f1417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f1418z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Context context, Object obj, F2.b bVar, i iVar, Bitmap.Config config, E2.d dVar, List list, G2.a aVar, d6.l lVar, s sVar, boolean z5, boolean z6, boolean z7, boolean z8, b bVar2, b bVar3, b bVar4, AbstractC0257s abstractC0257s, AbstractC0257s abstractC0257s2, AbstractC0257s abstractC0257s3, AbstractC0257s abstractC0257s4, AbstractC0654q abstractC0654q, E2.i iVar2, E2.g gVar, p pVar, d dVar2, c cVar) {
        this.f1396a = context;
        this.f1397b = obj;
        this.f1398c = bVar;
        this.f1399d = iVar;
        this.f1400e = config;
        this.f = dVar;
        this.f1401g = list;
        this.f1402h = aVar;
        this.i = lVar;
        this.j = sVar;
        this.f1403k = z5;
        this.f1404l = z6;
        this.f1405m = z7;
        this.f1406n = z8;
        this.f1407o = bVar2;
        this.f1408p = bVar3;
        this.f1409q = bVar4;
        this.f1410r = abstractC0257s;
        this.f1411s = abstractC0257s2;
        this.f1412t = abstractC0257s3;
        this.f1413u = abstractC0257s4;
        this.f1414v = abstractC0654q;
        this.f1415w = iVar2;
        this.f1416x = gVar;
        this.f1417y = pVar;
        this.f1418z = dVar2;
        this.f1395A = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h a(j jVar) {
        Context context = jVar.f1396a;
        jVar.getClass();
        return new h(jVar, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f1396a, jVar.f1396a) && this.f1397b.equals(jVar.f1397b) && kotlin.jvm.internal.m.a(this.f1398c, jVar.f1398c) && kotlin.jvm.internal.m.a(this.f1399d, jVar.f1399d) && this.f1400e == jVar.f1400e && this.f == jVar.f && kotlin.jvm.internal.m.a(this.f1401g, jVar.f1401g) && kotlin.jvm.internal.m.a(this.f1402h, jVar.f1402h) && kotlin.jvm.internal.m.a(this.i, jVar.i) && this.j.equals(jVar.j) && this.f1403k == jVar.f1403k && this.f1404l == jVar.f1404l && this.f1405m == jVar.f1405m && this.f1406n == jVar.f1406n && this.f1407o == jVar.f1407o && this.f1408p == jVar.f1408p && this.f1409q == jVar.f1409q && kotlin.jvm.internal.m.a(this.f1410r, jVar.f1410r) && kotlin.jvm.internal.m.a(this.f1411s, jVar.f1411s) && kotlin.jvm.internal.m.a(this.f1412t, jVar.f1412t) && kotlin.jvm.internal.m.a(this.f1413u, jVar.f1413u) && kotlin.jvm.internal.m.a(this.f1414v, jVar.f1414v) && this.f1415w.equals(jVar.f1415w) && this.f1416x == jVar.f1416x && this.f1417y.equals(jVar.f1417y) && this.f1418z.equals(jVar.f1418z) && kotlin.jvm.internal.m.a(this.f1395A, jVar.f1395A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f1397b.hashCode() + (this.f1396a.hashCode() * 31)) * 31;
        F2.b bVar = this.f1398c;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        i iVar = this.f1399d;
        int iHashCode3 = (this.f1401g.hashCode() + ((this.f.hashCode() + ((this.f1400e.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 29791)) * 961)) * 29791)) * 31;
        this.f1402h.getClass();
        return this.f1395A.hashCode() + ((this.f1418z.hashCode() + ((this.f1417y.f1435q.hashCode() + ((this.f1416x.hashCode() + ((this.f1415w.hashCode() + ((this.f1414v.hashCode() + ((this.f1413u.hashCode() + ((this.f1412t.hashCode() + ((this.f1411s.hashCode() + ((this.f1410r.hashCode() + ((this.f1409q.hashCode() + ((this.f1408p.hashCode() + ((this.f1407o.hashCode() + k1.i.e(k1.i.e(k1.i.e(k1.i.e((this.j.f1443a.hashCode() + ((((G2.a.class.hashCode() + iHashCode3) * 31) + Arrays.hashCode(this.i.f12360q)) * 31)) * 31, 31, this.f1403k), 31, this.f1404l), 31, this.f1405m), 31, this.f1406n)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
