package w;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: w.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1772a0 extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f17906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v.F f17907u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772a0(v.F f, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17907u = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1772a0 c1772a0 = new C1772a0(this.f17907u, interfaceC1524c);
        c1772a0.f17906t = obj;
        return c1772a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1772a0) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f17905s
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            java.lang.Object r0 = r3.f17904r
            java.lang.Object r2 = r3.f17906t
            I5.j r2 = (I5.j) r2
            m5.AbstractC1362a.e(r4)
            goto L36
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            m5.AbstractC1362a.e(r4)
            java.lang.Object r4 = r3.f17906t
            I5.j r4 = (I5.j) r4
            r2 = r4
        L21:
            v.F r4 = r3.f17907u
            java.lang.Object r4 = r4.invoke()
            if (r4 == 0) goto L35
            r3.f17906t = r2
            r3.f17904r = r4
            r3.f17905s = r1
            r2.b(r4, r3)
            r5.a r4 = r5.EnumC1580a.f16356q
            return r4
        L35:
            r0 = 0
        L36:
            if (r0 != 0) goto L21
            m5.y r4 = m5.C1386y.f15098a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1772a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
