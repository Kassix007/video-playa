package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class H implements K {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f9492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K f9493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9494s = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H(G g7, K k7) {
        this.f9492q = g7;
        this.f9493r = k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.K
    public final void onChanged(Object obj) {
        int i = this.f9494s;
        int i7 = this.f9492q.f9490g;
        if (i != i7) {
            this.f9494s = i7;
            this.f9493r.onChanged(obj);
        }
    }
}
