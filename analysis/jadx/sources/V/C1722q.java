package v;

import j0.C1147b;
import j0.C1150e;
import j0.C1152g;
import l0.C1219b;

/* JADX INFO: renamed from: v.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1722q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1150e f17373a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1147b f17374b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1219b f17375c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1152g f17376d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1722q)) {
            return false;
        }
        C1722q c1722q = (C1722q) obj;
        return kotlin.jvm.internal.m.a(this.f17373a, c1722q.f17373a) && kotlin.jvm.internal.m.a(this.f17374b, c1722q.f17374b) && kotlin.jvm.internal.m.a(this.f17375c, c1722q.f17375c) && kotlin.jvm.internal.m.a(this.f17376d, c1722q.f17376d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1150e c1150e = this.f17373a;
        int iHashCode = (c1150e == null ? 0 : c1150e.hashCode()) * 31;
        C1147b c1147b = this.f17374b;
        int iHashCode2 = (iHashCode + (c1147b == null ? 0 : c1147b.hashCode())) * 31;
        C1219b c1219b = this.f17375c;
        int iHashCode3 = (iHashCode2 + (c1219b == null ? 0 : c1219b.hashCode())) * 31;
        C1152g c1152g = this.f17376d;
        return iHashCode3 + (c1152g != null ? c1152g.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f17373a + ", canvas=" + this.f17374b + ", canvasDrawScope=" + this.f17375c + ", borderPath=" + this.f17376d + ')';
    }
}
