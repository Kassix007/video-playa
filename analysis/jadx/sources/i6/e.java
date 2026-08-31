package i6;

import O3.B;
import d6.u;
import kotlin.jvm.internal.m;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1541j c1541j = C1541j.f16064t;
        B.h("\"\\");
        B.h("\t ,=");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(u uVar) {
        if (m.a(uVar.f12432q.f12414b, "HEAD")) {
            return false;
        }
        int i = uVar.f12435t;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && e6.b.h(uVar) == -1 && !"chunked".equalsIgnoreCase(u.a(uVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r22v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r24v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(d6.b r35, d6.n r36, d6.l r37) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.m.e(r0, r3)
            java.lang.String r3 = "url"
            kotlin.jvm.internal.m.e(r1, r3)
            java.lang.String r3 = "headers"
            kotlin.jvm.internal.m.e(r2, r3)
            d6.b r3 = d6.b.f12303b
            if (r0 != r3) goto L1a
            return
        L1a:
            java.util.regex.Pattern r0 = d6.j.j
            int r0 = r2.size()
            r3 = 0
            r5 = r3
            r6 = 0
        L23:
            if (r5 >= r0) goto L43
            java.lang.String r7 = r2.g(r5)
            java.lang.String r8 = "Set-Cookie"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L40
            if (r6 != 0) goto L39
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 2
            r6.<init>(r7)
        L39:
            java.lang.String r7 = r2.i(r5)
            r6.add(r7)
        L40:
            int r5 = r5 + 1
            goto L23
        L43:
            n5.s r2 = n5.s.f15299q
            if (r6 == 0) goto L52
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            java.lang.String r5 = "{\n      Collections.unmodifiableList(result)\n    }"
            kotlin.jvm.internal.m.d(r0, r5)
            r5 = r0
            goto L53
        L52:
            r5 = r2
        L53:
            int r6 = r5.size()
            r7 = r3
            r8 = 0
        L59:
            if (r7 >= r6) goto L23e
            java.lang.Object r0 = r5.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "setCookie"
            kotlin.jvm.internal.m.e(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            byte[] r0 = e6.b.f12673a
            int r0 = r9.length()
            r12 = 59
            int r0 = e6.b.e(r9, r12, r3, r0)
            r13 = 61
            int r14 = e6.b.e(r9, r13, r3, r0)
            if (r14 != r0) goto L80
            goto L9f
        L80:
            java.lang.String r16 = e6.b.v(r9, r3, r14)
            int r15 = r16.length()
            if (r15 != 0) goto L8b
            goto L9f
        L8b:
            int r15 = e6.b.j(r16)
            r4 = -1
            if (r15 == r4) goto L93
            goto L9f
        L93:
            int r14 = r14 + 1
            java.lang.String r17 = e6.b.v(r9, r14, r0)
            int r14 = e6.b.j(r17)
            if (r14 == r4) goto La3
        L9f:
            r13 = r3
        La0:
            r15 = 0
            goto L22c
        La3:
            int r0 = r0 + 1
            int r4 = r9.length()
            r18 = -1
            r20 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r24 = r3
            r26 = r24
            r29 = r26
            r22 = r18
            r27 = r20
            r37 = 1
            r14 = 0
            r15 = 0
            r25 = 1
        Lc0:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r4) goto L188
            int r3 = e6.b.e(r9, r12, r0, r4)
            int r12 = e6.b.e(r9, r13, r0, r3)
            java.lang.String r0 = e6.b.v(r9, r0, r12)
            if (r12 >= r3) goto Lde
            int r12 = r12 + 1
            java.lang.String r12 = e6.b.v(r9, r12, r3)
            goto Le0
        Lde:
            java.lang.String r12 = ""
        Le0:
            java.lang.String r13 = "expires"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto Lf4
            int r0 = r12.length()     // Catch: java.lang.Throwable -> L17f
            long r27 = com.google.android.gms.internal.measurement.I1.z0(r0, r12)     // Catch: java.lang.Throwable -> L17f
        Lf0:
            r26 = r37
            goto L17f
        Lf4:
            java.lang.String r13 = "max-age"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L133
            long r12 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L10c
            r22 = 0
            int r0 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r0 > 0) goto L109
            r22 = r32
            goto Lf0
        L109:
            r22 = r12
            goto Lf0
        L10c:
            r0 = move-exception
            java.lang.String r13 = "-?\\d+"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            r34 = r0
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.m.d(r13, r0)
            java.util.regex.Matcher r0 = r13.matcher(r12)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L132
            java.lang.String r0 = "-"
            r13 = 0
            boolean r0 = J5.t.G0(r12, r0, r13)
            if (r0 == 0) goto L12f
            r30 = r32
        L12f:
            r22 = r30
            goto Lf0
        L132:
            throw r34
        L133:
            java.lang.String r13 = "domain"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L160
            java.lang.String r0 = "."
            r13 = 0
            boolean r30 = J5.t.A0(r12, r0, r13)     // Catch: java.lang.Throwable -> L17f
            if (r30 != 0) goto L158
            java.lang.String r0 = J5.m.a1(r12, r0)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r0 = a.AbstractC0597a.T(r0)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L152
            r15 = r0
            r25 = 0
            goto L17f
        L152:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17f
            r0.<init>()     // Catch: java.lang.Throwable -> L17f
            throw r0     // Catch: java.lang.Throwable -> L17f
        L158:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17f
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L17f
            throw r12     // Catch: java.lang.Throwable -> L17f
        L160:
            java.lang.String r13 = "path"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L16a
            r14 = r12
            goto L17f
        L16a:
            java.lang.String r12 = "secure"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L175
            r29 = r37
            goto L17f
        L175:
            java.lang.String r12 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L17f
            r24 = r37
        L17f:
            int r0 = r3 + 1
            r3 = 0
            r12 = 59
            r13 = 61
            goto Lc0
        L188:
            int r0 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r0 != 0) goto L18f
            r18 = r32
            goto L1b4
        L18f:
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r0 == 0) goto L1b2
            r3 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r0 > 0) goto L1a1
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r30 = r22 * r3
        L1a1:
            long r30 = r10 + r30
            int r0 = (r30 > r10 ? 1 : (r30 == r10 ? 0 : -1))
            if (r0 < 0) goto L1af
            int r0 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r0 <= 0) goto L1ac
            goto L1af
        L1ac:
            r18 = r30
            goto L1b4
        L1af:
            r18 = r20
            goto L1b4
        L1b2:
            r18 = r27
        L1b4:
            java.lang.String r0 = r1.f12371d
            if (r15 != 0) goto L1ba
            r15 = r0
            goto L1e3
        L1ba:
            boolean r3 = kotlin.jvm.internal.m.a(r0, r15)
            if (r3 == 0) goto L1c1
            goto L1e3
        L1c1:
            r13 = 0
            boolean r3 = J5.t.A0(r0, r15, r13)
            if (r3 == 0) goto L1f5
            int r3 = r0.length()
            int r4 = r15.length()
            int r3 = r3 - r4
            int r3 = r3 + (-1)
            char r3 = r0.charAt(r3)
            r4 = 46
            if (r3 != r4) goto L1f5
            J5.k r3 = e6.b.f12677e
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L1f5
        L1e3:
            int r0 = r0.length()
            int r3 = r15.length()
            if (r0 == r3) goto L1f8
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f15468g
            java.lang.String r0 = r0.a(r15)
            if (r0 != 0) goto L1f8
        L1f5:
            r13 = 0
            goto La0
        L1f8:
            java.lang.String r0 = "/"
            r13 = 0
            if (r14 == 0) goto L209
            boolean r3 = J5.t.G0(r14, r0, r13)
            if (r3 != 0) goto L204
            goto L209
        L204:
            r21 = r14
            r20 = r15
            goto L221
        L209:
            java.lang.String r3 = r1.b()
            r4 = 47
            r9 = 6
            int r4 = J5.m.X0(r3, r4, r13, r9)
            if (r4 == 0) goto L21f
            java.lang.String r0 = r3.substring(r13, r4)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.m.d(r0, r3)
        L21f:
            r14 = r0
            goto L204
        L221:
            d6.j r15 = new d6.j
            r23 = r24
            r24 = r26
            r22 = r29
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
        L22c:
            if (r15 != 0) goto L22f
            goto L239
        L22f:
            if (r8 != 0) goto L236
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L236:
            r8.add(r15)
        L239:
            int r7 = r7 + 1
            r3 = r13
            goto L59
        L23e:
            if (r8 == 0) goto L249
            java.util.List r2 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r0 = "{\n        Collections.un…ableList(cookies)\n      }"
            kotlin.jvm.internal.m.d(r2, r0)
        L249:
            r2.isEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.e.b(d6.b, d6.n, d6.l):void");
    }
}
