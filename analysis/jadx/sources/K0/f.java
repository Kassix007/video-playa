package k0;

import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f14004e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f14005g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f14004e = qVar;
        this.f = qVar2;
        float[] fArr = C1172a.f13972b.f13973a;
        s sVar = qVar.f14029d;
        float[] fArr2 = qVar.i;
        s sVar2 = qVar2.f14029d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f14012b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f14005g = fArrG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.g
    public final long a(long j) {
        float fH = j0.o.h(j);
        float fG = j0.o.g(j);
        float fE = j0.o.e(j);
        float fD = j0.o.d(j);
        m mVar = this.f14004e.f14038p;
        float fD2 = (float) mVar.d(fH);
        float fD3 = (float) mVar.d(fG);
        float fD4 = (float) mVar.d(fE);
        float[] fArr = this.f14005g;
        float f = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
        float f7 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
        float f8 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
        q qVar = this.f;
        float fD5 = (float) qVar.f14035m.d(f);
        m mVar2 = qVar.f14035m;
        return AbstractC1145B.a(fD5, (float) mVar2.d(f7), (float) mVar2.d(f8), fD, qVar);
    }
}
