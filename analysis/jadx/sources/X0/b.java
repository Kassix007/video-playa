package X0;

import W0.h;
import r.S;
import r.r;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f8161a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile S f8162b = new S(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f8163c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object[] objArr = new Object[0];
        f8163c = objArr;
        synchronized (objArr) {
            f8162b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f8162b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f8162b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f8162b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f8162b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f8162b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        h.b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a a(float f) {
        float fD;
        a cVar;
        float[] fArr = f8161a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        a aVar = (a) f8162b.c(i);
        if (aVar != null) {
            return aVar;
        }
        S s6 = f8162b;
        if (s6.f16167q) {
            r.a(s6);
        }
        int iA = AbstractC1585a.a(s6.f16170t, i, s6.f16168r);
        if (iA >= 0) {
            return (a) f8162b.g(iA);
        }
        int i7 = -(iA + 1);
        int i8 = i7 - 1;
        if (i7 >= f8162b.f()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f});
            b(f, cVar2);
            return cVar2;
        }
        if (i8 < 0) {
            cVar = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f8162b.d(i8) / 100.0f;
            cVar = (a) f8162b.g(i8);
        }
        float fD2 = f8162b.d(i7) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVar2 = (a) f8162b.g(i7);
        float[] fArr2 = new float[9];
        for (int i9 = 0; i9 < 9; i9++) {
            float f7 = fArr[i9];
            float fB = cVar.b(f7);
            fArr2[i9] = ((aVar2.b(f7) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f, cVar3);
        return cVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(float f, c cVar) {
        synchronized (f8163c) {
            S sB = f8162b.clone();
            sB.e((int) (f * 100.0f), cVar);
            f8162b = sB;
        }
    }
}
