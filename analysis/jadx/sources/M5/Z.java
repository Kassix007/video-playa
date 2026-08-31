package M5;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f3834r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(B5.a aVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3834r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Z z5 = new Z(this.f3834r, interfaceC1524c);
        z5.f3833q = obj;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        throw r5;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            m5.AbstractC1362a.e(r5)
            java.lang.Object r5 = r4.f3833q
            M5.w r5 = (M5.InterfaceC0261w) r5
            q5.h r5 = r5.d()
            B5.a r0 = r4.f3834r
            M5.t0 r1 = new M5.t0     // Catch: java.lang.InterruptedException -> L40
            r1.<init>()     // Catch: java.lang.InterruptedException -> L40
            M5.b0 r5 = M5.AbstractC0263y.n(r5)     // Catch: java.lang.InterruptedException -> L40
            r2 = 1
            M5.J r5 = M5.AbstractC0263y.q(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L40
            r1.f3888v = r5     // Catch: java.lang.InterruptedException -> L40
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = M5.t0.f3886w     // Catch: java.lang.InterruptedException -> L40
        L1f:
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L40
            if (r2 == 0) goto L31
            r5 = 2
            if (r2 == r5) goto L38
            r5 = 3
            if (r2 != r5) goto L2c
            goto L38
        L2c:
            M5.t0.n(r2)     // Catch: java.lang.InterruptedException -> L40
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L40
        L31:
            r3 = 0
            boolean r2 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L40
            if (r2 == 0) goto L1f
        L38:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L42
            r1.m()     // Catch: java.lang.InterruptedException -> L40
            return r5
        L40:
            r5 = move-exception
            goto L47
        L42:
            r5 = move-exception
            r1.m()     // Catch: java.lang.InterruptedException -> L40
            throw r5     // Catch: java.lang.InterruptedException -> L40
        L47:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
