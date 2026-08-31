package d2;

import B0.G0;
import M.C0231t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: d2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0957D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0999y f11968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f11969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11972e;
    public long f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(AbstractC0974V abstractC0974V) {
        RecyclerView recyclerView;
        int i = abstractC0974V.j;
        if (abstractC0974V.f() || (i & 4) != 0 || (recyclerView = abstractC0974V.f12046r) == null) {
            return;
        }
        recyclerView.F(abstractC0974V);
    }

    public abstract boolean a(AbstractC0974V abstractC0974V, AbstractC0974V abstractC0974V2, C0231t c0231t, C0231t c0231t2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(AbstractC0974V abstractC0974V) {
        C0999y c0999y = this.f11968a;
        if (c0999y != null) {
            RecyclerView recyclerView = c0999y.f12221a;
            boolean z5 = true;
            abstractC0974V.n(true);
            View view = abstractC0974V.f12032a;
            if (abstractC0974V.f12038h != null && abstractC0974V.i == null) {
                abstractC0974V.f12038h = null;
            }
            abstractC0974V.i = null;
            if ((abstractC0974V.j & 16) != 0) {
                return;
            }
            C0966M c0966m = recyclerView.f9650r;
            recyclerView.a0();
            G0 g02 = recyclerView.f9656u;
            O3.T t6 = (O3.T) g02.f235s;
            C0999y c0999y2 = (C0999y) g02.f234r;
            int iIndexOfChild = c0999y2.f12221a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                g02.Z(view);
            } else if (t6.e(iIndexOfChild)) {
                t6.i(iIndexOfChild);
                g02.Z(view);
                c0999y2.a(iIndexOfChild);
            } else {
                z5 = false;
            }
            if (z5) {
                AbstractC0974V abstractC0974VI = RecyclerView.I(view);
                c0966m.j(abstractC0974VI);
                c0966m.g(abstractC0974VI);
            }
            recyclerView.b0(!z5);
            if (z5 || !abstractC0974V.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(AbstractC0974V abstractC0974V);

    public abstract void e();

    public abstract boolean f();
}
