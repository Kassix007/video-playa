package P;

import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h f5346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0364k0 f5347s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(InterfaceC0397h interfaceC0397h, C0364k0 c0364k0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5346r = interfaceC0397h;
        this.f5347s = c0364k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new N0(this.f5346r, this.f5347s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f5345q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            M0 m02 = new M0(this.f5347s, 1);
            this.f5345q = 1;
            Object objCollect = this.f5346r.collect(m02, this);
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
        return C1386y.f15098a;
    }
}
