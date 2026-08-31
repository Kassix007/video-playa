package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: m.B0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1246B0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1248C0 f14618q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnTouchListenerC1246B0(C1248C0 c1248c0) {
        this.f14618q = c1248c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1342y c1342y;
        C1248C0 c1248c0 = this.f14618q;
        RunnableC1343y0 runnableC1343y0 = c1248c0.f14628H;
        Handler handler = c1248c0.f14632L;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        if (action == 0 && (c1342y = c1248c0.f14636P) != null && c1342y.isShowing() && x6 >= 0 && x6 < c1248c0.f14636P.getWidth() && y6 >= 0 && y6 < c1248c0.f14636P.getHeight()) {
            handler.postDelayed(runnableC1343y0, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC1343y0);
        return false;
    }
}
