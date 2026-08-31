package b1;

import I2.A;
import Z.m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public f[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f[] f9956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9957h;
    public m i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i7 = 0; i7 < this.f9957h; i7++) {
            f[] fVarArr = this.f;
            f fVar = fVarArr[i7];
            if (!zArr[fVar.f9961r]) {
                m mVar = this.i;
                mVar.f8312r = fVar;
                int i8 = 8;
                if (i == -1) {
                    while (i8 >= 0) {
                        float f = ((f) mVar.f8312r).f9967x[i8];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i7;
                                break;
                            }
                            i8--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i];
                    while (true) {
                        if (i8 >= 0) {
                            float f7 = fVar2.f9967x[i8];
                            float f8 = ((f) mVar.f8312r).f9967x[i8];
                            if (f8 == f7) {
                                i8--;
                            } else if (f8 < f7) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.b
    public final boolean e() {
        return this.f9957h == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.b
    public final void i(c cVar, b bVar, boolean z5) {
        f fVar = bVar.f9935a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f9967x;
        C0689a c0689a = bVar.f9938d;
        int iD = c0689a.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = c0689a.e(i);
            float f = c0689a.f(i);
            m mVar = this.i;
            mVar.f8312r = fVarE;
            if (fVarE.f9960q) {
                boolean z6 = true;
                for (int i7 = 0; i7 < 9; i7++) {
                    float[] fArr2 = ((f) mVar.f8312r).f9967x;
                    float f7 = (fArr[i7] * f) + fArr2[i7];
                    fArr2[i7] = f7;
                    if (Math.abs(f7) < 1.0E-4f) {
                        ((f) mVar.f8312r).f9967x[i7] = 0.0f;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    ((e) mVar.f8313s).k((f) mVar.f8312r);
                }
            } else {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f8 = fArr[i8];
                    if (f8 != 0.0f) {
                        float f9 = f8 * f;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        ((f) mVar.f8312r).f9967x[i8] = f9;
                    } else {
                        ((f) mVar.f8312r).f9967x[i8] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f9936b = (bVar.f9936b * f) + this.f9936b;
        }
        k(fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(f fVar) {
        int i;
        int i7 = this.f9957h + 1;
        f[] fVarArr = this.f;
        if (i7 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f = fVarArr2;
            this.f9956g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f;
        int i8 = this.f9957h;
        fVarArr3[i8] = fVar;
        int i9 = i8 + 1;
        this.f9957h = i9;
        if (i9 > 1 && fVarArr3[i8].f9961r > fVar.f9961r) {
            int i10 = 0;
            while (true) {
                i = this.f9957h;
                if (i10 >= i) {
                    break;
                }
                this.f9956g[i10] = this.f[i10];
                i10++;
            }
            Arrays.sort(this.f9956g, 0, i, new A(5));
            for (int i11 = 0; i11 < this.f9957h; i11++) {
                this.f[i11] = this.f9956g[i11];
            }
        }
        fVar.f9960q = true;
        fVar.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(f fVar) {
        int i = 0;
        while (i < this.f9957h) {
            if (this.f[i] == fVar) {
                while (true) {
                    int i7 = this.f9957h;
                    if (i >= i7 - 1) {
                        this.f9957h = i7 - 1;
                        fVar.f9960q = false;
                        return;
                    } else {
                        f[] fVarArr = this.f;
                        int i8 = i + 1;
                        fVarArr[i] = fVarArr[i8];
                        i = i8;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.b
    public final String toString() {
        m mVar = this.i;
        String str = " goal -> (" + this.f9936b + ") : ";
        for (int i = 0; i < this.f9957h; i++) {
            mVar.f8312r = this.f[i];
            str = str + mVar + " ";
        }
        return str;
    }
}
