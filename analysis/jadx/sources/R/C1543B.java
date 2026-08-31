package r;

import s.AbstractC1585a;

/* JADX INFO: renamed from: r.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1543B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16113e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1543B(int i) {
        this.f16109a = O.f16162a;
        this.f16110b = AbstractC1585a.f16413c;
        this.f16111c = AbstractC1562m.f16222a;
        if (i >= 0) {
            e(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f16113e = 0;
        long[] jArr = this.f16109a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16109a;
            int i = this.f16112d;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f16112d, null, this.f16110b);
        this.f = O.a(this.f16112d) - this.f16113e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        int i7 = this.f16112d;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16109a;
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
    public final int c(Object obj) {
        long j;
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i7 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f16112d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.f16109a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j10 = i10;
            int i16 = i10;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j12) >> 3)) & i11;
                int i17 = i7;
                if (kotlin.jvm.internal.m.a(this.f16110b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i7 = i17;
            }
            int i18 = i7;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iB = b(i9);
                long j13 = 255;
                if (this.f != 0 || ((this.f16109a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j7 = j10;
                    j8 = 128;
                } else {
                    int i19 = this.f16112d;
                    if (i19 > 8) {
                        int i20 = 8;
                        if (Long.compare((((long) this.f16113e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16109a;
                            int i21 = this.f16112d;
                            Object[] objArr2 = this.f16110b;
                            int[] iArr = this.f16111c;
                            j8 = 128;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j14 = j13;
                                long j15 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i23++;
                                i20 = i20;
                                j10 = j10;
                                j13 = j14;
                            }
                            j = j13;
                            j7 = j10;
                            int i24 = i20;
                            int iO0 = n5.k.O0(jArr4);
                            int i25 = iO0 - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iO0] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j17 = (jArr4[i27] >> i28) & j;
                                if (j17 != 128 && j17 == 254) {
                                    Object obj2 = objArr2[i26];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iB2 = b(i30);
                                    int i31 = i30 & i21;
                                    long j18 = j16;
                                    if (((iB2 - i31) & i21) / 8 == ((i26 - i31) & i21) / i24) {
                                        jArr4[i27] = (((long) (i29 & 127)) << i28) | (jArr4[i27] & (~(j << i28)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i26++;
                                        j16 = j18;
                                        i24 = i24;
                                    } else {
                                        int i32 = i24;
                                        int i33 = iB2 >> 3;
                                        long j19 = jArr4[i33];
                                        int i34 = (iB2 & 7) << 3;
                                        if (((j19 >> i34) & j) == 128) {
                                            i = i21;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j << i34)) & j19) | (((long) (i29 & 127)) << i34);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
                                            objArr[iB2] = objArr[i26];
                                            objArr[i26] = null;
                                            iArr[iB2] = iArr[i26];
                                            iArr[i26] = 0;
                                        } else {
                                            i = i21;
                                            objArr = objArr2;
                                            jArr4[i33] = (((long) (i29 & 127)) << i34) | ((~(j << i34)) & j19);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i26];
                                            objArr[i26] = obj3;
                                            int i35 = iArr[iB2];
                                            iArr[iB2] = iArr[i26];
                                            iArr[i26] = i35;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i26++;
                                        i21 = i;
                                        j16 = j18;
                                        i24 = i32;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f = O.a(this.f16112d) - this.f16113e;
                        }
                        iB = b(i9);
                    }
                    j = 255;
                    j7 = j10;
                    j8 = 128;
                    int iC = O.c(this.f16112d);
                    long[] jArr5 = this.f16109a;
                    Object[] objArr3 = this.f16110b;
                    int[] iArr2 = this.f16111c;
                    int i36 = this.f16112d;
                    e(iC);
                    long[] jArr6 = this.f16109a;
                    Object[] objArr4 = this.f16110b;
                    int[] iArr3 = this.f16111c;
                    int i37 = this.f16112d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i38];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i18;
                            int i39 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i39 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j20 = i39 & 127;
                            int i40 = iB3 >> 3;
                            int i41 = (iB3 & 7) << 3;
                            long j21 = (jArr[i40] & (~(255 << i41))) | (j20 << i41);
                            jArr[i40] = j21;
                            jArr[(((iB3 - 7) & i37) + (i37 & 7)) >> 3] = j21;
                            objArr4[iB3] = obj4;
                            iArr3[iB3] = iArr2[i38];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iB = b(i9);
                }
                this.f16113e++;
                int i42 = this.f;
                long[] jArr7 = this.f16109a;
                int i43 = iB >> 3;
                long j22 = jArr7[i43];
                int i44 = (iB & 7) << 3;
                this.f = i42 - (((j22 >> i44) & j) == j8 ? 1 : 0);
                int i45 = this.f16112d;
                long j23 = (j22 & (~(j << i44))) | (j7 << i44);
                jArr7[i43] = j23;
                jArr7[(((iB - 7) & i45) + (i45 & 7)) >> 3] = j23;
                return ~iB;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 & 127;
        int i9 = this.f16112d;
        int i10 = i7 >>> 7;
        while (true) {
            int i11 = i10 & i9;
            long[] jArr = this.f16109a;
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j7 = (((long) i8) * 72340172838076673L) ^ j;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i11) & i9;
                if (kotlin.jvm.internal.m.a(this.f16110b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i10 = i11 + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16112d = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16109a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f = O.a(this.f16112d) - this.f16113e;
        this.f16110b = new Object[iMax];
        this.f16111c = new int[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof r.C1543B
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.B r1 = (r.C1543B) r1
            int r3 = r1.f16113e
            int r5 = r0.f16113e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f16110b
            int[] r5 = r0.f16111c
            long[] r6 = r0.f16109a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.d(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f16111c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = r2
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L66:
            r16 = r2
            if (r11 != r12) goto L76
            goto L6d
        L6b:
            r16 = r2
        L6d:
            if (r8 == r7) goto L76
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L74:
            r16 = r2
        L76:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1543B.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        this.f16113e--;
        long[] jArr = this.f16109a;
        int i7 = this.f16112d;
        int i8 = i >> 3;
        int i9 = (i & 7) << 3;
        long j = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j;
        jArr[(((i - 7) & i7) + (i7 & 7)) >> 3] = j;
        this.f16110b[i] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f16110b[iC] = obj;
        this.f16111c[iC] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f16110b;
        int[] iArr = this.f16111c;
        long[] jArr = this.f16109a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        int i9 = (i << 3) + i8;
                        Object obj = objArr[i9];
                        iHashCode += Integer.hashCode(iArr[i9]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f16113e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f16110b
            int[] r3 = r0.f16111c
            long[] r4 = r0.f16109a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f16113e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.m.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1543B.toString():java.lang.String");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:9) call: r.B.<init>(int):void type: THIS */
    public /* synthetic */ C1543B() {
        this(6);
    }
}
