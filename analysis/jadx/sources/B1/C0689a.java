package b1;

import B0.G0;
import C0.S;
import java.util.Arrays;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0 f9930c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9928a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9931d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9932e = new int[8];
    public int[] f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f9933g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9934h = -1;
    public int i = -1;
    public boolean j = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0689a(b bVar, G0 g02) {
        this.f9929b = bVar;
        this.f9930c = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(f fVar, float f, boolean z5) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f9934h;
            b bVar = this.f9929b;
            if (i == -1) {
                this.f9934h = 0;
                this.f9933g[0] = f;
                this.f9932e[0] = fVar.f9961r;
                this.f[0] = -1;
                fVar.f9958A++;
                fVar.a(bVar);
                this.f9928a++;
                if (this.j) {
                    return;
                }
                int i7 = this.i + 1;
                this.i = i7;
                int[] iArr = this.f9932e;
                if (i7 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i != -1 && i9 < this.f9928a; i9++) {
                int i10 = this.f9932e[i];
                int i11 = fVar.f9961r;
                if (i10 == i11) {
                    float[] fArr = this.f9933g;
                    float f7 = fArr[i] + f;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i] = f7;
                    if (f7 == 0.0f) {
                        if (i == this.f9934h) {
                            this.f9934h = this.f[i];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i8] = iArr2[i];
                        }
                        if (z5) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        fVar.f9958A--;
                        this.f9928a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i;
                }
                i = this.f[i];
            }
            int length = this.i;
            int i12 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f9932e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i12;
            }
            int[] iArr4 = this.f9932e;
            if (length >= iArr4.length && this.f9928a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f9932e;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        length = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f9932e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i14 = this.f9931d * 2;
                this.f9931d = i14;
                this.j = false;
                this.i = length - 1;
                this.f9933g = Arrays.copyOf(this.f9933g, i14);
                this.f9932e = Arrays.copyOf(this.f9932e, this.f9931d);
                this.f = Arrays.copyOf(this.f, this.f9931d);
            }
            this.f9932e[length] = fVar.f9961r;
            this.f9933g[length] = f;
            if (i8 != -1) {
                int[] iArr7 = this.f;
                iArr7[length] = iArr7[i8];
                iArr7[i8] = length;
            } else {
                this.f[length] = this.f9934h;
                this.f9934h = length;
            }
            fVar.f9958A++;
            fVar.a(bVar);
            this.f9928a++;
            if (!this.j) {
                this.i++;
            }
            int i15 = this.i;
            int[] iArr8 = this.f9932e;
            if (i15 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = this.f9934h;
        for (int i7 = 0; i != -1 && i7 < this.f9928a; i7++) {
            f fVar = ((f[]) this.f9930c.f236t)[this.f9932e[i]];
            if (fVar != null) {
                fVar.b(this.f9929b);
            }
            i = this.f[i];
        }
        this.f9934h = -1;
        this.i = -1;
        this.j = false;
        this.f9928a = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c(f fVar) {
        int i = this.f9934h;
        for (int i7 = 0; i != -1 && i7 < this.f9928a; i7++) {
            if (this.f9932e[i] == fVar.f9961r) {
                return this.f9933g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        return this.f9928a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f e(int i) {
        int i7 = this.f9934h;
        for (int i8 = 0; i7 != -1 && i8 < this.f9928a; i8++) {
            if (i8 == i) {
                return ((f[]) this.f9930c.f236t)[this.f9932e[i7]];
            }
            i7 = this.f[i7];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f(int i) {
        int i7 = this.f9934h;
        for (int i8 = 0; i7 != -1 && i8 < this.f9928a; i8++) {
            if (i8 == i) {
                return this.f9933g[i7];
            }
            i7 = this.f[i7];
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(f fVar, float f) {
        if (f == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.f9934h;
        b bVar = this.f9929b;
        if (i == -1) {
            this.f9934h = 0;
            this.f9933g[0] = f;
            this.f9932e[0] = fVar.f9961r;
            this.f[0] = -1;
            fVar.f9958A++;
            fVar.a(bVar);
            this.f9928a++;
            if (this.j) {
                return;
            }
            int i7 = this.i + 1;
            this.i = i7;
            int[] iArr = this.f9932e;
            if (i7 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i != -1 && i9 < this.f9928a; i9++) {
            int i10 = this.f9932e[i];
            int i11 = fVar.f9961r;
            if (i10 == i11) {
                this.f9933g[i] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i;
            }
            i = this.f[i];
        }
        int length = this.i;
        int i12 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f9932e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i12;
        }
        int[] iArr3 = this.f9932e;
        if (length >= iArr3.length && this.f9928a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f9932e;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    length = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f9932e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i14 = this.f9931d * 2;
            this.f9931d = i14;
            this.j = false;
            this.i = length - 1;
            this.f9933g = Arrays.copyOf(this.f9933g, i14);
            this.f9932e = Arrays.copyOf(this.f9932e, this.f9931d);
            this.f = Arrays.copyOf(this.f, this.f9931d);
        }
        this.f9932e[length] = fVar.f9961r;
        this.f9933g[length] = f;
        if (i8 != -1) {
            int[] iArr6 = this.f;
            iArr6[length] = iArr6[i8];
            iArr6[i8] = length;
        } else {
            this.f[length] = this.f9934h;
            this.f9934h = length;
        }
        fVar.f9958A++;
        fVar.a(bVar);
        int i15 = this.f9928a + 1;
        this.f9928a = i15;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.f9932e;
        if (i15 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float h(f fVar, boolean z5) {
        int i = this.f9934h;
        if (i == -1) {
            return 0.0f;
        }
        int i7 = 0;
        int i8 = -1;
        while (i != -1 && i7 < this.f9928a) {
            if (this.f9932e[i] == fVar.f9961r) {
                if (i == this.f9934h) {
                    this.f9934h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i8] = iArr[i];
                }
                if (z5) {
                    fVar.b(this.f9929b);
                }
                fVar.f9958A--;
                this.f9928a--;
                this.f9932e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.f9933g[i];
            }
            i7++;
            i8 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f9934h;
        String string = "";
        for (int i7 = 0; i != -1 && i7 < this.f9928a; i7++) {
            StringBuilder sbQ = S.q(S.l(string, " -> "));
            sbQ.append(this.f9933g[i]);
            sbQ.append(" : ");
            StringBuilder sbQ2 = S.q(sbQ.toString());
            sbQ2.append(((f[]) this.f9930c.f236t)[this.f9932e[i]]);
            string = sbQ2.toString();
            i = this.f[i];
        }
        return string;
    }
}
