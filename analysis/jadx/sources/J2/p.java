package J2;

import a.AbstractC0597a;
import q6.A;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class p implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q6.x f2782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q6.l f2783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AutoCloseable f2785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f2786u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A f2788w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(q6.x xVar, q6.l lVar, String str, AutoCloseable autoCloseable) {
        this.f2782q = xVar;
        this.f2783r = lVar;
        this.f2784s = str;
        this.f2785t = autoCloseable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final q6.x A() {
        q6.x xVar;
        synchronized (this.f2786u) {
            if (this.f2787v) {
                throw new IllegalStateException("closed");
            }
            xVar = this.f2782q;
        }
        return xVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final E3.h C() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final InterfaceC1540i O() {
        synchronized (this.f2786u) {
            if (this.f2787v) {
                throw new IllegalStateException("closed");
            }
            A a7 = this.f2788w;
            if (a7 != null) {
                return a7;
            }
            A aJ = AbstractC0597a.j(this.f2783r.a0(this.f2782q));
            this.f2788w = aJ;
            return aJ;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2786u
            monitor-enter(r0)
            r1 = 1
            r2.f2787v = r1     // Catch: java.lang.Throwable -> L1c
            q6.A r1 = r2.f2788w     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r1 = r2.f2785t     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            C0.S.s(r1)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.p.close():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.q
    public final q6.l getFileSystem() {
        return this.f2783r;
    }
}
