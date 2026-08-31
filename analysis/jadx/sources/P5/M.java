package P5;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class M extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC0398i f6366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ int f6367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f6368t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o6, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f6368t = o6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        M m4 = new M(this.f6368t, (InterfaceC1524c) obj3);
        m4.f6366r = (InterfaceC0398i) obj;
        m4.f6367s = iIntValue;
        return m4.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.emit(P5.J.f6358q, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.emit(P5.J.f6360s, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r0
  0x0062: PHI (r0v3 P5.i) = (r0v2 P5.i), (r0v6 P5.i) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 P5.i) = (r0v3 P5.i), (r0v7 P5.i) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f6365q
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            P5.i r0 = r7.f6366r
            m5.AbstractC1362a.e(r8)
            goto L72
        L24:
            P5.i r0 = r7.f6366r
            m5.AbstractC1362a.e(r8)
            goto L62
        L2a:
            P5.i r0 = r7.f6366r
            m5.AbstractC1362a.e(r8)
            goto L55
        L30:
            m5.AbstractC1362a.e(r8)
            goto L80
        L34:
            m5.AbstractC1362a.e(r8)
            P5.i r0 = r7.f6366r
            int r8 = r7.f6367s
            if (r8 <= 0) goto L48
            r7.f6365q = r5
            P5.J r8 = P5.J.f6358q
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r6) goto L80
            goto L7f
        L48:
            r7.f6366r = r0
            r7.f6365q = r4
            r4 = 0
            java.lang.Object r8 = M5.AbstractC0263y.h(r4, r7)
            if (r8 != r6) goto L55
            goto L7f
        L55:
            r7.f6366r = r0
            r7.f6365q = r3
            P5.J r8 = P5.J.f6359r
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r6) goto L62
            goto L7f
        L62:
            r7.f6366r = r0
            r7.f6365q = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = M5.AbstractC0263y.h(r2, r7)
            if (r8 != r6) goto L72
            goto L7f
        L72:
            r8 = 0
            r7.f6366r = r8
            r7.f6365q = r1
            P5.J r8 = P5.J.f6360s
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r6) goto L80
        L7f:
            return r6
        L80:
            m5.y r8 = m5.C1386y.f15098a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
