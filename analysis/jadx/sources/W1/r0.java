package w1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import i1.C1134a;
import i3.C1136a;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends C3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WindowInsetsController f18237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1136a f18238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Window f18239v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r0(Window window, C1136a c1136a) {
        this.f18237t = window.getInsetsController();
        this.f18238u = c1136a;
        this.f18239v = window;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void D(int i) {
        if ((i & 8) != 0) {
            ((C1134a) this.f18238u.f13562r).u();
        }
        this.f18237t.hide(i & (-9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void O(boolean z5) {
        Window window = this.f18239v;
        if (z5) {
            if (window != null) {
                V(16);
            }
            this.f18237t.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                W(16);
            }
            this.f18237t.setSystemBarsAppearance(0, 16);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void P(boolean z5) {
        Window window = this.f18239v;
        if (z5) {
            if (window != null) {
                V(8192);
            }
            this.f18237t.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                W(8192);
            }
            this.f18237t.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public void R() {
        Window window = this.f18239v;
        if (window == null) {
            this.f18237t.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        W(2048);
        V(4096);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void S(int i) {
        if ((i & 8) != 0) {
            ((C1134a) this.f18238u.f13562r).z();
        }
        this.f18237t.show(i & (-9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(int i) {
        View decorView = this.f18239v.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(int i) {
        View decorView = this.f18239v.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
