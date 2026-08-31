package J0;

import A0.d;
import B0.C0042g0;
import B0.L;
import B0.n0;
import B0.s0;
import C0.RunnableC0114z;
import E.Y;
import R.e;
import W0.i;
import android.os.Handler;
import c0.AbstractC0713a;
import com.google.android.gms.internal.measurement.K1;
import i0.C1129a;
import j0.AbstractC1145B;
import n5.AbstractC1397A;
import r.C1544C;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f2492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1544C f2494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2496e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RunnableC0114z f2497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2498h;
    public final d i;
    public final C1129a j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a() {
        Y y6 = new Y(3, (byte) 0);
        y6.f1520c = new long[192];
        y6.f1521d = new long[192];
        this.f2492a = y6;
        this.f2493b = new b();
        this.f2494c = new C1544C();
        this.f2498h = -1L;
        this.i = new d(4, this);
        this.j = new C1129a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long g(L l7) {
        float[] fArrMo0getUnderlyingMatrixsQKQjiQ;
        int i;
        C0042g0 c0042g0 = l7.f268U;
        n0 n0Var = c0042g0.f431c;
        n0 n0Var2 = c0042g0.f430b;
        long jH = 0;
        while (n0Var2 != null && n0Var2 != n0Var) {
            s0 s0Var = n0Var2.f498V;
            jH = K1.H(jH, n0Var2.f489M);
            n0Var2 = n0Var2.f480D;
            if (s0Var != null && (i = AbstractC1397A.i((fArrMo0getUnderlyingMatrixsQKQjiQ = s0Var.mo0getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((i & 2) == 0) {
                    return 9223372034707292159L;
                }
                jH = AbstractC1145B.o(fArrMo0getUnderlyingMatrixsQKQjiQ, jH);
            }
        }
        return K1.K(jH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r25 = this;
            r0 = r25
            android.os.Handler r1 = c0.AbstractC0713a.f10071a
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r0.f2495d
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r6 = r0.f2496e
            if (r6 == 0) goto L13
            goto L15
        L13:
            r6 = r5
            goto L16
        L15:
            r6 = r4
        L16:
            E.Y r7 = r0.f2492a
            J0.b r8 = r0.f2493b
            if (r3 == 0) goto L85
            r0.f2495d = r5
            r.C r3 = r0.f2494c
            java.lang.Object[] r9 = r3.f16114a
            int r3 = r3.f16115b
            r10 = r5
        L25:
            if (r10 >= r3) goto L31
            r11 = r9[r10]
            B5.a r11 = (B5.a) r11
            r11.invoke()
            int r10 = r10 + 1
            goto L25
        L31:
            java.lang.Object r3 = r7.f1520c
            long[] r3 = (long[]) r3
            int r9 = r7.f1519b
            r10 = r5
        L38:
            int r11 = r3.length
            int r11 = r11 + (-2)
            if (r10 >= r11) goto L68
            if (r10 >= r9) goto L68
            int r11 = r10 + 2
            r11 = r3[r11]
            r13 = 61
            long r13 = r11 >> r13
            int r13 = (int) r13
            r13 = r13 & r4
            if (r13 == 0) goto L65
            r13 = r3[r10]
            int r13 = r10 + 1
            r13 = r3[r13]
            int r11 = (int) r11
            r12 = 67108863(0x3ffffff, float:1.5046327E-36)
            r11 = r11 & r12
            r.v r12 = r8.f2499a
            java.lang.Object r11 = r12.b(r11)
            if (r11 != 0) goto L5f
            goto L65
        L5f:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L65:
            int r10 = r10 + 3
            goto L38
        L68:
            java.lang.Object r3 = r7.f1520c
            long[] r3 = (long[]) r3
            int r4 = r7.f1519b
            r9 = r5
        L6f:
            int r10 = r3.length
            int r10 = r10 + (-2)
            if (r9 >= r10) goto L85
            if (r9 >= r4) goto L85
            int r10 = r9 + 2
            r11 = r3[r10]
            r13 = -2305843009213693953(0xdfffffffffffffff, double:-2.681561585988519E154)
            long r11 = r11 & r13
            r3[r10] = r11
            int r9 = r9 + 3
            goto L6f
        L85:
            boolean r3 = r0.f2496e
            r13 = 8
            if (r3 == 0) goto Lda
            r0.f2496e = r5
            r.v r3 = r8.f2499a
            r16 = 7
            java.lang.Object[] r4 = r3.f16218c
            long[] r3 = r3.f16216a
            r17 = 128(0x80, double:6.32E-322)
            int r9 = r3.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lde
            r10 = r5
            r19 = 255(0xff, double:1.26E-321)
        L9f:
            r11 = r3[r10]
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = ~r11
            long r14 = r14 << r16
            long r14 = r14 & r11
            long r14 = r14 & r21
            int r14 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r14 == 0) goto Ld5
            int r14 = r10 - r9
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = r5
        Lb8:
            if (r15 >= r14) goto Ld3
            long r23 = r11 & r19
            int r23 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r23 >= 0) goto Lcf
            int r23 = r10 << 3
            int r23 = r23 + r15
            r23 = r4[r23]
            if (r23 != 0) goto Lc9
            goto Lcf
        Lc9:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        Lcf:
            long r11 = r11 >> r13
            int r15 = r15 + 1
            goto Lb8
        Ld3:
            if (r14 != r13) goto Le5
        Ld5:
            if (r10 == r9) goto Le5
            int r10 = r10 + 1
            goto L9f
        Lda:
            r16 = 7
            r17 = 128(0x80, double:6.32E-322)
        Lde:
            r19 = 255(0xff, double:1.26E-321)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        Le5:
            if (r6 == 0) goto Lea
            r8.getClass()
        Lea:
            boolean r3 = r0.f
            if (r3 == 0) goto L132
            r0.f = r5
            java.lang.Object r3 = r7.f1520c
            long[] r3 = (long[]) r3
            int r4 = r7.f1519b
            java.lang.Object r6 = r7.f1521d
            long[] r6 = (long[]) r6
            r9 = r5
            r10 = r9
        Lfc:
            int r11 = r3.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto L12c
            int r11 = r6.length
            int r11 = r11 + (-2)
            if (r10 >= r11) goto L12c
            if (r9 >= r4) goto L12c
            int r11 = r9 + 2
            r14 = r3[r11]
            r23 = 2305843009213693951(0x1fffffffffffffff, double:1.4916681462400412E-154)
            int r12 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r12 == 0) goto L129
            r14 = r3[r9]
            r6[r10] = r14
            int r12 = r10 + 1
            int r14 = r9 + 1
            r14 = r3[r14]
            r6[r12] = r14
            int r12 = r10 + 2
            r14 = r3[r11]
            r6[r12] = r14
            int r10 = r10 + 3
        L129:
            int r9 = r9 + 3
            goto Lfc
        L12c:
            r7.f1519b = r10
            r7.f1520c = r6
            r7.f1521d = r3
        L132:
            long r3 = r8.f2500b
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L139
            return
        L139:
            r.v r1 = r8.f2499a
            java.lang.Object[] r2 = r1.f16218c
            long[] r1 = r1.f16216a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L17a
            r4 = r5
        L145:
            r6 = r1[r4]
            long r9 = ~r6
            long r9 = r9 << r16
            long r9 = r9 & r6
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L175
            int r9 = r4 - r3
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r5
        L159:
            if (r10 >= r9) goto L173
            long r11 = r6 & r19
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 >= 0) goto L16f
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            if (r11 != 0) goto L169
            goto L16f
        L169:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L16f:
            long r6 = r6 >> r13
            int r10 = r10 + 1
            goto L159
        L173:
            if (r9 != r13) goto L17a
        L175:
            if (r4 == r3) goto L17a
            int r4 = r4 + 1
            goto L145
        L17a:
            r1 = -1
            r8.f2500b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.a.a():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B0.L r20, long r21, boolean r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            B0.g0 r2 = r1.f268U
            B0.n0 r2 = r2.f431c
            B0.P r3 = r1.f269V
            B0.c0 r3 = r3.f311p
            int r4 = r3.N()
            int r3 = r3.K()
            r5 = 32
            long r6 = r21 >> r5
            int r6 = (int) r6
            float r7 = (float) r6
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r21 & r8
            int r10 = (int) r10
            float r11 = (float) r10
            int r6 = r6 + r4
            float r4 = (float) r6
            int r10 = r10 + r3
            float r3 = (float) r10
            i0.a r6 = r0.j
            r6.f13516b = r7
            r6.f13517c = r11
            r6.f13518d = r4
            r6.f13519e = r3
        L31:
            if (r2 == 0) goto L7e
            B0.s0 r3 = r2.f498V
            long r10 = r2.f489M
            long r12 = r10 >> r5
            int r4 = (int) r12
            float r4 = (float) r4
            long r10 = r10 & r8
            int r7 = (int) r10
            float r7 = (float) r7
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r12 = (long) r4
            long r10 = r10 << r5
            long r12 = r12 & r8
            long r10 = r10 | r12
            long r12 = r10 >> r5
            int r4 = (int) r12
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r10 = r10 & r8
            int r7 = (int) r10
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r10 = r6.f13516b
            float r10 = r10 + r4
            r6.f13516b = r10
            float r10 = r6.f13517c
            float r10 = r10 + r7
            r6.f13517c = r10
            float r10 = r6.f13518d
            float r10 = r10 + r4
            r6.f13518d = r10
            float r4 = r6.f13519e
            float r4 = r4 + r7
            r6.f13519e = r4
            B0.n0 r2 = r2.f480D
            if (r3 == 0) goto L31
            float[] r3 = r3.mo0getUnderlyingMatrixsQKQjiQ()
            boolean r4 = j0.AbstractC1145B.m(r3)
            if (r4 != 0) goto L31
            j0.AbstractC1145B.p(r3, r6)
            goto L31
        L7e:
            float r2 = r6.f13516b
            int r12 = (int) r2
            float r2 = r6.f13517c
            int r13 = (int) r2
            float r2 = r6.f13518d
            int r14 = (int) r2
            float r2 = r6.f13519e
            int r15 = (int) r2
            int r11 = r1.f280r
            E.Y r10 = r0.f2492a
            if (r23 != 0) goto Ld8
            r3 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r11 & r3
            java.lang.Object r6 = r10.f1520c
            long[] r6 = (long[]) r6
            int r7 = r10.f1519b
            r16 = 0
            r21 = r3
            r3 = r16
            r16 = r5
        La3:
            int r5 = r6.length
            int r5 = r5 + (-2)
            if (r3 >= r5) goto Ld8
            if (r3 >= r7) goto Ld8
            int r5 = r3 + 2
            r17 = r8
            r8 = r6[r5]
            r22 = 1
            int r2 = (int) r8
            r2 = r2 & r21
            if (r2 != r4) goto Ld3
            long r1 = (long) r12
            long r1 = r1 << r16
            long r10 = (long) r13
            long r10 = r10 & r17
            long r1 = r1 | r10
            r6[r3] = r1
            int r3 = r3 + 1
            long r1 = (long) r14
            long r1 = r1 << r16
            long r10 = (long) r15
            long r10 = r10 & r17
            long r1 = r1 | r10
            r6[r3] = r1
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r1 | r8
            r6[r5] = r1
        Ld0:
            r1 = r22
            goto Leb
        Ld3:
            int r3 = r3 + 3
            r8 = r17
            goto La3
        Ld8:
            r22 = 1
            B0.L r1 = r1.s()
            if (r1 == 0) goto Le5
            int r1 = r1.f280r
        Le2:
            r16 = r1
            goto Le7
        Le5:
            r1 = -1
            goto Le2
        Le7:
            E.Y.j(r10, r11, r12, r13, r14, r15, r16)
            goto Ld0
        Leb:
            r0.f2495d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.a.b(B0.L, long, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(L l7) {
        e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            b(l8, l8.f268U.f431c.f489M, false);
            c(l8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(L l7) {
        this.f2495d = true;
        int i = l7.f280r & 67108863;
        Y y6 = this.f2492a;
        long[] jArr = (long[]) y6.f1520c;
        int i7 = y6.f1519b;
        int i8 = 0;
        while (true) {
            if (i8 >= jArr.length - 2 || i8 >= i7) {
                break;
            }
            int i9 = i8 + 2;
            long j = jArr[i9];
            if ((((int) j) & 67108863) == i) {
                jArr[i9] = 2305843009213693952L | j;
                break;
            }
            i8 += 3;
        }
        RunnableC0114z runnableC0114z = this.f2497g;
        boolean z5 = runnableC0114z != null;
        long j7 = this.f2493b.f2500b;
        if (j7 >= 0 || !z5) {
            if (this.f2498h == j7 && z5) {
                return;
            }
            if (runnableC0114z != null) {
                Handler handler = AbstractC0713a.f10071a;
                AbstractC0713a.f10071a.removeCallbacks(runnableC0114z);
            }
            Handler handler2 = AbstractC0713a.f10071a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j7, ((long) 16) + jCurrentTimeMillis);
            this.f2498h = jMax;
            RunnableC0114z runnableC0114z2 = new RunnableC0114z(this.i, 3);
            AbstractC0713a.f10071a.postDelayed(runnableC0114z2, jMax - jCurrentTimeMillis);
            this.f2497g = runnableC0114z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(L l7) {
        long jG = g(l7);
        if (i.a(jG, 9223372034707292159L)) {
            c(l7);
            return;
        }
        l7.f283u = jG;
        l7.f284v = false;
        e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            f(l8, l8.f268U.f431c.f489M, false);
        }
        d(l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(B0.L r29, long r30, boolean r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            B0.P r2 = r1.f269V
            B0.c0 r2 = r2.f311p
            int r3 = r2.N()
            int r2 = r2.K()
            B0.L r4 = r1.s()
            long r5 = r1.f281s
            long r7 = r1.f282t
            r9 = 32
            long r10 = r7 >> r9
            int r10 = (int) r10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r11
            int r7 = (int) r7
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r15 = 0
            if (r4 == 0) goto L99
            r16 = r9
            boolean r9 = r4.f284v
            r17 = r11
            long r11 = r4.f281s
            r20 = r9
            long r8 = r4.f283u
            boolean r21 = W0.i.a(r11, r13)
            if (r21 != 0) goto L59
            if (r20 == 0) goto L48
            long r8 = g(r4)
            r4.f283u = r8
            r4.f284v = r15
        L48:
            boolean r4 = W0.i.a(r8, r13)
            long r8 = W0.i.c(r11, r8)
            r11 = r30
            long r8 = W0.i.c(r8, r11)
            r20 = r15
            goto La4
        L59:
            r11 = r30
            B0.g0 r4 = r1.f268U
            B0.n0 r4 = r4.f431c
            r8 = 0
        L61:
            if (r4 == 0) goto L92
            r20 = r15
            B0.s0 r15 = r4.f498V
            long r13 = r4.f489M
            long r8 = com.google.android.gms.internal.measurement.K1.H(r8, r13)
            B0.n0 r4 = r4.f480D
            if (r15 == 0) goto L8a
            float[] r13 = r15.mo0getUnderlyingMatrixsQKQjiQ()
            int r14 = n5.AbstractC1397A.i(r13)
            r15 = 3
            if (r14 == r15) goto L8a
            r14 = r14 & 2
            if (r14 != 0) goto L86
            r8 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            goto La2
        L86:
            long r8 = j0.AbstractC1145B.o(r13, r8)
        L8a:
            r15 = r20
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            goto L61
        L92:
            r20 = r15
            long r8 = com.google.android.gms.internal.measurement.K1.K(r8)
            goto La2
        L99:
            r16 = r9
            r17 = r11
            r20 = r15
            r11 = r30
            r8 = r11
        La2:
            r4 = r20
        La4:
            if (r4 != 0) goto L21e
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r4 = W0.i.a(r8, r13)
            if (r4 == 0) goto Lb3
            goto L21e
        Lb3:
            r1.f281s = r8
            long r11 = (long) r3
            long r11 = r11 << r16
            long r13 = (long) r2
            long r13 = r13 & r17
            long r11 = r11 | r13
            r1.f282t = r11
            long r11 = r8 >> r16
            int r4 = (int) r11
            long r11 = r8 & r17
            int r11 = (int) r11
            int r12 = r4 + r3
            int r13 = r11 + r2
            if (r32 != 0) goto Ld5
            boolean r5 = W0.i.a(r8, r5)
            if (r5 == 0) goto Ld5
            if (r10 != r3) goto Ld5
            if (r7 != r2) goto Ld5
            return
        Ld5:
            int r2 = r1.f280r
            E.Y r3 = r0.f2492a
            if (r32 != 0) goto L1fe
            r6 = 67108863(0x3ffffff, float:1.5046327E-36)
            r7 = r2 & r6
            java.lang.Object r8 = r3.f1520c
            long[] r8 = (long[]) r8
            int r9 = r3.f1519b
            r10 = r20
        Le8:
            int r14 = r8.length
            int r14 = r14 + (-2)
            if (r10 >= r14) goto L1fe
            if (r10 >= r9) goto L1fe
            int r14 = r10 + 2
            r31 = r6
            r5 = r8[r14]
            int r15 = (int) r5
            r15 = r15 & r31
            if (r15 != r7) goto L1f4
            r1 = r8[r10]
            r21 = r5
            long r5 = (long) r4
            long r5 = r5 << r16
            r23 = r4
            r24 = r5
            long r4 = (long) r11
            long r4 = r4 & r17
            long r4 = r24 | r4
            r8[r10] = r4
            int r4 = r10 + 1
            long r5 = (long) r12
            long r5 = r5 << r16
            long r12 = (long) r13
            long r12 = r12 & r17
            long r5 = r5 | r12
            r8[r4] = r5
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r6 = r21 | r4
            r8[r14] = r6
            long r6 = r1 >> r16
            int r6 = (int) r6
            int r6 = r23 - r6
            int r1 = (int) r1
            int r11 = r11 - r1
            if (r6 == 0) goto L128
            r1 = 1
            goto L12a
        L128:
            r1 = r20
        L12a:
            if (r11 == 0) goto L12e
            r2 = 1
            goto L130
        L12e:
            r2 = r20
        L130:
            r1 = r1 | r2
            if (r1 == 0) goto L1f2
            r19 = 3
            int r10 = r10 + 3
            r1 = -4503599560261633(0xfff0000003ffffff, double:NaN)
            long r7 = r21 & r1
            r9 = r10 & r31
            long r9 = (long) r9
            r12 = 26
            long r9 = r9 << r12
            long r7 = r7 | r9
            java.lang.Object r9 = r3.f1520c
            long[] r9 = (long[]) r9
            java.lang.Object r10 = r3.f1521d
            long[] r10 = (long[]) r10
            int r3 = r3.f1519b
            r19 = 3
            int r3 = r3 / 3
            r10[r20] = r7
            r7 = 1
        L156:
            if (r7 <= 0) goto L1f2
            int r7 = r7 + (-1)
            r13 = r10[r7]
            int r8 = (int) r13
            r8 = r8 & r31
            r21 = r1
            long r1 = r13 >> r12
            int r1 = (int) r1
            r1 = r1 & r31
            r2 = 52
            long r13 = r13 >> r2
            int r13 = (int) r13
            r14 = 511(0x1ff, float:7.16E-43)
            r13 = r13 & r14
            if (r13 != r14) goto L171
            r13 = r3
            goto L172
        L171:
            int r13 = r13 + r1
        L172:
            if (r1 < 0) goto L1f2
        L174:
            int r15 = r9.length
            int r15 = r15 + (-2)
            if (r1 >= r15) goto L1e2
            if (r1 >= r13) goto L1e2
            int r15 = r1 + 2
            r19 = r9[r15]
            r32 = r2
            r29 = r3
            long r2 = r19 >> r12
            int r2 = (int) r2
            r2 = r2 & r31
            if (r2 != r8) goto L1cf
            r2 = r9[r1]
            int r23 = r1 + 1
            r24 = r4
            r4 = r9[r23]
            r26 = r12
            r27 = r13
            long r12 = r2 >> r16
            int r12 = (int) r12
            int r12 = r12 + r6
            int r2 = (int) r2
            int r2 = r2 + r11
            long r12 = (long) r12
            long r12 = r12 << r16
            long r2 = (long) r2
            long r2 = r2 & r17
            long r2 = r2 | r12
            r9[r1] = r2
            long r2 = r4 >> r16
            int r2 = (int) r2
            int r2 = r2 + r6
            int r3 = (int) r4
            int r3 = r3 + r11
            long r4 = (long) r2
            long r4 = r4 << r16
            long r2 = (long) r3
            long r2 = r2 & r17
            long r2 = r2 | r4
            r9[r23] = r2
            long r2 = r19 | r24
            r9[r15] = r2
            long r2 = r19 >> r32
            int r2 = (int) r2
            r2 = r2 & r14
            if (r2 <= 0) goto L1d5
            int r2 = r7 + 1
            int r3 = r1 + 3
            long r4 = r19 & r21
            r3 = r3 & r31
            long r12 = (long) r3
            long r12 = r12 << r26
            long r3 = r4 | r12
            r10[r7] = r3
            r7 = r2
            goto L1d5
        L1cf:
            r24 = r4
            r26 = r12
            r27 = r13
        L1d5:
            int r1 = r1 + 3
            r3 = r29
            r2 = r32
            r4 = r24
            r12 = r26
            r13 = r27
            goto L174
        L1e2:
            r29 = r3
            r24 = r4
            r26 = r12
            r3 = r29
            r1 = r21
            r4 = r24
            r12 = r26
            goto L156
        L1f2:
            r1 = 1
            goto L21b
        L1f4:
            r23 = r4
            r19 = 3
            int r10 = r10 + 3
            r6 = r31
            goto Le8
        L1fe:
            r23 = r4
            B0.L r1 = r1.s()
            if (r1 == 0) goto L215
            int r1 = r1.f280r
        L208:
            r27 = r1
            r22 = r2
            r21 = r3
            r24 = r11
            r25 = r12
            r26 = r13
            goto L217
        L215:
            r1 = -1
            goto L208
        L217:
            E.Y.j(r21, r22, r23, r24, r25, r26, r27)
            goto L1f2
        L21b:
            r0.f2495d = r1
            return
        L21e:
            r28.b(r29, r30, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.a.f(B0.L, long, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(L l7) {
        int i = l7.f280r & 67108863;
        Y y6 = this.f2492a;
        long[] jArr = (long[]) y6.f1520c;
        int i7 = y6.f1519b;
        int i8 = 0;
        while (true) {
            if (i8 >= jArr.length - 2 || i8 >= i7) {
                break;
            }
            int i9 = i8 + 2;
            if ((((int) jArr[i9]) & 67108863) == i) {
                jArr[i8] = -1;
                jArr[i8 + 1] = -1;
                jArr[i9] = 2305843009213693951L;
                break;
            }
            i8 += 3;
        }
        this.f2495d = true;
        this.f = true;
    }
}
