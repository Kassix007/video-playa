package w2;

import E3.h;
import J5.i;
import J5.k;
import J5.t;
import M5.AbstractC0257s;
import M5.AbstractC0263y;
import a.AbstractC0597a;
import com.google.android.gms.internal.measurement.K1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
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

/* JADX INFO: renamed from: w2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1867e implements Closeable, Flushable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final k f18261G = new k("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f18262A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f18263B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f18264C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f18265D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f18266E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1865c f18267F;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f18268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f18269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f18270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f18271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f18272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f18273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final R5.d f18274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f18275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18276y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z f18277z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1867e(long j, AbstractC0257s abstractC0257s, l lVar, x xVar) {
        this.f18268q = xVar;
        this.f18269r = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f18270s = xVar.e("journal");
        this.f18271t = xVar.e("journal.tmp");
        this.f18272u = xVar.e("journal.bkp");
        this.f18273v = new LinkedHashMap(0, 0.75f, true);
        this.f18274w = AbstractC0263y.a(h.L(AbstractC0263y.c(), abstractC0257s.limitedParallelism(1)));
        this.f18267F = new C1865c(lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void M(String str) {
        if (f18261G.c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(w2.C1867e r9, K2.a r10, boolean r11) {
        /*
            monitor-enter(r9)
            java.lang.Object r0 = r10.f2860c     // Catch: java.lang.Throwable -> L35
            w2.a r0 = (w2.C1863a) r0     // Catch: java.lang.Throwable -> L35
            K2.a r1 = r0.f18255g     // Catch: java.lang.Throwable -> L35
            boolean r1 = kotlin.jvm.internal.m.a(r1, r10)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L120
            r1 = 2
            r2 = 0
            if (r11 == 0) goto L97
            boolean r3 = r0.f     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L97
            r3 = r2
        L16:
            if (r3 >= r1) goto L3b
            java.io.Serializable r4 = r10.f2861d     // Catch: java.lang.Throwable -> L35
            boolean[] r4 = (boolean[]) r4     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L38
            w2.c r4 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r5 = r0.f18253d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L35
            q6.x r5 = (q6.x) r5     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.v(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L38
            r10.a(r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return
        L35:
            r10 = move-exception
            goto L128
        L38:
            int r3 = r3 + 1
            goto L16
        L3b:
            r10 = r2
        L3c:
            if (r10 >= r1) goto Laa
            java.util.ArrayList r3 = r0.f18253d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L35
            q6.x r3 = (q6.x) r3     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r4 = r0.f18252c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L35
            q6.x r4 = (q6.x) r4     // Catch: java.lang.Throwable -> L35
            w2.c r5 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.v(r3)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L5c
            w2.c r5 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            r5.b(r3, r4)     // Catch: java.lang.Throwable -> L35
            goto L73
        L5c:
            w2.c r3 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r5 = r0.f18252c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L35
            q6.x r5 = (q6.x) r5     // Catch: java.lang.Throwable -> L35
            boolean r6 = r3.v(r5)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L73
            q6.E r3 = r3.W(r5, r2)     // Catch: java.lang.Throwable -> L35
            H2.f.a(r3)     // Catch: java.lang.Throwable -> L35
        L73:
            long[] r3 = r0.f18251b     // Catch: java.lang.Throwable -> L35
            r5 = r3[r10]     // Catch: java.lang.Throwable -> L35
            w2.c r3 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            e1.e r3 = r3.G(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.f12515e     // Catch: java.lang.Throwable -> L35
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L88
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L35
            goto L8a
        L88:
            r3 = 0
        L8a:
            long[] r7 = r0.f18251b     // Catch: java.lang.Throwable -> L35
            r7[r10] = r3     // Catch: java.lang.Throwable -> L35
            long r7 = r9.f18275x     // Catch: java.lang.Throwable -> L35
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.f18275x = r7     // Catch: java.lang.Throwable -> L35
            int r10 = r10 + 1
            goto L3c
        L97:
            r10 = r2
        L98:
            if (r10 >= r1) goto Laa
            w2.c r3 = r9.f18267F     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r4 = r0.f18253d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L35
            q6.x r4 = (q6.x) r4     // Catch: java.lang.Throwable -> L35
            r3.n(r4)     // Catch: java.lang.Throwable -> L35
            int r10 = r10 + 1
            goto L98
        Laa:
            r10 = 0
            r0.f18255g = r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r0.f     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto Lb6
            r9.G(r0)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return
        Lb6:
            int r10 = r9.f18276y     // Catch: java.lang.Throwable -> L35
            r1 = 1
            int r10 = r10 + r1
            r9.f18276y = r10     // Catch: java.lang.Throwable -> L35
            q6.z r10 = r9.f18277z     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.m.b(r10)     // Catch: java.lang.Throwable -> L35
            r3 = 10
            r4 = 32
            if (r11 != 0) goto Le4
            boolean r11 = r0.f18254e     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto Lcc
            goto Le4
        Lcc:
            java.util.LinkedHashMap r11 = r9.f18273v     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.f18250a     // Catch: java.lang.Throwable -> L35
            r11.remove(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "REMOVE"
            r10.R(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r0.f18250a     // Catch: java.lang.Throwable -> L35
            r10.R(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r3)     // Catch: java.lang.Throwable -> L35
            goto L107
        Le4:
            r0.f18254e = r1     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "CLEAN"
            r10.R(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r0.f18250a     // Catch: java.lang.Throwable -> L35
            r10.R(r11)     // Catch: java.lang.Throwable -> L35
            long[] r11 = r0.f18251b     // Catch: java.lang.Throwable -> L35
            int r0 = r11.length     // Catch: java.lang.Throwable -> L35
            r5 = r2
        Lf7:
            if (r5 >= r0) goto L104
            r6 = r11[r5]     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            r10.b(r6)     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + 1
            goto Lf7
        L104:
            r10.writeByte(r3)     // Catch: java.lang.Throwable -> L35
        L107:
            r10.flush()     // Catch: java.lang.Throwable -> L35
            long r10 = r9.f18275x     // Catch: java.lang.Throwable -> L35
            long r3 = r9.f18269r     // Catch: java.lang.Throwable -> L35
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L11b
            int r10 = r9.f18276y     // Catch: java.lang.Throwable -> L35
            r11 = 2000(0x7d0, float:2.803E-42)
            if (r10 < r11) goto L119
            r2 = r1
        L119:
            if (r2 == 0) goto L11e
        L11b:
            r9.f()     // Catch: java.lang.Throwable -> L35
        L11e:
            monitor-exit(r9)
            return
        L120:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        L128:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L35
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1867e.a(w2.e, K2.a, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(C1863a c1863a) {
        z zVar;
        int i = c1863a.f18256h;
        String str = c1863a.f18250a;
        if (i > 0 && (zVar = this.f18277z) != null) {
            zVar.R("DIRTY");
            zVar.writeByte(32);
            zVar.R(str);
            zVar.writeByte(10);
            zVar.flush();
        }
        if (c1863a.f18256h > 0 || c1863a.f18255g != null) {
            c1863a.f = true;
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.f18267F.n((x) c1863a.f18252c.get(i7));
            long j = this.f18275x;
            long[] jArr = c1863a.f18251b;
            this.f18275x = j - jArr[i7];
            jArr[i7] = 0;
        }
        this.f18276y++;
        z zVar2 = this.f18277z;
        if (zVar2 != null) {
            zVar2.R("REMOVE");
            zVar2.writeByte(32);
            zVar2.R(str);
            zVar2.writeByte(10);
        }
        this.f18273v.remove(str);
        if (this.f18276y >= 2000) {
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
            long r0 = r4.f18275x
            long r2 = r4.f18269r
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f18273v
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            w2.a r1 = (w2.C1863a) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.G(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f18265D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1867e.K():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void W() {
        Throwable th;
        try {
            z zVar = this.f18277z;
            if (zVar != null) {
                zVar.close();
            }
            z zVarI = AbstractC0597a.i(this.f18267F.W(this.f18271t, false));
            try {
                zVarI.R("libcore.io.DiskLruCache");
                zVarI.writeByte(10);
                zVarI.R("1");
                zVarI.writeByte(10);
                zVarI.b(1);
                zVarI.writeByte(10);
                zVarI.b(2);
                zVarI.writeByte(10);
                zVarI.writeByte(10);
                for (C1863a c1863a : this.f18273v.values()) {
                    if (c1863a.f18255g != null) {
                        zVarI.R("DIRTY");
                        zVarI.writeByte(32);
                        zVarI.R(c1863a.f18250a);
                        zVarI.writeByte(10);
                    } else {
                        zVarI.R("CLEAN");
                        zVarI.writeByte(32);
                        zVarI.R(c1863a.f18250a);
                        for (long j : c1863a.f18251b) {
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
            if (this.f18267F.v(this.f18270s)) {
                this.f18267F.b(this.f18270s, this.f18272u);
                this.f18267F.b(this.f18271t, this.f18270s);
                this.f18267F.n(this.f18272u);
            } else {
                this.f18267F.b(this.f18271t, this.f18270s);
            }
            C1865c c1865c = this.f18267F;
            x file = this.f18270s;
            c1865c.getClass();
            m.e(file, "file");
            this.f18277z = AbstractC0597a.i(new f(c1865c.a(file), new i(14, this)));
            this.f18276y = 0;
            this.f18262A = false;
            this.f18266E = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized K2.a b(String str) {
        if (this.f18264C) {
            throw new IllegalStateException("cache is closed");
        }
        M(str);
        e();
        C1863a c1863a = (C1863a) this.f18273v.get(str);
        if ((c1863a != null ? c1863a.f18255g : null) != null) {
            return null;
        }
        if (c1863a != null && c1863a.f18256h != 0) {
            return null;
        }
        if (!this.f18265D && !this.f18266E) {
            z zVar = this.f18277z;
            m.b(zVar);
            zVar.R("DIRTY");
            zVar.writeByte(32);
            zVar.R(str);
            zVar.writeByte(10);
            zVar.flush();
            if (this.f18262A) {
                return null;
            }
            if (c1863a == null) {
                c1863a = new C1863a(this, str);
                this.f18273v.put(str, c1863a);
            }
            K2.a aVar = new K2.a(this, c1863a);
            c1863a.f18255g = aVar;
            return aVar;
        }
        f();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized C1864b c(String str) {
        C1864b c1864bA;
        if (this.f18264C) {
            throw new IllegalStateException("cache is closed");
        }
        M(str);
        e();
        C1863a c1863a = (C1863a) this.f18273v.get(str);
        if (c1863a != null && (c1864bA = c1863a.a()) != null) {
            boolean z5 = true;
            this.f18276y++;
            z zVar = this.f18277z;
            m.b(zVar);
            zVar.R("READ");
            zVar.writeByte(32);
            zVar.R(str);
            zVar.writeByte(10);
            if (this.f18276y < 2000) {
                z5 = false;
            }
            if (z5) {
                f();
            }
            return c1864bA;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f18263B && !this.f18264C) {
                for (C1863a c1863a : (C1863a[]) this.f18273v.values().toArray(new C1863a[0])) {
                    K2.a aVar = c1863a.f18255g;
                    if (aVar != null) {
                        C1863a c1863a2 = (C1863a) aVar.f2860c;
                        if (m.a(c1863a2.f18255g, aVar)) {
                            c1863a2.f = true;
                        }
                    }
                }
                K();
                AbstractC0263y.e(this.f18274w, null);
                z zVar = this.f18277z;
                m.b(zVar);
                zVar.close();
                this.f18277z = null;
                this.f18264C = true;
                return;
            }
            this.f18264C = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void e() {
        try {
            if (this.f18263B) {
                return;
            }
            this.f18267F.n(this.f18271t);
            if (this.f18267F.v(this.f18272u)) {
                if (this.f18267F.v(this.f18270s)) {
                    this.f18267F.n(this.f18272u);
                } else {
                    this.f18267F.b(this.f18272u, this.f18270s);
                }
            }
            if (this.f18267F.v(this.f18270s)) {
                try {
                    v();
                    n();
                    this.f18263B = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        K1.n(this.f18267F, this.f18268q);
                        this.f18264C = false;
                        W();
                        this.f18263B = true;
                    } catch (Throwable th) {
                        this.f18264C = false;
                        throw th;
                    }
                }
            }
            W();
            this.f18263B = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        AbstractC0263y.t(this.f18274w, null, null, new C1866d(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f18263B) {
            if (this.f18264C) {
                throw new IllegalStateException("cache is closed");
            }
            K();
            z zVar = this.f18277z;
            m.b(zVar);
            zVar.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Iterator it = this.f18273v.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C1863a c1863a = (C1863a) it.next();
            int i = 0;
            if (c1863a.f18255g == null) {
                while (i < 2) {
                    j += c1863a.f18251b[i];
                    i++;
                }
            } else {
                c1863a.f18255g = null;
                while (i < 2) {
                    x xVar = (x) c1863a.f18252c.get(i);
                    C1865c c1865c = this.f18267F;
                    c1865c.n(xVar);
                    c1865c.n((x) c1863a.f18253d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f18275x = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() throws Throwable {
        C1865c c1865c = this.f18267F;
        x file = this.f18270s;
        A aJ = AbstractC0597a.j(c1865c.a0(file));
        try {
            String strE = aJ.E(Long.MAX_VALUE);
            String strE2 = aJ.E(Long.MAX_VALUE);
            String strE3 = aJ.E(Long.MAX_VALUE);
            String strE4 = aJ.E(Long.MAX_VALUE);
            String strE5 = aJ.E(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strE) || !"1".equals(strE2) || !m.a(String.valueOf(1), strE3) || !m.a(String.valueOf(2), strE4) || strE5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strE + ", " + strE2 + ", " + strE3 + ", " + strE4 + ", " + strE5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    z(aJ.E(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f18276y = i - this.f18273v.size();
                    if (aJ.a()) {
                        c1865c.getClass();
                        m.e(file, "file");
                        this.f18277z = AbstractC0597a.i(new f(c1865c.a(file), new i(14, this)));
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
        LinkedHashMap linkedHashMap = this.f18273v;
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
        Object c1863a = linkedHashMap.get(strSubstring);
        if (c1863a == null) {
            c1863a = new C1863a(this, strSubstring);
            linkedHashMap.put(strSubstring, c1863a);
        }
        C1863a c1863a2 = (C1863a) c1863a;
        if (iR02 == -1 || iR0 != 5 || !t.G0(str, "CLEAN", false)) {
            if (iR02 == -1 && iR0 == 5 && t.G0(str, "DIRTY", false)) {
                c1863a2.f18255g = new K2.a(this, c1863a2);
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
        c1863a2.f18254e = true;
        c1863a2.f18255g = null;
        if (listE1.size() != 2) {
            throw new IOException("unexpected journal line: " + listE1);
        }
        try {
            int size = listE1.size();
            for (int i7 = 0; i7 < size; i7++) {
                c1863a2.f18251b[i7] = Long.parseLong((String) listE1.get(i7));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listE1);
        }
    }
}
