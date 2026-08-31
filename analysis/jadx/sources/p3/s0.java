package p3;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15840e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s0(float f, float f7, float f8, float f9) {
        this.f15838c = 0.0f;
        this.f15839d = 0.0f;
        this.f15836a = f;
        this.f15837b = f7;
        double dSqrt = Math.sqrt((f9 * f9) + (f8 * f8));
        if (dSqrt != 0.0d) {
            this.f15838c = (float) (((double) f8) / dSqrt);
            this.f15839d = (float) (((double) f9) / dSqrt);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, float f7) {
        float f8 = f - this.f15836a;
        float f9 = f7 - this.f15837b;
        double dSqrt = Math.sqrt((f9 * f9) + (f8 * f8));
        if (dSqrt != 0.0d) {
            f8 = (float) (((double) f8) / dSqrt);
            f9 = (float) (((double) f9) / dSqrt);
        }
        float f10 = this.f15838c;
        if (f8 != (-f10) || f9 != (-this.f15839d)) {
            this.f15838c = f10 + f8;
            this.f15839d += f9;
        } else {
            this.f15840e = true;
            this.f15838c = -f9;
            this.f15839d = f8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(s0 s0Var) {
        float f = s0Var.f15838c;
        float f7 = this.f15838c;
        if (f == (-f7)) {
            float f8 = s0Var.f15839d;
            if (f8 == (-this.f15839d)) {
                this.f15840e = true;
                this.f15838c = -f8;
                this.f15839d = s0Var.f15838c;
                return;
            }
        }
        this.f15838c = f7 + f;
        this.f15839d += s0Var.f15839d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f15836a + "," + this.f15837b + " " + this.f15838c + "," + this.f15839d + ")";
    }
}
