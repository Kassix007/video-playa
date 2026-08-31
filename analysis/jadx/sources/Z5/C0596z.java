package Z5;

/* JADX INFO: renamed from: Z5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596z implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0596z f8639a = new C0596z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8640b = new U("kotlin.time.Instant", X5.d.f8183k);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f8640b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0497  */
    @Override // V5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Y5.b r24) {
        /*
            r23 = this;
            K5.d r0 = K5.d.f2978s
            java.lang.String r0 = r24.w()
            java.lang.String r1 = "input"
            kotlin.jvm.internal.m.e(r0, r1)
            int r1 = r0.length()
            if (r1 != 0) goto L1a
            K5.g r1 = new K5.g
            java.lang.String r2 = "An empty string is not a valid Instant"
            r1.<init>(r2, r0)
            goto L4a9
        L1a:
            r1 = 0
            char r2 = r0.charAt(r1)
            r3 = 32
            r4 = 43
            r5 = 45
            r6 = 1
            if (r2 == r4) goto L2d
            if (r2 == r5) goto L2d
            r7 = r1
            r2 = r3
            goto L2e
        L2d:
            r7 = r6
        L2e:
            r9 = r1
            r8 = r7
        L30:
            int r10 = r0.length()
            r11 = 58
            r12 = 48
            if (r8 >= r10) goto L4d
            char r10 = r0.charAt(r8)
            if (r12 > r10) goto L4d
            if (r10 >= r11) goto L4d
            int r9 = r9 * 10
            char r10 = r0.charAt(r8)
            int r10 = r10 - r12
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L30
        L4d:
            int r10 = r8 - r7
            java.lang.String r13 = " digits"
            r14 = 10
            if (r10 <= r14) goto L6c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected at most 10 digits for the year number, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L6c:
            if (r10 != r14) goto L91
            char r7 = r0.charAt(r7)
            r15 = 50
            int r7 = kotlin.jvm.internal.m.f(r7, r15)
            if (r7 < 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected at most 9 digits for the year number or year 1000000000, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L91:
            r7 = 4
            if (r10 >= r7) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The year number must be padded to 4 digits, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        Lab:
            if (r2 != r4) goto Lb7
            if (r10 != r7) goto Lb7
            java.lang.String r1 = "The '+' sign at the start is only valid for year numbers longer than 4 digits"
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        Lb7:
            if (r2 != r3) goto Lc3
            if (r10 == r7) goto Lc3
            java.lang.String r1 = "A '+' or '-' sign is required for year numbers longer than 4 digits"
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        Lc3:
            if (r2 != r5) goto Lc6
            int r9 = -r9
        Lc6:
            int r2 = r0.length()
            int r3 = r8 + 16
            if (r2 >= r3) goto Ld6
            java.lang.String r1 = "The input string is too short"
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        Ld6:
            I5.m r2 = new I5.m
            r10 = 2
            r2.<init>(r10)
            java.lang.String r15 = "'-'"
            K5.g r2 = K5.f.g(r0, r15, r8, r2)
            if (r2 == 0) goto Le7
        Le4:
            r1 = r2
            goto L4a9
        Le7:
            int r2 = r8 + 3
            I5.m r1 = new I5.m
            r10 = 3
            r1.<init>(r10)
            K5.g r1 = K5.f.g(r0, r15, r2, r1)
            if (r1 == 0) goto Lf7
            goto L4a9
        Lf7:
            int r1 = r8 + 6
            I5.m r2 = new I5.m
            r2.<init>(r7)
            java.lang.String r15 = "'T' or 't'"
            K5.g r1 = K5.f.g(r0, r15, r1, r2)
            if (r1 == 0) goto L108
            goto L4a9
        L108:
            int r1 = r8 + 9
            I5.m r2 = new I5.m
            r15 = 5
            r2.<init>(r15)
            java.lang.String r15 = "':'"
            K5.g r1 = K5.f.g(r0, r15, r1, r2)
            if (r1 == 0) goto L11a
            goto L4a9
        L11a:
            int r1 = r8 + 12
            I5.m r2 = new I5.m
            r7 = 6
            r2.<init>(r7)
            K5.g r1 = K5.f.g(r0, r15, r1, r2)
            if (r1 == 0) goto L12a
            goto L4a9
        L12a:
            r1 = 0
        L12b:
            if (r1 >= r14) goto L145
            int[] r2 = K5.f.f2983b
            r2 = r2[r1]
            int r2 = r2 + r8
            I5.m r15 = new I5.m
            r10 = 7
            r15.<init>(r10)
            java.lang.String r10 = "an ASCII digit"
            K5.g r2 = K5.f.g(r0, r10, r2, r15)
            if (r2 == 0) goto L141
            goto Le4
        L141:
            int r1 = r1 + 1
            r10 = 3
            goto L12b
        L145:
            int r1 = r8 + 1
            int r1 = K5.f.i(r1, r0)
            int r2 = r8 + 4
            int r2 = K5.f.i(r2, r0)
            int r10 = r8 + 7
            int r10 = K5.f.i(r10, r0)
            int r15 = r8 + 10
            int r15 = K5.f.i(r15, r0)
            int r7 = r8 + 13
            int r7 = K5.f.i(r7, r0)
            int r8 = r8 + 15
            char r5 = r0.charAt(r8)
            r4 = 46
            r14 = 9
            if (r5 != r4) goto L1b1
            r8 = r3
            r4 = 0
        L171:
            int r5 = r0.length()
            if (r8 >= r5) goto L18a
            char r5 = r0.charAt(r8)
            if (r12 > r5) goto L18a
            if (r5 >= r11) goto L18a
            int r4 = r4 * 10
            char r5 = r0.charAt(r8)
            int r5 = r5 - r12
            int r4 = r4 + r5
            int r8 = r8 + 1
            goto L171
        L18a:
            int r3 = r8 - r3
            if (r6 > r3) goto L19a
            r5 = 10
            if (r3 >= r5) goto L19a
            int[] r5 = K5.f.f2982a
            int r3 = 9 - r3
            r3 = r5[r3]
            int r4 = r4 * r3
            goto L1b2
        L19a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "1..9 digits are supported for the fraction of the second, got "
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L1b1:
            r4 = 0
        L1b2:
            int r3 = r0.length()
            if (r8 < r3) goto L1c0
            java.lang.String r1 = "The UTC offset at the end of the string is missing"
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L1c0:
            char r3 = r0.charAt(r8)
            r5 = 39
            java.lang.String r13 = ", got '"
            r21 = r6
            r6 = 43
            if (r3 == r6) goto L218
            r6 = 45
            if (r3 == r6) goto L218
            r6 = 90
            if (r3 == r6) goto L1f7
            r6 = 122(0x7a, float:1.71E-43)
            if (r3 == r6) goto L1f7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected the UTC offset at position "
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r13)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L1f7:
            int r3 = r0.length()
            int r8 = r8 + 1
            if (r3 != r8) goto L204
            r11 = 0
        L200:
            r3 = r21
            goto L36f
        L204:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Extra text after the instant at position "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L218:
            int r6 = r0.length()
            int r6 = r6 - r8
            if (r6 <= r14) goto L24a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The UTC offset string \""
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r3 = 16
            java.lang.String r2 = K5.f.l(r3, r2)
            r1.append(r2)
            java.lang.String r2 = "\" is too long"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L24a:
            int r20 = r6 % 3
            if (r20 == 0) goto L273
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid UTC offset string \""
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L273:
            r14 = 0
        L274:
            r12 = 2
            if (r14 >= r12) goto L2aa
            int[] r12 = K5.f.f2984c
            r12 = r12[r14]
            int r12 = r12 + r8
            int r5 = r0.length()
            if (r12 < r5) goto L283
            goto L2aa
        L283:
            char r5 = r0.charAt(r12)
            if (r5 == r11) goto L2a5
            java.lang.String r1 = "Expected ':' at index "
            java.lang.StringBuilder r1 = k1.i.l(r1, r13, r12)
            char r2 = r0.charAt(r12)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L2a5:
            int r14 = r14 + 1
            r5 = 39
            goto L274
        L2aa:
            r5 = 0
        L2ab:
            r12 = 6
            if (r5 >= r12) goto L2e6
            int[] r12 = K5.f.f2985d
            r12 = r12[r5]
            int r12 = r12 + r8
            int r14 = r0.length()
            if (r12 < r14) goto L2ba
            goto L2e6
        L2ba:
            char r14 = r0.charAt(r12)
            r22 = r5
            r5 = 48
            if (r5 > r14) goto L2ca
            if (r14 >= r11) goto L2ca
            int r12 = r22 + 1
            r5 = r12
            goto L2ab
        L2ca:
            java.lang.String r1 = "Expected an ASCII digit at index "
            java.lang.StringBuilder r1 = k1.i.l(r1, r13, r12)
            char r2 = r0.charAt(r12)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L2e6:
            int r5 = r8 + 1
            int r5 = K5.f.i(r5, r0)
            r11 = 3
            if (r6 <= r11) goto L2f7
            int r11 = r8 + 4
            int r11 = K5.f.i(r11, r0)
        L2f5:
            r12 = 6
            goto L2f9
        L2f7:
            r11 = 0
            goto L2f5
        L2f9:
            if (r6 <= r12) goto L304
            int r6 = r8 + 7
            int r6 = K5.f.i(r6, r0)
        L301:
            r12 = 59
            goto L306
        L304:
            r6 = 0
            goto L301
        L306:
            if (r11 <= r12) goto L31c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected offset-minute-of-hour in 0..59, got "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L31c:
            if (r6 <= r12) goto L332
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected offset-second-of-minute in 0..59, got "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L332:
            r12 = 17
            if (r5 <= r12) goto L35e
            r12 = 18
            if (r5 != r12) goto L33e
            if (r11 != 0) goto L33e
            if (r6 == 0) goto L35e
        L33e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected an offset in -18:00..+18:00, got "
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L35e:
            int r5 = r5 * 3600
            int r11 = r11 * 60
            int r11 = r11 + r5
            int r11 = r11 + r6
            r6 = 45
            if (r3 != r6) goto L36a
            r3 = -1
            goto L36c
        L36a:
            r3 = r21
        L36c:
            int r11 = r11 * r3
            goto L200
        L36f:
            if (r3 > r1) goto L497
            r5 = 13
            if (r1 >= r5) goto L497
            if (r3 > r2) goto L474
            r3 = r9 & 3
            if (r3 != 0) goto L386
            int r5 = r9 % 100
            if (r5 != 0) goto L383
            int r5 = r9 % 400
            if (r5 != 0) goto L386
        L383:
            r5 = 1
        L384:
            r12 = 2
            goto L388
        L386:
            r5 = 0
            goto L384
        L388:
            if (r1 == r12) goto L39e
            r6 = 4
            if (r1 == r6) goto L39b
            r12 = 6
            if (r1 == r12) goto L39b
            r5 = 9
            if (r1 == r5) goto L39b
            r5 = 11
            if (r1 == r5) goto L39b
            r5 = 31
            goto L3a5
        L39b:
            r5 = 30
            goto L3a5
        L39e:
            if (r5 == 0) goto L3a3
            r5 = 29
            goto L3a5
        L3a3:
            r5 = 28
        L3a5:
            if (r2 > r5) goto L474
            r5 = 23
            if (r10 <= r5) goto L3bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected hour in 0..23, got "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L3bf:
            r12 = 59
            if (r15 <= r12) goto L3d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected minute-of-hour in 0..59, got "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L3d7:
            if (r7 <= r12) goto L3ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected second-of-minute in 0..59, got "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L3ed:
            long r5 = (long) r9
            r0 = 365(0x16d, float:5.11E-43)
            long r12 = (long) r0
            long r12 = r12 * r5
            r18 = 0
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 < 0) goto L41c
            r24 = r9
            r0 = 3
            long r8 = (long) r0
            long r8 = r8 + r5
            r16 = r15
            r0 = 4
            long r14 = (long) r0
            long r8 = r8 / r14
            r0 = 99
            long r14 = (long) r0
            long r14 = r14 + r5
            r0 = 100
            r18 = r5
            long r5 = (long) r0
            long r14 = r14 / r5
            long r8 = r8 - r14
            r0 = 399(0x18f, float:5.59E-43)
            long r5 = (long) r0
            long r5 = r18 + r5
            r17 = r5
            r14 = 400(0x190, float:5.6E-43)
            long r5 = (long) r14
            long r5 = r17 / r5
            long r5 = r5 + r8
            long r5 = r5 + r12
            goto L434
        L41c:
            r18 = r5
            r24 = r9
            r16 = r15
            r0 = -4
            long r5 = (long) r0
            long r5 = r18 / r5
            r0 = -100
            long r8 = (long) r0
            long r8 = r18 / r8
            long r5 = r5 - r8
            r0 = -400(0xfffffffffffffe70, float:NaN)
            long r8 = (long) r0
            long r8 = r18 / r8
            long r8 = r8 + r5
            long r5 = r12 - r8
        L434:
            int r0 = r1 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            long r8 = (long) r0
            long r5 = r5 + r8
            r21 = 1
            int r2 = r2 + (-1)
            long r8 = (long) r2
            long r5 = r5 + r8
            r12 = 2
            if (r1 <= r12) goto L45a
            r0 = -1
            long r0 = r0 + r5
            if (r3 != 0) goto L457
            int r9 = r24 % 100
            if (r9 != 0) goto L455
            r9 = r24
            r14 = 400(0x190, float:5.6E-43)
            int r9 = r9 % r14
            if (r9 != 0) goto L457
        L455:
            r5 = r0
            goto L45a
        L457:
            r0 = -2
            long r5 = r5 + r0
        L45a:
            r0 = 719528(0xafaa8, float:1.008273E-39)
            long r0 = (long) r0
            long r5 = r5 - r0
            int r10 = r10 * 3600
            int r15 = r16 * 60
            int r15 = r15 + r10
            int r15 = r15 + r7
            r0 = 86400(0x15180, float:1.21072E-40)
            long r0 = (long) r0
            long r5 = r5 * r0
            long r0 = (long) r15
            long r5 = r5 + r0
            long r0 = (long) r11
            long r5 = r5 - r0
            K5.h r1 = new K5.h
            r1.<init>(r5, r4)
            goto L4a9
        L474:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected a valid day-of-month for month "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " of year "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", got "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            K5.g r1 = K5.f.h(r0, r1)
            goto L4a9
        L497:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a month number in 1..12, got "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            K5.g r1 = K5.f.h(r0, r1)
        L4a9:
            K5.d r0 = r1.toInstant()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.C0596z.c(Y5.b):java.lang.Object");
    }
}
