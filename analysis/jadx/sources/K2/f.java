package K2;

import J5.t;
import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.H;
import M5.q0;
import M5.r;
import a.AbstractC0597a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import q6.A;
import q6.l;
import q6.x;
import q6.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements AutoCloseable {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final J5.k f2874H = new J5.k("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public z f2875A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2876B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f2877C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2878D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2879E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2880F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final d f2881G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f2882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f2883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f2884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f2885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f2886u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f2887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final R5.d f2888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2891z;

    /* JADX DEBUG: Class process forced to load method for inline: M5.s.limitedParallelism$default(M5.s, int, java.lang.String, int, java.lang.Object):M5.s */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(long j, l lVar, x xVar) {
        this.f2882q = xVar;
        this.f2883r = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2884s = xVar.e("journal");
        this.f2885t = xVar.e("journal.tmp");
        this.f2886u = xVar.e("journal.bkp");
        this.f2887v = new LinkedHashMap(0, 0.75f, true);
        q0 q0VarC = AbstractC0263y.c();
        r key = AbstractC0257s.Key;
        m.e(key, "key");
        T5.e eVar = H.f3811a;
        this.f2888w = AbstractC0263y.a(E3.h.L(q0VarC, AbstractC0257s.limitedParallelism$default(T5.d.f7468q, 1, null, 2, null)));
        this.f2889x = new Object();
        this.f2881G = new d(lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void M(String str) {
        if (f2874H.c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:26:0x0058, B:28:0x006b, B:30:0x007b, B:32:0x0082, B:27:0x005e, B:36:0x00a2, B:38:0x00a9, B:41:0x00ae, B:43:0x00bf, B:46:0x00c4, B:51:0x00ff, B:53:0x010a, B:57:0x0113, B:47:0x00dc, B:49:0x00f1, B:50:0x00fc, B:35:0x0092, B:60:0x0118, B:61:0x011f), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(K2.f r10, K2.a r11, boolean r12) {
        /*
            java.lang.Object r0 = r10.f2889x
            monitor-enter(r0)
            java.lang.Object r1 = r11.f2860c     // Catch: java.lang.Throwable -> L37
            K2.b r1 = (K2.b) r1     // Catch: java.lang.Throwable -> L37
            K2.a r2 = r1.f2868g     // Catch: java.lang.Throwable -> L37
            boolean r2 = kotlin.jvm.internal.m.a(r2, r11)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L118
            r2 = 2
            r3 = 0
            if (r12 == 0) goto L8f
            boolean r4 = r1.f     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L8f
            r4 = r3
        L18:
            if (r4 >= r2) goto L3d
            java.io.Serializable r5 = r11.f2861d     // Catch: java.lang.Throwable -> L37
            boolean[] r5 = (boolean[]) r5     // Catch: java.lang.Throwable -> L37
            boolean r5 = r5[r4]     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L3a
            K2.d r5 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r6 = r1.f2866d     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L37
            q6.x r6 = (q6.x) r6     // Catch: java.lang.Throwable -> L37
            boolean r5 = r5.v(r6)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L3a
            r11.a(r3)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return
        L37:
            r10 = move-exception
            goto L120
        L3a:
            int r4 = r4 + 1
            goto L18
        L3d:
            r11 = r3
        L3e:
            if (r11 >= r2) goto La2
            java.util.ArrayList r4 = r1.f2866d     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.get(r11)     // Catch: java.lang.Throwable -> L37
            q6.x r4 = (q6.x) r4     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r5 = r1.f2865c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r5.get(r11)     // Catch: java.lang.Throwable -> L37
            q6.x r5 = (q6.x) r5     // Catch: java.lang.Throwable -> L37
            K2.d r6 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.v(r4)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L5e
            K2.d r6 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            r6.b(r4, r5)     // Catch: java.lang.Throwable -> L37
            goto L6b
        L5e:
            K2.d r4 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r6 = r1.f2865c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.get(r11)     // Catch: java.lang.Throwable -> L37
            q6.x r6 = (q6.x) r6     // Catch: java.lang.Throwable -> L37
            C3.a.s(r4, r6)     // Catch: java.lang.Throwable -> L37
        L6b:
            long[] r4 = r1.f2864b     // Catch: java.lang.Throwable -> L37
            r6 = r4[r11]     // Catch: java.lang.Throwable -> L37
            K2.d r4 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            e1.e r4 = r4.G(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.f12515e     // Catch: java.lang.Throwable -> L37
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L80
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L37
            goto L82
        L80:
            r4 = 0
        L82:
            long[] r8 = r1.f2864b     // Catch: java.lang.Throwable -> L37
            r8[r11] = r4     // Catch: java.lang.Throwable -> L37
            long r8 = r10.f2890y     // Catch: java.lang.Throwable -> L37
            long r8 = r8 - r6
            long r8 = r8 + r4
            r10.f2890y = r8     // Catch: java.lang.Throwable -> L37
            int r11 = r11 + 1
            goto L3e
        L8f:
            r11 = r3
        L90:
            if (r11 >= r2) goto La2
            K2.d r4 = r10.f2881G     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r5 = r1.f2866d     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r5.get(r11)     // Catch: java.lang.Throwable -> L37
            q6.x r5 = (q6.x) r5     // Catch: java.lang.Throwable -> L37
            r4.n(r5)     // Catch: java.lang.Throwable -> L37
            int r11 = r11 + 1
            goto L90
        La2:
            r11 = 0
            r1.f2868g = r11     // Catch: java.lang.Throwable -> L37
            boolean r11 = r1.f     // Catch: java.lang.Throwable -> L37
            if (r11 == 0) goto Lae
            r10.G(r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return
        Lae:
            int r11 = r10.f2891z     // Catch: java.lang.Throwable -> L37
            r2 = 1
            int r11 = r11 + r2
            r10.f2891z = r11     // Catch: java.lang.Throwable -> L37
            q6.z r11 = r10.f2875A     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.internal.m.b(r11)     // Catch: java.lang.Throwable -> L37
            r4 = 10
            r5 = 32
            if (r12 != 0) goto Ldc
            boolean r12 = r1.f2867e     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto Lc4
            goto Ldc
        Lc4:
            java.util.LinkedHashMap r12 = r10.f2887v     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = r1.f2863a     // Catch: java.lang.Throwable -> L37
            r12.remove(r6)     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = "REMOVE"
            r11.R(r12)     // Catch: java.lang.Throwable -> L37
            r11.writeByte(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = r1.f2863a     // Catch: java.lang.Throwable -> L37
            r11.R(r12)     // Catch: java.lang.Throwable -> L37
            r11.writeByte(r4)     // Catch: java.lang.Throwable -> L37
            goto Lff
        Ldc:
            r1.f2867e = r2     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = "CLEAN"
            r11.R(r12)     // Catch: java.lang.Throwable -> L37
            r11.writeByte(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = r1.f2863a     // Catch: java.lang.Throwable -> L37
            r11.R(r12)     // Catch: java.lang.Throwable -> L37
            long[] r12 = r1.f2864b     // Catch: java.lang.Throwable -> L37
            int r1 = r12.length     // Catch: java.lang.Throwable -> L37
            r6 = r3
        Lef:
            if (r6 >= r1) goto Lfc
            r7 = r12[r6]     // Catch: java.lang.Throwable -> L37
            r11.writeByte(r5)     // Catch: java.lang.Throwable -> L37
            r11.b(r7)     // Catch: java.lang.Throwable -> L37
            int r6 = r6 + 1
            goto Lef
        Lfc:
            r11.writeByte(r4)     // Catch: java.lang.Throwable -> L37
        Lff:
            r11.flush()     // Catch: java.lang.Throwable -> L37
            long r11 = r10.f2890y     // Catch: java.lang.Throwable -> L37
            long r4 = r10.f2883r     // Catch: java.lang.Throwable -> L37
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 > 0) goto L113
            int r11 = r10.f2891z     // Catch: java.lang.Throwable -> L37
            r12 = 2000(0x7d0, float:2.803E-42)
            if (r11 < r12) goto L111
            r3 = r2
        L111:
            if (r3 == 0) goto L116
        L113:
            r10.f()     // Catch: java.lang.Throwable -> L37
        L116:
            monitor-exit(r0)
            return
        L118:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L120:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.f.a(K2.f, K2.a, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(b bVar) {
        z zVar;
        int i = bVar.f2869h;
        String str = bVar.f2863a;
        if (i > 0 && (zVar = this.f2875A) != null) {
            zVar.R("DIRTY");
            zVar.writeByte(32);
            zVar.R(str);
            zVar.writeByte(10);
            zVar.flush();
        }
        if (bVar.f2869h > 0 || bVar.f2868g != null) {
            bVar.f = true;
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.f2881G.n((x) bVar.f2865c.get(i7));
            long j = this.f2890y;
            long[] jArr = bVar.f2864b;
            this.f2890y = j - jArr[i7];
            jArr[i7] = 0;
        }
        this.f2891z++;
        z zVar2 = this.f2875A;
        if (zVar2 != null) {
            zVar2.R("REMOVE");
            zVar2.writeByte(32);
            zVar2.R(str);
            zVar2.writeByte(10);
            zVar2.flush();
        }
        this.f2887v.remove(str);
        if (this.f2891z >= 2000) {
            f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        G(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f2890y
            long r2 = r4.f2883r
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f2887v
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            K2.b r1 = (K2.b) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.G(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f2879E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.f.K():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W() {
        Throwable th;
        synchronized (this.f2889x) {
            try {
                z zVar = this.f2875A;
                if (zVar != null) {
                    zVar.close();
                }
                z zVarI = AbstractC0597a.i(this.f2881G.W(this.f2885t, false));
                try {
                    zVarI.R("libcore.io.DiskLruCache");
                    zVarI.writeByte(10);
                    zVarI.R("1");
                    zVarI.writeByte(10);
                    zVarI.b(3);
                    zVarI.writeByte(10);
                    zVarI.b(2);
                    zVarI.writeByte(10);
                    zVarI.writeByte(10);
                    for (b bVar : this.f2887v.values()) {
                        if (bVar.f2868g != null) {
                            zVarI.R("DIRTY");
                            zVarI.writeByte(32);
                            zVarI.R(bVar.f2863a);
                            zVarI.writeByte(10);
                        } else {
                            zVarI.R("CLEAN");
                            zVarI.writeByte(32);
                            zVarI.R(bVar.f2863a);
                            for (long j : bVar.f2864b) {
                                zVarI.writeByte(32);
                                zVarI.b(j);
                            }
                            zVarI.writeByte(10);
                        }
                    }
                    try {
                        zVarI.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        zVarI.close();
                    } catch (Throwable th4) {
                        AbstractC1362a.a(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f2881G.v(this.f2884s)) {
                    this.f2881G.b(this.f2884s, this.f2886u);
                    this.f2881G.b(this.f2885t, this.f2884s);
                    this.f2881G.n(this.f2886u);
                } else {
                    this.f2881G.b(this.f2885t, this.f2884s);
                }
                d dVar = this.f2881G;
                x file = this.f2884s;
                dVar.getClass();
                m.e(file, "file");
                this.f2875A = AbstractC0597a.i(new g(dVar.a(file), new J5.i(1, this)));
                this.f2891z = 0;
                this.f2876B = false;
                this.f2880F = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a b(String str) {
        synchronized (this.f2889x) {
            if (this.f2878D) {
                throw new IllegalStateException("cache is closed");
            }
            M(str);
            e();
            b bVar = (b) this.f2887v.get(str);
            if ((bVar != null ? bVar.f2868g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f2869h != 0) {
                return null;
            }
            if (!this.f2879E && !this.f2880F) {
                z zVar = this.f2875A;
                m.b(zVar);
                zVar.R("DIRTY");
                zVar.writeByte(32);
                zVar.R(str);
                zVar.writeByte(10);
                zVar.flush();
                if (this.f2876B) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f2887v.put(str, bVar);
                }
                a aVar = new a(this, bVar);
                bVar.f2868g = aVar;
                return aVar;
            }
            f();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c c(String str) {
        c cVarA;
        synchronized (this.f2889x) {
            if (this.f2878D) {
                throw new IllegalStateException("cache is closed");
            }
            M(str);
            e();
            b bVar = (b) this.f2887v.get(str);
            if (bVar != null && (cVarA = bVar.a()) != null) {
                boolean z5 = true;
                this.f2891z++;
                z zVar = this.f2875A;
                m.b(zVar);
                zVar.R("READ");
                zVar.writeByte(32);
                zVar.R(str);
                zVar.writeByte(10);
                zVar.flush();
                if (this.f2891z < 2000) {
                    z5 = false;
                }
                if (z5) {
                    f();
                }
                return cVarA;
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2889x) {
            try {
                if (this.f2877C && !this.f2878D) {
                    for (b bVar : (b[]) this.f2887v.values().toArray(new b[0])) {
                        a aVar = bVar.f2868g;
                        if (aVar != null) {
                            b bVar2 = (b) aVar.f2860c;
                            if (m.a(bVar2.f2868g, aVar)) {
                                bVar2.f = true;
                            }
                        }
                    }
                    K();
                    AbstractC0263y.e(this.f2888w, null);
                    z zVar = this.f2875A;
                    m.b(zVar);
                    zVar.close();
                    this.f2875A = null;
                    this.f2878D = true;
                    return;
                }
                this.f2878D = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        synchronized (this.f2889x) {
            try {
                if (this.f2877C) {
                    return;
                }
                this.f2881G.n(this.f2885t);
                if (this.f2881G.v(this.f2886u)) {
                    if (this.f2881G.v(this.f2884s)) {
                        this.f2881G.n(this.f2886u);
                    } else {
                        this.f2881G.b(this.f2886u, this.f2884s);
                    }
                }
                if (this.f2881G.v(this.f2884s)) {
                    try {
                        v();
                        n();
                        this.f2877C = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            C3.a.u(this.f2881G, this.f2882q);
                            this.f2878D = false;
                            W();
                            this.f2877C = true;
                        } catch (Throwable th) {
                            this.f2878D = false;
                            throw th;
                        }
                    }
                }
                W();
                this.f2877C = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        AbstractC0263y.t(this.f2888w, null, null, new e(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Iterator it = this.f2887v.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i = 0;
            if (bVar.f2868g == null) {
                while (i < 2) {
                    j += bVar.f2864b[i];
                    i++;
                }
            } else {
                bVar.f2868g = null;
                while (i < 2) {
                    x xVar = (x) bVar.f2865c.get(i);
                    d dVar = this.f2881G;
                    dVar.n(xVar);
                    dVar.n((x) bVar.f2866d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f2890y = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() throws Throwable {
        d dVar = this.f2881G;
        x file = this.f2884s;
        A aJ = AbstractC0597a.j(dVar.a0(file));
        try {
            String strE = aJ.E(Long.MAX_VALUE);
            String strE2 = aJ.E(Long.MAX_VALUE);
            String strE3 = aJ.E(Long.MAX_VALUE);
            String strE4 = aJ.E(Long.MAX_VALUE);
            String strE5 = aJ.E(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strE) || !"1".equals(strE2) || !m.a(String.valueOf(3), strE3) || !m.a(String.valueOf(2), strE4) || strE5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strE + ", " + strE2 + ", " + strE3 + ", " + strE4 + ", " + strE5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    z(aJ.E(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f2891z = i - this.f2887v.size();
                    if (aJ.a()) {
                        dVar.getClass();
                        m.e(file, "file");
                        this.f2875A = AbstractC0597a.i(new g(dVar.a(file), new J5.i(1, this)));
                    } else {
                        W();
                    }
                    try {
                        aJ.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                aJ.close();
            } catch (Throwable th3) {
                AbstractC1362a.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(String str) throws IOException {
        String strSubstring;
        int iR0 = J5.m.R0(str, ' ', 0, 6);
        if (iR0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iR0 + 1;
        int iR02 = J5.m.R0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f2887v;
        if (iR02 == -1) {
            strSubstring = str.substring(i);
            m.d(strSubstring, "substring(...)");
            if (iR0 == 6 && t.G0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iR02);
            m.d(strSubstring, "substring(...)");
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iR02 == -1 || iR0 != 5 || !t.G0(str, "CLEAN", false)) {
            if (iR02 == -1 && iR0 == 5 && t.G0(str, "DIRTY", false)) {
                bVar2.f2868g = new a(this, bVar2);
                return;
            } else {
                if (iR02 != -1 || iR0 != 4 || !t.G0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iR02 + 1);
        m.d(strSubstring2, "substring(...)");
        List listE1 = J5.m.e1(strSubstring2, new char[]{' '});
        bVar2.f2867e = true;
        bVar2.f2868g = null;
        if (listE1.size() != 2) {
            throw new IOException("unexpected journal line: " + listE1);
        }
        try {
            int size = listE1.size();
            for (int i7 = 0; i7 < size; i7++) {
                bVar2.f2864b[i7] = Long.parseLong((String) listE1.get(i7));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listE1);
        }
    }
}
