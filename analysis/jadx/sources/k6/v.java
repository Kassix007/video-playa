package k6;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f14227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14230e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f14231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14232h;
    public final t i;
    public final s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f14233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f14234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f14236n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(int i, n connection, boolean z5, boolean z6, d6.l lVar) {
        kotlin.jvm.internal.m.e(connection, "connection");
        this.f14226a = i;
        this.f14227b = connection;
        this.f = connection.f14179G.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f14231g = arrayDeque;
        this.i = new t(this, connection.f14178F.a(), z6);
        this.j = new s(this, z5);
        this.f14233k = new u(this);
        this.f14234l = new u(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = e6.b.f12673a
            monitor-enter(r2)
            k6.t r0 = r2.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f14220r     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f14223u     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            k6.s r0 = r2.j     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f14215q     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f14217s     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            k6.n r0 = r2.f14227b
            int r1 = r2.f14226a
            r0.c(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.v.a():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() throws IOException {
        s sVar = this.j;
        if (sVar.f14217s) {
            throw new IOException("stream closed");
        }
        if (sVar.f14215q) {
            throw new IOException("stream finished");
        }
        if (this.f14235m != 0) {
            IOException iOException = this.f14236n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f14235m;
            k1.i.m(i);
            throw new A(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, IOException iOException) {
        k1.i.p(i, "rstStatusCode");
        if (d(i, iOException)) {
            n nVar = this.f14227b;
            nVar.getClass();
            k1.i.p(i, "statusCode");
            nVar.f14185M.v(this.f14226a, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i, IOException iOException) {
        byte[] bArr = e6.b.f12673a;
        synchronized (this) {
            if (this.f14235m != 0) {
                return false;
            }
            this.f14235m = i;
            this.f14236n = iOException;
            notifyAll();
            if (this.i.f14220r) {
                if (this.j.f14215q) {
                    return false;
                }
            }
            this.f14227b.c(this.f14226a);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        k1.i.p(i, "errorCode");
        if (d(i, null)) {
            this.f14227b.v(this.f14226a, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s f() {
        synchronized (this) {
            if (!this.f14232h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        boolean z5 = (this.f14226a & 1) == 1;
        this.f14227b.getClass();
        return true == z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean h() {
        try {
            if (this.f14235m != 0) {
                return false;
            }
            t tVar = this.i;
            if (tVar.f14220r || tVar.f14223u) {
                s sVar = this.j;
                if (sVar.f14215q || sVar.f14217s) {
                    if (this.f14232h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(d6.l headers, boolean z5) {
        boolean zH;
        kotlin.jvm.internal.m.e(headers, "headers");
        byte[] bArr = e6.b.f12673a;
        synchronized (this) {
            try {
                if (this.f14232h && z5) {
                    this.i.getClass();
                } else {
                    this.f14232h = true;
                    this.f14231g.add(headers);
                }
                if (z5) {
                    this.i.f14220r = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f14227b.c(this.f14226a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void j(int i) {
        k1.i.p(i, "errorCode");
        if (this.f14235m == 0) {
            this.f14235m = i;
            notifyAll();
        }
    }
}
