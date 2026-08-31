package u2;

import P.C0363k;
import P.C0371o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17191a = W0.b.g(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E2.e f17192b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        E2.h hVar = E2.h.f1687c;
        f17192b = new E2.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final D2.j a(Object obj, C0371o c0371o) {
        c0371o.T(1087186730);
        if (obj instanceof D2.j) {
            D2.j jVar = (D2.j) obj;
            c0371o.p(false);
            return jVar;
        }
        Context context = (Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b);
        c0371o.T(-1245195153);
        boolean zG = c0371o.g(context) | c0371o.g(obj);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            D2.h hVar = new D2.h(context);
            hVar.f1383c = obj;
            objH = hVar.a();
            c0371o.d0(objH);
        }
        D2.j jVar2 = (D2.j) objH;
        c0371o.p(false);
        c0371o.p(false);
        return jVar2;
    }
}
