package J5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2839r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u(int i, int i7, Object obj) {
        this.f2838q = i7;
        this.f2839r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    @Override // B5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f2838q
            java.lang.String r2 = "$this$DelimitedRangesSequence"
            r3 = 2
            r4 = 0
            m5.y r6 = m5.C1386y.f15098a
            r7 = 1
            java.lang.Object r8 = r0.f2839r
            switch(r1) {
                case 0: goto L24f;
                case 1: goto L222;
                case 2: goto L1a8;
                case 3: goto L191;
                case 4: goto L15a;
                case 5: goto L144;
                case 6: goto L12e;
                case 7: goto L118;
                case 8: goto L102;
                case 9: goto Lec;
                default: goto L10;
            }
        L10:
            P.W r8 = (P.W) r8
            r12 = r20
            P.o r12 = (P.C0371o) r12
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            if (r2 == r3) goto L24
            r2 = r7
            goto L25
        L24:
            r2 = r4
        L25:
            r1 = r1 & r7
            boolean r1 = r12.K(r1, r2)
            if (r1 == 0) goto Le8
            androidx.compose.foundation.layout.FillElement r1 = androidx.compose.foundation.layout.c.f9279c
            c0.e r2 = c0.C0714b.f10076q
            z0.C r2 = A.AbstractC0017n.d(r2, r4)
            int r9 = r12.f5454P
            P.i0 r10 = r12.m()
            c0.m r11 = c0.AbstractC0727o.c(r12, r1)
            B0.j r13 = B0.InterfaceC0046k.f452a
            r13.getClass()
            B0.D r13 = B0.C0045j.f445b
            r12.W()
            boolean r14 = r12.f5453O
            if (r14 == 0) goto L50
            r12.l(r13)
            goto L53
        L50:
            r12.g0()
        L53:
            B0.i r14 = B0.C0045j.f448e
            P.C0345b.u(r14, r12, r2)
            B0.i r2 = B0.C0045j.f447d
            P.C0345b.u(r2, r12, r10)
            B0.i r10 = B0.C0045j.f
            boolean r15 = r12.f5453O
            if (r15 != 0) goto L71
            java.lang.Object r15 = r12.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
            if (r7 != 0) goto L74
        L71:
            k1.i.o(r9, r12, r9, r10)
        L74:
            B0.i r7 = B0.C0045j.f446c
            P.C0345b.u(r7, r12, r11)
            A.b r9 = A.AbstractC0012i.f108c
            c0.c r11 = c0.C0714b.f10073B
            A.t r9 = A.r.a(r9, r11, r12, r4)
            int r11 = r12.f5454P
            P.i0 r15 = r12.m()
            c0.m r4 = c0.AbstractC0727o.c(r12, r1)
            r12.W()
            boolean r5 = r12.f5453O
            if (r5 == 0) goto L96
            r12.l(r13)
            goto L99
        L96:
            r12.g0()
        L99:
            P.C0345b.u(r14, r12, r9)
            P.C0345b.u(r2, r12, r15)
            boolean r2 = r12.f5453O
            if (r2 != 0) goto Lb1
            java.lang.Object r2 = r12.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 != 0) goto Lb4
        Lb1:
            k1.i.o(r11, r12, r11, r10)
        Lb4:
            P.C0345b.u(r7, r12, r4)
            r13 = 0
            r14 = 7
            r9 = 0
            r10 = 0
            r11 = 0
            U4.AbstractC0534a.t(r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r12.H()
            P.S r4 = P.C0363k.f5418a
            if (r2 != r4) goto Lcf
            U4.m r2 = new U4.m
            r2.<init>(r8, r3)
            r12.d0(r2)
        Lcf:
            r9 = r2
            B5.c r9 = (B5.c) r9
            r13 = 54
            r14 = 4
            r11 = 0
            r10 = r1
            androidx.compose.ui.viewinterop.a.b(r9, r10, r11, r12, r13, r14)
            r1 = 3
            r2 = 0
            r3 = 0
            U4.AbstractC0534a.m(r3, r2, r12, r2, r1)
            r1 = 1
            r12.p(r1)
            r12.p(r1)
            goto Leb
        Le8:
            r12.N()
        Leb:
            return r6
        Lec:
            r1 = r7
            U1.r r8 = (U1.r) r8
            r2 = r20
            P.o r2 = (P.C0371o) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r1 = P.C0345b.w(r1)
            com.google.android.gms.internal.measurement.I1.C(r8, r2, r1)
            return r6
        L102:
            r1 = r7
            B0.o r8 = (B0.C0050o) r8
            r2 = r20
            P.o r2 = (P.C0371o) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r1 = P.C0345b.w(r1)
            r8.k(r1, r2)
            return r6
        L118:
            r1 = r7
            R4.V r8 = (R4.V) r8
            r2 = r20
            P.o r2 = (P.C0371o) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r1 = P.C0345b.w(r1)
            r8.d(r1, r2)
            return r6
        L12e:
            r1 = r7
            B0.o r8 = (B0.C0050o) r8
            r2 = r20
            P.o r2 = (P.C0371o) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r1 = P.C0345b.w(r1)
            r8.h(r1, r2)
            return r6
        L144:
            r1 = r7
            R4.V r8 = (R4.V) r8
            r2 = r20
            P.o r2 = (P.C0371o) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r1 = P.C0345b.w(r1)
            r8.c(r1, r2)
            return r6
        L15a:
            com.web2native.MainActivity r8 = (com.web2native.MainActivity) r8
            r1 = r20
            P.o r1 = (P.C0371o) r1
            r2 = r21
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r4 = com.web2native.MainActivity.f11777U
            r4 = r2 & 3
            if (r4 == r3) goto L172
            r3 = 1
        L16f:
            r16 = 1
            goto L174
        L172:
            r3 = 0
            goto L16f
        L174:
            r2 = r2 & 1
            boolean r2 = r1.K(r2, r3)
            if (r2 == 0) goto L18d
            R4.k1 r2 = r8.f11778Q
            if (r2 == 0) goto L185
            r3 = 0
            n5.AbstractC1397A.e(r2, r1, r3)
            goto L190
        L185:
            java.lang.String r1 = "dataObject"
            kotlin.jvm.internal.m.k(r1)
            r18 = 0
            throw r18
        L18d:
            r1.N()
        L190:
            return r6
        L191:
            R4.V r8 = (R4.V) r8
            r1 = r20
            P.o r1 = (P.C0371o) r1
            r2 = r21
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r16 = 1
            int r2 = P.C0345b.w(r16)
            r8.b(r2, r1)
            return r6
        L1a8:
            r18 = 0
            Q5.y r8 = (Q5.y) r8
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r21
            q5.f r2 = (q5.InterfaceC1527f) r2
            q5.g r3 = r2.getKey()
            q5.h r4 = r8.f6664r
            q5.f r4 = r4.get(r3)
            M5.t r5 = M5.C0258t.f3885r
            if (r3 == r5) goto L1ce
            if (r2 == r4) goto L1cb
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1e3
        L1cb:
            int r1 = r1 + 1
            goto L1e3
        L1ce:
            M5.b0 r4 = (M5.InterfaceC0241b0) r4
            M5.b0 r2 = (M5.InterfaceC0241b0) r2
        L1d2:
            if (r2 != 0) goto L1d7
            r5 = r18
            goto L1df
        L1d7:
            if (r2 != r4) goto L1da
            goto L1de
        L1da:
            boolean r3 = r2 instanceof R5.r
            if (r3 != 0) goto L20d
        L1de:
            r5 = r2
        L1df:
            if (r5 != r4) goto L1e8
            if (r4 != 0) goto L1cb
        L1e3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L1e8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ", expected child of "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L20d:
            R5.r r2 = (R5.r) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = M5.i0.f3865r
            java.lang.Object r2 = r3.get(r2)
            M5.k r2 = (M5.InterfaceC0250k) r2
            if (r2 == 0) goto L21f
            M5.b0 r3 = r2.getParent()
            r2 = r3
            goto L1d2
        L21f:
            r2 = r18
            goto L1d2
        L222:
            r18 = 0
            char[] r8 = (char[]) r8
            r1 = r20
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            kotlin.jvm.internal.m.e(r1, r2)
            r2 = 0
            int r1 = J5.m.T0(r1, r8, r3, r2)
            if (r1 >= 0) goto L23f
            r5 = r18
            goto L24e
        L23f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            m5.j r5 = new m5.j
            r5.<init>(r1, r2)
        L24e:
            return r5
        L24f:
            r18 = 0
            java.util.List r8 = (java.util.List) r8
            r11 = r20
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            kotlin.jvm.internal.m.e(r11, r2)
            java.util.Collection r8 = (java.util.Collection) r8
            int r2 = r8.size()
            r3 = 1
            if (r2 != r3) goto L2ce
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.List
            if (r2 == 0) goto L291
            java.util.List r8 = (java.util.List) r8
            int r2 = r8.size()
            if (r2 == 0) goto L289
            if (r2 != r3) goto L281
            r2 = 0
            java.lang.Object r2 = r8.get(r2)
            goto L2a6
        L281:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "List has more than one element."
            r1.<init>(r2)
            throw r1
        L289:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "List is empty."
            r1.<init>(r2)
            throw r1
        L291:
            java.util.Iterator r2 = r8.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c6
            java.lang.Object r3 = r2.next()
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L2be
            r2 = r3
        L2a6:
            java.lang.String r2 = (java.lang.String) r2
            r3 = 4
            int r1 = J5.m.S0(r11, r2, r1, r3)
            if (r1 >= 0) goto L2b3
        L2af:
            r3 = r18
            goto L372
        L2b3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            m5.j r3 = new m5.j
            r3.<init>(r1, r2)
            goto L372
        L2be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Collection has more than one element."
            r1.<init>(r2)
            throw r1
        L2c6:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection is empty."
            r1.<init>(r2)
            throw r1
        L2ce:
            r2 = 0
            G5.d r3 = new G5.d
            if (r1 >= 0) goto L2d5
            r4 = r2
            goto L2d6
        L2d5:
            r4 = r1
        L2d6:
            int r1 = r11.length()
            r2 = 1
            r3.<init>(r4, r1, r2)
            boolean r1 = r11 instanceof java.lang.String
            r14 = 0
            int r2 = r3.f2019s
            int r3 = r3.f2018r
            if (r1 == 0) goto L331
            if (r2 <= 0) goto L2eb
            if (r4 <= r3) goto L2ef
        L2eb:
            if (r2 >= 0) goto L2af
            if (r3 > r4) goto L2af
        L2ef:
            r13 = r4
        L2f0:
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L2f7:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L319
            java.lang.Object r4 = r1.next()
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r16 = r11
            java.lang.String r16 = (java.lang.String) r16
            r17 = r14
            int r14 = r15.length()
            r12 = 0
            boolean r5 = J5.t.D0(r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L316
            goto L31d
        L316:
            r14 = r17
            goto L2f7
        L319:
            r17 = r14
            r4 = r18
        L31d:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L32b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            m5.j r3 = new m5.j
            r3.<init>(r1, r4)
            goto L372
        L32b:
            if (r13 == r3) goto L2af
            int r13 = r13 + r2
            r14 = r17
            goto L2f0
        L331:
            r17 = r14
            if (r2 <= 0) goto L337
            if (r4 <= r3) goto L33b
        L337:
            if (r2 >= 0) goto L2af
            if (r3 > r4) goto L2af
        L33b:
            r12 = r4
        L33c:
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L343:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L35e
            java.lang.Object r4 = r1.next()
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            int r13 = r9.length()
            r14 = r17
            boolean r5 = J5.m.Z0(r9, r10, r11, r12, r13, r14)
            if (r5 == 0) goto L343
            goto L360
        L35e:
            r4 = r18
        L360:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L36e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            m5.j r3 = new m5.j
            r3.<init>(r1, r4)
            goto L372
        L36e:
            if (r12 == r3) goto L2af
            int r12 = r12 + r2
            goto L33c
        L372:
            if (r3 == 0) goto L388
            java.lang.Object r1 = r3.f15080q
            java.lang.Object r2 = r3.f15081r
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m5.j r5 = new m5.j
            r5.<init>(r1, r2)
            goto L38a
        L388:
            r5 = r18
        L38a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.u.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ u(int i, Object obj) {
        this.f2838q = i;
        this.f2839r = obj;
    }
}
