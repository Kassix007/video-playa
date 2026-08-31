package Z0;

import B0.K;
import B0.t0;
import C0.A;
import android.view.MotionEvent;
import m5.C1386y;
import r.C1544C;

/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f8326r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(r rVar, int i) {
        super(1);
        this.f8325q = i;
        this.f8326r = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f8325q) {
            case 0:
                t0 t0Var = (t0) obj;
                A a7 = t0Var instanceof A ? (A) t0Var : null;
                r rVar = this.f8326r;
                if (a7 != null) {
                    K k7 = new K(5, a7, rVar);
                    C1544C c1544c = a7.f721J0;
                    if (c1544c.f(k7) < 0) {
                        c1544c.a(k7);
                    }
                }
                rVar.removeAllViewsInLayout();
                return C1386y.f15098a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                r rVar2 = this.f8326r;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = rVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = rVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
