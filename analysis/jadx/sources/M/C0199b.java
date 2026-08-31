package M;

import A.AbstractC0017n;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import C0.AbstractC0103t0;
import P.C0345b;
import P.C0371o;
import P.InterfaceC0360i0;
import a.AbstractC0597a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0722j;
import c0.InterfaceC0725m;
import j0.AbstractC1145B;
import m5.C1386y;
import v0.C1737f;
import v0.C1751t;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: M.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199b extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3431q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f3432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0.E f3433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f3435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f3436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3437w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199b(C0201c c0201c, InterfaceC0725m interfaceC0725m, float f, float f7, j0.E e7, long j, int i) {
        super(2);
        this.f3437w = c0201c;
        this.f3432r = interfaceC0725m;
        this.f3435u = f;
        this.f3436v = f7;
        this.f3433s = e7;
        this.f3434t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3431q;
        Object obj3 = this.f3437w;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ((C0201c) obj3).a(this.f3432r, this.f3435u, this.f3436v, this.f3433s, this.f3434t, (C0371o) obj, C0345b.w(196609));
                break;
            default:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    C0213i c0213i = (C0213i) c0371o.k(AbstractC0217k.f3553a);
                    boolean zBooleanValue = ((Boolean) c0371o.k(AbstractC0217k.f3554b)).booleanValue();
                    long jI = c0213i.f3524p;
                    long j = this.f3434t;
                    if (j0.o.c(j, jI) && zBooleanValue) {
                        if (!W0.f.a(this.f3435u, 0)) {
                            jI = AbstractC1145B.i(j0.o.b(c0213i.f3528t, ((((float) Math.log(r9 + 1)) * 4.5f) + 2.0f) / 100.0f), jI);
                        }
                    } else {
                        jI = j;
                    }
                    float fU = ((W0.c) c0371o.k(AbstractC0103t0.f1116h)).u(this.f3436v);
                    C0722j c0722j = C0722j.f10095q;
                    j0.E e7 = this.f3433s;
                    InterfaceC0725m interfaceC0725mA = I0.j.a(AbstractC0597a.n(androidx.compose.foundation.a.a(this.f3432r.d(fU > 0.0f ? androidx.compose.ui.graphics.a.b(c0722j, fU, e7, false, 124895) : c0722j).d(c0722j), jI, e7), e7), false, C0203d.f3448v);
                    K0 k02 = new K0(2, null);
                    C1737f c1737f = v0.u.f17495a;
                    InterfaceC0725m interfaceC0725mD = interfaceC0725mA.d(new SuspendPointerInputElement(c1386y, null, new C1751t(k02), 6));
                    X.e eVar = (X.e) obj3;
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, true);
                    int i7 = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d5 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d5);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i7))) {
                        k1.i.o(i7, c0371o, i7, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    eVar.invoke(c0371o, 0);
                    c0371o.p(true);
                }
                break;
        }
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199b(InterfaceC0725m interfaceC0725m, j0.E e7, long j, float f, float f7, X.e eVar) {
        super(2);
        this.f3432r = interfaceC0725m;
        this.f3433s = e7;
        this.f3434t = j;
        this.f3435u = f;
        this.f3436v = f7;
        this.f3437w = eVar;
    }
}
