package i0;

import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: renamed from: i0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1133e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13533a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.measurement.n2.F(int, P.o, int):o0.b] */
    public /* synthetic */ C1133e(long j) {
        this.f13533a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(long j) {
        long j7 = (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1)))) & j;
        return (((j7 & 4294967295L) & (j7 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + K1.M(Float.intBitsToFloat((int) (j >> 32))) + ", " + K1.M(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1133e) {
            return this.f13533a == ((C1133e) obj).f13533a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13533a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return f(this.f13533a);
    }
}
