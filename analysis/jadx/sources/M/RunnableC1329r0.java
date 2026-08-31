package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: m.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1329r0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1331s0 f14865r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1329r0(AbstractViewOnTouchListenerC1331s0 abstractViewOnTouchListenerC1331s0, int i) {
        this.f14864q = i;
        this.f14865r = abstractViewOnTouchListenerC1331s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14864q) {
            case 0:
                ViewParent parent = this.f14865r.f14870t.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC1331s0 abstractViewOnTouchListenerC1331s0 = this.f14865r;
                abstractViewOnTouchListenerC1331s0.a();
                View view = abstractViewOnTouchListenerC1331s0.f14870t;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1331s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1331s0.f14873w = true;
                    break;
                }
                break;
        }
    }
}
