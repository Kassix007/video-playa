package l0;

import W0.l;
import i0.C1133e;
import j0.m;

/* JADX INFO: renamed from: l0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1218a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W0.c f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f14421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f14422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14423d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218a)) {
            return false;
        }
        C1218a c1218a = (C1218a) obj;
        return kotlin.jvm.internal.m.a(this.f14420a, c1218a.f14420a) && this.f14421b == c1218a.f14421b && kotlin.jvm.internal.m.a(this.f14422c, c1218a.f14422c) && C1133e.a(this.f14423d, c1218a.f14423d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f14423d) + ((this.f14422c.hashCode() + ((this.f14421b.hashCode() + (this.f14420a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DrawParams(density=" + this.f14420a + ", layoutDirection=" + this.f14421b + ", canvas=" + this.f14422c + ", size=" + ((Object) C1133e.f(this.f14423d)) + ')';
    }
}
