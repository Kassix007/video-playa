package M5;

import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class K extends e0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3814v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ K(int i, Object obj) {
        this.f3813u = i;
        this.f3814v = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final boolean k() {
        switch (this.f3813u) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final void l(Throwable th) {
        switch (this.f3813u) {
            case 0:
                ((J) this.f3814v).a();
                break;
            case 1:
                ((B5.c) this.f3814v).invoke(th);
                break;
            default:
                f0 f0Var = (f0) this.f3814v;
                Object obj = i0.f3864q.get(j());
                if (!(obj instanceof C0255p)) {
                    f0Var.resumeWith(AbstractC0263y.z(obj));
                } else {
                    f0Var.resumeWith(AbstractC1362a.b(((C0255p) obj).f3878a));
                }
                break;
        }
    }
}
