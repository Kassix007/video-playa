package r;

/* JADX INFO: renamed from: r.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1568t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16246a = O.f16162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16250e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1568t() {
        int[] iArr = AbstractC1562m.f16222a;
        this.f16247b = iArr;
        this.f16248c = iArr;
        e(O.e(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f16250e = 0;
        long[] jArr = this.f16246a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16246a;
            int i = this.f16249d;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        this.f = O.a(this.f16249d) - this.f16250e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        int i7 = this.f16249d;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16246a;
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
    public final int c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 & 127;
        int i9 = this.f16249d;
        int i10 = (i7 >>> 7) & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f16246a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j7 = (((long) i8) * 72340172838076673L) ^ j;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                if (this.f16247b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.f16248c[iC];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16249d = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16246a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f = O.a(this.f16249d) - this.f16250e;
        this.f16247b = new int[iMax];
        this.f16248c = new int[iMax];
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
            boolean r3 = r1 instanceof r.C1568t
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.t r1 = (r.C1568t) r1
            int r3 = r1.f16250e
            int r5 = r0.f16250e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16247b
            int[] r5 = r0.f16248c
            long[] r6 = r0.f16246a
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
            int r15 = r1.c(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f16248c
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
        throw new UnsupportedOperationException("Method not decompiled: r.C1568t.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r37.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r37.f16246a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r2 = r37.f16249d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16250e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        r2 = r37.f16246a;
        r3 = r37.f16249d;
        r5 = r37.f16247b;
        r6 = r37.f16248c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = n5.k.O0(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r13 = b(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r32 = r15;
        r2[r8] = (((long) (r9 & 127)) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0183, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0185, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | (((long) (r9 & 127)) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01af, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = (((long) (r9 & 127)) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e9, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f = r.O.a(r37.f16249d) - r37.f16250e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fc, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0207, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020a, code lost:
    
        r2 = r.O.c(r37.f16249d);
        r3 = r37.f16246a;
        r5 = r37.f16247b;
        r6 = r37.f16248c;
        r7 = r37.f16249d;
        e(r2);
        r2 = r37.f16246a;
        r8 = r37.f16247b;
        r9 = r37.f16248c;
        r10 = r37.f16249d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0225, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0272, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0273, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0279, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027d, code lost:
    
        r37.f16250e++;
        r1 = r37.f;
        r3 = r37.f16246a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0295, code lost:
    
        if (((r5 >> r7) & r27) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
    
        r37.f = r1 - r32;
        r1 = r37.f16249d;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r38, int r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = java.lang.Integer.hashCode(r1)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f16249d
            r6 = r4 & r5
            r8 = 0
        L18:
            long[] r9 = r0.f16246a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r8
            r15 = 0
            long r7 = (long) r11
            long r7 = -r7
            r11 = 63
            long r7 = r7 >> r11
            long r7 = r7 & r9
            long r7 = r7 | r12
            long r9 = (long) r2
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r9 * r11
            r19 = r11
            long r11 = r7 ^ r17
            long r17 = r11 - r19
            long r11 = ~r11
            long r11 = r17 & r11
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r17
        L4d:
            r19 = 0
            int r13 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r13 == 0) goto L6e
            int r13 = java.lang.Long.numberOfTrailingZeros(r11)
            int r13 = r13 >> 3
            int r13 = r13 + r6
            r13 = r13 & r5
            r21 = r3
            int[] r3 = r0.f16247b
            r3 = r3[r13]
            if (r3 != r1) goto L65
            goto L2b3
        L65:
            r19 = 1
            long r19 = r11 - r19
            long r11 = r11 & r19
            r3 = r21
            goto L4d
        L6e:
            r21 = r3
            long r11 = ~r7
            r3 = 6
            long r11 = r11 << r3
            long r7 = r7 & r11
            long r7 = r7 & r17
            int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            r7 = 8
            if (r3 == 0) goto L2bf
            int r2 = r0.b(r4)
            int r3 = r0.f
            r11 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L9a
            long[] r3 = r0.f16246a
            int r13 = r2 >> 3
            r19 = r3[r13]
            r3 = r2 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r11
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto La8
        L9a:
            r29 = r9
            r27 = r11
            r18 = r14
            r32 = r15
            r19 = 128(0x80, double:6.32E-322)
            r31 = 7
            goto L27d
        La8:
            int r2 = r0.f16249d
            if (r2 <= r7) goto L207
            int r3 = r0.f16250e
            r19 = 128(0x80, double:6.32E-322)
            long r5 = (long) r3
            r24 = 32
            long r5 = r5 * r24
            long r2 = (long) r2
            r24 = 25
            long r2 = r2 * r24
            r24 = -9223372036854775808
            long r5 = r5 ^ r24
            long r2 = r2 ^ r24
            int r2 = java.lang.Long.compare(r5, r2)
            if (r2 > 0) goto L1fc
            long[] r2 = r0.f16246a
            int r3 = r0.f16249d
            int[] r5 = r0.f16247b
            int[] r6 = r0.f16248c
            int r13 = r3 + 7
            int r13 = r13 >> 3
            r26 = r7
            r7 = r15
        Ld5:
            if (r7 >= r13) goto Lf3
            r27 = r2[r7]
            r29 = r9
            r10 = 7
            long r8 = r27 & r17
            r27 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r12
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r2[r7] = r8
            int r7 = r7 + 1
            r11 = r27
            r9 = r29
            goto Ld5
        Lf3:
            r29 = r9
            r27 = r11
            r12 = 7
            int r7 = n5.k.O0(r2)
            int r8 = r7 + (-1)
            r9 = r2[r8]
            r16 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r16
            r31 = -72057594037927936(0xff00000000000000, double:-5.4861240687936887E303)
            long r9 = r9 | r31
            r2[r8] = r9
            r8 = r2[r15]
            r2[r7] = r8
            r7 = r15
        L112:
            if (r7 == r3) goto L1e9
            int r8 = r7 >> 3
            r9 = r2[r8]
            r11 = r7 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r27
            int r13 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r13 != 0) goto L126
        L123:
            int r7 = r7 + 1
            goto L112
        L126:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L12b
            goto L123
        L12b:
            r9 = r5[r7]
            int r9 = java.lang.Integer.hashCode(r9)
            int r9 = r9 * r21
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r13 = r0.b(r10)
            r10 = r10 & r3
            int r18 = r13 - r10
            r18 = r18 & r3
            r31 = r12
            int r12 = r18 / 8
            int r10 = r7 - r10
            r10 = r10 & r3
            int r10 = r10 / 8
            if (r12 != r10) goto L171
            r9 = r9 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r12 = r2[r8]
            r18 = r14
            r32 = r15
            long r14 = r27 << r11
            long r14 = ~r14
            long r12 = r12 & r14
            long r9 = r9 << r11
            long r9 = r9 | r12
            r2[r8] = r9
            int r8 = r2.length
            int r8 = r8 + (-1)
            r9 = r2[r32]
            long r9 = r9 & r16
            long r9 = r9 | r24
            r2[r8] = r9
            int r7 = r7 + 1
            r14 = r18
            r12 = r31
            r15 = r32
            goto L112
        L171:
            r18 = r14
            r32 = r15
            int r10 = r13 >> 3
            r14 = r2[r10]
            r12 = r13 & 7
            int r12 = r12 << 3
            long r33 = r14 >> r12
            long r33 = r33 & r27
            int r33 = (r33 > r19 ? 1 : (r33 == r19 ? 0 : -1))
            if (r33 != 0) goto L1af
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r33 = r5
            r34 = r6
            long r5 = (long) r9
            r35 = r5
            long r5 = r27 << r12
            long r5 = ~r5
            long r5 = r5 & r14
            long r14 = r35 << r12
            long r5 = r5 | r14
            r2[r10] = r5
            r5 = r2[r8]
            long r9 = r27 << r11
            long r9 = ~r9
            long r5 = r5 & r9
            long r9 = r19 << r11
            long r5 = r5 | r9
            r2[r8] = r5
            r5 = r33[r7]
            r33[r13] = r5
            r33[r7] = r32
            r5 = r34[r7]
            r34[r13] = r5
            r34[r7] = r32
            goto L1d0
        L1af:
            r33 = r5
            r34 = r6
            r5 = r9 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r8 = r27 << r12
            long r8 = ~r8
            long r8 = r8 & r14
            long r5 = r5 << r12
            long r5 = r5 | r8
            r2[r10] = r5
            r5 = r33[r13]
            r6 = r33[r7]
            r33[r13] = r6
            r33[r7] = r5
            r5 = r34[r13]
            r6 = r34[r7]
            r34[r13] = r6
            r34[r7] = r5
            int r7 = r7 + (-1)
        L1d0:
            int r5 = r2.length
            int r5 = r5 + (-1)
            r8 = r2[r32]
            long r8 = r8 & r16
            long r8 = r8 | r24
            r2[r5] = r8
            int r7 = r7 + 1
            r14 = r18
            r12 = r31
            r15 = r32
            r5 = r33
            r6 = r34
            goto L112
        L1e9:
            r31 = r12
            r18 = r14
            r32 = r15
            int r2 = r0.f16249d
            int r2 = r.O.a(r2)
            int r3 = r0.f16250e
            int r2 = r2 - r3
            r0.f = r2
            goto L279
        L1fc:
            r29 = r9
            r27 = r11
            r18 = r14
            r32 = r15
            r31 = 7
            goto L20a
        L207:
            r19 = 128(0x80, double:6.32E-322)
            goto L1fc
        L20a:
            int r2 = r0.f16249d
            int r2 = r.O.c(r2)
            long[] r3 = r0.f16246a
            int[] r5 = r0.f16247b
            int[] r6 = r0.f16248c
            int r7 = r0.f16249d
            r0.e(r2)
            long[] r2 = r0.f16246a
            int[] r8 = r0.f16247b
            int[] r9 = r0.f16248c
            int r10 = r0.f16249d
            r11 = r32
        L225:
            if (r11 >= r7) goto L279
            int r12 = r11 >> 3
            r12 = r3[r12]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r27
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 >= 0) goto L272
            r12 = r5[r11]
            int r13 = java.lang.Integer.hashCode(r12)
            int r13 = r13 * r21
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.b(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r16 = r14 & 7
            int r16 = r16 << 3
            r22 = r15[r13]
            r24 = r1
            long r1 = r27 << r16
            long r1 = ~r1
            long r1 = r22 & r1
            long r16 = r24 << r16
            long r1 = r1 | r16
            r15[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r10
            r16 = r10 & 7
            int r13 = r13 + r16
            int r13 = r13 >> 3
            r15[r13] = r1
            r8[r14] = r12
            r1 = r6[r11]
            r9[r14] = r1
            goto L273
        L272:
            r15 = r2
        L273:
            int r11 = r11 + 1
            r1 = r38
            r2 = r15
            goto L225
        L279:
            int r2 = r0.b(r4)
        L27d:
            int r1 = r0.f16250e
            int r1 = r1 + 1
            r0.f16250e = r1
            int r1 = r0.f
            long[] r3 = r0.f16246a
            int r4 = r2 >> 3
            r5 = r3[r4]
            r7 = r2 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r27
            int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r8 != 0) goto L299
            r32 = r18
        L299:
            int r1 = r1 - r32
            r0.f = r1
            int r1 = r0.f16249d
            long r8 = r27 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r29 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r4 = r2 + (-7)
            r4 = r4 & r1
            r1 = r1 & 7
            int r4 = r4 + r1
            int r1 = r4 >> 3
            r3[r1] = r5
            int r13 = ~r2
        L2b3:
            if (r13 >= 0) goto L2b6
            int r13 = ~r13
        L2b6:
            int[] r1 = r0.f16247b
            r1[r13] = r38
            int[] r1 = r0.f16248c
            r1[r13] = r39
            return
        L2bf:
            r26 = r7
            r32 = r15
            int r8 = r16 + 8
            int r6 = r6 + r8
            r6 = r6 & r5
            r1 = r38
            r3 = r21
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1568t.f(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f16247b;
        int[] iArr2 = this.f16248c;
        long[] jArr = this.f16246a;
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
                        int i10 = iArr[i9];
                        iHashCode += Integer.hashCode(iArr2[i9]) ^ Integer.hashCode(i10);
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f16250e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f16247b
            int[] r3 = r0.f16248c
            long[] r4 = r0.f16246a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f16250e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.m.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1568t.toString():java.lang.String");
    }
}
