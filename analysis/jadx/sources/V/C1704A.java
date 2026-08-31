package v;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: v.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1704A extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1705B f17218r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704A(C1705B c1705b, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17218r = c1705b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1704A(this.f17218r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1704A) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f17217q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return C1386y.f15098a;
        }
        AbstractC1362a.e(obj);
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
        C1705B c1705b = this.f17218r;
        P5.G g7 = c1705b.f17219E.f18532a;
        Q5.m mVar = new Q5.m(wVar, wVar2, wVar3, c1705b, 1);
        this.f17217q = 1;
        g7.getClass();
        P5.G.h(g7, mVar, this);
        return EnumC1580a.f16356q;
    }
}
