package n3;

import android.graphics.Color;
import android.graphics.Matrix;
import b3.C0698a;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1395a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f15151e = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1395a(C1395a c1395a) {
        this.f15147a = 0.0f;
        this.f15148b = 0.0f;
        this.f15149c = 0.0f;
        this.f15150d = 0;
        this.f15147a = c1395a.f15147a;
        this.f15148b = c1395a.f15148b;
        this.f15149c = c1395a.f15149c;
        this.f15150d = c1395a.f15150d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, C0698a c0698a) {
        int iAlpha = Color.alpha(this.f15150d);
        int iC = g.c(i);
        Matrix matrix = i.f15199a;
        int i7 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i7 <= 0) {
            c0698a.clearShadowLayer();
        } else {
            c0698a.setShadowLayer(Math.max(this.f15147a, Float.MIN_VALUE), this.f15148b, this.f15149c, Color.argb(i7, Color.red(this.f15150d), Color.green(this.f15150d), Color.blue(this.f15150d)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        this.f15150d = Color.argb(Math.round((g.c(i) * Color.alpha(this.f15150d)) / 255.0f), Color.red(this.f15150d), Color.green(this.f15150d), Color.blue(this.f15150d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Matrix matrix) {
        if (this.f15151e == null) {
            this.f15151e = new float[2];
        }
        float[] fArr = this.f15151e;
        fArr[0] = this.f15148b;
        fArr[1] = this.f15149c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f15151e;
        this.f15148b = fArr2[0];
        this.f15149c = fArr2[1];
        this.f15147a = matrix.mapRadius(this.f15147a);
    }
}
