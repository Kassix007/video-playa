package l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14483a = Z.m.s("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.m f14484b = Z.m.s("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z.m f14485c = Z.m.s("ty", "nm");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j3.e a(m3.C1361b r50, a3.C0632k r51) {
        /*
            r0 = r50
            r1 = r51
            r7 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.b()
            java.lang.String r6 = "UNSET"
            r12 = 0
            r14 = -1
            r17 = r7
            r18 = r17
            r25 = r18
            r26 = r25
            r27 = r26
            r36 = r27
            r16 = r8
            r7 = r14
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 1
            r32 = 1
            r33 = 0
            r34 = 0
            r35 = 0
            r15 = r3
            r13 = r12
            r3 = 0
            r12 = r6
        L51:
            r6 = 0
        L52:
            boolean r37 = r0.n()
            if (r37 == 0) goto L663
            Z.m r11 = l3.q.f14483a
            int r11 = r0.a0(r11)
            r38 = -1
            switch(r11) {
                case 0: goto L652;
                case 1: goto L640;
                case 2: goto L62f;
                case 3: goto L613;
                case 4: goto L604;
                case 5: goto L5ea;
                case 6: goto L5d0;
                case 7: goto L5b9;
                case 8: goto L5a8;
                case 9: goto L552;
                case 10: goto L452;
                case 11: goto L432;
                case 12: goto L2b4;
                case 13: goto L104;
                case 14: goto Lfa;
                case 15: goto Lee;
                case 16: goto Ldc;
                case 17: goto Lc5;
                case 18: goto Lbd;
                case 19: goto Lb5;
                case 20: goto Laf;
                case 21: goto Laa;
                case 22: goto La5;
                case 23: goto L9c;
                case 24: goto L74;
                default: goto L63;
            }
        L63:
            r0.b0()
            r0.c0()
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
        L71:
            r11 = 0
            goto L579
        L74:
            int r4 = r0.G()
            r32 = 18
            int[] r11 = O.c.b(r32)
            int r11 = r11.length
            if (r4 < r11) goto L95
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r5 = "Unsupported Blend Mode: "
            r11.<init>(r5)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r1.a(r4)
            r32 = 1
            goto L52
        L95:
            int[] r5 = O.c.b(r32)
            r32 = r5[r4]
            goto L52
        L9c:
            int r4 = r0.G()
            r5 = 1
            if (r4 != r5) goto L51
            r6 = 1
            goto L52
        La5:
            boolean r28 = r0.v()
            goto L52
        Laa:
            java.lang.String r3 = r0.K()
            goto L52
        Laf:
            r4 = 0
            h3.b r35 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r4)
            goto L52
        Lb5:
            double r4 = r0.z()
            float r4 = (float) r4
            r18 = r4
            goto L52
        Lbd:
            double r4 = r0.z()
            float r4 = (float) r4
            r17 = r4
            goto L52
        Lc5:
            double r4 = r0.z()
            float r11 = n3.i.c()
            r42 = r2
            r43 = r3
            double r2 = (double) r11
            double r4 = r4 * r2
            float r2 = (float) r4
            r26 = r2
        Ld6:
            r2 = r42
            r3 = r43
            goto L52
        Ldc:
            r42 = r2
            r43 = r3
            double r2 = r0.z()
            float r4 = n3.i.c()
            double r4 = (double) r4
            double r2 = r2 * r4
            float r2 = (float) r2
            r25 = r2
            goto Ld6
        Lee:
            r42 = r2
            r43 = r3
            double r2 = r0.z()
            float r2 = (float) r2
            r27 = r2
            goto Ld6
        Lfa:
            r42 = r2
            r43 = r3
            double r2 = r0.z()
            float r15 = (float) r2
            goto Ld6
        L104:
            r42 = r2
            r43 = r3
            r0.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L110:
            boolean r3 = r0.n()
            if (r3 == 0) goto L29e
            r0.b()
        L119:
            boolean r3 = r0.n()
            if (r3 == 0) goto L299
            Z.m r3 = l3.q.f14485c
            int r3 = r0.a0(r3)
            if (r3 == 0) goto L139
            r5 = 1
            if (r3 == r5) goto L131
            r0.b0()
            r0.c0()
            goto L119
        L131:
            java.lang.String r3 = r0.K()
            r2.add(r3)
            goto L119
        L139:
            int r3 = r0.G()
            r5 = 29
            if (r3 != r5) goto L1a7
            Z.m r3 = l3.AbstractC1230d.f14451a
            r29 = 0
        L145:
            boolean r3 = r0.n()
            if (r3 == 0) goto L119
            Z.m r3 = l3.AbstractC1230d.f14451a
            int r3 = r0.a0(r3)
            if (r3 == 0) goto L15a
            r0.b0()
            r0.c0()
            goto L145
        L15a:
            r0.a()
        L15d:
            boolean r3 = r0.n()
            if (r3 == 0) goto L1a3
            r0.b()
            r3 = 0
            r5 = 0
        L168:
            boolean r11 = r0.n()
            if (r11 == 0) goto L19b
            Z.m r11 = l3.AbstractC1230d.f14452b
            int r11 = r0.a0(r11)
            if (r11 == 0) goto L191
            r4 = 1
            if (r11 == r4) goto L180
            r0.b0()
            r0.c0()
            goto L168
        L180:
            if (r3 == 0) goto L18d
            i3.a r5 = new i3.a
            h3.b r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r4)
            r4 = 0
            r5.<init>(r4, r11)
            goto L168
        L18d:
            r0.c0()
            goto L168
        L191:
            int r3 = r0.G()
            if (r3 != 0) goto L199
            r3 = 1
            goto L168
        L199:
            r3 = 0
            goto L168
        L19b:
            r0.e()
            if (r5 == 0) goto L15d
            r29 = r5
            goto L15d
        L1a3:
            r0.c()
            goto L145
        L1a7:
            r4 = 25
            if (r3 != r4) goto L119
            l3.i r3 = new l3.i
            r3.<init>()
        L1b0:
            boolean r4 = r0.n()
            if (r4 == 0) goto L26e
            Z.m r4 = l3.i.f
            int r4 = r0.a0(r4)
            if (r4 == 0) goto L1c5
            r0.b0()
            r0.c0()
            goto L1b0
        L1c5:
            r0.a()
        L1c8:
            boolean r4 = r0.n()
            if (r4 == 0) goto L269
            r0.b()
            java.lang.String r4 = ""
        L1d3:
            boolean r5 = r0.n()
            if (r5 == 0) goto L264
            Z.m r5 = l3.i.f14464g
            int r5 = r0.a0(r5)
            if (r5 == 0) goto L25e
            r11 = 1
            if (r5 == r11) goto L1eb
            r0.b0()
            r0.c0()
            goto L1d3
        L1eb:
            r4.getClass()
            int r5 = r4.hashCode()
            switch(r5) {
                case 353103893: goto L224;
                case 397447147: goto L219;
                case 1041377119: goto L20e;
                case 1379387491: goto L203;
                case 1383710113: goto L1f8;
                default: goto L1f5;
            }
        L1f5:
            r5 = r38
            goto L22e
        L1f8:
            java.lang.String r5 = "Softness"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L201
            goto L1f5
        L201:
            r5 = 4
            goto L22e
        L203:
            java.lang.String r5 = "Shadow Color"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L20c
            goto L1f5
        L20c:
            r5 = 3
            goto L22e
        L20e:
            java.lang.String r5 = "Direction"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L217
            goto L1f5
        L217:
            r5 = 2
            goto L22e
        L219:
            java.lang.String r5 = "Opacity"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L222
            goto L1f5
        L222:
            r5 = 1
            goto L22e
        L224:
            java.lang.String r5 = "Distance"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L22d
            goto L1f5
        L22d:
            r5 = 0
        L22e:
            switch(r5) {
                case 0: goto L255;
                case 1: goto L24c;
                case 2: goto L244;
                case 3: goto L23d;
                case 4: goto L235;
                default: goto L231;
            }
        L231:
            r0.c0()
            goto L1d3
        L235:
            r5 = 1
            h3.b r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            r3.f14469e = r11
            goto L1d3
        L23d:
            h3.a r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.G(r50, r51)
            r3.f14465a = r5
            goto L1d3
        L244:
            r5 = 0
            h3.b r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            r3.f14467c = r11
            goto L1d3
        L24c:
            r5 = 0
            h3.b r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            r3.f14466b = r11
            goto L1d3
        L255:
            r5 = 1
            h3.b r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            r3.f14468d = r11
            goto L1d3
        L25e:
            java.lang.String r4 = r0.K()
            goto L1d3
        L264:
            r0.e()
            goto L1c8
        L269:
            r0.c()
            goto L1b0
        L26e:
            h3.a r4 = r3.f14465a
            if (r4 == 0) goto L295
            h3.b r5 = r3.f14466b
            if (r5 == 0) goto L295
            h3.b r11 = r3.f14467c
            if (r11 == 0) goto L295
            r45 = r4
            h3.b r4 = r3.f14468d
            if (r4 == 0) goto L295
            h3.b r3 = r3.f14469e
            if (r3 == 0) goto L295
            L0.l r44 = new L0.l
            r49 = r3
            r48 = r4
            r46 = r5
            r47 = r11
            r44.<init>(r45, r46, r47, r48, r49)
            r30 = r44
            goto L119
        L295:
            r30 = 0
            goto L119
        L299:
            r0.e()
            goto L110
        L29e:
            r0.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.a(r2)
            goto Ld6
        L2b4:
            r42 = r2
            r43 = r3
            r0.b()
        L2bb:
            boolean r2 = r0.n()
            if (r2 == 0) goto L429
            Z.m r2 = l3.q.f14484b
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L410
            r5 = 1
            if (r2 == r5) goto L2d3
            r0.b0()
            r0.c0()
            goto L2bb
        L2d3:
            r0.a()
            boolean r2 = r0.n()
            if (r2 == 0) goto L3f8
            Z.m r2 = l3.AbstractC1228b.f14446a
            r0.b()
            r2 = 0
            r3 = 0
        L2e3:
            boolean r4 = r0.n()
            if (r4 == 0) goto L3e6
            Z.m r4 = l3.AbstractC1228b.f14446a
            int r4 = r0.a0(r4)
            if (r4 == 0) goto L34d
            r5 = 1
            if (r4 == r5) goto L2fb
            r0.b0()
            r0.c0()
            goto L2e3
        L2fb:
            r0.b()
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
        L308:
            boolean r2 = r0.n()
            if (r2 == 0) goto L342
            Z.m r2 = l3.AbstractC1228b.f14448c
            int r2 = r0.a0(r2)
            if (r2 == 0) goto L33d
            if (r2 == r5) goto L337
            r4 = 2
            if (r2 == r4) goto L332
            r4 = 3
            if (r2 == r4) goto L32d
            r4 = 4
            if (r2 == r4) goto L328
            r0.b0()
            r0.c0()
            goto L308
        L328:
            h3.a r49 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r50, r51)
            goto L308
        L32d:
            h3.b r48 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            goto L308
        L332:
            h3.b r47 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r1, r5)
            goto L308
        L337:
            h3.a r46 = com.google.android.gms.internal.measurement.AbstractC0836n2.G(r50, r51)
        L33b:
            r5 = 1
            goto L308
        L33d:
            h3.a r45 = com.google.android.gms.internal.measurement.AbstractC0836n2.G(r50, r51)
            goto L33b
        L342:
            r0.e()
            L0.l r44 = new L0.l
            r44.<init>(r45, r46, r47, r48, r49)
            r2 = r44
            goto L2e3
        L34d:
            r0.b()
            r3 = 0
            r4 = 0
            r5 = 0
            r11 = 0
        L354:
            boolean r34 = r0.n()
            if (r34 == 0) goto L3b2
            r34 = r4
            Z.m r4 = l3.AbstractC1228b.f14447b
            int r4 = r0.a0(r4)
            if (r4 == 0) goto L3ab
            r44 = r6
            r6 = 1
            if (r4 == r6) goto L3a6
            r6 = 2
            if (r4 == r6) goto L3a1
            r6 = 3
            if (r4 == r6) goto L37a
            r0.b0()
            r0.c0()
        L375:
            r4 = r34
            r6 = r44
            goto L354
        L37a:
            int r3 = r0.G()
            r4 = 1
            if (r3 == r4) goto L39b
            r6 = 2
            if (r3 == r6) goto L39b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r4 = "Unsupported text range units: "
            r6.<init>(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r1.a(r3)
            r4 = r34
            r6 = r44
            r3 = 2
            goto L354
        L39b:
            if (r3 != r4) goto L39f
            r3 = 1
            goto L375
        L39f:
            r3 = 2
            goto L375
        L3a1:
            h3.a r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r50, r51)
            goto L375
        L3a6:
            h3.a r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r50, r51)
            goto L375
        L3ab:
            r44 = r6
            h3.a r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r50, r51)
            goto L354
        L3b2:
            r34 = r4
            r44 = r6
            r0.e()
            if (r34 != 0) goto L3d5
            if (r5 == 0) goto L3d5
            h3.a r4 = new h3.a
            o3.a r6 = new o3.a
            r45 = r7
            r39 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r39)
            r6.<init>(r7)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r7 = 2
            r4.<init>(r7, r6)
            goto L3da
        L3d5:
            r45 = r7
            r7 = 2
            r4 = r34
        L3da:
            W1.d r6 = new W1.d
            r6.<init>(r4, r5, r11, r3)
            r3 = r6
            r6 = r44
            r7 = r45
            goto L2e3
        L3e6:
            r44 = r6
            r45 = r7
            r7 = 2
            r0.e()
            Z.m r4 = new Z.m
            r5 = 15
            r4.<init>(r5, r2, r3)
            r34 = r4
            goto L3fd
        L3f8:
            r44 = r6
            r45 = r7
            r7 = 2
        L3fd:
            boolean r2 = r0.n()
            if (r2 == 0) goto L407
            r0.c0()
            goto L3fd
        L407:
            r0.c()
            r6 = r44
        L40c:
            r7 = r45
            goto L2bb
        L410:
            r44 = r6
            r45 = r7
            r7 = 2
            h3.a r2 = new h3.a
            float r3 = n3.i.c()
            l3.h r4 = l3.h.f14462q
            r5 = 0
            java.util.ArrayList r3 = l3.p.a(r0, r1, r3, r4, r5)
            r4 = 6
            r2.<init>(r4, r3)
            r33 = r2
            goto L40c
        L429:
            r44 = r6
            r45 = r7
            r0.e()
            goto Ld6
        L432:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r0.a()
        L43d:
            boolean r2 = r0.n()
            if (r2 == 0) goto L44d
            i3.c r2 = l3.g.a(r50, r51)
            if (r2 == 0) goto L43d
            r9.add(r2)
            goto L43d
        L44d:
            r0.c()
            goto L71
        L452:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r7 = 2
            r0.a()
        L45e:
            boolean r2 = r0.n()
            if (r2 == 0) goto L544
            r0.b()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L46b:
            boolean r6 = r0.n()
            if (r6 == 0) goto L536
            java.lang.String r6 = r0.i0()
            r6.getClass()
            int r8 = r6.hashCode()
            switch(r8) {
                case 111: goto L4a3;
                case 3588: goto L498;
                case 104433: goto L48d;
                case 3357091: goto L482;
                default: goto L47f;
            }
        L47f:
            r8 = r38
            goto L4ad
        L482:
            java.lang.String r8 = "mode"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L48b
            goto L47f
        L48b:
            r8 = 3
            goto L4ad
        L48d:
            java.lang.String r8 = "inv"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L496
            goto L47f
        L496:
            r8 = r7
            goto L4ad
        L498:
            java.lang.String r8 = "pt"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L4a1
            goto L47f
        L4a1:
            r8 = 1
            goto L4ad
        L4a3:
            java.lang.String r8 = "o"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L4ac
            goto L47f
        L4ac:
            r8 = 0
        L4ad:
            switch(r8) {
                case 0: goto L52f;
                case 1: goto L51c;
                case 2: goto L517;
                case 3: goto L4b5;
                default: goto L4b0;
            }
        L4b0:
            r0.c0()
        L4b3:
            r11 = 0
            goto L46b
        L4b5:
            java.lang.String r4 = r0.K()
            r4.getClass()
            int r8 = r4.hashCode()
            switch(r8) {
                case 97: goto L4e7;
                case 105: goto L4dc;
                case 110: goto L4d1;
                case 115: goto L4c6;
                default: goto L4c3;
            }
        L4c3:
            r4 = r38
            goto L4f1
        L4c6:
            java.lang.String r8 = "s"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L4cf
            goto L4c3
        L4cf:
            r4 = 3
            goto L4f1
        L4d1:
            java.lang.String r8 = "n"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L4da
            goto L4c3
        L4da:
            r4 = r7
            goto L4f1
        L4dc:
            java.lang.String r8 = "i"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L4e5
            goto L4c3
        L4e5:
            r4 = 1
            goto L4f1
        L4e7:
            java.lang.String r8 = "a"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L4f0
            goto L4c3
        L4f0:
            r4 = 0
        L4f1:
            switch(r4) {
                case 0: goto L50a;
                case 1: goto L510;
                case 2: goto L50e;
                case 3: goto L50c;
                default: goto L4f4;
            }
        L4f4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Unknown mask mode "
            r4.<init>(r8)
            r4.append(r6)
            java.lang.String r6 = ". Defaulting to Add."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            n3.c.b(r4)
        L50a:
            r4 = 1
            goto L4b3
        L50c:
            r4 = r7
            goto L4b3
        L50e:
            r4 = 4
            goto L4b3
        L510:
            java.lang.String r4 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r1.a(r4)
            r4 = 3
            goto L4b3
        L517:
            boolean r2 = r0.v()
            goto L4b3
        L51c:
            h3.a r3 = new h3.a
            float r6 = n3.i.c()
            l3.x r8 = l3.x.f14495q
            r11 = 0
            java.util.ArrayList r6 = l3.p.a(r0, r1, r6, r8, r11)
            r8 = 5
            r3.<init>(r8, r6)
            goto L46b
        L52f:
            r11 = 0
            h3.a r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r50, r51)
            goto L46b
        L536:
            r11 = 0
            r0.e()
            i3.g r6 = new i3.g
            r6.<init>(r4, r3, r5, r2)
            r10.add(r6)
            goto L45e
        L544:
            r11 = 0
            int r2 = r10.size()
            int r3 = r1.f8845p
            int r3 = r3 + r2
            r1.f8845p = r3
            r0.c()
            goto L579
        L552:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            int r2 = r0.G()
            r40 = 6
            int[] r3 = O.c.b(r40)
            int r3 = r3.length
            if (r2 < r3) goto L583
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unsupported matte type: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.a(r2)
        L579:
            r2 = r42
            r3 = r43
            r6 = r44
            r7 = r45
            goto L52
        L583:
            int[] r3 = O.c.b(r40)
            r31 = r3[r2]
            int r2 = O.c.a(r31)
            r4 = 3
            if (r2 == r4) goto L59a
            r4 = 4
            if (r2 == r4) goto L594
            goto L59f
        L594:
            java.lang.String r2 = "Unsupported matte type: Luma Inverted"
            r1.a(r2)
            goto L59f
        L59a:
            java.lang.String r2 = "Unsupported matte type: Luma"
            r1.a(r2)
        L59f:
            int r2 = r1.f8845p
            r41 = 1
            int r2 = r2 + 1
            r1.f8845p = r2
            goto L579
        L5a8:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            h3.d r19 = l3.AbstractC1229c.a(r50, r51)
            goto L52
        L5b9:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            java.lang.String r2 = r0.K()
            int r24 = android.graphics.Color.parseColor(r2)
        L5cc:
            r2 = r42
            goto L52
        L5d0:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            int r2 = r0.G()
            float r2 = (float) r2
            float r3 = n3.i.c()
            float r3 = r3 * r2
            int r2 = (int) r3
            r23 = r2
            goto Ld6
        L5ea:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            int r2 = r0.G()
            float r2 = (float) r2
            float r3 = n3.i.c()
            float r3 = r3 * r2
            int r2 = (int) r3
            r22 = r2
            goto Ld6
        L604:
            r42 = r2
            r43 = r3
            r44 = r6
            r11 = 0
            r41 = 1
            int r2 = r0.G()
            long r7 = (long) r2
            goto L5cc
        L613:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            int r2 = r0.G()
            r20 = 7
            r4 = 6
            if (r2 >= r4) goto L579
            int[] r3 = O.c.b(r20)
            r20 = r3[r2]
            goto L579
        L62f:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            java.lang.String r21 = r0.K()
            goto L52
        L640:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            int r2 = r0.G()
            long r13 = (long) r2
            goto L5cc
        L652:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r11 = 0
            r41 = 1
            java.lang.String r12 = r0.K()
            goto L52
        L663:
            r42 = r2
            r43 = r3
            r44 = r6
            r45 = r7
            r0.e()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = (r17 > r36 ? 1 : (r17 == r36 ? 0 : -1))
            if (r0 <= 0) goto L68e
            o3.a r0 = new o3.a
            r5 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r17)
            r4 = 0
            r3 = r42
            r2 = r42
            r11 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.add(r0)
            goto L692
        L68e:
            r11 = r43
            r8 = r44
        L692:
            int r0 = (r18 > r36 ? 1 : (r18 == r36 ? 0 : -1))
            if (r0 <= 0) goto L697
            goto L69b
        L697:
            float r0 = r1.f8842m
            r18 = r0
        L69b:
            o3.a r0 = new o3.a
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r18)
            r3 = r16
            r2 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.add(r0)
            o3.a r0 = new o3.a
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r3 = r42
            r1 = r51
            r5 = r18
            r2 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.add(r0)
            java.lang.String r0 = ".ai"
            boolean r0 = r12.endsWith(r0)
            if (r0 != 0) goto L6d5
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L6da
        L6d5:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r1.a(r0)
        L6da:
            if (r8 == 0) goto L6e9
            if (r19 != 0) goto L6e3
            h3.d r19 = new h3.d
            r19.<init>()
        L6e3:
            r0 = r19
            r0.j = r8
            r11 = r0
            goto L6eb
        L6e9:
            r11 = r19
        L6eb:
            j3.e r0 = new j3.e
            r2 = r1
            r1 = r9
            r3 = r12
            r4 = r13
            r6 = r20
            r9 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r17 = r25
            r18 = r26
            r16 = r27
            r24 = r28
            r25 = r29
            r26 = r30
            r22 = r31
            r27 = r32
            r19 = r33
            r20 = r34
            r23 = r35
            r21 = r7
            r7 = r45
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.q.a(m3.b, a3.k):j3.e");
    }
}
