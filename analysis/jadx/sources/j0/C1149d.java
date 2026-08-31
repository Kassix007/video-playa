package j0;

import android.os.Build;
import com.wnapp.smspariaz.R;
import l0.C1219b;
import m0.C1348c;
import m0.C1351f;
import m0.C1353h;
import m0.C1355j;
import m0.InterfaceC1350e;
import n0.AbstractC1391a;
import n0.C1392b;

/* JADX INFO: renamed from: j0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149d implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13700d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.A f13701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13702b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1392b f13703c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1149d(C0.A a7) {
        this.f13701a = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.t
    public final void a(C1348c c1348c) {
        synchronized (this.f13702b) {
            if (!c1348c.f14937s) {
                c1348c.f14937s = true;
                c1348c.b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.t
    public final C1348c b() {
        InterfaceC1350e c1355j;
        C1348c c1348c;
        synchronized (this.f13702b) {
            try {
                C0.A a7 = this.f13701a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    a7.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c1355j = new C1353h();
                } else if (f13700d) {
                    try {
                        c1355j = new C1351f(this.f13701a, new n(), new C1219b());
                    } catch (Throwable unused) {
                        f13700d = false;
                        c1355j = new C1355j(c(this.f13701a));
                    }
                } else {
                    c1355j = new C1355j(c(this.f13701a));
                }
                c1348c = new C1348c(c1355j);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1348c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1391a c(C0.A a7) {
        C1392b c1392b = this.f13703c;
        if (c1392b != null) {
            return c1392b;
        }
        C1392b c1392b2 = new C1392b(a7.getContext());
        c1392b2.setClipChildren(false);
        c1392b2.setClipToPadding(false);
        c1392b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        a7.addView(c1392b2, -1);
        this.f13703c = c1392b2;
        return c1392b2;
    }
}
