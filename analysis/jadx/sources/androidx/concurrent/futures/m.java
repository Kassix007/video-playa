package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class m extends j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n f9375q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(n nVar) {
        this.f9375q = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.j
    public final String pendingToString() {
        k kVar = (k) this.f9375q.f9376q.get();
        if (kVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kVar.f9371a + "]";
    }
}
