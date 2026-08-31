package d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f11967a = new boolean[3];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(d1.e r40, b1.c r41, java.util.ArrayList r42, int r43) {
        /*
            r0 = r40
            r1 = r41
            r10 = r42
            if (r43 != 0) goto L10
            int r2 = r0.f11909z0
            d1.b[] r3 = r0.f11891C0
            r15 = 0
        Ld:
            r13 = r2
            r14 = r3
            goto L16
        L10:
            int r2 = r0.f11889A0
            d1.b[] r3 = r0.f11890B0
            r15 = 2
            goto Ld
        L16:
            r2 = 0
        L17:
            if (r2 >= r13) goto L6f2
            r3 = r14[r2]
            boolean r4 = r3.f11816q
            d1.d r5 = r3.f11803a
            r6 = 3
            r16 = 0
            r7 = 8
            if (r4 != 0) goto L159
            int r4 = r3.f11811l
            int r17 = r4 * 2
            r8 = r5
            r12 = r8
            r18 = 0
            r19 = 0
        L30:
            if (r18 != 0) goto L121
            r21 = 1
            int r9 = r3.i
            int r9 = r9 + 1
            r3.i = r9
            d1.d[] r9 = r8.f11872m0
            d1.c[] r11 = r8.f11840Q
            r9[r4] = r16
            d1.d[] r9 = r8.f11870l0
            r9[r4] = r16
            int r9 = r8.f11862g0
            if (r9 == r7) goto Lee
            r8.j(r4)
            r9 = r11[r17]
            r9.e()
            int r9 = r17 + 1
            r23 = r11[r9]
            r23.e()
            r23 = r11[r17]
            r23.e()
            r9 = r11[r9]
            r9.e()
            d1.d r9 = r3.f11804b
            if (r9 != 0) goto L67
            r3.f11804b = r8
        L67:
            r3.f11806d = r8
            int[] r9 = r8.f11878p0
            r9 = r9[r4]
            if (r9 != r6) goto Lee
            int[] r7 = r8.f11882t
            r7 = r7[r4]
            if (r7 == 0) goto L80
            if (r7 == r6) goto L80
            r6 = 2
            if (r7 != r6) goto L7b
            goto L80
        L7b:
            r25 = r2
            r26 = r4
            goto Ld4
        L80:
            int r6 = r3.j
            int r6 = r6 + 1
            r3.j = r6
            float[] r6 = r8.f11868k0
            r6 = r6[r4]
            int r25 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r25 <= 0) goto L96
            r25 = r2
            float r2 = r3.f11810k
            float r2 = r2 + r6
            r3.f11810k = r2
            goto L98
        L96:
            r25 = r2
        L98:
            int r2 = r8.f11862g0
            r26 = r4
            r4 = 8
            if (r2 == r4) goto Lc4
            r2 = 3
            if (r9 != r2) goto Lc4
            if (r7 == 0) goto La7
            if (r7 != r2) goto Lc4
        La7:
            int r2 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r2 >= 0) goto Lb0
            r2 = r21
            r3.f11813n = r2
            goto Lb4
        Lb0:
            r2 = r21
            r3.f11814o = r2
        Lb4:
            java.util.ArrayList r2 = r3.f11809h
            if (r2 != 0) goto Lbf
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f11809h = r2
        Lbf:
            java.util.ArrayList r2 = r3.f11809h
            r2.add(r8)
        Lc4:
            d1.d r2 = r3.f
            if (r2 != 0) goto Lca
            r3.f = r8
        Lca:
            d1.d r2 = r3.f11808g
            if (r2 == 0) goto Ld2
            d1.d[] r2 = r2.f11870l0
            r2[r26] = r8
        Ld2:
            r3.f11808g = r8
        Ld4:
            if (r26 != 0) goto Le2
            int r2 = r8.f11880r
            if (r2 == 0) goto Ldb
            goto Lf2
        Ldb:
            int r2 = r8.f11883u
            if (r2 != 0) goto Lf2
            int r2 = r8.f11884v
            goto Lf2
        Le2:
            int r2 = r8.f11881s
            if (r2 == 0) goto Le7
            goto Lf2
        Le7:
            int r2 = r8.f11886x
            if (r2 != 0) goto Lf2
            int r2 = r8.f11887y
            goto Lf2
        Lee:
            r25 = r2
            r26 = r4
        Lf2:
            if (r12 == r8) goto Lf8
            d1.d[] r2 = r12.f11872m0
            r2[r26] = r8
        Lf8:
            int r2 = r17 + 1
            r2 = r11[r2]
            d1.c r2 = r2.f
            if (r2 == 0) goto L10e
            d1.d r2 = r2.f11820d
            d1.c[] r4 = r2.f11840Q
            r4 = r4[r17]
            d1.c r4 = r4.f
            if (r4 == 0) goto L10e
            d1.d r4 = r4.f11820d
            if (r4 == r8) goto L110
        L10e:
            r2 = r16
        L110:
            if (r2 == 0) goto L113
            goto L116
        L113:
            r2 = r8
            r18 = 1
        L116:
            r12 = r8
            r4 = r26
            r6 = 3
            r7 = 8
            r8 = r2
            r2 = r25
            goto L30
        L121:
            r25 = r2
            r26 = r4
            d1.d r2 = r3.f11804b
            if (r2 == 0) goto L130
            d1.c[] r2 = r2.f11840Q
            r2 = r2[r17]
            r2.e()
        L130:
            d1.d r2 = r3.f11806d
            if (r2 == 0) goto L13d
            d1.c[] r2 = r2.f11840Q
            int r17 = r17 + 1
            r2 = r2[r17]
            r2.e()
        L13d:
            r3.f11805c = r8
            if (r26 != 0) goto L148
            boolean r2 = r3.f11812m
            if (r2 == 0) goto L148
            r3.f11807e = r8
            goto L14a
        L148:
            r3.f11807e = r5
        L14a:
            boolean r2 = r3.f11814o
            if (r2 == 0) goto L154
            boolean r2 = r3.f11813n
            if (r2 == 0) goto L154
            r2 = 1
            goto L155
        L154:
            r2 = 0
        L155:
            r3.f11815p = r2
        L157:
            r2 = 1
            goto L15e
        L159:
            r25 = r2
            r19 = 0
            goto L157
        L15e:
            r3.f11816q = r2
            if (r10 == 0) goto L173
            boolean r2 = r10.contains(r5)
            if (r2 == 0) goto L169
            goto L173
        L169:
            r37 = r13
            r19 = r14
            r20 = 0
            r27 = 2
            goto L6e4
        L173:
            d1.d r11 = r3.f11805c
            d1.d r12 = r3.f11804b
            d1.d r2 = r3.f11806d
            d1.d r4 = r3.f11807e
            float r6 = r3.f11810k
            int[] r7 = r0.f11878p0
            d1.c[] r8 = r0.f11840Q
            r7 = r7[r43]
            r9 = 2
            if (r7 != r9) goto L188
            r7 = 1
            goto L189
        L188:
            r7 = 0
        L189:
            if (r43 != 0) goto L1ae
            int r9 = r4.f11865i0
            if (r9 != 0) goto L195
            r21 = 1
        L191:
            r17 = r6
            r6 = 1
            goto L198
        L195:
            r21 = 0
            goto L191
        L198:
            if (r9 != r6) goto L19e
            r18 = r6
        L19c:
            r6 = 2
            goto L1a1
        L19e:
            r18 = 0
            goto L19c
        L1a1:
            if (r9 != r6) goto L1a5
            r9 = 1
            goto L1a6
        L1a5:
            r9 = 0
        L1a6:
            r6 = r5
            r28 = r7
            r26 = r21
        L1ab:
            r22 = 0
            goto L1d0
        L1ae:
            r17 = r6
            r6 = r9
            int r9 = r4.f11866j0
            if (r9 != 0) goto L1b9
            r22 = 1
        L1b7:
            r6 = 1
            goto L1bc
        L1b9:
            r22 = 0
            goto L1b7
        L1bc:
            if (r9 != r6) goto L1c2
            r18 = 1
        L1c0:
            r6 = 2
            goto L1c5
        L1c2:
            r18 = 0
            goto L1c0
        L1c5:
            if (r9 != r6) goto L1c9
            r9 = 1
            goto L1ca
        L1c9:
            r9 = 0
        L1ca:
            r6 = r5
            r28 = r7
            r26 = r22
            goto L1ab
        L1d0:
            if (r22 != 0) goto L2a0
            d1.c[] r7 = r6.f11840Q
            r32 = r7
            int[] r7 = r6.f11878p0
            r33 = r7
            r7 = r32[r15]
            if (r9 == 0) goto L1e1
            r30 = 1
            goto L1e3
        L1e1:
            r30 = 4
        L1e3:
            int r34 = r7.e()
            r35 = r8
            r8 = r33[r43]
            r36 = r9
            r9 = 3
            if (r8 != r9) goto L1f8
            int[] r8 = r6.f11882t
            r8 = r8[r43]
            if (r8 != 0) goto L1f8
            r8 = 1
            goto L1f9
        L1f8:
            r8 = 0
        L1f9:
            d1.c r9 = r7.f
            if (r9 == 0) goto L205
            if (r6 == r5) goto L205
            int r9 = r9.e()
            int r34 = r9 + r34
        L205:
            r9 = r34
            if (r36 == 0) goto L20f
            if (r6 == r5) goto L20f
            if (r6 == r12) goto L20f
            r30 = 8
        L20f:
            r34 = r8
            d1.c r8 = r7.f
            if (r8 == 0) goto L24b
            if (r6 != r12) goto L222
            b1.f r10 = r7.i
            b1.f r8 = r8.i
            r37 = r13
            r13 = 6
            r1.f(r10, r8, r9, r13)
            goto L22d
        L222:
            r37 = r13
            b1.f r10 = r7.i
            b1.f r8 = r8.i
            r13 = 8
            r1.f(r10, r8, r9, r13)
        L22d:
            if (r34 == 0) goto L233
            if (r36 != 0) goto L233
            r30 = 5
        L233:
            if (r6 != r12) goto L23f
            if (r36 == 0) goto L23f
            boolean[] r8 = r6.f11842S
            boolean r8 = r8[r43]
            if (r8 == 0) goto L23f
            r8 = 5
            goto L241
        L23f:
            r8 = r30
        L241:
            b1.f r10 = r7.i
            d1.c r7 = r7.f
            b1.f r7 = r7.i
            r1.e(r10, r7, r9, r8)
            goto L24d
        L24b:
            r37 = r13
        L24d:
            if (r28 == 0) goto L278
            int r7 = r6.f11862g0
            r13 = 8
            if (r7 == r13) goto L26a
            r7 = r33[r43]
            r9 = 3
            if (r7 != r9) goto L26a
            int r7 = r15 + 1
            r7 = r32[r7]
            b1.f r7 = r7.i
            r8 = r32[r15]
            b1.f r8 = r8.i
            r9 = 0
            r10 = 5
            r1.f(r7, r8, r9, r10)
            goto L26b
        L26a:
            r9 = 0
        L26b:
            r7 = r32[r15]
            b1.f r7 = r7.i
            r8 = r35[r15]
            b1.f r8 = r8.i
            r13 = 8
            r1.f(r7, r8, r9, r13)
        L278:
            int r7 = r15 + 1
            r7 = r32[r7]
            d1.c r7 = r7.f
            if (r7 == 0) goto L28e
            d1.d r7 = r7.f11820d
            d1.c[] r8 = r7.f11840Q
            r8 = r8[r15]
            d1.c r8 = r8.f
            if (r8 == 0) goto L28e
            d1.d r8 = r8.f11820d
            if (r8 == r6) goto L290
        L28e:
            r7 = r16
        L290:
            if (r7 == 0) goto L294
            r6 = r7
            goto L296
        L294:
            r22 = 1
        L296:
            r10 = r42
            r8 = r35
            r9 = r36
            r13 = r37
            goto L1d0
        L2a0:
            r35 = r8
            r36 = r9
            r37 = r13
            if (r2 == 0) goto L302
            d1.c[] r6 = r11.f11840Q
            int r7 = r15 + 1
            r6 = r6[r7]
            d1.c r6 = r6.f
            if (r6 == 0) goto L302
            d1.c[] r6 = r2.f11840Q
            r6 = r6[r7]
            int[] r8 = r2.f11878p0
            r8 = r8[r43]
            r9 = 3
            if (r8 != r9) goto L2d9
            int[] r8 = r2.f11882t
            r8 = r8[r43]
            if (r8 != 0) goto L2d9
            if (r36 != 0) goto L2d9
            d1.c r8 = r6.f
            d1.d r9 = r8.f11820d
            if (r9 != r0) goto L2d9
            b1.f r9 = r6.i
            b1.f r8 = r8.i
            int r10 = r6.e()
            int r10 = -r10
            r13 = 5
            r1.e(r9, r8, r10, r13)
            goto L2ef
        L2d9:
            r13 = 5
            if (r36 == 0) goto L2ef
            d1.c r8 = r6.f
            d1.d r9 = r8.f11820d
            if (r9 != r0) goto L2ef
            b1.f r9 = r6.i
            b1.f r8 = r8.i
            int r10 = r6.e()
            int r10 = -r10
            r13 = 4
            r1.e(r9, r8, r10, r13)
        L2ef:
            b1.f r8 = r6.i
            d1.c[] r9 = r11.f11840Q
            r7 = r9[r7]
            d1.c r7 = r7.f
            b1.f r7 = r7.i
            int r6 = r6.e()
            int r6 = -r6
            r13 = 6
            r1.g(r8, r7, r6, r13)
        L302:
            if (r28 == 0) goto L319
            int r6 = r15 + 1
            r7 = r35[r6]
            b1.f r7 = r7.i
            d1.c[] r8 = r11.f11840Q
            r6 = r8[r6]
            b1.f r8 = r6.i
            int r6 = r6.e()
            r13 = 8
            r1.f(r7, r8, r6, r13)
        L319:
            java.util.ArrayList r6 = r3.f11809h
            if (r6 == 0) goto L438
            int r7 = r6.size()
            r8 = 1
            if (r7 <= r8) goto L438
            boolean r9 = r3.f11813n
            if (r9 == 0) goto L331
            boolean r9 = r3.f11815p
            if (r9 != 0) goto L331
            int r9 = r3.j
            float r9 = (float) r9
            r17 = r9
        L331:
            r10 = r16
            r13 = r19
            r9 = 0
        L336:
            if (r9 >= r7) goto L438
            java.lang.Object r21 = r6.get(r9)
            r8 = r21
            d1.d r8 = (d1.C0953d) r8
            float[] r0 = r8.f11868k0
            r21 = r0
            d1.c[] r0 = r8.f11840Q
            r21 = r21[r43]
            int r24 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            r28 = r0
            if (r24 >= 0) goto L36b
            boolean r0 = r3.f11815p
            if (r0 == 0) goto L369
            int r0 = r15 + 1
            r0 = r28[r0]
            b1.f r0 = r0.i
            r8 = r28[r15]
            b1.f r8 = r8.i
            r29 = r6
            r30 = r7
            r6 = 0
            r7 = 4
            r1.e(r0, r8, r6, r7)
            r20 = r9
            r9 = r6
            goto L386
        L369:
            r21 = 1065353216(0x3f800000, float:1.0)
        L36b:
            r29 = r6
            r30 = r7
            r7 = 4
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 != 0) goto L38c
            int r0 = r15 + 1
            r0 = r28[r0]
            b1.f r0 = r0.i
            r6 = r28[r15]
            b1.f r6 = r6.i
            r20 = r9
            r8 = 8
            r9 = 0
            r1.e(r0, r6, r9, r8)
        L386:
            r35 = r19
            r19 = r14
            goto L429
        L38c:
            r20 = r9
            r9 = 0
            if (r10 == 0) goto L41f
            d1.c[] r6 = r10.f11840Q
            r10 = r6[r15]
            b1.f r10 = r10.i
            int r32 = r15 + 1
            r6 = r6[r32]
            b1.f r6 = r6.i
            r7 = r28[r15]
            b1.f r7 = r7.i
            r9 = r28[r32]
            b1.f r9 = r9.i
            r28 = r0
            b1.b r0 = r1.l()
            r32 = r8
            r8 = r19
            r0.f9936b = r8
            int r19 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            r35 = r8
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r19 == 0) goto L3bd
            int r19 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r19 != 0) goto L3c3
        L3bd:
            r19 = r14
            r14 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L407
        L3c3:
            int r19 = (r13 > r35 ? 1 : (r13 == r35 ? 0 : -1))
            if (r19 != 0) goto L3d6
            b1.a r7 = r0.f9938d
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.g(r10, r9)
            b1.a r7 = r0.f9938d
            r7.g(r6, r8)
        L3d3:
            r19 = r14
            goto L41b
        L3d6:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r28 != 0) goto L3e7
            b1.a r6 = r0.f9938d
            r6.g(r7, r8)
            b1.a r6 = r0.f9938d
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.g(r9, r7)
            goto L3d3
        L3e7:
            float r13 = r13 / r17
            float r19 = r21 / r17
            float r13 = r13 / r19
            r19 = r14
            b1.a r14 = r0.f9938d
            r14.g(r10, r8)
            b1.a r8 = r0.f9938d
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.g(r6, r14)
            b1.a r6 = r0.f9938d
            r6.g(r9, r13)
            b1.a r6 = r0.f9938d
            float r8 = -r13
            r6.g(r7, r8)
            goto L41b
        L407:
            b1.a r13 = r0.f9938d
            r13.g(r10, r8)
            b1.a r10 = r0.f9938d
            r10.g(r6, r14)
            b1.a r6 = r0.f9938d
            r6.g(r9, r8)
            b1.a r6 = r0.f9938d
            r6.g(r7, r14)
        L41b:
            r1.c(r0)
            goto L425
        L41f:
            r32 = r8
            r35 = r19
            r19 = r14
        L425:
            r13 = r21
            r10 = r32
        L429:
            int r9 = r20 + 1
            r8 = 1
            r0 = r40
            r14 = r19
            r6 = r29
            r7 = r30
            r19 = r35
            goto L336
        L438:
            r19 = r14
            if (r12 == 0) goto L441
            if (r12 == r2) goto L447
            if (r36 == 0) goto L441
            goto L447
        L441:
            r0 = r2
            r20 = 0
            r27 = 2
            goto L49f
        L447:
            d1.c[] r0 = r5.f11840Q
            r0 = r0[r15]
            d1.c[] r3 = r11.f11840Q
            int r5 = r15 + 1
            r3 = r3[r5]
            d1.c r0 = r0.f
            if (r0 == 0) goto L458
            b1.f r0 = r0.i
            goto L45a
        L458:
            r0 = r16
        L45a:
            d1.c r6 = r3.f
            if (r6 == 0) goto L461
            b1.f r6 = r6.i
            goto L463
        L461:
            r6 = r16
        L463:
            d1.c[] r7 = r12.f11840Q
            r7 = r7[r15]
            if (r2 == 0) goto L46d
            d1.c[] r3 = r2.f11840Q
            r3 = r3[r5]
        L46d:
            if (r0 == 0) goto L496
            if (r6 == 0) goto L496
            if (r43 != 0) goto L477
            float r4 = r4.f11857d0
        L475:
            r5 = r4
            goto L47a
        L477:
            float r4 = r4.f11859e0
            goto L475
        L47a:
            int r4 = r7.e()
            int r8 = r3.e()
            b1.f r7 = r7.i
            b1.f r3 = r3.i
            r9 = 7
            r20 = r3
            r3 = r0
            r0 = r2
            r2 = r7
            r7 = r20
            r20 = 0
            r27 = 2
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L49b
        L496:
            r0 = r2
            r20 = 0
            r27 = 2
        L49b:
            r1 = r41
            goto L68b
        L49f:
            if (r26 == 0) goto L583
            if (r12 == 0) goto L583
            int r1 = r3.j
            if (r1 <= 0) goto L4ae
            int r2 = r3.i
            if (r2 != r1) goto L4ae
            r22 = 1
            goto L4b0
        L4ae:
            r22 = r20
        L4b0:
            r10 = r12
            r13 = r10
        L4b2:
            if (r10 == 0) goto L49b
            d1.c[] r1 = r10.f11840Q
            d1.d[] r2 = r10.f11872m0
            r2 = r2[r43]
            r14 = r2
        L4bb:
            if (r14 == 0) goto L4c8
            int r2 = r14.f11862g0
            r4 = 8
            if (r2 != r4) goto L4ca
            d1.d[] r2 = r14.f11872m0
            r14 = r2[r43]
            goto L4bb
        L4c8:
            r4 = 8
        L4ca:
            if (r14 != 0) goto L4d8
            if (r10 != r0) goto L4cf
            goto L4d8
        L4cf:
            r38 = r5
            r17 = r13
            r31 = 5
            r13 = r4
            goto L576
        L4d8:
            r2 = r1[r15]
            b1.f r3 = r2.i
            d1.c r6 = r2.f
            if (r6 == 0) goto L4e3
            b1.f r6 = r6.i
            goto L4e5
        L4e3:
            r6 = r16
        L4e5:
            if (r13 == r10) goto L4f0
            d1.c[] r6 = r13.f11840Q
            int r7 = r15 + 1
            r6 = r6[r7]
            b1.f r6 = r6.i
            goto L4ff
        L4f0:
            if (r10 != r12) goto L4ff
            d1.c[] r6 = r5.f11840Q
            r6 = r6[r15]
            d1.c r6 = r6.f
            if (r6 == 0) goto L4fd
            b1.f r6 = r6.i
            goto L4ff
        L4fd:
            r6 = r16
        L4ff:
            int r2 = r2.e()
            int r7 = r15 + 1
            r8 = r1[r7]
            int r8 = r8.e()
            if (r14 == 0) goto L514
            d1.c[] r9 = r14.f11840Q
            r9 = r9[r15]
            b1.f r4 = r9.i
            goto L521
        L514:
            d1.c[] r4 = r11.f11840Q
            r4 = r4[r7]
            d1.c r9 = r4.f
            if (r9 == 0) goto L51f
            b1.f r4 = r9.i
            goto L521
        L51f:
            r4 = r16
        L521:
            r1 = r1[r7]
            b1.f r1 = r1.i
            if (r9 == 0) goto L52c
            int r9 = r9.e()
            int r8 = r8 + r9
        L52c:
            d1.c[] r9 = r13.f11840Q
            r9 = r9[r7]
            int r9 = r9.e()
            int r9 = r9 + r2
            if (r3 == 0) goto L56e
            if (r6 == 0) goto L56e
            if (r4 == 0) goto L56e
            if (r1 == 0) goto L56e
            if (r10 != r12) goto L547
            d1.c[] r2 = r12.f11840Q
            r2 = r2[r15]
            int r9 = r2.e()
        L547:
            if (r10 != r0) goto L551
            d1.c[] r2 = r0.f11840Q
            r2 = r2[r7]
            int r8 = r2.e()
        L551:
            r2 = r3
            r3 = r6
            r6 = r4
            r4 = r9
            if (r22 == 0) goto L55b
            r9 = 8
        L559:
            r7 = r5
            goto L55d
        L55b:
            r9 = 5
            goto L559
        L55d:
            r5 = 1056964608(0x3f000000, float:0.5)
            r38 = r7
            r17 = r13
            r13 = 8
            r31 = 5
            r7 = r1
            r1 = r41
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L576
        L56e:
            r38 = r5
            r17 = r13
            r13 = 8
            r31 = 5
        L576:
            int r1 = r10.f11862g0
            if (r1 == r13) goto L57c
            r17 = r10
        L57c:
            r10 = r14
            r13 = r17
            r5 = r38
            goto L4b2
        L583:
            r38 = r5
            r13 = 8
            if (r18 == 0) goto L49b
            if (r12 == 0) goto L49b
            int r1 = r3.j
            if (r1 <= 0) goto L596
            int r2 = r3.i
            if (r2 != r1) goto L596
            r22 = 1
            goto L598
        L596:
            r22 = r20
        L598:
            r10 = r12
            r14 = r10
        L59a:
            if (r10 == 0) goto L638
            d1.c[] r1 = r10.f11840Q
            d1.d[] r2 = r10.f11872m0
            r2 = r2[r43]
        L5a2:
            if (r2 == 0) goto L5ad
            int r3 = r2.f11862g0
            if (r3 != r13) goto L5ad
            d1.d[] r2 = r2.f11872m0
            r2 = r2[r43]
            goto L5a2
        L5ad:
            if (r10 == r12) goto L62c
            if (r10 == r0) goto L62c
            if (r2 == 0) goto L62c
            if (r2 != r0) goto L5b7
            r2 = r16
        L5b7:
            r3 = r1[r15]
            b1.f r4 = r3.i
            d1.c[] r5 = r14.f11840Q
            int r6 = r15 + 1
            r5 = r5[r6]
            b1.f r5 = r5.i
            int r3 = r3.e()
            r7 = r1[r6]
            int r7 = r7.e()
            if (r2 == 0) goto L5df
            d1.c[] r1 = r2.f11840Q
            r1 = r1[r15]
            b1.f r8 = r1.i
            d1.c r9 = r1.f
            if (r9 == 0) goto L5dc
            b1.f r9 = r9.i
            goto L5f4
        L5dc:
            r9 = r16
            goto L5f4
        L5df:
            d1.c[] r8 = r0.f11840Q
            r8 = r8[r15]
            if (r8 == 0) goto L5e8
            b1.f r9 = r8.i
            goto L5ea
        L5e8:
            r9 = r16
        L5ea:
            r1 = r1[r6]
            b1.f r1 = r1.i
            r39 = r9
            r9 = r1
            r1 = r8
            r8 = r39
        L5f4:
            if (r1 == 0) goto L5fb
            int r1 = r1.e()
            int r7 = r7 + r1
        L5fb:
            d1.c[] r1 = r14.f11840Q
            r1 = r1[r6]
            int r1 = r1.e()
            int r1 = r1 + r3
            r6 = r8
            r8 = r7
            r7 = r9
            if (r22 == 0) goto L60b
            r9 = r13
            goto L60c
        L60b:
            r9 = 4
        L60c:
            if (r4 == 0) goto L623
            if (r5 == 0) goto L623
            if (r6 == 0) goto L623
            if (r7 == 0) goto L623
            r3 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r17 = r2
            r2 = r4
            r30 = 4
            r4 = r1
            r1 = r41
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L629
        L623:
            r1 = r41
            r17 = r2
            r30 = 4
        L629:
            r2 = r17
            goto L630
        L62c:
            r1 = r41
            r30 = 4
        L630:
            int r3 = r10.f11862g0
            if (r3 == r13) goto L635
            r14 = r10
        L635:
            r10 = r2
            goto L59a
        L638:
            r1 = r41
            d1.c[] r2 = r12.f11840Q
            r2 = r2[r15]
            r7 = r38
            d1.c[] r3 = r7.f11840Q
            r3 = r3[r15]
            d1.c r3 = r3.f
            d1.c[] r4 = r0.f11840Q
            int r5 = r15 + 1
            r10 = r4[r5]
            d1.c[] r4 = r11.f11840Q
            r4 = r4[r5]
            d1.c r13 = r4.f
            r9 = 5
            if (r3 == 0) goto L67b
            if (r12 == r0) goto L663
            b1.f r4 = r2.i
            b1.f r3 = r3.i
            int r2 = r2.e()
            r1.e(r4, r3, r2, r9)
            goto L67b
        L663:
            if (r13 == 0) goto L67b
            r4 = r2
            b1.f r2 = r4.i
            b1.f r3 = r3.i
            int r4 = r4.e()
            b1.f r6 = r10.i
            b1.f r7 = r13.i
            int r8 = r10.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L67b:
            if (r13 == 0) goto L68b
            if (r12 == r0) goto L68b
            b1.f r2 = r10.i
            b1.f r3 = r13.i
            int r4 = r10.e()
            int r4 = -r4
            r1.e(r2, r3, r4, r9)
        L68b:
            if (r26 != 0) goto L68f
            if (r18 == 0) goto L6e4
        L68f:
            if (r12 == 0) goto L6e4
            if (r12 == r0) goto L6e4
            d1.c[] r2 = r12.f11840Q
            r3 = r2[r15]
            if (r0 != 0) goto L69a
            r0 = r12
        L69a:
            d1.c[] r4 = r0.f11840Q
            int r5 = r15 + 1
            r6 = r4[r5]
            d1.c r7 = r3.f
            if (r7 == 0) goto L6a7
            b1.f r7 = r7.i
            goto L6a9
        L6a7:
            r7 = r16
        L6a9:
            d1.c r8 = r6.f
            if (r8 == 0) goto L6b0
            b1.f r8 = r8.i
            goto L6b2
        L6b0:
            r8 = r16
        L6b2:
            if (r11 == r0) goto L6c2
            d1.c[] r8 = r11.f11840Q
            r8 = r8[r5]
            d1.c r8 = r8.f
            if (r8 == 0) goto L6c0
            b1.f r8 = r8.i
            r16 = r8
        L6c0:
            r8 = r16
        L6c2:
            if (r12 != r0) goto L6c6
            r6 = r2[r5]
        L6c6:
            if (r7 == 0) goto L6e4
            if (r8 == 0) goto L6e4
            r0 = r4
            int r4 = r3.e()
            r0 = r0[r5]
            int r0 = r0.e()
            b1.f r2 = r3.i
            b1.f r3 = r6.i
            r9 = 5
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = r7
            r7 = r3
            r3 = r6
            r6 = r8
            r8 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L6e4:
            int r2 = r25 + 1
            r0 = r40
            r1 = r41
            r10 = r42
            r14 = r19
            r13 = r37
            goto L17
        L6f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.j.a(d1.e, b1.c, java.util.ArrayList, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(e eVar, b1.c cVar, C0953d c0953d) {
        c0953d.f11875o = -1;
        C0952c c0952c = c0953d.f11836M;
        int[] iArr = c0953d.f11878p0;
        C0952c c0952c2 = c0953d.f11835L;
        C0952c c0952c3 = c0953d.f11833J;
        C0952c c0952c4 = c0953d.f11834K;
        C0952c c0952c5 = c0953d.f11832I;
        c0953d.f11877p = -1;
        if (eVar.f11878p0[0] != 2 && iArr[0] == 4) {
            int i = c0952c5.f11822g;
            int iQ = eVar.q() - c0952c4.f11822g;
            c0952c5.i = cVar.k(c0952c5);
            c0952c4.i = cVar.k(c0952c4);
            cVar.d(c0952c5.i, i);
            cVar.d(c0952c4.i, iQ);
            c0953d.f11875o = 2;
            c0953d.f11848Y = i;
            int i7 = iQ - i;
            c0953d.f11844U = i7;
            int i8 = c0953d.f11853b0;
            if (i7 < i8) {
                c0953d.f11844U = i8;
            }
        }
        if (eVar.f11878p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i9 = c0952c3.f11822g;
        int iK = eVar.k() - c0952c2.f11822g;
        c0952c3.i = cVar.k(c0952c3);
        c0952c2.i = cVar.k(c0952c2);
        cVar.d(c0952c3.i, i9);
        cVar.d(c0952c2.i, iK);
        if (c0953d.f11851a0 > 0 || c0953d.f11862g0 == 8) {
            b1.f fVarK = cVar.k(c0952c);
            c0952c.i = fVarK;
            cVar.d(fVarK, c0953d.f11851a0 + i9);
        }
        c0953d.f11877p = 2;
        c0953d.f11849Z = i9;
        int i10 = iK - i9;
        c0953d.f11845V = i10;
        int i11 = c0953d.f11855c0;
        if (i10 < i11) {
            c0953d.f11845V = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(int i, int i7) {
        return (i & i7) == i7;
    }
}
