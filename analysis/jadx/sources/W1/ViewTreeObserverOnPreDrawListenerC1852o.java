package w1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: w1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1852o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f18228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f18229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f18230s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC1852o(View view, Runnable runnable) {
        this.f18228q = view;
        this.f18229r = view.getViewTreeObserver();
        this.f18230s = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1852o viewTreeObserverOnPreDrawListenerC1852o = new ViewTreeObserverOnPreDrawListenerC1852o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1852o);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1852o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f18229r.isAlive();
        View view = this.f18228q;
        if (zIsAlive) {
            this.f18229r.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f18230s.run();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f18229r = view.getViewTreeObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f18229r.isAlive();
        View view2 = this.f18228q;
        if (zIsAlive) {
            this.f18229r.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
