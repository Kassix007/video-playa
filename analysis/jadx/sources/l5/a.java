package L5;

import Q2.g;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f3273s = new a(0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f3274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f3275r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(long j, long j7) {
        this.f3274q = j;
        this.f3275r = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        m.e(other, "other");
        long j = other.f3274q;
        long j7 = this.f3274q;
        if (j7 != j) {
            return Long.compare(j7 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f3275r ^ Long.MIN_VALUE, other.f3275r ^ Long.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3274q == aVar.f3274q && this.f3275r == aVar.f3275r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3274q ^ this.f3275r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte[] bArr = new byte[36];
        g.z(this.f3274q, bArr, 0, 0, 4);
        bArr[8] = 45;
        g.z(this.f3274q, bArr, 9, 4, 6);
        bArr[13] = 45;
        g.z(this.f3274q, bArr, 14, 6, 8);
        bArr[18] = 45;
        g.z(this.f3275r, bArr, 19, 0, 2);
        bArr[23] = 45;
        g.z(this.f3275r, bArr, 24, 2, 8);
        return new String(bArr, J5.a.f2809a);
    }
}
