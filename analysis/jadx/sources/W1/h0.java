package w1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends g0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public o0 a() {
        return o0.g(null, this.f18202c.consumeDisplayCutout());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.f0, w1.l0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Objects.equals(this.f18202c, h0Var.f18202c) && Objects.equals(this.f18205g, h0Var.f18205g) && f0.C(this.f18206h, h0Var.f18206h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public C1845h f() {
        DisplayCutout displayCutout = this.f18202c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1845h(displayCutout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public int hashCode() {
        return this.f18202c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public h0(o0 o0Var, h0 h0Var) {
        super(o0Var, h0Var);
    }
}
