package U1;

import P.C0371o;
import P.S0;
import P.W;
import com.google.android.gms.internal.measurement.K1;
import java.util.List;
import java.util.ListIterator;
import m5.C1386y;
import t.C1608g;
import u.C1645d0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f7532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T1.d f7533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z.c f7534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f7535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0 f7536u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(C1645d0 c1645d0, T1.d dVar, Z.f fVar, W w3, S0 s02) {
        this.f7532q = c1645d0;
        this.f7533r = dVar;
        this.f7534s = fVar;
        this.f7535t = w3;
        this.f7536u = s02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        C1608g c1608g = (C1608g) obj;
        T1.d dVar = (T1.d) obj2;
        C0371o c0371o = (C0371o) obj3;
        ((Number) obj4).intValue();
        boolean zA = kotlin.jvm.internal.m.a(this.f7532q.f16908t.getValue(), this.f7533r);
        if (!((Boolean) this.f7535t.getValue()).booleanValue() && !zA) {
            List list = (List) this.f7536u.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (kotlin.jvm.internal.m.a(dVar, (T1.d) objPrevious)) {
                    break;
                }
            }
            dVar = (T1.d) objPrevious;
        }
        if (dVar == null) {
            c0371o.S(105930796);
        } else {
            c0371o.S(-1520603531);
            K1.a(dVar, this.f7534s, X.k.d(-1263531443, new m(dVar, c1608g), c0371o), c0371o, 384);
        }
        c0371o.p(false);
        return C1386y.f15098a;
    }
}
