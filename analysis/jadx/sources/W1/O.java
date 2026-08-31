package w1;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f18157a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(View view) {
        this.f18157a = new WeakReference(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f) {
        View view = (View) this.f18157a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        View view = (View) this.f18157a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(long j) {
        View view = (View) this.f18157a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(P p7) {
        View view = (View) this.f18157a.get();
        if (view != null) {
            if (p7 != null) {
                view.animate().setListener(new Z3.a(p7, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(float f) {
        View view = (View) this.f18157a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
