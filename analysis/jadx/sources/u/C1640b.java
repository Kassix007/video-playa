package u;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1640b extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1642c f16870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16871r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640b(C1642c c1642c, Object obj, InterfaceC1524c interfaceC1524c) {
        super(1, interfaceC1524c);
        this.f16870q = c1642c;
        this.f16871r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new C1640b(this.f16870q, this.f16871r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        C1640b c1640b = (C1640b) create((InterfaceC1524c) obj);
        C1386y c1386y = C1386y.f15098a;
        c1640b.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C1642c c1642c = this.f16870q;
        C1642c.b(c1642c);
        Object objA = C1642c.a(c1642c, this.f16871r);
        c1642c.f16879c.f16962r.setValue(objA);
        c1642c.f16881e.setValue(objA);
        return C1386y.f15098a;
    }
}
