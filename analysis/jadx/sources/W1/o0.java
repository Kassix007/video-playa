package w1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f18231b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f18232a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f18231b = k0.f18225s;
        } else if (i >= 30) {
            f18231b = j0.f18224r;
        } else {
            f18231b = l0.f18226b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f18232a = new k0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f18232a = new j0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f18232a = new i0(this, windowInsets);
        } else if (i >= 28) {
            this.f18232a = new h0(this, windowInsets);
        } else {
            this.f18232a = new g0(this, windowInsets);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n1.b e(n1.b bVar, int i, int i7, int i8, int i9) {
        int iMax = Math.max(0, bVar.f15125a - i);
        int iMax2 = Math.max(0, bVar.f15126b - i7);
        int iMax3 = Math.max(0, bVar.f15127c - i8);
        int iMax4 = Math.max(0, bVar.f15128d - i9);
        return (iMax == i && iMax2 == i7 && iMax3 == i8 && iMax4 == i9) ? bVar : n1.b.b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static o0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        o0 o0Var = new o0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            o0 o0VarA = AbstractC1827C.a(view);
            l0 l0Var = o0Var.f18232a;
            l0Var.t(o0VarA);
            l0Var.d(view.getRootView());
            l0Var.v(view.getWindowSystemUiVisibility());
        }
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.f18232a.l().f15128d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.f18232a.l().f15125a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        return this.f18232a.l().f15127c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        return this.f18232a.l().f15126b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return Objects.equals(this.f18232a, ((o0) obj).f18232a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsets f() {
        l0 l0Var = this.f18232a;
        if (l0Var instanceof f0) {
            return ((f0) l0Var).f18202c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        l0 l0Var = this.f18232a;
        if (l0Var == null) {
            return 0;
        }
        return l0Var.hashCode();
    }

    public o0(o0 o0Var) {
        if (o0Var != null) {
            l0 l0Var = o0Var.f18232a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (l0Var instanceof k0)) {
                this.f18232a = new k0(this, (k0) l0Var);
            } else if (i >= 30 && (l0Var instanceof j0)) {
                this.f18232a = new j0(this, (j0) l0Var);
            } else if (i >= 29 && (l0Var instanceof i0)) {
                this.f18232a = new i0(this, (i0) l0Var);
            } else if (i >= 28 && (l0Var instanceof h0)) {
                this.f18232a = new h0(this, (h0) l0Var);
            } else if (l0Var instanceof g0) {
                this.f18232a = new g0(this, (g0) l0Var);
            } else if (l0Var instanceof f0) {
                this.f18232a = new f0(this, (f0) l0Var);
            } else {
                this.f18232a = new l0(this);
            }
            l0Var.e(this);
            return;
        }
        this.f18232a = new l0(this);
    }
}
