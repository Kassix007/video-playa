package u;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.c f16830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1645d0 f16831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v0 f16835v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Object obj, InterfaceC1524c interfaceC1524c, C1645d0 c1645d0, v0 v0Var) {
        super(2, interfaceC1524c);
        this.f16833t = c1645d0;
        this.f16834u = obj;
        this.f16835v = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new U(this.f16834u, interfaceC1524c, this.f16833t, this.f16835v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f16832s
            m5.y r4 = m5.C1386y.f15098a
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            r12 = 0
            java.lang.Object r13 = r1.f16834u
            u.d0 r14 = r1.f16833t
            r15 = 0
            r16 = -9223372036854775808
            r5.a r2 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L4b
            if (r0 == r9) goto L43
            if (r0 == r8) goto L3e
            if (r0 == r7) goto L39
            if (r0 == r6) goto L31
            if (r0 != r5) goto L29
            m5.AbstractC1362a.e(r26)
            r9 = r12
            goto L18e
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L31:
            m5.AbstractC1362a.e(r26)
            r26 = r12
            r0 = r13
            goto L180
        L39:
            m5.AbstractC1362a.e(r26)
            goto Lbf
        L3e:
            m5.AbstractC1362a.e(r26)
            goto Lb5
        L43:
            u.d0 r0 = r1.f16831r
            U5.c r3 = r1.f16830q
            m5.AbstractC1362a.e(r26)
            goto L81
        L4b:
            m5.AbstractC1362a.e(r26)
            P.f0 r0 = r14.f16907s
            java.lang.Object r0 = r0.getValue()
            boolean r3 = r13.equals(r0)
            if (r3 != 0) goto L70
            u.C1645d0.p(r14)
            r14.y(r12)
            u.v0 r3 = r1.f16835v
            r3.p(r13)
            r3.n(r10)
            r14.l(r0)
            P.f0 r0 = r14.f16907s
            r0.setValue(r13)
        L70:
            U5.c r3 = r14.f16899A
            r1.f16830q = r3
            r1.f16831r = r14
            r1.f16832s = r9
            java.lang.Object r0 = r3.e(r1)
            if (r0 != r2) goto L80
            goto L18b
        L80:
            r0 = r14
        L81:
            java.lang.Object r0 = r0.f16909u     // Catch: java.lang.Throwable -> L192
            r3.g(r15)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto Lbf
            r1.f16830q = r15
            r1.f16831r = r15
            r1.f16832s = r8
            long r8 = r14.f16901C
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 != 0) goto La9
            u.T r0 = r14.f16904F
            q5.h r3 = r1.getContext()
            P.T r3 = P.C0345b.o(r3)
            java.lang.Object r0 = r3.e(r0, r1)
            if (r0 != r2) goto Lb0
            goto Lb1
        La9:
            java.lang.Object r0 = r14.u(r1)
            if (r0 != r2) goto Lb0
            goto Lb1
        Lb0:
            r0 = r4
        Lb1:
            if (r0 != r2) goto Lb5
            goto L18b
        Lb5:
            r1.f16832s = r7
            java.lang.Object r0 = u.C1645d0.t(r14, r1)
            if (r0 != r2) goto Lbf
            goto L18b
        Lbf:
            P.f0 r0 = r14.f16908t
            P.b0 r3 = r14.f16913y
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.m.a(r0, r13)
            if (r0 != 0) goto L191
            float r0 = r3.e()
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto Le4
            u.S r0 = r14.f16903E
            if (r0 == 0) goto Lea
            u.E0 r8 = r0.f16822b
            boolean r8 = kotlin.jvm.internal.m.a(r15, r8)
            if (r8 != 0) goto Le4
            goto Lea
        Le4:
            r26 = r12
            r24 = r13
            goto L171
        Lea:
            if (r0 == 0) goto Lf1
            u.E0 r8 = r0.f16822b
            r18 = r8
            goto Lf3
        Lf1:
            r18 = r15
        Lf3:
            u.m r8 = u.C1645d0.f16897I
            if (r18 == 0) goto L117
            r9 = r12
            r24 = r13
            long r12 = r0.f16821a
            u.m r7 = r0.f16825e
            r26 = r9
            u.m r9 = r0.f
            if (r9 != 0) goto L107
            r23 = r8
            goto L109
        L107:
            r23 = r9
        L109:
            u.m r22 = u.C1645d0.f16898J
            r21 = r7
            r19 = r12
            u.q r7 = r18.n(r19, r21, r22, r23)
            r8 = r7
            u.m r8 = (u.C1659m) r8
            goto L13c
        L117:
            r26 = r12
            r24 = r13
            if (r0 == 0) goto L13c
            long r12 = r0.f16821a
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L124
            goto L13c
        L124:
            long r12 = r0.f16826g
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 != 0) goto L12c
            long r12 = r14.f16911w
        L12c:
            float r9 = (float) r12
            r12 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r9 = r9 / r12
            int r12 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r12 > 0) goto L136
            goto L13c
        L136:
            u.m r8 = new u.m
            float r7 = r7 / r9
            r8.<init>(r7)
        L13c:
            if (r0 != 0) goto L143
            u.S r0 = new u.S
            r0.<init>()
        L143:
            u.m r7 = r0.f16825e
            r0.f16822b = r15
            r9 = 0
            r0.f16823c = r9
            float r12 = r3.e()
            r0.f16824d = r12
            float r12 = r3.e()
            r7.e(r9, r12)
            long r12 = r14.f16911w
            r0.f16826g = r12
            r0.f16821a = r10
            r0.f = r8
            double r7 = (double) r12
            float r3 = r3.e()
            double r9 = (double) r3
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 - r9
            double r11 = r11 * r7
            long r7 = D5.a.H(r11)
            r0.f16827h = r7
            r14.f16903E = r0
        L171:
            r1.f16830q = r15
            r1.f16831r = r15
            r1.f16832s = r6
            java.lang.Object r0 = u.C1645d0.r(r14, r1)
            if (r0 != r2) goto L17e
            goto L18b
        L17e:
            r0 = r24
        L180:
            r14.l(r0)
            r1.f16832s = r5
            java.lang.Object r0 = u.C1645d0.s(r14, r1)
            if (r0 != r2) goto L18c
        L18b:
            return r2
        L18c:
            r9 = r26
        L18e:
            r14.y(r9)
        L191:
            return r4
        L192:
            r0 = move-exception
            r3.g(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
