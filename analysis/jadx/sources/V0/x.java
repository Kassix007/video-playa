package v0;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f17502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f17503s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j, y yVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17502r = j;
        this.f17503s = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new x(this.f17502r, this.f17503s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (M5.AbstractC0263y.h(8, r10) == r7) goto L15;
     */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f17501q
            r1 = 8
            long r3 = r10.f17502r
            r5 = 2
            r6 = 1
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L20
            if (r0 == r6) goto L1c
            if (r0 != r5) goto L14
            m5.AbstractC1362a.e(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            m5.AbstractC1362a.e(r11)
            goto L2e
        L20:
            m5.AbstractC1362a.e(r11)
            long r8 = r3 - r1
            r10.f17501q = r6
            java.lang.Object r11 = M5.AbstractC0263y.h(r8, r10)
            if (r11 != r7) goto L2e
            goto L36
        L2e:
            r10.f17501q = r5
            java.lang.Object r11 = M5.AbstractC0263y.h(r1, r10)
            if (r11 != r7) goto L37
        L36:
            return r7
        L37:
            v0.y r11 = r10.f17503s
            M5.h r11 = r11.f17506s
            if (r11 == 0) goto L49
            v0.h r0 = new v0.h
            r0.<init>(r3)
            m5.l r0 = m5.AbstractC1362a.b(r0)
            r11.resumeWith(r0)
        L49:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
