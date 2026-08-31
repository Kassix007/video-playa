package n1;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import d2.d0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q2.g f15132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f15133b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Trace.beginSection(E3.h.O("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f15132a = new j();
        } else if (i >= 28) {
            f15132a = new i();
        } else if (i >= 26) {
            f15132a = new h();
        } else {
            Method method = g.f15138g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f15132a = new g();
            } else {
                f15132a = new f();
            }
        }
        f15133b = new d0(16);
        Trace.endSection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, m1.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, m1.b r23, boolean r24) {
        /*
            r2 = r16
            r0 = r17
            r4 = r22
            r1 = r23
            boolean r3 = r0 instanceof m1.g
            r5 = 8
            r6 = -3
            if (r3 == 0) goto L1d9
            m1.g r0 = (m1.g) r0
            java.lang.String r3 = r0.f15030e
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L31
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L1e
            goto L31
        L1e:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r8)
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r9, r8)
            if (r3 == 0) goto L31
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L31
            goto L32
        L31:
            r3 = r7
        L32:
            if (r3 == 0) goto L48
            if (r1 == 0) goto L47
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            N5.c r2 = new N5.c
            r2.<init>(r5, r1, r3)
            r0.post(r2)
        L47:
            return r3
        L48:
            r9 = 1
            if (r24 == 0) goto L53
            int r3 = r0.f15029d
            if (r3 != 0) goto L51
        L4f:
            r3 = r9
            goto L56
        L51:
            r3 = r8
            goto L56
        L53:
            if (r1 != 0) goto L51
            goto L4f
        L56:
            r5 = -1
            if (r24 == 0) goto L5c
            int r10 = r0.f15028c
            goto L5d
        L5c:
            r10 = r5
        L5d:
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r11.<init>(r12)
            i3.a r12 = new i3.a
            r13 = 5
            r12.<init>(r13)
            r12.f13562r = r1
            s1.c r1 = r0.f15027b
            r13 = 2
            if (r1 == 0) goto L91
            s1.c r0 = r0.f15026a
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            r14 = r8
        L7f:
            if (r14 >= r13) goto L8c
            r15 = r0[r14]
            java.util.Objects.requireNonNull(r15)
            r1.add(r15)
            int r14 = r14 + 1
            goto L7f
        L8c:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto La8
        L91:
            s1.c r0 = r0.f15026a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0 = r0[r8]
            java.util.Objects.requireNonNull(r0)
            r1.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
        La8:
            Z.m r14 = new Z.m
            O3.Q0 r1 = new O3.Q0
            r1.<init>(r13, r11)
            r11 = 24
            r14.<init>(r11, r12, r1)
            r11 = 28
            if (r3 == 0) goto L162
            int r3 = r0.size()
            if (r3 > r9) goto L15a
            java.lang.Object r0 = r0.get(r8)
            r3 = r0
            s1.c r3 = (s1.c) r3
            d2.d0 r0 = s1.g.f16435a
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r9)
            r0 = r0[r8]
            java.util.Objects.requireNonNull(r0)
            r13.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r13)
            java.lang.String r0 = s1.g.a(r4, r0)
            d2.d0 r13 = s1.g.f16435a
            java.lang.Object r13 = r13.h(r0)
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13
            if (r13 == 0) goto Lf5
            I4.a r0 = new I4.a
            r0.<init>(r11, r12, r13)
            r1.execute(r0)
            r7 = r13
            goto L1d3
        Lf5:
            if (r10 != r5) goto L117
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r9)
            r1 = r1[r8]
            java.util.Objects.requireNonNull(r1)
            r3.add(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            s1.f r0 = s1.g.b(r0, r2, r1, r4)
            r14.x(r0)
            android.graphics.Typeface r7 = r0.f16433a
            goto L1d3
        L117:
            r1 = r0
            s1.d r0 = new s1.d
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r1 = s1.g.f16436b     // Catch: java.lang.InterruptedException -> L147
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.InterruptedException -> L147
            long r1 = (long) r10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L134 java.util.concurrent.ExecutionException -> L136 java.util.concurrent.TimeoutException -> L138
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.InterruptedException -> L134 java.util.concurrent.ExecutionException -> L136 java.util.concurrent.TimeoutException -> L138
            s1.f r0 = (s1.f) r0     // Catch: java.lang.InterruptedException -> L147
            r14.x(r0)     // Catch: java.lang.InterruptedException -> L147
            android.graphics.Typeface r7 = r0.f16433a     // Catch: java.lang.InterruptedException -> L147
            goto L1d3
        L134:
            r0 = move-exception
            goto L140
        L136:
            r0 = move-exception
            goto L141
        L138:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L147
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L147
            throw r0     // Catch: java.lang.InterruptedException -> L147
        L140:
            throw r0     // Catch: java.lang.InterruptedException -> L147
        L141:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L147
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L147
            throw r1     // Catch: java.lang.InterruptedException -> L147
        L147:
            java.lang.Object r0 = r14.f8313s
            O3.Q0 r0 = (O3.Q0) r0
            java.lang.Object r1 = r14.f8312r
            i3.a r1 = (i3.C1136a) r1
            E1.j r2 = new E1.j
            r3 = 3
            r2.<init>(r6, r3, r1)
            r0.execute(r2)
            goto L1d3
        L15a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fallbacks with blocking fetches are not supported for performance reasons"
            r0.<init>(r1)
            throw r0
        L162:
            java.lang.String r2 = s1.g.a(r4, r0)
            d2.d0 r3 = s1.g.f16435a
            java.lang.Object r3 = r3.h(r2)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L17a
            I4.a r0 = new I4.a
            r0.<init>(r11, r12, r3)
            r1.execute(r0)
            r7 = r3
            goto L1d3
        L17a:
            s1.e r1 = new s1.e
            r1.<init>(r8, r14)
            java.lang.Object r3 = s1.g.f16437c
            monitor-enter(r3)
            r.Q r5 = s1.g.f16438d     // Catch: java.lang.Throwable -> L191
            java.lang.Object r6 = r5.get(r2)     // Catch: java.lang.Throwable -> L191
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L191
            if (r6 == 0) goto L193
            r6.add(r1)     // Catch: java.lang.Throwable -> L191
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L191
            goto L1d3
        L191:
            r0 = move-exception
            goto L1d7
        L193:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L191
            r6.<init>()     // Catch: java.lang.Throwable -> L191
            r6.add(r1)     // Catch: java.lang.Throwable -> L191
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> L191
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L191
            r3 = r0
            s1.d r0 = new s1.d
            r5 = 1
            r1 = r2
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r2 = s1.g.f16436b
            s1.e r3 = new s1.e
            r3.<init>(r9, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L1c0
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r1.<init>(r5)
            goto L1c5
        L1c0:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L1c5:
            O3.x0 r5 = new O3.x0
            r5.<init>()
            r5.f5121t = r0
            r5.f5119r = r3
            r5.f5120s = r1
            r2.execute(r5)
        L1d3:
            r0 = r7
            r7 = r18
            goto L1fc
        L1d7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L191
            throw r0
        L1d9:
            Q2.g r3 = n1.e.f15132a
            m1.e r0 = (m1.e) r0
            r7 = r18
            android.graphics.Typeface r0 = r3.s(r2, r0, r7, r4)
            if (r1 == 0) goto L1fc
            if (r0 == 0) goto L1f9
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            N5.c r3 = new N5.c
            r3.<init>(r5, r1, r0)
            r2.post(r3)
            goto L1fc
        L1f9:
            r1.a(r6)
        L1fc:
            if (r0 == 0) goto L207
            d2.d0 r1 = n1.e.f15133b
            java.lang.String r2 = b(r18, r19, r20, r21, r22)
            r1.l(r2, r0)
        L207:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.a(android.content.Context, m1.d, android.content.res.Resources, int, java.lang.String, int, int, m1.b, boolean):android.graphics.Typeface");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Resources resources, int i, String str, int i7, int i8) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i7 + '-' + i + '-' + i8;
    }
}
