package q6;

import a.AbstractC0597a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class J extends l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f16044v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f16045s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f16046t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f16047u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String str = x.f16093r;
        f16044v = O3.D.r("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(x xVar, l fileSystem, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.m.e(fileSystem, "fileSystem");
        this.f16045s = xVar;
        this.f16046t = fileSystem;
        this.f16047u = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // q6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e1.C1025e K(q6.x r26) throws java.lang.Throwable {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            java.lang.String r2 = "path"
            kotlin.jvm.internal.m.e(r0, r2)
            q6.x r2 = q6.J.f16044v
            r2.getClass()
            r3 = 1
            q6.x r0 = r6.c.b(r2, r0, r3)
            java.util.LinkedHashMap r2 = r1.f16047u
            java.lang.Object r0 = r2.get(r0)
            r6.h r0 = (r6.h) r0
            r2 = 0
            if (r0 != 0) goto L1f
            return r2
        L1f:
            long r4 = r0.f16389h
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L6e
            q6.l r6 = r1.f16046t
            q6.x r7 = r1.f16045s
            q6.s r6 = r6.M(r7)
            q6.k r4 = r6.a(r4)     // Catch: java.lang.Throwable -> L5d
            q6.A r4 = a.AbstractC0597a.j(r4)     // Catch: java.lang.Throwable -> L5d
            r6.h r5 = r6.b.g(r4, r0)     // Catch: java.lang.Throwable -> L45
            kotlin.jvm.internal.m.b(r5)     // Catch: java.lang.Throwable -> L45
            r4.close()     // Catch: java.lang.Throwable -> L43
            r0 = r2
            goto L51
        L43:
            r0 = move-exception
            goto L51
        L45:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            m5.AbstractC1362a.a(r5, r0)     // Catch: java.lang.Throwable -> L5d
        L4f:
            r0 = r5
            r5 = r2
        L51:
            if (r0 != 0) goto L5c
            r6.close()     // Catch: java.lang.Throwable -> L58
            r0 = r2
            goto L59
        L58:
            r0 = move-exception
        L59:
            r4 = r0
            r0 = r5
            goto L6a
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            r4 = r0
            if (r6 == 0) goto L69
            r6.close()     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r0 = move-exception
            m5.AbstractC1362a.a(r4, r0)
        L69:
            r0 = r2
        L6a:
            if (r4 != 0) goto L6d
            goto L6e
        L6d:
            throw r4
        L6e:
            e1.e r4 = new e1.e
            boolean r6 = r0.f16384b
            r5 = r6 ^ 1
            if (r6 == 0) goto L78
            r8 = r2
            goto L7f
        L78:
            long r7 = r0.f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = r7
        L7f:
            java.lang.Long r7 = r0.f16392m
            r9 = 11644473600000(0xa9730b66800, double:5.7531343696653E-311)
            r11 = 10000(0x2710, float:1.4013E-41)
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L99
            long r14 = r7.longValue()
            r7 = r3
            long r2 = (long) r11
            long r14 = r14 / r2
            long r14 = r14 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            goto Laa
        L99:
            r7 = r3
            java.lang.Integer r2 = r0.f16395p
            if (r2 == 0) goto La9
            int r2 = r2.intValue()
            long r2 = (long) r2
            long r2 = r2 * r12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto Laa
        La9:
            r2 = 0
        Laa:
            java.lang.Long r3 = r0.f16390k
            if (r3 == 0) goto Lbe
            long r14 = r3.longValue()
            r16 = r9
            long r9 = (long) r11
            long r14 = r14 / r9
            long r14 = r14 - r16
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
        Lbc:
            r10 = r3
            goto L113
        Lbe:
            r16 = r9
            java.lang.Integer r3 = r0.f16393n
            if (r3 == 0) goto Lcf
            int r3 = r3.intValue()
            long r9 = (long) r3
            long r9 = r9 * r12
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto Lbc
        Lcf:
            int r3 = r0.j
            r9 = -1
            if (r3 == r9) goto Ld8
            int r10 = r0.i
            if (r3 != r9) goto Lda
        Ld8:
            r10 = 0
            goto L113
        Lda:
            int r9 = r10 >> 9
            r9 = r9 & 127(0x7f, float:1.78E-43)
            int r9 = r9 + 1980
            int r14 = r10 >> 5
            r14 = r14 & 15
            r21 = r10 & 31
            int r10 = r3 >> 11
            r22 = r10 & 31
            int r10 = r3 >> 5
            r23 = r10 & 63
            r3 = r3 & 31
            int r24 = r3 << 1
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar
            r3.<init>()
            r10 = 14
            r15 = 0
            r3.set(r10, r15)
            int r20 = r14 + (-1)
            r18 = r3
            r19 = r9
            r18.set(r19, r20, r21, r22, r23, r24)
            java.util.Date r3 = r18.getTime()
            long r9 = r3.getTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto Lbc
        L113:
            java.lang.Long r3 = r0.f16391l
            if (r3 == 0) goto L125
            long r12 = r3.longValue()
            long r14 = (long) r11
            long r12 = r12 / r14
            long r12 = r12 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
        L123:
            r11 = r0
            goto L135
        L125:
            java.lang.Integer r0 = r0.f16394o
            if (r0 == 0) goto L134
            int r0 = r0.intValue()
            long r14 = (long) r0
            long r14 = r14 * r12
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            goto L123
        L134:
            r11 = 0
        L135:
            r7 = 0
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.J.K(q6.x):e1.e");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final s M(x xVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E W(x file, boolean z5) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E a(x file) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final G a0(x file) throws Throwable {
        Throwable th;
        A aJ;
        kotlin.jvm.internal.m.e(file, "file");
        x xVar = f16044v;
        xVar.getClass();
        r6.h hVar = (r6.h) this.f16047u.get(r6.c.b(xVar, file, true));
        if (hVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j = hVar.f;
        s sVarM = this.f16046t.M(this.f16045s);
        try {
            aJ = AbstractC0597a.j(sVarM.a(hVar.f16389h));
            try {
                sVarM.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (sVarM != null) {
                try {
                    sVarM.close();
                } catch (Throwable th4) {
                    AbstractC1362a.a(th3, th4);
                }
            }
            th = th3;
            aJ = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.m.e(aJ, "<this>");
        r6.b.g(aJ, null);
        if (hVar.f16388g == 0) {
            return new r6.e(aJ, j, true);
        }
        return new r6.e(new r(AbstractC0597a.j(new r6.e(aJ, hVar.f16387e, true)), new Inflater(true)), j, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void b(x source, x target) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void e(x dir) throws IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void f(x path) throws IOException {
        kotlin.jvm.internal.m.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final List z(x xVar) throws IOException {
        x xVar2 = f16044v;
        xVar2.getClass();
        r6.h hVar = (r6.h) this.f16047u.get(r6.c.b(xVar2, xVar, true));
        if (hVar != null) {
            return n5.l.B0(hVar.f16396q);
        }
        throw new IOException("not a directory: " + xVar);
    }
}
