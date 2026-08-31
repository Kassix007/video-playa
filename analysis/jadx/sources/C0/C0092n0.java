package C0;

import android.graphics.Matrix;
import android.view.View;
import j0.AbstractC1145B;
import java.util.ArrayList;

/* JADX INFO: renamed from: C0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0092n0 implements InterfaceC0090m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f1068b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0092n0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f1067a = new int[size];
        this.f1068b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f1067a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f1068b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0090m0
    public void a(View view, float[] fArr) {
        AbstractC1145B.q(fArr);
        b(view, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z5 = parent instanceof View;
        float[] fArr2 = this.f1068b;
        if (z5) {
            b((View) parent, fArr);
            AbstractC1145B.q(fArr2);
            AbstractC1145B.y(fArr2, -view.getScrollX(), -view.getScrollY());
            W.o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            AbstractC1145B.q(fArr2);
            AbstractC1145B.y(fArr2, left, top);
            W.o(fArr, fArr2);
        } else {
            int[] iArr = this.f1067a;
            view.getLocationInWindow(iArr);
            AbstractC1145B.q(fArr2);
            AbstractC1145B.y(fArr2, -view.getScrollX(), -view.getScrollY());
            W.o(fArr, fArr2);
            float f = iArr[0];
            float f7 = iArr[1];
            AbstractC1145B.q(fArr2);
            AbstractC1145B.y(fArr2, f, f7);
            W.o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC1145B.r(fArr2, matrix);
        W.o(fArr, fArr2);
    }

    public C0092n0(int i, int i7) {
        this.f1067a = new int[]{i, i7};
        this.f1068b = new float[]{0.0f, 1.0f};
    }

    public C0092n0(int i, int i7, int i8) {
        this.f1067a = new int[]{i, i7, i8};
        this.f1068b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0092n0(float[] fArr) {
        this.f1068b = fArr;
        this.f1067a = new int[2];
    }
}
