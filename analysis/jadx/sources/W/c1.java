package w;

import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0241b0 f17937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s5.i f17938t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(InterfaceC0241b0 interfaceC0241b0, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17937s = interfaceC0241b0;
        this.f17938t = (s5.i) eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.e, s5.i] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        c1 c1Var = new c1(this.f17937s, this.f17938t, interfaceC1524c);
        c1Var.f17936r = obj;
        return c1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.f17938t.invoke(r0, r4) == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [B5.e, s5.i] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f17935q
            r1 = 2
            r2 = 1
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            m5.AbstractC1362a.e(r5)
            goto L43
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r0 = r4.f17936r
            M5.w r0 = (M5.InterfaceC0261w) r0
            m5.AbstractC1362a.e(r5)
            goto L35
        L20:
            m5.AbstractC1362a.e(r5)
            java.lang.Object r5 = r4.f17936r
            r0 = r5
            M5.w r0 = (M5.InterfaceC0261w) r0
            r4.f17936r = r0
            r4.f17935q = r2
            M5.b0 r5 = r4.f17937s
            java.lang.Object r5 = r5.f(r4)
            if (r5 != r3) goto L35
            goto L42
        L35:
            r5 = 0
            r4.f17936r = r5
            r4.f17935q = r1
            s5.i r5 = r4.f17938t
            java.lang.Object r5 = r5.invoke(r0, r4)
            if (r5 != r3) goto L43
        L42:
            return r3
        L43:
            m5.y r5 = m5.C1386y.f15098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
