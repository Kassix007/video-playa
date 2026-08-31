package d3;

import java.util.Collections;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends e {
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(Z.m mVar, Object obj) {
        super(Collections.EMPTY_LIST);
        j(mVar);
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final float b() {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object e() {
        Z.m mVar = this.f12234e;
        Object obj = this.i;
        float f = this.f12233d;
        return mVar.o(0.0f, 0.0f, obj, obj, f, f, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object f(C1415a c1415a, float f) {
        return e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final void h() {
        if (this.f12234e != null) {
            super.h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final void i(float f) {
        this.f12233d = f;
    }
}
