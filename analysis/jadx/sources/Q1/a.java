package Q1;

import K2.j;
import P.C0371o;
import P.C0389z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.X;
import androidx.lifecycle.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0389z f6524a = new C0389z(new j(8));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l0 a(C0371o c0371o) {
        l0 l0VarE = (l0) c0371o.k(f6524a);
        if (l0VarE == null) {
            c0371o.S(1260197609);
            l0VarE = X.e((View) c0371o.k(AndroidCompositionLocals_androidKt.f));
        } else {
            c0371o.S(1260196493);
        }
        c0371o.p(false);
        return l0VarE;
    }
}
