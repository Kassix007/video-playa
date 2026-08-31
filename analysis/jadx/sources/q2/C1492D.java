package q2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: q2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1492D extends C1491C {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D5.a
    public final void K(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.C1491C, D5.a
    public final void L(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.C1491C
    public final void Q(View view, int i, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.C1491C
    public final void R(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.C1491C
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D5.a
    public final float x(View view) {
        return view.getTransitionAlpha();
    }
}
