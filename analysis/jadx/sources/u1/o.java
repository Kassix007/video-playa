package U1;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import R4.C0524y2;
import com.google.android.gms.internal.measurement.K1;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class o implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T1.d f7565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f7566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z.c f7567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0.q f7568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f7569u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(T1.d dVar, r rVar, Z.f fVar, a0.q qVar, q qVar2) {
        this.f7565q = dVar;
        this.f7566r = rVar;
        this.f7567s = fVar;
        this.f7568t = qVar;
        this.f7569u = qVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
            c0371o.N();
        } else {
            T1.d dVar = this.f7565q;
            boolean zI = c0371o.i(dVar);
            r rVar = this.f7566r;
            boolean zI2 = zI | c0371o.i(rVar);
            Object objH = c0371o.H();
            if (zI2 || objH == C0363k.f5418a) {
                objH = new C0524y2(this.f7568t, dVar, rVar, 1);
                c0371o.d0(objH);
            }
            C0345b.c(dVar, (B5.c) objH, c0371o);
            K1.a(dVar, this.f7567s, X.k.d(-497631156, new m(0, this.f7569u, dVar), c0371o), c0371o, 384);
        }
        return C1386y.f15098a;
    }
}
