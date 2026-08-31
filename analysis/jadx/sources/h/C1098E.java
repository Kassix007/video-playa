package h;

/* JADX INFO: renamed from: h.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1098E f13206d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13209c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(long j, double d5, double d7) {
        double d8 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d8) * 0.03341960161924362d) + d8 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d8) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d7) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d9 = 0.01745329238474369d * d5;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d9))) / (Math.cos(dAsin) * Math.cos(d9));
        if (dSin3 >= 1.0d) {
            this.f13209c = 1;
            this.f13207a = -1L;
            this.f13208b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f13209c = 0;
                this.f13207a = -1L;
                this.f13208b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f13207a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f13208b = jRound;
            if (jRound >= j || this.f13207a <= j) {
                this.f13209c = 1;
            } else {
                this.f13209c = 0;
            }
        }
    }
}
