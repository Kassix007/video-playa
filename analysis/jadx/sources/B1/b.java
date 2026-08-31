package b1;

import B0.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0689a f9938d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f9935a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9936b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9937c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9939e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(G0 g02) {
        this.f9938d = new C0689a(this, g02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(c cVar, int i) {
        this.f9938d.g(cVar.j(i), 1.0f);
        this.f9938d.g(cVar.j(i), -1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            this.f9936b = i;
        }
        if (z5) {
            this.f9938d.g(fVar, 1.0f);
            this.f9938d.g(fVar2, -1.0f);
            this.f9938d.g(fVar3, -1.0f);
        } else {
            this.f9938d.g(fVar, -1.0f);
            this.f9938d.g(fVar2, 1.0f);
            this.f9938d.g(fVar3, 1.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            this.f9936b = i;
        }
        if (z5) {
            this.f9938d.g(fVar, 1.0f);
            this.f9938d.g(fVar2, -1.0f);
            this.f9938d.g(fVar3, 1.0f);
        } else {
            this.f9938d.g(fVar, -1.0f);
            this.f9938d.g(fVar2, 1.0f);
            this.f9938d.g(fVar3, -1.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e() {
        return this.f9935a == null && this.f9936b == 0.0f && this.f9938d.d() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f f(boolean[] zArr, f fVar) {
        int i;
        int iD = this.f9938d.d();
        f fVar2 = null;
        float f = 0.0f;
        for (int i7 = 0; i7 < iD; i7++) {
            float f7 = this.f9938d.f(i7);
            if (f7 < 0.0f) {
                f fVarE = this.f9938d.e(i7);
                if ((zArr == null || !zArr[fVarE.f9961r]) && fVarE != fVar && (((i = fVarE.f9959B) == 3 || i == 4) && f7 < f)) {
                    f = f7;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(f fVar) {
        f fVar2 = this.f9935a;
        if (fVar2 != null) {
            this.f9938d.g(fVar2, -1.0f);
            this.f9935a.f9962s = -1;
            this.f9935a = null;
        }
        float fH = this.f9938d.h(fVar, true) * (-1.0f);
        this.f9935a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f9936b /= fH;
        C0689a c0689a = this.f9938d;
        int i = c0689a.f9934h;
        for (int i7 = 0; i != -1 && i7 < c0689a.f9928a; i7++) {
            float[] fArr = c0689a.f9933g;
            fArr[i] = fArr[i] / fH;
            i = c0689a.f[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(c cVar, f fVar, boolean z5) {
        if (fVar.f9965v) {
            float fC = this.f9938d.c(fVar);
            this.f9936b = (fVar.f9964u * fC) + this.f9936b;
            this.f9938d.h(fVar, z5);
            if (z5) {
                fVar.b(this);
            }
            if (this.f9938d.d() == 0) {
                this.f9939e = true;
                cVar.f9942b = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(c cVar, b bVar, boolean z5) {
        C0689a c0689a = this.f9938d;
        c0689a.getClass();
        float fC = c0689a.c(bVar.f9935a);
        c0689a.h(bVar.f9935a, z5);
        C0689a c0689a2 = bVar.f9938d;
        int iD = c0689a2.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = c0689a2.e(i);
            c0689a.a(fVarE, c0689a2.c(fVarE) * fC, z5);
        }
        this.f9936b = (bVar.f9936b * fC) + this.f9936b;
        if (z5) {
            bVar.f9935a.b(this);
        }
        if (this.f9935a == null || this.f9938d.d() != 0) {
            return;
        }
        this.f9939e = true;
        cVar.f9942b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            b1.f r0 = r10.f9935a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            b1.f r1 = r10.f9935a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = C0.S.l(r0, r1)
            float r1 = r10.f9936b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = C0.S.q(r0)
            float r1 = r10.f9936b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            b1.a r5 = r10.f9938d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            b1.a r6 = r10.f9938d
            b1.f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            b1.a r7 = r10.f9938d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = C0.S.l(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = C0.S.l(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = C0.S.l(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = C0.S.l(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = C0.S.l(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.b.toString():java.lang.String");
    }
}
