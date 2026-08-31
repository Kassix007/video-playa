package k6;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14248b = new int[10];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        if ((this.f14247a & 128) != 0) {
            return this.f14248b[7];
        }
        return 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(z other) {
        kotlin.jvm.internal.m.e(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f14247a) != 0) {
                c(i, other.f14248b[i]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, int i7) {
        if (i >= 0) {
            int[] iArr = this.f14248b;
            if (i >= iArr.length) {
                return;
            }
            this.f14247a = (1 << i) | this.f14247a;
            iArr[i] = i7;
        }
    }
}
