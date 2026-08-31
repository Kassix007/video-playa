package E;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1532e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(long j) {
        int i = this.f1528a + 1;
        long[] jArr = (long[]) this.f1530c;
        int length = jArr.length;
        if (i > length) {
            int i7 = length * 2;
            long[] jArr2 = new long[i7];
            int[] iArr = new int[i7];
            n5.k.E0(jArr, jArr2, 0, 0, jArr.length);
            n5.k.F0(0, 0, 14, (int[]) this.f1531d, iArr);
            this.f1530c = jArr2;
            this.f1531d = iArr;
        }
        int i8 = this.f1528a;
        this.f1528a = i8 + 1;
        int length2 = ((int[]) this.f1532e).length;
        if (this.f1529b >= length2) {
            int i9 = length2 * 2;
            int[] iArr2 = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                iArr2[i10] = i11;
                i10 = i11;
            }
            n5.k.F0(0, 0, 14, (int[]) this.f1532e, iArr2);
            this.f1532e = iArr2;
        }
        int i12 = this.f1529b;
        int[] iArr3 = (int[]) this.f1532e;
        this.f1529b = iArr3[i12];
        long[] jArr3 = (long[]) this.f1530c;
        jArr3[i8] = j;
        ((int[]) this.f1531d)[i8] = i12;
        iArr3[i12] = i8;
        while (i8 > 0) {
            int i13 = ((i8 + 1) >> 1) - 1;
            if (jArr3[i13] <= j) {
                break;
            }
            c(i13, i8);
            i8 = i13;
        }
        return i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i) {
        int i7 = this.f1529b;
        boolean z5 = false;
        if (i >= 0 && i < i7) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        Q0.a.a("lineIndex(" + i + ") is out of bounds [0, " + i7 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, int i7) {
        long[] jArr = (long[]) this.f1530c;
        int[] iArr = (int[]) this.f1531d;
        int[] iArr2 = (int[]) this.f1532e;
        long j = jArr[i];
        jArr[i] = jArr[i7];
        jArr[i7] = j;
        int i8 = iArr[i];
        int i9 = iArr[i7];
        iArr[i] = i9;
        iArr[i7] = i8;
        iArr2[i9] = i;
        iArr2[i8] = i7;
    }
}
