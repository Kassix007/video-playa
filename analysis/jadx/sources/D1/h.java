package d1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C0953d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f11959q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f11960r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f11961s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C0952c f11962t0 = this.f11833J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f11963u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f11964v0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h() {
        this.f11841R.clear();
        this.f11841R.add(this.f11962t0);
        int length = this.f11840Q.length;
        for (int i = 0; i < length; i++) {
            this.f11840Q[i] = this.f11962t0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean A() {
        return this.f11964v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean B() {
        return this.f11964v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void Q(b1.c cVar, boolean z5) {
        if (this.f11843T == null) {
            return;
        }
        C0952c c0952c = this.f11962t0;
        cVar.getClass();
        int iN = b1.c.n(c0952c);
        if (this.f11963u0 == 1) {
            this.f11848Y = iN;
            this.f11849Z = 0;
            L(this.f11843T.k());
            O(0);
            return;
        }
        this.f11848Y = 0;
        this.f11849Z = iN;
        O(this.f11843T.q());
        L(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(int i) {
        this.f11962t0.l(i);
        this.f11964v0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(int i) {
        if (this.f11963u0 == i) {
            return;
        }
        this.f11963u0 = i;
        ArrayList arrayList = this.f11841R;
        arrayList.clear();
        if (this.f11963u0 == 1) {
            this.f11962t0 = this.f11832I;
        } else {
            this.f11962t0 = this.f11833J;
        }
        arrayList.add(this.f11962t0);
        C0952c[] c0952cArr = this.f11840Q;
        int length = c0952cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            c0952cArr[i7] = this.f11962t0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void b(b1.c cVar, boolean z5) {
        e eVar = (e) this.f11843T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        C0953d c0953d = this.f11843T;
        boolean z6 = c0953d != null && c0953d.f11878p0[0] == 2;
        if (this.f11963u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            C0953d c0953d2 = this.f11843T;
            z6 = c0953d2 != null && c0953d2.f11878p0[1] == 2;
        }
        if (this.f11964v0) {
            C0952c c0952c = this.f11962t0;
            if (c0952c.f11819c) {
                b1.f fVarK = cVar.k(c0952c);
                cVar.d(fVarK, this.f11962t0.d());
                if (this.f11960r0 != -1) {
                    if (z6) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f11961s0 != -1 && z6) {
                    b1.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f11964v0 = false;
                return;
            }
        }
        if (this.f11960r0 != -1) {
            b1.f fVarK3 = cVar.k(this.f11962t0);
            cVar.e(fVarK3, cVar.k(objI), this.f11960r0, 8);
            if (z6) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f11961s0 != -1) {
            b1.f fVarK4 = cVar.k(this.f11962t0);
            b1.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f11961s0, 8);
            if (z6) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f11959q0 != -1.0f) {
            b1.f fVarK6 = cVar.k(this.f11962t0);
            b1.f fVarK7 = cVar.k(objI2);
            float f = this.f11959q0;
            b1.b bVarL = cVar.l();
            bVarL.f9938d.g(fVarK6, -1.0f);
            bVarL.f9938d.g(fVarK7, f);
            cVar.c(bVarL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final boolean c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final C0952c i(int i) {
        int iA = O.c.a(i);
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        return null;
                    }
                }
            }
            if (this.f11963u0 == 0) {
                return this.f11962t0;
            }
            return null;
        }
        if (this.f11963u0 == 1) {
            return this.f11962t0;
        }
        return null;
    }
}
