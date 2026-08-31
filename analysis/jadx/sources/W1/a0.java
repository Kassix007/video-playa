package w1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f18181e = null;
    public static boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f18182g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f18183h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f18184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1.b f18185d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a0() {
        this.f18184c = i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static WindowInsets i() {
        if (!f) {
            try {
                f18181e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f = true;
        }
        Field field = f18181e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f18183h) {
            try {
                f18182g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f18183h = true;
        }
        Constructor constructor = f18182g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public o0 b() {
        a();
        o0 o0VarG = o0.g(null, this.f18184c);
        n1.b[] bVarArr = this.f18197b;
        l0 l0Var = o0VarG.f18232a;
        l0Var.r(bVarArr);
        l0Var.u(this.f18185d);
        return o0VarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void e(n1.b bVar) {
        this.f18185d = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void g(n1.b bVar) {
        WindowInsets windowInsets = this.f18184c;
        if (windowInsets != null) {
            this.f18184c = windowInsets.replaceSystemWindowInsets(bVar.f15125a, bVar.f15126b, bVar.f15127c, bVar.f15128d);
        }
    }

    public a0(o0 o0Var) {
        super(o0Var);
        this.f18184c = o0Var.f();
    }
}
