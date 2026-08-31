package E4;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S3.e f1731q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g() {
        this.f1731q = null;
    }

    public abstract void a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e7) {
            S3.e eVar = this.f1731q;
            if (eVar != null) {
                eVar.a(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public g(S3.e eVar) {
        this.f1731q = eVar;
    }
}
