package W1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8051u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f8047q = i;
        this.f8048r = obj;
        this.f8049s = obj2;
        this.f8050t = obj3;
        this.f8051u = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0854 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r41) {
        /*
            r40 = this;
            r1 = r40
            int r0 = r1.f8047q
            java.lang.String r2 = ""
            r3 = 2
            r5 = 0
            m5.y r6 = m5.C1386y.f15098a
            r7 = 1
            java.lang.Object r8 = r1.f8051u
            java.lang.Object r9 = r1.f8050t
            java.lang.Object r10 = r1.f8049s
            java.lang.Object r11 = r1.f8048r
            switch(r0) {
                case 0: goto L878;
                case 1: goto L112;
                case 2: goto Lad;
                case 3: goto L48;
                default: goto L16;
            }
        L16:
            a0.q r11 = (a0.q) r11
            R4.k1 r10 = (R4.C0468k1) r10
            P.W r9 = (P.W) r9
            P.W r8 = (P.W) r8
            r0 = r41
            C.g r0 = (C.g) r0
            java.lang.String r2 = "$this$LazyColumn"
            kotlin.jvm.internal.m.e(r0, r2)
            int r2 = r11.size()
            a5.w r3 = new a5.w
            r3.<init>(r7, r11)
            e5.i r4 = new e5.i
            r4.<init>(r11, r10, r9, r8)
            X.e r5 = new X.e
            r8 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            r5.<init>(r8, r7, r4)
            E.Y r0 = r0.f602b
            C.f r4 = new C.f
            r4.<init>(r3, r5)
            r0.a(r2, r4)
            return r6
        L48:
            kotlin.jvm.internal.y r11 = (kotlin.jvm.internal.y) r11
            kotlin.jvm.internal.y r10 = (kotlin.jvm.internal.y) r10
            a5.y r9 = (a5.y) r9
            kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
            r0 = r41
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r2 = r0.orientation
            java.lang.Object r4 = r11.f14268q
            if (r4 == 0) goto L95
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r2) goto L95
            java.lang.Object r4 = r10.f14268q
            P.S0 r4 = (P.S0) r4
            if (r4 == 0) goto L95
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r7) goto L95
            r9.c(r5)
            int r0 = r0.orientation
            if (r0 != r3) goto L7f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.f14268q = r0
        L7f:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            C0.m r3 = new C0.m
            r4 = 9
            r3.<init>(r4, r9)
            r4 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r3, r4)
            goto La6
        L95:
            java.lang.Object r0 = r8.f14268q
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 == 0) goto La6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.f14268q = r0
            r9.c(r7)
        La6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r11.f14268q = r0
            return r6
        Lad:
            P.W r11 = (P.W) r11
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            Z4.M r9 = (Z4.M) r9
            P.W r8 = (P.W) r8
            r0 = r41
            i0.b r0 = (i0.C1130b) r0
            float r0 = Z4.L.f8475a
            java.lang.Object r0 = r11.getValue()
            Z4.o r0 = (Z4.o) r0
            if (r0 == 0) goto Lce
            Z4.c r0 = r0.f8499b
            if (r0 == 0) goto Lce
            Z4.i r0 = r0.f8484b
            if (r0 == 0) goto Lce
            java.lang.String r0 = r0.f8493c
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            if (r0 == 0) goto Ld7
            int r0 = r0.length()
            if (r0 != 0) goto L111
        Ld7:
            java.lang.Object r0 = r11.getValue()
            Z4.o r0 = (Z4.o) r0
            if (r0 == 0) goto Le6
            Z4.c r0 = r0.f8499b
            if (r0 == 0) goto Le6
            java.lang.String r4 = r0.f8483a
            goto Le7
        Le6:
            r4 = 0
        Le7:
            if (r4 == 0) goto L111
            int r0 = r4.length()
            if (r0 != 0) goto Lf0
            goto L111
        Lf0:
            java.lang.Object r0 = r11.getValue()
            Z4.o r0 = (Z4.o) r0
            kotlin.jvm.internal.m.b(r0)
            Z4.c r0 = r0.f8499b
            kotlin.jvm.internal.m.b(r0)
            java.lang.String r0 = r0.f8483a
            if (r0 == 0) goto L111
            if (r10 == 0) goto L107
            r10.loadUrl(r0)
        L107:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.setValue(r0)
            if (r9 == 0) goto L111
            r9.d(r2)
        L111:
            return r6
        L112:
            java.lang.String r12 = "md"
            R4.k1 r11 = (R4.C0468k1) r11
            P.c0 r10 = (P.C0348c0) r10
            P.W r9 = (P.W) r9
            P.W r8 = (P.W) r8
            r0 = r41
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L126
        L122:
            r22 = r6
            goto L877
        L126:
            int r0 = r0.intValue()
            r13 = 100
            if (r0 != r13) goto L122
            android.webkit.WebView r0 = r11.f7084k
            j5.d r13 = r11.f7098t
            R4.i r14 = r11.f7073d
            if (r0 == 0) goto L122
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L122
            if (r14 == 0) goto L145
            R4.J2 r15 = r14.f7002e
            if (r15 == 0) goto L145
            java.util.List r15 = r15.f6782b
            goto L146
        L145:
            r15 = 0
        L146:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r20 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r15 == 0) goto L1da
            r17 = r15
            java.util.Collection r17 = (java.util.Collection) r17
            int r7 = r17.size()
        L15c:
            if (r5 >= r7) goto L1da
            java.lang.Object r17 = r15.get(r5)
            r1 = r17
            R4.M2 r1 = (R4.M2) r1
            if (r1 == 0) goto L16b
            java.lang.String r1 = r1.f6799a
            goto L16d
        L16b:
            r1 = r20
        L16d:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.add(r1)
            java.lang.Object r1 = r15.get(r5)
            R4.M2 r1 = (R4.M2) r1
            if (r1 == 0) goto L181
            java.util.List r1 = r1.f6800b
        L17e:
            r17 = r5
            goto L184
        L181:
            r1 = r20
            goto L17e
        L184:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r1 == 0) goto L1ca
            r18 = r1
            java.util.Collection r18 = (java.util.Collection) r18
            r22 = r6
            int r6 = r18.size()
            r41 = r7
            r7 = 0
        L198:
            if (r7 >= r6) goto L1ce
            java.lang.Object r18 = r1.get(r7)
            r19 = r6
            r6 = r18
            R4.n1 r6 = (R4.C0480n1) r6
            if (r6 == 0) goto L1a9
            java.lang.String r6 = r6.f7136a
            goto L1ab
        L1a9:
            r6 = r20
        L1ab:
            java.lang.Object r18 = r1.get(r7)
            r23 = r1
            r1 = r18
            R4.n1 r1 = (R4.C0480n1) r1
            if (r1 == 0) goto L1ba
            java.lang.String r1 = r1.f7137b
            goto L1bc
        L1ba:
            r1 = r20
        L1bc:
            if (r6 == 0) goto L1c3
            if (r1 == 0) goto L1c3
            r5.put(r6, r1)
        L1c3:
            int r7 = r7 + 1
            r6 = r19
            r1 = r23
            goto L198
        L1ca:
            r22 = r6
            r41 = r7
        L1ce:
            r4.add(r5)
            int r5 = r17 + 1
            r1 = r40
            r7 = r41
            r6 = r22
            goto L15c
        L1da:
            r22 = r6
            int r1 = r3.size()
            r5 = 0
            r6 = 0
        L1e2:
            if (r6 >= r1) goto L295
            java.lang.Object r15 = r3.get(r6)
            int r6 = r6 + 1
            int r17 = r5 + 1
            if (r5 < 0) goto L291
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r7 = "pattern"
            kotlin.jvm.internal.m.e(r15, r7)
            r7 = 66
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r15, r7)
            java.lang.String r15 = "compile(...)"
            kotlin.jvm.internal.m.d(r7, r15)
            boolean r15 = r4.isEmpty()
            if (r15 != 0) goto L26c
            java.lang.Object r15 = r4.get(r5)
            r18 = r1
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.m.d(r15, r1)
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.util.Set r1 = r15.keySet()
            r19 = r3
            java.lang.String r3 = "<get-keys>(...)"
            kotlin.jvm.internal.m.d(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = n5.l.B0(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L22a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L269
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r23 = r15.get(r3)
            r24 = r1
            r1 = r23
            java.lang.String r1 = (java.lang.String) r1
            r23 = r4
            java.lang.String r4 = "exact"
            boolean r4 = kotlin.jvm.internal.m.a(r1, r4)
            if (r4 == 0) goto L251
            boolean r4 = r0.equals(r3)
            if (r4 == 0) goto L251
            goto L296
        L251:
            java.lang.String r4 = "start"
            boolean r1 = kotlin.jvm.internal.m.a(r1, r4)
            if (r1 == 0) goto L264
            kotlin.jvm.internal.m.b(r3)
            r1 = 0
            boolean r3 = J5.t.G0(r0, r3, r1)
            if (r3 == 0) goto L264
            goto L296
        L264:
            r4 = r23
            r1 = r24
            goto L22a
        L269:
            r23 = r4
            goto L271
        L26c:
            r18 = r1
            r19 = r3
            goto L269
        L271:
            java.util.regex.Matcher r1 = r7.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L287
            java.lang.String r0 = "the check is current "
            java.lang.String r0 = k1.i.i(r5, r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L296
        L287:
            r5 = r17
            r1 = r18
            r3 = r19
            r4 = r23
            goto L1e2
        L291:
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            throw r20
        L295:
            r5 = -1
        L296:
            r10.f(r5)
            int r0 = r10.e()
            r1 = -1
            if (r0 == r1) goto L2a2
            r0 = 1
            goto L2a3
        L2a2:
            r0 = 0
        L2a3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.setValue(r0)
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L86a
            b4.e r0 = r11.f7101w
            if (r0 == 0) goto L86a
            java.lang.String r3 = r11.f7102x
            if (r3 != 0) goto L86a
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L2c7
            r0.clear()
        L2c7:
            r3 = 1
            r13.d(r3)
            if (r14 == 0) goto L2d4
            R4.J2 r0 = r14.f7002e
            if (r0 == 0) goto L2d4
            java.util.List r0 = r0.f6782b
            goto L2d6
        L2d4:
            r0 = r20
        L2d6:
            kotlin.jvm.internal.m.b(r0)
            int r3 = r10.e()
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.m.b(r0)
            R4.M2 r0 = (R4.M2) r0
            java.lang.String r0 = r0.f6802d
            kotlin.jvm.internal.m.b(r0)
            r8.setValue(r0)
            int r0 = r10.e()
            b4.e r3 = r11.f7101w
            kotlin.jvm.internal.m.b(r3)
            if (r14 == 0) goto L877
            R4.J2 r4 = r14.f7002e
            if (r4 == 0) goto L877
            java.util.List r4 = r4.f6782b
            if (r4 == 0) goto L877
            kotlin.jvm.internal.w r5 = new kotlin.jvm.internal.w
            r5.<init>()
            r6 = -1
            r5.f14266q = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = r4.get(r0)
            R4.M2 r0 = (R4.M2) r0
            if (r0 == 0) goto L319
            java.util.List r4 = r0.f
            goto L31b
        L319:
            r4 = r20
        L31b:
            if (r0 == 0) goto L320
            java.lang.Integer r7 = r0.j
            goto L322
        L320:
            r7 = r20
        L322:
            if (r7 == 0) goto L877
            java.lang.String r7 = r0.i
            java.lang.String r8 = r0.f6807l
            java.lang.String r9 = r0.f6806k
            java.lang.String r10 = r0.f6803e
            int r7 = android.graphics.Color.parseColor(r7)
            int r13 = android.graphics.Color.parseColor(r10)
            if (r9 == 0) goto L341
            boolean r14 = r9.equals(r2)
            if (r14 != 0) goto L341
            int r9 = android.graphics.Color.parseColor(r9)
            goto L345
        L341:
            int r9 = android.graphics.Color.parseColor(r10)
        L345:
            if (r8 == 0) goto L352
            boolean r10 = r8.equals(r2)
            if (r10 != 0) goto L352
            int r8 = android.graphics.Color.parseColor(r8)
            goto L358
        L352:
            java.lang.String r8 = r0.i
            int r8 = android.graphics.Color.parseColor(r8)
        L358:
            r10 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r10 = new int[]{r10}
            r14 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r14 = new int[]{r14}
            int[][] r10 = new int[][]{r10, r14}
            android.content.res.ColorStateList r15 = new android.content.res.ColorStateList
            int[] r8 = new int[]{r8, r7}
            r15.<init>(r10, r8)
            android.content.res.ColorStateList r8 = new android.content.res.ColorStateList
            int[] r9 = new int[]{r9, r13}
            r8.<init>(r10, r9)
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            int[] r7 = new int[]{r7, r7}
            r9.<init>(r10, r7)
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            int[] r13 = new int[]{r13, r13}
            r7.<init>(r10, r13)
            r10 = 1
            r3.setBottom(r10)
            java.lang.Integer r10 = r0.j
            int r13 = r10.intValue()
            r14 = 56
            if (r13 >= r14) goto L3a0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
        L3a0:
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            int r10 = r10.intValue()
            float r10 = (float) r10
            android.content.res.Resources r14 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r10 = r10 * r14
            int r10 = (int) r10
            r14 = -1
            r13.<init>(r14, r10)
            r3.setLayoutParams(r13)
            java.lang.String r0 = r0.f6802d
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setBackgroundColor(r0)
            r3.setItemTextColor(r9)
            r3.setItemIconTintList(r7)
            android.view.Menu r7 = r3.getMenu()
            java.lang.String r0 = "getMenu(...)"
            kotlin.jvm.internal.m.d(r7, r0)
            r7.clear()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r10 = "substring(...)"
            if (r4 == 0) goto L6de
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
            r13 = 0
        L3e6:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L6d2
            java.lang.Object r14 = r4.next()
            int r1 = r13 + 1
            if (r13 < 0) goto L6cc
            R4.S2 r14 = (R4.S2) r14
            if (r14 == 0) goto L6a6
            java.lang.String r13 = r14.f6854c
            r17 = r4
            java.lang.String r4 = r14.f6852a
            java.lang.String r14 = r14.f6853b
            r19 = r5
            r5 = 1
            boolean r18 = J5.t.B0(r13, r2, r5)
            if (r18 == 0) goto L40d
            r18 = 0
        L40b:
            r5 = 0
            goto L410
        L40d:
            r18 = r0
            goto L40b
        L410:
            android.view.MenuItem r13 = r7.add(r5, r1, r5, r13)
            com.web2native.MainActivity r5 = r11.f7067a
            java.lang.String r0 = "fas fa-"
            r29 = r1
            java.lang.String r1 = ".png"
            r30 = r7
            java.lang.String r7 = "fonts/phosphor_"
            r31 = r8
            java.lang.String r8 = "file:///android_asset/"
            kotlin.jvm.internal.y r27 = new kotlin.jvm.internal.y
            r27.<init>()
            if (r14 == 0) goto L679
            r32 = r11
            java.lang.String r11 = "img-"
            r33 = r15
            r15 = 0
            boolean r11 = J5.t.G0(r14, r11, r15)     // Catch: java.lang.Exception -> L661
            java.lang.String r15 = "open(...)"
            if (r11 == 0) goto L501
            java.lang.String r0 = C3.a.w(r5, r14)     // Catch: java.lang.Exception -> L4e5
            if (r0 == 0) goto L4fe
            java.lang.String r1 = ".svg"
            boolean r1 = J5.m.K0(r0, r1)     // Catch: java.lang.Exception -> L4e5
            if (r1 == 0) goto L4e9
            E.c0 r1 = new E.c0     // Catch: java.lang.Exception -> L4e5
            r1.<init>()     // Catch: java.lang.Exception -> L4e5
            android.content.Context r7 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L4e5
            r1.f1552q = r7     // Catch: java.lang.Exception -> L4e5
            U2.e r7 = U2.e.f7641o     // Catch: java.lang.Exception -> L4e5
            r1.f1553r = r7     // Catch: java.lang.Exception -> L4e5
            r7 = r20
            r1.f1554s = r7     // Catch: java.lang.Exception -> L4e5
            I2.k r7 = new I2.k     // Catch: java.lang.Exception -> L4e5
            r7.<init>()     // Catch: java.lang.Exception -> L4e5
            r1.f1555t = r7     // Catch: java.lang.Exception -> L4e5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e5
            r7.<init>()     // Catch: java.lang.Exception -> L4e5
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e5
            r11.<init>()     // Catch: java.lang.Exception -> L4e5
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e5
            r14.<init>()     // Catch: java.lang.Exception -> L4e5
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e5
            r15.<init>()     // Catch: java.lang.Exception -> L4e5
            r23 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e5
            r7.<init>()     // Catch: java.lang.Exception -> L4e5
            r24 = r11
            W2.c r11 = new W2.c     // Catch: java.lang.Exception -> L4e5
            r11.<init>()     // Catch: java.lang.Exception -> L4e5
            r25 = r14
            I2.c r14 = new I2.c     // Catch: java.lang.Exception -> L4e5
            r26 = r15
            r15 = 0
            r14.<init>(r11, r15)     // Catch: java.lang.Exception -> L4e5
            r7.add(r14)     // Catch: java.lang.Exception -> L4e5
            I2.g r34 = new I2.g     // Catch: java.lang.Exception -> L4e5
            java.util.List r35 = n5.AbstractC1397A.E(r23)     // Catch: java.lang.Exception -> L4e5
            java.util.List r36 = n5.AbstractC1397A.E(r24)     // Catch: java.lang.Exception -> L4e5
            java.util.List r37 = n5.AbstractC1397A.E(r25)     // Catch: java.lang.Exception -> L4e5
            java.util.List r38 = n5.AbstractC1397A.E(r26)     // Catch: java.lang.Exception -> L4e5
            java.util.List r39 = n5.AbstractC1397A.E(r7)     // Catch: java.lang.Exception -> L4e5
            r34.<init>(r35, r36, r37, r38, r39)     // Catch: java.lang.Exception -> L4e5
            r7 = r34
            r1.f1554s = r7     // Catch: java.lang.Exception -> L4e5
            I2.y r24 = r1.d()     // Catch: java.lang.Exception -> L4e5
            U2.d r1 = new U2.d     // Catch: java.lang.Exception -> L4e5
            r1.<init>(r5)     // Catch: java.lang.Exception -> L4e5
            java.lang.String r0 = r8.concat(r0)     // Catch: java.lang.Exception -> L4e5
            r1.f7635c = r0     // Catch: java.lang.Exception -> L4e5
            U2.i.a(r1)     // Catch: java.lang.Exception -> L4e5
            U2.g r25 = r1.a()     // Catch: java.lang.Exception -> L4e5
            V4.a r23 = new V4.a     // Catch: java.lang.Exception -> L4e5
            r28 = 0
            r26 = r5
            r23.<init>(r24, r25, r26, r27, r28)     // Catch: java.lang.Exception -> L4e5
            r0 = r23
            r8 = r27
            r5.runOnUiThread(r0)     // Catch: java.lang.Exception -> L4dc
        L4d4:
            r24 = r3
            r25 = r4
            r23 = r6
            goto L685
        L4dc:
            r0 = move-exception
        L4dd:
            r24 = r3
            r25 = r4
        L4e1:
            r23 = r6
            goto L675
        L4e5:
            r0 = move-exception
            r8 = r27
            goto L4dd
        L4e9:
            r8 = r27
            android.content.res.AssetManager r1 = r5.getAssets()     // Catch: java.lang.Exception -> L4dc
            java.io.InputStream r0 = r1.open(r0)     // Catch: java.lang.Exception -> L4dc
            kotlin.jvm.internal.m.d(r0, r15)     // Catch: java.lang.Exception -> L4dc
            r7 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r0, r7)     // Catch: java.lang.Exception -> L4dc
            r8.f14268q = r0     // Catch: java.lang.Exception -> L4dc
            goto L4d4
        L4fe:
            r8 = r27
            goto L4d4
        L501:
            r8 = r27
            java.lang.String r11 = "pi-"
            boolean r11 = J5.m.K0(r14, r11)     // Catch: java.lang.Exception -> L4dc
            r23 = r11
            java.lang.String r11 = "-"
            if (r23 == 0) goto L556
            java.lang.String[] r0 = new java.lang.String[]{r11}     // Catch: java.lang.Exception -> L4d4
            java.util.List r0 = J5.m.d1(r14, r0)     // Catch: java.lang.Exception -> L4d4
            r1 = 2
            java.lang.Object r11 = r0.get(r1)     // Catch: java.lang.Exception -> L4d4
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L4d4
            int r1 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L4d4
            char r1 = (char) r1     // Catch: java.lang.Exception -> L4d4
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L4d4
            r11 = 1
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Exception -> L4d4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d4
            r11.<init>(r7)     // Catch: java.lang.Exception -> L4d4
            r11.append(r0)     // Catch: java.lang.Exception -> L4d4
            java.lang.String r0 = ".ttf"
            r11.append(r0)     // Catch: java.lang.Exception -> L4d4
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> L4d4
            android.content.res.AssetManager r7 = r5.getAssets()     // Catch: java.lang.Exception -> L546
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r7, r0)     // Catch: java.lang.Exception -> L546
            goto L54b
        L546:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L4d4
            r0 = 0
        L54b:
            kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> L4d4
            android.graphics.drawable.BitmapDrawable r0 = C3.a.p(r5, r0, r1)     // Catch: java.lang.Exception -> L4d4
            r8.f14268q = r0     // Catch: java.lang.Exception -> L4d4
            goto L4d4
        L556:
            boolean r7 = J5.m.K0(r14, r0)     // Catch: java.lang.Exception -> L4dc
            r23 = r7
            java.lang.String r7 = "_"
            r24 = r3
            java.lang.String r3 = "far fa-"
            r25 = r4
            java.lang.String r4 = "fab fa-"
            if (r23 != 0) goto L574
            boolean r23 = J5.m.K0(r14, r4)     // Catch: java.lang.Exception -> L5fe
            if (r23 != 0) goto L574
            boolean r23 = J5.m.K0(r14, r3)     // Catch: java.lang.Exception -> L5fe
            if (r23 == 0) goto L578
        L574:
            r23 = r6
            goto L601
        L578:
            r23 = r6
            r6 = 0
            boolean r0 = J5.t.G0(r14, r12, r6)     // Catch: java.lang.Exception -> L5ae
            if (r0 != 0) goto L5b1
            java.lang.String r0 = "gmd"
            boolean r0 = J5.t.G0(r14, r0, r6)     // Catch: java.lang.Exception -> L5ae
            if (r0 == 0) goto L58b
            r15 = 0
            goto L5b2
        L58b:
            android.content.res.AssetManager r0 = r5.getAssets()     // Catch: java.lang.Exception -> L5a8
            java.lang.String r3 = "getAssets(...)"
            kotlin.jvm.internal.m.d(r0, r3)     // Catch: java.lang.Exception -> L5a8
            java.lang.String r1 = r14.concat(r1)     // Catch: java.lang.Exception -> L5a8
            java.io.InputStream r0 = r0.open(r1)     // Catch: java.lang.Exception -> L5a8
            kotlin.jvm.internal.m.d(r0, r15)     // Catch: java.lang.Exception -> L5a8
            r7 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r0, r7)     // Catch: java.lang.Exception -> L5a8
            r8.f14268q = r0     // Catch: java.lang.Exception -> L5a8
            goto L685
        L5a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L5ae
            goto L685
        L5ae:
            r0 = move-exception
            goto L675
        L5b1:
            r15 = r6
        L5b2:
            boolean r0 = J5.t.G0(r14, r12, r15)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r1 = " "
            if (r0 == 0) goto L5cf
            java.lang.String r0 = J5.t.E0(r14, r12, r2)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r3 = "mi-"
            java.lang.String r0 = J5.t.E0(r0, r3, r2)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r0 = J5.t.E0(r0, r11, r7)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r0 = J5.t.E0(r0, r1, r2)     // Catch: java.lang.Exception -> L5cd
            goto L5d7
        L5cd:
            r0 = move-exception
            goto L5f9
        L5cf:
            java.lang.String r0 = J5.t.E0(r14, r11, r7)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r0 = J5.t.E0(r0, r1, r7)     // Catch: java.lang.Exception -> L5cd
        L5d7:
            m5.o r1 = V4.b.f8003a     // Catch: java.lang.Exception -> L5cd
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L5cd
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Exception -> L5cd
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L5cd
            kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> L5cd
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L5cd
            android.graphics.Bitmap r0 = C3.a.q(r5, r0)     // Catch: java.lang.Exception -> L5cd
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L5cd
            android.content.res.Resources r3 = r5.getResources()     // Catch: java.lang.Exception -> L5cd
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L5cd
            r8.f14268q = r1     // Catch: java.lang.Exception -> L5cd
            goto L685
        L5f9:
            r0.printStackTrace()     // Catch: java.lang.Exception -> L5ae
            goto L685
        L5fe:
            r0 = move-exception
            goto L4e1
        L601:
            boolean r0 = J5.m.K0(r14, r0)     // Catch: java.lang.Exception -> L5ae
            java.lang.String r1 = "far_"
            java.lang.String r6 = "faw_"
            if (r0 == 0) goto L60d
            r0 = r6
            goto L61f
        L60d:
            boolean r0 = J5.m.K0(r14, r4)     // Catch: java.lang.Exception -> L5ae
            if (r0 == 0) goto L616
            java.lang.String r0 = "fab_"
            goto L61f
        L616:
            boolean r0 = J5.m.K0(r14, r3)     // Catch: java.lang.Exception -> L5ae
            if (r0 == 0) goto L61e
            r0 = r1
            goto L61f
        L61e:
            r0 = r2
        L61f:
            r3 = 6
            r15 = 0
            int r3 = J5.m.S0(r14, r11, r15, r3)     // Catch: java.lang.Exception -> L5ae
            r21 = 1
            int r3 = r3 + 1
            java.lang.String r3 = r14.substring(r3)     // Catch: java.lang.Exception -> L5ae
            kotlin.jvm.internal.m.d(r3, r10)     // Catch: java.lang.Exception -> L5ae
            java.lang.String r3 = J5.t.E0(r3, r11, r7)     // Catch: java.lang.Exception -> L5ae
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Exception -> L5ae
            K4.d r4 = new K4.d     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            r15 = 0
            boolean r6 = J5.t.G0(r0, r6, r15)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            if (r6 == 0) goto L648
            P4.a r0 = P4.a.valueOf(r3)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            goto L657
        L646:
            r0 = move-exception
            goto L65d
        L648:
            boolean r0 = J5.t.G0(r0, r1, r15)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            if (r0 == 0) goto L653
            P4.d r0 = P4.d.valueOf(r3)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            goto L657
        L653:
            P4.b r0 = P4.b.valueOf(r3)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
        L657:
            r4.<init>(r5, r0)     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            r8.f14268q = r4     // Catch: java.lang.Exception -> L5ae java.lang.IllegalArgumentException -> L646
            goto L685
        L65d:
            r0.printStackTrace()     // Catch: java.lang.Exception -> L5ae
            goto L685
        L661:
            r0 = move-exception
            r24 = r3
            r25 = r4
            r23 = r6
        L668:
            r8 = r27
            goto L675
        L66b:
            r0 = move-exception
            r24 = r3
            r25 = r4
            r23 = r6
            r33 = r15
            goto L668
        L675:
            r0.printStackTrace()
            goto L685
        L679:
            r24 = r3
            r25 = r4
            r23 = r6
            r32 = r11
            r33 = r15
            r8 = r27
        L685:
            java.lang.Object r0 = r8.f14268q
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.view.MenuItem r0 = r13.setIcon(r0)
            r3 = 1
            android.view.MenuItem r0 = r0.setShowAsActionFlags(r3)
            java.lang.String r1 = "setShowAsActionFlags(...)"
            kotlin.jvm.internal.m.d(r0, r1)
            r9.add(r0)
            r1 = r23
            if (r25 == 0) goto L6a3
            r3 = r25
            r1.add(r3)
        L6a3:
            r0 = r18
            goto L6b7
        L6a6:
            r29 = r1
            r24 = r3
            r17 = r4
            r19 = r5
            r1 = r6
            r30 = r7
            r31 = r8
            r32 = r11
            r33 = r15
        L6b7:
            r6 = r1
            r4 = r17
            r5 = r19
            r3 = r24
            r13 = r29
            r7 = r30
            r8 = r31
            r11 = r32
            r15 = r33
            r20 = 0
            goto L3e6
        L6cc:
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            r20 = 0
            throw r20
        L6d2:
            r24 = r3
            r19 = r5
            r1 = r6
            r31 = r8
            r32 = r11
            r33 = r15
            goto L6e0
        L6de:
            r0 = 1
            goto L6d2
        L6e0:
            if (r0 != 0) goto L6e9
            r14 = r24
            r3 = 2
            r14.setLabelVisibilityMode(r3)
            goto L6ef
        L6e9:
            r14 = r24
            r3 = 1
            r14.setLabelVisibilityMode(r3)
        L6ef:
            W4.b r13 = new W4.b
            r17 = r1
            r16 = r31
            r18 = r32
            r15 = r33
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r4 = r16
            r3 = r17
            r11 = r18
            r1 = r19
            r14.setOnItemSelectedListener(r13)
            int r0 = r3.size()
            r5 = 0
            r6 = 0
        L70d:
            if (r6 >= r0) goto L861
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            int r8 = r5 + 1
            if (r5 < 0) goto L85b
            java.lang.String r7 = (java.lang.String) r7
            android.webkit.WebView r5 = r11.f7084k
            if (r5 == 0) goto L724
            java.lang.String r5 = r5.getUrl()
            goto L725
        L724:
            r5 = 0
        L725:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r9 = "bottomUrl"
            kotlin.jvm.internal.m.e(r7, r9)
            int r9 = r5.length()
            r21 = 1
            int r9 = r9 + (-1)
            java.lang.String r9 = r5.substring(r9)
            kotlin.jvm.internal.m.d(r9, r10)
            java.lang.String r12 = "/"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L753
            int r9 = r5.length()
            int r9 = r9 + (-1)
            r13 = 0
            java.lang.String r5 = r5.substring(r13, r9)
            kotlin.jvm.internal.m.d(r5, r10)
        L753:
            int r9 = r7.length()
            int r9 = r9 + (-1)
            java.lang.String r9 = r7.substring(r9)
            kotlin.jvm.internal.m.d(r9, r10)
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L775
            int r9 = r7.length()
            int r9 = r9 + (-1)
            r13 = 0
            java.lang.String r7 = r7.substring(r13, r9)
            kotlin.jvm.internal.m.d(r7, r10)
            goto L776
        L775:
            r13 = 0
        L776:
            boolean r9 = r5.equals(r7)
            if (r9 == 0) goto L783
            r16 = r0
            r23 = r3
        L780:
            r0 = 1
            goto L82f
        L783:
            java.lang.String r9 = "https://www."
            boolean r12 = J5.t.G0(r5, r9, r13)
            r16 = r0
            java.lang.String r0 = "https://"
            if (r12 == 0) goto L7a6
            boolean r12 = J5.t.G0(r7, r0, r13)
            if (r12 != 0) goto L7a6
            r0 = 12
            java.lang.String r0 = r5.substring(r0)
            kotlin.jvm.internal.m.d(r0, r10)
            boolean r0 = r0.equals(r7)
            r23 = r3
            goto L82f
        L7a6:
            java.lang.String r12 = "http://www."
            boolean r17 = J5.t.G0(r5, r12, r13)
            r23 = r3
            java.lang.String r3 = "http://"
            if (r17 == 0) goto L7c6
            boolean r17 = J5.t.G0(r5, r3, r13)
            if (r17 != 0) goto L7c6
            r0 = 11
            java.lang.String r0 = r5.substring(r0)
            kotlin.jvm.internal.m.d(r0, r10)
            boolean r0 = r0.equals(r7)
            goto L82f
        L7c6:
            boolean r9 = J5.t.G0(r5, r9, r13)
            java.lang.String r13 = "www."
            if (r9 == 0) goto L7d9
            java.lang.String r9 = J5.t.E0(r5, r13, r2)
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L7d9
        L7d8:
            goto L780
        L7d9:
            r9 = 0
            boolean r12 = J5.t.G0(r5, r12, r9)
            if (r12 == 0) goto L7eb
            java.lang.String r12 = J5.t.E0(r5, r13, r2)
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L7eb
            goto L7d8
        L7eb:
            boolean r0 = J5.t.G0(r5, r0, r9)
            r12 = 7
            if (r0 == 0) goto L81b
            java.lang.String r0 = "http"
            boolean r0 = J5.t.G0(r7, r0, r9)
            r3 = 8
            if (r0 != 0) goto L808
            java.lang.String r0 = r5.substring(r3)
            kotlin.jvm.internal.m.d(r0, r10)
            boolean r0 = r0.equals(r7)
            goto L82f
        L808:
            java.lang.String r0 = r5.substring(r3)
            kotlin.jvm.internal.m.d(r0, r10)
            java.lang.String r3 = r7.substring(r12)
            kotlin.jvm.internal.m.d(r3, r10)
            boolean r0 = r0.equals(r3)
            goto L82f
        L81b:
            r13 = r9
            boolean r0 = J5.t.G0(r5, r3, r13)
            if (r0 == 0) goto L82e
            java.lang.String r0 = r5.substring(r12)
            kotlin.jvm.internal.m.d(r0, r10)
            boolean r0 = r0.equals(r7)
            goto L82f
        L82e:
            r0 = 0
        L82f:
            if (r0 == 0) goto L854
            android.view.Menu r0 = r14.getMenu()
            android.view.MenuItem r0 = r0.findItem(r8)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r3 < r5) goto L854
            boolean r3 = r0.isChecked()
            if (r3 != 0) goto L854
            r1.f14266q = r8
            r3 = 1
            r0.setChecked(r3)
            C0.U.r(r0, r4)
            r14.setItemTextColor(r15)
            r14.setItemIconTintList(r4)
        L854:
            r5 = r8
            r0 = r16
            r3 = r23
            goto L70d
        L85b:
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            r20 = 0
            throw r20
        L861:
            b4.e r0 = r11.f7101w
            if (r0 == 0) goto L877
            r15 = 0
            r0.setVisibility(r15)
            goto L877
        L86a:
            b4.e r0 = r11.f7101w
            if (r0 == 0) goto L873
            r3 = 8
            r0.setVisibility(r3)
        L873:
            r15 = 0
            r13.d(r15)
        L877:
            return r22
        L878:
            r22 = r6
            kotlin.jvm.internal.u r11 = (kotlin.jvm.internal.u) r11
            W1.j r10 = (W1.j) r10
            T1.p r9 = (T1.p) r9
            android.os.Bundle r8 = (android.os.Bundle) r8
            r0 = r41
            T1.d r0 = (T1.d) r0
            java.lang.String r1 = "it"
            kotlin.jvm.internal.m.e(r0, r1)
            r3 = 1
            r11.f14264q = r3
            n5.s r1 = n5.s.f15299q
            r10.a(r9, r8, r0, r1)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.invoke(java.lang.Object):java.lang.Object");
    }
}
