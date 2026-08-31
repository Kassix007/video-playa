package F;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import w.InterfaceC1788i0;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class L extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0151e f1807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1808s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C0151e c0151e, int i, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1807r = c0151e;
        this.f1808s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new L(this.f1807r, this.f1808s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1806q;
        C1386y c1386y = C1386y.f15098a;
        C0151e c0151e = this.f1807r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f1806q = 1;
            Object objF = c0151e.f1837w.f(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objF != enumC1580a) {
                objF = c1386y;
            }
            if (objF == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        double d5 = 0.0f;
        if (-0.5d > d5 || d5 > 0.5d) {
            AbstractC1923a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        c0151e.s(c0151e.i(this.f1808s), 0.0f, true);
        return c1386y;
    }
}
