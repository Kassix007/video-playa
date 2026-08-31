package U4;

import R4.C0468k1;

/* JADX INFO: renamed from: U4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0538e implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7812q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7814s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0538e(P.W w3, C0468k1 c0468k1) {
        this.f7814s = w3;
        this.f7813r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    @Override // B5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            int r0 = r10.f7812q
            switch(r0) {
                case 0: goto L9d;
                default: goto L5;
            }
        L5:
            P.o r11 = (P.C0371o) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = r12 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            r12 = r12 & r2
            boolean r12 = r11.K(r12, r0)
            if (r12 == 0) goto L97
            R4.k1 r12 = r10.f7813r
            U4.AbstractC0534a.v(r12, r11, r3)
            androidx.compose.foundation.layout.FillElement r0 = androidx.compose.foundation.layout.c.f9277a
            c0.e r1 = c0.C0714b.f10076q
            z0.C r1 = A.AbstractC0017n.d(r1, r3)
            int r4 = r11.f5454P
            P.i0 r5 = r11.m()
            c0.m r0 = c0.AbstractC0727o.c(r11, r0)
            B0.j r6 = B0.InterfaceC0046k.f452a
            r6.getClass()
            B0.D r6 = B0.C0045j.f445b
            r11.W()
            boolean r7 = r11.f5453O
            if (r7 == 0) goto L47
            r11.l(r6)
            goto L4a
        L47:
            r11.g0()
        L4a:
            B0.i r6 = B0.C0045j.f448e
            P.C0345b.u(r6, r11, r1)
            B0.i r1 = B0.C0045j.f447d
            P.C0345b.u(r1, r11, r5)
            B0.i r1 = B0.C0045j.f
            boolean r5 = r11.f5453O
            if (r5 != 0) goto L68
            java.lang.Object r5 = r11.H()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.m.a(r5, r6)
            if (r5 != 0) goto L6b
        L68:
            k1.i.o(r4, r11, r4, r1)
        L6b:
            B0.i r1 = B0.C0045j.f446c
            P.C0345b.u(r1, r11, r0)
            j5.b r0 = r12.f7062V
            U4.AbstractC0534a.i(r12, r0, r11, r3)
            r11.p(r2)
            boolean r0 = r11.i(r12)
            java.lang.Object r1 = r11.H()
            if (r0 != 0) goto L86
            P.S r0 = P.C0363k.f5418a
            if (r1 != r0) goto L91
        L86:
            U4.n r1 = new U4.n
            r0 = 1
            P.W r2 = r10.f7814s
            r1.<init>(r12, r2, r0)
            r11.d0(r1)
        L91:
            B5.a r1 = (B5.a) r1
            l6.d.d(r3, r1, r11, r3)
            goto L9a
        L97:
            r11.N()
        L9a:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        L9d:
            r7 = r11
            P.o r7 = (P.C0371o) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r1 = 0
            r2 = 1
            if (r12 == r0) goto Laf
            r12 = r2
            goto Lb0
        Laf:
            r12 = r1
        Lb0:
            r11 = r11 & r2
            boolean r11 = r7.K(r11, r12)
            if (r11 == 0) goto L161
            P.W r11 = r10.f7814s
            java.lang.Object r12 = r11.getValue()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r7.g(r12)
            java.lang.Object r0 = r7.H()
            if (r12 != 0) goto Lcd
            P.S r12 = P.C0363k.f5418a
            if (r0 != r12) goto L121
        Lcd:
            java.lang.Object r12 = r11.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r2 = 0
            if (r12 == 0) goto L11d
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            kotlin.jvm.internal.m.b(r11)
            R4.k1 r12 = r10.f7813r
            com.web2native.MainActivity r12 = r12.f7071c
            android.content.res.AssetManager r12 = r12.getAssets()
            java.lang.String r0 = "getAssets(...)"
            kotlin.jvm.internal.m.d(r12, r0)
            java.lang.String r0 = ""
            boolean r0 = r11.equals(r0)     // Catch: java.io.IOException -> L102
            if (r0 != 0) goto L105
            java.io.InputStream r11 = r12.open(r11)     // Catch: java.io.IOException -> L102
            java.lang.String r12 = "open(...)"
            kotlin.jvm.internal.m.d(r11, r12)     // Catch: java.io.IOException -> L102
            android.graphics.drawable.Drawable r11 = android.graphics.drawable.Drawable.createFromStream(r11, r2)     // Catch: java.io.IOException -> L102
            goto L10b
        L102:
            r0 = move-exception
            r11 = r0
            goto L107
        L105:
            r11 = r2
            goto L10b
        L107:
            r11.printStackTrace()
            goto L105
        L10b:
            if (r11 == 0) goto L11d
            o0.a r12 = new o0.a
            android.graphics.Bitmap r11 = C3.a.U(r11)
            j0.e r0 = new j0.e
            r0.<init>(r11)
            r12.<init>(r0)
            r0 = r12
            goto L11e
        L11d:
            r0 = r2
        L11e:
            r7.d0(r0)
        L121:
            o0.a r0 = (o0.C1411a) r0
            if (r0 != 0) goto L137
            r11 = 314195044(0x12ba3c64, float:1.1753138E-27)
            r7.S(r11)
            r11 = 2131165343(0x7f07009f, float:1.79449E38)
            r12 = 6
            o0.b r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.F(r11, r7, r12)
            r7.p(r1)
            goto L140
        L137:
            r11 = 314183419(0x12ba0efb, float:1.1741943E-27)
            r7.S(r11)
            r7.p(r1)
        L140:
            androidx.compose.foundation.layout.FillElement r11 = androidx.compose.foundation.layout.c.f9279c
            long r1 = j0.o.f
            O3.D r12 = j0.AbstractC1145B.f13658a
            c0.m r11 = androidx.compose.foundation.a.a(r11, r1, r12)
            r12 = 3
            H.d r12 = H.e.a(r12)
            c0.m r2 = a.AbstractC0597a.n(r11, r12)
            r8 = 24624(0x6030, float:3.4506E-41)
            r9 = 104(0x68, float:1.46E-43)
            r1 = 0
            r3 = 0
            z0.F r4 = z0.C1949i.f18697d
            r5 = 0
            r6 = 0
            D5.a.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L161:
            r7.N()
        L164:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.C0538e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0538e(C0468k1 c0468k1, P.W w3) {
        this.f7813r = c0468k1;
        this.f7814s = w3;
    }
}
