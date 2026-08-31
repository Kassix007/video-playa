package P;

import B0.C0057w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import r.C1544C;
import r.C1569u;
import r.C1570v;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f5288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f5291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f5292e;
    public C1570v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5294h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0057w f5300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0057w f5301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0057w f5302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1570v f5303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1569u f5308x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D0(A0 a02) {
        this.f5288a = a02;
        int[] iArr = a02.f5265q;
        this.f5289b = iArr;
        Object[] objArr = a02.f5267s;
        this.f5290c = objArr;
        this.f5291d = a02.f5273y;
        this.f5292e = a02.f5274z;
        this.f = a02.f5264A;
        int i = a02.f5266r;
        this.f5293g = i;
        this.f5294h = (iArr.length / 5) - i;
        int i7 = a02.f5268t;
        this.f5295k = i7;
        this.f5296l = objArr.length - i7;
        this.f5297m = i;
        this.f5300p = new C0057w();
        this.f5301q = new C0057w();
        this.f5302r = new C0057w();
        this.f5305u = i;
        this.f5306v = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h(int i, int i7, int i8, int i9) {
        return i > i7 ? -(((i9 - i8) - i) + 1) : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(D0 d02) {
        int i = d02.f5306v;
        int iQ = d02.q(i);
        int[] iArr = d02.f5289b;
        int i7 = (iQ * 5) + 1;
        int i8 = iArr[i7];
        if ((i8 & 134217728) != 0) {
            return;
        }
        int i9 = (i8 & (-134217729)) | 134217728;
        iArr[i7] = i9;
        if ((67108864 & i9) != 0) {
            return;
        }
        d02.R(d02.C(iArr, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(int i, int i7) {
        int i8 = this.f5296l;
        int i9 = this.f5295k;
        int i10 = this.f5297m;
        if (i9 != i) {
            Object[] objArr = this.f5290c;
            if (i < i9) {
                System.arraycopy(objArr, i, objArr, i + i8, i9 - i);
            } else {
                int i11 = i9 + i8;
                System.arraycopy(objArr, i11, objArr, i9, (i + i8) - i11);
            }
        }
        int iMin = Math.min(i7 + 1, n());
        if (i10 != iMin) {
            int length = this.f5290c.length - i8;
            if (iMin < i10) {
                int iQ = q(iMin);
                int iQ2 = q(i10);
                int i12 = this.f5293g;
                while (iQ < iQ2) {
                    int i13 = (iQ * 5) + 4;
                    int i14 = this.f5289b[i13];
                    if (!(i14 >= 0)) {
                        AbstractC0373p.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f5289b[i13] = -((length - i14) + 1);
                    iQ++;
                    if (iQ == i12) {
                        iQ += this.f5294h;
                    }
                }
            } else {
                int iQ3 = q(i10);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i15 = (iQ3 * 5) + 4;
                    int i16 = this.f5289b[i15];
                    if (!(i16 < 0)) {
                        AbstractC0373p.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f5289b[i15] = i16 + length + 1;
                    iQ3++;
                    if (iQ3 == this.f5293g) {
                        iQ3 += this.f5294h;
                    }
                }
            }
            this.f5297m = iMin;
        }
        this.f5295k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(int i) {
        int iQ = q(i);
        int[] iArr = this.f5289b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.f5290c[g(f(iArr, iQ))];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int C(int[] iArr, int i) {
        int i7 = iArr[(q(i) * 5) + 2];
        return i7 > -2 ? i7 : (n() + i7) - (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object D(Object obj) {
        if (this.f5298n > 0) {
            v(1, this.f5306v);
        }
        Object[] objArr = this.f5290c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            AbstractC0373p.c("Writing to an invalid slot");
        }
        this.f5290c[g(this.i - 1)] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        int i;
        C1569u c1569u = this.f5308x;
        if (c1569u != null) {
            while (c1569u.f16252b != 0) {
                int iV = C0345b.v(c1569u);
                int iQ = q(iV);
                int iS = iV + 1;
                int iS2 = s(iV) + iV;
                while (true) {
                    if (iS >= iS2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f5289b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.f5289b;
                int i7 = (iQ * 5) + 1;
                int i8 = iArr[i7];
                if (((67108864 & i8) != 0 ? 1 : 0) != i) {
                    iArr[i7] = (i << 26) | ((-67108865) & i8);
                    int iC = C(iArr, iV);
                    if (iC >= 0) {
                        C0345b.h(c1569u, iC);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F() {
        C0343a c0343aP;
        if (this.f5298n != 0) {
            AbstractC0373p.c("Cannot remove group while inserting");
        }
        int i = this.f5304t;
        int i7 = this.i;
        int iF = f(this.f5289b, q(i));
        int I6 = I();
        int i8 = this.f5306v;
        HashMap map = this.f5292e;
        if (map != null && (c0343aP = P(i8)) != null) {
        }
        C1569u c1569u = this.f5308x;
        if (c1569u != null) {
            while (true) {
                int i9 = c1569u.f16252b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    AbstractC1585a.e("IntList is empty.");
                    throw null;
                }
                if (c1569u.f16251a[0] < i) {
                    break;
                }
                C0345b.v(c1569u);
            }
        }
        boolean zG = G(i, this.f5304t - i);
        H(iF, this.i - iF, i - 1);
        this.f5304t = i;
        this.i = i7;
        this.f5299o -= I6;
        return zG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean G(int i, int i7) {
        if (i7 > 0) {
            ArrayList arrayList = this.f5291d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f5292e;
                int i8 = i + i7;
                int iB = C0.b(this.f5291d, i8, m() - this.f5294h);
                if (iB >= this.f5291d.size()) {
                    iB--;
                }
                int i9 = iB + 1;
                int i10 = 0;
                while (iB >= 0) {
                    C0343a c0343a = (C0343a) this.f5291d.get(iB);
                    int iC = c(c0343a);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i8) {
                        c0343a.f5384a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i10 == 0) {
                            i10 = iB + 1;
                        }
                        i9 = iB;
                    }
                    iB--;
                }
                z = i9 < i10;
                if (z) {
                    this.f5291d.subList(i9, i10).clear();
                }
            }
            this.f5293g = i;
            this.f5294h += i7;
            int i11 = this.f5297m;
            if (i11 > i) {
                this.f5297m = Math.max(i, i11 - i7);
            }
            int i12 = this.f5305u;
            if (i12 >= this.f5293g) {
                this.f5305u = i12 - i7;
            }
            int i13 = this.f5306v;
            if (i13 >= 0 && (this.f5289b[(q(i13) * 5) + 1] & 67108864) != 0) {
                R(i13);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(int i, int i7, int i8) {
        if (i7 > 0) {
            int i9 = this.f5296l;
            int i10 = i + i7;
            A(i10, i8);
            this.f5295k = i;
            this.f5296l = i9 + i7;
            n5.k.J0(i, i10, null, this.f5290c);
            int i11 = this.j;
            if (i11 >= i) {
                this.j = i11 - i7;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int I() {
        int iQ = q(this.f5304t);
        int iA = C0.a(this.f5289b, iQ) + this.f5304t;
        this.f5304t = iA;
        this.i = f(this.f5289b, q(iA));
        int i = this.f5289b[(iQ * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J() {
        int i = this.f5305u;
        this.f5304t = i;
        this.i = f(this.f5289b, q(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int K(int[] iArr, int i) {
        if (i >= m()) {
            return this.f5290c.length - this.f5296l;
        }
        int iC = C0.c(iArr, i);
        return iC < 0 ? (this.f5290c.length - this.f5296l) + iC + 1 : iC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int L(int i, int i7) {
        int iK = K(this.f5289b, q(i));
        int i8 = iK + i7;
        if (!(i8 >= iK && i8 < f(this.f5289b, q(i + 1)))) {
            AbstractC0373p.c("Write to an invalid slot index " + i7 + " for group " + i);
        }
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int M(int i) {
        return f(this.f5289b, q(s(i) + i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N() {
        if (this.f5298n != 0) {
            AbstractC0373p.c("Key must be supplied when inserting");
        }
        S s6 = C0363k.f5418a;
        O(0, s6, s6, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i, Object obj, Object obj2, boolean z5) {
        int i7;
        HashMap map;
        C0343a c0343aP;
        int i8 = this.f5306v;
        Object[] objArr = this.f5298n > 0;
        this.f5302r.c(this.f5299o);
        S s6 = C0363k.f5418a;
        if (objArr == true) {
            int i9 = this.f5304t;
            int iF = f(this.f5289b, q(i9));
            u(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i9);
            int i10 = obj != s6 ? 1 : 0;
            int i11 = (z5 || obj2 == s6) ? 0 : 1;
            int iH = h(iF, this.f5295k, this.f5296l, this.f5290c.length);
            if (iH >= 0 && this.f5297m < i9) {
                iH = -(((this.f5290c.length - this.f5296l) - iH) + 1);
            }
            int[] iArr = this.f5289b;
            int i12 = this.f5306v;
            int i13 = iQ * 5;
            iArr[i13] = i;
            iArr[i13 + 1] = ((z5 ? 1 : 0) << 30) | (i10 << 29) | (i11 << 28);
            iArr[i13 + 2] = i12;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = iH;
            int i14 = (z5 ? 1 : 0) + i10 + i11;
            if (i14 > 0) {
                v(i14, i9);
                Object[] objArr2 = this.f5290c;
                int i15 = this.i;
                if (z5) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i10 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i11 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.i = i15;
            }
            this.f5299o = 0;
            i7 = i9 + 1;
            this.f5306v = i9;
            this.f5304t = i7;
            if (i8 >= 0 && (map = this.f5292e) != null && (c0343aP = P(i8)) != null) {
            }
        } else {
            this.f5300p.c(i8);
            this.f5301q.c((m() - this.f5294h) - this.f5305u);
            int i16 = this.f5304t;
            int iQ2 = q(i16);
            if (!kotlin.jvm.internal.m.a(obj2, s6)) {
                if (z5) {
                    S(this.f5304t, obj2);
                } else {
                    Q(obj2);
                }
            }
            this.i = K(this.f5289b, iQ2);
            this.j = f(this.f5289b, q(this.f5304t + 1));
            int[] iArr2 = this.f5289b;
            int i17 = iQ2 * 5;
            this.f5299o = iArr2[i17 + 1] & 67108863;
            this.f5306v = i16;
            this.f5304t = i16 + 1;
            i7 = i16 + iArr2[i17 + 3];
        }
        this.f5305u = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0343a P(int i) {
        ArrayList arrayList;
        int iE;
        if (i < 0 || i >= n() || (iE = C0.e((arrayList = this.f5291d), i, n())) < 0) {
            return null;
        }
        return (C0343a) arrayList.get(iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(Object obj) {
        int iQ = q(this.f5304t);
        int i = (iQ * 5) + 1;
        if ((this.f5289b[i] & 268435456) == 0) {
            AbstractC0373p.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f5290c;
        int[] iArr = this.f5289b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(int i) {
        if (i >= 0) {
            C1569u c1569u = this.f5308x;
            if (c1569u == null) {
                c1569u = new C1569u();
                this.f5308x = c1569u;
            }
            C0345b.h(c1569u, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.q(r5)
            int[] r1 = r4.f5289b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            P.AbstractC0373p.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f5290c
            int[] r1 = r4.f5289b
            int r0 = r4.f(r1, r0)
            int r0 = r4.g(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.D0.S(int, java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        boolean z5 = false;
        if (!(i >= 0)) {
            AbstractC0373p.c("Cannot seek backwards");
        }
        if (!(this.f5298n <= 0)) {
            AbstractC0362j0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i7 = this.f5304t + i;
        if (i7 >= this.f5306v && i7 <= this.f5305u) {
            z5 = true;
        }
        if (!z5) {
            AbstractC0373p.c("Cannot seek outside the current group (" + this.f5306v + '-' + this.f5305u + ')');
        }
        this.f5304t = i7;
        int iF = f(this.f5289b, q(i7));
        this.i = iF;
        this.j = iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0343a b(int i) {
        ArrayList arrayList = this.f5291d;
        int iE = C0.e(arrayList, i, n());
        if (iE >= 0) {
            return (C0343a) arrayList.get(iE);
        }
        if (i > this.f5293g) {
            i = -(n() - i);
        }
        C0343a c0343a = new C0343a(i);
        arrayList.add(-(iE + 1), c0343a);
        return c0343a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(C0343a c0343a) {
        int i = c0343a.f5384a;
        return i < 0 ? n() + i : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int i = this.f5298n;
        this.f5298n = i + 1;
        if (i == 0) {
            this.f5301q.c((m() - this.f5294h) - this.f5305u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(boolean z5) {
        this.f5307w = true;
        if (z5 && this.f5300p.f527b == 0) {
            z(n());
            A(this.f5290c.length - this.f5296l, this.f5293g);
            int i = this.f5295k;
            Arrays.fill(this.f5290c, i, this.f5296l + i, (Object) null);
            E();
        }
        int[] iArr = this.f5289b;
        int i7 = this.f5293g;
        Object[] objArr = this.f5290c;
        int i8 = this.f5295k;
        ArrayList arrayList = this.f5291d;
        HashMap map = this.f5292e;
        C1570v c1570v = this.f;
        A0 a02 = this.f5288a;
        if (!a02.f5271w) {
            AbstractC0362j0.a("Unexpected writer close()");
        }
        a02.f5271w = false;
        a02.f5265q = iArr;
        a02.f5266r = i7;
        a02.f5267s = objArr;
        a02.f5268t = i8;
        a02.f5273y = arrayList;
        a02.f5274z = map;
        a02.f5264A = c1570v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.f5290c.length - this.f5296l;
        }
        int i7 = iArr[(i * 5) + 4];
        return i7 < 0 ? (this.f5290c.length - this.f5296l) + i7 + 1 : i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int i) {
        return (this.f5296l * (i < this.f5295k ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        C1544C c1544c;
        boolean z5 = this.f5298n > 0;
        int i = this.f5304t;
        int i7 = this.f5305u;
        int i8 = this.f5306v;
        int iQ = q(i8);
        int i9 = this.f5299o;
        int i10 = i - i8;
        int i11 = iQ * 5;
        int i12 = i11 + 1;
        boolean z6 = (this.f5289b[i12] & 1073741824) != 0;
        C0057w c0057w = this.f5302r;
        if (z5) {
            C1570v c1570v = this.f5303s;
            if (c1570v != null && (c1544c = (C1544C) c1570v.b(i8)) != null) {
                Object[] objArr = c1544c.f16114a;
                int i13 = c1544c.f16115b;
                for (int i14 = 0; i14 < i13; i14++) {
                    D(objArr[i14]);
                }
            }
            int[] iArr = this.f5289b;
            iArr[i11 + 3] = i10;
            C0.d(iQ, i9, iArr);
            int iB = c0057w.b();
            if (z6) {
                i9 = 1;
            }
            this.f5299o = iB + i9;
            int iC = C(this.f5289b, i8);
            this.f5306v = iC;
            int iN = iC < 0 ? n() : q(iC + 1);
            int iF = iN >= 0 ? f(this.f5289b, iN) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i7) {
            AbstractC0373p.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f5289b;
        int i15 = i11 + 3;
        int i16 = iArr2[i15];
        int i17 = iArr2[i12] & 67108863;
        iArr2[i15] = i10;
        C0.d(iQ, i9, iArr2);
        int iB2 = this.f5300p.b();
        this.f5305u = (m() - this.f5294h) - this.f5301q.b();
        this.f5306v = iB2;
        int iC2 = C(this.f5289b, i8);
        int iB3 = c0057w.b();
        this.f5299o = iB3;
        if (iC2 == iB2) {
            this.f5299o = iB3 + (z6 ? 0 : i9 - i17);
            return;
        }
        int i18 = i10 - i16;
        int i19 = z6 ? 0 : i9 - i17;
        if (i18 != 0 || i19 != 0) {
            while (iC2 != 0 && iC2 != iB2 && (i19 != 0 || i18 != 0)) {
                int iQ2 = q(iC2);
                if (i18 != 0) {
                    int[] iArr3 = this.f5289b;
                    int i20 = (iQ2 * 5) + 3;
                    iArr3[i20] = iArr3[i20] + i18;
                }
                if (i19 != 0) {
                    int[] iArr4 = this.f5289b;
                    C0.d(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i19, iArr4);
                }
                int[] iArr5 = this.f5289b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i19 = 0;
                }
                iC2 = C(iArr5, iC2);
            }
        }
        this.f5299o += i19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        if (this.f5298n <= 0) {
            AbstractC0362j0.b("Unbalanced begin/end insert");
        }
        int i = this.f5298n - 1;
        this.f5298n = i;
        if (i == 0) {
            if (this.f5302r.f527b != this.f5300p.f527b) {
                AbstractC0373p.c("startGroup/endGroup mismatch while inserting");
            }
            this.f5305u = (m() - this.f5294h) - this.f5301q.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i) {
        boolean z5 = false;
        if (!(this.f5298n <= 0)) {
            AbstractC0373p.c("Cannot call ensureStarted() while inserting");
        }
        int i7 = this.f5306v;
        if (i7 != i) {
            if (i >= i7 && i < this.f5305u) {
                z5 = true;
            }
            if (!z5) {
                AbstractC0373p.c("Started group at " + i + " must be a subgroup of the group at " + i7);
            }
            int i8 = this.f5304t;
            int i9 = this.i;
            int i10 = this.j;
            this.f5304t = i;
            N();
            this.f5304t = i8;
            this.i = i9;
            this.j = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i7, int i8) {
        if (i >= this.f5293g) {
            i = -((n() - i) + 2);
        }
        while (i8 < i7) {
            this.f5289b[(q(i8) * 5) + 2] = i;
            int i9 = this.f5289b[(q(i8) * 5) + 3] + i8;
            l(i8, i9, i8 + 1);
            i8 = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m() {
        return this.f5289b.length / 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int n() {
        return m() - this.f5294h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int o() {
        return this.f5290c.length - this.f5296l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.f5289b;
        int i7 = (iQ * 5) + 1;
        if ((iArr[i7] & 268435456) == 0) {
            return C0363k.f5418a;
        }
        return this.f5290c[Integer.bitCount(iArr[i7] >> 29) + f(iArr, iQ)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q(int i) {
        return (this.f5294h * (i < this.f5293g ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object r(int i) {
        int iQ = q(i);
        int[] iArr = this.f5289b;
        int i7 = iQ * 5;
        int i8 = iArr[i7 + 1];
        if ((536870912 & i8) == 0) {
            return null;
        }
        return this.f5290c[Integer.bitCount(i8 >> 30) + iArr[i7 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int s(int i) {
        return C0.a(this.f5289b, q(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t(int i, int i7) {
        int iM;
        int iS;
        if (i7 == this.f5306v) {
            iM = this.f5305u;
        } else {
            C0057w c0057w = this.f5300p;
            if (i7 > c0057w.a(0)) {
                iS = s(i7);
            } else {
                int[] iArr = c0057w.f526a;
                int iMin = Math.min(iArr.length, c0057w.f527b);
                int i8 = 0;
                while (true) {
                    if (i8 >= iMin) {
                        i8 = -1;
                        break;
                    }
                    if (iArr[i8] == i7) {
                        break;
                    }
                    i8++;
                }
                if (i8 < 0) {
                    iS = s(i7);
                } else {
                    iM = (m() - this.f5294h) - this.f5301q.f526a[i8];
                }
            }
            iM = iS + i7;
        }
        return i > i7 && i < iM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotWriter(current = " + this.f5304t + " end=" + this.f5305u + " size = " + n() + " gap=" + this.f5293g + '-' + (this.f5293g + this.f5294h) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i) {
        if (i > 0) {
            int i7 = this.f5304t;
            z(i7);
            int i8 = this.f5293g;
            int i9 = this.f5294h;
            int[] iArr = this.f5289b;
            int length = iArr.length / 5;
            int i10 = length - i9;
            if (i9 < i) {
                int iMax = Math.max(Math.max(length * 2, i10 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i11 = iMax - i10;
                n5.k.C0(0, 0, i8 * 5, iArr, iArr2);
                n5.k.C0((i8 + i11) * 5, (i9 + i8) * 5, length * 5, iArr, iArr2);
                this.f5289b = iArr2;
                i9 = i11;
            }
            int i12 = this.f5305u;
            if (i12 >= i8) {
                this.f5305u = i12 + i;
            }
            int i13 = i8 + i;
            this.f5293g = i13;
            this.f5294h = i9 - i;
            int iH = h(i10 > 0 ? f(this.f5289b, q(i7 + i)) : 0, this.f5297m >= i8 ? this.f5295k : 0, this.f5296l, this.f5290c.length);
            for (int i14 = i8; i14 < i13; i14++) {
                this.f5289b[(i14 * 5) + 4] = iH;
            }
            int i15 = this.f5297m;
            if (i15 >= i8) {
                this.f5297m = i15 + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(int i, int i7) {
        if (i > 0) {
            A(this.i, i7);
            int i8 = this.f5295k;
            int i9 = this.f5296l;
            if (i9 < i) {
                Object[] objArr = this.f5290c;
                int length = objArr.length;
                int i10 = length - i9;
                int iMax = Math.max(Math.max(length * 2, i10 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i11 = 0; i11 < iMax; i11++) {
                    objArr2[i11] = null;
                }
                int i12 = iMax - i10;
                int i13 = i9 + i8;
                System.arraycopy(objArr, 0, objArr2, 0, i8);
                System.arraycopy(objArr, i13, objArr2, i8 + i12, length - i13);
                this.f5290c = objArr2;
                i9 = i12;
            }
            int i14 = this.j;
            if (i14 >= i8) {
                this.j = i14 + i;
            }
            this.f5295k = i8 + i;
            this.f5296l = i9 - i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(int i) {
        return (this.f5289b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(A0 a02, int i) {
        if (this.f5298n <= 0) {
            AbstractC0373p.c("Check failed");
        }
        if (i == 0 && this.f5304t == 0 && this.f5288a.f5266r == 0) {
            int[] iArr = a02.f5265q;
            int i7 = iArr[(i * 5) + 3];
            int i8 = a02.f5266r;
            if (i7 == i8) {
                int[] iArr2 = this.f5289b;
                Object[] objArr = this.f5290c;
                ArrayList arrayList = this.f5291d;
                HashMap map = this.f5292e;
                C1570v c1570v = this.f;
                Object[] objArr2 = a02.f5267s;
                int i9 = a02.f5268t;
                HashMap map2 = a02.f5274z;
                C1570v c1570v2 = a02.f5264A;
                this.f5289b = iArr;
                this.f5290c = objArr2;
                this.f5291d = a02.f5273y;
                this.f5293g = i8;
                this.f5294h = (iArr.length / 5) - i8;
                this.f5295k = i9;
                this.f5296l = objArr2.length - i9;
                this.f5297m = i8;
                this.f5292e = map2;
                this.f = c1570v2;
                a02.f5265q = iArr2;
                a02.f5266r = 0;
                a02.f5267s = objArr;
                a02.f5268t = 0;
                a02.f5273y = arrayList;
                a02.f5274z = map;
                a02.f5264A = c1570v;
                return;
            }
        }
        D0 d0I = a02.i();
        try {
            C0345b.p(d0I, i, this, true, true, false);
            d0I.e(true);
        } catch (Throwable th) {
            d0I.e(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(int i) {
        C0343a c0343a;
        int i7;
        C0343a c0343a2;
        int i8;
        int i9;
        int i10 = this.f5294h;
        int i11 = this.f5293g;
        if (i11 != i) {
            if (!this.f5291d.isEmpty()) {
                int iM = m() - this.f5294h;
                if (i11 < i) {
                    for (int iB = C0.b(this.f5291d, i11, iM); iB < this.f5291d.size() && (i8 = (c0343a2 = (C0343a) this.f5291d.get(iB)).f5384a) < 0 && (i9 = i8 + iM) < i; iB++) {
                        c0343a2.f5384a = i9;
                    }
                } else {
                    for (int iB2 = C0.b(this.f5291d, i, iM); iB2 < this.f5291d.size() && (i7 = (c0343a = (C0343a) this.f5291d.get(iB2)).f5384a) >= 0; iB2++) {
                        c0343a.f5384a = -(iM - i7);
                    }
                }
            }
            if (i10 > 0) {
                int[] iArr = this.f5289b;
                int i12 = i * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (i < i11) {
                    n5.k.C0(i13 + i12, i12, i14, iArr, iArr);
                } else {
                    n5.k.C0(i14, i14 + i13, i12 + i13, iArr, iArr);
                }
            }
            if (i < i11) {
                i11 = i + i10;
            }
            int iM2 = m();
            if (i11 >= iM2) {
                AbstractC0373p.c("Check failed");
            }
            while (i11 < iM2) {
                int i15 = (i11 * 5) + 2;
                int i16 = this.f5289b[i15];
                int iN = i16 > -2 ? i16 : (n() + i16) - (-2);
                if (iN >= i) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i16) {
                    this.f5289b[i15] = iN;
                }
                i11++;
                if (i11 == i) {
                    i11 += i10;
                }
            }
        }
        this.f5293g = i;
    }
}
