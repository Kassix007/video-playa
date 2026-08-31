package P;

/* JADX INFO: loaded from: classes.dex */
public final class D implements w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B5.c f5286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E f5287r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(B5.c cVar) {
        this.f5286q = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void b() {
        this.f5287r = (E) this.f5286q.invoke(C0345b.f5387b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        E e7 = this.f5287r;
        if (e7 != null) {
            e7.a();
        }
        this.f5287r = null;
    }

    @Override // P.w0
    public final void c() {
    }
}
