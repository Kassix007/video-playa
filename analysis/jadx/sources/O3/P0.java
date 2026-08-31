package O3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractC0308o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4550e;
    public final /* synthetic */ C0271b1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C0271b1 c0271b1, F0 f02, int i) {
        super(f02);
        this.f4550e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c0271b1);
                this.f = c0271b1;
                super(f02);
                break;
            case 2:
                Objects.requireNonNull(c0271b1);
                this.f = c0271b1;
                super(f02);
                break;
            case 3:
                this.f = c0271b1;
                super(f02);
                break;
            default:
                Objects.requireNonNull(c0271b1);
                this.f = c0271b1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a4 A[Catch: IllegalArgumentException -> 0x02ab, MalformedURLException -> 0x02ad, TryCatch #5 {IllegalArgumentException -> 0x02ab, MalformedURLException -> 0x02ad, blocks: (B:79:0x025c, B:81:0x02a4, B:86:0x02af, B:88:0x02b5, B:90:0x02bd, B:91:0x02c3, B:92:0x02c7), top: B:115:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5 A[Catch: IllegalArgumentException -> 0x02ab, MalformedURLException -> 0x02ad, TryCatch #5 {IllegalArgumentException -> 0x02ab, MalformedURLException -> 0x02ad, blocks: (B:79:0x025c, B:81:0x02a4, B:86:0x02af, B:88:0x02b5, B:90:0x02bd, B:91:0x02c3, B:92:0x02c7), top: B:115:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fc  */
    @Override // O3.AbstractC0308o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f4550e
            switch(r0) {
                case 0: goto L327;
                case 1: goto L321;
                case 2: goto L31b;
                default: goto L7;
            }
        L7:
            O3.b1 r2 = r1.f
            java.lang.Object r0 = r2.f4346r
            r3 = r0
            O3.t0 r3 = (O3.C0323t0) r3
            O3.h0 r4 = r3.f5076u
            O3.X r5 = r3.f5077v
            O3.p0 r0 = r3.f5078w
            O3.C0323t0.l(r0)
            r0.o()
            O3.f1 r7 = r3.f5056E
            O3.C0323t0.l(r7)
            java.lang.Object r0 = r7.f4346r
            r6 = r0
            O3.t0 r6 = (O3.C0323t0) r6
            O3.C0323t0.l(r7)
            O3.N r0 = r3.q()
            java.lang.String r8 = r0.u()
            O3.g r0 = r3.f5075t
            java.lang.String r9 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r0 = r0.A(r9)
            r13 = 0
            if (r0 == 0) goto L4d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L41
            goto L4d
        L41:
            O3.C0323t0.l(r5)
            O3.V r0 = r5.f4666E
            java.lang.String r3 = "ADID collection is disabled from Manifest. Skipping"
            r0.b(r3)
            goto L311
        L4d:
            O3.C0323t0.j(r4)
            java.lang.Object r0 = r4.f4346r
            r9 = r0
            O3.t0 r9 = (O3.C0323t0) r9
            r4.o()
            O3.J0 r0 = r4.v()
            O3.I0 r10 = O3.I0.AD_STORAGE
            boolean r0 = r0.i(r10)
            java.lang.String r10 = ""
            if (r0 == 0) goto Lcf
            B3.a r0 = r9.f5052A
            r0.getClass()
            long r14 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = r4.f4898y
            r16 = 1
            if (r0 == 0) goto L88
            long r11 = r4.f4877A
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L7c
            goto L88
        L7c:
            android.util.Pair r9 = new android.util.Pair
            boolean r10 = r4.f4899z
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r0, r10)
            goto Ld8
        L88:
            O3.g r0 = r9.f5075t
            O3.E r11 = O3.F.f4415b
            long r11 = r0.v(r8, r11)
            long r11 = r11 + r14
            r4.f4877A = r11
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r16)
            android.content.Context r0 = r9.f5072q     // Catch: java.lang.Exception -> La7
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch: java.lang.Exception -> La7
            r4.f4898y = r10     // Catch: java.lang.Exception -> La7
            java.lang.String r11 = r0.getId()     // Catch: java.lang.Exception -> La7
            if (r11 == 0) goto La9
            r4.f4898y = r11     // Catch: java.lang.Exception -> La7
            goto La9
        La7:
            r0 = move-exception
            goto Lb0
        La9:
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> La7
            r4.f4899z = r0     // Catch: java.lang.Exception -> La7
            goto Lbe
        Lb0:
            O3.X r9 = r9.f5077v
            O3.C0323t0.l(r9)
            O3.V r9 = r9.f4665D
            java.lang.String r11 = "Unable to get advertising id"
            r9.c(r0, r11)
            r4.f4898y = r10
        Lbe:
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r13)
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r0 = r4.f4898y
            boolean r10 = r4.f4899z
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r0, r10)
            goto Ld8
        Lcf:
            r16 = 1
            android.util.Pair r9 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.<init>(r10, r0)
        Ld8:
            java.lang.Object r0 = r9.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L307
            java.lang.Object r0 = r9.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lee
            goto L307
        Lee:
            O3.C0323t0.l(r7)
            r7.q()
            android.content.Context r0 = r6.f5072q
            java.lang.String r10 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r10)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L105
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L105
            goto L106
        L105:
            r0 = 0
        L106:
            if (r0 == 0) goto L2fc
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L2fc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            O3.w1 r0 = r3.o()
            r0.o()
            r0.p()
            boolean r12 = r0.v()
            if (r12 != 0) goto L124
            goto L136
        L124:
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r0 = r0.f5080y
            O3.C0323t0.j(r0)
            int r0 = r0.U()
            r12 = 234200(0x392d8, float:3.28184E-40)
            if (r0 < r12) goto L230
        L136:
            O3.b1 r0 = r3.f5054C
            O3.C0323t0.k(r0)
            java.lang.Object r12 = r0.f4346r
            O3.t0 r12 = (O3.C0323t0) r12
            r0.o()
            O3.w1 r0 = r12.o()
            java.lang.Object r12 = r0.f4346r
            O3.t0 r12 = (O3.C0323t0) r12
            r0.o()
            r0.p()
            O3.I r14 = r0.f5109u
            if (r14 != 0) goto L165
            r0.u()
            O3.X r0 = r12.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4665D
            java.lang.String r12 = "Failed to get consents; not connected to service yet."
            r0.b(r12)
        L163:
            r14 = 0
            goto L17f
        L165:
            O3.a2 r15 = r0.E(r13)
            O3.i r14 = r14.g(r15)     // Catch: android.os.RemoteException -> L171
            r0.B()     // Catch: android.os.RemoteException -> L171
            goto L17f
        L171:
            r0 = move-exception
            O3.X r12 = r12.f5077v
            O3.C0323t0.l(r12)
            O3.V r12 = r12.f4670w
            java.lang.String r14 = "Failed to get consents; remote exception"
            r12.c(r0, r14)
            goto L163
        L17f:
            if (r14 == 0) goto L184
            android.os.Bundle r0 = r14.f4906q
            goto L185
        L184:
            r0 = 0
        L185:
            if (r0 != 0) goto L1c6
            int r0 = r3.f5069R
            int r4 = r0 + 1
            r3.f5069R = r4
            r4 = 10
            if (r0 >= r4) goto L193
            r13 = r16
        L193:
            O3.C0323t0.l(r5)
            if (r0 >= r4) goto L19b
            java.lang.String r0 = "Retrying."
            goto L19d
        L19b:
            java.lang.String r0 = "Skipping."
        L19d:
            O3.V r4 = r5.f4665D
            int r5 = r0.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 60
            r6.<init>(r5)
            java.lang.String r5 = "Failed to retrieve DMA consent from the service, "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = " retryCount"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            int r3 = r3.f5069R
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.c(r3, r0)
            goto L311
        L1c6:
            r12 = 100
            O3.J0 r14 = O3.J0.b(r12, r0)
            java.lang.String r15 = "&gcs="
            r11.append(r15)
            java.lang.String r14 = r14.f()
            r11.append(r14)
            O3.p r12 = O3.C0311p.c(r12, r0)
            java.lang.String r14 = r12.f5008d
            java.lang.String r15 = "&dma="
            r11.append(r15)
            java.lang.Boolean r12 = r12.f5007c
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            boolean r12 = java.util.Objects.equals(r12, r15)
            r12 = r12 ^ 1
            r11.append(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            if (r12 != 0) goto L1fe
            java.lang.String r12 = "&dma_cps="
            r11.append(r12)
            r11.append(r14)
        L1fe:
            java.lang.String r12 = "ad_personalization"
            java.lang.String r0 = r0.getString(r12)
            O3.G0 r0 = O3.J0.d(r0)
            int r0 = r0.ordinal()
            r12 = 2
            if (r0 == r12) goto L216
            r12 = 3
            if (r0 == r12) goto L214
            r15 = 0
            goto L216
        L214:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
        L216:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = java.util.Objects.equals(r15, r0)
            r0 = r0 ^ 1
            java.lang.String r12 = "&npa="
            r11.append(r12)
            r11.append(r0)
            O3.C0323t0.l(r5)
            O3.V r0 = r5.f4666E
            java.lang.String r5 = "Consent query parameters to Bow"
            r0.c(r11, r5)
        L230:
            O3.Y1 r0 = r3.f5080y
            O3.C0323t0.j(r0)
            O3.N r5 = r3.q()
            java.lang.Object r5 = r5.f4346r
            O3.t0 r5 = (O3.C0323t0) r5
            O3.g r5 = r5.f5075t
            r5.t()
            java.lang.Object r5 = r9.first
            java.lang.String r5 = (java.lang.String) r5
            O3.f0 r4 = r4.f4888L
            long r14 = r4.a()
            r16 = -1
            long r14 = r14 + r16
            java.lang.String r4 = r11.toString()
            java.lang.Object r9 = r0.f4346r
            O3.t0 r9 = (O3.C0323t0) r9
            java.lang.String r11 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version="
            java.lang.String r12 = "v130000."
            x3.AbstractC1887A.d(r5)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            x3.AbstractC1887A.d(r8)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            int r0 = r0.U()     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.<init>(r12)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.append(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r0 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.<init>(r11)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.append(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r0 = "&rdid="
            r10.append(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.append(r5)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r0 = "&bundleid="
            r10.append(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.append(r8)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r0 = "&retry="
            r10.append(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10.append(r14)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r0 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            O3.g r5 = r9.f5075t     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            java.lang.String r10 = "debug.deferred.deeplink"
            java.lang.String r5 = r5.s(r10)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            boolean r5 = r8.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            if (r5 == 0) goto L2af
            java.lang.String r5 = "&ddl_test=1"
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            goto L2af
        L2ab:
            r0 = move-exception
            goto L2ce
        L2ad:
            r0 = move-exception
            goto L2ce
        L2af:
            boolean r5 = r4.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            if (r5 != 0) goto L2c7
            char r5 = r4.charAt(r13)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r10 = 38
            if (r5 == r10) goto L2c3
            java.lang.String r5 = "&"
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
        L2c3:
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
        L2c7:
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r4.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L2ab java.net.MalformedURLException -> L2ad
            r9 = r4
            goto L2df
        L2ce:
            O3.X r4 = r9.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4670w
            java.lang.String r5 = "Failed to create BOW URL for Deferred Deep Link. exception"
            java.lang.String r0 = r0.getMessage()
            r4.c(r0, r5)
            r9 = 0
        L2df:
            if (r9 == 0) goto L311
            O3.C0323t0.l(r7)
            O3.r0 r12 = new O3.r0
            r12.<init>(r3)
            r7.q()
            O3.p0 r0 = r6.f5078w
            O3.C0323t0.l(r0)
            O3.a0 r6 = new O3.a0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.A(r6)
            goto L311
        L2fc:
            O3.C0323t0.l(r5)
            O3.V r0 = r5.f4673z
            java.lang.String r3 = "Network is not available for Deferred Deep Link request. Skipping"
            r0.b(r3)
            goto L311
        L307:
            O3.C0323t0.l(r5)
            O3.V r0 = r5.f4666E
            java.lang.String r3 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            r0.b(r3)
        L311:
            if (r13 == 0) goto L31a
            O3.P0 r0 = r2.f4757K
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.b(r2)
        L31a:
            return
        L31b:
            O3.b1 r0 = r1.f
            r0.u()
            return
        L321:
            O3.b1 r0 = r1.f
            r0.M()
            return
        L327:
            java.lang.Thread r0 = new java.lang.Thread
            O3.b1 r2 = r1.f
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.b1 r2 = r2.f5054C
            O3.C0323t0.k(r2)
            O3.O0 r3 = new O3.O0
            r4 = 0
            r3.<init>(r2, r4)
            r0.<init>(r3)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.P0.a():void");
    }
}
