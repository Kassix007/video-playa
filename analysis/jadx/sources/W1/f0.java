package w1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends l0 {
    public static boolean i = false;
    public static Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Class f18199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f18200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f18201m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f18202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1.b[] f18203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1.b f18204e;
    public o0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n1.b f18205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18206h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var);
        this.f18204e = null;
        this.f18202c = windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"PrivateApi"})
    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f18199k = cls;
            f18200l = cls.getDeclaredField("mVisibleInsets");
            f18201m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f18200l.setAccessible(true);
            f18201m.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean C(int i7, int i8) {
        return (i7 & 6) == (i8 & 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"WrongConstant"})
    private n1.b w(int i7, boolean z5) {
        n1.b bVarA = n1.b.f15124e;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                bVarA = n1.b.a(bVarA, x(i8, z5));
            }
        }
        return bVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private n1.b y() {
        o0 o0Var = this.f;
        return o0Var != null ? o0Var.f18232a.j() : n1.b.f15124e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private n1.b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            B();
        }
        Method method = j;
        if (method != null && f18199k != null && f18200l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f18200l.get(f18201m.get(objInvoke));
                if (rect != null) {
                    return n1.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean A(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !x(i7, false).equals(n1.b.f15124e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void d(View view) {
        n1.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = n1.b.f15124e;
        }
        s(bVarZ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void e(o0 o0Var) {
        o0Var.f18232a.t(this.f);
        n1.b bVar = this.f18205g;
        l0 l0Var = o0Var.f18232a;
        l0Var.s(bVar);
        l0Var.v(this.f18206h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Objects.equals(this.f18205g, f0Var.f18205g) && C(this.f18206h, f0Var.f18206h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public n1.b g(int i7) {
        return w(i7, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public n1.b h(int i7) {
        return w(i7, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public final n1.b l() {
        if (this.f18204e == null) {
            WindowInsets windowInsets = this.f18202c;
            this.f18204e = n1.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f18204e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public o0 n(int i7, int i8, int i9, int i10) {
        o0 o0VarG = o0.g(null, this.f18202c);
        int i11 = Build.VERSION.SDK_INT;
        e0 d0Var = i11 >= 34 ? new d0(o0VarG) : i11 >= 30 ? new c0(o0VarG) : i11 >= 29 ? new b0(o0VarG) : new a0(o0VarG);
        d0Var.g(o0.e(l(), i7, i8, i9, i10));
        d0Var.e(o0.e(j(), i7, i8, i9, i10));
        return d0Var.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public boolean p() {
        return this.f18202c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    @SuppressLint({"WrongConstant"})
    public boolean q(int i7) {
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0 && !A(i8)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void r(n1.b[] bVarArr) {
        this.f18203d = bVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void s(n1.b bVar) {
        this.f18205g = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void t(o0 o0Var) {
        this.f = o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void v(int i7) {
        this.f18206h = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b x(int i7, boolean z5) {
        n1.b bVarJ;
        int i8;
        n1.b bVar = n1.b.f15124e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 8) {
                    n1.b[] bVarArr = this.f18203d;
                    bVarJ = bVarArr != null ? bVarArr[AbstractC1918b.t(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    n1.b bVarL = l();
                    n1.b bVarY = y();
                    int i9 = bVarL.f15128d;
                    if (i9 > bVarY.f15128d) {
                        return n1.b.b(0, 0, 0, i9);
                    }
                    n1.b bVar2 = this.f18205g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i8 = this.f18205g.f15128d) > bVarY.f15128d) {
                        return n1.b.b(0, 0, 0, i8);
                    }
                } else {
                    if (i7 == 16) {
                        return k();
                    }
                    if (i7 == 32) {
                        return i();
                    }
                    if (i7 == 64) {
                        return m();
                    }
                    if (i7 == 128) {
                        o0 o0Var = this.f;
                        C1845h c1845hF = o0Var != null ? o0Var.f18232a.f() : f();
                        if (c1845hF != null) {
                            int i10 = Build.VERSION.SDK_INT;
                            return n1.b.b(i10 >= 28 ? A1.k.g(c1845hF.f18215a) : 0, i10 >= 28 ? A1.k.i(c1845hF.f18215a) : 0, i10 >= 28 ? A1.k.h(c1845hF.f18215a) : 0, i10 >= 28 ? A1.k.f(c1845hF.f18215a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    n1.b bVarY2 = y();
                    n1.b bVarJ2 = j();
                    return n1.b.b(Math.max(bVarY2.f15125a, bVarJ2.f15125a), 0, Math.max(bVarY2.f15127c, bVarJ2.f15127c), Math.max(bVarY2.f15128d, bVarJ2.f15128d));
                }
                if ((this.f18206h & 2) == 0) {
                    n1.b bVarL2 = l();
                    o0 o0Var2 = this.f;
                    bVarJ = o0Var2 != null ? o0Var2.f18232a.j() : null;
                    int iMin = bVarL2.f15128d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f15128d);
                    }
                    return n1.b.b(bVarL2.f15125a, 0, bVarL2.f15127c, iMin);
                }
            }
        } else {
            if (z5) {
                return n1.b.b(0, Math.max(y().f15126b, l().f15126b), 0, 0);
            }
            if ((this.f18206h & 4) == 0) {
                return n1.b.b(0, l().f15126b, 0, 0);
            }
        }
        return bVar;
    }

    public f0(o0 o0Var, f0 f0Var) {
        this(o0Var, new WindowInsets(f0Var.f18202c));
    }
}
