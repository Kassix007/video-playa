package u;

import i3.C1136a;
import r.C1569u;
import r.C1570v;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements D0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float[] f16788A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float[] f16789B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1136a f16790C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1569u f16791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1570v f16792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1669x f16794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f16795u = C0.f16759a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f16796v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC1663q f16797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC1663q f16798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC1663q f16799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC1663q f16800z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H0(C1569u c1569u, C1570v c1570v, int i, InterfaceC1669x interfaceC1669x) {
        this.f16791q = c1569u;
        this.f16792r = c1570v;
        this.f16793s = i;
        this.f16794t = interfaceC1669x;
        float[] fArr = C0.f16760b;
        this.f16796v = fArr;
        this.f16788A = fArr;
        this.f16789B = fArr;
        this.f16790C = C0.f16761c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        int i7;
        C1569u c1569u = this.f16791q;
        int i8 = c1569u.f16252b;
        c1569u.getClass();
        if (i8 <= 0 || i8 > c1569u.f16252b) {
            AbstractC1585a.d("");
            throw null;
        }
        int i9 = i8 - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i7 = (i10 + i9) >>> 1;
                int i11 = c1569u.f16251a[i7];
                if (i11 >= i) {
                    if (i11 <= i) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i10 = i7 + 1;
                }
            } else {
                i7 = -(i10 + 1);
                break;
            }
        }
        return i7 < -1 ? -(i7 + 2) : i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i, int i7, boolean z5) {
        InterfaceC1669x interfaceC1669x;
        float f;
        C1569u c1569u = this.f16791q;
        if (i >= c1569u.f16252b - 1) {
            f = i7;
        } else {
            int iC = c1569u.c(i);
            int iC2 = c1569u.c(i + 1);
            if (i7 == iC) {
                f = iC;
            } else {
                int i8 = iC2 - iC;
                G0 g02 = (G0) this.f16792r.b(iC);
                if (g02 == null || (interfaceC1669x = g02.f16783b) == null) {
                    interfaceC1669x = this.f16794t;
                }
                float f7 = i8;
                float fC = interfaceC1669x.c((i7 - iC) / f7);
                if (z5) {
                    return fC;
                }
                f = (f7 * fC) + iC;
            }
        }
        return f / 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        float[] fArr;
        boolean z5 = this.f16790C != C0.f16761c;
        AbstractC1663q abstractC1663q4 = this.f16797w;
        C1570v c1570v = this.f16792r;
        C1569u c1569u = this.f16791q;
        if (abstractC1663q4 == null) {
            this.f16797w = abstractC1663q.c();
            this.f16798x = abstractC1663q3.c();
            int i = c1569u.f16252b;
            float[] fArr2 = new float[i];
            for (int i7 = 0; i7 < i; i7++) {
                fArr2[i7] = c1569u.c(i7) / 1000;
            }
            this.f16796v = fArr2;
            int i8 = c1569u.f16252b;
            int[] iArr = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                iArr[i9] = 0;
            }
            this.f16795u = iArr;
        }
        if (z5) {
            if (this.f16790C != C0.f16761c && kotlin.jvm.internal.m.a(this.f16799y, abstractC1663q) && kotlin.jvm.internal.m.a(this.f16800z, abstractC1663q2)) {
                return;
            }
            this.f16799y = abstractC1663q;
            this.f16800z = abstractC1663q2;
            int iB = abstractC1663q.b() + (abstractC1663q.b() % 2);
            this.f16788A = new float[iB];
            this.f16789B = new float[iB];
            int i10 = c1569u.f16252b;
            float[][] fArr3 = new float[i10][];
            for (int i11 = 0; i11 < i10; i11++) {
                int iC = c1569u.c(i11);
                G0 g02 = (G0) c1570v.b(iC);
                if (iC == 0 && g02 == null) {
                    fArr = new float[iB];
                    for (int i12 = 0; i12 < iB; i12++) {
                        fArr[i12] = abstractC1663q.a(i12);
                    }
                } else if (iC == this.f16793s && g02 == null) {
                    fArr = new float[iB];
                    for (int i13 = 0; i13 < iB; i13++) {
                        fArr[i13] = abstractC1663q2.a(i13);
                    }
                } else {
                    kotlin.jvm.internal.m.b(g02);
                    AbstractC1663q abstractC1663q5 = g02.f16782a;
                    float[] fArr4 = new float[iB];
                    for (int i14 = 0; i14 < iB; i14++) {
                        fArr4[i14] = abstractC1663q5.a(i14);
                    }
                    fArr = fArr4;
                }
                fArr3[i11] = fArr;
            }
            this.f16790C = new C1136a(this.f16795u, this.f16796v, fArr3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        AbstractC1663q abstractC1663q4;
        AbstractC1663q abstractC1663q5;
        float f;
        C1664s[][] c1664sArr;
        boolean z5;
        AbstractC1663q abstractC1663q6 = abstractC1663q;
        AbstractC1663q abstractC1663q7 = abstractC1663q2;
        int[] iArr = C0.f16759a;
        int i = 0;
        long j7 = (j / 1000000) - ((long) 0);
        int i7 = this.f16793s;
        long j8 = i7;
        if (j7 < 0) {
            j7 = 0;
        }
        if (j7 <= j8) {
            j8 = j7;
        }
        int i8 = (int) j8;
        C1570v c1570v = this.f16792r;
        G0 g02 = (G0) c1570v.b(i8);
        if (g02 != null) {
            return g02.f16782a;
        }
        if (i8 >= i7) {
            return abstractC1663q7;
        }
        if (i8 <= 0) {
            return abstractC1663q6;
        }
        e(abstractC1663q6, abstractC1663q7, abstractC1663q3);
        AbstractC1663q abstractC1663q8 = this.f16797w;
        kotlin.jvm.internal.m.b(abstractC1663q8);
        boolean z6 = true;
        if (this.f16790C != C0.f16761c) {
            float fD = d(c(i8), i8, false);
            float[] fArr = this.f16788A;
            C1664s[][] c1664sArr2 = (C1664s[][]) this.f16790C.f13562r;
            int length = c1664sArr2.length - 1;
            float f7 = c1664sArr2[0][0].f17020a;
            float f8 = c1664sArr2[length][0].f17021b;
            int length2 = fArr.length;
            if (fD < f7 || fD > f8) {
                if (fD > f8) {
                    f7 = f8;
                } else {
                    length = 0;
                }
                float f9 = fD - f7;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length2 - 1) {
                    C1664s c1664s = c1664sArr2[length][i10];
                    boolean z7 = c1664s.f17032p;
                    float f10 = c1664s.f17034r;
                    float f11 = c1664s.f17033q;
                    if (z7) {
                        float f12 = c1664s.f17020a;
                        float f13 = c1664s.f17027k;
                        f = f9;
                        float f14 = c1664s.f17022c;
                        c1664sArr = c1664sArr2;
                        fArr[i9] = (f * f11) + k1.i.a(c1664s.f17024e, f14, (f7 - f12) * f13, f14);
                        float f15 = (f7 - f12) * f13;
                        float f16 = c1664s.f17023d;
                        fArr[i9 + 1] = (f * f10) + k1.i.a(c1664s.f, f16, f15, f16);
                    } else {
                        f = f9;
                        c1664sArr = c1664sArr2;
                        c1664s.c(f7);
                        fArr[i9] = (c1664s.a() * f) + (c1664s.f17030n * c1664s.f17026h) + f11;
                        fArr[i9 + 1] = (c1664s.b() * f) + (c1664s.f17031o * c1664s.i) + f10;
                    }
                    i9 += 2;
                    i10++;
                    f9 = f;
                    c1664sArr2 = c1664sArr;
                }
            } else {
                int length3 = c1664sArr2.length;
                int i11 = 0;
                boolean z8 = false;
                while (i11 < length3) {
                    int i12 = i;
                    int i13 = i12;
                    while (i12 < length2 - 1) {
                        C1664s c1664s2 = c1664sArr2[i11][i13];
                        if (fD <= c1664s2.f17021b) {
                            if (c1664s2.f17032p) {
                                float f17 = c1664s2.f17020a;
                                float f18 = c1664s2.f17027k;
                                float f19 = c1664s2.f17022c;
                                z5 = z6;
                                fArr[i12] = k1.i.a(c1664s2.f17024e, f19, (fD - f17) * f18, f19);
                                float f20 = c1664s2.f17023d;
                                fArr[i12 + 1] = k1.i.a(c1664s2.f, f20, (fD - f17) * f18, f20);
                            } else {
                                z5 = z6;
                                c1664s2.c(fD);
                                fArr[i12] = (c1664s2.f17030n * c1664s2.f17026h) + c1664s2.f17033q;
                                fArr[i12 + 1] = (c1664s2.f17031o * c1664s2.i) + c1664s2.f17034r;
                            }
                            z8 = z5;
                        } else {
                            z5 = z6;
                        }
                        i12 += 2;
                        i13++;
                        z6 = z5;
                    }
                    boolean z9 = z6;
                    if (z8) {
                        break;
                    }
                    i11++;
                    z6 = z9;
                    i = 0;
                }
            }
            int length4 = fArr.length;
            for (int i14 = 0; i14 < length4; i14++) {
                abstractC1663q8.e(i14, fArr[i14]);
            }
        } else {
            int iC = c(i8);
            float fD2 = d(iC, i8, true);
            C1569u c1569u = this.f16791q;
            G0 g03 = (G0) c1570v.b(c1569u.c(iC));
            if (g03 != null && (abstractC1663q5 = g03.f16782a) != null) {
                abstractC1663q6 = abstractC1663q5;
            }
            G0 g04 = (G0) c1570v.b(c1569u.c(iC + 1));
            if (g04 != null && (abstractC1663q4 = g04.f16782a) != null) {
                abstractC1663q7 = abstractC1663q4;
            }
            int iB = abstractC1663q8.b();
            for (int i15 = 0; i15 < iB; i15++) {
                abstractC1663q8.e(i15, (abstractC1663q7.a(i15) * fD2) + ((1 - fD2) * abstractC1663q6.a(i15)));
            }
        }
        return abstractC1663q8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.D0
    public final int l() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.D0
    public final int m() {
        return this.f16793s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        int[] iArr = C0.f16759a;
        int i = 0;
        long j7 = (j / 1000000) - ((long) 0);
        long j8 = this.f16793s;
        if (j7 < 0) {
            j7 = 0;
        }
        long j9 = j7 > j8 ? j8 : j7;
        if (j9 < 0) {
            return abstractC1663q3;
        }
        e(abstractC1663q, abstractC1663q2, abstractC1663q3);
        AbstractC1663q abstractC1663q4 = this.f16798x;
        kotlin.jvm.internal.m.b(abstractC1663q4);
        if (this.f16790C != C0.f16761c) {
            int i7 = (int) j9;
            float fD = d(c(i7), i7, false);
            float[] fArr = this.f16789B;
            C1664s[][] c1664sArr = (C1664s[][]) this.f16790C.f13562r;
            float f = c1664sArr[0][0].f17020a;
            float f7 = c1664sArr[c1664sArr.length - 1][0].f17021b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f7) {
                f7 = fD;
            }
            int length = fArr.length;
            boolean z5 = false;
            for (C1664s[] c1664sArr2 : c1664sArr) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < length - 1) {
                    C1664s c1664s = c1664sArr2[i9];
                    if (f7 <= c1664s.f17021b) {
                        if (c1664s.f17032p) {
                            fArr[i8] = c1664s.f17033q;
                            fArr[i8 + 1] = c1664s.f17034r;
                        } else {
                            c1664s.c(f7);
                            fArr[i8] = c1664s.a();
                            fArr[i8 + 1] = c1664s.b();
                        }
                        z5 = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z5) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC1663q4.e(i, fArr[i]);
                i++;
            }
        } else {
            AbstractC1663q abstractC1663qG = g((j9 - 1) * 1000000, abstractC1663q, abstractC1663q2, abstractC1663q3);
            AbstractC1663q abstractC1663qG2 = g(j9 * 1000000, abstractC1663q, abstractC1663q2, abstractC1663q3);
            int iB = abstractC1663qG.b();
            while (i < iB) {
                abstractC1663q4.e(i, (abstractC1663qG.a(i) - abstractC1663qG2.a(i)) * 1000.0f);
                i++;
            }
        }
        return abstractC1663q4;
    }
}
