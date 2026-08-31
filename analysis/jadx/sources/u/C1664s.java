package u;

import java.util.Arrays;

/* JADX INFO: renamed from: u.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1664s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17024e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f17025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17026h;
    public float i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f17027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f17028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f17029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f17030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f17031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f17033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f17034r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1664s(int i, float f, float f7, float f8, float f9, float f10, float f11) {
        boolean z5;
        int i7;
        float f12;
        float f13;
        this.f17020a = f;
        this.f17021b = f7;
        this.f17022c = f8;
        this.f17023d = f9;
        this.f17024e = f10;
        this.f = f11;
        float f14 = f10 - f8;
        float f15 = f11 - f9;
        float f16 = 0.0f;
        int i8 = 1;
        boolean z6 = i == 1 || (i == 4 ? f15 > 0.0f : !(i != 5 || f15 >= 0.0f));
        float f17 = z6 ? -1.0f : 1.0f;
        this.f17029m = f17;
        float f18 = 1 / (f7 - f);
        this.f17027k = f18;
        float[] fArr = new float[101];
        this.j = fArr;
        boolean z7 = i == 3;
        if (z7 || Math.abs(f14) < 0.001f || Math.abs(f15) < 0.001f) {
            float fHypot = (float) Math.hypot(f15, f14);
            this.f17025g = fHypot;
            this.f17028l = fHypot * f18;
            this.f17033q = f14 * f18;
            this.f17034r = f15 * f18;
            this.f17030n = Float.NaN;
            this.f17031o = Float.NaN;
            z5 = true;
        } else {
            this.f17030n = f14 * f17;
            this.f17031o = f15 * (-f17);
            this.f17033q = z6 ? f10 : f8;
            this.f17034r = z6 ? f9 : f11;
            float f19 = f10 - f8;
            float f20 = f9 - f11;
            float[] fArr2 = AbstractC1644d.i;
            int i9 = 90;
            float f21 = 90;
            float f22 = f20;
            float fHypot2 = 0.0f;
            float f23 = 0.0f;
            int i10 = 1;
            while (true) {
                i7 = i8;
                f12 = f16;
                double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) i9));
                float fSin = ((float) Math.sin(radians)) * f19;
                float fCos = ((float) Math.cos(radians)) * f20;
                float f24 = fSin - f23;
                f13 = f21;
                fHypot2 += (float) Math.hypot(f24, fCos - f22);
                fArr2[i10] = fHypot2;
                i9 = 90;
                if (i10 == 90) {
                    break;
                }
                i10++;
                f22 = fCos;
                f21 = f13;
                f16 = f12;
                f23 = fSin;
                i8 = i7;
            }
            this.f17025g = fHypot2;
            int i11 = i7;
            while (true) {
                fArr2[i11] = fArr2[i11] / fHypot2;
                if (i11 == 90) {
                    break;
                } else {
                    i11++;
                }
            }
            int length = fArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                float f25 = i12 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f25);
                if (iBinarySearch >= 0) {
                    fArr[i12] = iBinarySearch / f13;
                } else if (iBinarySearch == -1) {
                    fArr[i12] = f12;
                } else {
                    int i13 = -iBinarySearch;
                    int i14 = i13 - 2;
                    float f26 = i14;
                    float f27 = fArr2[i14];
                    fArr[i12] = (((f25 - f27) / (fArr2[i13 - 1] - f27)) + f26) / f13;
                }
            }
            this.f17028l = this.f17025g * this.f17027k;
            z5 = z7;
        }
        this.f17032p = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a() {
        float f = this.f17030n * this.i;
        return f * this.f17029m * (this.f17028l / ((float) Math.hypot(f, (-this.f17031o) * this.f17026h)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        float f = this.f17030n * this.i;
        float f7 = (-this.f17031o) * this.f17026h;
        return f7 * this.f17029m * (this.f17028l / ((float) Math.hypot(f, f7)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(float f) {
        float f7 = (this.f17029m == -1.0f ? this.f17021b - f : f - this.f17020a) * this.f17027k;
        float fA = 0.0f;
        if (f7 > 0.0f) {
            fA = 1.0f;
            if (f7 < 1.0f) {
                float f8 = f7 * 100;
                int i = (int) f8;
                float[] fArr = this.j;
                float f9 = fArr[i];
                fA = k1.i.a(fArr[i + 1], f9, f8 - i, f9);
            }
        }
        double d5 = fA * 1.5707964f;
        this.f17026h = (float) Math.sin(d5);
        this.i = (float) Math.cos(d5);
    }
}
