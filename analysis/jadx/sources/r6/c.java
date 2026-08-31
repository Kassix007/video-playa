package r6;

import C0.S;
import O3.B;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.C1541j;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1541j f16369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1541j f16370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1541j f16371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1541j f16372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1541j f16373e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1541j c1541j = C1541j.f16064t;
        f16369a = B.h("/");
        f16370b = B.h("\\");
        f16371c = B.h("/\\");
        f16372d = B.h(".");
        f16373e = B.h("..");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(x xVar) {
        C1541j c1541j = xVar.f16094q;
        if (c1541j.c() != 0) {
            if (c1541j.h(0) != 47) {
                if (c1541j.h(0) == 92) {
                    if (c1541j.c() > 2 && c1541j.h(1) == 92) {
                        C1541j other = f16370b;
                        m.e(other, "other");
                        int iE = c1541j.e(2, other.g());
                        return iE == -1 ? c1541j.c() : iE;
                    }
                } else if (c1541j.c() > 2 && c1541j.h(1) == 58 && c1541j.h(2) == 92) {
                    char cH = (char) c1541j.h(0);
                    if ('a' <= cH && cH < '{') {
                        return 3;
                    }
                    if ('A' <= cH && cH < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final x b(x xVar, x child, boolean z5) {
        m.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        C1541j c1541jC = c(xVar);
        if (c1541jC == null && (c1541jC = c(child)) == null) {
            c1541jC = f(x.f16093r);
        }
        C1538g c1538g = new C1538g();
        c1538g.c0(xVar.f16094q);
        if (c1538g.f16063r > 0) {
            c1538g.c0(c1541jC);
        }
        c1538g.c0(child.f16094q);
        return d(c1538g, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1541j c(x xVar) {
        C1541j c1541j = xVar.f16094q;
        C1541j c1541j2 = f16369a;
        if (C1541j.f(c1541j, c1541j2) != -1) {
            return c1541j2;
        }
        C1541j c1541j3 = xVar.f16094q;
        C1541j c1541j4 = f16370b;
        if (C1541j.f(c1541j3, c1541j4) != -1) {
            return c1541j4;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q6.x d(q6.C1538g r17, boolean r18) throws java.io.EOFException {
        /*
            r0 = r17
            q6.g r1 = new q6.g
            r1.<init>()
            r2 = 0
            r4 = 0
        L9:
            q6.j r5 = r6.c.f16369a
            r6 = 0
            boolean r5 = r0.t(r6, r5)
            if (r5 != 0) goto L148
            q6.j r5 = r6.c.f16370b
            boolean r8 = r0.t(r6, r5)
            if (r8 == 0) goto L1d
            goto L148
        L1d:
            r8 = 2
            r9 = 1
            if (r4 < r8) goto L29
            boolean r8 = kotlin.jvm.internal.m.a(r2, r5)
            if (r8 == 0) goto L29
            r8 = r9
            goto L2a
        L29:
            r8 = 0
        L2a:
            r10 = -1
            q6.j r12 = r6.c.f16371c
            if (r8 == 0) goto L3a
            kotlin.jvm.internal.m.b(r2)
            r1.c0(r2)
            r1.c0(r2)
            goto L42
        L3a:
            if (r4 <= 0) goto L44
            kotlin.jvm.internal.m.b(r2)
            r1.c0(r2)
        L42:
            r15 = r10
            goto L9d
        L44:
            long r13 = r0.v(r12)
            if (r2 != 0) goto L5d
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 != 0) goto L55
            java.lang.String r2 = q6.x.f16093r
            q6.j r2 = f(r2)
            goto L5d
        L55:
            byte r2 = r0.f(r13)
            q6.j r2 = e(r2)
        L5d:
            boolean r4 = kotlin.jvm.internal.m.a(r2, r5)
            if (r4 != 0) goto L64
            goto L42
        L64:
            long r4 = r0.f16063r
            r15 = r4
            r3 = 2
            int r5 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r5 >= 0) goto L6e
            goto L42
        L6e:
            r15 = r10
            r10 = 1
            byte r5 = r0.f(r10)
            r10 = 58
            if (r5 == r10) goto L7a
            goto L9d
        L7a:
            byte r5 = r0.f(r6)
            char r5 = (char) r5
            r10 = 97
            if (r10 > r5) goto L88
            r10 = 123(0x7b, float:1.72E-43)
            if (r5 >= r10) goto L88
            goto L90
        L88:
            r10 = 65
            if (r10 > r5) goto L9d
            r10 = 91
            if (r5 >= r10) goto L9d
        L90:
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto L9a
            r3 = 3
            r1.Z(r3, r0)
            goto L9d
        L9a:
            r1.Z(r3, r0)
        L9d:
            long r3 = r1.f16063r
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto La5
            r3 = r9
            goto La6
        La5:
            r3 = 0
        La6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        Lab:
            boolean r5 = r0.e()
            q6.j r10 = r6.c.f16372d
            if (r5 != 0) goto L11b
            long r13 = r0.v(r12)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto Lc2
            long r13 = r0.f16063r
            q6.j r5 = r0.k(r13)
            goto Lc9
        Lc2:
            q6.j r5 = r0.k(r13)
            r0.readByte()
        Lc9:
            q6.j r11 = r6.c.f16373e
            boolean r13 = kotlin.jvm.internal.m.a(r5, r11)
            if (r13 == 0) goto L109
            if (r3 == 0) goto Ld9
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto Lab
        Ld9:
            if (r18 == 0) goto L105
            if (r3 != 0) goto Lee
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto L105
            java.lang.Object r10 = n5.l.r0(r4)
            boolean r10 = kotlin.jvm.internal.m.a(r10, r11)
            if (r10 == 0) goto Lee
            goto L105
        Lee:
            if (r8 == 0) goto Lf6
            int r5 = r4.size()
            if (r5 == r9) goto Lab
        Lf6:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lfd
            goto Lab
        Lfd:
            int r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r4)
            r4.remove(r5)
            goto Lab
        L105:
            r4.add(r5)
            goto Lab
        L109:
            boolean r10 = kotlin.jvm.internal.m.a(r5, r10)
            if (r10 != 0) goto Lab
            q6.j r10 = q6.C1541j.f16064t
            boolean r10 = kotlin.jvm.internal.m.a(r5, r10)
            if (r10 != 0) goto Lab
            r4.add(r5)
            goto Lab
        L11b:
            int r0 = r4.size()
            r3 = 0
        L120:
            if (r3 >= r0) goto L133
            if (r3 <= 0) goto L127
            r1.c0(r2)
        L127:
            java.lang.Object r5 = r4.get(r3)
            q6.j r5 = (q6.C1541j) r5
            r1.c0(r5)
            int r3 = r3 + 1
            goto L120
        L133:
            long r2 = r1.f16063r
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L13c
            r1.c0(r10)
        L13c:
            q6.x r0 = new q6.x
            long r2 = r1.f16063r
            q6.j r1 = r1.k(r2)
            r0.<init>(r1)
            return r0
        L148:
            byte r3 = r0.readByte()
            if (r2 != 0) goto L152
            q6.j r2 = e(r3)
        L152:
            int r4 = r4 + 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.c.d(q6.g, boolean):q6.x");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1541j e(byte b7) {
        if (b7 == 47) {
            return f16369a;
        }
        if (b7 == 92) {
            return f16370b;
        }
        throw new IllegalArgumentException(k1.i.i(b7, "not a directory separator: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1541j f(String str) {
        if (m.a(str, "/")) {
            return f16369a;
        }
        if (m.a(str, "\\")) {
            return f16370b;
        }
        throw new IllegalArgumentException(S.w("not a directory separator: ", str));
    }
}
