package f0;

import A.J;
import B0.AbstractC0041g;
import B0.E0;
import B0.InterfaceC0059y;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0724l implements E0, InterfaceC0059y {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public f f12687E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public f f12688F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f12689G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0(k3.c cVar) {
        E0 e02;
        f fVar;
        f fVar2 = this.f12687E;
        if (fVar2 == null || !K1.c(fVar2, P1.C(cVar))) {
            if (this.f10100q.f10099D) {
                y yVar = new y();
                AbstractC0041g.y(this, new J(yVar, this, cVar, 8));
                e02 = (E0) yVar.f14268q;
            } else {
                e02 = null;
            }
            fVar = (f) e02;
        } else {
            fVar = fVar2;
        }
        if (fVar != null && fVar2 == null) {
            fVar.y0(cVar);
            fVar.A0(cVar);
            f fVar3 = this.f12688F;
            if (fVar3 != null) {
                fVar3.z0(cVar);
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.f12688F;
            if (fVar4 != null) {
                fVar4.y0(cVar);
                fVar4.A0(cVar);
            }
            fVar2.z0(cVar);
        } else if (!m.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.y0(cVar);
                fVar.A0(cVar);
            }
            if (fVar2 != null) {
                fVar2.z0(cVar);
            }
        } else if (fVar != null) {
            fVar.A0(cVar);
        } else {
            f fVar5 = this.f12688F;
            if (fVar5 != null) {
                fVar5.A0(cVar);
            }
        }
        this.f12687E = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B0(k3.c cVar) {
        f fVar = this.f12688F;
        if (fVar != null) {
            fVar.B0(cVar);
            return;
        }
        f fVar2 = this.f12687E;
        if (fVar2 != null) {
            fVar2.B0(cVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.E0
    public final Object o() {
        return d.f12684a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0059y
    public final void q(long j) {
        this.f12689G = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        this.f12688F = null;
        this.f12687E = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x0(k3.c cVar) {
        f fVar = this.f12687E;
        if (fVar != null) {
            return fVar.x0(cVar);
        }
        f fVar2 = this.f12688F;
        if (fVar2 != null) {
            return fVar2.x0(cVar);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0(k3.c cVar) {
        f fVar = this.f12688F;
        if (fVar != null) {
            fVar.y0(cVar);
            return;
        }
        f fVar2 = this.f12687E;
        if (fVar2 != null) {
            fVar2.y0(cVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z0(k3.c cVar) {
        f fVar = this.f12688F;
        if (fVar != null) {
            fVar.z0(cVar);
        }
        f fVar2 = this.f12687E;
        if (fVar2 != null) {
            fVar2.z0(cVar);
        }
        this.f12687E = null;
    }
}
