package z4;

/* JADX INFO: renamed from: z4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1978l extends AbstractRunnableC1977k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f18756s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1978l(int i, Object obj) {
        this.f18755r = i;
        this.f18756s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.AbstractRunnableC1977k
    public final void a() {
        switch (this.f18755r) {
            case 0:
                synchronized (((C1980n) this.f18756s).f) {
                    try {
                        if (((C1980n) this.f18756s).f18767k.get() > 0 && ((C1980n) this.f18756s).f18767k.decrementAndGet() > 0) {
                            ((C1980n) this.f18756s).f18761b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C1980n c1980n = (C1980n) this.f18756s;
                        if (c1980n.f18769m != null) {
                            c1980n.f18761b.e("Unbind from service.", new Object[0]);
                            C1980n c1980n2 = (C1980n) this.f18756s;
                            c1980n2.f18760a.unbindService(c1980n2.f18768l);
                            C1980n c1980n3 = (C1980n) this.f18756s;
                            c1980n3.f18765g = false;
                            c1980n3.f18769m = null;
                            c1980n3.f18768l = null;
                        }
                        ((C1980n) this.f18756s).d();
                        return;
                    } finally {
                    }
                }
            default:
                C1980n c1980n4 = (C1980n) ((E4.j) this.f18756s).f1737r;
                c1980n4.f18761b.e("unlinkToDeath", new Object[0]);
                c1980n4.f18769m.asBinder().unlinkToDeath(c1980n4.j, 0);
                c1980n4.f18769m = null;
                c1980n4.f18765g = false;
                return;
        }
    }
}
