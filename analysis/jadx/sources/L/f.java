package L;

import M5.InterfaceC0261w;
import P5.G;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y.i f3027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f3028t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y.i iVar, a aVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3027s = iVar;
        this.f3028t = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        f fVar = new f(this.f3027s, this.f3028t, interfaceC1524c);
        fVar.f3026r = obj;
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f3025q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return C1386y.f15098a;
        }
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f3026r;
        G g7 = this.f3027s.f18532a;
        e eVar = new e(0, this.f3028t, interfaceC0261w);
        this.f3025q = 1;
        g7.getClass();
        G.h(g7, eVar, this);
        return EnumC1580a.f16356q;
    }
}
