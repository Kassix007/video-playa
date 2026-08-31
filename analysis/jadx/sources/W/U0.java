package w;

import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0241b0 f17864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17865s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(InterfaceC0241b0 interfaceC0241b0, C1784g0 c1784g0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17864r = interfaceC0241b0;
        this.f17865s = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new U0(this.f17864r, this.f17865s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4.f17865s.e(r4) == r3) goto L15;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f17863q
            r1 = 2
            r2 = 1
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            m5.AbstractC1362a.e(r5)
            goto L35
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            m5.AbstractC1362a.e(r5)
            goto L2a
        L1c:
            m5.AbstractC1362a.e(r5)
            r4.f17863q = r2
            M5.b0 r5 = r4.f17864r
            java.lang.Object r5 = r5.f(r4)
            if (r5 != r3) goto L2a
            goto L34
        L2a:
            r4.f17863q = r1
            w.g0 r5 = r4.f17865s
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r3) goto L35
        L34:
            return r3
        L35:
            m5.y r5 = m5.C1386y.f15098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.U0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
