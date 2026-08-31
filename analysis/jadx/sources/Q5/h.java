package Q5;

import P5.InterfaceC0398i;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f6618s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6618s = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        h hVar = new h(this.f6618s, interfaceC1524c);
        hVar.f6617r = obj;
        return hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0398i) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6616q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0398i interfaceC0398i = (InterfaceC0398i) this.f6617r;
            this.f6616q = 1;
            Object objG = this.f6618s.g(interfaceC0398i, this);
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
