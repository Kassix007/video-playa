package r;

import s.AbstractC1585a;

/* JADX INFO: renamed from: r.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1549H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16142e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1549H(int i) {
        this.f16138a = O.f16162a;
        this.f16139b = AbstractC1585a.f16413c;
        if (i >= 0) {
            f(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(Object obj) {
        int i = this.f16141d;
        this.f16139b[d(obj)] = obj;
        return this.f16141d != i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        this.f16141d = 0;
        long[] jArr = this.f16138a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16138a;
            int i = this.f16140c;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f16140c, null, this.f16139b);
        this.f16142e = O.a(this.f16140c) - this.f16141d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f16140c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f16138a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f16139b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.m.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1549H.c(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(Object obj) {
        long j;
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i7;
        int i8 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f16140c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f16138a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j10 = i11;
            int i17 = i11;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                int i18 = i8;
                if (kotlin.jvm.internal.m.a(this.f16139b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i8 = i18;
            }
            int i19 = i8;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j13 = 255;
                if (this.f16142e != 0 || ((this.f16138a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j7 = j10;
                    j8 = 128;
                } else {
                    int i20 = this.f16140c;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((((long) this.f16141d) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16138a;
                            int i22 = this.f16140c;
                            Object[] objArr2 = this.f16139b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            j8 = 128;
                            while (i24 < i23) {
                                long j14 = j13;
                                long j15 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i24++;
                                i21 = i21;
                                j10 = j10;
                                j13 = j14;
                            }
                            j = j13;
                            j7 = j10;
                            int i25 = i21;
                            int iO0 = n5.k.O0(jArr4);
                            int i26 = iO0 - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iO0] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j17 = (jArr4[i28] >> i29) & j;
                                if (j17 != 128 && j17 == 254) {
                                    Object obj2 = objArr2[i27];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iE2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((iE2 - i32) & i22) / i25 == ((i27 - i32) & i22) / i25) {
                                        long j18 = j16;
                                        jArr4[i28] = (((long) (i30 & 127)) << i29) | ((~(j << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i27++;
                                        j16 = j18;
                                    } else {
                                        long j19 = j16;
                                        int i33 = iE2 >> 3;
                                        long j20 = jArr4[i33];
                                        int i34 = (iE2 & 7) << 3;
                                        if (((j20 >> i34) & j) == 128) {
                                            i7 = i25;
                                            i = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j << i34)) & j20) | (((long) (i30 & 127)) << i34);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            i = i22;
                                            objArr = objArr2;
                                            i7 = i25;
                                            jArr4[i33] = (((long) (i30 & 127)) << i34) | ((~(j << i34)) & j20);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i27++;
                                        j16 = j19;
                                        i25 = i7;
                                        i22 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f16142e = O.a(this.f16140c) - this.f16141d;
                        }
                        iE = e(i10);
                    }
                    j = 255;
                    j7 = j10;
                    j8 = 128;
                    int iC = O.c(this.f16140c);
                    long[] jArr5 = this.f16138a;
                    Object[] objArr3 = this.f16139b;
                    int i35 = this.f16140c;
                    f(iC);
                    long[] jArr6 = this.f16138a;
                    Object[] objArr4 = this.f16139b;
                    int i36 = this.f16140c;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i38 >>> 7);
                            long j21 = i38 & 127;
                            int i39 = iE3 >> 3;
                            int i40 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = (jArr6[i39] & (~(255 << i40))) | (j21 << i40);
                            jArr[i39] = j22;
                            jArr[(((iE3 - 7) & i36) + (i36 & 7)) >> 3] = j22;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i10);
                }
                this.f16141d++;
                int i41 = this.f16142e;
                long[] jArr7 = this.f16138a;
                int i42 = iE >> 3;
                long j23 = jArr7[i42];
                int i43 = (iE & 7) << 3;
                this.f16142e = i41 - (((j23 >> i43) & j) == j8 ? 1 : 0);
                int i44 = this.f16140c;
                long j24 = (j23 & (~(j << i43))) | (j7 << i43);
                jArr7[i42] = j24;
                jArr7[(((iE - 7) & i44) + (i44 & 7)) >> 3] = j24;
                return iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = i19;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i) {
        int i7 = this.f16140c;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16138a;
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
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof r.C1549H
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.H r1 = (r.C1549H) r1
            int r3 = r1.f16141d
            int r5 = r0.f16141d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f16139b
            long[] r5 = r0.f16138a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1549H.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16140c = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16138a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f16142e = O.a(this.f16140c) - this.f16141d;
        this.f16139b = iMax == 0 ? AbstractC1585a.f16413c : new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        return this.f16141d == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        return this.f16141d != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f16140c * 31) + this.f16141d;
        Object[] objArr = this.f16139b;
        long[] jArr = this.f16138a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i8];
                            if (!kotlin.jvm.internal.m.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i7 != 8) {
                        return iHashCode;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f16140c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f16138a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f16139b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.m.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1549H.i(java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Object obj) {
        this.f16139b[d(obj)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(C1549H elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Object[] objArr = elements.f16139b;
        long[] jArr = elements.f16138a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        j(objArr[(i << 3) + i8]);
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f16140c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f16138a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f16139b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.m.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1549H.l(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i) {
        this.f16141d--;
        long[] jArr = this.f16138a;
        int i7 = this.f16140c;
        int i8 = i >> 3;
        int i9 = (i & 7) << 3;
        long j = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j;
        jArr[(((i - 7) & i7) + (i7 & 7)) >> 3] = j;
        this.f16139b[i] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            P.P0 r1 = new P.P0
            r2 = 1
            r1.<init>(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f16139b
            long[] r4 = r0.f16138a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L35:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            r15 = -1
            if (r8 != r15) goto L4e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L70
        L4e:
            if (r8 == 0) goto L55
            java.lang.String r15 = ", "
            r2.append(r15)
        L55:
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2.append(r14)
            int r8 = r8 + 1
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L35
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.lang.String r1 = "]"
            r2.append(r1)
        L70:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.m.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1549H.toString():java.lang.String");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:7) call: r.H.<init>(int):void type: THIS */
    public /* synthetic */ C1549H() {
        this(6);
    }
}
