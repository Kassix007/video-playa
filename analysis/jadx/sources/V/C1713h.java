package v;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: v.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1713h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1728x f17344q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713h(C1728x c1728x, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17344q = c1728x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1713h(this.f17344q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C1713h c1713h = (C1713h) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c1713h.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C1728x c1728x = this.f17344q;
        if (c1728x.f17416P == null) {
            y.f fVar = new y.f();
            y.i iVar = c1728x.f17407G;
            if (iVar != null) {
                AbstractC0263y.t(c1728x.l0(), null, null, new C1706a(iVar, fVar, null), 3);
            }
            c1728x.f17416P = fVar;
        }
        return C1386y.f15098a;
    }
}
