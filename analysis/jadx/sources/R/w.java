package r;

import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16257e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(int i) {
        this.f16253a = O.f16162a;
        this.f16254b = AbstractC1562m.f16222a;
        if (i >= 0) {
            d(O.e(i));
        } else {
            AbstractC1585a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (r37.f16257e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r37.f16253a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r27 = 255;
        r31 = true;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r3 = r37.f16255c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16256d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r3 = r37.f16253a;
        r4 = r37.f16255c;
        r6 = r37.f16254b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r29 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        r27 = r12;
        r7 = n5.k.O0(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0113, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014b, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
    
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | (((long) (r12 & 127)) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0170, code lost:
    
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        if (((r33 >> r7) & r27) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0184, code lost:
    
        r3[r6] = (r33 & (~(r27 << r7))) | (((long) (r12 & 127)) << r7);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a8, code lost:
    
        r3[r6] = (((long) (r12 & 127)) << r7) | (r33 & (~(r27 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c2, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d0, code lost:
    
        r31 = r15;
        r37.f16257e = r.O.a(r37.f16255c) - r37.f16256d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01df, code lost:
    
        r27 = 255;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e6, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e9, code lost:
    
        r3 = r.O.c(r37.f16255c);
        r4 = r37.f16253a;
        r6 = r37.f16254b;
        r7 = r37.f16255c;
        d(r3);
        r3 = r37.f16253a;
        r8 = r37.f16254b;
        r9 = r37.f16255c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0200, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020f, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0211, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024c, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0250, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x025b, code lost:
    
        r14 = r3;
        r37.f16256d++;
        r3 = r37.f16257e;
        r4 = r37.f16253a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0274, code lost:
    
        if (((r6 >> r8) & r27) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0279, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027b, code lost:
    
        r37.f16257e = r3 - r9;
        r3 = r37.f16255c;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = r0.f16256d
            int r3 = java.lang.Integer.hashCode(r1)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f16255c
            r7 = r5 & r6
            r9 = 0
        L1a:
            long[] r10 = r0.f16253a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            r15 = 1
            int r11 = r11 + r15
            r16 = r10[r11]
            int r10 = 64 - r12
            long r10 = r16 << r10
            r17 = r9
            r16 = 0
            long r8 = (long) r12
            long r8 = -r8
            r12 = 63
            long r8 = r8 >> r12
            long r8 = r8 & r10
            long r8 = r8 | r13
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r18 = r10 * r12
            r20 = r12
            long r12 = r8 ^ r18
            long r18 = r12 - r20
            long r12 = ~r12
            long r12 = r18 & r12
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r18
        L50:
            r20 = 0
            int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r14 == 0) goto L73
            int r14 = java.lang.Long.numberOfTrailingZeros(r12)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r6
            r22 = r4
            int[] r4 = r0.f16254b
            r4 = r4[r14]
            if (r4 != r1) goto L6a
            r31 = r15
            goto L293
        L6a:
            r20 = 1
            long r20 = r12 - r20
            long r12 = r12 & r20
            r4 = r22
            goto L50
        L73:
            r22 = r4
            long r12 = ~r8
            r4 = 6
            long r12 = r12 << r4
            long r8 = r8 & r12
            long r8 = r8 & r18
            int r4 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            r8 = 8
            if (r4 == 0) goto L29d
            int r3 = r0.c(r5)
            int r4 = r0.f16257e
            r12 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L9f
            long[] r4 = r0.f16253a
            int r14 = r3 >> 3
            r20 = r4[r14]
            r4 = r3 & 7
            int r4 = r4 << 3
            long r20 = r20 >> r4
            long r20 = r20 & r12
            r23 = 254(0xfe, double:1.255E-321)
            int r4 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r4 != 0) goto La9
        L9f:
            r27 = r12
            r31 = r15
            r17 = 7
            r20 = 128(0x80, double:6.32E-322)
            goto L25b
        La9:
            int r3 = r0.f16255c
            if (r3 <= r8) goto L1e6
            int r4 = r0.f16256d
            r20 = 128(0x80, double:6.32E-322)
            long r6 = (long) r4
            r25 = 32
            long r6 = r6 * r25
            long r3 = (long) r3
            r25 = 25
            long r3 = r3 * r25
            r25 = -9223372036854775808
            long r6 = r6 ^ r25
            long r3 = r3 ^ r25
            int r3 = java.lang.Long.compare(r6, r3)
            if (r3 > 0) goto L1df
            long[] r3 = r0.f16253a
            int r4 = r0.f16255c
            int[] r6 = r0.f16254b
            int r7 = r4 + 7
            int r7 = r7 >> 3
            r14 = r16
        Ld3:
            if (r14 >= r7) goto Lf2
            r27 = r3[r14]
            r29 = r8
            r17 = 7
            long r8 = r27 & r18
            r27 = r12
            long r12 = ~r8
            long r8 = r8 >>> r17
            long r12 = r12 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r12
            r3[r14] = r8
            int r14 = r14 + 1
            r12 = r27
            r8 = r29
            goto Ld3
        Lf2:
            r29 = r8
            r27 = r12
            r17 = 7
            int r7 = n5.k.O0(r3)
            int r8 = r7 + (-1)
            r12 = r3[r8]
            r18 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r18
            r30 = -72057594037927936(0xff00000000000000, double:-5.4861240687936887E303)
            long r12 = r12 | r30
            r3[r8] = r12
            r8 = r3[r16]
            r3[r7] = r8
            r7 = r16
        L113:
            if (r7 == r4) goto L1d0
            int r8 = r7 >> 3
            r12 = r3[r8]
            r9 = r7 & 7
            int r9 = r9 << 3
            long r12 = r12 >> r9
            long r12 = r12 & r27
            int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r14 != 0) goto L127
        L124:
            int r7 = r7 + 1
            goto L113
        L127:
            int r12 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r12 == 0) goto L12c
            goto L124
        L12c:
            r12 = r6[r7]
            int r12 = java.lang.Integer.hashCode(r12)
            int r12 = r12 * r22
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r14 = r0.c(r13)
            r13 = r13 & r4
            int r30 = r14 - r13
            r30 = r30 & r4
            r31 = r15
            int r15 = r30 / 8
            int r13 = r7 - r13
            r13 = r13 & r4
            int r13 = r13 / 8
            if (r15 != r13) goto L170
            r12 = r12 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r12
            r14 = r3[r8]
            r30 = r6
            r32 = r7
            long r6 = r27 << r9
            long r6 = ~r6
            long r6 = r6 & r14
            long r12 = r12 << r9
            long r6 = r6 | r12
            r3[r8] = r6
            int r6 = r3.length
            int r6 = r6 + (-1)
            r7 = r3[r16]
            long r7 = r7 & r18
            long r7 = r7 | r25
            r3[r6] = r7
            int r7 = r32 + 1
        L16b:
            r6 = r30
            r15 = r31
            goto L113
        L170:
            r30 = r6
            r32 = r7
            int r6 = r14 >> 3
            r33 = r3[r6]
            r7 = r14 & 7
            int r7 = r7 << 3
            long r35 = r33 >> r7
            long r35 = r35 & r27
            int r13 = (r35 > r20 ? 1 : (r35 == r20 ? 0 : -1))
            if (r13 != 0) goto L1a8
            r12 = r12 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r12
            r15 = r6
            r35 = r7
            long r6 = r27 << r35
            long r6 = ~r6
            long r6 = r33 & r6
            long r12 = r12 << r35
            long r6 = r6 | r12
            r3[r15] = r6
            r6 = r3[r8]
            long r12 = r27 << r9
            long r12 = ~r12
            long r6 = r6 & r12
            long r12 = r20 << r9
            long r6 = r6 | r12
            r3[r8] = r6
            r6 = r30[r32]
            r30[r14] = r6
            r30[r32] = r16
            r7 = r32
            goto L1c2
        L1a8:
            r15 = r6
            r35 = r7
            r6 = r12 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r6
            long r8 = r27 << r35
            long r8 = ~r8
            long r8 = r33 & r8
            long r6 = r6 << r35
            long r6 = r6 | r8
            r3[r15] = r6
            r6 = r30[r14]
            r7 = r30[r32]
            r30[r14] = r7
            r30[r32] = r6
            int r7 = r32 + (-1)
        L1c2:
            int r6 = r3.length
            int r6 = r6 + (-1)
            r8 = r3[r16]
            long r8 = r8 & r18
            long r8 = r8 | r25
            r3[r6] = r8
            int r7 = r7 + 1
            goto L16b
        L1d0:
            r31 = r15
            int r3 = r0.f16255c
            int r3 = r.O.a(r3)
            int r4 = r0.f16256d
            int r3 = r3 - r4
            r0.f16257e = r3
            goto L257
        L1df:
            r27 = r12
            r31 = r15
            r17 = 7
            goto L1e9
        L1e6:
            r20 = 128(0x80, double:6.32E-322)
            goto L1df
        L1e9:
            int r3 = r0.f16255c
            int r3 = r.O.c(r3)
            long[] r4 = r0.f16253a
            int[] r6 = r0.f16254b
            int r7 = r0.f16255c
            r0.d(r3)
            long[] r3 = r0.f16253a
            int[] r8 = r0.f16254b
            int r9 = r0.f16255c
            r12 = r16
        L200:
            if (r12 >= r7) goto L257
            int r13 = r12 >> 3
            r13 = r4[r13]
            r15 = r12 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r27
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 >= 0) goto L24c
            r13 = r6[r12]
            int r14 = java.lang.Integer.hashCode(r13)
            int r14 = r14 * r22
            int r15 = r14 << 16
            r14 = r14 ^ r15
            int r15 = r14 >>> 7
            int r15 = r0.c(r15)
            r14 = r14 & 127(0x7f, float:1.78E-43)
            r19 = r3
            r18 = r4
            long r3 = (long) r14
            int r14 = r15 >> 3
            r23 = r15 & 7
            int r23 = r23 << 3
            r24 = r19[r14]
            r29 = r3
            long r3 = r27 << r23
            long r3 = ~r3
            long r3 = r24 & r3
            long r23 = r29 << r23
            long r3 = r3 | r23
            r19[r14] = r3
            int r14 = r15 + (-7)
            r14 = r14 & r9
            r23 = r9 & 7
            int r14 = r14 + r23
            int r14 = r14 >> 3
            r19[r14] = r3
            r8[r15] = r13
            goto L250
        L24c:
            r19 = r3
            r18 = r4
        L250:
            int r12 = r12 + 1
            r4 = r18
            r3 = r19
            goto L200
        L257:
            int r3 = r0.c(r5)
        L25b:
            r14 = r3
            int r3 = r0.f16256d
            int r3 = r3 + 1
            r0.f16256d = r3
            int r3 = r0.f16257e
            long[] r4 = r0.f16253a
            int r5 = r14 >> 3
            r6 = r4[r5]
            r8 = r14 & 7
            int r8 = r8 << 3
            long r12 = r6 >> r8
            long r12 = r12 & r27
            int r9 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r9 != 0) goto L279
            r9 = r31
            goto L27b
        L279:
            r9 = r16
        L27b:
            int r3 = r3 - r9
            r0.f16257e = r3
            int r3 = r0.f16255c
            long r12 = r27 << r8
            long r12 = ~r12
            long r6 = r6 & r12
            long r8 = r10 << r8
            long r6 = r6 | r8
            r4[r5] = r6
            int r5 = r14 + (-7)
            r5 = r5 & r3
            r3 = r3 & 7
            int r5 = r5 + r3
            int r3 = r5 >> 3
            r4[r3] = r6
        L293:
            int[] r3 = r0.f16254b
            r3[r14] = r1
            int r1 = r0.f16256d
            if (r1 == r2) goto L29c
            return r31
        L29c:
            return r16
        L29d:
            r29 = r8
            int r9 = r17 + 8
            int r7 = r7 + r9
            r7 = r7 & r6
            r4 = r22
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w.a(int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f16255c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f16253a
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
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f16254b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            return r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w.b(int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        int i7 = this.f16255c;
        int i8 = i & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f16253a;
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
    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, O.d(i)) : 0;
        this.f16255c = iMax;
        if (iMax == 0) {
            jArr = O.f16162a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        this.f16253a = jArr;
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        this.f16257e = O.a(this.f16255c) - this.f16256d;
        this.f16254b = new int[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f16255c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f16253a
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
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f16254b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            r4 = r11
        L6d:
            if (r4 == 0) goto L72
            r0.f(r10)
        L72:
            return r4
        L73:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w.e(int):boolean");
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
            boolean r3 = r1 instanceof r.w
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r.w r1 = (r.w) r1
            int r3 = r1.f16256d
            int r5 = r0.f16256d
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16254b
            long[] r5 = r0.f16253a
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
            boolean r13 = r1.b(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: r.w.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        this.f16256d--;
        long[] jArr = this.f16253a;
        int i7 = this.f16255c;
        int i8 = i >> 3;
        int i9 = (i & 7) << 3;
        long j = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j;
        jArr[(((i - 7) & i7) + (i7 & 7)) >> 3] = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f16254b;
        long[] jArr = this.f16253a;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i8]) + iHashCode;
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int[] r2 = r0.f16254b
            long[] r3 = r0.f16253a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
            r7 = r6
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.m.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w.toString():java.lang.String");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:8) call: r.w.<init>(int):void type: THIS */
    public /* synthetic */ w() {
        this(6);
    }
}
