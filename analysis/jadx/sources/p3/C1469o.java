package p3;

/* JADX INFO: renamed from: p3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1469o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f15801b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f15802c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15803a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0103, code lost:
    
        if (r23.f15803a != r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0106, code lost:
    
        if (r4 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0108, code lost:
    
        r13 = r13 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
    
        r13 = r13 + r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(java.lang.String r24, int r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r0.f15803a = r2
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 < r3) goto Lf
            return r4
        Lf:
            char r2 = r24.charAt(r25)
            r5 = 45
            r6 = 43
            r7 = 1
            if (r2 == r6) goto L20
            if (r2 == r5) goto L1e
            r2 = 0
            goto L26
        L1e:
            r2 = r7
            goto L21
        L20:
            r2 = 0
        L21:
            int r9 = r0.f15803a
            int r9 = r9 + r7
            r0.f15803a = r9
        L26:
            int r9 = r0.f15803a
            r17 = r4
            r25 = r7
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L34:
            int r4 = r0.f15803a
            r18 = 0
            r10 = 57
            r11 = 48
            r20 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            if (r4 >= r3) goto L8a
            char r4 = r1.charAt(r4)
            if (r4 != r11) goto L51
            if (r12 != 0) goto L4e
            int r14 = r14 + 1
            goto L83
        L4e:
            int r13 = r13 + 1
            goto L83
        L51:
            r11 = 49
            if (r4 < r11) goto L76
            if (r4 > r10) goto L76
            int r12 = r12 + r13
        L58:
            r10 = 10
            if (r13 <= 0) goto L65
            int r22 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r22 <= 0) goto L61
            return r17
        L61:
            long r7 = r7 * r10
            int r13 = r13 + (-1)
            goto L58
        L65:
            int r20 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r20 <= 0) goto L6a
            return r17
        L6a:
            long r7 = r7 * r10
            int r4 = r4 + (-48)
            long r10 = (long) r4
            long r7 = r7 + r10
            int r12 = r12 + 1
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 >= 0) goto L83
            return r17
        L76:
            r11 = 46
            if (r4 != r11) goto L8a
            if (r15 == 0) goto L7d
            goto L8a
        L7d:
            int r4 = r0.f15803a
            int r16 = r4 - r9
            r15 = r25
        L83:
            int r4 = r0.f15803a
            int r4 = r4 + 1
            r0.f15803a = r4
            goto L34
        L8a:
            if (r15 == 0) goto L93
            int r4 = r0.f15803a
            int r9 = r16 + 1
            if (r4 != r9) goto L93
            return r17
        L93:
            if (r12 != 0) goto L9a
            if (r14 != 0) goto L98
            return r17
        L98:
            r12 = r25
        L9a:
            if (r15 == 0) goto La0
            int r16 = r16 - r14
            int r13 = r16 - r12
        La0:
            int r4 = r0.f15803a
            if (r4 >= r3) goto L10b
            char r4 = r1.charAt(r4)
            r9 = 69
            if (r4 == r9) goto Lb0
            r9 = 101(0x65, float:1.42E-43)
            if (r4 != r9) goto L10b
        Lb0:
            int r4 = r0.f15803a
            int r4 = r4 + 1
            r0.f15803a = r4
            if (r4 != r3) goto Lb9
            return r17
        Lb9:
            char r4 = r1.charAt(r4)
            if (r4 == r6) goto Ld4
            if (r4 == r5) goto Ld1
            switch(r4) {
                case 48: goto Lce;
                case 49: goto Lce;
                case 50: goto Lce;
                case 51: goto Lce;
                case 52: goto Lce;
                case 53: goto Lce;
                case 54: goto Lce;
                case 55: goto Lce;
                case 56: goto Lce;
                case 57: goto Lce;
                default: goto Lc4;
            }
        Lc4:
            int r4 = r0.f15803a
            int r4 = r4 + (-1)
            r0.f15803a = r4
            r5 = r25
            r4 = 0
            goto Ldc
        Lce:
            r4 = 0
        Lcf:
            r5 = 0
            goto Ldc
        Ld1:
            r4 = r25
            goto Ld5
        Ld4:
            r4 = 0
        Ld5:
            int r5 = r0.f15803a
            int r5 = r5 + 1
            r0.f15803a = r5
            goto Lcf
        Ldc:
            if (r5 != 0) goto L10b
            int r5 = r0.f15803a
            r6 = 0
        Le1:
            int r9 = r0.f15803a
            if (r9 >= r3) goto L101
            char r9 = r1.charAt(r9)
            r11 = 48
            if (r9 < r11) goto L101
            if (r9 > r10) goto L101
            long r14 = (long) r6
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 <= 0) goto Lf5
            return r17
        Lf5:
            int r6 = r6 * 10
            int r9 = r9 + (-48)
            int r6 = r6 + r9
            int r9 = r0.f15803a
            int r9 = r9 + 1
            r0.f15803a = r9
            goto Le1
        L101:
            int r1 = r0.f15803a
            if (r1 != r5) goto L106
            return r17
        L106:
            if (r4 == 0) goto L10a
            int r13 = r13 - r6
            goto L10b
        L10a:
            int r13 = r13 + r6
        L10b:
            int r12 = r12 + r13
            r1 = 39
            if (r12 > r1) goto L13c
            r1 = -44
            if (r12 >= r1) goto L115
            goto L13c
        L115:
            float r1 = (float) r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L138
            if (r13 <= 0) goto L122
            float[] r3 = p3.C1469o.f15801b
            r3 = r3[r13]
        L120:
            float r1 = r1 * r3
            goto L138
        L122:
            if (r13 >= 0) goto L138
            r3 = -38
            if (r13 >= r3) goto L132
            double r3 = (double) r1
            r5 = 4307583784117748259(0x3bc79ca10c924223, double:1.0E-20)
            double r3 = r3 * r5
            float r1 = (float) r3
            int r13 = r13 + 20
        L132:
            float[] r3 = p3.C1469o.f15802c
            int r4 = -r13
            r3 = r3[r4]
            goto L120
        L138:
            if (r2 == 0) goto L13b
            float r1 = -r1
        L13b:
            return r1
        L13c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C1469o.a(java.lang.String, int, int):float");
    }
}
