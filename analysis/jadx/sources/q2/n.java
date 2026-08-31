package Q2;

import kotlin.jvm.internal.y;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class n extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f6552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f6555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f6556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y f6557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f6558w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y yVar, q qVar, y yVar2, t tVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6555t = yVar;
        this.f6556u = qVar;
        this.f6557v = yVar2;
        this.f6558w = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        n nVar = new n(this.f6555t, this.f6556u, this.f6557v, this.f6558w, interfaceC1524c);
        nVar.f6554s = obj;
        return nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((u) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            Q2.q r0 = r11.f6556u
            java.lang.String r1 = r0.f6569a
            int r2 = r11.f6553r
            J2.h r3 = J2.h.f2770t
            r4 = 2
            r5 = 1
            r6 = 0
            kotlin.jvm.internal.y r7 = r11.f6557v
            kotlin.jvm.internal.y r8 = r11.f6555t
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r2 == 0) goto L32
            if (r2 == r5) goto L28
            if (r2 != r4) goto L20
            java.lang.Object r2 = r11.f6554s
            Q2.u r2 = (Q2.u) r2
            m5.AbstractC1362a.e(r12)
            goto L94
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            kotlin.jvm.internal.y r2 = r11.f6552q
            java.lang.Object r5 = r11.f6554s
            Q2.u r5 = (Q2.u) r5
            m5.AbstractC1362a.e(r12)
            goto L51
        L32:
            m5.AbstractC1362a.e(r12)
            java.lang.Object r12 = r11.f6554s
            Q2.u r12 = (Q2.u) r12
            java.lang.Object r2 = r8.f14268q
            K2.h r2 = (K2.h) r2
            java.lang.Object r10 = r7.f14268q
            Q2.u r10 = (Q2.u) r10
            r11.f6554s = r12
            r11.f6552q = r8
            r11.f6553r = r5
            java.lang.Object r2 = Q2.q.c(r0, r2, r10, r12, r11)
            if (r2 != r9) goto L4e
            goto L92
        L4e:
            r5 = r12
            r12 = r2
            r2 = r8
        L51:
            r2.f14268q = r12
            java.lang.Object r12 = r8.f14268q
            if (r12 == 0) goto L82
            K2.h r12 = (K2.h) r12
            Q2.u r12 = r0.i(r12)
            r7.f14268q = r12
            L2.i r12 = new L2.i
            java.lang.Object r2 = r8.f14268q
            kotlin.jvm.internal.m.b(r2)
            K2.h r2 = (K2.h) r2
            J2.p r0 = r0.h(r2)
            java.lang.Object r2 = r7.f14268q
            Q2.u r2 = (Q2.u) r2
            if (r2 == 0) goto L7a
            Q2.s r2 = r2.f6584d
            if (r2 == 0) goto L7a
            java.lang.String r6 = r2.a()
        L7a:
            java.lang.String r1 = Q2.q.f(r1, r6)
            r12.<init>(r0, r1, r3)
            return r12
        L82:
            Q2.v r12 = r5.f6585e
            if (r12 == 0) goto Lb8
            r11.f6554s = r5
            r11.f6552q = r6
            r11.f6553r = r4
            java.lang.Object r12 = com.google.android.gms.internal.measurement.K1.I(r12, r11)
            if (r12 != r9) goto L93
        L92:
            return r9
        L93:
            r2 = r5
        L94:
            q6.g r12 = (q6.C1538g) r12
            long r4 = r12.f16063r
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb7
            L2.i r4 = new L2.i
            q6.l r0 = r0.e()
            J2.s r5 = new J2.s
            r5.<init>(r12, r0, r6)
            Q2.s r12 = r2.f6584d
            java.lang.String r12 = r12.a()
            java.lang.String r12 = Q2.q.f(r1, r12)
            r4.<init>(r5, r12, r3)
            return r4
        Lb7:
            return r6
        Lb8:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "body == null"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
