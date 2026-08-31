package M;

/* JADX INFO: loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3383u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(b.m mVar, B5.a aVar, Object obj, W0.l lVar, int i) {
        super(0);
        this.f3379q = i;
        this.f3381s = mVar;
        this.f3380r = aVar;
        this.f3382t = obj;
        this.f3383u = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    @Override // B5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.f3379q
            switch(r0) {
                case 0: goto L74;
                case 1: goto L5e;
                case 2: goto L48;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f3383u
            r5 = r0
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r0 = r7.f3381s
            r4 = r0
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r0 = r7.f3382t
            u.E r0 = (u.C1626E) r0
            java.lang.Number r1 = r0.f16764q
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L23
            java.lang.Number r1 = r0.f16765r
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L45
        L23:
            java.lang.Object r1 = r7.f3380r
            r2 = r1
            u.D r2 = (u.C1625D) r2
            r0.f16764q = r4
            r0.f16765r = r5
            u.n0 r1 = new u.n0
            Z.m r3 = r0.f16766s
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f16768u = r1
            u.H r1 = r0.f16772y
            P.f0 r1 = r1.f16785b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            r1 = 0
            r0.f16769v = r1
            r1 = 1
            r0.f16770w = r1
        L45:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L48:
            java.lang.Object r0 = r7.f3381s
            a1.j r0 = (a1.DialogC0617j) r0
            java.lang.Object r1 = r7.f3380r
            B5.a r1 = (B5.a) r1
            java.lang.Object r2 = r7.f3382t
            a1.i r2 = (a1.C0616i) r2
            java.lang.Object r3 = r7.f3383u
            W0.l r3 = (W0.l) r3
            r0.f(r1, r2, r3)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L5e:
            java.lang.Object r0 = r7.f3381s
            M.M r0 = (M.M) r0
            java.lang.Object r1 = r7.f3380r
            B5.a r1 = (B5.a) r1
            java.lang.Object r2 = r7.f3382t
            M.h0 r2 = (M.C0212h0) r2
            java.lang.Object r3 = r7.f3383u
            W0.l r3 = (W0.l) r3
            r0.e(r1, r2, r3)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L74:
            java.lang.Object r0 = r7.f3382t
            M5.w r0 = (M5.InterfaceC0261w) r0
            java.lang.Object r1 = r7.f3381s
            M.I0 r1 = (M.I0) r1
            N.r r2 = r1.f3322c
            P.f0 r2 = r2.f3973g
            java.lang.Object r2 = r2.getValue()
            M.J0 r2 = (M.J0) r2
            M.J0 r3 = M.J0.f3324r
            r4 = 3
            r5 = 0
            if (r2 != r3) goto Lb1
            N.r r2 = r1.f3322c
            N.y r2 = r2.d()
            M.J0 r3 = M.J0.f3325s
            java.util.Map r2 = r2.f3997a
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto Lb1
            M.N r2 = new M.N
            java.lang.Object r3 = r7.f3383u
            u.c r3 = (u.C1642c) r3
            r2.<init>(r3, r5)
            M5.AbstractC0263y.t(r0, r5, r5, r2, r4)
            M.O r2 = new M.O
            r2.<init>(r1, r5)
            M5.AbstractC0263y.t(r0, r5, r5, r2, r4)
            goto Lc7
        Lb1:
            M.P r2 = new M.P
            r2.<init>(r1, r5)
            M5.B r0 = M5.AbstractC0263y.t(r0, r5, r5, r2, r4)
            M.Q r1 = new M.Q
            java.lang.Object r2 = r7.f3380r
            B5.a r2 = (B5.a) r2
            r3 = 0
            r1.<init>(r2, r3)
            r0.G(r1)
        Lc7:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M.S.invoke():java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.f3379q = i;
        this.f3381s = obj;
        this.f3382t = obj2;
        this.f3383u = obj3;
        this.f3380r = obj4;
    }
}
