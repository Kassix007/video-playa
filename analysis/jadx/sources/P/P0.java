package P;

import m5.C1386y;
import r.C1549H;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1549H f5360r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(C1549H c1549h, int i) {
        super(1);
        this.f5359q = i;
        this.f5360r = c1549h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f5359q) {
            case 0:
                if (obj instanceof a0.v) {
                    ((a0.v) obj).c(4);
                }
                this.f5360r.a(obj);
                return C1386y.f15098a;
            default:
                return obj == this.f5360r ? "(this)" : String.valueOf(obj);
        }
    }
}
