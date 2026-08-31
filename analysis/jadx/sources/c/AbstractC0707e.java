package c;

import P.C0371o;
import P.C0389z;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.B;
import com.wnapp.smspariaz.R;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0389z f10056a = new C0389z(C0706d.f10055q);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static B a(C0371o c0371o) {
        B b7 = (B) c0371o.k(f10056a);
        Object obj = null;
        if (b7 == null) {
            c0371o.S(544166745);
            View view = (View) c0371o.k(AndroidCompositionLocals_androidKt.f);
            m.e(view, "<this>");
            while (true) {
                if (view == null) {
                    b7 = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                B b8 = tag instanceof B ? (B) tag : null;
                if (b8 != null) {
                    b7 = b8;
                    break;
                }
                Object objQ = l6.d.q(view);
                view = objQ instanceof View ? (View) objQ : null;
            }
            c0371o.p(false);
        } else {
            c0371o.S(544164296);
            c0371o.p(false);
        }
        if (b7 != null) {
            c0371o.S(544164377);
            c0371o.p(false);
            return b7;
        }
        c0371o.S(544168748);
        Context baseContext = (Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof B) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        B b9 = (B) obj;
        c0371o.p(false);
        return b9;
    }
}
