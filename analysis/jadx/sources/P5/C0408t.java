package P5;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0408t extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC0398i f6443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s5.i f6445t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0408t(B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f6445t = (s5.i) eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [B5.e, s5.i] */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0408t c0408t = new C0408t(this.f6445t, (InterfaceC1524c) obj3);
        c0408t.f6443r = (InterfaceC0398i) obj;
        c0408t.f6444s = obj2;
        return c0408t.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.emit(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [B5.e, s5.i] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f6442q
            r1 = 2
            r2 = 1
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            m5.AbstractC1362a.e(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            P5.i r0 = r4.f6443r
            m5.AbstractC1362a.e(r5)
            goto L32
        L1e:
            m5.AbstractC1362a.e(r5)
            P5.i r0 = r4.f6443r
            java.lang.Object r5 = r4.f6444s
            r4.f6443r = r0
            r4.f6442q = r2
            s5.i r2 = r4.f6445t
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 != r3) goto L32
            goto L3d
        L32:
            r2 = 0
            r4.f6443r = r2
            r4.f6442q = r1
            java.lang.Object r5 = r0.emit(r5, r4)
            if (r5 != r3) goto L3e
        L3d:
            return r3
        L3e:
            m5.y r5 = m5.C1386y.f15098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0408t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
