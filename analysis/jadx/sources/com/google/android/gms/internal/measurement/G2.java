package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0862t f10637a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G2(EnumC0802g3 enumC0802g3, EnumC0802g3 enumC0802g32) {
        this.f10637a = new C0862t(enumC0802g3, enumC0802g32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(C0801g2 c0801g2, C0862t c0862t, Object obj, Object obj2) throws com.google.android.gms.internal.clearcut.m0 {
        C0821k2.b(c0801g2, (EnumC0802g3) c0862t.f11033a, 1, obj);
        C0821k2.b(c0801g2, (EnumC0802g3) c0862t.f11034b, 2, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(com.google.android.gms.internal.measurement.C0862t r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            java.lang.Object r0 = r12.f11033a
            com.google.android.gms.internal.measurement.g3 r0 = (com.google.android.gms.internal.measurement.EnumC0802g3) r0
            java.lang.Object r12 = r12.f11034b
            com.google.android.gms.internal.measurement.g3 r12 = (com.google.android.gms.internal.measurement.EnumC0802g3) r12
            int r1 = com.google.android.gms.internal.measurement.C0821k2.f10885c
            r1 = 8
            int r2 = com.google.android.gms.internal.measurement.C0801g2.u0(r1)
            com.google.android.gms.internal.measurement.g3 r3 = com.google.android.gms.internal.measurement.EnumC0802g3.f10850t
            if (r0 != r3) goto L1a
            r4 = r13
            com.google.android.gms.internal.measurement.Y1 r4 = (com.google.android.gms.internal.measurement.Y1) r4
            java.nio.charset.Charset r4 = com.google.android.gms.internal.measurement.AbstractC0885x2.f11122a
            int r2 = r2 + r2
        L1a:
            com.google.android.gms.internal.measurement.h3 r4 = com.google.android.gms.internal.measurement.EnumC0807h3.f10860q
            int r0 = r0.ordinal()
            r4 = 1
            r5 = 63
            java.lang.String r6 = "There is no way to get here, but the compiler thinks otherwise."
            r7 = 4
            switch(r0) {
                case 0: goto L10c;
                case 1: goto L105;
                case 2: goto Lfa;
                case 3: goto Lef;
                case 4: goto Le3;
                case 5: goto Ldc;
                case 6: goto Ld6;
                case 7: goto Lcf;
                case 8: goto Lb9;
                case 9: goto Lb0;
                case 10: goto La3;
                case 11: goto L8a;
                case 12: goto L7e;
                case 13: goto L60;
                case 14: goto L58;
                case 15: goto L50;
                case 16: goto L3f;
                case 17: goto L2f;
                default: goto L29;
            }
        L29:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r6)
            throw r12
        L2f:
            java.lang.Long r13 = (java.lang.Long) r13
            long r8 = r13.longValue()
            long r10 = r8 + r8
            long r8 = r8 >> r5
            long r8 = r8 ^ r10
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        L3f:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r0 = r13 + r13
            int r13 = r13 >> 31
            r13 = r13 ^ r0
            int r13 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
            goto L113
        L50:
            java.lang.Long r13 = (java.lang.Long) r13
            r13.getClass()
        L55:
            r13 = r1
            goto L113
        L58:
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
        L5d:
            r13 = r7
            goto L113
        L60:
            boolean r0 = r13 instanceof com.google.android.gms.internal.measurement.InterfaceC0860s2
            if (r0 == 0) goto L71
            com.google.android.gms.internal.measurement.s2 r13 = (com.google.android.gms.internal.measurement.InterfaceC0860s2) r13
            int r13 = r13.zza()
            long r8 = (long) r13
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        L71:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            long r8 = (long) r13
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        L7e:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r13 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
            goto L113
        L8a:
            boolean r0 = r13 instanceof com.google.android.gms.internal.measurement.C0796f2
            if (r0 == 0) goto L9b
            com.google.android.gms.internal.measurement.f2 r13 = (com.google.android.gms.internal.measurement.C0796f2) r13
            int r13 = r13.h()
            int r0 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
        L98:
            int r13 = r13 + r0
            goto L113
        L9b:
            byte[] r13 = (byte[]) r13
            int r13 = r13.length
            int r0 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
            goto L98
        La3:
            com.google.android.gms.internal.measurement.Y1 r13 = (com.google.android.gms.internal.measurement.Y1) r13
            com.google.android.gms.internal.measurement.q2 r13 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r13
            int r13 = r13.k()
            int r0 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
            goto L98
        Lb0:
            com.google.android.gms.internal.measurement.Y1 r13 = (com.google.android.gms.internal.measurement.Y1) r13
            com.google.android.gms.internal.measurement.q2 r13 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r13
            int r13 = r13.k()
            goto L113
        Lb9:
            boolean r0 = r13 instanceof com.google.android.gms.internal.measurement.C0796f2
            if (r0 == 0) goto Lc8
            com.google.android.gms.internal.measurement.f2 r13 = (com.google.android.gms.internal.measurement.C0796f2) r13
            int r13 = r13.h()
            int r0 = com.google.android.gms.internal.measurement.C0801g2.u0(r13)
            goto L98
        Lc8:
            java.lang.String r13 = (java.lang.String) r13
            int r13 = com.google.android.gms.internal.measurement.C0801g2.d0(r13)
            goto L113
        Lcf:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r13.getClass()
            r13 = r4
            goto L113
        Ld6:
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            goto L5d
        Ldc:
            java.lang.Long r13 = (java.lang.Long) r13
            r13.getClass()
            goto L55
        Le3:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            long r8 = (long) r13
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        Lef:
            java.lang.Long r13 = (java.lang.Long) r13
            long r8 = r13.longValue()
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        Lfa:
            java.lang.Long r13 = (java.lang.Long) r13
            long r8 = r13.longValue()
            int r13 = com.google.android.gms.internal.measurement.C0801g2.c0(r8)
            goto L113
        L105:
            java.lang.Float r13 = (java.lang.Float) r13
            r13.getClass()
            goto L5d
        L10c:
            java.lang.Double r13 = (java.lang.Double) r13
            r13.getClass()
            goto L55
        L113:
            int r13 = r13 + r2
            r0 = 16
            int r0 = com.google.android.gms.internal.measurement.C0801g2.u0(r0)
            if (r12 != r3) goto L122
            r2 = r14
            com.google.android.gms.internal.measurement.Y1 r2 = (com.google.android.gms.internal.measurement.Y1) r2
            java.nio.charset.Charset r2 = com.google.android.gms.internal.measurement.AbstractC0885x2.f11122a
            int r0 = r0 + r0
        L122:
            int r12 = r12.ordinal()
            switch(r12) {
                case 0: goto L20b;
                case 1: goto L204;
                case 2: goto L1f9;
                case 3: goto L1ee;
                case 4: goto L1e2;
                case 5: goto L1dc;
                case 6: goto L1d6;
                case 7: goto L1cf;
                case 8: goto L1b9;
                case 9: goto L1b0;
                case 10: goto L1a3;
                case 11: goto L189;
                case 12: goto L17d;
                case 13: goto L15f;
                case 14: goto L157;
                case 15: goto L150;
                case 16: goto L13f;
                case 17: goto L12f;
                default: goto L129;
            }
        L129:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r6)
            throw r12
        L12f:
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            long r3 = r1 + r1
            long r1 = r1 >> r5
            long r1 = r1 ^ r3
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L13f:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r12 = r14.intValue()
            int r14 = r12 + r12
            int r12 = r12 >> 31
            r12 = r12 ^ r14
            int r1 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
            goto L210
        L150:
            java.lang.Long r14 = (java.lang.Long) r14
            r14.getClass()
            goto L210
        L157:
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
        L15c:
            r1 = r7
            goto L210
        L15f:
            boolean r12 = r14 instanceof com.google.android.gms.internal.measurement.InterfaceC0860s2
            if (r12 == 0) goto L170
            com.google.android.gms.internal.measurement.s2 r14 = (com.google.android.gms.internal.measurement.InterfaceC0860s2) r14
            int r12 = r14.zza()
            long r1 = (long) r12
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L170:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r12 = r14.intValue()
            long r1 = (long) r12
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L17d:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r12 = r14.intValue()
            int r1 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
            goto L210
        L189:
            boolean r12 = r14 instanceof com.google.android.gms.internal.measurement.C0796f2
            if (r12 == 0) goto L19b
            com.google.android.gms.internal.measurement.f2 r14 = (com.google.android.gms.internal.measurement.C0796f2) r14
            int r12 = r14.h()
            int r14 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
        L197:
            int r1 = r14 + r12
            goto L210
        L19b:
            byte[] r14 = (byte[]) r14
            int r12 = r14.length
            int r14 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
            goto L197
        L1a3:
            com.google.android.gms.internal.measurement.Y1 r14 = (com.google.android.gms.internal.measurement.Y1) r14
            com.google.android.gms.internal.measurement.q2 r14 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r14
            int r12 = r14.k()
            int r14 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
            goto L197
        L1b0:
            com.google.android.gms.internal.measurement.Y1 r14 = (com.google.android.gms.internal.measurement.Y1) r14
            com.google.android.gms.internal.measurement.q2 r14 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r14
            int r1 = r14.k()
            goto L210
        L1b9:
            boolean r12 = r14 instanceof com.google.android.gms.internal.measurement.C0796f2
            if (r12 == 0) goto L1c8
            com.google.android.gms.internal.measurement.f2 r14 = (com.google.android.gms.internal.measurement.C0796f2) r14
            int r12 = r14.h()
            int r14 = com.google.android.gms.internal.measurement.C0801g2.u0(r12)
            goto L197
        L1c8:
            java.lang.String r14 = (java.lang.String) r14
            int r1 = com.google.android.gms.internal.measurement.C0801g2.d0(r14)
            goto L210
        L1cf:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            r1 = r4
            goto L210
        L1d6:
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
            goto L15c
        L1dc:
            java.lang.Long r14 = (java.lang.Long) r14
            r14.getClass()
            goto L210
        L1e2:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r12 = r14.intValue()
            long r1 = (long) r12
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L1ee:
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L1f9:
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            int r1 = com.google.android.gms.internal.measurement.C0801g2.c0(r1)
            goto L210
        L204:
            java.lang.Float r14 = (java.lang.Float) r14
            r14.getClass()
            goto L15c
        L20b:
            java.lang.Double r14 = (java.lang.Double) r14
            r14.getClass()
        L210:
            int r1 = r1 + r0
            int r1 = r1 + r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.G2.b(com.google.android.gms.internal.measurement.t, java.lang.Object, java.lang.Object):int");
    }
}
