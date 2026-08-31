package B0;

import java.util.Arrays;

/* JADX INFO: renamed from: B0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f527b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0057w() {
        this.f526a = new int[10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(int i) {
        int i7 = this.f527b - 1;
        return i7 >= 0 ? this.f526a[i7] : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b() {
        int[] iArr = this.f526a;
        int i = this.f527b - 1;
        this.f527b = i;
        return iArr[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i) {
        int[] iArrCopyOf = this.f526a;
        if (this.f527b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f526a = iArrCopyOf;
        }
        int i7 = this.f527b;
        this.f527b = i7 + 1;
        iArrCopyOf[i7] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, int i7, int i8) {
        int i9 = this.f527b;
        int[] iArrCopyOf = this.f526a;
        int i10 = i9 + 3;
        if (i10 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f526a = iArrCopyOf;
        }
        iArrCopyOf[i9] = i + i8;
        iArrCopyOf[i9 + 1] = i7 + i8;
        iArrCopyOf[i9 + 2] = i8;
        this.f527b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(int i, int i7, int i8, int i9) {
        int i10 = this.f527b;
        int[] iArrCopyOf = this.f526a;
        int i11 = i10 + 4;
        if (i11 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f526a = iArrCopyOf;
        }
        iArrCopyOf[i10] = i;
        iArrCopyOf[i10 + 1] = i7;
        iArrCopyOf[i10 + 2] = i8;
        iArrCopyOf[i10 + 3] = i9;
        this.f527b = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i, int i7) {
        if (i < i7) {
            int i8 = i - 3;
            for (int i9 = i; i9 < i7; i9 += 3) {
                int[] iArr = this.f526a;
                int i10 = iArr[i9];
                int i11 = iArr[i7];
                if (i10 < i11 || (i10 == i11 && iArr[i9 + 1] <= iArr[i7 + 1])) {
                    i8 += 3;
                    g(i8, i9);
                }
            }
            g(i8 + 3, i7);
            f(i, i8);
            f(i8 + 6, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(int i, int i7) {
        int[] iArr = this.f526a;
        int i8 = iArr[i];
        iArr[i] = iArr[i7];
        iArr[i7] = i8;
        int i9 = i + 1;
        int i10 = i7 + 1;
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i + 2;
        int i13 = i7 + 2;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
    }

    public C0057w(int i) {
        this.f526a = new int[i];
    }
}
