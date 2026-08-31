package r;

import s.AbstractC1585a;

/* JADX INFO: renamed from: r.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1542A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f16106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16108e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1542A(int i) {
        this.f16104a = O.f16162a;
        this.f16105b = AbstractC1585a.f16413c;
        this.f16106c = AbstractC1558i.f16214a;
        if (i >= 0) {
            d(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f16108e = 0;
        long[] jArr = this.f16104a;
        if (jArr != O.f16162a) {
            n5.k.K0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16104a;
            int i = this.f16107d;
            int i7 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j)) | j;
        }
        n5.k.J0(0, this.f16107d, null, this.f16105b);
        this.f = O.a(this.f16107d) - this.f16108e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        int i7 = this.f16107d;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16104a;
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
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 & 127;
        int i9 = this.f16107d;
        int i10 = i7 >>> 7;
        while (true) {
            int i11 = i10 & i9;
            long[] jArr = this.f16104a;
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j7 = (((long) i8) * 72340172838076673L) ^ j;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i11) & i9;
                if (kotlin.jvm.internal.m.a(this.f16105b[iNumberOfTrailingZeros], obj)) {
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
    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16107d = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16104a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f = O.a(this.f16107d) - this.f16108e;
        this.f16105b = new Object[iMax];
        this.f16106c = new float[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r37.f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (((r37.f16104a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        r25 = 255;
        r29 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        r2 = r37.f16107d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16108e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        r2 = r37.f16104a;
        r3 = r37.f16107d;
        r4 = r37.f16105b;
        r6 = r37.f16106c;
        r7 = (r3 + 7) >> 3;
        r25 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        r29 = r11;
        r9 = 7;
        r7 = n5.k.O0(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
    
        if (r7 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
    
        if (r10 == 254) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        r10 = r10 * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 >>> 7;
        r27 = b(r11);
        r11 = r11 & r3;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0152, code lost:
    
        if ((((r27 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0154, code lost:
    
        r32 = r12;
        r2[r8] = (((long) (r10 & 127)) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r31;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        r32 = r12;
        r9 = r27 >> 3;
        r11 = r2[r9];
        r13 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
    
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r27] = r34[r7];
        r34[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b4, code lost:
    
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r3 = r34[r27];
        r34[r27] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d8, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r28;
        r9 = r31;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
    
        r37.f = r.O.a(r37.f16107d) - r37.f16108e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fe, code lost:
    
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
    
        r2 = r.O.c(r37.f16107d);
        r3 = r37.f16104a;
        r4 = r37.f16105b;
        r6 = r37.f16106c;
        r7 = r37.f16107d;
        d(r2);
        r2 = r37.f16104a;
        r8 = r37.f16105b;
        r9 = r37.f16106c;
        r10 = r37.f16107d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0222, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0231, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0233, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0235, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0237, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023c, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023d, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0274, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0276, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027d, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0281, code lost:
    
        r37.f16108e++;
        r1 = r37.f;
        r3 = r37.f16104a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0299, code lost:
    
        if (((r5 >> r7) & r25) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029b, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029d, code lost:
    
        r37.f = r1 - r15;
        r1 = r37.f16107d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r38, java.lang.Object r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r39
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f16107d
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f16104a
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r11 * r13
            r19 = r3
            r15 = 0
            long r2 = r9 ^ r17
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L4f:
            r17 = 0
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L78
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.f16105b
            r4 = r4[r17]
            boolean r4 = kotlin.jvm.internal.m.a(r4, r1)
            if (r4 == 0) goto L6f
            r1 = r17
            goto L2b6
        L6f:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4f
        L78:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L2c2
            int r2 = r0.b(r5)
            int r4 = r0.f
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto La3
            long[] r4 = r0.f16104a
            int r17 = r2 >> 3
            r17 = r4[r17]
            r4 = r2 & 7
            int r4 = r4 << 3
            long r17 = r17 >> r4
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r4 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r4 != 0) goto Lad
        La3:
            r25 = r8
            r29 = r11
            r18 = 128(0x80, double:6.32E-322)
            r31 = 7
            goto L281
        Lad:
            int r2 = r0.f16107d
            if (r2 <= r3) goto L205
            int r4 = r0.f16108e
            r17 = r3
            long r3 = (long) r4
            r18 = 32
            long r3 = r3 * r18
            r18 = 128(0x80, double:6.32E-322)
            long r6 = (long) r2
            r23 = 25
            long r6 = r6 * r23
            r23 = -9223372036854775808
            long r2 = r3 ^ r23
            long r6 = r6 ^ r23
            int r2 = java.lang.Long.compare(r2, r6)
            if (r2 > 0) goto L1fe
            long[] r2 = r0.f16104a
            int r3 = r0.f16107d
            java.lang.Object[] r4 = r0.f16105b
            float[] r6 = r0.f16106c
            int r7 = r3 + 7
            int r7 = r7 >> 3
            r25 = r8
            r8 = r15
        Ldc:
            if (r8 >= r7) goto Lfa
            r27 = r2[r8]
            r29 = r11
            r9 = 7
            long r10 = r27 & r13
            long r13 = ~r10
            long r10 = r10 >>> r9
            long r13 = r13 + r10
            r10 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r10 = r10 & r13
            r2[r8] = r10
            int r8 = r8 + 1
            r11 = r29
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto Ldc
        Lfa:
            r29 = r11
            r9 = 7
            int r7 = n5.k.O0(r2)
            int r8 = r7 + (-1)
            r10 = r2[r8]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r10 = r10 & r12
            r27 = -72057594037927936(0xff00000000000000, double:-5.4861240687936887E303)
            long r10 = r10 | r27
            r2[r8] = r10
            r10 = r2[r15]
            r2[r7] = r10
            r7 = r15
        L116:
            if (r7 == r3) goto L1ef
            int r8 = r7 >> 3
            r10 = r2[r8]
            r14 = r7 & 7
            int r14 = r14 << 3
            long r10 = r10 >> r14
            long r10 = r10 & r25
            int r27 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r27 != 0) goto L12a
        L127:
            int r7 = r7 + 1
            goto L116
        L12a:
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto L12f
            goto L127
        L12f:
            r10 = r4[r7]
            if (r10 == 0) goto L138
            int r10 = r10.hashCode()
            goto L139
        L138:
            r10 = r15
        L139:
            int r10 = r10 * r20
            int r11 = r10 << 16
            r10 = r10 ^ r11
            int r11 = r10 >>> 7
            int r27 = r0.b(r11)
            r11 = r11 & r3
            int r28 = r27 - r11
            r28 = r28 & r3
            r31 = r9
            int r9 = r28 / 8
            int r11 = r7 - r11
            r11 = r11 & r3
            int r11 = r11 / 8
            if (r9 != r11) goto L176
            r9 = r10 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r27 = r2[r8]
            r32 = r12
            long r12 = r25 << r14
            long r11 = ~r12
            long r11 = r27 & r11
            long r9 = r9 << r14
            long r9 = r9 | r11
            r2[r8] = r9
            int r8 = r2.length
            int r8 = r8 + (-1)
            r9 = r2[r15]
            long r9 = r9 & r32
            long r9 = r9 | r23
            r2[r8] = r9
            int r7 = r7 + 1
            r9 = r31
            r12 = r32
            goto L116
        L176:
            r32 = r12
            int r9 = r27 >> 3
            r11 = r2[r9]
            r13 = r27 & 7
            int r13 = r13 << 3
            long r34 = r11 >> r13
            long r34 = r34 & r25
            int r28 = (r34 > r18 ? 1 : (r34 == r18 ? 0 : -1))
            if (r28 != 0) goto L1b4
            r10 = r10 & 127(0x7f, float:1.78E-43)
            r28 = r3
            r34 = r4
            long r3 = (long) r10
            r35 = r3
            long r3 = r25 << r13
            long r3 = ~r3
            long r3 = r3 & r11
            long r10 = r35 << r13
            long r3 = r3 | r10
            r2[r9] = r3
            r3 = r2[r8]
            long r9 = r25 << r14
            long r9 = ~r9
            long r3 = r3 & r9
            long r9 = r18 << r14
            long r3 = r3 | r9
            r2[r8] = r3
            r3 = r34[r7]
            r34[r27] = r3
            r3 = 0
            r34[r7] = r3
            r3 = r6[r7]
            r6[r27] = r3
            r3 = 0
            r6[r7] = r3
            goto L1d8
        L1b4:
            r28 = r3
            r34 = r4
            r3 = r10 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r35 = r3
            long r3 = r25 << r13
            long r3 = ~r3
            long r3 = r3 & r11
            long r10 = r35 << r13
            long r3 = r3 | r10
            r2[r9] = r3
            r3 = r34[r27]
            r4 = r34[r7]
            r34[r27] = r4
            r34[r7] = r3
            r3 = r6[r27]
            r4 = r6[r7]
            r6[r27] = r4
            r6[r7] = r3
            int r7 = r7 + (-1)
        L1d8:
            int r3 = r2.length
            int r3 = r3 + (-1)
            r8 = r2[r15]
            long r8 = r8 & r32
            long r8 = r8 | r23
            r2[r3] = r8
            int r7 = r7 + 1
            r3 = r28
            r9 = r31
            r12 = r32
            r4 = r34
            goto L116
        L1ef:
            r31 = r9
            int r2 = r0.f16107d
            int r2 = r.O.a(r2)
            int r3 = r0.f16108e
            int r2 = r2 - r3
            r0.f = r2
            goto L27d
        L1fe:
            r25 = r8
            r29 = r11
            r31 = 7
            goto L208
        L205:
            r18 = 128(0x80, double:6.32E-322)
            goto L1fe
        L208:
            int r2 = r0.f16107d
            int r2 = r.O.c(r2)
            long[] r3 = r0.f16104a
            java.lang.Object[] r4 = r0.f16105b
            float[] r6 = r0.f16106c
            int r7 = r0.f16107d
            r0.d(r2)
            long[] r2 = r0.f16104a
            java.lang.Object[] r8 = r0.f16105b
            float[] r9 = r0.f16106c
            int r10 = r0.f16107d
            r11 = r15
        L222:
            if (r11 >= r7) goto L27d
            int r12 = r11 >> 3
            r12 = r3[r12]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r25
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 >= 0) goto L274
            r12 = r4[r11]
            if (r12 == 0) goto L23c
            int r13 = r12.hashCode()
            goto L23d
        L23c:
            r13 = r15
        L23d:
            int r13 = r13 * r20
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.b(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r17 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r21 = r14 & 7
            int r21 = r21 << 3
            r22 = r17[r13]
            r27 = r1
            long r1 = r25 << r21
            long r1 = ~r1
            long r1 = r22 & r1
            long r21 = r27 << r21
            long r1 = r1 | r21
            r17[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r10
            r21 = r10 & 7
            int r13 = r13 + r21
            int r13 = r13 >> 3
            r17[r13] = r1
            r8[r14] = r12
            r1 = r6[r11]
            r9[r14] = r1
            goto L276
        L274:
            r17 = r2
        L276:
            int r11 = r11 + 1
            r1 = r39
            r2 = r17
            goto L222
        L27d:
            int r2 = r0.b(r5)
        L281:
            int r1 = r0.f16108e
            int r1 = r1 + 1
            r0.f16108e = r1
            int r1 = r0.f
            long[] r3 = r0.f16104a
            int r4 = r2 >> 3
            r5 = r3[r4]
            r7 = r2 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L29d
            r15 = r16
        L29d:
            int r1 = r1 - r15
            r0.f = r1
            int r1 = r0.f16107d
            long r8 = r25 << r7
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
            int r1 = ~r2
        L2b6:
            if (r1 >= 0) goto L2b9
            int r1 = ~r1
        L2b9:
            java.lang.Object[] r2 = r0.f16105b
            r2[r1] = r39
            float[] r2 = r0.f16106c
            r2[r1] = r38
            return
        L2c2:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r1 = r39
            r3 = r19
            r4 = r20
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1542A.e(float, java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof r.C1542A
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.A r1 = (r.C1542A) r1
            int r3 = r1.f16108e
            int r5 = r0.f16108e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f16105b
            float[] r5 = r0.f16106c
            long[] r6 = r0.f16104a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L77
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
            if (r11 == 0) goto L6e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L61
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r15 < 0) goto L60
            r16 = r2
            float[] r2 = r1.f16106c
            r2 = r2[r15]
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L60
            goto L63
        L60:
            return r4
        L61:
            r16 = r2
        L63:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L69:
            r16 = r2
            if (r11 != r12) goto L79
            goto L70
        L6e:
            r16 = r2
        L70:
            if (r8 == r7) goto L79
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L77:
            r16 = r2
        L79:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1542A.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f16105b;
        float[] fArr = this.f16106c;
        long[] jArr = this.f16104a;
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
                        iHashCode += Float.hashCode(fArr[i9]) ^ (obj != null ? obj.hashCode() : 0);
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
            int r1 = r0.f16108e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f16105b
            float[] r3 = r0.f16106c
            long[] r4 = r0.f16104a
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
            int r14 = r0.f16108e
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
        throw new UnsupportedOperationException("Method not decompiled: r.C1542A.toString():java.lang.String");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:9) call: r.A.<init>(int):void type: THIS */
    public /* synthetic */ C1542A() {
        this(6);
    }
}
