package C0;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P5.P f1070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K0 f1071s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(P5.P p7, K0 k02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1070r = p7;
        this.f1071s = k02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new n1(this.f1070r, this.f1071s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((n1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1069q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            m1 m1Var = new m1(0, this.f1071s);
            this.f1069q = 1;
            Object objCollect = this.f1070r.collect(m1Var, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objCollect == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        throw new C2.e();
    }
}
