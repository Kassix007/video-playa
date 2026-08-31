package v;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.InterfaceC0047l;
import B0.InterfaceC0048m;
import B0.p0;
import c0.AbstractC0724l;
import w.A0;
import w.C1821z0;
import w.EnumC1778d0;
import w.InterfaceC1775c;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends AbstractC0049n implements InterfaceC0047l, p0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public A0 f17327G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EnumC1778d0 f17328H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f17329I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public w.I f17330J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public y.i f17331K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public InterfaceC1775c f17332L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1717l f17333M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1821z0 f17334N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public InterfaceC0048m f17335O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1718m f17336P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f17337Q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0() {
        InterfaceC0048m interfaceC0048m = this.f17335O;
        if (interfaceC0048m != null) {
            if (((AbstractC0724l) interfaceC0048m).f10100q.f10099D) {
                return;
            }
            x0(interfaceC0048m);
            return;
        }
        C1717l c1717l = this.f17333M;
        if (c1717l != null) {
            AbstractC0049n abstractC0049n = c1717l.i;
            if (abstractC0049n.f10100q.f10099D) {
                return;
            }
            x0(abstractC0049n);
            this.f17335O = abstractC0049n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B0() {
        return (this.f10099D ? AbstractC0041g.u(this).f262O : W0.l.f8022q) != W0.l.f8023r || this.f17328H == EnumC1778d0.f17945q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C0(C1717l c1717l, InterfaceC1775c interfaceC1775c, w.I i, EnumC1778d0 enumC1778d0, A0 a02, y.i iVar, boolean z5) {
        this.f17327G = a02;
        this.f17328H = enumC1778d0;
        if (!kotlin.jvm.internal.m.a(this.f17333M, c1717l)) {
            this.f17333M = c1717l;
            InterfaceC0048m interfaceC0048m = this.f17335O;
            if (interfaceC0048m != null) {
                y0(interfaceC0048m);
            }
            this.f17335O = null;
            A0();
        }
        this.f17329I = z5;
        this.f17330J = i;
        this.f17331K = iVar;
        this.f17332L = interfaceC1775c;
        boolean zB0 = B0();
        this.f17337Q = zB0;
        C1821z0 c1821z0 = this.f17334N;
        if (c1821z0 != null) {
            c1821z0.J0(this.f17333M, interfaceC1775c, i, enumC1778d0, a02, iVar, z5, zB0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.p0
    public final void E() {
        C1718m c1718m = (C1718m) AbstractC0041g.i(this, d0.f17323a);
        if (kotlin.jvm.internal.m.a(c1718m, this.f17336P)) {
            return;
        }
        this.f17336P = c1718m;
        InterfaceC0048m interfaceC0048m = this.f17335O;
        if (interfaceC0048m != null) {
            y0(interfaceC0048m);
        }
        this.f17335O = null;
        A0();
        C1821z0 c1821z0 = this.f17334N;
        if (c1821z0 != null) {
            A0 a02 = this.f17327G;
            EnumC1778d0 enumC1778d0 = this.f17328H;
            C1717l c1717l = this.f17333M;
            boolean z5 = this.f17329I;
            boolean z6 = this.f17337Q;
            c1821z0.J0(c1717l, this.f17332L, this.f17330J, enumC1778d0, a02, this.f17331K, z5, z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m
    public final void h0() {
        boolean zB0 = B0();
        if (this.f17337Q != zB0) {
            this.f17337Q = zB0;
            A0 a02 = this.f17327G;
            EnumC1778d0 enumC1778d0 = this.f17328H;
            C1717l c1717l = this.f17333M;
            boolean z5 = this.f17329I;
            C0(c1717l, this.f17332L, this.f17330J, enumC1778d0, a02, this.f17331K, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        this.f17337Q = B0();
        A0();
        if (this.f17334N == null) {
            A0 a02 = this.f17327G;
            C1717l c1717l = this.f17333M;
            w.I i = this.f17330J;
            EnumC1778d0 enumC1778d0 = this.f17328H;
            boolean z5 = this.f17329I;
            boolean z6 = this.f17337Q;
            C1821z0 c1821z0 = new C1821z0(c1717l, this.f17332L, i, enumC1778d0, a02, this.f17331K, z5, z6);
            x0(c1821z0);
            this.f17334N = c1821z0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        InterfaceC0048m interfaceC0048m = this.f17335O;
        if (interfaceC0048m != null) {
            y0(interfaceC0048m);
        }
    }
}
