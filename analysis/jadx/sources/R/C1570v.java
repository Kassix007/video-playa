package r;

import s.AbstractC1585a;

/* JADX INFO: renamed from: r.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1570v extends AbstractC1560k {
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1570v(int i) {
        this.f16216a = O.f16162a;
        this.f16217b = AbstractC1562m.f16222a;
        this.f16218c = AbstractC1585a.f16413c;
        if (i >= 0) {
            f(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f16220e = 0;
        long[] jArr = this.f16216a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16216a;
            int i = this.f16219d;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f16219d, null, this.f16218c);
        this.f = O.a(this.f16219d) - this.f16220e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        long j;
        long j7;
        int i7;
        long j8;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i8;
        int i9 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f16219d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr3 = this.f16216a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j9 = ((jArr3[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr3[i16] >>> i17);
            long j10 = i12;
            int i19 = i15;
            int i20 = 0;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j12) >> 3)) & i13;
                int i21 = i9;
                int i22 = i20;
                if (this.f16217b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i9 = i21;
                i20 = i22;
            }
            int i23 = i9;
            int i24 = i20;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iE = e(i11);
                long j13 = 255;
                if (this.f != 0 || ((this.f16216a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j7 = j10;
                    i7 = 1;
                    j8 = 128;
                } else {
                    int i25 = this.f16219d;
                    if (i25 > 8) {
                        j8 = 128;
                        if (Long.compare((((long) this.f16220e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16216a;
                            int i26 = this.f16219d;
                            int[] iArr2 = this.f16217b;
                            Object[] objArr2 = this.f16218c;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = i24;
                            while (i28 < i27) {
                                long j14 = j13;
                                long j15 = jArr4[i28] & (-9187201950435737472L);
                                jArr4[i28] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i28++;
                                j10 = j10;
                                j13 = j14;
                            }
                            j = j13;
                            j7 = j10;
                            int iO0 = n5.k.O0(jArr4);
                            int i29 = iO0 - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iO0] = jArr4[i24];
                            int i30 = i24;
                            while (i30 != i26) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j17 = (jArr4[i31] >> i32) & j;
                                if (j17 != 128 && j17 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i30]) * i23;
                                    int i33 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i34 = i33 >>> 7;
                                    int iE2 = e(i34);
                                    int i35 = i34 & i26;
                                    if (((iE2 - i35) & i26) / 8 == ((i30 - i35) & i26) / 8) {
                                        long j18 = j16;
                                        jArr4[i31] = (((long) (i33 & 127)) << i32) | ((~(j << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - i18] = (jArr4[i24] & j18) | Long.MIN_VALUE;
                                        i30++;
                                        j16 = j18;
                                    } else {
                                        long j19 = j16;
                                        int i36 = iE2 >> 3;
                                        long j20 = jArr4[i36];
                                        int i37 = (iE2 & 7) << 3;
                                        if (((j20 >> i37) & j) == 128) {
                                            i8 = i18;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j << i37)) & j20) | (((long) (i33 & 127)) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j << i32))) | (128 << i32);
                                            iArr[iE2] = iArr[i30];
                                            iArr[i30] = i24;
                                            objArr[iE2] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i8 = i18;
                                            jArr4[i36] = (((long) (i33 & 127)) << i37) | ((~(j << i37)) & j20);
                                            int i38 = iArr[iE2];
                                            iArr[iE2] = iArr[i30];
                                            iArr[i30] = i38;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i30];
                                            objArr[i30] = obj;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i24] & j19) | Long.MIN_VALUE;
                                        i30++;
                                        j16 = j19;
                                        i18 = i8;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            i7 = i18;
                            this.f = O.a(this.f16219d) - this.f16220e;
                        }
                        iE = e(i11);
                    } else {
                        j8 = 128;
                    }
                    j = 255;
                    j7 = j10;
                    i7 = 1;
                    int iC = O.c(this.f16219d);
                    long[] jArr5 = this.f16216a;
                    int[] iArr3 = this.f16217b;
                    Object[] objArr3 = this.f16218c;
                    int i39 = this.f16219d;
                    f(iC);
                    long[] jArr6 = this.f16216a;
                    int[] iArr4 = this.f16217b;
                    Object[] objArr4 = this.f16218c;
                    int i40 = this.f16219d;
                    int i41 = i24;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j8) {
                            int i42 = iArr3[i41];
                            int iHashCode3 = Integer.hashCode(i42) * i23;
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i43 >>> 7);
                            long j21 = i43 & 127;
                            int i44 = iE3 >> 3;
                            int i45 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = (jArr6[i44] & (~(255 << i45))) | (j21 << i45);
                            jArr[i44] = j22;
                            jArr[(((iE3 - 7) & i40) + (i40 & 7)) >> 3] = j22;
                            iArr4[iE3] = i42;
                            objArr4[iE3] = objArr3[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i11);
                }
                this.f16220e++;
                int i46 = this.f;
                long[] jArr7 = this.f16216a;
                int i47 = iE >> 3;
                long j23 = jArr7[i47];
                int i48 = (iE & 7) << 3;
                if (((j23 >> i48) & j) != j8) {
                    i7 = i24;
                }
                this.f = i46 - i7;
                int i49 = this.f16219d;
                long j24 = (j23 & (~(j << i48))) | (j7 << i48);
                jArr7[i47] = j24;
                jArr7[(((iE - 7) & i49) + (i49 & 7)) >> 3] = j24;
                return iE;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i23;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i) {
        int i7 = this.f16219d;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16216a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j7 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j7 != 0) {
                return (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16219d = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16216a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f = O.a(this.f16219d) - this.f16220e;
        this.f16217b = new int[iMax];
        this.f16218c = new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f16219d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f16216a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f16217b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f16220e
            int r0 = r0 + (-1)
            r13.f16220e = r0
            long[] r0 = r13.f16216a
            int r1 = r13.f16219d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f16218c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1570v.g(int):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i, Object obj) {
        int iD = d(i);
        this.f16217b[iD] = i;
        this.f16218c[iD] = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:9) call: r.v.<init>(int):void type: THIS */
    public /* synthetic */ C1570v() {
        this(6);
    }
}
