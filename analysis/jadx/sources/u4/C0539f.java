package U4;

import R4.C0468k1;

/* JADX INFO: renamed from: U4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0539f implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7818s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0539f(C0468k1 c0468k1, P.W w3, int i) {
        this.f7816q = i;
        this.f7817r = c0468k1;
        this.f7818s = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f7816q
            switch(r0) {
                case 0: goto L1c9;
                case 1: goto L1b7;
                case 2: goto L175;
                case 3: goto L10b;
                case 4: goto Ldc;
                default: goto L5;
            }
        L5:
            T1.s r6 = (T1.s) r6
            java.lang.String r0 = "$this$NavHost"
            kotlin.jvm.internal.m.e(r6, r0)
            g5.i r0 = new g5.i
            r1 = 3
            R4.k1 r2 = r5.f7817r
            r0.<init>()
            X.e r1 = new X.e
            r3 = -1166575971(0xffffffffba77769d, float:-9.439977E-4)
            r4 = 1
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "downloadScreen/{url}"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 4
            r0.<init>()
            X.e r1 = new X.e
            r3 = 605313350(0x24145946, float:3.2168002E-17)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "splashScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 5
            r0.<init>()
            X.e r1 = new X.e
            r3 = -1435361755(0xffffffffaa721e25, float:-2.1504376E-13)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "mainScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 6
            r0.<init>()
            X.e r1 = new X.e
            r3 = 818930436(0x30cfe304, float:1.5125754E-9)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "notificationScreen/{url}"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 7
            r0.<init>()
            X.e r1 = new X.e
            r3 = -1221744669(0xffffffffb72da7e3, float:-1.0350693E-5)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "onboardingScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            R4.i r0 = r2.f7073d
            if (r0 == 0) goto L75
            R4.F1 r0 = r0.f6999b
            goto L76
        L75:
            r0 = 0
        L76:
            if (r0 == 0) goto L8c
            g5.i r0 = new g5.i
            r1 = 8
            r0.<init>()
            X.e r1 = new X.e
            r3 = -767851102(0xffffffffd23b85a2, float:-2.01350218E11)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "noInternetScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
        L8c:
            g5.j r0 = new g5.j
            P.W r1 = r5.f7818s
            r0.<init>()
            X.e r1 = new X.e
            r3 = 1032547522(0x3d8b6cc2, float:0.06807853)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "iapScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 0
            r0.<init>()
            X.e r1 = new X.e
            r3 = -1008127583(0xffffffffc3e931a1, float:-466.38773)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "pdfScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 1
            r0.<init>()
            X.e r1 = new X.e
            r3 = 1246164608(0x4a46f680, float:3259808.0)
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "externalUrlsForLogin"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
            g5.i r0 = new g5.i
            r1 = 2
            r0.<init>()
            X.e r1 = new X.e
            r2 = -794510497(0xffffffffd0a4bb5f, float:-2.21099438E10)
            r1.<init>(r2, r4, r0)
            java.lang.String r0 = "googleGsiLoginScreen"
            com.google.android.gms.internal.measurement.P1.m(r6, r0, r1)
        Ld9:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        Ldc:
            java.lang.String r6 = (java.lang.String) r6
            R4.k1 r6 = r5.f7817r
            O3.e0 r0 = r6.f7053M
            boolean r0 = r0.b()
            if (r0 == 0) goto L108
            O3.D r6 = r6.f7054N
            if (r6 == 0) goto L101
            P.W r6 = r5.f7818s
            java.lang.Object r6 = r6.getValue()
            R4.Y0 r6 = (R4.Y0) r6
            if (r6 == 0) goto L108
            java.util.List r6 = r6.f6897e
            if (r6 == 0) goto L108
            java.lang.Object r6 = n5.l.l0(r6)
            R4.V0 r6 = (R4.V0) r6
            goto L108
        L101:
            java.lang.String r6 = "inAppPurchaseUtil"
            kotlin.jvm.internal.m.k(r6)
            r6 = 0
            throw r6
        L108:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        L10b:
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            int r6 = r6.orientation
            r0 = 2
            if (r6 != r0) goto L114
            r6 = 1
            goto L115
        L114:
            r6 = 0
        L115:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            P.W r0 = r5.f7818s
            r0.setValue(r6)
            R4.k1 r6 = r5.f7817r
            com.web2native.MainActivity r0 = r6.f7067a
            R4.i r6 = r6.f7073d
            r1 = 0
            if (r6 == 0) goto L12e
            R4.O1 r2 = r6.f6998a
            if (r2 == 0) goto L12e
            java.lang.String r2 = r2.f6820b
            goto L12f
        L12e:
            r2 = r1
        L12f:
            kotlin.jvm.internal.m.b(r2)
            android.view.Window r3 = r0.getWindow()
            int r2 = android.graphics.Color.parseColor(r2)
            r3.setStatusBarColor(r2)
            if (r6 == 0) goto L146
            R4.O1 r2 = r6.f6998a
            if (r2 == 0) goto L146
            java.lang.String r2 = r2.f6820b
            goto L147
        L146:
            r2 = r1
        L147:
            kotlin.jvm.internal.m.b(r2)
            android.view.Window r3 = r0.getWindow()
            int r2 = android.graphics.Color.parseColor(r2)
            r3.setNavigationBarColor(r2)
            if (r6 == 0) goto L15e
            R4.O1 r2 = r6.f6998a
            if (r2 == 0) goto L15e
            java.lang.String r2 = r2.f6820b
            goto L15f
        L15e:
            r2 = r1
        L15f:
            kotlin.jvm.internal.m.b(r2)
            com.google.android.gms.internal.measurement.P1.b0(r0, r2)
            if (r6 == 0) goto L16d
            R4.O1 r6 = r6.f6998a
            if (r6 == 0) goto L16d
            java.lang.String r1 = r6.f6820b
        L16d:
            kotlin.jvm.internal.m.b(r1)
            com.google.android.gms.internal.measurement.P1.a0(r0, r1)
            goto Ld9
        L175:
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            R4.k1 r6 = r5.f7817r
            R4.i r0 = r6.f7073d
            r1 = 0
            if (r0 == 0) goto L187
            java.lang.Boolean r0 = r0.f6980E
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r2)
            goto L188
        L187:
            r0 = r1
        L188:
            r2 = 0
            P.W r3 = r5.f7818s
            if (r0 != 0) goto L1a5
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r0 < r4) goto L1a5
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.web2native.MainActivity r6 = r6.f7069b
            r1 = 9
            com.google.android.gms.internal.measurement.P1.Y(r2, r0, r6, r1)
            goto L1b4
        L1a5:
            com.web2native.MainActivity r6 = r6.f7067a
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.gms.internal.measurement.P1.Z(r6, r0, r2, r1)
        L1b4:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        L1b7:
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            R4.k1 r6 = r5.f7817r
            java.lang.String r6 = r6.f7102x
            if (r6 == 0) goto L1c6
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            P.W r0 = r5.f7818s
            r0.setValue(r6)
        L1c6:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        L1c9:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L1ce
            goto L1ef
        L1ce:
            int r6 = r6.intValue()
            r0 = 100
            if (r6 != r0) goto L1ef
            R4.k1 r6 = r5.f7817r
            com.web2native.OrufyConnectHandlerUtil r0 = r6.f7052L
            kotlin.jvm.internal.m.b(r0)
            android.webkit.WebView r1 = r6.f7084k
            if (r1 == 0) goto L1e6
            java.lang.String r1 = r1.getUrl()
            goto L1e7
        L1e6:
            r1 = 0
        L1e7:
            boolean r6 = r0.matchUrl(r6, r1)
            if (r6 == 0) goto L1ef
            r6 = 1
            goto L1f0
        L1ef:
            r6 = 0
        L1f0:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            P.W r0 = r5.f7818s
            r0.setValue(r6)
            goto Ld9
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.C0539f.invoke(java.lang.Object):java.lang.Object");
    }
}
