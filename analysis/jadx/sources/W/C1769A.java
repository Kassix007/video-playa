package w;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: w.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1769A extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.y f17729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f17733u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769A(kotlin.jvm.internal.y yVar, C c7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17732t = yVar;
        this.f17733u = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1769A c1769a = new C1769A(this.f17732t, this.f17733u, interfaceC1524c);
        c1769a.f17731s = obj;
        return c1769a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1769A) create((B5.c) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003f -> B:25:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f17730r
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            kotlin.jvm.internal.y r0 = r5.f17729q
            java.lang.Object r2 = r5.f17731s
            B5.c r2 = (B5.c) r2
            m5.AbstractC1362a.e(r6)
            goto L50
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            m5.AbstractC1362a.e(r6)
            java.lang.Object r6 = r5.f17731s
            B5.c r6 = (B5.c) r6
            r2 = r6
        L21:
            kotlin.jvm.internal.y r0 = r5.f17732t
            java.lang.Object r6 = r0.f14268q
            boolean r3 = r6 instanceof w.r
            if (r3 != 0) goto L56
            boolean r3 = r6 instanceof w.C1799o
            if (r3 != 0) goto L56
            boolean r3 = r6 instanceof w.C1801p
            r4 = 0
            if (r3 == 0) goto L35
            w.p r6 = (w.C1801p) r6
            goto L36
        L35:
            r6 = r4
        L36:
            if (r6 == 0) goto L3b
            r2.invoke(r6)
        L3b:
            w.C r6 = r5.f17733u
            O5.e r6 = r6.f17748K
            if (r6 == 0) goto L53
            r5.f17731s = r2
            r5.f17729q = r0
            r5.f17730r = r1
            java.lang.Object r6 = r6.h(r5)
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r6 != r3) goto L50
            return r3
        L50:
            r4 = r6
            w.s r4 = (w.AbstractC1806s) r4
        L53:
            r0.f14268q = r4
            goto L21
        L56:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1769A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
