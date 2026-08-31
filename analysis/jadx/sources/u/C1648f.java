package u;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: u.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.b f16922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O5.i f16925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1642c f16926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ P.W f16927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ P.W f16928w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648f(O5.i iVar, C1642c c1642c, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16925t = iVar;
        this.f16926u = c1642c;
        this.f16927v = w3;
        this.f16928w = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1648f c1648f = new C1648f(this.f16925t, this.f16926u, this.f16927v, this.f16928w, interfaceC1524c);
        c1648f.f16924s = obj;
        return c1648f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1648f) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.f16923r
            O5.i r1 = r11.f16925t
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 != r2) goto L13
            O5.b r0 = r11.f16922q
            java.lang.Object r3 = r11.f16924s
            M5.w r3 = (M5.InterfaceC0261w) r3
            m5.AbstractC1362a.e(r12)
            goto L36
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            m5.AbstractC1362a.e(r12)
            java.lang.Object r12 = r11.f16924s
            M5.w r12 = (M5.InterfaceC0261w) r12
            O5.b r0 = r1.iterator()
            r3 = r12
        L27:
            r11.f16924s = r3
            r11.f16922q = r0
            r11.f16923r = r2
            java.lang.Object r12 = r0.b(r11)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r12 != r4) goto L36
            return r4
        L36:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L61
            java.lang.Object r12 = r0.c()
            java.lang.Object r4 = r1.i()
            java.lang.Object r4 = O5.l.a(r4)
            if (r4 != 0) goto L4e
            r6 = r12
            goto L4f
        L4e:
            r6 = r4
        L4f:
            u.e r5 = new u.e
            P.W r9 = r11.f16928w
            r10 = 0
            u.c r7 = r11.f16926u
            P.W r8 = r11.f16927v
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            r4 = 0
            M5.AbstractC0263y.t(r3, r4, r4, r5, r12)
            goto L27
        L61:
            m5.y r12 = m5.C1386y.f15098a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1648f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
