package C0;

/* JADX INFO: renamed from: C0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0100s extends kotlin.jvm.internal.k implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1105q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0100s(int i, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i, i7, cls, obj, str, str2);
        this.f1105q = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f1105q
            switch(r1) {
                case 0: goto Lda;
                case 1: goto L82;
                case 2: goto L74;
                default: goto L7;
            }
        L7:
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r2 = r0.receiver
            v.x r2 = (v.C1728x) r2
            r.y r3 = r2.f17417Q
            if (r1 == 0) goto L1b
            r2.B0()
            goto L71
        L1b:
            y.i r1 = r2.f17407G
            if (r1 == 0) goto L6e
            java.lang.Object[] r1 = r3.f16262c
            long[] r4 = r3.f16260a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6e
            r7 = 0
        L29:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L69
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L43:
            if (r12 >= r10) goto L67
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L63
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            y.k r13 = (y.k) r13
            M5.w r14 = r2.l0()
            v.e r15 = new v.e
            r6 = 0
            r15.<init>(r2, r13, r6)
            r13 = 3
            M5.AbstractC0263y.t(r14, r6, r6, r15, r13)
        L63:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L43
        L67:
            if (r10 != r11) goto L6e
        L69:
            if (r7 == r5) goto L6e
            int r7 = r7 + 1
            goto L29
        L6e:
            r3.a()
        L71:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L74:
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.receiver
            M5.e0 r2 = (M5.e0) r2
            r2.l(r1)
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L82:
            r1 = r18
            h0.c r1 = (h0.C1110c) r1
            int r1 = r1.f13400a
            java.lang.Object r2 = r0.receiver
            C0.A r2 = (C0.A) r2
            r2.getClass()
            r3 = 7
            if (r1 != r3) goto L93
            goto Lcc
        L93:
            r3 = 8
            if (r1 != r3) goto L98
            goto Lcc
        L98:
            java.lang.Integer r1 = h0.AbstractC1111d.D(r1)
            if (r1 == 0) goto Ld2
            int r1 = r1.intValue()
            i0.c r3 = r2.D()
            if (r3 == 0) goto Lad
            android.graphics.Rect r3 = j0.AbstractC1145B.u(r3)
            goto Lae
        Lad:
            r3 = 0
        Lae:
            android.view.FocusFinder r4 = android.view.FocusFinder.getInstance()
            if (r3 != 0) goto Lbd
            android.view.View r5 = r2.findFocus()
            android.view.View r2 = r4.findNextFocus(r2, r5, r1)
            goto Lc1
        Lbd:
            android.view.View r2 = r4.findNextFocusFromRect(r2, r3, r1)
        Lc1:
            if (r2 == 0) goto Lcc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = h0.AbstractC1111d.z(r2, r1, r3)
            goto Lcd
        Lcc:
            r1 = 0
        Lcd:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        Ld2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid focus direction"
            r1.<init>(r2)
            throw r1
        Lda:
            r1 = r18
            B5.a r1 = (B5.a) r1
            java.lang.Object r2 = r0.receiver
            C0.A r2 = (C0.A) r2
            r.C r2 = r2.f721J0
            int r3 = r2.f(r1)
            if (r3 < 0) goto Leb
            goto Lee
        Leb:
            r2.a(r1)
        Lee:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0100s.invoke(java.lang.Object):java.lang.Object");
    }
}
