package e3;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P.W;
import a3.C0632k;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.Y;
import v.a0;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038a extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1044g f12547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0632k f12548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f12549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W f12550u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038a(C1044g c1044g, C0632k c0632k, float f, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12547r = c1044g;
        this.f12548s = c0632k;
        this.f12549t = f;
        this.f12550u = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1038a(this.f12547r, this.f12548s, this.f12549t, this.f12550u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1038a) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f12546q;
        W w3 = this.f12550u;
        C1386y c1386y = C1386y.f15098a;
        if (i == 0) {
            AbstractC1362a.e(obj);
            ((Boolean) w3.getValue()).booleanValue();
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return c1386y;
            }
            AbstractC1362a.e(obj);
        }
        w3.setValue(Boolean.TRUE);
        C1044g c1044g = this.f12547r;
        float fFloatValue = ((Number) c1044g.f12569A.getValue()).floatValue();
        this.f12546q = 2;
        int iE = c1044g.e();
        a0 a0Var = c1044g.f12572D;
        C1041d c1041d = new C1041d(c1044g, iE, this.f12549t, this.f12548s, fFloatValue, EnumC1050m.f12601q, null);
        a0Var.getClass();
        Object objG = AbstractC0263y.g(new Y(a0Var, c1041d, null), this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objG != enumC1580a) {
            objG = c1386y;
        }
        return objG == enumC1580a ? enumC1580a : c1386y;
    }
}
