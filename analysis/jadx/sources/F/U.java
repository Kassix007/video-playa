package F;

import x.C1876h;

/* JADX INFO: loaded from: classes.dex */
public final class U implements w.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1876h f1850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151e f1851b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(C1876h c1876h, C0151e c0151e) {
        this.f1850a = c1876h;
        this.f1851b = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(w.C0 r7, float r8, q5.InterfaceC1524c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof F.T
            if (r0 == 0) goto L13
            r0 = r9
            F.T r0 = (F.T) r0
            int r1 = r0.f1849t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1849t = r1
            goto L1a
        L13:
            F.T r0 = new F.T
            s5.c r9 = (s5.c) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f1847r
            int r1 = r0.f1849t
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            F.U r7 = r0.f1846q
            m5.AbstractC1362a.e(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            m5.AbstractC1362a.e(r9)
            B0.a r9 = new B0.a
            r9.<init>(r6, r7)
            r0.f1846q = r6
            r0.f1849t = r2
            x.h r1 = r6.f1850a
            java.lang.Object r9 = r1.d(r7, r8, r9, r0)
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r9 != r7) goto L48
            return r7
        L48:
            r7 = r6
        L49:
            java.lang.Number r9 = (java.lang.Number) r9
            float r8 = r9.floatValue()
            F.e r7 = r7.f1851b
            F.D r9 = r7.f1821d
            F.D r0 = r7.f1821d
            java.lang.Object r0 = r0.f1779t
            P.b0 r0 = (P.C0346b0) r0
            float r0 = r0.e()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L63
            goto L9e
        L63:
            java.lang.Object r0 = r9.f1779t
            P.b0 r0 = (P.C0346b0) r0
            float r0 = r0.e()
            float r0 = java.lang.Math.abs(r0)
            double r2 = (double) r0
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9e
            int r9 = r7.j()
            p3.z0 r0 = r7.f1825k
            boolean r0 = r0.b()
            if (r0 == 0) goto L99
            P.f0 r0 = r7.f1830p
            java.lang.Object r0 = r0.getValue()
            F.B r0 = (F.B) r0
            M5.w r0 = r0.f1774r
            F.J r2 = new F.J
            r3 = 0
            r2.<init>(r7, r3)
            r4 = 3
            M5.AbstractC0263y.t(r0, r3, r3, r2, r4)
        L99:
            r0 = 0
            r7.s(r9, r1, r0)
            goto La5
        L9e:
            java.lang.Object r7 = r9.f1779t
            P.b0 r7 = (P.C0346b0) r7
            r7.e()
        La5:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F.U.a(w.C0, float, q5.c):java.lang.Object");
    }
}
