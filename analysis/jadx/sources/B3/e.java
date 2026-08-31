package B3;

import C0.A;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.ScrollCaptureSession) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 C0.A), (r2v0 android.graphics.Rect), (r3v0 android.graphics.Point), (r4v0 android.view.ScrollCaptureCallback) A[MD:(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void (c)] (LINE:1) call: android.view.ScrollCaptureTarget.<init>(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ScrollCaptureTarget f(A a7, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(a7, rect, point, scrollCaptureCallback);
    }
}
