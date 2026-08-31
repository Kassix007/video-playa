package k0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f14040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f14043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f14044e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f14045g;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR (r16v0 double), (r18v0 double), (r20v0 double), (r22v0 double), (r24v0 double), (0.0d double), (0.0d double) A[MD:(double, double, double, double, double, double, double):void (m)] (LINE:1) call: k0.r.<init>(double, double, double, double, double, double, double):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r(double d5, double d7, double d8, double d9, double d10) {
        this(d5, d7, d8, d9, d10, 0.0d, 0.0d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f14040a, rVar.f14040a) == 0 && Double.compare(this.f14041b, rVar.f14041b) == 0 && Double.compare(this.f14042c, rVar.f14042c) == 0 && Double.compare(this.f14043d, rVar.f14043d) == 0 && Double.compare(this.f14044e, rVar.f14044e) == 0 && Double.compare(this.f, rVar.f) == 0 && Double.compare(this.f14045g, rVar.f14045g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Double.hashCode(this.f14045g) + ((Double.hashCode(this.f) + ((Double.hashCode(this.f14044e) + ((Double.hashCode(this.f14043d) + ((Double.hashCode(this.f14042c) + ((Double.hashCode(this.f14041b) + (Double.hashCode(this.f14040a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransferParameters(gamma=" + this.f14040a + ", a=" + this.f14041b + ", b=" + this.f14042c + ", c=" + this.f14043d + ", d=" + this.f14044e + ", e=" + this.f + ", f=" + this.f14045g + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public r(double d5, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.f14040a = d5;
        this.f14041b = d7;
        this.f14042c = d8;
        this.f14043d = d9;
        this.f14044e = d10;
        this.f = d11;
        this.f14045g = d12;
        if (Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 == -2.0d || d5 == -3.0d) {
            return;
        }
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d10);
        }
        if (d10 == 0.0d && (d7 == 0.0d || d5 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d10 >= 1.0d && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d7 == 0.0d || d5 == 0.0d) && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d9 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d7 < 0.0d || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
