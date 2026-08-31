package L;

import B0.AbstractC0041g;
import B0.C0050o;
import B0.InterfaceC0047l;
import B0.InterfaceC0051p;
import B0.InterfaceC0059y;
import B0.N;
import M5.AbstractC0263y;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1148c;
import java.util.LinkedHashMap;
import n5.AbstractC1397A;
import r.C1544C;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0724l implements j, InterfaceC0047l, InterfaceC0051p, InterfaceC0059y {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final y.i f3006E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f3007F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final float f3008G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final k3.d f3009H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final M.r f3010I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public s f3011J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f3012K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f3014M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i f3016O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public k f3017P;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f3013L = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1544C f3015N = new C1544C();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(y.i iVar, boolean z5, float f, k3.d dVar, M.r rVar) {
        this.f3006E = iVar;
        this.f3007F = z5;
        this.f3008G = f;
        this.f3009H = dVar;
        this.f3010I = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(N n7) {
        n7.a();
        s sVar = this.f3011J;
        if (sVar != null) {
            sVar.c(n7, this.f3012K, this.f3009H.b());
        }
        j0.m mVarT = n7.f296q.f14425r.t();
        k kVar = this.f3017P;
        if (kVar != null) {
            long j = this.f3013L;
            int iG = D5.a.G(this.f3012K);
            long jB = this.f3009H.b();
            this.f3010I.invoke();
            kVar.e(j, iG, jB, 0.1f);
            kVar.draw(AbstractC1148c.a(mVarT));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L.j
    public final void Y() {
        this.f3017P = null;
        AbstractC0041g.l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        AbstractC0263y.t(l0(), null, null, new m(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0059y
    public final void q(long j) {
        this.f3014M = true;
        W0.c cVar = AbstractC0041g.u(this).f261N;
        this.f3013L = P1.d0(j);
        float f = this.f3008G;
        this.f3012K = Float.isNaN(f) ? h.a(cVar, this.f3007F, this.f3013L) : cVar.u(f);
        C1544C c1544c = this.f3015N;
        Object[] objArr = c1544c.f16114a;
        int i = c1544c.f16115b;
        for (int i7 = 0; i7 < i; i7++) {
            x0((y.m) objArr[i7]);
        }
        c1544c.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        i iVar = this.f3016O;
        if (iVar != null) {
            Y();
            C0050o c0050o = iVar.f3037t;
            k kVar = (k) ((LinkedHashMap) c0050o.f499q).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0050o.f499q;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f3036s.add(kVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0(y.m mVar) {
        if (!(mVar instanceof y.k)) {
            if (mVar instanceof y.l) {
                y.k kVar = ((y.l) mVar).f18535a;
                k kVar2 = this.f3017P;
                if (kVar2 != null) {
                    kVar2.d();
                    return;
                }
                return;
            }
            if (mVar instanceof y.j) {
                y.k kVar3 = ((y.j) mVar).f18533a;
                k kVar4 = this.f3017P;
                if (kVar4 != null) {
                    kVar4.d();
                    return;
                }
                return;
            }
            return;
        }
        y.k kVar5 = (y.k) mVar;
        long j = this.f3013L;
        float f = this.f3012K;
        i iVarJ = this.f3016O;
        if (iVarJ == null) {
            iVarJ = AbstractC1397A.j(AbstractC1397A.k((View) AbstractC0041g.i(this, AndroidCompositionLocals_androidKt.f)));
            this.f3016O = iVarJ;
            kotlin.jvm.internal.m.b(iVarJ);
        }
        k kVarA = iVarJ.a(this);
        int iG = D5.a.G(f);
        long jB = this.f3009H.b();
        this.f3010I.invoke();
        kVarA.b(kVar5, this.f3007F, j, iG, jB, 0.1f, new A0.d(6, this));
        this.f3017P = kVarA;
        AbstractC0041g.l(this);
    }
}
