package w1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.wnapp.smspariaz.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f18167e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final L1.a f = new L1.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f18168g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f18169h = new AccelerateInterpolator(1.5f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(View view, Z z5) {
        Q qJ = j(view);
        if (qJ != null) {
            qJ.a(z5);
            if (qJ.f18159r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(View view, Z z5, o0 o0Var, boolean z6) {
        Q qJ = j(view);
        if (qJ != null) {
            qJ.f18158q = o0Var;
            if (!z6) {
                qJ.b();
                z6 = qJ.f18159r == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), z5, o0Var, z6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(View view, o0 o0Var, List list) {
        Q qJ = j(view);
        if (qJ != null) {
            o0Var = qJ.d(o0Var, list);
            if (qJ.f18159r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), o0Var, list);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(View view, Z z5, v3.l lVar) {
        Q qJ = j(view);
        if (qJ != null) {
            qJ.e(lVar);
            if (qJ.f18159r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), z5, lVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Q j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof T) {
            return ((T) tag).f18165a;
        }
        return null;
    }
}
