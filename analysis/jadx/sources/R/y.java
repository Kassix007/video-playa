package r;

import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16260a = O.f16162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f16261b = AbstractC1565p.f16234a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f16262c = AbstractC1585a.f16413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16264e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(int i) {
        if (i >= 0) {
            e(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f16264e = 0;
        long[] jArr = this.f16260a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16260a;
            int i = this.f16263d;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f16263d, null, this.f16262c);
        this.f = O.a(this.f16263d) - this.f16264e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f16263d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f16260a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f16261b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.y.b(long):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        int i7 = this.f16263d;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16260a;
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
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f16263d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f16260a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f16261b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.f16262c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: r.y.d(long):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16263d = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16260a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f = O.a(this.f16263d) - this.f16264e;
        this.f16261b = new long[iMax];
        this.f16262c = new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof r.y
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.y r1 = (r.y) r1
            int r3 = r1.f16264e
            int r5 = r0.f16264e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f16261b
            java.lang.Object[] r5 = r0.f16262c
            long[] r6 = r0.f16260a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
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
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.d(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.d(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: r.y.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r38.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r38.f16260a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r1 = r38.f16263d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (java.lang.Long.compare((((long) r38.f16264e) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r1 = r38.f16260a;
        r2 = r38.f16263d;
        r4 = r38.f16261b;
        r5 = r38.f16262c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = n5.k.O0(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r15 = c(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = (((long) (r9 & 127)) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | (((long) (r9 & 127)) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01af, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = (((long) (r9 & 127)) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d4, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ec, code lost:
    
        r18 = r11;
        r38.f = r.O.a(r38.f16263d) - r38.f16264e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fd, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0208, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020b, code lost:
    
        r1 = r.O.c(r38.f16263d);
        r2 = r38.f16260a;
        r4 = r38.f16261b;
        r5 = r38.f16262c;
        r6 = r38.f16263d;
        e(r1);
        r1 = r38.f16260a;
        r7 = r38.f16261b;
        r8 = r38.f16262c;
        r9 = r38.f16263d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0226, code lost:
    
        if (r10 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0235, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0237, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0275, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0278, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027e, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0282, code lost:
    
        r16 = r1;
        r38.f16264e++;
        r1 = r38.f;
        r2 = r38.f16260a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x029c, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029e, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a0, code lost:
    
        r38.f = r1 - r29;
        r1 = r38.f16263d;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r39, java.lang.Object r41) {
        /*
            r38 = this;
            r0 = r38
            int r1 = java.lang.Long.hashCode(r39)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f16263d
            r5 = r3 & r4
            r7 = 0
        L16:
            long[] r8 = r0.f16260a
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            r12 = 0
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L47:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L6c
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            r19 = r2
            long[] r2 = r0.f16261b
            r20 = r2[r16]
            int r2 = (r20 > r39 ? 1 : (r20 == r39 ? 0 : -1))
            if (r2 != 0) goto L63
            goto L2b9
        L63:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r2 = r19
            goto L47
        L6c:
            r19 = r2
            long r6 = ~r8
            r2 = 6
            long r6 = r6 << r2
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r6 = 8
            if (r2 == 0) goto L2c2
            int r1 = r0.c(r3)
            int r2 = r0.f
            r7 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L97
            long[] r2 = r0.f16260a
            int r18 = r1 >> 3
            r20 = r2[r18]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r20 = r20 >> r2
            long r20 = r20 & r7
            r22 = 254(0xfe, double:1.255E-321)
            int r2 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r2 != 0) goto La5
        L97:
            r27 = r7
            r31 = r10
            r29 = r12
            r18 = r13
            r20 = 128(0x80, double:6.32E-322)
            r30 = 7
            goto L282
        La5:
            int r1 = r0.f16263d
            if (r1 <= r6) goto L208
            int r2 = r0.f16264e
            r20 = 128(0x80, double:6.32E-322)
            long r4 = (long) r2
            r24 = 32
            long r4 = r4 * r24
            long r1 = (long) r1
            r24 = 25
            long r1 = r1 * r24
            r24 = -9223372036854775808
            long r4 = r4 ^ r24
            long r1 = r1 ^ r24
            int r1 = java.lang.Long.compare(r4, r1)
            if (r1 > 0) goto L1fd
            long[] r1 = r0.f16260a
            int r2 = r0.f16263d
            long[] r4 = r0.f16261b
            java.lang.Object[] r5 = r0.f16262c
            int r18 = r2 + 7
            r26 = r6
            int r6 = r18 >> 3
            r27 = r7
            r7 = r12
        Ld4:
            if (r7 >= r6) goto Lf3
            r29 = r1[r7]
            r31 = r10
            r8 = 7
            long r9 = r29 & r14
            r29 = r12
            r11 = r13
            long r12 = ~r9
            long r9 = r9 >>> r8
            long r12 = r12 + r9
            r9 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r9 = r9 & r12
            r1[r7] = r9
            int r7 = r7 + 1
            r13 = r11
            r12 = r29
            r10 = r31
            goto Ld4
        Lf3:
            r31 = r10
            r29 = r12
            r11 = r13
            r8 = 7
            int r6 = n5.k.O0(r1)
            int r7 = r6 + (-1)
            r9 = r1[r7]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r12
            r14 = -72057594037927936(0xff00000000000000, double:-5.4861240687936887E303)
            long r9 = r9 | r14
            r1[r7] = r9
            r9 = r1[r29]
            r1[r6] = r9
            r6 = r29
        L112:
            if (r6 == r2) goto L1ec
            int r7 = r6 >> 3
            r9 = r1[r7]
            r14 = r6 & 7
            int r14 = r14 << 3
            long r9 = r9 >> r14
            long r9 = r9 & r27
            int r15 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r15 != 0) goto L126
        L123:
            int r6 = r6 + 1
            goto L112
        L126:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L12b
            goto L123
        L12b:
            r9 = r4[r6]
            int r9 = java.lang.Long.hashCode(r9)
            int r9 = r9 * r19
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r15 = r0.c(r10)
            r10 = r10 & r2
            int r18 = r15 - r10
            r18 = r18 & r2
            r30 = r8
            int r8 = r18 / 8
            int r10 = r6 - r10
            r10 = r10 & r2
            int r10 = r10 / 8
            if (r8 != r10) goto L16f
            r8 = r9 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r33 = r1[r7]
            r10 = r11
            r35 = r12
            long r11 = r27 << r14
            long r11 = ~r11
            long r11 = r33 & r11
            long r8 = r8 << r14
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 - r10
            r8 = r1[r29]
            long r8 = r8 & r35
            long r8 = r8 | r24
            r1[r7] = r8
            int r6 = r6 + 1
            r11 = r10
            r8 = r30
            r12 = r35
            goto L112
        L16f:
            r10 = r11
            r35 = r12
            int r8 = r15 >> 3
            r11 = r1[r8]
            r13 = r15 & 7
            int r13 = r13 << 3
            long r33 = r11 >> r13
            long r33 = r33 & r27
            int r18 = (r33 > r20 ? 1 : (r33 == r20 ? 0 : -1))
            if (r18 != 0) goto L1af
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r18 = r10
            r33 = r11
            long r10 = (long) r9
            r12 = r4
            r37 = r5
            long r4 = r27 << r13
            long r4 = ~r4
            long r4 = r33 & r4
            long r9 = r10 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r1[r7]
            long r8 = r27 << r14
            long r8 = ~r8
            long r4 = r4 & r8
            long r8 = r20 << r14
            long r4 = r4 | r8
            r1[r7] = r4
            r4 = r12[r6]
            r12[r15] = r4
            r12[r6] = r16
            r4 = r37[r6]
            r37[r15] = r4
            r4 = 0
            r37[r6] = r4
            goto L1d4
        L1af:
            r37 = r5
            r18 = r10
            r33 = r11
            r12 = r4
            r4 = r9 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r9 = r27 << r13
            long r9 = ~r9
            long r9 = r33 & r9
            long r4 = r4 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r12[r15]
            r7 = r12[r6]
            r12[r15] = r7
            r12[r6] = r4
            r4 = r37[r15]
            r5 = r37[r6]
            r37[r15] = r5
            r37[r6] = r4
            int r6 = r6 + (-1)
        L1d4:
            int r4 = r1.length
            int r4 = r4 + (-1)
            r7 = r1[r29]
            long r7 = r7 & r35
            long r7 = r7 | r24
            r1[r4] = r7
            int r6 = r6 + 1
            r4 = r12
            r11 = r18
            r8 = r30
            r12 = r35
            r5 = r37
            goto L112
        L1ec:
            r30 = r8
            r18 = r11
            int r1 = r0.f16263d
            int r1 = r.O.a(r1)
            int r2 = r0.f16264e
            int r1 = r1 - r2
            r0.f = r1
            goto L27e
        L1fd:
            r27 = r7
            r31 = r10
            r29 = r12
            r18 = r13
            r30 = 7
            goto L20b
        L208:
            r20 = 128(0x80, double:6.32E-322)
            goto L1fd
        L20b:
            int r1 = r0.f16263d
            int r1 = r.O.c(r1)
            long[] r2 = r0.f16260a
            long[] r4 = r0.f16261b
            java.lang.Object[] r5 = r0.f16262c
            int r6 = r0.f16263d
            r0.e(r1)
            long[] r1 = r0.f16260a
            long[] r7 = r0.f16261b
            java.lang.Object[] r8 = r0.f16262c
            int r9 = r0.f16263d
            r10 = r29
        L226:
            if (r10 >= r6) goto L27e
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r27
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 >= 0) goto L275
            r11 = r4[r10]
            int r13 = java.lang.Long.hashCode(r11)
            int r13 = r13 * r19
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.c(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r16 = r1
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r17 = r14 & 7
            int r17 = r17 << 3
            r22 = r16[r13]
            r24 = r1
            long r1 = r27 << r17
            long r1 = ~r1
            long r1 = r22 & r1
            long r22 = r24 << r17
            long r1 = r1 | r22
            r16[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r9
            r17 = r9 & 7
            int r13 = r13 + r17
            int r13 = r13 >> 3
            r16[r13] = r1
            r7[r14] = r11
            r1 = r5[r10]
            r8[r14] = r1
            goto L278
        L275:
            r16 = r1
            r15 = r2
        L278:
            int r10 = r10 + 1
            r2 = r15
            r1 = r16
            goto L226
        L27e:
            int r1 = r0.c(r3)
        L282:
            r16 = r1
            int r1 = r0.f16264e
            int r1 = r1 + 1
            r0.f16264e = r1
            int r1 = r0.f
            long[] r2 = r0.f16260a
            int r3 = r16 >> 3
            r4 = r2[r3]
            r6 = r16 & 7
            int r6 = r6 << 3
            long r7 = r4 >> r6
            long r7 = r7 & r27
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 != 0) goto L2a0
            r29 = r18
        L2a0:
            int r1 = r1 - r29
            r0.f = r1
            int r1 = r0.f16263d
            long r7 = r27 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            long r6 = r31 << r6
            long r4 = r4 | r6
            r2[r3] = r4
            int r3 = r16 + (-7)
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r2[r1] = r4
        L2b9:
            long[] r1 = r0.f16261b
            r1[r16] = r39
            java.lang.Object[] r1 = r0.f16262c
            r1[r16] = r41
            return
        L2c2:
            r26 = r6
            r29 = r12
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = r19
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.y.f(long, java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long[] jArr = this.f16261b;
        Object[] objArr = this.f16262c;
        long[] jArr2 = this.f16260a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        int i9 = (i << 3) + i8;
                        long j7 = jArr[i9];
                        Object obj = objArr[i9];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j7);
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
    public final String toString() {
        int i;
        int i7;
        if (this.f16264e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f16261b;
        Object[] objArr = this.f16262c;
        long[] jArr2 = this.f16260a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long j = jArr2[i8];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((255 & j) < 128) {
                            int i12 = (i8 << 3) + i11;
                            i7 = i8;
                            long j7 = jArr[i12];
                            Object obj = objArr[i12];
                            sb.append(j7);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i9++;
                            if (i9 < this.f16264e) {
                                sb.append(", ");
                            }
                        } else {
                            i7 = i8;
                        }
                        j >>= 8;
                        i11++;
                        i8 = i7;
                    }
                    int i13 = i8;
                    if (i10 != 8) {
                        break;
                    }
                    i = i13;
                } else {
                    i = i8;
                }
                if (i == length) {
                    break;
                }
                i8 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
