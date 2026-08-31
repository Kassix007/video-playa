package e0;

import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: e0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1020e f12497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.c f12498d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1019d(int i, long j, EnumC1020e enumC1020e, k3.c cVar) {
        this.f12495a = i;
        this.f12496b = j;
        this.f12497c = enumC1020e;
        this.f12498d = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1019d)) {
            return false;
        }
        C1019d c1019d = (C1019d) obj;
        return this.f12495a == c1019d.f12495a && this.f12496b == c1019d.f12496b && this.f12497c == c1019d.f12497c && m.a(this.f12498d, c1019d.f12498d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f12497c.hashCode() + i.d(Integer.hashCode(this.f12495a) * 31, 31, this.f12496b)) * 31;
        k3.c cVar = this.f12498d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f12495a + ", timestamp=" + this.f12496b + ", type=" + this.f12497c + ", structureCompat=" + this.f12498d + ')';
    }
}
