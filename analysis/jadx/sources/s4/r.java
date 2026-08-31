package s4;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16557c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16558a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f16556b, this.f16557c);
        path.transform(matrix);
    }
}
