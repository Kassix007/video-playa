package z4;

/* JADX INFO: renamed from: z4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1977k implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S3.e f18754q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC1977k() {
        this.f18754q = null;
    }

    public abstract void a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e7) {
            S3.e eVar = this.f18754q;
            if (eVar != null) {
                eVar.a(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC1977k(S3.e eVar) {
        this.f18754q = eVar;
    }
}
