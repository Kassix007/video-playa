package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC0865t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f10598b = new B0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f10599c = new B0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f10600d = new B0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0 f10601e = new B0(3);
    public static final B0 f = new B0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B0 f10602g = new B0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B0 f10603h = new B0(6);
    public static final B0 i = new B0(7);
    public static final B0 j = new B0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B0 f10604k = new B0(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final B0 f10605l = new B0(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B0 f10606m = new B0(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final B0 f10607n = new B0(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B0 f10608o = new B0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10609a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.measurement.B0.<clinit>():void] */
    public /* synthetic */ B0(int i7) {
        this.f10609a = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC0865t2
    public final boolean a(int r3) {
        /*
            r2 = this;
            int r0 = r2.f10609a
            switch(r0) {
                case 0: goto La3;
                case 1: goto L9c;
                case 2: goto L92;
                case 3: goto L88;
                case 4: goto L7e;
                case 5: goto L6b;
                case 6: goto L5b;
                case 7: goto L51;
                case 8: goto L4a;
                case 9: goto L42;
                case 10: goto L38;
                case 11: goto L25;
                case 12: goto L15;
                default: goto L5;
            }
        L5:
            r0 = 1
            if (r3 == 0) goto L14
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto L14
            r1 = 3
            if (r3 == r1) goto L14
            r1 = 4
            if (r3 == r1) goto L14
            r0 = 0
        L14:
            return r0
        L15:
            r0 = 1
            if (r3 == 0) goto L24
            if (r3 == r0) goto L24
            r1 = 2
            if (r3 == r1) goto L24
            r1 = 3
            if (r3 == r1) goto L24
            r1 = 4
            if (r3 == r1) goto L24
            r0 = 0
        L24:
            return r0
        L25:
            r0 = 1
            if (r3 == 0) goto L37
            if (r3 == r0) goto L37
            r1 = 2
            if (r3 == r1) goto L37
            r1 = 3
            if (r3 == r1) goto L37
            r1 = 4
            if (r3 == r1) goto L37
            r1 = 5
            if (r3 == r1) goto L37
            r0 = 0
        L37:
            return r0
        L38:
            int r3 = C0.S.d(r3)
            if (r3 == 0) goto L40
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            return r3
        L42:
            r0 = 1
            if (r3 == r0) goto L49
            r1 = 2
            if (r3 == r1) goto L49
            r0 = 0
        L49:
            return r0
        L4a:
            r0 = 1
            if (r3 == 0) goto L50
            if (r3 == r0) goto L50
            r0 = 0
        L50:
            return r0
        L51:
            r0 = 1
            if (r3 == 0) goto L5a
            if (r3 == r0) goto L5a
            r1 = 2
            if (r3 == r1) goto L5a
            r0 = 0
        L5a:
            return r0
        L5b:
            r0 = 1
            if (r3 == 0) goto L6a
            if (r3 == r0) goto L6a
            r1 = 2
            if (r3 == r1) goto L6a
            r1 = 3
            if (r3 == r1) goto L6a
            r1 = 4
            if (r3 == r1) goto L6a
            r0 = 0
        L6a:
            return r0
        L6b:
            r0 = 1
            if (r3 == 0) goto L7d
            if (r3 == r0) goto L7d
            r1 = 2
            if (r3 == r1) goto L7d
            r1 = 3
            if (r3 == r1) goto L7d
            r1 = 4
            if (r3 == r1) goto L7d
            r1 = 5
            if (r3 == r1) goto L7d
            r0 = 0
        L7d:
            return r0
        L7e:
            r0 = 1
            if (r3 == 0) goto L87
            if (r3 == r0) goto L87
            r1 = 2
            if (r3 == r1) goto L87
            r0 = 0
        L87:
            return r0
        L88:
            int r3 = a.AbstractC0597a.W(r3)
            if (r3 == 0) goto L90
            r3 = 1
            goto L91
        L90:
            r3 = 0
        L91:
            return r3
        L92:
            r0 = 1
            if (r3 == 0) goto L9b
            if (r3 == r0) goto L9b
            r1 = 2
            if (r3 == r1) goto L9b
            r0 = 0
        L9b:
            return r0
        L9c:
            switch(r3) {
                case 0: goto La1;
                case 1: goto La1;
                case 2: goto La1;
                case 3: goto La1;
                case 4: goto La1;
                case 5: goto La1;
                case 6: goto La1;
                default: goto L9f;
            }
        L9f:
            r3 = 0
            goto La2
        La1:
            r3 = 1
        La2:
            return r3
        La3:
            r0 = 1
            if (r3 == 0) goto Lb2
            if (r3 == r0) goto Lb2
            r1 = 2
            if (r3 == r1) goto Lb2
            r1 = 3
            if (r3 == r1) goto Lb2
            r1 = 4
            if (r3 == r1) goto Lb2
            r0 = 0
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B0.a(int):boolean");
    }
}
