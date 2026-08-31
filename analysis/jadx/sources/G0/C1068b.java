package g0;

import B0.AbstractC0041g;
import B0.InterfaceC0051p;
import B0.K;
import B0.N;
import B0.p0;
import C0.S;
import W0.l;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m0.C1346a;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1068b extends AbstractC0724l implements p0, InterfaceC1067a, InterfaceC0051p {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1069c f12809E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12810F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1346a f12811G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1068b(C1069c c1069c, C1346a c1346a) {
        this.f12809E = c1069c;
        this.f12811G = c1346a;
        c1069c.f12812q = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.p0
    public final void E() {
        x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // B0.InterfaceC0051p
    public final void J(N n7) {
        boolean z5 = this.f12810F;
        C1069c c1069c = this.f12809E;
        if (!z5) {
            c1069c.f12813r = null;
            AbstractC0041g.r(this, new K(14, this, c1069c));
            if (c1069c.f12813r == null) {
                throw S.i("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f12810F = true;
        }
        k3.d dVar = c1069c.f12813r;
        m.b(dVar);
        ((n) dVar.f14122r).invoke(n7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m, B0.y0
    public final void a() {
        x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final W0.c b() {
        return AbstractC0041g.u(this).f261N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final long d() {
        return P1.d0(AbstractC0041g.s(this, 128).f18666s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void d0() {
        x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final l getLayoutDirection() {
        return AbstractC0041g.u(this).f262O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m
    public final void h0() {
        x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0() {
        this.f12810F = false;
        this.f12809E.f12813r = null;
        AbstractC0041g.l(this);
    }

    @Override // c0.AbstractC0724l
    public final void q0() {
    }
}
