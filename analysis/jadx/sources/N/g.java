package N;

import M5.InterfaceC0261w;
import P.Q0;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u2.C1692m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.a f3936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f3937t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(B5.a aVar, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3936s = aVar;
        this.f3937t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        g gVar = new g(this.f3936s, this.f3937t, interfaceC1524c);
        gVar.f3935r = obj;
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3934q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f3935r;
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            C1692m c1692m = new C1692m(new Q0(this.f3936s, null));
            f fVar = new f(yVar, interfaceC0261w, this.f3937t, 0);
            this.f3934q = 1;
            Object objCollect = c1692m.collect(fVar, this);
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
