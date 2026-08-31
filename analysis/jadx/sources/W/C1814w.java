package w;

import m5.C1386y;

/* JADX INFO: renamed from: w.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1814w extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f18093r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1814w(C c7, int i) {
        super(0);
        this.f18092q = i;
        this.f18093r = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f18092q) {
            case 0:
                O5.e eVar = this.f18093r.f17748K;
                if (eVar != null) {
                    eVar.j(C1799o.f18034a);
                }
                return C1386y.f15098a;
            default:
                return Boolean.valueOf(!this.f18093r.H0());
        }
    }
}
