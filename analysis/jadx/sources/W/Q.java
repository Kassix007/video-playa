package w;

import i0.C1130b;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17843c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(long j, long j7, boolean z5) {
        this.f17841a = j;
        this.f17842b = j7;
        this.f17843c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Q a(Q q7) {
        return new Q(C1130b.e(this.f17841a, q7.f17841a), Math.max(this.f17842b, q7.f17842b), this.f17843c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q7 = (Q) obj;
        return C1130b.b(this.f17841a, q7.f17841a) && this.f17842b == q7.f17842b && this.f17843c == q7.f17843c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f17843c) + k1.i.d(Long.hashCode(this.f17841a) * 31, 31, this.f17842b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C1130b.g(this.f17841a)) + ", timeMillis=" + this.f17842b + ", shouldApplyImmediately=" + this.f17843c + ')';
    }
}
