package u;

/* JADX INFO: renamed from: u.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1647e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16921b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(float f, float f7, long j) {
        float f8 = f - this.f16920a;
        double d5 = j / 1000.0d;
        double d7 = this.f16921b;
        double d8 = f8;
        double d9 = (d7 * d8) + ((double) f7);
        double d10 = (-d7) * d5;
        double d11 = (d5 * d9) + d8;
        double dExp = Math.exp(d10) * d11;
        return (((long) Float.floatToRawIntBits((float) ((Math.exp(d10) * d9) + (Math.exp(d10) * d11 * (-this.f16921b))))) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + ((double) this.f16920a))) << 32);
    }
}
