package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f9373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9374d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj) {
        this.f9374d = true;
        n nVar = this.f9372b;
        if (nVar == null || !nVar.f9377r.set(obj)) {
            return;
        }
        this.f9371a = null;
        this.f9372b = null;
        this.f9373c = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Throwable th) {
        this.f9374d = true;
        n nVar = this.f9372b;
        if (nVar == null || !nVar.f9377r.setException(th)) {
            return;
        }
        this.f9371a = null;
        this.f9372b = null;
        this.f9373c = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() {
        p pVar;
        n nVar = this.f9372b;
        if (nVar != null) {
            m mVar = nVar.f9377r;
            if (!mVar.isDone()) {
                mVar.setException(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f9371a, 1));
            }
        }
        if (this.f9374d || (pVar = this.f9373c) == null) {
            return;
        }
        pVar.set(null);
    }
}
