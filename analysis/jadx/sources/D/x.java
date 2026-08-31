package D;

import B0.L;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import w.InterfaceC1788i0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f1302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1303r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, int i, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1302q = yVar;
        this.f1303r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new x(this.f1302q, this.f1303r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        xVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        y yVar = this.f1302q;
        C.u uVar = yVar.f1308d;
        int iE = uVar.f685b.e();
        int i = this.f1303r;
        if (iE != i || uVar.f686c.e() != 0) {
            androidx.compose.foundation.lazy.layout.b bVar = yVar.f1314m;
            bVar.d();
            bVar.f9294b = null;
        }
        uVar.a(i, 0);
        uVar.f688e = null;
        L l7 = yVar.j;
        if (l7 != null) {
            l7.l();
        }
        return C1386y.f15098a;
    }
}
