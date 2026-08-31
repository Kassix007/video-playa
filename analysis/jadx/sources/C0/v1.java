package C0;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0380t;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0688b;
import com.wnapp.smspariaz.R;
import java.util.Set;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w1 f1137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.e f1138s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(w1 w1Var, B5.e eVar, int i) {
        super(2);
        this.f1136q = i;
        this.f1137r = w1Var;
        this.f1138s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1136q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f1137r.f1143q, this.f1138s, c0371o, 0);
                } else {
                    c0371o.N();
                }
                break;
            default:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w1 w1Var = this.f1137r;
                    A a7 = w1Var.f1143q;
                    Object tag = a7.getTag(R.id.inspection_slot_table_set);
                    Set set = (!(tag instanceof Set) || ((tag instanceof C5.a) && !(tag instanceof C5.d))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = a7.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof C5.a) && !(tag2 instanceof C5.d))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C0380t c0380t = c0371o2.f5455Q;
                        if (c0380t == null) {
                            c0380t = new C0380t(c0371o2.f5461g);
                            c0371o2.f5455Q = c0380t;
                        }
                        set.add(c0380t);
                        c0371o2.f5468p = true;
                        c0371o2.f5440B = true;
                        c0371o2.f5458c.g();
                        c0371o2.f5445G.g();
                        P.D0 d02 = c0371o2.f5446H;
                        P.A0 a02 = d02.f5288a;
                        d02.f5292e = a02.f5274z;
                        d02.f = a02.f5264A;
                    }
                    boolean zI = c0371o2.i(w1Var);
                    Object objH = c0371o2.H();
                    P.S s6 = C0363k.f5418a;
                    if (zI || objH == s6) {
                        objH = new t1(w1Var, null);
                        c0371o2.d0(objH);
                    }
                    C0345b.e((B5.e) objH, c0371o2, a7);
                    boolean zI2 = c0371o2.i(w1Var);
                    Object objH2 = c0371o2.H();
                    if (zI2 || objH2 == s6) {
                        objH2 = new u1(w1Var, null);
                        c0371o2.d0(objH2);
                    }
                    C0345b.e((B5.e) objH2, c0371o2, a7);
                    C0345b.a(AbstractC0688b.f9927a.a(set), X.k.d(-1193460702, new v1(w1Var, this.f1138s, 0), c0371o2), c0371o2, 56);
                } else {
                    c0371o2.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
