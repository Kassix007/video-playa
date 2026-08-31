package L;

import P5.InterfaceC0398i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3024s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f3022q = i;
        this.f3024s = obj;
        this.f3023r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r1v9, types: [B5.e, s5.i] */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r12, q5.InterfaceC1524c r13) {
        /*
            r11 = this;
            int r0 = r11.f3022q
            switch(r0) {
                case 0: goto Lff;
                case 1: goto Lc9;
                case 2: goto L6a;
                default: goto L5;
            }
        L5:
            boolean r0 = r13 instanceof P5.B
            if (r0 == 0) goto L18
            r0 = r13
            P5.B r0 = (P5.B) r0
            int r1 = r0.f6334r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f6334r = r1
            goto L1d
        L18:
            P5.B r0 = new P5.B
            r0.<init>(r11, r13)
        L1d:
            java.lang.Object r13 = r0.f6333q
            int r1 = r0.f6334r
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            m5.AbstractC1362a.e(r13)
            goto L67
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            P5.i r12 = r0.f6337u
            java.lang.Object r1 = r0.f6336t
            m5.AbstractC1362a.e(r13)
            goto L59
        L3f:
            m5.AbstractC1362a.e(r13)
            java.lang.Object r13 = r11.f3024s
            P5.i r13 = (P5.InterfaceC0398i) r13
            java.lang.Object r1 = r11.f3023r
            s5.i r1 = (s5.i) r1
            r0.f6336t = r12
            r0.f6337u = r13
            r0.f6334r = r3
            java.lang.Object r1 = r1.invoke(r12, r0)
            if (r1 != r4) goto L57
            goto L69
        L57:
            r1 = r12
            r12 = r13
        L59:
            r13 = 0
            r0.f6336t = r13
            r0.f6337u = r13
            r0.f6334r = r2
            java.lang.Object r12 = r12.emit(r1, r0)
            if (r12 != r4) goto L67
            goto L69
        L67:
            m5.y r4 = m5.C1386y.f15098a
        L69:
            return r4
        L6a:
            boolean r0 = r13 instanceof P5.v
            if (r0 == 0) goto L7d
            r0 = r13
            P5.v r0 = (P5.v) r0
            int r1 = r0.f6449s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L7d
            int r1 = r1 - r2
            r0.f6449s = r1
            goto L82
        L7d:
            P5.v r0 = new P5.v
            r0.<init>(r11, r13)
        L82:
            java.lang.Object r13 = r0.f6448r
            int r1 = r0.f6449s
            r2 = 1
            if (r1 == 0) goto L9b
            if (r1 != r2) goto L93
            java.lang.Object r12 = r0.f6451u
            L.e r0 = r0.f6447q
            m5.AbstractC1362a.e(r13)
            goto Lb2
        L93:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L9b:
            m5.AbstractC1362a.e(r13)
            java.lang.Object r13 = r11.f3024s
            B5.e r13 = (B5.e) r13
            r0.f6447q = r11
            r0.f6451u = r12
            r0.f6449s = r2
            java.lang.Object r13 = r13.invoke(r12, r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r13 != r0) goto Lb1
            goto Lbc
        Lb1:
            r0 = r11
        Lb2:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lbd
            m5.y r0 = m5.C1386y.f15098a
        Lbc:
            return r0
        Lbd:
            java.lang.Object r13 = r0.f3023r
            kotlin.jvm.internal.y r13 = (kotlin.jvm.internal.y) r13
            r13.f14268q = r12
            Q5.a r12 = new Q5.a
            r12.<init>(r0)
            throw r12
        Lc9:
            y.h r12 = (y.h) r12
            java.lang.Object r13 = r11.f3024s
            L.b r13 = (L.b) r13
            boolean r0 = r12 instanceof y.m
            if (r0 == 0) goto Le3
            boolean r0 = r13.f3014M
            if (r0 == 0) goto Ldd
            y.m r12 = (y.m) r12
            r13.x0(r12)
            goto Lfc
        Ldd:
            r.C r13 = r13.f3015N
            r13.a(r12)
            goto Lfc
        Le3:
            java.lang.Object r0 = r11.f3023r
            M5.w r0 = (M5.InterfaceC0261w) r0
            L.s r1 = r13.f3011J
            if (r1 != 0) goto Lf9
            L.s r1 = new L.s
            boolean r2 = r13.f3007F
            M.r r3 = r13.f3010I
            r1.<init>(r2, r3)
            B0.AbstractC0041g.l(r13)
            r13.f3011J = r1
        Lf9:
            r1.d(r12, r0)
        Lfc:
            m5.y r12 = m5.C1386y.f15098a
            return r12
        Lff:
            y.h r12 = (y.h) r12
            java.lang.Object r13 = r11.f3024s
            L.a r13 = (L.a) r13
            boolean r0 = r12 instanceof y.k
            if (r0 == 0) goto L145
            r2 = r12
            y.k r2 = (y.k) r2
            L.i r12 = r13.f3003x
            if (r12 == 0) goto L111
            goto L11c
        L111:
            android.view.ViewGroup r12 = r13.f3002w
            L.i r12 = n5.AbstractC1397A.j(r12)
            r13.f3003x = r12
            kotlin.jvm.internal.m.b(r12)
        L11c:
            L.k r1 = r12.a(r13)
            boolean r3 = r13.f2998s
            long r4 = r13.f2993A
            int r6 = r13.f2994B
            P.W r12 = r13.f3000u
            java.lang.Object r12 = r12.getValue()
            j0.o r12 = (j0.o) r12
            long r7 = r12.f13724a
            P.W r12 = r13.f3001v
            java.lang.Object r12 = r12.getValue()
            L.g r12 = (L.g) r12
            float r9 = r12.f3032d
            A0.d r10 = r13.f2995C
            r1.b(r2, r3, r4, r6, r7, r9, r10)
            P.f0 r12 = r13.f3004y
            r12.setValue(r1)
            goto L17a
        L145:
            boolean r0 = r12 instanceof y.l
            if (r0 == 0) goto L15b
            y.l r12 = (y.l) r12
            y.k r12 = r12.f18535a
            P.f0 r12 = r13.f3004y
            java.lang.Object r12 = r12.getValue()
            L.k r12 = (L.k) r12
            if (r12 == 0) goto L17a
            r12.d()
            goto L17a
        L15b:
            boolean r0 = r12 instanceof y.j
            if (r0 == 0) goto L171
            y.j r12 = (y.j) r12
            y.k r12 = r12.f18533a
            P.f0 r12 = r13.f3004y
            java.lang.Object r12 = r12.getValue()
            L.k r12 = (L.k) r12
            if (r12 == 0) goto L17a
            r12.d()
            goto L17a
        L171:
            java.lang.Object r0 = r11.f3023r
            M5.w r0 = (M5.InterfaceC0261w) r0
            L.s r13 = r13.f2997r
            r13.d(r12, r0)
        L17a:
            m5.y r12 = m5.C1386y.f15098a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.emit(java.lang.Object, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public e(InterfaceC0398i interfaceC0398i, B5.e eVar) {
        this.f3022q = 3;
        this.f3024s = interfaceC0398i;
        this.f3023r = (s5.i) eVar;
    }
}
