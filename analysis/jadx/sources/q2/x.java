package q2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1491C f16005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1497b f16006b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f16005a = new C1492D();
        } else {
            f16005a = new C1491C();
        }
        f16006b = new C1497b(Float.class, "translationAlpha", 5);
        new C1497b(Rect.class, "clipBounds", 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(View view, int i, int i7, int i8, int i9) {
        f16005a.Q(view, i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(View view, int i) {
        f16005a.L(view, i);
    }
}
