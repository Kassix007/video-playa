package C0;

import P.C0371o;
import android.graphics.Matrix;
import android.view.View;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final K f881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final K f882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final K f883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final K f884u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f885q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f881r = new K(i, 0);
        f882s = new K(i, 1);
        f883t = new K(i, 2);
        f884u = new K(i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, int i7) {
        super(i);
        this.f885q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f885q) {
            case 0:
                I0.m mVar = (I0.m) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                I0.i iVar = ((I0.m) obj).f2268d;
                I0.s sVar = I0.p.f2316r;
                Object objG = iVar.f2257q.g(sVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = mVar.f2268d.f2257q.g(sVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                break;
            case 1:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0371o.N();
                }
                break;
            case 2:
                ((InterfaceC0107v0) obj).K((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return C1386y.f15098a;
    }
}
