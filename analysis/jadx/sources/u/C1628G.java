package u;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1628G extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.v f16777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P.W f16780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1629H f16781u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628G(P.W w3, C1629H c1629h, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16780t = w3;
        this.f16781u = c1629h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1628G c1628g = new C1628G(this.f16780t, this.f16781u, interfaceC1524c);
        c1628g.f16779s = obj;
        return c1628g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((C1628G) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:11:0x003e, B:16:0x005c], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x005c, B:11:0x003e], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[PHI: r8 r9
  0x0055: PHI (r8v1 kotlin.jvm.internal.v) = (r8v2 kotlin.jvm.internal.v), (r8v3 kotlin.jvm.internal.v) binds: [B:12:0x0052, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r9v1 M5.w) = (r9v2 M5.w), (r9v3 M5.w) binds: [B:12:0x0052, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:11:0x003e). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f16778r
            r1 = 1
            r2 = 2
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L20
            if (r0 != r2) goto L18
            kotlin.jvm.internal.v r0 = r11.f16777q
            java.lang.Object r4 = r11.f16779s
            M5.w r4 = (M5.InterfaceC0261w) r4
            m5.AbstractC1362a.e(r12)
            r8 = r0
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            kotlin.jvm.internal.v r0 = r11.f16777q
            java.lang.Object r4 = r11.f16779s
            M5.w r4 = (M5.InterfaceC0261w) r4
            m5.AbstractC1362a.e(r12)
            r8 = r0
            r9 = r4
            goto L55
        L2c:
            m5.AbstractC1362a.e(r12)
            java.lang.Object r12 = r11.f16779s
            M5.w r12 = (M5.InterfaceC0261w) r12
            kotlin.jvm.internal.v r0 = new kotlin.jvm.internal.v
            r0.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.f14265q = r4
            r9 = r12
            r8 = r0
        L3e:
            E.y r5 = new E.y
            u.H r7 = r11.f16781u
            r10 = 1
            P.W r6 = r11.f16780t
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f16779s = r9
            r11.f16777q = r8
            r11.f16778r = r1
            java.lang.Object r12 = u.AbstractC1644d.r(r5, r11)
            if (r12 != r3) goto L55
            goto L7f
        L55:
            float r12 = r8.f14265q
            r0 = 0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L3e
            A0.d r12 = new A0.d
            r0 = 25
            r12.<init>(r0, r9)
            P.Q0 r0 = new P.Q0
            r4 = 0
            r0.<init>(r12, r4)
            u2.m r12 = new u2.m
            r12.<init>(r0)
            u.F r0 = new u.F
            r0.<init>(r2, r4)
            r11.f16779s = r9
            r11.f16777q = r8
            r11.f16778r = r2
            java.lang.Object r12 = P5.H.i(r12, r0, r11)
            if (r12 != r3) goto L3e
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1628G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
