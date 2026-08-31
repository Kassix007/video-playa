package D2;

import android.graphics.drawable.Drawable;
import v2.EnumC1757e;

/* JADX INFO: loaded from: classes.dex */
public final class r extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1757e f1438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B2.a f1439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1440e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1441g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(Drawable drawable, j jVar, EnumC1757e enumC1757e, B2.a aVar, String str, boolean z5, boolean z6) {
        this.f1436a = drawable;
        this.f1437b = jVar;
        this.f1438c = enumC1757e;
        this.f1439d = aVar;
        this.f1440e = str;
        this.f = z5;
        this.f1441g = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.k
    public final j a() {
        return this.f1437b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.f1436a, rVar.f1436a) && kotlin.jvm.internal.m.a(this.f1437b, rVar.f1437b) && this.f1438c == rVar.f1438c && kotlin.jvm.internal.m.a(this.f1439d, rVar.f1439d) && kotlin.jvm.internal.m.a(this.f1440e, rVar.f1440e) && this.f == rVar.f && this.f1441g == rVar.f1441g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f1438c.hashCode() + ((this.f1437b.hashCode() + (this.f1436a.hashCode() * 31)) * 31)) * 31;
        B2.a aVar = this.f1439d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f1440e;
        return Boolean.hashCode(this.f1441g) + k1.i.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
