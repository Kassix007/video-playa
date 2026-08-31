package u;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v0 f16851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f16852w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Object obj, Object obj2, C1645d0 c1645d0, v0 v0Var, float f, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16848s = obj;
        this.f16849t = obj2;
        this.f16850u = c1645d0;
        this.f16851v = v0Var;
        this.f16852w = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Y y6 = new Y(this.f16848s, this.f16849t, this.f16850u, this.f16851v, this.f16852w, interfaceC1524c);
        y6.f16847r = obj;
        return y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16846q;
        C1386y c1386y = C1386y.f15098a;
        C1645d0 c1645d0 = this.f16850u;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f16847r;
            Object obj2 = this.f16848s;
            Object obj3 = this.f16849t;
            if (kotlin.jvm.internal.m.a(obj2, obj3)) {
                c1645d0.f16903E = null;
                if (kotlin.jvm.internal.m.a(c1645d0.f16908t.getValue(), obj2)) {
                    return c1386y;
                }
            } else {
                C1645d0.p(c1645d0);
            }
            boolean zA = kotlin.jvm.internal.m.a(obj2, obj3);
            float f = this.f16852w;
            if (!zA) {
                v0 v0Var = this.f16851v;
                v0Var.p(obj2);
                v0Var.n(0L);
                c1645d0.f16907s.setValue(obj2);
                v0Var.j(f);
            }
            c1645d0.y(f);
            if (c1645d0.f16902D.h()) {
                AbstractC0263y.t(interfaceC0261w, null, null, new X(c1645d0, null), 3);
            } else {
                c1645d0.f16901C = Long.MIN_VALUE;
            }
            this.f16846q = 1;
            Object objT = C1645d0.t(c1645d0, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objT == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        c1645d0.x();
        return c1386y;
    }
}
