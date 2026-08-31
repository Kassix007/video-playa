package s4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f16550h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16554e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16555g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(float f, float f7, float f8, float f9) {
        this.f16551b = f;
        this.f16552c = f7;
        this.f16553d = f8;
        this.f16554e = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16558a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f16553d;
        float f7 = this.f16554e;
        RectF rectF = f16550h;
        rectF.set(this.f16551b, this.f16552c, f, f7);
        path.arcTo(rectF, this.f, this.f16555g, false);
        path.transform(matrix);
    }
}
