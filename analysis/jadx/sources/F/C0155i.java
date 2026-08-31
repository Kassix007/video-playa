package F;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.AbstractC1802p0;

/* JADX INFO: renamed from: F.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155i extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1746o f1882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0151e f1883s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155i(InterfaceC1746o interfaceC1746o, C0151e c0151e, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1882r = interfaceC1746o;
        this.f1883s = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0155i(this.f1882r, this.f1883s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0155i) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1881q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C0154h c0154h = new C0154h(this.f1883s, null);
            this.f1881q = 1;
            Object objC = AbstractC1802p0.c(this.f1882r, c0154h, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objC == enumC1580a) {
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
