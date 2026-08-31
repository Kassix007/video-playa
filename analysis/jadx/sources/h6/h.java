package h6;

import E.c0;
import L.s;
import O3.Y;
import d6.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13484A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13485B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile boolean f13486C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile s f13487D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile j f13488E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f13489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d6.s f13490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Y f13491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f13492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f13493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f13495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f13496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f13497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13498z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(q qVar, d6.s originalRequest) {
        m.e(originalRequest, "originalRequest");
        this.f13489q = qVar;
        this.f13490r = originalRequest;
        this.f13491s = (Y) qVar.f12396r.f14120q;
        qVar.f12399u.getClass();
        g gVar = new g(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar.g(0);
        this.f13492t = gVar;
        this.f13493u = new AtomicBoolean();
        this.f13485B = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.f13486C ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(hVar.f13490r.f12413a.f());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(j jVar) {
        byte[] bArr = e6.b.f12673a;
        if (this.f13496x != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f13496x = jVar;
        jVar.f13511p.add(new f(this, this.f13494v));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = e6.b.f12673a;
        j jVar = this.f13496x;
        if (jVar != null) {
            synchronized (jVar) {
                socketJ = j();
            }
            if (this.f13496x == null) {
                if (socketJ != null) {
                    e6.b.c(socketJ);
                }
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f13492t.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            m.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        return new h(this.f13489q, this.f13490r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        Socket socket;
        if (this.f13486C) {
            return;
        }
        this.f13486C = true;
        s sVar = this.f13487D;
        if (sVar != null) {
            ((i6.d) sVar.f3064d).cancel();
        }
        j jVar = this.f13488E;
        if (jVar == null || (socket = jVar.f13501c) == null) {
            return;
        }
        e6.b.c(socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(H2.g gVar) {
        e eVar;
        if (!this.f13493u.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        l6.m mVar = l6.m.f14610a;
        this.f13494v = l6.m.f14610a.g();
        c0 c0Var = this.f13489q.f12395q;
        e eVar2 = new e(this, gVar);
        c0Var.getClass();
        synchronized (c0Var) {
            ((ArrayDeque) c0Var.f1553r).add(eVar2);
            String str = this.f13490r.f12413a.f12371d;
            Iterator it = ((ArrayDeque) c0Var.f1554s).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c0Var.f1553r).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            eVar = null;
                            break;
                        } else {
                            eVar = (e) it2.next();
                            if (m.a(eVar.f13481s.f13490r.f12413a.f12371d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    eVar = (e) it.next();
                    if (m.a(eVar.f13481s.f13490r.f12413a.f12371d, str)) {
                        break;
                    }
                }
            }
            if (eVar != null) {
                eVar2.f13480r = eVar.f13480r;
            }
        }
        c0Var.A();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z5) {
        s sVar;
        synchronized (this) {
            if (!this.f13485B) {
                throw new IllegalStateException("released");
            }
        }
        if (z5 && (sVar = this.f13487D) != null) {
            ((i6.d) sVar.f3064d).cancel();
            ((h) sVar.f3062b).h(sVar, true, true, null);
        }
        this.f13497y = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d6.u g() {
        /*
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            d6.q r0 = r9.f13489q
            java.util.List r0 = r0.f12397s
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            n5.q.e0(r2, r0)
            i6.a r0 = new i6.a
            d6.q r1 = r9.f13489q
            r0.<init>(r1)
            r2.add(r0)
            i6.a r0 = new i6.a
            d6.q r1 = r9.f13489q
            d6.b r1 = r1.f12404z
            r0.<init>(r1)
            r2.add(r0)
            f6.b r0 = new f6.b
            r0.<init>()
            r2.add(r0)
            h6.a r0 = h6.a.f13460a
            r2.add(r0)
            d6.q r0 = r9.f13489q
            java.util.List r0 = r0.f12398t
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            n5.q.e0(r2, r0)
            i6.b r0 = new i6.b
            r0.<init>()
            r2.add(r0)
            i6.f r0 = new i6.f
            d6.s r5 = r9.f13490r
            d6.q r1 = r9.f13489q
            int r6 = r1.f12391L
            int r7 = r1.f12392M
            int r8 = r1.f12393N
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r3 = 0
            d6.s r4 = r1.f13490r     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            d6.u r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            boolean r4 = r1.f13486C     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            if (r4 != 0) goto L64
            r9.i(r2)
            return r0
        L64:
            e6.b.b(r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            throw r0     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
        L6f:
            r0 = move-exception
            goto L7d
        L71:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r9.i(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.m.c(r0, r4)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L7d:
            if (r3 != 0) goto L82
            r9.i(r2)
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.h.g():d6.u");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException h(s exchange, boolean z5, boolean z6, IOException iOException) {
        boolean z7;
        boolean z8;
        m.e(exchange, "exchange");
        if (exchange.equals(this.f13487D)) {
            synchronized (this) {
                z7 = false;
                if (z5) {
                    try {
                        if (!this.f13498z) {
                            if (z6 || !this.f13484A) {
                                z8 = false;
                            }
                        }
                        if (z5) {
                            this.f13498z = false;
                        }
                        if (z6) {
                            this.f13484A = false;
                        }
                        boolean z9 = this.f13498z;
                        boolean z10 = (z9 || this.f13484A) ? false : true;
                        if (!z9 && !this.f13484A) {
                            if (!this.f13485B) {
                                z7 = true;
                            }
                        }
                        z8 = z7;
                        z7 = z10;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z6) {
                    }
                    z8 = false;
                }
            }
            if (z7) {
                this.f13487D = null;
                j jVar = this.f13496x;
                if (jVar != null) {
                    synchronized (jVar) {
                        jVar.f13508m++;
                    }
                }
            }
            if (z8) {
                return c(iOException);
            }
        }
        return iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException i(IOException iOException) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.f13485B) {
                this.f13485B = false;
                if (!this.f13498z) {
                    if (!this.f13484A) {
                        z5 = true;
                    }
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Socket j() {
        j jVar = this.f13496x;
        m.b(jVar);
        byte[] bArr = e6.b.f12673a;
        ArrayList arrayList = jVar.f13511p;
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (m.a(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f13496x = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        jVar.f13512q = System.nanoTime();
        Y y6 = this.f13491s;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) y6.f4683e;
        g6.c cVar = (g6.c) y6.f4681c;
        byte[] bArr2 = e6.b.f12673a;
        if (!jVar.j) {
            cVar.c((g6.b) y6.f4682d, 0L);
            return null;
        }
        jVar.j = true;
        concurrentLinkedQueue.remove(jVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = jVar.f13502d;
        m.b(socket);
        return socket;
    }
}
