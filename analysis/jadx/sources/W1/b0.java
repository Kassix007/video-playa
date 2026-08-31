package w1;

import android.view.WindowInsets;
import t1.AbstractC1614a;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f18189c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b0() {
        this.f18189c = AbstractC1614a.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public o0 b() {
        a();
        o0 o0VarG = o0.g(null, this.f18189c.build());
        o0VarG.f18232a.r(this.f18197b);
        return o0VarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void d(n1.b bVar) {
        this.f18189c.setMandatorySystemGestureInsets(bVar.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void e(n1.b bVar) {
        this.f18189c.setStableInsets(bVar.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void f(n1.b bVar) {
        this.f18189c.setSystemGestureInsets(bVar.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void g(n1.b bVar) {
        this.f18189c.setSystemWindowInsets(bVar.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.e0
    public void h(n1.b bVar) {
        this.f18189c.setTappableElementInsets(bVar.d());
    }

    public b0(o0 o0Var) {
        WindowInsets.Builder builderH;
        super(o0Var);
        WindowInsets windowInsetsF = o0Var.f();
        if (windowInsetsF != null) {
            builderH = AbstractC1614a.i(windowInsetsF);
        } else {
            builderH = AbstractC1614a.h();
        }
        this.f18189c = builderH;
    }
}
