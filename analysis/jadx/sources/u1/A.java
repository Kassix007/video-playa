package U1;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import u.C1645d0;
import u.v0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f7529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T1.d f7530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v0 f7531u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C1645d0 c1645d0, T1.d dVar, v0 v0Var, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7529s = c1645d0;
        this.f7530t = dVar;
        this.f7531u = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        A a7 = new A(this.f7529s, this.f7530t, this.f7531u, interfaceC1524c);
        a7.f7528r = obj;
        return a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[RETURN] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.f7527q
            m5.y r6 = m5.C1386y.f15098a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            m5.AbstractC1362a.e(r16)
            return r6
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L18:
            m5.AbstractC1362a.e(r16)
            return r6
        L1c:
            m5.AbstractC1362a.e(r16)
            java.lang.Object r0 = r15.f7528r
            M5.w r0 = (M5.InterfaceC0261w) r0
            u.d0 r3 = r15.f7529s
            P.f0 r5 = r3.f16908t
            P.b0 r7 = r3.f16913y
            java.lang.Object r5 = r5.getValue()
            T1.d r8 = r15.f7530t
            boolean r5 = kotlin.jvm.internal.m.a(r5, r8)
            r9 = 0
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r5 != 0) goto L51
            r15.f7527q = r2
            u.v0 r0 = r3.f16910v
            if (r0 != 0) goto L3f
            goto L4d
        L3f:
            u.O r1 = r3.f16900B
            u.V r2 = new u.V
            r2.<init>(r8, r9, r3, r0)
            java.lang.Object r0 = u.C1636O.a(r1, r2, r15)
            if (r0 != r10) goto L4d
            goto L4e
        L4d:
            r0 = r6
        L4e:
            if (r0 != r10) goto L88
            goto L87
        L51:
            u.v0 r2 = r15.f7531u
            P.C r2 = r2.f17077l
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r11 = r2.longValue()
            r2 = 1000000(0xf4240, float:1.401298E-39)
            long r13 = (long) r2
            long r11 = r11 / r13
            float r2 = r7.e()
            float r5 = r7.e()
            float r7 = (float) r11
            float r5 = r5 * r7
            int r5 = (int) r5
            r7 = 6
            u.z0 r5 = u.AbstractC1644d.p(r5, r7, r9)
            U1.s r7 = new U1.s
            r7.<init>(r0, r3, r8)
            r15.f7527q = r1
            r1 = 0
            r0 = r2
            r2 = r5
            r5 = 4
            r4 = r15
            r3 = r7
            java.lang.Object r0 = u.AbstractC1644d.d(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto L88
        L87:
            return r10
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
