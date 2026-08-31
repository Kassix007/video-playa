package W3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f8108a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L1.a f8109b = new L1.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L1.a f8110c = new L1.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L1.a f8111d = new L1.a(L1.a.f3245e);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new DecelerateInterpolator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float a(float f, float f7, float f8) {
        return i.a(f7, f, f8, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float b(float f, float f7, float f8, float f9, float f10) {
        return f10 <= f8 ? f : f10 >= f9 ? f7 : a(f, f7, (f10 - f8) / (f9 - f8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(float f, int i, int i7) {
        return Math.round(f * (i7 - i)) + i;
    }
}
