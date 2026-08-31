package L;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.W;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n5.AbstractC1397A;
import v.P;
import v.Q;

/* JADX INFO: loaded from: classes.dex */
public final class d implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f3021c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(boolean z5, float f, W w3) {
        this.f3019a = z5;
        this.f3020b = f;
        this.f3021c = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v.P
    public final Q a(y.i iVar, C0371o c0371o) {
        long jB;
        c0371o.S(988743187);
        n nVar = (n) c0371o.k(p.f3051a);
        W w3 = this.f3021c;
        if (((j0.o) w3.getValue()).f13724a != 16) {
            c0371o.S(-303557454);
            c0371o.p(false);
            jB = ((j0.o) w3.getValue()).f13724a;
        } else {
            c0371o.S(-303499670);
            jB = nVar.b(c0371o);
            c0371o.p(false);
        }
        W wT = C0345b.t(new j0.o(jB), c0371o);
        W wT2 = C0345b.t(nVar.a(c0371o), c0371o);
        c0371o.S(331259447);
        ViewGroup viewGroupK = AbstractC1397A.k((View) c0371o.k(AndroidCompositionLocals_androidKt.f));
        boolean zG = c0371o.g(iVar) | c0371o.g(this) | c0371o.g(viewGroupK);
        Object objH = c0371o.H();
        Object obj = C0363k.f5418a;
        if (zG || objH == obj) {
            Object aVar = new a(this.f3019a, this.f3020b, wT, wT2, viewGroupK);
            c0371o.d0(aVar);
            objH = aVar;
        }
        a aVar2 = (a) objH;
        c0371o.p(false);
        boolean zG2 = c0371o.g(iVar) | c0371o.i(aVar2);
        Object objH2 = c0371o.H();
        if (zG2 || objH2 == obj) {
            objH2 = new f(iVar, aVar2, null);
            c0371o.d0(objH2);
        }
        C0345b.f(aVar2, iVar, (B5.e) objH2, c0371o);
        c0371o.p(false);
        return aVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3019a == dVar.f3019a && W0.f.a(this.f3020b, dVar.f3020b) && this.f3021c.equals(dVar.f3021c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3021c.hashCode() + k1.i.b(this.f3020b, Boolean.hashCode(this.f3019a) * 31, 31);
    }
}
