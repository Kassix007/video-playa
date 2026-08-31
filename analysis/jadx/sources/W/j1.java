package w;

import u.C1659m;
import u.InterfaceC1657k;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final C1659m f = new C1659m(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.B0 f18009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18010b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1659m f18011c = f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18013e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j1(InterfaceC1657k interfaceC1657k) {
        this.f18009a = interfaceC1657k.a(u.A0.f16746a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0037 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0026 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (P.C0345b.o(r1.getContext()).e(r0, r1) == r9) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x00ee, PHI: r0 r1 r13 r14 r15
  0x0081: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r1v4 w.h1) = (r1v2 w.h1), (r1v5 w.h1) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r14v6 B5.c) = (r14v3 B5.c), (r14v7 B5.c) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r15v17 w.j1) = (r15v8 w.j1), (r15v18 w.j1) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ee, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r0 r1 r14 r15
  0x008e: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r1v3 w.h1) = (r1v4 w.h1), (r1v5 w.h1) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r14v4 B5.c) = (r14v6 B5.c), (r14v7 B5.c) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r15v11 w.j1) = (r15v17 w.j1), (r15v18 w.j1) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00ee, TryCatch #2 {all -> 0x00ee, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [B5.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [B5.a] */
    /* JADX WARN: Type inference failed for: r13v10, types: [B5.a] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v5, types: [m5.e] */
    /* JADX WARN: Type inference failed for: r14v0, types: [C.k] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [w.j1] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [w.j1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ae -> B:59:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(A.J r13, C.k r14, s5.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof w.h1
            if (r0 == 0) goto L13
            r0 = r15
            w.h1 r0 = (w.h1) r0
            int r1 = r0.f17988w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17988w = r1
            goto L18
        L13:
            w.h1 r0 = new w.h1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f17986u
            int r1 = r0.f17988w
            u.m r2 = w.j1.f
            r3 = -9223372036854775808
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L59
            if (r1 == r8) goto L42
            if (r1 != r6) goto L3a
            m5.e r13 = r0.f17983r
            B5.a r13 = (B5.a) r13
            w.j1 r14 = r0.f17982q
            m5.AbstractC1362a.e(r15)     // Catch: java.lang.Throwable -> L37
            goto Le2
        L37:
            r13 = move-exception
            goto Lf0
        L3a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L42:
            float r13 = r0.f17985t
            B5.a r14 = r0.f17984s
            m5.e r1 = r0.f17983r
            B5.c r1 = (B5.c) r1
            w.j1 r10 = r0.f17982q
            m5.AbstractC1362a.e(r15)     // Catch: java.lang.Throwable -> L55
            r15 = r0
            r0 = r14
            r14 = r1
            r1 = r15
            r15 = r10
            goto Lb1
        L55:
            r13 = move-exception
            r14 = r10
            goto Lf0
        L59:
            m5.AbstractC1362a.e(r15)
            boolean r15 = r12.f18012d
            if (r15 == 0) goto L65
            java.lang.String r15 = "animateToZero called while previous animation is running"
            z.AbstractC1923a.c(r15)
        L65:
            q5.h r15 = r0.getContext()
            c0.b r1 = c0.C0714b.f10075D
            q5.f r15 = r15.get(r1)
            c0.p r15 = (c0.InterfaceC0728p) r15
            if (r15 == 0) goto L78
            float r15 = r15.K()
            goto L7a
        L78:
            r15 = 1065353216(0x3f800000, float:1.0)
        L7a:
            r12.f18012d = r8
            r1 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L81:
            float r10 = r15.f18013e     // Catch: java.lang.Throwable -> Lee
            float r10 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> Lee
            r11 = 1008981770(0x3c23d70a, float:0.01)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L93
        L8e:
            r13 = r15
            r15 = r14
            r14 = r13
            r13 = r0
            goto Lb9
        L93:
            w.i1 r10 = new w.i1     // Catch: java.lang.Throwable -> Lee
            r10.<init>(r15, r13, r14)     // Catch: java.lang.Throwable -> Lee
            r1.f17982q = r15     // Catch: java.lang.Throwable -> Lee
            r1.f17983r = r14     // Catch: java.lang.Throwable -> Lee
            r1.f17984s = r0     // Catch: java.lang.Throwable -> Lee
            r1.f17985t = r13     // Catch: java.lang.Throwable -> Lee
            r1.f17988w = r8     // Catch: java.lang.Throwable -> Lee
            q5.h r11 = r1.getContext()     // Catch: java.lang.Throwable -> Lee
            P.T r11 = P.C0345b.o(r11)     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r10 = r11.e(r10, r1)     // Catch: java.lang.Throwable -> Lee
            if (r10 != r9) goto Lb1
            goto Le1
        Lb1:
            r0.invoke()     // Catch: java.lang.Throwable -> Lee
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 != 0) goto L81
            goto L8e
        Lb9:
            float r0 = r14.f18013e     // Catch: java.lang.Throwable -> L37
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L37
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc4
            goto Le5
        Lc4:
            v.u r0 = new v.u     // Catch: java.lang.Throwable -> L37
            r5 = 6
            r0.<init>(r5, r14, r15)     // Catch: java.lang.Throwable -> L37
            r1.f17982q = r14     // Catch: java.lang.Throwable -> L37
            r1.f17983r = r13     // Catch: java.lang.Throwable -> L37
            r15 = 0
            r1.f17984s = r15     // Catch: java.lang.Throwable -> L37
            r1.f17988w = r6     // Catch: java.lang.Throwable -> L37
            q5.h r15 = r1.getContext()     // Catch: java.lang.Throwable -> L37
            P.T r15 = P.C0345b.o(r15)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r15 = r15.e(r0, r1)     // Catch: java.lang.Throwable -> L37
            if (r15 != r9) goto Le2
        Le1:
            return r9
        Le2:
            r13.invoke()     // Catch: java.lang.Throwable -> L37
        Le5:
            r14.f18010b = r3
            r14.f18011c = r2
            r14.f18012d = r7
            m5.y r13 = m5.C1386y.f15098a
            return r13
        Lee:
            r13 = move-exception
            r14 = r15
        Lf0:
            r14.f18010b = r3
            r14.f18011c = r2
            r14.f18012d = r7
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j1.a(A.J, C.k, s5.c):java.lang.Object");
    }
}
