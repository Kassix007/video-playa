package C0;

/* JADX INFO: loaded from: classes.dex */
public interface b1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float a() {
        return Float.MAX_VALUE;
    }

    long b();

    float c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long d() {
        float f = 48;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }
}
