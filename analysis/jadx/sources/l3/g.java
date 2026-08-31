package l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14461a = Z.m.s("ty", "d");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0774 A[LOOP:1: B:443:0x076e->B:445:0x0774, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i3.InterfaceC1138c a(m3.C1361b r36, a3.C0632k r37) throws com.google.android.gms.internal.clearcut.m0, java.io.EOFException {
        /*
            r0 = r36
            r1 = r37
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b()
            r3 = 2
            r4 = r3
        Lf:
            boolean r5 = r0.n()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L32
            Z.m r5 = l3.g.f14461a
            int r5 = r0.a0(r5)
            if (r5 == 0) goto L2d
            if (r5 == r6) goto L28
            r0.b0()
            r0.c0()
            goto Lf
        L28:
            int r4 = r0.G()
            goto Lf
        L2d:
            java.lang.String r5 = r0.K()
            goto L33
        L32:
            r5 = r7
        L33:
            if (r5 != 0) goto L36
            return r7
        L36:
            int r8 = r5.hashCode()
            r9 = 0
            r11 = 5
            r12 = 4
            r13 = 3
            switch(r8) {
                case 3239: goto Le2;
                case 3270: goto Ld6;
                case 3295: goto Lca;
                case 3307: goto Lbe;
                case 3308: goto Lb3;
                case 3488: goto La8;
                case 3633: goto L9d;
                case 3634: goto L92;
                case 3646: goto L85;
                case 3669: goto L78;
                case 3679: goto L6b;
                case 3681: goto L5e;
                case 3705: goto L51;
                case 3710: goto L44;
                default: goto L41;
            }
        L41:
            r8 = -1
            goto Led
        L44:
            java.lang.String r8 = "tr"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L4d
            goto L41
        L4d:
            r8 = 13
            goto Led
        L51:
            java.lang.String r8 = "tm"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L5a
            goto L41
        L5a:
            r8 = 12
            goto Led
        L5e:
            java.lang.String r8 = "st"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L67
            goto L41
        L67:
            r8 = 11
            goto Led
        L6b:
            java.lang.String r8 = "sr"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L74
            goto L41
        L74:
            r8 = 10
            goto Led
        L78:
            java.lang.String r8 = "sh"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L81
            goto L41
        L81:
            r8 = 9
            goto Led
        L85:
            java.lang.String r8 = "rp"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L8e
            goto L41
        L8e:
            r8 = 8
            goto Led
        L92:
            java.lang.String r8 = "rd"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L9b
            goto L41
        L9b:
            r8 = 7
            goto Led
        L9d:
            java.lang.String r8 = "rc"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto La6
            goto L41
        La6:
            r8 = 6
            goto Led
        La8:
            java.lang.String r8 = "mm"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Lb1
            goto L41
        Lb1:
            r8 = r11
            goto Led
        Lb3:
            java.lang.String r8 = "gs"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Lbc
            goto L41
        Lbc:
            r8 = r12
            goto Led
        Lbe:
            java.lang.String r8 = "gr"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Lc8
            goto L41
        Lc8:
            r8 = r13
            goto Led
        Lca:
            java.lang.String r8 = "gf"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Ld4
            goto L41
        Ld4:
            r8 = r3
            goto Led
        Ld6:
            java.lang.String r8 = "fl"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Le0
            goto L41
        Le0:
            r8 = r6
            goto Led
        Le2:
            java.lang.String r8 = "el"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto Lec
            goto L41
        Lec:
            r8 = r9
        Led:
            java.lang.String r14 = "o"
            java.lang.String r15 = "g"
            r16 = r7
            java.lang.String r7 = "d"
            r17 = 0
            switch(r8) {
                case 0: goto L718;
                case 1: goto L6ac;
                case 2: goto L60b;
                case 3: goto L5c4;
                case 4: goto L491;
                case 5: goto L443;
                case 6: goto L3fc;
                case 7: goto L3c7;
                case 8: goto L380;
                case 9: goto L339;
                case 10: goto L29e;
                case 11: goto L173;
                case 12: goto L10d;
                case 13: goto L107;
                default: goto Lfa;
            }
        Lfa:
            java.lang.String r1 = "Unknown shape type "
            java.lang.String r1 = r1.concat(r5)
            n3.c.b(r1)
        L103:
            r7 = r16
            goto L76e
        L107:
            h3.d r7 = l3.AbstractC1229c.a(r36, r37)
            goto L76e
        L10d:
            Z.m r2 = l3.C.f14444a
            r19 = r9
            r23 = r19
            r18 = r16
            r20 = r18
            r21 = r20
            r22 = r21
        L11b:
            boolean r2 = r0.n()
            if (r2 == 0) goto L16a
            Z.m r2 = l3.C.f14444a
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L165
            if (r2 == r6) goto L160
            if (r2 == r3) goto L15b
            if (r2 == r13) goto L156
            if (r2 == r12) goto L13c
            if (r2 == r11) goto L137
            r0.c0()
            goto L11b
        L137:
            boolean r23 = r0.v()
            goto L11b
        L13c:
            int r2 = r0.G()
            if (r2 == r6) goto L153
            if (r2 != r3) goto L147
            r19 = r3
            goto L11b
        L147:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown trim path type "
            java.lang.String r1 = k1.i.i(r2, r1)
            r0.<init>(r1)
            throw r0
        L153:
            r19 = r6
            goto L11b
        L156:
            java.lang.String r18 = r0.K()
            goto L11b
        L15b:
            h3.b r22 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L11b
        L160:
            h3.b r21 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L11b
        L165:
            h3.b r20 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L11b
        L16a:
            i3.q r17 = new i3.q
            r17.<init>(r18, r19, r20, r21, r22, r23)
        L16f:
            r7 = r17
            goto L76e
        L173:
            Z.m r4 = l3.B.f14442a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8 = r9
            r11 = r8
            r28 = r11
            r5 = r16
            r19 = r5
            r20 = r19
            r22 = r20
            r24 = r22
            r27 = r17
        L18a:
            boolean r12 = r0.n()
            if (r12 == 0) goto L273
            Z.m r12 = l3.B.f14442a
            int r12 = r0.a0(r12)
            switch(r12) {
                case 0: goto L26b;
                case 1: goto L263;
                case 2: goto L25b;
                case 3: goto L253;
                case 4: goto L244;
                case 5: goto L235;
                case 6: goto L22b;
                case 7: goto L223;
                case 8: goto L19d;
                default: goto L199;
            }
        L199:
            r0.c0()
            goto L18a
        L19d:
            r0.a()
        L1a0:
            boolean r12 = r0.n()
            if (r12 == 0) goto L20b
            r0.b()
            r10 = r16
            r12 = r10
        L1ac:
            boolean r17 = r0.n()
            if (r17 == 0) goto L1d1
            r21 = r13
            Z.m r13 = l3.B.f14443b
            int r13 = r0.a0(r13)
            if (r13 == 0) goto L1cc
            if (r13 == r6) goto L1c7
            r0.b0()
            r0.c0()
        L1c4:
            r13 = r21
            goto L1ac
        L1c7:
            h3.b r10 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L1c4
        L1cc:
            java.lang.String r12 = r0.K()
            goto L1c4
        L1d1:
            r21 = r13
            r0.e()
            r12.getClass()
            int r13 = r12.hashCode()
            switch(r13) {
                case 100: goto L1f4;
                case 103: goto L1eb;
                case 111: goto L1e2;
                default: goto L1e0;
            }
        L1e0:
            r12 = -1
            goto L1fc
        L1e2:
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L1e9
            goto L1e0
        L1e9:
            r12 = r3
            goto L1fc
        L1eb:
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L1f2
            goto L1e0
        L1f2:
            r12 = r6
            goto L1fc
        L1f4:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L1fb
            goto L1e0
        L1fb:
            r12 = r9
        L1fc:
            switch(r12) {
                case 0: goto L203;
                case 1: goto L203;
                case 2: goto L200;
                default: goto L1ff;
            }
        L1ff:
            goto L208
        L200:
            r20 = r10
            goto L208
        L203:
            r1.f8844o = r6
            r4.add(r10)
        L208:
            r13 = r21
            goto L1a0
        L20b:
            r21 = r13
            r0.c()
            int r10 = r4.size()
            if (r10 != r6) goto L21f
            java.lang.Object r10 = r4.get(r9)
            h3.b r10 = (h3.C1123b) r10
            r4.add(r10)
        L21f:
            r13 = r21
            goto L18a
        L223:
            r21 = r13
            boolean r28 = r0.v()
            goto L18a
        L22b:
            r21 = r13
            double r12 = r0.z()
            float r10 = (float) r12
            r27 = r10
            goto L21f
        L235:
            r21 = r13
            int[] r10 = O.c.b(r21)
            int r11 = r0.G()
            int r11 = r11 - r6
            r11 = r10[r11]
            goto L18a
        L244:
            r21 = r13
            int[] r8 = O.c.b(r21)
            int r10 = r0.G()
            int r10 = r10 - r6
            r8 = r8[r10]
            goto L18a
        L253:
            r21 = r13
            h3.a r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r36, r37)
            goto L18a
        L25b:
            r21 = r13
            h3.b r24 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L18a
        L263:
            r21 = r13
            h3.a r22 = com.google.android.gms.internal.measurement.AbstractC0836n2.G(r36, r37)
            goto L18a
        L26b:
            r21 = r13
            java.lang.String r19 = r0.K()
            goto L18a
        L273:
            if (r5 != 0) goto L283
            h3.a r5 = new h3.a
            o3.a r1 = new o3.a
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5.<init>(r3, r1)
        L283:
            r23 = r5
            if (r8 != 0) goto L28a
            r25 = r6
            goto L28c
        L28a:
            r25 = r8
        L28c:
            if (r11 != 0) goto L291
            r26 = r6
            goto L293
        L291:
            r26 = r11
        L293:
            i3.p r18 = new i3.p
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7 = r18
            goto L76e
        L29e:
            r21 = r13
            Z.m r2 = l3.t.f14491a
            r2 = r21
            if (r4 != r2) goto L2a8
            r2 = r6
            goto L2a9
        L2a8:
            r2 = r9
        L2a9:
            r33 = r2
            r24 = r9
            r32 = r24
            r23 = r16
            r25 = r23
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
        L2bf:
            boolean r2 = r0.n()
            if (r2 == 0) goto L330
            Z.m r2 = l3.t.f14491a
            int r2 = r0.a0(r2)
            switch(r2) {
                case 0: goto L32b;
                case 1: goto L30a;
                case 2: goto L305;
                case 3: goto L300;
                case 4: goto L2fb;
                case 5: goto L2f6;
                case 6: goto L2f1;
                case 7: goto L2ec;
                case 8: goto L2e7;
                case 9: goto L2e2;
                case 10: goto L2d5;
                default: goto L2ce;
            }
        L2ce:
            r0.b0()
            r0.c0()
            goto L2bf
        L2d5:
            int r2 = r0.G()
            r4 = 3
            if (r2 != r4) goto L2df
            r33 = r6
            goto L2bf
        L2df:
            r33 = r9
            goto L2bf
        L2e2:
            boolean r32 = r0.v()
            goto L2bf
        L2e7:
            h3.b r30 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L2bf
        L2ec:
            h3.b r28 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L2bf
        L2f1:
            h3.b r31 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L2bf
        L2f6:
            h3.b r29 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L2bf
        L2fb:
            h3.b r27 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L2bf
        L300:
            h3.e r26 = l3.AbstractC1227a.b(r36, r37)
            goto L2bf
        L305:
            h3.b r25 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L2bf
        L30a:
            int r2 = r0.G()
            int[] r4 = O.c.b(r3)
            int r5 = r4.length
            r7 = r9
        L314:
            if (r7 >= r5) goto L328
            r8 = r4[r7]
            if (r8 == r6) goto L31f
            if (r8 != r3) goto L31e
            r10 = r3
            goto L320
        L31e:
            throw r16
        L31f:
            r10 = r6
        L320:
            if (r10 != r2) goto L325
            r24 = r8
            goto L2bf
        L325:
            int r7 = r7 + 1
            goto L314
        L328:
            r24 = r9
            goto L2bf
        L32b:
            java.lang.String r23 = r0.K()
            goto L2bf
        L330:
            i3.i r22 = new i3.i
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L335:
            r7 = r22
            goto L76e
        L339:
            Z.m r2 = l3.A.f14441a
            r4 = r9
            r5 = r4
            r2 = r16
            r7 = r2
        L340:
            boolean r8 = r0.n()
            if (r8 == 0) goto L378
            Z.m r8 = l3.A.f14441a
            int r8 = r0.a0(r8)
            if (r8 == 0) goto L373
            if (r8 == r6) goto L36e
            if (r8 == r3) goto L35e
            r10 = 3
            if (r8 == r10) goto L359
            r0.c0()
            goto L340
        L359:
            boolean r5 = r0.v()
            goto L340
        L35e:
            h3.a r2 = new h3.a
            float r8 = n3.i.c()
            l3.x r10 = l3.x.f14495q
            java.util.ArrayList r8 = l3.p.a(r0, r1, r8, r10, r9)
            r2.<init>(r11, r8)
            goto L340
        L36e:
            int r4 = r0.G()
            goto L340
        L373:
            java.lang.String r7 = r0.K()
            goto L340
        L378:
            i3.o r1 = new i3.o
            r1.<init>(r7, r4, r2, r5)
        L37d:
            r7 = r1
            goto L76e
        L380:
            Z.m r2 = l3.v.f14493a
            r27 = r9
            r23 = r16
            r24 = r23
            r25 = r24
            r26 = r25
        L38c:
            boolean r2 = r0.n()
            if (r2 == 0) goto L3c0
            Z.m r2 = l3.v.f14493a
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L3bb
            if (r2 == r6) goto L3b6
            if (r2 == r3) goto L3b1
            r4 = 3
            if (r2 == r4) goto L3ac
            if (r2 == r12) goto L3a7
            r0.c0()
            goto L38c
        L3a7:
            boolean r27 = r0.v()
            goto L38c
        L3ac:
            h3.d r26 = l3.AbstractC1229c.a(r36, r37)
            goto L38c
        L3b1:
            h3.b r25 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L38c
        L3b6:
            h3.b r24 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r9)
            goto L38c
        L3bb:
            java.lang.String r23 = r0.K()
            goto L38c
        L3c0:
            i3.j r22 = new i3.j
            r22.<init>(r23, r24, r25, r26, r27)
            goto L335
        L3c7:
            Z.m r2 = l3.w.f14494a
            r2 = r16
            r4 = r2
        L3cc:
            boolean r5 = r0.n()
            if (r5 == 0) goto L3f1
            Z.m r5 = l3.w.f14494a
            int r5 = r0.a0(r5)
            if (r5 == 0) goto L3ec
            if (r5 == r6) goto L3e7
            if (r5 == r3) goto L3e2
            r0.c0()
            goto L3cc
        L3e2:
            boolean r9 = r0.v()
            goto L3cc
        L3e7:
            h3.b r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L3cc
        L3ec:
            java.lang.String r2 = r0.K()
            goto L3cc
        L3f1:
            if (r9 == 0) goto L3f5
            goto L103
        L3f5:
            i3.k r7 = new i3.k
            r7.<init>(r2, r4)
            goto L76e
        L3fc:
            Z.m r2 = l3.u.f14492a
            r27 = r9
            r23 = r16
            r24 = r23
            r25 = r24
            r26 = r25
        L408:
            boolean r2 = r0.n()
            if (r2 == 0) goto L43c
            Z.m r2 = l3.u.f14492a
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L437
            if (r2 == r6) goto L432
            if (r2 == r3) goto L42d
            r4 = 3
            if (r2 == r4) goto L428
            if (r2 == r12) goto L423
            r0.c0()
            goto L408
        L423:
            boolean r27 = r0.v()
            goto L408
        L428:
            h3.b r26 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L408
        L42d:
            h3.a r25 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L408
        L432:
            h3.e r24 = l3.AbstractC1227a.b(r36, r37)
            goto L408
        L437:
            java.lang.String r23 = r0.K()
            goto L408
        L43c:
            i3.j r22 = new i3.j
            r22.<init>(r23, r24, r25, r26, r27)
            goto L335
        L443:
            Z.m r2 = l3.s.f14490a
            r2 = r9
            r7 = r16
        L448:
            boolean r4 = r0.n()
            if (r4 == 0) goto L484
            Z.m r4 = l3.s.f14490a
            int r4 = r0.a0(r4)
            if (r4 == 0) goto L47f
            if (r4 == r6) goto L466
            if (r4 == r3) goto L461
            r0.b0()
            r0.c0()
            goto L448
        L461:
            boolean r2 = r0.v()
            goto L448
        L466:
            int r4 = r0.G()
            if (r4 == r6) goto L475
            if (r4 == r3) goto L47d
            r10 = 3
            if (r4 == r10) goto L47b
            if (r4 == r12) goto L479
            if (r4 == r11) goto L477
        L475:
            r9 = r6
            goto L448
        L477:
            r9 = r11
            goto L448
        L479:
            r9 = r12
            goto L448
        L47b:
            r9 = 3
            goto L448
        L47d:
            r9 = r3
            goto L448
        L47f:
            java.lang.String r7 = r0.K()
            goto L448
        L484:
            i3.h r3 = new i3.h
            r3.<init>(r7, r2, r9)
            java.lang.String r2 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r1.a(r2)
            r7 = r3
            goto L76e
        L491:
            Z.m r4 = l3.m.f14475a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r24 = r9
            r30 = r24
            r31 = r30
            r35 = r31
            r5 = r16
            r23 = r5
            r25 = r23
            r27 = r25
            r28 = r27
            r29 = r28
            r34 = r29
            r32 = r17
        L4b0:
            boolean r8 = r0.n()
            if (r8 == 0) goto L5a9
            Z.m r8 = l3.m.f14475a
            int r8 = r0.a0(r8)
            switch(r8) {
                case 0: goto L5a3;
                case 1: goto L579;
                case 2: goto L573;
                case 3: goto L565;
                case 4: goto L55f;
                case 5: goto L559;
                case 6: goto L553;
                case 7: goto L544;
                case 8: goto L535;
                case 9: goto L52c;
                case 10: goto L527;
                case 11: goto L4c6;
                default: goto L4bf;
            }
        L4bf:
            r0.b0()
            r0.c0()
            goto L4b0
        L4c6:
            r0.a()
        L4c9:
            boolean r8 = r0.n()
            if (r8 == 0) goto L514
            r0.b()
            r8 = r16
            r10 = r8
        L4d5:
            boolean r11 = r0.n()
            if (r11 == 0) goto L4f6
            Z.m r11 = l3.m.f14477c
            int r11 = r0.a0(r11)
            if (r11 == 0) goto L4f1
            if (r11 == r6) goto L4ec
            r0.b0()
            r0.c0()
            goto L4d5
        L4ec:
            h3.b r10 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L4d5
        L4f1:
            java.lang.String r8 = r0.K()
            goto L4d5
        L4f6:
            r0.e()
            boolean r11 = r8.equals(r14)
            if (r11 == 0) goto L502
            r34 = r10
            goto L4c9
        L502:
            boolean r11 = r8.equals(r7)
            if (r11 != 0) goto L50e
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L4c9
        L50e:
            r1.f8844o = r6
            r4.add(r10)
            goto L4c9
        L514:
            r0.c()
            int r8 = r4.size()
            if (r8 != r6) goto L4b0
            java.lang.Object r8 = r4.get(r9)
            h3.b r8 = (h3.C1123b) r8
            r4.add(r8)
            goto L4b0
        L527:
            boolean r35 = r0.v()
            goto L4b0
        L52c:
            double r10 = r0.z()
            float r8 = (float) r10
            r32 = r8
            goto L4b0
        L535:
            r21 = 3
            int[] r8 = O.c.b(r21)
            int r10 = r0.G()
            int r10 = r10 - r6
            r31 = r8[r10]
            goto L4b0
        L544:
            r21 = 3
            int[] r8 = O.c.b(r21)
            int r10 = r0.G()
            int r10 = r10 - r6
            r30 = r8[r10]
            goto L4b0
        L553:
            h3.b r29 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r6)
            goto L4b0
        L559:
            h3.a r28 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L4b0
        L55f:
            h3.a r27 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L4b0
        L565:
            int r8 = r0.G()
            if (r8 != r6) goto L56f
            r24 = r6
            goto L4b0
        L56f:
            r24 = r3
            goto L4b0
        L573:
            h3.a r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r36, r37)
            goto L4b0
        L579:
            r0.b()
            r8 = -1
        L57d:
            boolean r10 = r0.n()
            if (r10 == 0) goto L59e
            Z.m r10 = l3.m.f14476b
            int r10 = r0.a0(r10)
            if (r10 == 0) goto L599
            if (r10 == r6) goto L594
            r0.b0()
            r0.c0()
            goto L57d
        L594:
            h3.a r25 = com.google.android.gms.internal.measurement.AbstractC0836n2.I(r0, r1, r8)
            goto L57d
        L599:
            int r8 = r0.G()
            goto L57d
        L59e:
            r0.e()
            goto L4b0
        L5a3:
            java.lang.String r23 = r0.K()
            goto L4b0
        L5a9:
            if (r5 != 0) goto L5b9
            h3.a r5 = new h3.a
            o3.a r1 = new o3.a
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5.<init>(r3, r1)
        L5b9:
            r26 = r5
            i3.f r22 = new i3.f
            r33 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L335
        L5c4:
            Z.m r2 = l3.z.f14498a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7 = r16
        L5cd:
            boolean r4 = r0.n()
            if (r4 == 0) goto L604
            Z.m r4 = l3.z.f14498a
            int r4 = r0.a0(r4)
            if (r4 == 0) goto L5ff
            if (r4 == r6) goto L5fa
            if (r4 == r3) goto L5e3
            r0.c0()
            goto L5cd
        L5e3:
            r0.a()
        L5e6:
            boolean r4 = r0.n()
            if (r4 == 0) goto L5f6
            i3.c r4 = a(r36, r37)
            if (r4 == 0) goto L5e6
            r2.add(r4)
            goto L5e6
        L5f6:
            r0.c()
            goto L5cd
        L5fa:
            boolean r9 = r0.v()
            goto L5cd
        L5ff:
            java.lang.String r7 = r0.K()
            goto L5cd
        L604:
            i3.n r1 = new i3.n
            r1.<init>(r7, r2, r9)
            goto L37d
        L60b:
            Z.m r4 = l3.l.f14473a
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.WINDING
            r22 = r4
            r21 = r9
            r27 = r21
            r7 = r16
            r20 = r7
            r23 = r20
            r25 = r23
            r26 = r25
        L61f:
            boolean r4 = r0.n()
            if (r4 == 0) goto L691
            Z.m r4 = l3.l.f14473a
            int r4 = r0.a0(r4)
            switch(r4) {
                case 0: goto L68c;
                case 1: goto L663;
                case 2: goto L65e;
                case 3: goto L652;
                case 4: goto L64d;
                case 5: goto L648;
                case 6: goto L63a;
                case 7: goto L635;
                default: goto L62e;
            }
        L62e:
            r0.b0()
            r0.c0()
            goto L61f
        L635:
            boolean r27 = r0.v()
            goto L61f
        L63a:
            int r4 = r0.G()
            if (r4 != r6) goto L645
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.WINDING
        L642:
            r22 = r4
            goto L61f
        L645:
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.EVEN_ODD
            goto L642
        L648:
            h3.a r26 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L61f
        L64d:
            h3.a r25 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L61f
        L652:
            int r4 = r0.G()
            if (r4 != r6) goto L65b
            r21 = r6
            goto L61f
        L65b:
            r21 = r3
            goto L61f
        L65e:
            h3.a r7 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r36, r37)
            goto L61f
        L663:
            r0.b()
            r4 = -1
        L667:
            boolean r5 = r0.n()
            if (r5 == 0) goto L688
            Z.m r5 = l3.l.f14474b
            int r5 = r0.a0(r5)
            if (r5 == 0) goto L683
            if (r5 == r6) goto L67e
            r0.b0()
            r0.c0()
            goto L667
        L67e:
            h3.a r23 = com.google.android.gms.internal.measurement.AbstractC0836n2.I(r0, r1, r4)
            goto L667
        L683:
            int r4 = r0.G()
            goto L667
        L688:
            r0.e()
            goto L61f
        L68c:
            java.lang.String r20 = r0.K()
            goto L61f
        L691:
            if (r7 != 0) goto L6a1
            h3.a r7 = new h3.a
            o3.a r1 = new o3.a
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r7.<init>(r3, r1)
        L6a1:
            r24 = r7
            i3.e r19 = new i3.e
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r7 = r19
            goto L76e
        L6ac:
            Z.m r4 = l3.y.f14497a
            r4 = r6
            r15 = r9
            r19 = r15
            r7 = r16
            r14 = r7
            r17 = r14
        L6b7:
            boolean r5 = r0.n()
            if (r5 == 0) goto L6f5
            Z.m r5 = l3.y.f14497a
            int r5 = r0.a0(r5)
            if (r5 == 0) goto L6f0
            if (r5 == r6) goto L6eb
            if (r5 == r3) goto L6e6
            r10 = 3
            if (r5 == r10) goto L6e1
            if (r5 == r12) goto L6dc
            if (r5 == r11) goto L6d7
            r0.b0()
            r0.c0()
            goto L6b7
        L6d7:
            boolean r19 = r0.v()
            goto L6b7
        L6dc:
            int r4 = r0.G()
            goto L6b7
        L6e1:
            boolean r15 = r0.v()
            goto L6b7
        L6e6:
            h3.a r7 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r36, r37)
            goto L6b7
        L6eb:
            h3.a r17 = com.google.android.gms.internal.measurement.AbstractC0836n2.G(r36, r37)
            goto L6b7
        L6f0:
            java.lang.String r14 = r0.K()
            goto L6b7
        L6f5:
            if (r7 != 0) goto L705
            h3.a r7 = new h3.a
            o3.a r1 = new o3.a
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r7.<init>(r3, r1)
        L705:
            r18 = r7
            if (r4 != r6) goto L70e
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.WINDING
        L70b:
            r16 = r1
            goto L711
        L70e:
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
            goto L70b
        L711:
            i3.m r13 = new i3.m
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7 = r13
            goto L76e
        L718:
            Z.m r2 = l3.e.f14453a
            r10 = 3
            if (r4 != r10) goto L71f
            r2 = r6
            goto L720
        L71f:
            r2 = r9
        L720:
            r21 = r2
            r22 = r9
            r18 = r16
            r19 = r18
            r20 = r19
        L72a:
            boolean r2 = r0.n()
            if (r2 == 0) goto L767
            Z.m r2 = l3.e.f14453a
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L762
            if (r2 == r6) goto L75d
            if (r2 == r3) goto L758
            if (r2 == r10) goto L753
            if (r2 == r12) goto L747
            r0.b0()
            r0.c0()
            goto L72a
        L747:
            int r2 = r0.G()
            if (r2 != r10) goto L750
            r21 = r6
            goto L72a
        L750:
            r21 = r9
            goto L72a
        L753:
            boolean r22 = r0.v()
            goto L72a
        L758:
            h3.a r20 = com.google.android.gms.internal.measurement.AbstractC0836n2.K(r36, r37)
            goto L72a
        L75d:
            h3.e r19 = l3.AbstractC1227a.b(r36, r37)
            goto L72a
        L762:
            java.lang.String r18 = r0.K()
            goto L72a
        L767:
            i3.b r17 = new i3.b
            r17.<init>(r18, r19, r20, r21, r22)
            goto L16f
        L76e:
            boolean r1 = r0.n()
            if (r1 == 0) goto L778
            r0.c0()
            goto L76e
        L778:
            r0.e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.g.a(m3.b, a3.k):i3.c");
    }
}
