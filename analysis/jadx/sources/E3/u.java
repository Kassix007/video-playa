package e3;

import i0.C1130b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12626q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, InterfaceC1524c interfaceC1524c, int i7) {
        super(i, interfaceC1524c);
        this.f12626q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12626q) {
            case 0:
                ((Number) obj).intValue();
                new u(3, (InterfaceC1524c) obj3, 0).invokeSuspend(C1386y.f15098a);
                return Boolean.FALSE;
            case 1:
                long j = ((C1130b) obj2).f13520a;
                u uVar = new u(3, (InterfaceC1524c) obj3, 1);
                C1386y c1386y = C1386y.f15098a;
                uVar.invokeSuspend(c1386y);
                return c1386y;
            case 2:
                ((Number) obj2).floatValue();
                u uVar2 = new u(3, (InterfaceC1524c) obj3, 2);
                C1386y c1386y2 = C1386y.f15098a;
                uVar2.invokeSuspend(c1386y2);
                return c1386y2;
            default:
                long j7 = ((C1130b) obj2).f13520a;
                u uVar3 = new u(3, (InterfaceC1524c) obj3, 3);
                C1386y c1386y3 = C1386y.f15098a;
                uVar3.invokeSuspend(c1386y3);
                return c1386y3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f12626q;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                AbstractC1362a.e(obj);
                break;
            case 1:
                AbstractC1362a.e(obj);
                break;
            case 2:
                AbstractC1362a.e(obj);
                break;
            default:
                AbstractC1362a.e(obj);
                break;
        }
        return c1386y;
    }
}
