package r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1.d[] f16312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16314c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k() {
        this.f16312a = null;
        this.f16314c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.d[] getPathData() {
        return this.f16312a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getPathName() {
        return this.f16313b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPathData(n1.d[] dVarArr) {
        n1.d[] dVarArr2 = this.f16312a;
        boolean z5 = false;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= dVarArr2.length) {
                    z5 = true;
                    break;
                }
                n1.d dVar = dVarArr2[i];
                char c7 = dVar.f15130a;
                n1.d dVar2 = dVarArr[i];
                if (c7 != dVar2.f15130a || dVar.f15131b.length != dVar2.f15131b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z5) {
            this.f16312a = E3.h.x(dVarArr);
            return;
        }
        n1.d[] dVarArr3 = this.f16312a;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr3[i7].f15130a = dVarArr[i7].f15130a;
            int i8 = 0;
            while (true) {
                float[] fArr = dVarArr[i7].f15131b;
                if (i8 < fArr.length) {
                    dVarArr3[i7].f15131b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f16312a = null;
        this.f16314c = 0;
        this.f16313b = kVar.f16313b;
        this.f16312a = E3.h.x(kVar.f16312a);
    }
}
