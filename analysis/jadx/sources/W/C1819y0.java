package w;

import i0.C1130b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1819y0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f18112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1821z0 f18113s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819y0(C1821z0 c1821z0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18113s = c1821z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1819y0 c1819y0 = new C1819y0(this.f18113s, interfaceC1524c);
        c1819y0.f18112r = ((C1130b) obj).f13520a;
        return c1819y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((C1130b) obj).f13520a;
        C1819y0 c1819y0 = new C1819y0(this.f18113s, (InterfaceC1524c) obj2);
        c1819y0.f18112r = j;
        return c1819y0.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18111q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        long j = this.f18112r;
        H0 h02 = this.f18113s.f18124T;
        this.f18111q = 1;
        Object objA = AbstractC1802p0.a(h02, j, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objA == enumC1580a ? enumC1580a : objA;
    }
}
