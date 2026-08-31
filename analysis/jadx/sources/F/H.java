package F;

import A.e0;
import B0.j0;
import P.C0346b0;
import com.google.android.gms.internal.measurement.I1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;
import u.InterfaceC1657k;
import w.InterfaceC1788i0;

/* JADX INFO: loaded from: classes.dex */
public final class H extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f1792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f1794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1657k f1795v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(N n7, int i, float f, InterfaceC1657k interfaceC1657k, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1792s = n7;
        this.f1793t = i;
        this.f1794u = f;
        this.f1795v = interfaceC1657k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        H h4 = new H(this.f1792s, this.f1793t, this.f1794u, this.f1795v, interfaceC1524c);
        h4.f1791r = obj;
        return h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i7 = this.f1790q;
        C1386y c1386y = C1386y.f15098a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        InterfaceC1788i0 interfaceC1788i0 = (InterfaceC1788i0) this.f1791r;
        N n7 = this.f1792s;
        E e7 = new E(interfaceC1788i0, n7);
        e0 e0Var = new e0(4, n7);
        this.f1790q = 1;
        float f = S.f1843a;
        int i8 = this.f1793t;
        e0Var.invoke(e7, new Integer(i8));
        boolean z5 = i8 > n7.f1822e;
        int i9 = (((C0158l) n5.l.r0(n7.k().f1760a)).f1888a - n7.f1822e) + 1;
        if (((z5 && i8 > ((C0158l) n5.l.r0(n7.k().f1760a)).f1888a) || (!z5 && i8 < n7.f1822e)) && Math.abs(i8 - n7.f1822e) >= 3) {
            if (z5) {
                int i10 = i;
                n7.s(i10, 0 / n7.n(), true);
            } else {
                int i102 = i;
                n7.s(i102, 0 / n7.n(), true);
            }
        }
        Object objD = AbstractC1644d.d(0.0f, ((int) (D5.a.r(I1.R(n7) + ((long) D5.a.G(((n7.n() * (i8 - n7.j())) - (((C0346b0) n7.f1821d.f1779t).e() * n7.n())) + 0)), n7.f1824h, n7.f1823g) - I1.R(n7))) + this.f1794u, this.f1795v, new j0(6, new kotlin.jvm.internal.v(), e7), this, 4);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objD != enumC1580a) {
            objD = c1386y;
        }
        return objD == enumC1580a ? enumC1580a : c1386y;
    }
}
