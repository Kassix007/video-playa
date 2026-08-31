package Q5;

import P5.InterfaceC0398i;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O5.e f6642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6643r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(O5.e eVar, int i) {
        this.f6642q = eVar;
        this.f6643r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, q5.InterfaceC1524c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Q5.q
            if (r0 == 0) goto L13
            r0 = r8
            Q5.q r0 = (Q5.q) r0
            int r1 = r0.f6641s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6641s = r1
            goto L18
        L13:
            Q5.q r0 = new Q5.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6639q
            int r1 = r0.f6641s
            m5.y r2 = m5.C1386y.f15098a
            r3 = 2
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            m5.AbstractC1362a.e(r8)
            goto L90
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            m5.AbstractC1362a.e(r8)
            goto L4d
        L38:
            m5.AbstractC1362a.e(r8)
            n5.v r8 = new n5.v
            int r1 = r6.f6643r
            r8.<init>(r1, r7)
            r0.f6641s = r4
            O5.e r7 = r6.f6642q
            java.lang.Object r7 = r7.k(r8, r0)
            if (r7 != r5) goto L4d
            goto L8f
        L4d:
            r0.f6641s = r3
            q5.h r7 = r0.getContext()
            M5.AbstractC0263y.i(r7)
            q5.c r8 = n5.AbstractC1397A.v(r0)
            boolean r0 = r8 instanceof R5.g
            if (r0 == 0) goto L61
            R5.g r8 = (R5.g) r8
            goto L62
        L61:
            r8 = 0
        L62:
            if (r8 != 0) goto L66
            r7 = r2
            goto L89
        L66:
            M5.s r0 = r8.f7238t
            boolean r1 = R5.b.j(r0, r7)
            if (r1 == 0) goto L76
            r8.f7240v = r2
            r8.f3809s = r4
            r0.dispatchYield(r7, r8)
            goto L88
        L76:
            M5.B0 r1 = new M5.B0
            M5.t r3 = M5.B0.f3806q
            r1.<init>(r3)
            q5.h r7 = r7.plus(r1)
            r8.f7240v = r2
            r8.f3809s = r4
            r0.dispatchYield(r7, r8)
        L88:
            r7 = r5
        L89:
            if (r7 != r5) goto L8c
            goto L8d
        L8c:
            r7 = r2
        L8d:
            if (r7 != r5) goto L90
        L8f:
            return r5
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.r.emit(java.lang.Object, q5.c):java.lang.Object");
    }
}
