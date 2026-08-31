package O5;

import M5.C0247h;
import m5.C1386y;
import v0.C1749r;

/* JADX INFO: loaded from: classes.dex */
public final class r implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5258q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5259r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f5258q) {
            case 0:
                C0247h c0247h = (C0247h) this.f5259r;
                C1386y c1386y = C1386y.f15098a;
                c0247h.resumeWith(c1386y);
                return c1386y;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1749r c1749r = (C1749r) this.f5259r;
                if (c1749r != null) {
                    c1749r.f17491s = zBooleanValue;
                }
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public r(C0247h c0247h) {
        this.f5259r = c0247h;
    }
}
