package r;

import java.util.Arrays;
import m0.C1346a;
import s.AbstractC1585a;

/* JADX INFO: renamed from: r.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1545D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16116a = O.f16162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16117b = AbstractC1585a.f16413c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f16118c = r.f16240b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16119d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16120e = Integer.MAX_VALUE;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16122h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1545D(int i) {
        if (i >= 0) {
            f(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(Object obj) {
        int i = this.f16121g;
        int iD = d(obj);
        this.f16117b[iD] = obj;
        long[] jArr = this.f16118c;
        int i7 = this.f16119d;
        jArr[iD] = (((long) i7) & 2147483647L) | 4611686016279904256L;
        if (i7 != Integer.MAX_VALUE) {
            jArr[i7] = ((((long) iD) & 2147483647L) << 31) | (jArr[i7] & (-4611686016279904257L));
        }
        this.f16119d = iD;
        if (this.f16120e == Integer.MAX_VALUE) {
            this.f16120e = iD;
        }
        return this.f16121g != i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        this.f16121g = 0;
        long[] jArr = this.f16116a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16116a;
            int i = this.f;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f, null, this.f16117b);
        n5.k.K0(this.f16118c, 4611686018427387903L);
        this.f16119d = Integer.MAX_VALUE;
        this.f16120e = Integer.MAX_VALUE;
        this.f16122h = O.a(this.f) - this.f16121g;
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
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f16116a
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
            java.lang.Object[] r15 = r0.f16117b
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
        throw new UnsupportedOperationException("Method not decompiled: r.C1545D.c(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(Object obj) {
        int i;
        long j;
        long j7;
        long j8;
        char c7;
        long[] jArr;
        long[] jArr2;
        long j9;
        int i7 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.f16116a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j11 = i10;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i12) & i11;
                int i16 = i7;
                if (kotlin.jvm.internal.m.a(this.f16117b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i7 = i16;
            }
            int i17 = i7;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i9);
                long j14 = 255;
                if (this.f16122h != 0 || ((this.f16116a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j11;
                    j7 = 255;
                    j8 = 128;
                } else {
                    int i18 = this.f;
                    if (i18 > 8) {
                        c7 = 31;
                        j8 = 128;
                        if (Long.compare((((long) this.f16121g) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16116a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j11;
                                j7 = 255;
                            } else {
                                int i19 = this.f;
                                Object[] objArr = this.f16117b;
                                long[] jArr5 = this.f16118c;
                                long[] jArr6 = new long[i19];
                                Arrays.fill(jArr6, 0, i19, 9223372034707292159L);
                                i = 0;
                                int i20 = (i19 + 7) >> 3;
                                int i21 = 0;
                                while (i21 < i20) {
                                    long j15 = j14;
                                    long j16 = jArr4[i21] & (-9187201950435737472L);
                                    int i22 = i21;
                                    jArr4[i22] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                                    i21 = i22 + 1;
                                    j14 = j15;
                                }
                                j7 = j14;
                                int length = jArr4.length;
                                int i23 = length - 1;
                                int i24 = length - 2;
                                jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i23] = jArr4[0];
                                int i25 = 0;
                                while (i25 != i19) {
                                    int i26 = i25 >> 3;
                                    int i27 = (i25 & 7) << 3;
                                    long j17 = (jArr4[i26] >> i27) & j7;
                                    if (j17 != 128 && j17 == 254) {
                                        Object obj2 = objArr[i25];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i17;
                                        int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i29 = i28 >>> 7;
                                        int iE2 = e(i29);
                                        int i30 = i29 & i19;
                                        if (((iE2 - i30) & i19) / 8 == ((i25 - i30) & i19) / 8) {
                                            int i31 = i19;
                                            Object[] objArr2 = objArr;
                                            jArr4[i26] = (jArr4[i26] & (~(j7 << i27))) | (((long) (i28 & 127)) << i27);
                                            if (jArr6[i25] == 9223372034707292159L) {
                                                long j18 = i25;
                                                jArr6[i25] = j18 | (j18 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i25++;
                                            i19 = i31;
                                            objArr = objArr2;
                                        } else {
                                            int i32 = i19;
                                            Object[] objArr3 = objArr;
                                            int i33 = iE2 >> 3;
                                            long j19 = jArr4[i33];
                                            int i34 = (iE2 & 7) << 3;
                                            if (((j19 >> i34) & j7) == 128) {
                                                jArr4[i33] = (j19 & (~(j7 << i34))) | (((long) (i28 & 127)) << i34);
                                                jArr4[i26] = (jArr4[i26] & (~(j7 << i27))) | (128 << i27);
                                                objArr3[iE2] = objArr3[i25];
                                                objArr3[i25] = null;
                                                jArr5[iE2] = jArr5[i25];
                                                jArr5[i25] = 4611686018427387903L;
                                                int i35 = (int) ((jArr6[i25] >> 32) & 4294967295L);
                                                int i36 = Integer.MAX_VALUE;
                                                if (i35 != Integer.MAX_VALUE) {
                                                    j9 = j11;
                                                    jArr6[i35] = ((long) iE2) | (jArr6[i35] & (-4294967296L));
                                                    jArr6[i25] = (jArr6[i25] & 4294967295L) | (-4294967296L);
                                                    i36 = Integer.MAX_VALUE;
                                                } else {
                                                    j9 = j11;
                                                    jArr6[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr6[iE2] = (((long) i25) << 32) | ((long) i36);
                                            } else {
                                                j9 = j11;
                                                jArr4[i33] = (((long) (i28 & 127)) << i34) | (j19 & (~(j7 << i34)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i25];
                                                objArr3[i25] = obj3;
                                                long j20 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i25];
                                                jArr5[i25] = j20;
                                                int i37 = (int) ((jArr6[i25] >> 32) & 4294967295L);
                                                if (i37 != Integer.MAX_VALUE) {
                                                    long j21 = iE2;
                                                    jArr6[i37] = (jArr6[i37] & (-4294967296L)) | j21;
                                                    jArr6[i25] = (jArr6[i25] & 4294967295L) | (j21 << 32);
                                                } else {
                                                    long j22 = iE2;
                                                    jArr6[i25] = j22 | (j22 << 32);
                                                    i37 = i25;
                                                }
                                                jArr6[iE2] = (((long) i37) << 32) | ((long) i25);
                                                i25--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i25++;
                                            i19 = i32;
                                            objArr = objArr3;
                                            j11 = j9;
                                        }
                                    } else {
                                        i25++;
                                    }
                                }
                                j = j11;
                                this.f16122h = O.a(this.f) - this.f16121g;
                                long[] jArr7 = this.f16118c;
                                int length2 = jArr7.length;
                                for (int i38 = 0; i38 < length2; i38++) {
                                    long j23 = jArr7[i38];
                                    int i39 = (int) ((j23 >> 31) & 2147483647L);
                                    int i40 = (int) (j23 & 2147483647L);
                                    jArr7[i38] = (((j23 & (-4611686018427387904L)) | ((long) (i39 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i39] & 4294967295L)))) << 31) | ((long) (i40 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i40] & 4294967295L)));
                                }
                                int i41 = this.f16119d;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.f16119d = (int) (jArr6[i41] & 4294967295L);
                                }
                                int i42 = this.f16120e;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f16120e = (int) (jArr6[i42] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i9);
                    } else {
                        c7 = 31;
                        j8 = 128;
                    }
                    i = 0;
                    j = j11;
                    j7 = 255;
                    int iC = O.c(this.f);
                    long[] jArr8 = this.f16116a;
                    Object[] objArr4 = this.f16117b;
                    long[] jArr9 = this.f16118c;
                    int i43 = this.f;
                    int[] iArr = new int[i43];
                    f(iC);
                    long[] jArr10 = this.f16116a;
                    Object[] objArr5 = this.f16117b;
                    long[] jArr11 = this.f16118c;
                    int i44 = this.f;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr8[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j8) {
                            Object obj4 = objArr4[i45];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i17;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i46 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j24 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            long j25 = (jArr[i47] & (~(255 << i48))) | (j24 << i48);
                            jArr[i47] = j25;
                            jArr[(((iE3 - 7) & i44) + (i44 & 7)) >> 3] = j25;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i45];
                            iArr[i45] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i45++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f16118c;
                    int length3 = jArr12.length;
                    for (int i49 = 0; i49 < length3; i49++) {
                        long j26 = jArr12[i49];
                        int i50 = (int) ((j26 >> c7) & 2147483647L);
                        int i51 = (int) (j26 & 2147483647L);
                        jArr12[i49] = (((j26 & (-4611686018427387904L)) | ((long) (i50 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i50]))) << c7) | ((long) (i51 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i51]));
                    }
                    int i52 = this.f16119d;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f16119d = iArr[i52];
                    }
                    int i53 = this.f16120e;
                    if (i53 != Integer.MAX_VALUE) {
                        this.f16120e = iArr[i53];
                    }
                    iE = e(i9);
                }
                this.f16121g++;
                int i54 = this.f16122h;
                long[] jArr13 = this.f16116a;
                int i55 = iE >> 3;
                long j27 = jArr13[i55];
                int i56 = (iE & 7) << 3;
                if (((j27 >> i56) & j7) == j8) {
                    i = 1;
                }
                this.f16122h = i54 - i;
                int i57 = this.f;
                long j28 = (j27 & (~(j7 << i56))) | (j << i56);
                jArr13[i55] = j28;
                jArr13[(((iE - 7) & i57) + (i57 & 7)) >> 3] = j28;
                return iE;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i7 = i17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i) {
        int i7 = this.f;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16116a;
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
            boolean r3 = r1 instanceof r.C1545D
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.D r1 = (r.C1545D) r1
            int r3 = r1.f16121g
            int r5 = r0.f16121g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f16117b
            long[] r5 = r0.f16116a
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
        throw new UnsupportedOperationException("Method not decompiled: r.C1545D.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16116a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f16122h = O.a(this.f) - this.f16121g;
        this.f16117b = iMax == 0 ? AbstractC1585a.f16413c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = r.f16240b;
        } else {
            jArr2 = new long[iMax];
            n5.k.K0(jArr2, 4611686018427387903L);
        }
        this.f16118c = jArr2;
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
    public final boolean g(java.lang.Object r18) {
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
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f16116a
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
            java.lang.Object[] r15 = r0.f16117b
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
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1545D.g(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i) {
        this.f16121g--;
        long[] jArr = this.f16116a;
        int i7 = this.f;
        int i8 = i >> 3;
        int i9 = (i & 7) << 3;
        long j = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j;
        jArr[(((i - 7) & i7) + (i7 & 7)) >> 3] = j;
        this.f16117b[i] = null;
        long[] jArr2 = this.f16118c;
        long j7 = jArr2[i];
        int i10 = (int) ((j7 >> 31) & 2147483647L);
        int i11 = (int) (j7 & 2147483647L);
        if (i10 != Integer.MAX_VALUE) {
            jArr2[i10] = (jArr2[i10] & (-2147483648L)) | (((long) i11) & 2147483647L);
        } else {
            this.f16119d = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = ((((long) i10) & 2147483647L) << 31) | (jArr2[i11] & (-4611686016279904257L));
        } else {
            this.f16120e = i10;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.f16121g;
        Object[] objArr = this.f16117b;
        long[] jArr = this.f16116a;
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.m.e(r1, r2)
            java.lang.Object[] r2 = r0.f16117b
            int r3 = r0.f16121g
            long[] r4 = r0.f16116a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = n5.l.h0(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f16121g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1545D.i(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C1346a c1346a = new C1346a(3, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f16117b;
        long[] jArr = this.f16118c;
        int i = this.f16120e;
        int i7 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i8 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c1346a.invoke(obj));
            i7++;
            i = i8;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
