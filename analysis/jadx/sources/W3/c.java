package W3;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f8116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8118e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f8116c;
        return timeInterpolator != null ? timeInterpolator : a.f8109b;
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
        if (this.f8114a == cVar.f8114a && this.f8115b == cVar.f8115b && this.f8117d == cVar.f8117d && this.f8118e == cVar.f8118e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long j = this.f8114a;
        long j7 = this.f8115b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f8117d) * 31) + this.f8118e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f8114a + " duration: " + this.f8115b + " interpolator: " + a().getClass() + " repeatCount: " + this.f8117d + " repeatMode: " + this.f8118e + "}\n";
    }
}
