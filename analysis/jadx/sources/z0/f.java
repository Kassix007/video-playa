package Z0;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f8330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f8331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f8332t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z5, j jVar, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8330r = z5;
        this.f8331s = jVar;
        this.f8332t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new f(this.f8330r, this.f8331s, this.f8332t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4.a(0, r10.f8332t, r10) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r4.a(r10.f8332t, 0, r10) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r3;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f8329q
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            m5.AbstractC1362a.e(r11)
            goto L46
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            m5.AbstractC1362a.e(r11)
            r9 = r10
            goto L46
        L1b:
            m5.AbstractC1362a.e(r11)
            boolean r11 = r10.f8330r
            Z0.j r0 = r10.f8331s
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r11 != 0) goto L36
            u0.d r4 = r0.f8357q
            r10.f8329q = r2
            r5 = 0
            long r7 = r10.f8332t
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L46
            goto L45
        L36:
            r9 = r10
            u0.d r4 = r0.f8357q
            r9.f8329q = r1
            long r5 = r9.f8332t
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L46
        L45:
            return r3
        L46:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
