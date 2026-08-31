package k0;

import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f14017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f14018e;
    public static final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f14019g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(C1172a.f13972b.f13973a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f14017d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f14018e = fArr;
        f = j.f(fArrG);
        f14019g = j.f(fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long d(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f14019g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f16) + (fArr2[4] * f15) + (fArr2[1] * f14))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f16) + ((fArr2[3] * f15) + (fArr2[0] * f14)))) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float e(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f14019g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f;
        return (fArr2[8] * f16) + (fArr2[5] * f15) + (fArr2[2] * f14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long f(float f7, float f8, float f9, float f10, c cVar) {
        float[] fArr = f14017d;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        float fZ = P1.z(f11);
        float fZ2 = P1.z(f12);
        float fZ3 = P1.z(f13);
        float[] fArr2 = f14018e;
        return AbstractC1145B.a((fArr2[6] * fZ3) + (fArr2[3] * fZ2) + (fArr2[0] * fZ), (fArr2[7] * fZ3) + (fArr2[4] * fZ2) + (fArr2[1] * fZ), (fArr2[8] * fZ3) + (fArr2[5] * fZ2) + (fArr2[2] * fZ), f10, cVar);
    }
}
