package M;

import A.AbstractC0017n;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0371o;
import P.InterfaceC0360i0;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.InterfaceC0725m;
import m5.C1386y;
import u.C1642c;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ long f3384A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ float f3385B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ B5.e f3386C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ B5.e f3387D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ X.e f3388E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f3390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I0 f3391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1642c f3392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f3393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B5.c f3394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f3395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f3396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0.E f3397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f3398z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(long j, B5.a aVar, I0 i02, C1642c c1642c, InterfaceC0261w interfaceC0261w, B5.c cVar, InterfaceC0725m interfaceC0725m, float f, j0.E e7, long j7, long j8, float f7, B5.e eVar, B5.e eVar2, X.e eVar3) {
        super(2);
        this.f3389q = j;
        this.f3390r = aVar;
        this.f3391s = i02;
        this.f3392t = c1642c;
        this.f3393u = interfaceC0261w;
        this.f3394v = cVar;
        this.f3395w = interfaceC0725m;
        this.f3396x = f;
        this.f3397y = e7;
        this.f3398z = j7;
        this.f3384A = j8;
        this.f3385B = f7;
        this.f3386C = eVar;
        this.f3387D = eVar2;
        this.f3388E = eVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
            c0371o.N();
        } else {
            InterfaceC0725m interfaceC0725mA = I0.j.a(AbstractC0727o.a(androidx.compose.foundation.layout.c.f9279c, new A.d0(3, 0)), false, C0203d.f3445s);
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
            int i = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
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
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i))) {
                k1.i.o(i, c0371o, i, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            I0 i02 = this.f3391s;
            boolean z5 = ((J0) i02.f3322c.f3974h.getValue()) != J0.f3323q;
            long j = this.f3389q;
            B5.a aVar = this.f3390r;
            AbstractC0210g0.c(j, aVar, z5, c0371o, 0);
            AbstractC0210g0.b(this.f3392t, this.f3393u, aVar, this.f3394v, this.f3395w, i02, this.f3396x, this.f3397y, this.f3398z, this.f3384A, this.f3385B, this.f3386C, this.f3387D, this.f3388E, c0371o, 70);
            c0371o.p(true);
        }
        return C1386y.f15098a;
    }
}
