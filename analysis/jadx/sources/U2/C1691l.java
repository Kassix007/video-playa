package u2;

import P5.InterfaceC0398i;

/* JADX INFO: renamed from: u2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1691l implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f17158r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1691l(InterfaceC0398i interfaceC0398i, int i) {
        this.f17157q = i;
        this.f17158r = interfaceC0398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r14, q5.InterfaceC1524c r15) {
        /*
            r13 = this;
            int r0 = r13.f17157q
            m5.y r1 = m5.C1386y.f15098a
            r2 = 0
            E2.b r3 = E2.b.f1677t
            P5.i r4 = r13.f17158r
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r5.a r6 = r5.EnumC1580a.f16356q
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            switch(r0) {
                case 0: goto L7c;
                default: goto L13;
            }
        L13:
            boolean r0 = r15 instanceof u2.q
            if (r0 == 0) goto L24
            r0 = r15
            u2.q r0 = (u2.q) r0
            int r9 = r0.f17182r
            r10 = r9 & r7
            if (r10 == 0) goto L24
            int r9 = r9 - r7
            r0.f17182r = r9
            goto L29
        L24:
            u2.q r0 = new u2.q
            r0.<init>(r13, r15)
        L29:
            java.lang.Object r15 = r0.f17181q
            int r7 = r0.f17182r
            if (r7 == 0) goto L3b
            if (r7 != r8) goto L35
            m5.AbstractC1362a.e(r15)
            goto L7b
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r5)
            throw r14
        L3b:
            m5.AbstractC1362a.e(r15)
            W0.a r14 = (W0.a) r14
            long r14 = r14.f8007a
            E2.e r5 = u2.w.f17192b
            boolean r5 = W0.a.k(r14)
            if (r5 == 0) goto L4b
            goto L70
        L4b:
            boolean r2 = W0.a.d(r14)
            if (r2 == 0) goto L5b
            int r2 = W0.a.h(r14)
            E2.a r5 = new E2.a
            r5.<init>(r2)
            goto L5c
        L5b:
            r5 = r3
        L5c:
            boolean r2 = W0.a.c(r14)
            if (r2 == 0) goto L6b
            int r14 = W0.a.g(r14)
            E2.a r3 = new E2.a
            r3.<init>(r14)
        L6b:
            E2.h r2 = new E2.h
            r2.<init>(r5, r3)
        L70:
            if (r2 == 0) goto L7b
            r0.f17182r = r8
            java.lang.Object r14 = r4.emit(r2, r0)
            if (r14 != r6) goto L7b
            r1 = r6
        L7b:
            return r1
        L7c:
            boolean r0 = r15 instanceof u2.C1690k
            if (r0 == 0) goto L8d
            r0 = r15
            u2.k r0 = (u2.C1690k) r0
            int r9 = r0.f17155r
            r10 = r9 & r7
            if (r10 == 0) goto L8d
            int r9 = r9 - r7
            r0.f17155r = r9
            goto L92
        L8d:
            u2.k r0 = new u2.k
            r0.<init>(r13, r15)
        L92:
            java.lang.Object r15 = r0.f17154q
            int r7 = r0.f17155r
            if (r7 == 0) goto La5
            if (r7 != r8) goto L9f
            m5.AbstractC1362a.e(r15)
            goto L11a
        L9f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r5)
            throw r14
        La5:
            m5.AbstractC1362a.e(r15)
            i0.e r14 = (i0.C1133e) r14
            long r14 = r14.f13533a
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r5 != 0) goto Lb8
            E2.h r2 = E2.h.f1687c
            goto L10f
        Lb8:
            E2.e r5 = u2.w.f17192b
            float r5 = i0.C1133e.d(r14)
            double r9 = (double) r5
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L10f
            float r5 = i0.C1133e.b(r14)
            double r9 = (double) r5
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L10f
            E2.h r2 = new E2.h
            float r5 = i0.C1133e.d(r14)
            boolean r7 = java.lang.Float.isInfinite(r5)
            if (r7 != 0) goto Lee
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto Lee
            float r5 = i0.C1133e.d(r14)
            int r5 = D5.a.G(r5)
            E2.a r7 = new E2.a
            r7.<init>(r5)
            goto Lef
        Lee:
            r7 = r3
        Lef:
            float r5 = i0.C1133e.b(r14)
            boolean r9 = java.lang.Float.isInfinite(r5)
            if (r9 != 0) goto L10c
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L10c
            float r14 = i0.C1133e.b(r14)
            int r14 = D5.a.G(r14)
            E2.a r3 = new E2.a
            r3.<init>(r14)
        L10c:
            r2.<init>(r7, r3)
        L10f:
            if (r2 == 0) goto L11a
            r0.f17155r = r8
            java.lang.Object r14 = r4.emit(r2, r0)
            if (r14 != r6) goto L11a
            r1 = r6
        L11a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1691l.emit(java.lang.Object, q5.c):java.lang.Object");
    }
}
