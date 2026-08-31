package q2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: q2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1491C extends D5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f15911d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f15912e = true;
    public static boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f15913g = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D5.a
    public void L(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.L(view, i);
        } else if (f15913g) {
            try {
                AbstractC1490B.a(view, i);
            } catch (NoSuchMethodError unused) {
                f15913g = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Q(View view, int i, int i7, int i8, int i9) {
        if (f) {
            try {
                AbstractC1489A.a(view, i, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void R(View view, Matrix matrix) {
        if (f15911d) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f15911d = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void S(View view, Matrix matrix) {
        if (f15912e) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f15912e = false;
            }
        }
    }
}
