package p3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Q2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15855e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f15857h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w0(z0 z0Var, float f, float f7) {
        this.f15855e = 1;
        this.f15857h = z0Var;
        this.i = new RectF();
        this.f = f;
        this.f15856g = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final void K(String str) {
        String str2;
        switch (this.f15855e) {
            case 0:
                z0 z0Var = this.f15857h;
                if (z0Var.f0()) {
                    Path path = new Path();
                    str2 = str;
                    ((x0) z0Var.f15877c).f15864d.getTextPath(str2, 0, str.length(), this.f, this.f15856g, path);
                    ((Path) this.i).addPath(path);
                } else {
                    str2 = str;
                }
                this.f = ((x0) z0Var.f15877c).f15864d.measureText(str2) + this.f;
                break;
            default:
                z0 z0Var2 = this.f15857h;
                if (z0Var2.f0()) {
                    Rect rect = new Rect();
                    ((x0) z0Var2.f15877c).f15864d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f, this.f15856g);
                    ((RectF) this.i).union(rectF);
                }
                this.f = ((x0) z0Var2.f15877c).f15864d.measureText(str) + this.f;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final boolean x(l0 l0Var) {
        switch (this.f15855e) {
            case 0:
                if (!(l0Var instanceof m0)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(l0Var instanceof m0)) {
                    return true;
                }
                m0 m0Var = (m0) l0Var;
                Y yS = l0Var.f15750a.S(m0Var.f15790n);
                if (yS == null) {
                    z0.v("TextPath path reference '%s' not found", m0Var.f15790n);
                } else {
                    I i = (I) yS;
                    t0 t0Var = new t0(i.f15666o);
                    Matrix matrix = i.f15871n;
                    Path path = t0Var.f15844a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.i).union(rectF);
                }
                return false;
        }
    }

    public w0(z0 z0Var, float f, float f7, Path path) {
        this.f15855e = 0;
        this.f15857h = z0Var;
        this.f = f;
        this.f15856g = f7;
        this.i = path;
    }
}
