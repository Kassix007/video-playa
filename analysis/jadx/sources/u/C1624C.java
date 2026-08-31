package u;

/* JADX INFO: renamed from: u.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1624C implements InterfaceC1622A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1669x f16756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16758d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1624C(int i, int i7, InterfaceC1669x interfaceC1669x) {
        this.f16755a = i;
        this.f16756b = interfaceC1669x;
        this.f16757c = ((long) i) * 1000000;
        this.f16758d = ((long) i7) * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final float b(long j, float f, float f7, float f8) {
        long j7 = j - this.f16758d;
        if (j7 < 0) {
            j7 = 0;
        }
        long j8 = this.f16757c;
        if (j7 > j8) {
            j7 = j8;
        }
        float fC = this.f16756b.c(this.f16755a == 0 ? 1.0f : j7 / j8);
        return (f7 * fC) + ((1 - fC) * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final float c(long j, float f, float f7, float f8) {
        long j7 = j - this.f16758d;
        if (j7 < 0) {
            j7 = 0;
        }
        long j8 = this.f16757c;
        long j9 = j7 > j8 ? j8 : j7;
        if (j9 == 0) {
            return f8;
        }
        return (b(j9, f, f7, f8) - b(j9 - 1000000, f, f7, f8)) * 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final long d(float f, float f7, float f8) {
        return this.f16758d + this.f16757c;
    }
}
