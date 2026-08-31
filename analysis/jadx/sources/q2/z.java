package q2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
