package w;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import v0.C1743l;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17908A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f17910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1743l f17911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f17914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B5.f f17915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ B5.c f17916y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ B5.c f17917z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(InterfaceC0261w interfaceC0261w, B5.f fVar, B5.c cVar, B5.c cVar2, C1784g0 c1784g0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17914w = interfaceC0261w;
        this.f17915x = fVar;
        this.f17916y = cVar;
        this.f17917z = cVar2;
        this.f17908A = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        a1 a1Var = new a1(this.f17914w, this.f17915x, this.f17916y, this.f17917z, this.f17908A, interfaceC1524c);
        a1Var.f17913v = obj;
        return a1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r1 == r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a2, code lost:
    
        if (r1 == r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d9, code lost:
    
        if (w.g1.a(r4, r18) == r14) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f17912u
            M5.x r2 = M5.EnumC0262x.f3898t
            r3 = 3
            v0.g r4 = v0.EnumC1738g.f17455r
            M5.w r5 = r0.f17914w
            w.N r6 = w.N.f17823a
            B5.f r7 = r0.f17915x
            B5.c r8 = r0.f17917z
            m5.y r9 = m5.C1386y.f15098a
            B5.c r10 = r0.f17916y
            w.g0 r12 = r0.f17908A
            r13 = 0
            r5.a r14 = r5.EnumC1580a.f16356q
            switch(r1) {
                case 0: goto L164;
                case 1: goto L157;
                case 2: goto L146;
                case 3: goto L130;
                case 4: goto L125;
                case 5: goto L5c;
                case 6: goto L4b;
                case 7: goto L30;
                case 8: goto L25;
                default: goto L1d;
            }
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r1 = r0.f17913v
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            m5.AbstractC1362a.e(r19)
            r16 = r9
            goto Le7
        L30:
            v0.l r1 = r0.f17911t
            java.lang.Object r2 = r0.f17910s
            v0.l r2 = (v0.C1743l) r2
            java.lang.Object r3 = r0.f17909r
            M5.b0 r3 = (M5.InterfaceC0241b0) r3
            java.lang.Object r4 = r0.f17913v
            v0.y r4 = (v0.y) r4
            m5.AbstractC1362a.e(r19)
            r11 = r3
            r3 = r2
            r2 = r11
            r11 = r1
            r16 = r9
            r1 = r19
            goto Lc0
        L4b:
            java.lang.Object r1 = r0.f17909r
            v0.l r1 = (v0.C1743l) r1
            java.lang.Object r2 = r0.f17913v
            M5.b0 r2 = (M5.InterfaceC0241b0) r2
            m5.AbstractC1362a.e(r19)
            r3 = r1
            r16 = r9
            r1 = r19
            goto La9
        L5c:
            java.lang.Object r1 = r0.f17910s
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            java.lang.Object r3 = r0.f17909r
            v0.l r3 = (v0.C1743l) r3
            java.lang.Object r15 = r0.f17913v
            v0.y r15 = (v0.y) r15
            m5.AbstractC1362a.e(r19)
            r11 = r19
            v0.l r11 = (v0.C1743l) r11
            if (r11 != 0) goto L7c
            long r1 = r3.f17462c
            i0.b r3 = new i0.b
            r3.<init>(r1)
            r8.invoke(r3)
            return r9
        L7c:
            e3.u r16 = w.g1.f17975a
            r16 = r9
            w.U0 r9 = new w.U0
            r9.<init>(r1, r12, r13)
            r1 = 1
            M5.B r2 = M5.AbstractC0263y.t(r5, r13, r2, r9, r1)
            e3.u r1 = w.g1.f17975a
            if (r7 == r1) goto L96
            w.V0 r1 = new w.V0
            r1.<init>(r7, r12, r11, r13)
            w.g1.e(r5, r2, r1)
        L96:
            if (r10 != 0) goto Lac
            r0.f17913v = r2
            r0.f17909r = r3
            r0.f17910s = r13
            r1 = 6
            r0.f17912u = r1
            java.lang.Object r1 = w.g1.g(r15, r4, r0)
            if (r1 != r14) goto La9
            goto L1db
        La9:
            v0.l r1 = (v0.C1743l) r1
            goto Lfe
        Lac:
            r0.f17913v = r15
            r0.f17909r = r2
            r0.f17910s = r3
            r0.f17911t = r11
            r1 = 7
            r0.f17912u = r1
            java.lang.Object r1 = w.g1.f(r15, r4, r0)
            if (r1 != r14) goto Lbf
            goto L1db
        Lbf:
            r4 = r15
        Lc0:
            w.O r1 = (w.O) r1
            boolean r6 = kotlin.jvm.internal.m.a(r1, r6)
            if (r6 == 0) goto Lf0
            long r6 = r11.f17462c
            i0.b r1 = new i0.b
            r1.<init>(r6)
            r10.invoke(r1)
            r0.f17913v = r2
            r0.f17909r = r13
            r0.f17910s = r13
            r0.f17911t = r13
            r1 = 8
            r0.f17912u = r1
            java.lang.Object r1 = w.g1.a(r4, r0)
            if (r1 != r14) goto Le6
            goto L1db
        Le6:
            r1 = r2
        Le7:
            w.Z0 r2 = new w.Z0
            r2.<init>(r12, r13)
            w.g1.e(r5, r1, r2)
            return r16
        Lf0:
            boolean r4 = r1 instanceof w.M
            if (r4 == 0) goto Lf9
            w.M r1 = (w.M) r1
            v0.l r1 = r1.f17821a
            goto Lfe
        Lf9:
            boolean r1 = r1 instanceof w.L
            if (r1 == 0) goto L11f
            r1 = r13
        Lfe:
            if (r1 != 0) goto L113
            w.X0 r1 = new w.X0
            r1.<init>(r12, r13)
            w.g1.e(r5, r2, r1)
            long r1 = r3.f17462c
            i0.b r3 = new i0.b
            r3.<init>(r1)
            r8.invoke(r3)
            return r16
        L113:
            r1.a()
            w.W0 r1 = new w.W0
            r1.<init>(r12, r13)
            w.g1.e(r5, r2, r1)
            throw r13
        L11f:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L125:
            r16 = r9
            java.lang.Object r1 = r0.f17913v
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            m5.AbstractC1362a.e(r19)
            goto L1dc
        L130:
            r16 = r9
            java.lang.Object r1 = r0.f17910s
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            java.lang.Object r2 = r0.f17909r
            v0.l r2 = (v0.C1743l) r2
            java.lang.Object r3 = r0.f17913v
            v0.y r3 = (v0.y) r3
            m5.AbstractC1362a.e(r19)
            r4 = r3
            r3 = r19
            goto L1ba
        L146:
            r16 = r9
            java.lang.Object r1 = r0.f17909r
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            java.lang.Object r2 = r0.f17913v
            v0.y r2 = (v0.y) r2
            m5.AbstractC1362a.e(r19)
            r2 = r1
            r1 = r19
            goto L1a5
        L157:
            r16 = r9
            java.lang.Object r1 = r0.f17913v
            v0.y r1 = (v0.y) r1
            m5.AbstractC1362a.e(r19)
            r11 = r19
            r9 = 1
            goto L179
        L164:
            r16 = r9
            m5.AbstractC1362a.e(r19)
            java.lang.Object r1 = r0.f17913v
            v0.y r1 = (v0.y) r1
            r0.f17913v = r1
            r9 = 1
            r0.f17912u = r9
            java.lang.Object r11 = w.g1.c(r1, r0, r3)
            if (r11 != r14) goto L179
            goto L1db
        L179:
            v0.l r11 = (v0.C1743l) r11
            r11.a()
            e3.u r15 = w.g1.f17975a
            w.Y0 r15 = new w.Y0
            r15.<init>(r12, r13)
            M5.B r2 = M5.AbstractC0263y.t(r5, r13, r2, r15, r9)
            e3.u r9 = w.g1.f17975a
            if (r7 == r9) goto L195
            w.Q0 r9 = new w.Q0
            r9.<init>(r7, r12, r11, r13)
            w.g1.e(r5, r2, r9)
        L195:
            if (r10 != 0) goto L1a8
            r0.f17913v = r1
            r0.f17909r = r2
            r3 = 2
            r0.f17912u = r3
            java.lang.Object r1 = w.g1.g(r1, r4, r0)
            if (r1 != r14) goto L1a5
            goto L1db
        L1a5:
            v0.l r1 = (v0.C1743l) r1
            goto L1f8
        L1a8:
            r0.f17913v = r1
            r0.f17909r = r11
            r0.f17910s = r2
            r0.f17912u = r3
            java.lang.Object r3 = w.g1.f(r1, r4, r0)
            if (r3 != r14) goto L1b7
            goto L1db
        L1b7:
            r4 = r1
            r1 = r2
            r2 = r11
        L1ba:
            w.O r3 = (w.O) r3
            boolean r6 = kotlin.jvm.internal.m.a(r3, r6)
            if (r6 == 0) goto L1e5
            long r2 = r2.f17462c
            i0.b r6 = new i0.b
            r6.<init>(r2)
            r10.invoke(r6)
            r0.f17913v = r1
            r0.f17909r = r13
            r0.f17910s = r13
            r2 = 4
            r0.f17912u = r2
            java.lang.Object r2 = w.g1.a(r4, r0)
            if (r2 != r14) goto L1dc
        L1db:
            return r14
        L1dc:
            w.R0 r2 = new w.R0
            r2.<init>(r12, r13)
            w.g1.e(r5, r1, r2)
            return r16
        L1e5:
            boolean r2 = r3 instanceof w.M
            if (r2 == 0) goto L1ee
            w.M r3 = (w.M) r3
            v0.l r2 = r3.f17821a
            goto L1f3
        L1ee:
            boolean r2 = r3 instanceof w.L
            if (r2 == 0) goto L21b
            r2 = r13
        L1f3:
            r17 = r2
            r2 = r1
            r1 = r17
        L1f8:
            if (r1 != 0) goto L203
            w.S0 r3 = new w.S0
            r3.<init>(r12, r13)
            w.g1.e(r5, r2, r3)
            goto L20e
        L203:
            r1.a()
            w.T0 r3 = new w.T0
            r3.<init>(r12, r13)
            w.g1.e(r5, r2, r3)
        L20e:
            if (r1 == 0) goto L21a
            long r1 = r1.f17462c
            i0.b r3 = new i0.b
            r3.<init>(r1)
            r8.invoke(r3)
        L21a:
            return r16
        L21b:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
