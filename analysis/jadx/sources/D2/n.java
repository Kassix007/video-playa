package D2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f1422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f1423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E2.h f1424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E2.g f1425e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1427h;
    public final String i;
    public final d6.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f1428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f1429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f1430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f1431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f1432o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, E2.h hVar, E2.g gVar, boolean z5, boolean z6, boolean z7, String str, d6.l lVar, s sVar, p pVar, b bVar, b bVar2, b bVar3) {
        this.f1421a = context;
        this.f1422b = config;
        this.f1423c = colorSpace;
        this.f1424d = hVar;
        this.f1425e = gVar;
        this.f = z5;
        this.f1426g = z6;
        this.f1427h = z7;
        this.i = str;
        this.j = lVar;
        this.f1428k = sVar;
        this.f1429l = pVar;
        this.f1430m = bVar;
        this.f1431n = bVar2;
        this.f1432o = bVar3;
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
        if (kotlin.jvm.internal.m.a(this.f1421a, nVar.f1421a) && this.f1422b == nVar.f1422b) {
            return (Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.m.a(this.f1423c, nVar.f1423c)) && kotlin.jvm.internal.m.a(this.f1424d, nVar.f1424d) && this.f1425e == nVar.f1425e && this.f == nVar.f && this.f1426g == nVar.f1426g && this.f1427h == nVar.f1427h && kotlin.jvm.internal.m.a(this.i, nVar.i) && kotlin.jvm.internal.m.a(this.j, nVar.j) && kotlin.jvm.internal.m.a(this.f1428k, nVar.f1428k) && kotlin.jvm.internal.m.a(this.f1429l, nVar.f1429l) && this.f1430m == nVar.f1430m && this.f1431n == nVar.f1431n && this.f1432o == nVar.f1432o;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f1422b.hashCode() + (this.f1421a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f1423c;
        int iE = k1.i.e(k1.i.e(k1.i.e((this.f1425e.hashCode() + ((this.f1424d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31, this.f1426g), 31, this.f1427h);
        String str = this.i;
        return this.f1432o.hashCode() + ((this.f1431n.hashCode() + ((this.f1430m.hashCode() + ((this.f1429l.f1435q.hashCode() + ((this.f1428k.f1443a.hashCode() + ((((iE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.f12360q)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
