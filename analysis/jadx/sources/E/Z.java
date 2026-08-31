package E;

import r.C1543B;
import t.C1607f;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1522q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1526u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(int i, int i7, C1543B c1543b, Y y6) {
        super(1);
        this.f1523r = i;
        this.f1524s = i7;
        this.f1525t = c1543b;
        this.f1526u = y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[LOOP:1: B:14:0x0072->B:20:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[SYNTHETIC] */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f1522q
            switch(r1) {
                case 0: goto L53;
                default: goto L7;
            }
        L7:
            r1 = r18
            z0.I r1 = (z0.AbstractC1932I) r1
            java.lang.Object r2 = r0.f1525t
            z0.J[] r2 = (z0.AbstractC1933J[]) r2
            java.lang.Object r3 = r0.f1526u
            t.f r3 = (t.C1607f) r3
            int r4 = r2.length
            r5 = 0
        L15:
            if (r5 >= r4) goto L50
            r6 = r2[r5]
            if (r6 == 0) goto L4d
            t.l r7 = r3.f16607a
            c0.e r8 = r7.f16620b
            int r7 = r6.f18664q
            int r9 = r6.f18665r
            long r10 = (long) r7
            r7 = 32
            long r10 = r10 << r7
            long r12 = (long) r9
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            long r9 = r10 | r12
            int r11 = r0.f1523r
            long r11 = (long) r11
            long r11 = r11 << r7
            int r13 = r0.f1524s
            r16 = r7
            r18 = r8
            long r7 = (long) r13
            long r7 = r7 & r14
            long r11 = r11 | r7
            W0.l r13 = W0.l.f8022q
            r8 = r18
            long r7 = r8.a(r9, r11, r13)
            long r9 = r7 >> r16
            int r9 = (int) r9
            long r7 = r7 & r14
            int r7 = (int) r7
            z0.AbstractC1932I.d(r1, r6, r9, r7)
        L4d:
            int r5 = r5 + 1
            goto L15
        L50:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L53:
            r1 = r18
            E.i r1 = (E.C0126i) r1
            E.q r2 = r1.f1569c
            B5.c r2 = r2.getKey()
            int r3 = r1.f1567a
            int r4 = r0.f1523r
            int r4 = java.lang.Math.max(r4, r3)
            int r1 = r1.f1568b
            int r1 = r1 + r3
            int r1 = r1 + (-1)
            int r5 = r0.f1524s
            int r1 = java.lang.Math.min(r5, r1)
            if (r4 > r1) goto L9f
        L72:
            if (r2 == 0) goto L80
            int r5 = r4 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r2.invoke(r5)
            if (r5 != 0) goto L85
        L80:
            E.g r5 = new E.g
            r5.<init>(r4)
        L85:
            java.lang.Object r6 = r0.f1525t
            r.B r6 = (r.C1543B) r6
            r6.g(r4, r5)
            java.lang.Object r6 = r0.f1526u
            E.Y r6 = (E.Y) r6
            java.lang.Object r7 = r6.f1521d
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r6.f1519b
            int r6 = r4 - r6
            r7[r6] = r5
            if (r4 == r1) goto L9f
            int r4 = r4 + 1
            goto L72
        L9f:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E.Z.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC1933J[] abstractC1933JArr, C1607f c1607f, int i, int i7) {
        super(1);
        this.f1525t = abstractC1933JArr;
        this.f1526u = c1607f;
        this.f1523r = i;
        this.f1524s = i7;
    }
}
