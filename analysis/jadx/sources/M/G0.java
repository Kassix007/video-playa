package M;

import C0.AbstractC0103t0;
import P.C0363k;
import P.C0371o;
import com.google.android.gms.internal.measurement.P1;
import u.AbstractC1644d;
import u.AbstractC1670y;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3308a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u.z0 f3309b = AbstractC1644d.p(300, 2, AbstractC1670y.f17083a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I0 a(B5.c cVar, J0 j02, C0371o c0371o, int i, int i7) {
        W0.c cVar2 = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
        Object[] objArr = {false, cVar, false};
        C0221m c0221m = C0221m.f3577z;
        H0 h02 = new H0(false, cVar2, cVar, false);
        Z.m mVar = Z.n.f8314a;
        Z.m mVar2 = new Z.m(0, c0221m, h02);
        int i8 = (c0371o.h(false) ? 1 : 0) | (c0371o.g(cVar2) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !c0371o.g(j02)) && (i & 384) != 256) ? 0 : 1) | (c0371o.g(cVar) ? 1 : 0) | (((((i & 7168) ^ 3072) > 2048 && c0371o.h(false)) || (i & 3072) == 2048) ? 1 : 0);
        Object objH = c0371o.H();
        if (i8 != 0 || objH == C0363k.f5418a) {
            Object f02 = new F0(false, cVar2, j02, cVar, false);
            c0371o.d0(f02);
            objH = f02;
        }
        return (I0) P1.P(objArr, mVar2, (B5.a) objH, c0371o, 0, 4);
    }
}
