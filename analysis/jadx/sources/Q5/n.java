package Q5;

import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f6636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f6637t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6636s = oVar;
        this.f6637t = interfaceC0398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        n nVar = new n(this.f6636s, this.f6637t, interfaceC1524c);
        nVar.f6635r = obj;
        return nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6634q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f6635r;
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            o oVar = this.f6636s;
            InterfaceC0397h interfaceC0397h = oVar.f6619t;
            m mVar = new m(yVar, interfaceC0261w, oVar, this.f6637t, 0);
            this.f6634q = 1;
            Object objCollect = interfaceC0397h.collect(mVar, this);
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
