package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.a
    public final boolean a(j jVar, e eVar, e eVar2) {
        synchronized (jVar) {
            try {
                if (jVar.listeners != eVar) {
                    return false;
                }
                jVar.listeners = eVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.a
    public final boolean b(j jVar, Object obj, Object obj2) {
        synchronized (jVar) {
            try {
                if (jVar.value != obj) {
                    return false;
                }
                jVar.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.a
    public final boolean c(j jVar, i iVar, i iVar2) {
        synchronized (jVar) {
            try {
                if (jVar.waiters != iVar) {
                    return false;
                }
                jVar.waiters = iVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.a
    public final void d(i iVar, i iVar2) {
        iVar.f9370b = iVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.a
    public final void e(i iVar, Thread thread) {
        iVar.f9369a = thread;
    }
}
