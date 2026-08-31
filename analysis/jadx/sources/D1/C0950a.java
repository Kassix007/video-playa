package d1;

import C0.S;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950a extends i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f11799s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f11800t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f11801u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f11802v0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean A() {
        return this.f11802v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean B() {
        return this.f11802v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean T() {
        int i;
        int i7;
        int i8;
        boolean z5 = true;
        int i9 = 0;
        while (true) {
            i = this.f11966r0;
            if (i9 >= i) {
                break;
            }
            C0953d c0953d = this.f11965q0[i9];
            if ((this.f11800t0 || c0953d.c()) && ((((i7 = this.f11799s0) == 0 || i7 == 1) && !c0953d.A()) || (((i8 = this.f11799s0) == 2 || i8 == 3) && !c0953d.B()))) {
                z5 = false;
            }
            i9++;
        }
        if (!z5 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < this.f11966r0; i10++) {
            C0953d c0953d2 = this.f11965q0[i10];
            if (this.f11800t0 || c0953d2.c()) {
                if (!z6) {
                    int i11 = this.f11799s0;
                    if (i11 == 0) {
                        iMax = c0953d2.i(2).d();
                    } else if (i11 == 1) {
                        iMax = c0953d2.i(4).d();
                    } else if (i11 == 2) {
                        iMax = c0953d2.i(3).d();
                    } else if (i11 == 3) {
                        iMax = c0953d2.i(5).d();
                    }
                    z6 = true;
                }
                int i12 = this.f11799s0;
                if (i12 == 0) {
                    iMax = Math.min(iMax, c0953d2.i(2).d());
                } else if (i12 == 1) {
                    iMax = Math.max(iMax, c0953d2.i(4).d());
                } else if (i12 == 2) {
                    iMax = Math.min(iMax, c0953d2.i(3).d());
                } else if (i12 == 3) {
                    iMax = Math.max(iMax, c0953d2.i(5).d());
                }
            }
        }
        int i13 = iMax + this.f11801u0;
        int i14 = this.f11799s0;
        if (i14 == 0 || i14 == 1) {
            J(i13, i13);
        } else {
            K(i13, i13);
        }
        this.f11802v0 = true;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int U() {
        int i = this.f11799s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void b(b1.c cVar, boolean z5) {
        boolean z6;
        int i;
        int i7;
        C0952c[] c0952cArr = this.f11840Q;
        C0952c c0952c = this.f11832I;
        c0952cArr[0] = c0952c;
        int i8 = 2;
        C0952c c0952c2 = this.f11833J;
        c0952cArr[2] = c0952c2;
        C0952c c0952c3 = this.f11834K;
        c0952cArr[1] = c0952c3;
        C0952c c0952c4 = this.f11835L;
        c0952cArr[3] = c0952c4;
        for (C0952c c0952c5 : c0952cArr) {
            c0952c5.i = cVar.k(c0952c5);
        }
        int i9 = this.f11799s0;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        C0952c c0952c6 = c0952cArr[i9];
        if (!this.f11802v0) {
            T();
        }
        if (this.f11802v0) {
            this.f11802v0 = false;
            int i10 = this.f11799s0;
            if (i10 == 0 || i10 == 1) {
                cVar.d(c0952c.i, this.f11848Y);
                cVar.d(c0952c3.i, this.f11848Y);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    cVar.d(c0952c2.i, this.f11849Z);
                    cVar.d(c0952c4.i, this.f11849Z);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f11966r0; i11++) {
            C0953d c0953d = this.f11965q0[i11];
            if ((this.f11800t0 || c0953d.c()) && ((((i7 = this.f11799s0) == 0 || i7 == 1) && c0953d.f11878p0[0] == 3 && c0953d.f11832I.f != null && c0953d.f11834K.f != null) || ((i7 == 2 || i7 == 3) && c0953d.f11878p0[1] == 3 && c0953d.f11833J.f != null && c0953d.f11835L.f != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = c0952c.g() || c0952c3.g();
        boolean z8 = c0952c2.g() || c0952c4.g();
        int i12 = !(!z6 && (((i = this.f11799s0) == 0 && z7) || ((i == 2 && z8) || ((i == 1 && z7) || (i == 3 && z8))))) ? 4 : 5;
        int i13 = 0;
        while (i13 < this.f11966r0) {
            C0953d c0953d2 = this.f11965q0[i13];
            if (this.f11800t0 || c0953d2.c()) {
                b1.f fVarK = cVar.k(c0953d2.f11840Q[this.f11799s0]);
                C0952c[] c0952cArr2 = c0953d2.f11840Q;
                int i14 = this.f11799s0;
                C0952c c0952c7 = c0952cArr2[i14];
                c0952c7.i = fVarK;
                C0952c c0952c8 = c0952c7.f;
                int i15 = (c0952c8 == null || c0952c8.f11820d != this) ? 0 : c0952c7.f11822g;
                if (i14 == 0 || i14 == i8) {
                    b1.f fVar = c0952c6.i;
                    int i16 = this.f11801u0 - i15;
                    b1.b bVarL = cVar.l();
                    b1.f fVarM = cVar.m();
                    fVarM.f9963t = 0;
                    bVarL.c(fVar, fVarK, fVarM, i16);
                    cVar.c(bVarL);
                } else {
                    b1.f fVar2 = c0952c6.i;
                    int i17 = this.f11801u0 + i15;
                    b1.b bVarL2 = cVar.l();
                    b1.f fVarM2 = cVar.m();
                    fVarM2.f9963t = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i17);
                    cVar.c(bVarL2);
                }
                cVar.e(c0952c6.i, fVarK, this.f11801u0 + i15, i12);
            }
            i13++;
            i8 = 2;
        }
        int i18 = this.f11799s0;
        if (i18 == 0) {
            cVar.e(c0952c3.i, c0952c.i, 0, 8);
            cVar.e(c0952c.i, this.f11843T.f11834K.i, 0, 4);
            cVar.e(c0952c.i, this.f11843T.f11832I.i, 0, 0);
            return;
        }
        if (i18 == 1) {
            cVar.e(c0952c.i, c0952c3.i, 0, 8);
            cVar.e(c0952c.i, this.f11843T.f11832I.i, 0, 4);
            cVar.e(c0952c.i, this.f11843T.f11834K.i, 0, 0);
        } else if (i18 == 2) {
            cVar.e(c0952c4.i, c0952c2.i, 0, 8);
            cVar.e(c0952c2.i, this.f11843T.f11835L.i, 0, 4);
            cVar.e(c0952c2.i, this.f11843T.f11833J.i, 0, 0);
        } else if (i18 == 3) {
            cVar.e(c0952c2.i, c0952c4.i, 0, 8);
            cVar.e(c0952c2.i, this.f11843T.f11833J.i, 0, 4);
            cVar.e(c0952c2.i, this.f11843T.f11835L.i, 0, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final String toString() {
        String strK = k1.i.k(new StringBuilder("[Barrier] "), this.f11864h0, " {");
        for (int i = 0; i < this.f11966r0; i++) {
            C0953d c0953d = this.f11965q0[i];
            if (i > 0) {
                strK = S.l(strK, ", ");
            }
            StringBuilder sbQ = S.q(strK);
            sbQ.append(c0953d.f11864h0);
            strK = sbQ.toString();
        }
        return S.l(strK, "}");
    }
}
