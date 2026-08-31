package p3;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends Q2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15849e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f15850g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v0(z0 z0Var, float f, float f7) {
        this.f15850g = z0Var;
        this.f15849e = f;
        this.f = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public void K(String str) {
        z0 z0Var = this.f15850g;
        if (z0Var.f0()) {
            x0 x0Var = (x0) z0Var.f15877c;
            if (x0Var.f15862b) {
                ((Canvas) z0Var.f15875a).drawText(str, this.f15849e, this.f, x0Var.f15864d);
            }
            x0 x0Var2 = (x0) z0Var.f15877c;
            if (x0Var2.f15863c) {
                ((Canvas) z0Var.f15875a).drawText(str, this.f15849e, this.f, x0Var2.f15865e);
            }
        }
        this.f15849e = ((x0) z0Var.f15877c).f15864d.measureText(str) + this.f15849e;
    }
}
