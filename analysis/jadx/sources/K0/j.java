package k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f14011a = new s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f14012b = new s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f14013c = new s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f14014d = new s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f14015e = {0.964212f, 1.0f, 0.825188f};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c a(c cVar) {
        if (b.a(cVar.f13980b, b.f13974a)) {
            q qVar = (q) cVar;
            s sVar = qVar.f14029d;
            s sVar2 = f14012b;
            if (!d(sVar, sVar2)) {
                return new q(qVar.f13979a, qVar.f14032h, sVar2, g(c(C1172a.f13972b.f13973a, sVar.a(), sVar2.a()), qVar.i), qVar.f14033k, qVar.f14036n, qVar.f14030e, qVar.f, qVar.f14031g, -1);
            }
        }
        return cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = (((((f8 * f11) + ((f7 * f10) + (f * f9))) - (f9 * f10)) - (f7 * f8)) - (f * f11)) * 0.5f;
        return f12 < 0.0f ? -f12 : f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f = fArr4[0];
        float f7 = fArr[0] * f;
        float f8 = fArr4[1];
        float f9 = fArr[1] * f8;
        float f10 = fArr4[2];
        return g(fArrF, new float[]{f7, f9, fArr[2] * f10, fArr[3] * f, fArr[4] * f8, fArr[5] * f10, f * fArr[6], f8 * fArr[7], f10 * fArr[8]});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f14046a - sVar2.f14046a) < 0.001f && Math.abs(sVar.f14047b - sVar2.f14047b) < 0.001f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new e(cVar, cVar, 1);
        }
        long j = cVar.f13980b;
        long j7 = b.f13974a;
        return (b.a(j, j7) && b.a(cVar2.f13980b, j7)) ? new f((q) cVar, (q) cVar2) : new g(cVar, cVar2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] f(float[] fArr) {
        float f = fArr[0];
        float f7 = fArr[3];
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f9 * f14);
        float f17 = (f9 * f13) - (f10 * f12);
        float f18 = (f8 * f17) + (f7 * f16) + (f * f15);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = ((f8 * f13) - (f7 * f14)) / f18;
        fArr2[4] = ((f14 * f) - (f8 * f12)) / f18;
        fArr2[5] = ((f12 * f7) - (f13 * f)) / f18;
        fArr2[6] = ((f7 * f11) - (f8 * f10)) / f18;
        fArr2[7] = ((f8 * f9) - (f11 * f)) / f18;
        fArr2[8] = ((f * f10) - (f7 * f9)) / f18;
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f7 = fArr[3];
        float f8 = fArr2[1];
        float f9 = fArr[6];
        float f10 = fArr2[2];
        fArr3[0] = (f9 * f10) + (f7 * f8) + f;
        float f11 = fArr[1];
        float f12 = fArr2[0];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = f14 * f10;
        fArr3[1] = f15 + (f8 * f13) + (f11 * f12);
        float f16 = fArr[2] * f12;
        float f17 = fArr[5];
        float f18 = (fArr2[1] * f17) + f16;
        float f19 = fArr[8];
        fArr3[2] = (f10 * f19) + f18;
        float f20 = fArr[0];
        float f21 = fArr2[3] * f20;
        float f22 = fArr2[4];
        float f23 = (f7 * f22) + f21;
        float f24 = fArr2[5];
        fArr3[3] = (f9 * f24) + f23;
        float f25 = fArr[1];
        float f26 = fArr2[3];
        float f27 = f13 * f22;
        fArr3[4] = (f14 * f24) + f27 + (f25 * f26);
        float f28 = fArr[2];
        float f29 = f24 * f19;
        fArr3[5] = f29 + (f17 * fArr2[4]) + (f26 * f28);
        float f30 = f20 * fArr2[6];
        float f31 = fArr[3];
        float f32 = fArr2[7];
        float f33 = (f31 * f32) + f30;
        float f34 = fArr2[8];
        fArr3[6] = (f9 * f34) + f33;
        float f35 = fArr2[6];
        float f36 = f14 * f34;
        fArr3[7] = f36 + (fArr[4] * f32) + (f25 * f35);
        float f37 = f19 * f34;
        fArr3[8] = f37 + (fArr[5] * fArr2[7]) + (f28 * f35);
        return fArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f7 = fArr2[1];
        float f8 = fArr2[2];
        fArr2[0] = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f);
        return fArr2;
    }
}
