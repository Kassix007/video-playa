package N5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4038s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f4036q = i;
        this.f4037r = obj;
        this.f4038s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a3  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r15) throws java.io.UnsupportedEncodingException {
        /*
            r14 = this;
            int r0 = r14.f4036q
            r1 = 0
            r2 = -1
            r3 = 0
            r4 = 1
            m5.y r5 = m5.C1386y.f15098a
            java.lang.Object r6 = r14.f4038s
            java.lang.Object r7 = r14.f4037r
            switch(r0) {
                case 0: goto L2ae;
                case 1: goto L1f7;
                case 2: goto L19e;
                case 3: goto L122;
                case 4: goto L115;
                case 5: goto Lde;
                case 6: goto La5;
                case 7: goto L7b;
                case 8: goto L5d;
                case 9: goto L4f;
                case 10: goto L45;
                case 11: goto L31;
                case 12: goto L1e;
                default: goto Lf;
            }
        Lf:
            com.web2native.MainActivity r7 = (com.web2native.MainActivity) r7
            R4.O1 r6 = (R4.O1) r6
            android.content.res.Configuration r15 = (android.content.res.Configuration) r15
            java.lang.String r15 = r6.f6820b
            kotlin.jvm.internal.m.b(r15)
            com.google.android.gms.internal.measurement.P1.Z(r7, r15, r15, r4)
            return r5
        L1e:
            R4.O1 r7 = (R4.O1) r7
            R4.k1 r6 = (R4.C0468k1) r6
            android.content.res.Configuration r15 = (android.content.res.Configuration) r15
            java.lang.String r15 = r7.f6820b
            kotlin.jvm.internal.m.b(r15)
            com.web2native.MainActivity r0 = r6.f7069b
            r1 = 8
            com.google.android.gms.internal.measurement.P1.Y(r15, r15, r0, r1)
            return r5
        L31:
            M5.w r7 = (M5.InterfaceC0261w) r7
            F.e r6 = (F.C0151e) r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            f5.j r0 = new f5.j
            r0.<init>(r6, r15, r3)
            r15 = 3
            M5.AbstractC0263y.t(r7, r3, r3, r0, r15)
            return r5
        L45:
            com.web2native.MainActivity r7 = (com.web2native.MainActivity) r7
            java.lang.String r6 = (java.lang.String) r6
            android.content.res.Configuration r15 = (android.content.res.Configuration) r15
            com.google.android.gms.internal.measurement.P1.Z(r7, r6, r6, r4)
            return r5
        L4f:
            a5.c r7 = (a5.c) r7
            B5.c r6 = (B5.c) r6
            i0.b r15 = (i0.C1130b) r15
            java.lang.String r15 = r7.f8937c
            if (r15 == 0) goto L5c
            r6.invoke(r15)
        L5c:
            return r5
        L5d:
            androidx.lifecycle.x r7 = (androidx.lifecycle.InterfaceC0660x) r7
            P.c0 r6 = (P.C0348c0) r6
            P.F r15 = (P.F) r15
            java.lang.String r0 = "$this$DisposableEffect"
            kotlin.jvm.internal.m.e(r15, r0)
            W1.f r15 = new W1.f
            r15.<init>(r4, r6)
            androidx.lifecycle.q r0 = r7.getLifecycle()
            r0.a(r15)
            A.X r0 = new A.X
            r1 = 7
            r0.<init>(r1, r7, r15)
            return r0
        L7b:
            R4.x r7 = (R4.C0517x) r7
            R4.k1 r6 = (R4.C0468k1) r6
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = r7.f7209g
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.toString()
            java.lang.String r15 = java.net.URLEncoder.encode(r15, r0)
            if (r15 == 0) goto La4
            java.lang.String r0 = ""
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto La4
            T1.u r0 = r6.f7075e
            if (r0 == 0) goto La4
            java.lang.String r1 = "downloadScreen/"
            java.lang.String r15 = r1.concat(r15)
            T1.u.b(r0, r15)
        La4:
            return r5
        La5:
            R4.k1 r7 = (R4.C0468k1) r7
            P.S0 r6 = (P.S0) r6
            android.content.Context r15 = (android.content.Context) r15
            java.lang.String r0 = "context"
            kotlin.jvm.internal.m.e(r15, r0)
            android.widget.RelativeLayout r0 = r7.f7100v
            if (r0 != 0) goto Ld8
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r15)
            int r1 = android.view.View.generateViewId()
            r0.setId(r1)
            r1 = 17
            r0.setGravity(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            U4.D r1 = new U4.D
            r1.<init>()
            r0.addOnLayoutChangeListener(r1)
            r7.f7100v = r0
        Ld8:
            android.widget.RelativeLayout r15 = r7.f7100v
            kotlin.jvm.internal.m.b(r15)
            return r15
        Lde:
            T1.u r7 = (T1.u) r7
            androidx.lifecycle.x r6 = (androidx.lifecycle.InterfaceC0660x) r6
            P.F r15 = (P.F) r15
            r7.getClass()
            java.lang.String r15 = "owner"
            kotlin.jvm.internal.m.e(r6, r15)
            W1.j r15 = r7.f7418b
            W1.f r0 = r15.f8080r
            androidx.lifecycle.x r1 = r15.f8076n
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Lf9
            goto L10f
        Lf9:
            androidx.lifecycle.x r1 = r15.f8076n
            if (r1 == 0) goto L106
            androidx.lifecycle.q r1 = r1.getLifecycle()
            if (r1 == 0) goto L106
            r1.c(r0)
        L106:
            r15.f8076n = r6
            androidx.lifecycle.q r15 = r6.getLifecycle()
            r15.a(r0)
        L10f:
            U1.D r15 = new U1.D
            r15.<init>()
            return r15
        L115:
            P.S0 r7 = (P.S0) r7
            U1.i r6 = (U1.i) r6
            P.F r15 = (P.F) r15
            A.X r15 = new A.X
            r0 = 5
            r15.<init>(r0, r7, r6)
            return r15
        L122:
            T1.p r7 = (T1.p) r7
            T1.u r6 = (T1.u) r6
            W1.j r0 = r6.f7418b
            T1.x r15 = (T1.x) r15
            java.lang.String r2 = "$this$navOptions"
            kotlin.jvm.internal.m.e(r15, r2)
            M.t r2 = r15.f7429a
            r2.f3616a = r1
            r2.f3617b = r1
            boolean r1 = r7 instanceof T1.r
            if (r1 == 0) goto L19d
            int r1 = T1.p.f7402u
            I5.i r1 = n5.AbstractC1397A.u(r7)
            java.util.Iterator r1 = r1.iterator()
        L143:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L160
            java.lang.Object r2 = r1.next()
            T1.p r2 = (T1.p) r2
            T1.p r6 = r0.f()
            if (r6 == 0) goto L158
            T1.r r6 = r6.f7405s
            goto L159
        L158:
            r6 = r3
        L159:
            boolean r2 = kotlin.jvm.internal.m.a(r2, r6)
            if (r2 == 0) goto L143
            goto L19d
        L160:
            int r1 = T1.r.f7412w
            T1.r r0 = r0.g()
            I5.m r1 = new I5.m
            r2 = 15
            r1.<init>(r2)
            I5.i r0 = I5.k.R(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L195
            java.lang.Object r1 = r0.next()
        L17f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L18a
            java.lang.Object r1 = r0.next()
            goto L17f
        L18a:
            T1.p r1 = (T1.p) r1
            W1.l r0 = r1.f7404r
            int r0 = r0.f8091a
            r15.f7431c = r0
            r15.f7432d = r4
            goto L19d
        L195:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Sequence is empty."
            r15.<init>(r0)
            throw r15
        L19d:
            return r5
        L19e:
            R4.s0 r7 = (R4.C0498s0) r7
            R4.k1 r0 = r7.f7181b
            w1.o0 r6 = (w1.o0) r6
            w1.l0 r1 = r6.f18232a
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r2 = r15.booleanValue()
            if (r2 == 0) goto L1be
            i1.a r15 = r0.f7065Y
            if (r15 == 0) goto L1f6
            int r0 = w1.V.b()
            java.lang.Object r15 = r15.f13535r
            C3.a r15 = (C3.a) r15
            r15.S(r0)
            goto L1f6
        L1be:
            int r2 = w1.V.m()
            boolean r2 = r1.q(r2)
            if (r2 == r4) goto L1d8
            int r2 = w1.V.b()
            boolean r1 = r1.q(r2)
            if (r1 != r4) goto L1f6
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L1f6
        L1d8:
            i1.a r15 = r0.f7065Y
            if (r15 == 0) goto L1e7
            int r1 = w1.V.m()
            java.lang.Object r15 = r15.f13535r
            C3.a r15 = (C3.a) r15
            r15.D(r1)
        L1e7:
            i1.a r15 = r0.f7065Y
            if (r15 == 0) goto L1f6
            int r0 = w1.V.b()
            java.lang.Object r15 = r15.f13535r
            C3.a r15 = (C3.a) r15
            r15.D(r0)
        L1f6:
            return r5
        L1f7:
            R4.k1 r7 = (R4.C0468k1) r7
            P.c0 r6 = (P.C0348c0) r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r15 != 0) goto L201
            goto L2ad
        L201:
            int r15 = r15.intValue()
            r0 = 100
            if (r15 != r0) goto L2ad
            android.webkit.WebView r15 = r7.f7084k
            if (r15 == 0) goto L212
            java.lang.String r15 = r15.getUrl()
            goto L213
        L212:
            r15 = r3
        L213:
            R4.i r0 = r7.f7073d
            if (r0 == 0) goto L21a
            java.util.List r0 = r0.i
            goto L21b
        L21a:
            r0 = r3
        L21b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L23e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L228:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L23e
            java.lang.Object r7 = r0.next()
            R4.A r7 = (R4.A) r7
            java.lang.String r7 = r7.f
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r4.add(r7)
            goto L228
        L23e:
            int r0 = r4.size()
            r7 = r1
            r8 = r7
        L244:
            if (r8 >= r0) goto L2aa
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            int r10 = r7 + 1
            if (r7 < 0) goto L2a6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "pattern"
            kotlin.jvm.internal.m.e(r9, r11)
            r11 = 66
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9, r11)
            java.lang.String r11 = "compile(...)"
            kotlin.jvm.internal.m.d(r9, r11)
            java.lang.String r11 = java.lang.String.valueOf(r15)
            java.util.regex.Matcher r11 = r9.matcher(r11)
            boolean r11 = r11.matches()
            if (r11 == 0) goto L271
            goto L2a3
        L271:
            java.lang.Object r11 = r4.get(r7)
            java.lang.String r12 = "get(...)"
            kotlin.jvm.internal.m.d(r11, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r13 = "$))"
            boolean r11 = J5.t.A0(r11, r13, r1)
            if (r11 != 0) goto L2a4
            java.lang.Object r11 = r4.get(r7)
            kotlin.jvm.internal.m.d(r11, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "$)"
            boolean r11 = J5.t.A0(r11, r12, r1)
            if (r11 != 0) goto L2a4
            java.lang.String r11 = java.lang.String.valueOf(r15)
            java.util.regex.Matcher r9 = r9.matcher(r11)
            boolean r9 = r9.find()
            if (r9 == 0) goto L2a4
        L2a3:
            r2 = r7
        L2a4:
            r7 = r10
            goto L244
        L2a6:
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            throw r3
        L2aa:
            r6.f(r2)
        L2ad:
            return r5
        L2ae:
            N5.f r7 = (N5.f) r7
            N5.c r6 = (N5.c) r6
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            android.os.Handler r15 = r7.f4041q
            r15.removeCallbacks(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.invoke(java.lang.Object):java.lang.Object");
    }
}
