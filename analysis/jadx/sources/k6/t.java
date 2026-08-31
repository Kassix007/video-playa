package k6;

import q6.C1538g;
import q6.G;
import q6.I;

/* JADX INFO: loaded from: classes.dex */
public final class t implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f14219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1538g f14221s = new C1538g();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1538g f14222t = new C1538g();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f14224v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(v vVar, long j, boolean z5) {
        this.f14224v = vVar;
        this.f14219q = j;
        this.f14220r = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[LOOP:0: B:4:0x000e->B:47:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0099 A[SYNTHETIC] */
    @Override // q6.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(long r15, q6.C1538g r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r1 = r15
            r0 = r17
            java.lang.String r3 = "sink"
            kotlin.jvm.internal.m.e(r0, r3)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto Lb7
        Le:
            k6.v r5 = r14.f14224v
            monitor-enter(r5)
            k6.u r6 = r5.f14233k     // Catch: java.lang.Throwable -> La2
            r6.h()     // Catch: java.lang.Throwable -> La2
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L31
            int r6 = r5.f14235m     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L37
            boolean r6 = r14.f14220r     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L37
            java.io.IOException r6 = r5.f14236n     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L38
            k6.A r6 = new k6.A     // Catch: java.lang.Throwable -> L31
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L31
            int r7 = r5.f14235m     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            k1.i.m(r7)     // Catch: java.lang.Throwable -> L31
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r0 = move-exception
            goto Laf
        L34:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L31
        L37:
            r6 = 0
        L38:
            boolean r7 = r14.f14223u     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto La4
            q6.g r7 = r14.f14222t     // Catch: java.lang.Throwable -> L31
            long r8 = r7.f16063r     // Catch: java.lang.Throwable -> L31
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r11 = -1
            r13 = 0
            if (r10 <= 0) goto L74
            long r8 = java.lang.Math.min(r1, r8)     // Catch: java.lang.Throwable -> L31
            long r7 = r7.F(r8, r0)     // Catch: java.lang.Throwable -> L31
            long r9 = r5.f14228c     // Catch: java.lang.Throwable -> L31
            long r9 = r9 + r7
            r5.f14228c = r9     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f14229d     // Catch: java.lang.Throwable -> L31
            long r9 = r9 - r3
            if (r6 != 0) goto L8d
            k6.n r3 = r5.f14227b     // Catch: java.lang.Throwable -> L31
            k6.z r3 = r3.f14178F     // Catch: java.lang.Throwable -> L31
            int r3 = r3.a()     // Catch: java.lang.Throwable -> L31
            int r3 = r3 / 2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L31
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L8d
            k6.n r3 = r5.f14227b     // Catch: java.lang.Throwable -> L31
            int r4 = r5.f14226a     // Catch: java.lang.Throwable -> L31
            r3.z(r4, r9)     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f14228c     // Catch: java.lang.Throwable -> L31
            r5.f14229d = r3     // Catch: java.lang.Throwable -> L31
            goto L8d
        L74:
            boolean r3 = r14.f14220r     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L7e
            if (r6 != 0) goto L7e
            r5.wait()     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> L80
            r13 = 1
        L7e:
            r7 = r11
            goto L8d
        L80:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L31
            r0.interrupt()     // Catch: java.lang.Throwable -> L31
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L8d:
            k6.u r3 = r5.f14233k     // Catch: java.lang.Throwable -> La2
            r3.k()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r5)
            if (r13 == 0) goto L99
            r3 = 0
            goto Le
        L99:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L9e
            return r7
        L9e:
            if (r6 != 0) goto La1
            return r11
        La1:
            throw r6
        La2:
            r0 = move-exception
            goto Lb5
        La4:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        Lac:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.Throwable -> L31
        Laf:
            k6.u r1 = r5.f14233k     // Catch: java.lang.Throwable -> La2
            r1.k()     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        Lb5:
            monitor-exit(r5)
            throw r0
        Lb7:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = C0.S.k(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.t.F(long, q6.g):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        v vVar = this.f14224v;
        synchronized (vVar) {
            this.f14223u = true;
            C1538g c1538g = this.f14222t;
            j = c1538g.f16063r;
            c1538g.a();
            vVar.notifyAll();
        }
        if (j > 0) {
            v vVar2 = this.f14224v;
            byte[] bArr = e6.b.f12673a;
            vVar2.f14227b.f(j);
        }
        this.f14224v.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f14224v.f14233k;
    }
}
