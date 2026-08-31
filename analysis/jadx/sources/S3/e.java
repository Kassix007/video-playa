package S3;

import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f7306a = new k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Exception exc) {
        k kVar = this.f7306a;
        kVar.getClass();
        AbstractC1887A.h(exc, "Exception must not be null");
        synchronized (kVar.f7316a) {
            try {
                if (kVar.f7318c) {
                    return;
                }
                kVar.f7318c = true;
                kVar.f7320e = exc;
                kVar.f7317b.g(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Object obj) {
        k kVar = this.f7306a;
        synchronized (kVar.f7316a) {
            try {
                if (kVar.f7318c) {
                    return;
                }
                kVar.f7318c = true;
                kVar.f7319d = obj;
                kVar.f7317b.g(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
