package w;

import B0.C0050o;
import M5.AbstractC0263y;
import M5.EnumC0262x;
import m5.C1386y;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends C {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0050o f17785O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public EnumC1778d0 f17786P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f17787Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public B5.f f17788R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public B5.f f17789S;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final Object E0(C1769A c1769a, C1770B c1770b) throws Throwable {
        C0050o c0050o = this.f17785O;
        Object objB = ((N.r) c0050o.f500r).b(v.W.f17279r, new N.p(c0050o, new E(c1769a, this, null), null), c1770b);
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objB != enumC1580a) {
            objB = c1386y;
        }
        return objB == enumC1580a ? objB : c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final void F0(long j) {
        if (!this.f10099D || kotlin.jvm.internal.m.a(this.f17788R, D.f17754a)) {
            return;
        }
        AbstractC0263y.t(l0(), null, EnumC0262x.f3898t, new F(this, j, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final void G0(long j) {
        if (!this.f10099D || kotlin.jvm.internal.m.a(this.f17789S, D.f17755b)) {
            return;
        }
        AbstractC0263y.t(l0(), null, EnumC0262x.f3898t, new G(this, j, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final boolean H0() {
        return this.f17787Q;
    }
}
