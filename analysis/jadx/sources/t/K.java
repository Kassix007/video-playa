package t;

import C0.AbstractC0103t0;
import P.C0363k;
import P.C0371o;
import android.view.ViewConfiguration;
import i3.C1136a;
import u.C1667v;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f16589a = ViewConfiguration.getScrollFriction();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1667v a(C0371o c0371o) {
        W0.c cVar = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
        boolean zD = c0371o.d(cVar.b());
        Object objH = c0371o.H();
        if (zD || objH == C0363k.f5418a) {
            objH = new C1667v(new C1136a(cVar));
            c0371o.d0(objH);
        }
        return (C1667v) objH;
    }
}
