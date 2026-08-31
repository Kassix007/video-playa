package E;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;
import u.C1649f0;
import u.C1658l;
import u.m0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k3.c f1494r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(k3.c cVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1494r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new M(this.f1494r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1493q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1658l c1658l = (C1658l) this.f1494r.f14120q;
            Float f = new Float(0.0f);
            C1649f0 c1649f0O = AbstractC1644d.o(1, new Float(0.5f));
            this.f1493q = 1;
            Object objG = AbstractC1644d.g(c1658l, f, c1649f0O, true, m0.f16985r, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objG == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
