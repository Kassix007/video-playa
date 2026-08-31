package C0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import j0.AbstractC1145B;

/* JADX INFO: renamed from: C0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094o0 implements InterfaceC0090m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f1074a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1075b = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0090m0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f1074a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f1075b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i7 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i7);
        AbstractC1145B.r(fArr, matrix);
    }
}
