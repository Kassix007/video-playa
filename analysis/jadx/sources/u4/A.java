package U4;

import M.I0;
import M5.InterfaceC0261w;
import R4.C0468k1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class A extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f7707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P.W f7709t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(I0 i02, C0468k1 c0468k1, P.W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7707r = i02;
        this.f7708s = c0468k1;
        this.f7709t = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new A(this.f7707r, this.f7708s, this.f7709t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7706q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f7706q = 1;
            Object objB = this.f7707r.b(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objB == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        this.f7708s.f7059S.getClass();
        AbstractC0534a.j(this.f7709t, false);
        return C1386y.f15098a;
    }
}
