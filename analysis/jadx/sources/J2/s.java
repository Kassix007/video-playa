package J2;

import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class s implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q6.l f2791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E3.h f2792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2793s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1540i f2795u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(InterfaceC1540i interfaceC1540i, q6.l lVar, E3.h hVar) {
        this.f2791q = lVar;
        this.f2792r = hVar;
        this.f2795u = interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final q6.x A() {
        synchronized (this.f2793s) {
            if (this.f2794t) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final E3.h C() {
        return this.f2792r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final InterfaceC1540i O() {
        InterfaceC1540i interfaceC1540i;
        synchronized (this.f2793s) {
            try {
                if (this.f2794t) {
                    throw new IllegalStateException("closed");
                }
                interfaceC1540i = this.f2795u;
                if (interfaceC1540i == null) {
                    q6.l lVar = this.f2791q;
                    kotlin.jvm.internal.m.b(null);
                    lVar.a0(null);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2793s) {
            this.f2794t = true;
            InterfaceC1540i interfaceC1540i = this.f2795u;
            if (interfaceC1540i != null) {
                try {
                    interfaceC1540i.close();
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final q6.l getFileSystem() {
        return this.f2791q;
    }
}
