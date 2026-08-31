package t;

import u.v0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v0 f16626r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(v0 v0Var, int i) {
        super(0);
        this.f16625q = i;
        this.f16626r = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f16625q) {
            case 0:
                v0 v0Var = this.f16626r;
                Object objJ = v0Var.f17069a.j();
                t tVar = t.f16639s;
                return Boolean.valueOf(objJ == tVar && v0Var.f17072d.getValue() == tVar);
            default:
                return Long.valueOf(this.f16626r.b());
        }
    }
}
