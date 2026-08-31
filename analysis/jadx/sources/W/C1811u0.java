package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: w.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1811u0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f18079r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1811u0(long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18079r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1811u0 c1811u0 = new C1811u0(this.f18079r, interfaceC1524c);
        c1811u0.f18078q = obj;
        return c1811u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C1811u0 c1811u0 = (C1811u0) create((E0) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c1811u0.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        H0 h02 = ((E0) this.f18078q).f17768a;
        H0.a(h02, h02.j, this.f18079r, 1);
        return C1386y.f15098a;
    }
}
