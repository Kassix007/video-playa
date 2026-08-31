package w1;

import android.view.View;
import android.view.Window;
import i1.C1134a;
import i3.C1136a;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends C3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Window f18234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1136a f18235u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p0(Window window, C1136a c1136a) {
        this.f18234t = window;
        this.f18235u = c1136a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void D(int i) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i & i7) != 0) {
                if (i7 == 1) {
                    V(4);
                } else if (i7 == 2) {
                    V(2);
                } else if (i7 == 8) {
                    ((C1134a) this.f18235u.f13562r).u();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void P(boolean z5) {
        if (!z5) {
            W(8192);
            return;
        }
        Window window = this.f18234t;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        V(8192);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void R() {
        this.f18234t.getDecorView().setTag(356039078, 2);
        W(2048);
        V(4096);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final void S(int i) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i & i7) != 0) {
                if (i7 == 1) {
                    W(4);
                    this.f18234t.clearFlags(1024);
                } else if (i7 == 2) {
                    W(2);
                } else if (i7 == 8) {
                    ((C1134a) this.f18235u.f13562r).z();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(int i) {
        View decorView = this.f18234t.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(int i) {
        View decorView = this.f18234t.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
