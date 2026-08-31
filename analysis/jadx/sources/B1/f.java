package b1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9959B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9960q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f9964u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9961r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9962s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9963t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9965v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f9966w = new float[9];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f9967x = new float[9];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b[] f9968y = new b[16];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9969z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9958A = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(int i) {
        this.f9959B = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i7 = this.f9969z;
            if (i >= i7) {
                b[] bVarArr = this.f9968y;
                if (i7 >= bVarArr.length) {
                    this.f9968y = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f9968y;
                int i8 = this.f9969z;
                bVarArr2[i8] = bVar;
                this.f9969z = i8 + 1;
                return;
            }
            if (this.f9968y[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(b bVar) {
        int i = this.f9969z;
        int i7 = 0;
        while (i7 < i) {
            if (this.f9968y[i7] == bVar) {
                while (i7 < i - 1) {
                    b[] bVarArr = this.f9968y;
                    int i8 = i7 + 1;
                    bVarArr[i7] = bVarArr[i8];
                    i7 = i8;
                }
                this.f9969z--;
                return;
            }
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f9959B = 5;
        this.f9963t = 0;
        this.f9961r = -1;
        this.f9962s = -1;
        this.f9964u = 0.0f;
        this.f9965v = false;
        int i = this.f9969z;
        for (int i7 = 0; i7 < i; i7++) {
            this.f9968y[i7] = null;
        }
        this.f9969z = 0;
        this.f9958A = 0;
        this.f9960q = false;
        Arrays.fill(this.f9967x, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9961r - ((f) obj).f9961r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(c cVar, float f) {
        this.f9964u = f;
        this.f9965v = true;
        int i = this.f9969z;
        this.f9962s = -1;
        for (int i7 = 0; i7 < i; i7++) {
            this.f9968y[i7].h(cVar, this, false);
        }
        this.f9969z = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(c cVar, b bVar) {
        int i = this.f9969z;
        for (int i7 = 0; i7 < i; i7++) {
            this.f9968y[i7].i(cVar, bVar, false);
        }
        this.f9969z = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "" + this.f9961r;
    }
}
