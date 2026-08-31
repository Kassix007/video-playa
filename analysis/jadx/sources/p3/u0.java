package p3;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f15848h;
    public final /* synthetic */ z0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, Path path, float f) {
        super(z0Var, f, 0.0f);
        this.i = z0Var;
        this.f15848h = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.v0, Q2.g
    public final void K(String str) {
        z0 z0Var = this.i;
        if (z0Var.f0()) {
            x0 x0Var = (x0) z0Var.f15877c;
            if (x0Var.f15862b) {
                ((Canvas) z0Var.f15875a).drawTextOnPath(str, this.f15848h, this.f15849e, this.f, x0Var.f15864d);
            }
            x0 x0Var2 = (x0) z0Var.f15877c;
            if (x0Var2.f15863c) {
                ((Canvas) z0Var.f15875a).drawTextOnPath(str, this.f15848h, this.f15849e, this.f, x0Var2.f15865e);
            }
        }
        this.f15849e = ((x0) z0Var.f15877c).f15864d.measureText(str) + this.f15849e;
    }
}
