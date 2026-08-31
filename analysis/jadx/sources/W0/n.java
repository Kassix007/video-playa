package W0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f8026b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8027c = AbstractC0836n2.E(0, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8028a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [L0.m.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ n(long j) {
        this.f8028a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(long j) {
        return f8026b[(int) ((j & 1095216660480L) >>> 32)].f8029a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(long j) {
        long jB = b(j);
        if (o.a(jB, 0L)) {
            return "Unspecified";
        }
        if (o.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f8028a == ((n) obj).f8028a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f8028a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return d(this.f8028a);
    }
}
