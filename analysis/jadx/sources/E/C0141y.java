package E;

/* JADX INFO: renamed from: E.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141y extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1606u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0141y(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.f1602q = i;
        this.f1603r = obj;
        this.f1604s = obj2;
        this.f1605t = obj3;
        this.f1606u = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f1602q
            switch(r0) {
                case 0: goto L12d;
                case 1: goto L59;
                default: goto L5;
            }
        L5:
            u.j r14 = (u.C1656j) r14
            P.f0 r0 = r14.f16949e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r1 = r13.f1603r
            kotlin.jvm.internal.v r1 = (kotlin.jvm.internal.v) r1
            float r2 = r1.f14265q
            float r0 = r0 - r2
            boolean r2 = w.P.a(r0)
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r13.f1604s
            b2.a r2 = (b2.C0690a) r2
            java.lang.Object r3 = r13.f1605t
            w.E0 r3 = (w.E0) r3
            float r2 = b2.C0690a.a(r2, r3, r0)
            float r2 = r0 - r2
            boolean r2 = w.P.a(r2)
            if (r2 != 0) goto L38
            r14.a()
            goto L56
        L38:
            float r2 = r1.f14265q
            float r2 = r2 + r0
            r1.f14265q = r2
        L3d:
            java.lang.Object r0 = r13.f1606u
            w.V r0 = (w.V) r0
            float r1 = r1.f14265q
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            r14.a()
        L56:
            m5.y r14 = m5.C1386y.f15098a
            return r14
        L59:
            java.lang.Number r14 = (java.lang.Number) r14
            long r0 = r14.longValue()
            java.lang.Object r14 = r13.f1606u
            M5.w r14 = (M5.InterfaceC0261w) r14
            java.lang.Object r2 = r13.f1605t
            kotlin.jvm.internal.v r2 = (kotlin.jvm.internal.v) r2
            java.lang.Object r3 = r13.f1604s
            u.H r3 = (u.C1629H) r3
            java.lang.Object r4 = r13.f1603r
            P.W r4 = (P.W) r4
            java.lang.Object r4 = r4.getValue()
            P.S0 r4 = (P.S0) r4
            if (r4 == 0) goto L82
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            goto L83
        L82:
            r4 = r0
        L83:
            long r6 = r3.f16786c
            R.e r8 = r3.f16784a
            r9 = -9223372036854775808
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r7 = 0
            r9 = 1
            if (r6 == 0) goto L9e
            float r6 = r2.f14265q
            q5.h r10 = r14.d()
            float r10 = u.AbstractC1644d.m(r10)
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L9e
            goto Lba
        L9e:
            r3.f16786c = r0
            java.lang.Object[] r0 = r8.f6676q
            int r1 = r8.f6678s
            r6 = r7
        La5:
            if (r6 >= r1) goto Lb0
            r10 = r0[r6]
            u.E r10 = (u.C1626E) r10
            r10.f16770w = r9
            int r6 = r6 + 1
            goto La5
        Lb0:
            q5.h r14 = r14.d()
            float r14 = u.AbstractC1644d.m(r14)
            r2.f14265q = r14
        Lba:
            float r14 = r2.f14265q
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld9
            java.lang.Object[] r14 = r8.f6676q
            int r0 = r8.f6678s
        Lc5:
            if (r7 >= r0) goto L12a
            r1 = r14[r7]
            u.E r1 = (u.C1626E) r1
            u.n0 r2 = r1.f16768u
            java.lang.Object r2 = r2.f16999c
            P.f0 r3 = r1.f16767t
            r3.setValue(r2)
            r1.f16770w = r9
            int r7 = r7 + 1
            goto Lc5
        Ld9:
            long r0 = r3.f16786c
            long r4 = r4 - r0
            float r0 = (float) r4
            float r0 = r0 / r14
            long r0 = (long) r0
            java.lang.Object[] r14 = r8.f6676q
            int r2 = r8.f6678s
            r4 = r7
            r5 = r9
        Le5:
            if (r4 >= r2) goto L11f
            r6 = r14[r4]
            u.E r6 = (u.C1626E) r6
            boolean r8 = r6.f16769v
            if (r8 != 0) goto L117
            u.H r8 = r6.f16772y
            P.f0 r8 = r8.f16785b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.setValue(r10)
            boolean r8 = r6.f16770w
            if (r8 == 0) goto L100
            r6.f16770w = r7
            r6.f16771x = r0
        L100:
            long r10 = r6.f16771x
            long r10 = r0 - r10
            u.n0 r8 = r6.f16768u
            java.lang.Object r8 = r8.b(r10)
            P.f0 r12 = r6.f16767t
            r12.setValue(r8)
            u.n0 r8 = r6.f16768u
            boolean r8 = r8.g(r10)
            r6.f16769v = r8
        L117:
            boolean r6 = r6.f16769v
            if (r6 != 0) goto L11c
            r5 = r7
        L11c:
            int r4 = r4 + 1
            goto Le5
        L11f:
            r14 = r5 ^ 1
            P.f0 r0 = r3.f16787d
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r0.setValue(r14)
        L12a:
            m5.y r14 = m5.C1386y.f15098a
            return r14
        L12d:
            P.F r14 = (P.F) r14
            java.lang.Object r14 = r13.f1603r
            E.K r14 = (E.K) r14
            B0.G0 r0 = new B0.G0
            java.lang.Object r1 = r13.f1604s
            E.u r1 = (E.C0137u) r1
            java.lang.Object r2 = r13.f1605t
            z0.S r2 = (z0.S) r2
            java.lang.Object r3 = r13.f1606u
            E.d0 r3 = (E.d0) r3
            r4 = 3
            r0.<init>(r1, r2, r3, r4)
            r14.f1490c = r0
            C0.Y r0 = new C0.Y
            r1 = 2
            r0.<init>(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C0141y.invoke(java.lang.Object):java.lang.Object");
    }
}
