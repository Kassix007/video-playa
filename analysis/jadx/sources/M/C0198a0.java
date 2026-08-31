package M;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: M.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0198a0 extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ float f3429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f3430r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198a0(B5.c cVar, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f3430r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0198a0 c0198a0 = new C0198a0(this.f3430r, (InterfaceC1524c) obj3);
        c0198a0.f3429q = fFloatValue;
        C1386y c1386y = C1386y.f15098a;
        c0198a0.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        this.f3430r.invoke(new Float(this.f3429q));
        return C1386y.f15098a;
    }
}
