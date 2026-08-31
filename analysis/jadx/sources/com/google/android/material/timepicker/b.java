package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f11710q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(ClockFaceView clockFaceView) {
        this.f11710q = clockFaceView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f11710q;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f11679J.f11700t) - clockFaceView.f11687R;
        if (height != clockFaceView.f11713H) {
            clockFaceView.f11713H = height;
            clockFaceView.l();
            ClockHandView clockHandView = clockFaceView.f11679J;
            clockHandView.f11695B = clockFaceView.f11713H;
            clockHandView.invalidate();
        }
        return true;
    }
}
