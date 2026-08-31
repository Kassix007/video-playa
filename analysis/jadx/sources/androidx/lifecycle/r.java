package androidx.lifecycle;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f9563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0655s f9564r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0655s c0655s, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f9564r = c0655s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        r rVar = new r(this.f9564r, interfaceC1524c);
        rVar.f9563q = obj;
        return rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        rVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f9563q;
        C0655s c0655s = this.f9564r;
        AbstractC0654q abstractC0654q = c0655s.f9565q;
        if (abstractC0654q.b().compareTo(EnumC0653p.f9557r) >= 0) {
            abstractC0654q.a(c0655s);
        } else {
            AbstractC0263y.f(interfaceC0261w.d(), null);
        }
        return C1386y.f15098a;
    }
}
