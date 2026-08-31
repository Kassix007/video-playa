package z0;

/* JADX INFO: renamed from: z0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1951k implements InterfaceC1950j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1950j
    public final long a(long j, long j7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(1.0f)));
        int i = AbstractC1937N.f18675a;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1951k)) {
            return false;
        }
        ((C1951k) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
