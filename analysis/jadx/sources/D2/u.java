package D2;

import M5.InterfaceC0261w;
import androidx.lifecycle.AbstractC0654q;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f1449q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1449q = vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new u(this.f1449q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        uVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        v vVar = this.f1449q;
        t tVar = vVar.f1452s;
        if (tVar != null) {
            AbstractC0654q abstractC0654q = tVar.f1447t;
            tVar.f1448u.a(null);
            F2.a aVar = tVar.f1446s;
            if (aVar != null) {
                abstractC0654q.c(aVar);
            }
            abstractC0654q.c(tVar);
        }
        vVar.f1452s = null;
        return C1386y.f15098a;
    }
}
