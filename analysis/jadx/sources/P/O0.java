package P;

import P5.InterfaceC0397h;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1529h f5354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h f5355t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(InterfaceC1529h interfaceC1529h, InterfaceC0397h interfaceC0397h, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5354s = interfaceC1529h;
        this.f5355t = interfaceC0397h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        O0 o02 = new O0(this.f5354s, this.f5355t, interfaceC1524c);
        o02.f5353r = obj;
        return o02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((C0364k0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4.collect(r0, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (M5.AbstractC0263y.B(r3, r0, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r5;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f5352q
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L13:
            m5.AbstractC1362a.e(r7)
            goto L4a
        L17:
            m5.AbstractC1362a.e(r7)
            java.lang.Object r7 = r6.f5353r
            P.k0 r7 = (P.C0364k0) r7
            q5.i r0 = q5.C1530i.f16022q
            q5.h r3 = r6.f5354s
            boolean r0 = kotlin.jvm.internal.m.a(r3, r0)
            P5.h r4 = r6.f5355t
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L3b
            P.M0 r0 = new P.M0
            r1 = 0
            r0.<init>(r7, r1)
            r6.f5352q = r2
            java.lang.Object r7 = r4.collect(r0, r6)
            if (r7 != r5) goto L4a
            goto L49
        L3b:
            P.N0 r0 = new P.N0
            r2 = 0
            r0.<init>(r4, r7, r2)
            r6.f5352q = r1
            java.lang.Object r7 = M5.AbstractC0263y.B(r3, r0, r6)
            if (r7 != r5) goto L4a
        L49:
            return r5
        L4a:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P.O0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
