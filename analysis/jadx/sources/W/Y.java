package w;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import b2.C0690a;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0690a f17897r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0690a c0690a, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17897r = c0690a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new Y(this.f17897r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17896q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        O5.e eVar = (O5.e) this.f17897r.f;
        this.f17896q = 1;
        Object objG = AbstractC0263y.g(new T(eVar, null), this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objG == enumC1580a ? enumC1580a : objG;
    }
}
