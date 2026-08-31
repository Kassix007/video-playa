package U4;

import M.I0;
import M.J0;
import M5.InterfaceC0261w;
import java.util.Map;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: U4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0556x extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f7887r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556x(I0 i02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7887r = i02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0556x(this.f7887r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0556x) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7886q;
        C1386y c1386y = C1386y.f15098a;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f7886q = 1;
            I0 i02 = this.f7887r;
            Map map = i02.f3322c.d().f3997a;
            J0 j02 = J0.f3325s;
            if (!map.containsKey(j02)) {
                j02 = J0.f3324r;
            }
            Object objA = I0.a(i02, j02, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA != enumC1580a) {
                objA = c1386y;
            }
            if (objA == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return c1386y;
    }
}
