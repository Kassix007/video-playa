package w;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f17775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0 f17776t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(H0 h02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17776t = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        F0 f02 = new F0(this.f17776t, interfaceC1524c);
        f02.f17775s = ((W0.p) obj).f8030a;
        return f02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((W0.p) obj).f8030a;
        F0 f02 = new F0(this.f17776t, (InterfaceC1524c) obj2);
        f02.f17775s = j;
        return f02.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f17774r
            r1 = 3
            r2 = 2
            r3 = 1
            w.H0 r4 = r14.f17776t
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.f17773q
            long r2 = r14.f17775s
            m5.AbstractC1362a.e(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r2 = r14.f17773q
            long r6 = r14.f17775s
            m5.AbstractC1362a.e(r15)
            goto L57
        L29:
            long r6 = r14.f17775s
            m5.AbstractC1362a.e(r15)
            goto L41
        L2f:
            m5.AbstractC1362a.e(r15)
            long r6 = r14.f17775s
            u0.d r15 = r4.f
            r14.f17775s = r6
            r14.f17774r = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            W0.p r15 = (W0.p) r15
            long r8 = r15.f8030a
            long r8 = W0.p.d(r6, r8)
            r14.f17775s = r6
            r14.f17773q = r8
            r14.f17774r = r2
            java.lang.Object r15 = r4.b(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            W0.p r15 = (W0.p) r15
            long r11 = r15.f8030a
            u0.d r8 = r4.f
            long r9 = W0.p.d(r2, r11)
            r14.f17775s = r6
            r14.f17773q = r11
            r14.f17774r = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            W0.p r15 = (W0.p) r15
            long r4 = r15.f8030a
            long r0 = W0.p.d(r0, r4)
            long r0 = W0.p.d(r2, r0)
            W0.p r15 = new W0.p
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: w.F0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
