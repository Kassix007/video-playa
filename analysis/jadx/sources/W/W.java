package w;

import b2.C0690a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class W extends s5.i implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ float f17875A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ H0 f17876B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.u f17877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.u f17878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f17882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f17885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0690a f17886z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, float f, C0690a c0690a, float f7, H0 h02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17882v = vVar;
        this.f17883w = yVar;
        this.f17884x = yVar2;
        this.f17885y = f;
        this.f17886z = c0690a;
        this.f17875A = f7;
        this.f17876B = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        W w3 = new W(this.f17882v, this.f17883w, this.f17884x, this.f17885y, this.f17886z, this.f17875A, this.f17876B, interfaceC1524c);
        w3.f17881u = obj;
        return w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((E0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:44:0x0196) to fix multi-entry loop: BACK_EDGE: B:44:0x0196 -> B:38:0x0170 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0167 -> B:37:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0174 -> B:13:0x0067). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            r23 = this;
            r7 = r23
            int r0 = r7.f17880t
            kotlin.jvm.internal.y r1 = r7.f17884x
            kotlin.jvm.internal.v r2 = r7.f17882v
            r8 = 3
            r9 = 2
            r10 = 1
            kotlin.jvm.internal.y r11 = r7.f17883w
            r5.a r12 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L58
            if (r0 == r10) goto L45
            if (r0 == r9) goto L32
            if (r0 != r8) goto L2a
            kotlin.jvm.internal.u r0 = r7.f17878r
            kotlin.jvm.internal.u r3 = r7.f17877q
            java.lang.Object r4 = r7.f17881u
            w.E0 r4 = (w.E0) r4
            m5.AbstractC1362a.e(r24)
            r14 = r0
            r6 = r3
            r13 = r4
            r4 = r11
            r0 = r24
            goto L168
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            int r0 = r7.f17879s
            kotlin.jvm.internal.u r3 = r7.f17877q
            java.lang.Object r4 = r7.f17881u
            w.E0 r4 = (w.E0) r4
            m5.AbstractC1362a.e(r24)
            r20 = r1
            r21 = r2
            r14 = r3
            r13 = r4
            goto L146
        L45:
            kotlin.jvm.internal.u r0 = r7.f17878r
            kotlin.jvm.internal.u r3 = r7.f17877q
            java.lang.Object r4 = r7.f17881u
            w.E0 r4 = (w.E0) r4
            m5.AbstractC1362a.e(r24)
            r14 = r0
            r6 = r3
            r13 = r4
            r4 = r11
            r0 = r24
            goto L196
        L58:
            m5.AbstractC1362a.e(r24)
            java.lang.Object r0 = r7.f17881u
            w.E0 r0 = (w.E0) r0
            kotlin.jvm.internal.u r3 = new kotlin.jvm.internal.u
            r3.<init>()
            r3.f14264q = r10
            r6 = r3
        L67:
            boolean r3 = r6.f14264q
            m5.y r19 = m5.C1386y.f15098a
            if (r3 == 0) goto L1a1
            r3 = 0
            r6.f14264q = r3
            float r3 = r2.f14265q
            java.lang.Object r4 = r11.f14268q
            u.l r4 = (u.C1658l) r4
            P.f0 r4 = r4.f16962r
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = r3 - r4
            java.lang.Object r4 = r1.f14268q
            w.Q r4 = (w.Q) r4
            boolean r4 = r4.f17843c
            b2.a r5 = r7.f17886z
            if (r4 != 0) goto L97
            float r4 = java.lang.Math.abs(r3)
            float r13 = r7.f17885y
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto L9b
        L97:
            r13 = r0
            r4 = r11
            goto L17c
        L9b:
            float r3 = java.lang.Math.signum(r3)
            float r3 = r3 * r13
            b2.C0690a.a(r5, r0, r3)
            java.lang.Object r4 = r11.f14268q
            u.l r4 = (u.C1658l) r4
            P.f0 r5 = r4.f16962r
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 + r3
            r3 = 0
            r13 = 30
            u.l r3 = u.AbstractC1644d.k(r4, r5, r3, r13)
            r11.f14268q = r3
            float r4 = r2.f14265q
            P.f0 r3 = r3.f16962r
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            float r4 = r7.f17875A
            float r3 = r3 / r4
            int r3 = D5.a.G(r3)
            r4 = 100
            if (r3 <= r4) goto Ldd
            r13 = r4
            goto Lde
        Ldd:
            r13 = r3
        Lde:
            java.lang.Object r3 = r11.f14268q
            r14 = r3
            u.l r14 = (u.C1658l) r14
            float r15 = r2.f14265q
            w.V r17 = new w.V
            w.H0 r5 = r7.f17876B
            r4 = r2
            b2.a r2 = r7.f17886z
            r3 = r1
            r1 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r20 = r3
            r21 = r4
            r7.f17881u = r0
            r7.f17877q = r6
            r3 = 0
            r7.f17878r = r3
            r7.f17879s = r13
            r7.f17880t = r9
            r2.getClass()
            kotlin.jvm.internal.v r3 = new kotlin.jvm.internal.v
            r3.<init>()
            P.f0 r4 = r14.f16962r
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r3.f14265q = r4
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r15)
            C0.Z0 r4 = u.AbstractC1670y.f17084b
            u.z0 r4 = u.AbstractC1644d.p(r13, r9, r4)
            r5 = r13
            E.y r13 = new E.y
            r18 = 2
            r16 = r0
            r15 = r2
            r22 = r5
            r0 = r14
            r14 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r2 = r4
            r4 = r13
            r13 = r16
            r3 = 1
            r5 = r7
            java.lang.Object r0 = u.AbstractC1644d.g(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L13e
            goto L140
        L13e:
            r0 = r19
        L140:
            if (r0 != r12) goto L143
            goto L194
        L143:
            r14 = r6
            r0 = r22
        L146:
            boolean r1 = r14.f14264q
            if (r1 != 0) goto L174
            r1 = 50
            long r3 = (long) r0
            long r5 = r1 - r3
            r7.f17881u = r13
            r7.f17877q = r14
            r7.f17878r = r14
            r7.f17880t = r8
            b2.a r0 = r7.f17886z
            w.H0 r3 = r7.f17876B
            r4 = r11
            r1 = r20
            r2 = r21
            java.lang.Object r0 = b2.C0690a.c(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r12) goto L167
            goto L194
        L167:
            r6 = r14
        L168:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14.f14264q = r0
        L170:
            r11 = r4
            r0 = r13
            goto L67
        L174:
            r0 = r13
            r6 = r14
            r1 = r20
            r2 = r21
            goto L67
        L17c:
            b2.C0690a.a(r5, r13, r3)
            r7.f17881u = r13
            r7.f17877q = r6
            r7.f17878r = r6
            r7.f17880t = r10
            b2.a r0 = r7.f17886z
            w.H0 r3 = r7.f17876B
            r14 = r6
            r5 = 50
            java.lang.Object r0 = b2.C0690a.c(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r12) goto L195
        L194:
            return r12
        L195:
            r6 = r14
        L196:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14.f14264q = r0
            r7 = r23
            goto L170
        L1a1:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: w.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
