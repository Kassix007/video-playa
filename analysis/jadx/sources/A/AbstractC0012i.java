package A;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0007d f106a = new C0007d(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0007d f107b = new C0007d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0005b f108c = new C0005b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0006c f109d = new C0006c(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0006c f110e = new C0006c(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0006c(2);
        new C0006c(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x002a */
    public static void a(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float f = (i - i8) / 2;
        if (!z5) {
            int length = iArr.length;
            int i10 = 0;
            while (i7 < length) {
                int i11 = iArr[i7];
                iArr2[i10] = Math.round(f);
                f += i11;
                i7++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x0016 */
    public static void b(int[] iArr, int[] iArr2, boolean z5) {
        int i = 0;
        if (!z5) {
            int length = iArr.length;
            int i7 = 0;
            int i8 = 0;
            while (i < length) {
                int i9 = iArr[i];
                iArr2[i7] = i8;
                i8 += i9;
                i++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = iArr[length2];
            iArr2[length2] = i;
            i += i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0021 */
    public static void c(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        int i10 = i - i8;
        if (!z5) {
            int length = iArr.length;
            int i11 = 0;
            while (i7 < length) {
                int i12 = iArr[i7];
                iArr2[i11] = i10;
                i10 += i12;
                i7++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x0034 */
    public static void d(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i8) / iArr.length;
        float f = length / 2;
        if (!z5) {
            int length2 = iArr.length;
            int i10 = 0;
            while (i7 < length2) {
                int i11 = iArr[i7];
                iArr2[i10] = Math.round(f);
                f += i11 + length;
                i7++;
                i10++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i12 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i12 + length;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(int i, int[] iArr, int[] iArr2, boolean z5) {
        if (iArr.length == 0) {
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float fMax = (i - i8) / Math.max(iArr.length - 1, 1);
        float f = (z5 && iArr.length == 1) ? fMax : 0.0f;
        if (z5) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i10 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i10 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i11 = 0;
        while (i7 < length2) {
            int i12 = iArr[i7];
            iArr2[i11] = Math.round(f);
            f += i12 + fMax;
            i7++;
            i11++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float length = (i - i8) / (iArr.length + 1);
        if (z5) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i10 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i10 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f7 = length;
        int i11 = 0;
        while (i7 < length3) {
            int i12 = iArr[i7];
            iArr2[i11] = Math.round(f7);
            f7 += i12 + length;
            i7++;
            i11++;
        }
    }
}
