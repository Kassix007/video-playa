package w;

import M5.InterfaceC0261w;
import m0.C1346a;
import m5.C1386y;
import q5.InterfaceC1524c;
import v.C1727w;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M5.B f17826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f17828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f17829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1727w f17830v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1346a f17831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17832x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(InterfaceC0261w interfaceC0261w, C1727w c1727w, C1346a c1346a, C1784g0 c1784g0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17829u = interfaceC0261w;
        this.f17830v = c1727w;
        this.f17831w = c1346a;
        this.f17832x = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        O0 o02 = new O0(this.f17829u, this.f17830v, this.f17831w, this.f17832x, interfaceC1524c);
        o02.f17828t = obj;
        return o02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r11 == r6) goto L19;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f17827s
            M5.w r1 = r10.f17829u
            r2 = 2
            r3 = 1
            w.g0 r4 = r10.f17832x
            r5 = 0
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L21
            if (r0 != r2) goto L19
            java.lang.Object r0 = r10.f17828t
            M5.b0 r0 = (M5.InterfaceC0241b0) r0
            m5.AbstractC1362a.e(r11)
            goto L72
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            M5.B r0 = r10.f17826r
            java.lang.Object r3 = r10.f17828t
            v0.y r3 = (v0.y) r3
            m5.AbstractC1362a.e(r11)
            goto L50
        L2b:
            m5.AbstractC1362a.e(r11)
            java.lang.Object r11 = r10.f17828t
            v0.y r11 = (v0.y) r11
            e3.u r0 = w.g1.f17975a
            w.N0 r0 = new w.N0
            r0.<init>(r4, r5)
            M5.x r7 = M5.EnumC0262x.f3898t
            M5.B r0 = M5.AbstractC0263y.t(r1, r5, r7, r0, r3)
            r10.f17828t = r11
            r10.f17826r = r0
            r10.f17827s = r3
            r3 = 3
            java.lang.Object r3 = w.g1.c(r11, r10, r3)
            if (r3 != r6) goto L4d
            goto L71
        L4d:
            r9 = r3
            r3 = r11
            r11 = r9
        L50:
            v0.l r11 = (v0.C1743l) r11
            r11.a()
            e3.u r7 = w.g1.f17975a
            v.w r8 = r10.f17830v
            if (r8 == r7) goto L63
            w.K0 r7 = new w.K0
            r7.<init>(r8, r4, r11, r5)
            w.g1.e(r1, r0, r7)
        L63:
            r10.f17828t = r0
            r10.f17826r = r5
            r10.f17827s = r2
            v0.g r11 = v0.EnumC1738g.f17455r
            java.lang.Object r11 = w.g1.g(r3, r11, r10)
            if (r11 != r6) goto L72
        L71:
            return r6
        L72:
            v0.l r11 = (v0.C1743l) r11
            if (r11 != 0) goto L7f
            w.L0 r11 = new w.L0
            r11.<init>(r4, r5)
            w.g1.e(r1, r0, r11)
            goto L99
        L7f:
            r11.a()
            w.M0 r11 = new w.M0
            r11.<init>(r4, r5)
            w.g1.e(r1, r0, r11)
            m0.a r11 = r10.f17831w
            java.lang.Object r11 = r11.f14918r
            v.x r11 = (v.C1728x) r11
            boolean r0 = r11.f17410J
            if (r0 == 0) goto L99
            B5.a r11 = r11.f17411K
            r11.invoke()
        L99:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w.O0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
