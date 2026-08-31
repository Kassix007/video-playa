package g1;

import java.util.Arrays;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1078h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f12921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f12922e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f12923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f12924h;
    public int i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f12925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12926l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, float f) {
        int i7 = this.f;
        int[] iArr = this.f12921d;
        if (i7 >= iArr.length) {
            this.f12921d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f12922e;
            this.f12922e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f12921d;
        int i8 = this.f;
        iArr2[i8] = i;
        float[] fArr2 = this.f12922e;
        this.f = i8 + 1;
        fArr2[i8] = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, int i7) {
        int i8 = this.f12920c;
        int[] iArr = this.f12918a;
        if (i8 >= iArr.length) {
            this.f12918a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f12919b;
            this.f12919b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f12918a;
        int i9 = this.f12920c;
        iArr3[i9] = i;
        int[] iArr4 = this.f12919b;
        this.f12920c = i9 + 1;
        iArr4[i9] = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, String str) {
        int i7 = this.i;
        int[] iArr = this.f12923g;
        if (i7 >= iArr.length) {
            this.f12923g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f12924h;
            this.f12924h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f12923g;
        int i8 = this.i;
        iArr2[i8] = i;
        String[] strArr2 = this.f12924h;
        this.i = i8 + 1;
        strArr2[i8] = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, boolean z5) {
        int i7 = this.f12926l;
        int[] iArr = this.j;
        if (i7 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f12925k;
            this.f12925k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i8 = this.f12926l;
        iArr2[i8] = i;
        boolean[] zArr2 = this.f12925k;
        this.f12926l = i8 + 1;
        zArr2[i8] = z5;
    }
}
