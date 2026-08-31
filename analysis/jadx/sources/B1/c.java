package b1;

import B0.G0;
import Z.m;
import d1.C0952c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f9940q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f9944d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G0 f9950m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f9953p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9941a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9942b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9943c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9945e = 32;
    public int f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9947h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9948k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9949l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f[] f9951n = new f[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9952o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f9946g = new b[32];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() {
        s();
        G0 g02 = new G0(19, false);
        g02.f234r = new d();
        g02.f235s = new d();
        g02.f236t = new f[32];
        this.f9950m = g02;
        e eVar = new e(g02);
        eVar.f = new f[128];
        eVar.f9956g = new f[128];
        eVar.f9957h = 0;
        eVar.i = new m(eVar);
        this.f9944d = eVar;
        this.f9953p = new b(g02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int n(Object obj) {
        f fVar = ((C0952c) obj).i;
        if (fVar != null) {
            return (int) (fVar.f9964u + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f a(int i) {
        d dVar = (d) this.f9950m.f235s;
        int i7 = dVar.f9955b;
        Object obj = null;
        if (i7 > 0) {
            int i8 = i7 - 1;
            Object[] objArr = dVar.f9954a;
            Object obj2 = objArr[i8];
            objArr[i8] = null;
            dVar.f9955b = i8;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i);
            fVar.f9959B = i;
        } else {
            fVar.c();
            fVar.f9959B = i;
        }
        int i9 = this.f9952o;
        int i10 = this.f9941a;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            this.f9941a = i11;
            this.f9951n = (f[]) Arrays.copyOf(this.f9951n, i11);
        }
        f[] fVarArr = this.f9951n;
        int i12 = this.f9952o;
        this.f9952o = i12 + 1;
        fVarArr[i12] = fVar;
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(f fVar, f fVar2, int i, float f, f fVar3, f fVar4, int i7, int i8) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f9938d.g(fVar, 1.0f);
            bVarL.f9938d.g(fVar4, 1.0f);
            bVarL.f9938d.g(fVar2, -2.0f);
        } else if (f == 0.5f) {
            bVarL.f9938d.g(fVar, 1.0f);
            bVarL.f9938d.g(fVar2, -1.0f);
            bVarL.f9938d.g(fVar3, -1.0f);
            bVarL.f9938d.g(fVar4, 1.0f);
            if (i > 0 || i7 > 0) {
                bVarL.f9936b = (-i) + i7;
            }
        } else if (f <= 0.0f) {
            bVarL.f9938d.g(fVar, -1.0f);
            bVarL.f9938d.g(fVar2, 1.0f);
            bVarL.f9936b = i;
        } else if (f >= 1.0f) {
            bVarL.f9938d.g(fVar4, -1.0f);
            bVarL.f9938d.g(fVar3, 1.0f);
            bVarL.f9936b = -i7;
        } else {
            float f7 = 1.0f - f;
            bVarL.f9938d.g(fVar, f7 * 1.0f);
            bVarL.f9938d.g(fVar2, f7 * (-1.0f));
            bVarL.f9938d.g(fVar3, (-1.0f) * f);
            bVarL.f9938d.g(fVar4, 1.0f * f);
            if (i > 0 || i7 > 0) {
                bVarL.f9936b = (i7 * f) + ((-i) * f7);
            }
        }
        if (i8 != 8) {
            bVarL.a(this, i8);
        }
        c(bVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(b1.b r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f9948k
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f9949l
            if (r2 >= r4) goto L13
            int r2 = r0.j
            int r2 = r2 + r3
            int r4 = r0.f
            if (r2 < r4) goto L16
        L13:
            r0.o()
        L16:
            boolean r2 = r1.f9939e
            if (r2 != 0) goto L1be
            java.util.ArrayList r2 = r1.f9937c
            b1.b[] r5 = r0.f9946g
            int r5 = r5.length
            r6 = -1
            if (r5 != 0) goto L23
            goto L7d
        L23:
            r5 = 0
        L24:
            if (r5 != 0) goto L6d
            b1.a r7 = r1.f9938d
            int r7 = r7.d()
            r8 = 0
        L2d:
            if (r8 >= r7) goto L44
            b1.a r9 = r1.f9938d
            b1.f r9 = r9.e(r8)
            int r10 = r9.f9962s
            if (r10 != r6) goto L3e
            boolean r10 = r9.f9965v
            if (r10 != 0) goto L3e
            goto L41
        L3e:
            r2.add(r9)
        L41:
            int r8 = r8 + 1
            goto L2d
        L44:
            int r7 = r2.size()
            if (r7 <= 0) goto L6b
            r8 = 0
        L4b:
            if (r8 >= r7) goto L67
            java.lang.Object r9 = r2.get(r8)
            b1.f r9 = (b1.f) r9
            boolean r10 = r9.f9965v
            if (r10 == 0) goto L5b
            r1.h(r0, r9, r3)
            goto L64
        L5b:
            b1.b[] r10 = r0.f9946g
            int r9 = r9.f9962s
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L64:
            int r8 = r8 + 1
            goto L4b
        L67:
            r2.clear()
            goto L24
        L6b:
            r5 = r3
            goto L24
        L6d:
            b1.f r2 = r1.f9935a
            if (r2 == 0) goto L7d
            b1.a r2 = r1.f9938d
            int r2 = r2.d()
            if (r2 != 0) goto L7d
            r1.f9939e = r3
            r0.f9942b = r3
        L7d:
            boolean r2 = r1.e()
            if (r2 == 0) goto L85
            goto L1c4
        L85:
            float r2 = r1.f9936b
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto Lad
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f9936b = r2
            b1.a r2 = r1.f9938d
            int r7 = r2.f9934h
            r8 = 0
        L96:
            r9 = -1
            if (r7 == r9) goto Lad
            int r9 = r2.f9928a
            if (r8 >= r9) goto Lad
            float[] r9 = r2.f9933g
            r10 = r9[r7]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10 * r11
            r9[r7] = r10
            int[] r9 = r2.f
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L96
        Lad:
            b1.a r2 = r1.f9938d
            int r2 = r2.d()
            r7 = 0
            r11 = r5
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        Lbb:
            if (r8 >= r2) goto L112
            b1.a r15 = r1.f9938d
            float r15 = r15.f(r8)
            b1.a r4 = r1.f9938d
            b1.f r4 = r4.e(r8)
            r16 = r5
            int r5 = r4.f9959B
            if (r5 != r3) goto Leb
            if (r9 != 0) goto Lda
            int r5 = r4.f9958A
            if (r5 > r3) goto Ld6
            goto Le9
        Ld6:
            r12 = 0
        Ld7:
            r9 = r4
            r11 = r15
            goto L10d
        Lda:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto Le3
            int r5 = r4.f9958A
            if (r5 > r3) goto Ld6
            goto Le9
        Le3:
            if (r12 != 0) goto L10d
            int r5 = r4.f9958A
            if (r5 > r3) goto L10d
        Le9:
            r12 = r3
            goto Ld7
        Leb:
            if (r9 != 0) goto L10d
            int r5 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r5 >= 0) goto L10d
            if (r10 != 0) goto Lfc
            int r5 = r4.f9958A
            if (r5 > r3) goto Lf8
            goto L10b
        Lf8:
            r14 = 0
        Lf9:
            r10 = r4
            r13 = r15
            goto L10d
        Lfc:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L105
            int r5 = r4.f9958A
            if (r5 > r3) goto Lf8
            goto L10b
        L105:
            if (r14 != 0) goto L10d
            int r5 = r4.f9958A
            if (r5 > r3) goto L10d
        L10b:
            r14 = r3
            goto Lf9
        L10d:
            int r8 = r8 + 1
            r5 = r16
            goto Lbb
        L112:
            r16 = r5
            if (r9 == 0) goto L117
            goto L118
        L117:
            r9 = r10
        L118:
            if (r9 != 0) goto L11c
            r2 = r3
            goto L120
        L11c:
            r1.g(r9)
            r2 = 0
        L120:
            b1.a r4 = r1.f9938d
            int r4 = r4.d()
            if (r4 != 0) goto L12a
            r1.f9939e = r3
        L12a:
            if (r2 == 0) goto L1ae
            int r2 = r0.j
            int r2 = r2 + r3
            int r4 = r0.f
            if (r2 < r4) goto L136
            r0.o()
        L136:
            r2 = 3
            b1.f r2 = r0.a(r2)
            int r4 = r0.f9943c
            int r4 = r4 + r3
            r0.f9943c = r4
            int r5 = r0.j
            int r5 = r5 + r3
            r0.j = r5
            r2.f9961r = r4
            B0.G0 r5 = r0.f9950m
            java.lang.Object r8 = r5.f236t
            b1.f[] r8 = (b1.f[]) r8
            r8[r4] = r2
            r1.f9935a = r2
            int r4 = r0.f9948k
            r17.h(r18)
            int r8 = r0.f9948k
            int r4 = r4 + r3
            if (r8 != r4) goto L1ae
            b1.b r4 = r0.f9953p
            r4.f9935a = r7
            b1.a r8 = r4.f9938d
            r8.b()
            r8 = 0
        L165:
            b1.a r9 = r1.f9938d
            int r9 = r9.d()
            if (r8 >= r9) goto L181
            b1.a r9 = r1.f9938d
            b1.f r9 = r9.e(r8)
            b1.a r10 = r1.f9938d
            float r10 = r10.f(r8)
            b1.a r11 = r4.f9938d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L165
        L181:
            b1.b r4 = r0.f9953p
            r0.r(r4)
            int r4 = r2.f9962s
            if (r4 != r6) goto L1ac
            b1.f r4 = r1.f9935a
            if (r4 != r2) goto L197
            b1.f r2 = r1.f(r7, r2)
            if (r2 == 0) goto L197
            r1.g(r2)
        L197:
            boolean r2 = r1.f9939e
            if (r2 != 0) goto L1a0
            b1.f r2 = r1.f9935a
            r2.e(r0, r1)
        L1a0:
            java.lang.Object r2 = r5.f234r
            b1.d r2 = (b1.d) r2
            r2.b(r1)
            int r2 = r0.f9948k
            int r2 = r2 - r3
            r0.f9948k = r2
        L1ac:
            r4 = r3
            goto L1af
        L1ae:
            r4 = 0
        L1af:
            b1.f r2 = r1.f9935a
            if (r2 == 0) goto L1c4
            int r2 = r2.f9959B
            if (r2 == r3) goto L1bf
            float r2 = r1.f9936b
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L1c4
            goto L1bf
        L1be:
            r4 = 0
        L1bf:
            if (r4 != 0) goto L1c4
            r17.h(r18)
        L1c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.c.c(b1.b):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(f fVar, int i) {
        int i7 = fVar.f9962s;
        if (i7 == -1) {
            fVar.d(this, i);
            for (int i8 = 0; i8 < this.f9943c + 1; i8++) {
                f fVar2 = ((f[]) this.f9950m.f236t)[i8];
            }
            return;
        }
        if (i7 == -1) {
            b bVarL = l();
            bVarL.f9935a = fVar;
            float f = i;
            fVar.f9964u = f;
            bVarL.f9936b = f;
            bVarL.f9939e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f9946g[i7];
        if (bVar.f9939e) {
            bVar.f9936b = i;
            return;
        }
        if (bVar.f9938d.d() == 0) {
            bVar.f9939e = true;
            bVar.f9936b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.f9936b = i * (-1);
            bVarL2.f9938d.g(fVar, 1.0f);
        } else {
            bVarL2.f9936b = i;
            bVarL2.f9938d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(f fVar, f fVar2, int i, int i7) {
        if (i7 == 8 && fVar2.f9965v && fVar.f9962s == -1) {
            fVar.d(this, fVar2.f9964u + i);
            return;
        }
        b bVarL = l();
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            bVarL.f9936b = i;
        }
        if (z5) {
            bVarL.f9938d.g(fVar, 1.0f);
            bVarL.f9938d.g(fVar2, -1.0f);
        } else {
            bVarL.f9938d.g(fVar, -1.0f);
            bVarL.f9938d.g(fVar2, 1.0f);
        }
        if (i7 != 8) {
            bVarL.a(this, i7);
        }
        c(bVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(f fVar, f fVar2, int i, int i7) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f9963t = 0;
        bVarL.b(fVar, fVar2, fVarM, i);
        if (i7 != 8) {
            bVarL.f9938d.g(j(i7), (int) (bVarL.f9938d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(f fVar, f fVar2, int i, int i7) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f9963t = 0;
        bVarL.c(fVar, fVar2, fVarM, i);
        if (i7 != 8) {
            bVarL.f9938d.g(j(i7), (int) (bVarL.f9938d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(b bVar) {
        int i;
        if (bVar.f9939e) {
            bVar.f9935a.d(this, bVar.f9936b);
        } else {
            b[] bVarArr = this.f9946g;
            int i7 = this.f9948k;
            bVarArr[i7] = bVar;
            f fVar = bVar.f9935a;
            fVar.f9962s = i7;
            this.f9948k = i7 + 1;
            fVar.e(this, bVar);
        }
        if (this.f9942b) {
            int i8 = 0;
            while (i8 < this.f9948k) {
                if (this.f9946g[i8] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f9946g[i8];
                if (bVar2 != null && bVar2.f9939e) {
                    bVar2.f9935a.d(this, bVar2.f9936b);
                    ((d) this.f9950m.f234r).b(bVar2);
                    this.f9946g[i8] = null;
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (true) {
                        i = this.f9948k;
                        if (i9 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f9946g;
                        int i11 = i9 - 1;
                        b bVar3 = bVarArr2[i9];
                        bVarArr2[i11] = bVar3;
                        f fVar2 = bVar3.f9935a;
                        if (fVar2.f9962s == i9) {
                            fVar2.f9962s = i11;
                        }
                        i10 = i9;
                        i9++;
                    }
                    if (i10 < i) {
                        this.f9946g[i10] = null;
                    }
                    this.f9948k = i - 1;
                    i8--;
                }
                i8++;
            }
            this.f9942b = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        for (int i = 0; i < this.f9948k; i++) {
            b bVar = this.f9946g[i];
            bVar.f9935a.f9964u = bVar.f9936b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.f9967x;
        int i7 = this.f9943c + 1;
        this.f9943c = i7;
        this.j++;
        fVarA.f9961r = i7;
        fVarA.f9963t = i;
        ((f[]) this.f9950m.f236t)[i7] = fVarA;
        e eVar = this.f9944d;
        eVar.i.f8312r = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f9963t] = 1.0f;
        eVar.j(fVarA);
        return fVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof C0952c)) {
            return null;
        }
        C0952c c0952c = (C0952c) obj;
        f fVar = c0952c.i;
        if (fVar == null) {
            c0952c.k();
            fVar = c0952c.i;
        }
        int i = fVar.f9961r;
        G0 g02 = this.f9950m;
        if (i != -1 && i <= this.f9943c && ((f[]) g02.f236t)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i7 = this.f9943c + 1;
        this.f9943c = i7;
        this.j++;
        fVar.f9961r = i7;
        fVar.f9959B = 1;
        ((f[]) g02.f236t)[i7] = fVar;
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b l() {
        Object obj;
        G0 g02 = this.f9950m;
        d dVar = (d) g02.f234r;
        int i = dVar.f9955b;
        if (i > 0) {
            int i7 = i - 1;
            Object[] objArr = dVar.f9954a;
            obj = objArr[i7];
            objArr[i7] = null;
            dVar.f9955b = i7;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(g02);
        }
        bVar.f9935a = null;
        bVar.f9938d.b();
        bVar.f9936b = 0.0f;
        bVar.f9939e = false;
        return bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        f fVarA = a(3);
        int i = this.f9943c + 1;
        this.f9943c = i;
        this.j++;
        fVarA.f9961r = i;
        ((f[]) this.f9950m.f236t)[i] = fVarA;
        return fVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        int i = this.f9945e * 2;
        this.f9945e = i;
        this.f9946g = (b[]) Arrays.copyOf(this.f9946g, i);
        G0 g02 = this.f9950m;
        g02.f236t = (f[]) Arrays.copyOf((f[]) g02.f236t, this.f9945e);
        int i7 = this.f9945e;
        this.i = new boolean[i7];
        this.f = i7;
        this.f9949l = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        e eVar = this.f9944d;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f9947h) {
            q(eVar);
            return;
        }
        for (int i = 0; i < this.f9948k; i++) {
            if (!this.f9946g[i].f9939e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(e eVar) {
        int i = 0;
        while (true) {
            if (i >= this.f9948k) {
                break;
            }
            b bVar = this.f9946g[i];
            int i7 = 1;
            if (bVar.f9935a.f9959B != 1) {
                float f = 0.0f;
                if (bVar.f9936b < 0.0f) {
                    boolean z5 = false;
                    int i8 = 0;
                    while (!z5) {
                        i8 += i7;
                        float f7 = Float.MAX_VALUE;
                        int i9 = -1;
                        int i10 = -1;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < this.f9948k) {
                            b bVar2 = this.f9946g[i11];
                            if (bVar2.f9935a.f9959B != i7 && !bVar2.f9939e && bVar2.f9936b < f) {
                                int iD = bVar2.f9938d.d();
                                int i13 = 0;
                                while (i13 < iD) {
                                    f fVarE = bVar2.f9938d.e(i13);
                                    float fC = bVar2.f9938d.c(fVarE);
                                    if (fC > f) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f8 = fVarE.f9966w[i14] / fC;
                                            if ((f8 < f7 && i14 == i12) || i14 > i12) {
                                                i12 = i14;
                                                i10 = fVarE.f9961r;
                                                i9 = i11;
                                                f7 = f8;
                                            }
                                        }
                                    }
                                    i13++;
                                    f = 0.0f;
                                }
                            }
                            i11++;
                            f = 0.0f;
                            i7 = 1;
                        }
                        if (i9 != -1) {
                            b bVar3 = this.f9946g[i9];
                            bVar3.f9935a.f9962s = -1;
                            bVar3.g(((f[]) this.f9950m.f236t)[i10]);
                            f fVar = bVar3.f9935a;
                            fVar.f9962s = i9;
                            fVar.e(this, bVar3);
                        } else {
                            z5 = true;
                        }
                        if (i8 > this.j / 2) {
                            z5 = true;
                        }
                        f = 0.0f;
                        i7 = 1;
                    }
                }
            }
            i++;
        }
        r(eVar);
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(b1.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.j
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            b1.f r6 = r1.f9935a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.i
            int r6 = r6.f9961r
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.i
            b1.f r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.i
            int r8 = r6.f9961r
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.f9948k
            if (r9 >= r11) goto L97
            b1.b[] r11 = r0.f9946g
            r11 = r11[r9]
            b1.f r12 = r11.f9935a
            int r12 = r12.f9959B
            if (r12 != r5) goto L54
            goto L92
        L54:
            boolean r12 = r11.f9939e
            if (r12 == 0) goto L59
            goto L92
        L59:
            b1.a r12 = r11.f9938d
            int r13 = r12.f9934h
            r15 = -1
            if (r13 != r15) goto L61
            goto L7a
        L61:
            r2 = 0
        L62:
            if (r13 == r15) goto L7a
            int r5 = r12.f9928a
            if (r2 >= r5) goto L7a
            int[] r5 = r12.f9932e
            r5 = r5[r13]
            int r14 = r6.f9961r
            if (r5 != r14) goto L72
            r14 = 1
            goto L7b
        L72:
            int[] r5 = r12.f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L62
        L7a:
            r14 = 0
        L7b:
            if (r14 == 0) goto L92
            b1.a r2 = r11.f9938d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L92
            float r5 = r11.f9936b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L92
            r8 = r5
            r10 = r9
        L92:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            b1.b[] r2 = r0.f9946g
            r2 = r2[r10]
            b1.f r5 = r2.f9935a
            r5.f9962s = r7
            r2.g(r6)
            b1.f r5 = r2.f9935a
            r5.f9962s = r10
            r5.e(r0, r2)
            goto Lad
        Lac:
            r3 = 1
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.c.r(b1.b):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        for (int i = 0; i < this.f9948k; i++) {
            b bVar = this.f9946g[i];
            if (bVar != null) {
                ((d) this.f9950m.f234r).b(bVar);
            }
            this.f9946g[i] = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        G0 g02;
        int i = 0;
        while (true) {
            g02 = this.f9950m;
            f[] fVarArr = (f[]) g02.f236t;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        d dVar = (d) g02.f235s;
        f[] fVarArr2 = this.f9951n;
        int length = this.f9952o;
        dVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i7 = 0; i7 < length; i7++) {
            f fVar2 = fVarArr2[i7];
            int i8 = dVar.f9955b;
            Object[] objArr = dVar.f9954a;
            if (i8 < objArr.length) {
                objArr[i8] = fVar2;
                dVar.f9955b = i8 + 1;
            }
        }
        this.f9952o = 0;
        Arrays.fill((f[]) g02.f236t, (Object) null);
        this.f9943c = 0;
        e eVar = this.f9944d;
        eVar.f9957h = 0;
        eVar.f9936b = 0.0f;
        this.j = 1;
        for (int i9 = 0; i9 < this.f9948k; i9++) {
            b bVar = this.f9946g[i9];
        }
        s();
        this.f9948k = 0;
        this.f9953p = new b(g02);
    }
}
