package k6;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p3.z0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final z f14172P;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final y f14173A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f14174B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f14175C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f14176D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f14177E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final z f14178F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public z f14179G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f14180H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f14181I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f14182J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f14183K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Socket f14184L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final w f14185M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final a5.v f14186N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinkedHashSet f14187O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f14188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f14189r = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g6.d f14194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g6.c f14195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g6.c f14196y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g6.c f14197z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z zVar = new z();
        zVar.c(7, 65535);
        zVar.c(5, 16384);
        f14172P = zVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(z0 z0Var) {
        this.f14188q = (h) z0Var.f;
        String str = (String) z0Var.f15877c;
        if (str == null) {
            kotlin.jvm.internal.m.k("connectionName");
            throw null;
        }
        this.f14190s = str;
        this.f14192u = 3;
        g6.d dVar = (g6.d) z0Var.f15875a;
        this.f14194w = dVar;
        this.f14195x = dVar.e();
        this.f14196y = dVar.e();
        this.f14197z = dVar.e();
        this.f14173A = y.f14246a;
        z zVar = new z();
        zVar.c(7, 16777216);
        this.f14178F = zVar;
        this.f14179G = f14172P;
        this.f14183K = r0.a();
        Socket socket = (Socket) z0Var.f15876b;
        if (socket == null) {
            kotlin.jvm.internal.m.k("socket");
            throw null;
        }
        this.f14184L = socket;
        q6.z zVar2 = (q6.z) z0Var.f15879e;
        if (zVar2 == null) {
            kotlin.jvm.internal.m.k("sink");
            throw null;
        }
        this.f14185M = new w(zVar2);
        q6.A a7 = (q6.A) z0Var.f15878d;
        if (a7 == null) {
            kotlin.jvm.internal.m.k(FirebaseAnalytics.Param.SOURCE);
            throw null;
        }
        this.f14186N = new a5.v(2, this, new r(a7));
        this.f14187O = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, int i7, IOException iOException) {
        int i8;
        Object[] array;
        k1.i.p(i, "connectionCode");
        k1.i.p(i7, "streamCode");
        byte[] bArr = e6.b.f12673a;
        try {
            e(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f14189r.isEmpty()) {
                array = null;
            } else {
                array = this.f14189r.values().toArray(new v[0]);
                this.f14189r.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(i7, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f14185M.close();
        } catch (IOException unused3) {
        }
        try {
            this.f14184L.close();
        } catch (IOException unused4) {
        }
        this.f14195x.e();
        this.f14196y.e();
        this.f14197z.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized v b(int i) {
        return (v) this.f14189r.get(Integer.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized v c(int i) {
        v vVar;
        vVar = (v) this.f14189r.remove(Integer.valueOf(i));
        notifyAll();
        return vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        k1.i.p(i, "statusCode");
        synchronized (this.f14185M) {
            synchronized (this) {
                if (this.f14193v) {
                    return;
                }
                this.f14193v = true;
                this.f14185M.e(e6.b.f12673a, this.f14191t, i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void f(long j) {
        long j7 = this.f14180H + j;
        this.f14180H = j7;
        long j8 = j7 - this.f14181I;
        if (j8 >= this.f14178F.a() / 2) {
            z(0, j8);
            this.f14181I += j8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        this.f14185M.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f14185M.f14240s);
        r6 = r2;
        r8.f14182J += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r9, boolean r10, q6.C1538g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            k6.w r12 = r8.f14185M
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f14182J     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f14183K     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f14189r     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            k6.w r4 = r8.f14185M     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f14240s     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f14182J     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f14182J = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            k6.w r4 = r8.f14185M
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.n.n(int, boolean, q6.g, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(int i, int i7) {
        k1.i.p(i7, "errorCode");
        this.f14195x.c(new j(this.f14190s + '[' + i + "] writeSynReset", this, i, i7, 2), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(int i, long j) {
        this.f14195x.c(new m(this.f14190s + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
