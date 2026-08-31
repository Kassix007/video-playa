package S3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7312b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7314d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7311a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7313c = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Executor executor, a aVar) {
        this.f7312b = executor;
        this.f7314d = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.i
    public final void a(d dVar) {
        switch (this.f7311a) {
            case 0:
                synchronized (this.f7313c) {
                    break;
                }
                this.f7312b.execute(new I4.a(19, (Object) this, (Object) dVar, false));
                return;
            case 1:
                if (dVar.d()) {
                    return;
                }
                synchronized (this.f7313c) {
                    break;
                }
                this.f7312b.execute(new I4.a(20, (Object) this, (Object) dVar, false));
                return;
            default:
                if (dVar.d()) {
                    synchronized (this.f7313c) {
                        break;
                    }
                    this.f7312b.execute(new I4.a(21, (Object) this, (Object) dVar, false));
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public h(Executor executor, b bVar) {
        this.f7312b = executor;
        this.f7314d = bVar;
    }

    public h(Executor executor, c cVar) {
        this.f7312b = executor;
        this.f7314d = cVar;
    }
}
