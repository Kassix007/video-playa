package F;

import m5.C1386y;
import q5.InterfaceC1524c;
import v0.C1743l;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0154h extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1743l f1876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1743l f1877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1879u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0151e f1880v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154h(C0151e c0151e, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1880v = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0154h c0154h = new C0154h(this.f1880v, interfaceC1524c);
        c0154h.f1879u = obj;
        return c0154h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0154h) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r13 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r13 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F.e r0 = r12.f1880v
            P.f0 r0 = r0.f1820c
            int r1 = r12.f1878t
            v0.g r2 = v0.EnumC1738g.f17454q
            r3 = 2
            r4 = 0
            r5 = 1
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 != r3) goto L1f
            v0.l r1 = r12.f1877s
            v0.l r5 = r12.f1876r
            java.lang.Object r7 = r12.f1879u
            v0.y r7 = (v0.y) r7
            m5.AbstractC1362a.e(r13)
            goto L63
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            java.lang.Object r1 = r12.f1879u
            v0.y r1 = (v0.y) r1
            m5.AbstractC1362a.e(r13)
            goto L42
        L2f:
            m5.AbstractC1362a.e(r13)
            java.lang.Object r13 = r12.f1879u
            r1 = r13
            v0.y r1 = (v0.y) r1
            r12.f1879u = r1
            r12.f1878t = r5
            java.lang.Object r13 = w.g1.b(r1, r4, r2, r12)
            if (r13 != r6) goto L42
            goto L62
        L42:
            v0.l r13 = (v0.C1743l) r13
            i0.b r5 = new i0.b
            r7 = 0
            r5.<init>(r7)
            r0.setValue(r5)
            r5 = 0
            r7 = r1
            r1 = r5
            r5 = r13
        L52:
            if (r1 != 0) goto L8b
            r12.f1879u = r7
            r12.f1876r = r5
            r12.f1877s = r1
            r12.f1878t = r3
            java.lang.Object r13 = r7.a(r2, r12)
            if (r13 != r6) goto L63
        L62:
            return r6
        L63:
            v0.f r13 = (v0.C1737f) r13
            java.lang.Object r8 = r13.f17451a
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r4
        L6f:
            if (r10 >= r9) goto L81
            java.lang.Object r11 = r8.get(r10)
            v0.l r11 = (v0.C1743l) r11
            boolean r11 = v0.v.b(r11)
            if (r11 != 0) goto L7e
            goto L52
        L7e:
            int r10 = r10 + 1
            goto L6f
        L81:
            java.lang.Object r13 = r13.f17451a
            java.lang.Object r13 = r13.get(r4)
            r1 = r13
            v0.l r1 = (v0.C1743l) r1
            goto L52
        L8b:
            long r1 = r1.f17462c
            long r3 = r5.f17462c
            long r1 = i0.C1130b.d(r1, r3)
            i0.b r13 = new i0.b
            r13.<init>(r1)
            r0.setValue(r13)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0154h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
