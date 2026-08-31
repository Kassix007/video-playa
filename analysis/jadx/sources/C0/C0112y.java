package C0;

import android.os.SystemClock;
import android.view.MotionEvent;
import m5.C1386y;

/* JADX INFO: renamed from: C0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0112y extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f1154r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0112y(A a7, int i) {
        super(0);
        this.f1153q = i;
        this.f1154r = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f1153q) {
            case 0:
                A a7 = this.f1154r;
                MotionEvent motionEvent = a7.f715G0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    a7.f717H0 = SystemClock.uptimeMillis();
                    a7.post(a7.f723K0);
                }
                return C1386y.f15098a;
            default:
                return this.f1154r.get_viewTreeOwners();
        }
    }
}
