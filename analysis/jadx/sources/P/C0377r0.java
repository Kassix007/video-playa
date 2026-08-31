package P;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: P.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377r0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0383u0 f5500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T f5501t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0377r0(C0383u0 c0383u0, T t6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5500s = c0383u0;
        this.f5501t = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0377r0 c0377r0 = new C0377r0(this.f5500s, this.f5501t, interfaceC1524c);
        c0377r0.f5499r = obj;
        return c0377r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0377r0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f5498q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return C1386y.f15098a;
        }
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f5499r;
        this.f5498q = 1;
        this.f5500s.invoke(interfaceC0261w, this.f5501t, this);
        return EnumC1580a.f16356q;
    }
}
