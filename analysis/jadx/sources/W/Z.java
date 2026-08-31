package w;

import M5.InterfaceC0261w;
import b2.C0690a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0690a f17902s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0690a c0690a, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17902s = c0690a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Z z5 = new Z(this.f17902s, interfaceC1524c);
        z5.f17901r = obj;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (b2.C0690a.b(r4, r5, r6, r7, r8, r12) != r10) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0032, B:19:0x003c, B:23:0x004e, B:14:0x0027), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f17900q
            r1 = 0
            r2 = 2
            r3 = 1
            b2.a r4 = r12.f17902s
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L23
            if (r0 != r2) goto L1b
            java.lang.Object r0 = r12.f17901r
            M5.w r0 = (M5.InterfaceC0261w) r0
            m5.AbstractC1362a.e(r13)     // Catch: java.lang.Throwable -> L18
        L16:
            r13 = r0
            goto L32
        L18:
            r0 = move-exception
            r13 = r0
            goto L7b
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r0 = r12.f17901r
            M5.w r0 = (M5.InterfaceC0261w) r0
            m5.AbstractC1362a.e(r13)     // Catch: java.lang.Throwable -> L18
            goto L4e
        L2b:
            m5.AbstractC1362a.e(r13)
            java.lang.Object r13 = r12.f17901r
            M5.w r13 = (M5.InterfaceC0261w) r13
        L32:
            q5.h r0 = r13.d()     // Catch: java.lang.Throwable -> L18
            boolean r0 = M5.AbstractC0263y.s(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L76
            java.lang.Object r0 = r4.f     // Catch: java.lang.Throwable -> L18
            O5.e r0 = (O5.e) r0     // Catch: java.lang.Throwable -> L18
            r12.f17901r = r13     // Catch: java.lang.Throwable -> L18
            r12.f17900q = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.h(r12)     // Catch: java.lang.Throwable -> L18
            if (r0 != r10) goto L4b
            goto L75
        L4b:
            r11 = r0
            r0 = r13
            r13 = r11
        L4e:
            r6 = r13
            w.Q r6 = (w.Q) r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f9974e     // Catch: java.lang.Throwable -> L18
            W0.c r13 = (W0.c) r13     // Catch: java.lang.Throwable -> L18
            float r5 = w.P.f17833a     // Catch: java.lang.Throwable -> L18
            float r7 = r13.u(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f9974e     // Catch: java.lang.Throwable -> L18
            W0.c r13 = (W0.c) r13     // Catch: java.lang.Throwable -> L18
            float r5 = w.P.f17834b     // Catch: java.lang.Throwable -> L18
            float r8 = r13.u(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f9971b     // Catch: java.lang.Throwable -> L18
            r5 = r13
            w.H0 r5 = (w.H0) r5     // Catch: java.lang.Throwable -> L18
            r12.f17901r = r0     // Catch: java.lang.Throwable -> L18
            r12.f17900q = r2     // Catch: java.lang.Throwable -> L18
            r9 = r12
            java.lang.Object r13 = b2.C0690a.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L18
            if (r13 != r10) goto L16
        L75:
            return r10
        L76:
            r4.f9975g = r1
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L7b:
            r4.f9975g = r1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
