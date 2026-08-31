package w;

import u0.InterfaceC1672a;

/* JADX INFO: renamed from: w.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1805r0 implements InterfaceC1672a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H0 f18051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18052r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1805r0(H0 h02, boolean z5) {
        this.f18051q = h02;
        this.f18052r = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long F(int i, long j, long j7) {
        if (!this.f18052r) {
            return 0L;
        }
        H0 h02 = this.f18051q;
        if (h02.f17790a.b()) {
            return 0L;
        }
        return h02.h(h02.d(h02.f17790a.d(h02.d(h02.g(j7)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u0.InterfaceC1672a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r4, long r6, q5.InterfaceC1524c r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof w.C1804q0
            if (r4 == 0) goto L13
            r4 = r8
            w.q0 r4 = (w.C1804q0) r4
            int r5 = r4.f18049t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f18049t = r5
            goto L1a
        L13:
            w.q0 r4 = new w.q0
            s5.c r8 = (s5.c) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f18047r
            int r8 = r4.f18049t
            r0 = 1
            if (r8 == 0) goto L3e
            if (r8 == r0) goto L38
            r6 = 2
            if (r8 != r6) goto L30
            long r6 = r4.f18046q
            m5.AbstractC1362a.e(r5)
            W0.p r5 = (W0.p) r5
            long r4 = r5.f8030a
            goto L60
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            long r6 = r4.f18046q
            m5.AbstractC1362a.e(r5)
            goto L5c
        L3e:
            m5.AbstractC1362a.e(r5)
            boolean r5 = r3.f18052r
            r1 = 0
            if (r5 == 0) goto L64
            w.H0 r5 = r3.f18051q
            boolean r8 = r5.f17796h
            if (r8 == 0) goto L4f
            r4 = r1
            goto L60
        L4f:
            r4.f18046q = r6
            r4.f18049t = r0
            java.lang.Object r5 = r5.b(r6, r4)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r5 != r4) goto L5c
            return r4
        L5c:
            W0.p r5 = (W0.p) r5
            long r4 = r5.f8030a
        L60:
            long r1 = W0.p.d(r6, r4)
        L64:
            W0.p r4 = new W0.p
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1805r0.n(long, long, q5.c):java.lang.Object");
    }
}
