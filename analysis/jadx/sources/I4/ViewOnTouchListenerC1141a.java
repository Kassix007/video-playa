package i4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: i4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1141a implements View.OnTouchListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Dialog f13634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13637t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnTouchListenerC1141a(Dialog dialog, Rect rect) {
        this.f13634q = dialog;
        this.f13635r = rect.left;
        this.f13636s = rect.top;
        this.f13637t = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f13635r;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f13636s, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f13637t;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f13634q.onTouchEvent(motionEventObtain);
    }
}
