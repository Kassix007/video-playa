package P5;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: P5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0400k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f6409r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400k(r rVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6409r = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0400k(this.f6409r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0400k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f6408q;
        C1386y c1386y = C1386y.f15098a;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f6408q = 1;
            Object objCollect = this.f6409r.collect(Q5.x.f6662q, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objCollect != enumC1580a) {
                objCollect = c1386y;
            }
            if (objCollect == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return c1386y;
    }
}
