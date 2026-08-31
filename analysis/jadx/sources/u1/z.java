package U1;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import u.C1645d0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f7623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T1.d f7624t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(float f, C1645d0 c1645d0, T1.d dVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7622r = f;
        this.f7623s = c1645d0;
        this.f7624t = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new z(this.f7622r, this.f7623s, this.f7624t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f7621q
            m5.y r1 = m5.C1386y.f15098a
            u.d0 r2 = r8.f7623s
            r3 = 0
            float r4 = r8.f7622r
            r5 = 2
            r6 = 1
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L23
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L17
            m5.AbstractC1362a.e(r9)
            return r1
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            m5.AbstractC1362a.e(r9)
            goto L39
        L23:
            m5.AbstractC1362a.e(r9)
            int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r9 <= 0) goto L39
            r8.f7621q = r6
            P.f0 r9 = r2.f16907s
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r9 = r2.w(r4, r9, r8)
            if (r9 != r7) goto L39
            goto L70
        L39:
            int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r9 != 0) goto L71
            r8.f7621q = r5
            u.v0 r9 = r2.f16910v
            if (r9 != 0) goto L45
        L43:
            r9 = r1
            goto L6e
        L45:
            P.f0 r0 = r2.f16908t
            java.lang.Object r0 = r0.getValue()
            T1.d r3 = r8.f7624t
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 == 0) goto L60
            P.f0 r0 = r2.f16907s
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 == 0) goto L60
            goto L43
        L60:
            u.O r0 = r2.f16900B
            u.a0 r4 = new u.a0
            r5 = 0
            r4.<init>(r3, r5, r2, r9)
            java.lang.Object r9 = u.C1636O.a(r0, r4, r8)
            if (r9 != r7) goto L43
        L6e:
            if (r9 != r7) goto L71
        L70:
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
