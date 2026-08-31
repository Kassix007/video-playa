package w;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: w.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1770B extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.y f17734q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.y f17735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f17737t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f17738u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770B(C c7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17738u = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1770B c1770b = new C1770B(this.f17738u, interfaceC1524c);
        c1770b.f17737t = obj;
        return c1770b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1770B) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (w.C.A0(r2, r6) != r3) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00c8, B:40:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00cc, B:19:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r0 r4
  0x0032: PHI (r0v11 kotlin.jvm.internal.y) = (r0v3 kotlin.jvm.internal.y), (r0v16 kotlin.jvm.internal.y) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v6 M5.w) = (r4v4 M5.w), (r4v7 M5.w) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r5
  0x0056: PHI (r5v7 M5.w) = (r5v0 M5.w), (r5v3 M5.w), (r5v3 M5.w), (r5v3 M5.w), (r5v5 M5.w), (r5v8 M5.w) binds: [B:18:0x004e, B:45:0x00ca, B:47:0x00d7, B:41:0x00c3, B:30:0x0082, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c8, B:46:0x00cc), top: B:59:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c8, B:46:0x00cc), top: B:59:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c3 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ca -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d7 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e5 -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f17736s
            r1 = 0
            w.C r2 = r6.f17738u
            r5.a r3 = r5.EnumC1580a.f16356q
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L42;
                case 2: goto L38;
                case 3: goto L29;
                case 4: goto L22;
                case 5: goto L1a;
                case 6: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L12:
            java.lang.Object r0 = r6.f17737t
            M5.w r0 = (M5.InterfaceC0261w) r0
            m5.AbstractC1362a.e(r7)
            goto L27
        L1a:
            java.lang.Object r0 = r6.f17737t
            M5.w r0 = (M5.InterfaceC0261w) r0
        L1e:
            m5.AbstractC1362a.e(r7)     // Catch: java.util.concurrent.CancellationException -> Lda
            goto L27
        L22:
            java.lang.Object r0 = r6.f17737t
            M5.w r0 = (M5.InterfaceC0261w) r0
            goto L1e
        L27:
            r5 = r0
            goto L56
        L29:
            kotlin.jvm.internal.y r0 = r6.f17734q
            java.lang.Object r4 = r6.f17737t
            M5.w r4 = (M5.InterfaceC0261w) r4
            m5.AbstractC1362a.e(r7)     // Catch: java.util.concurrent.CancellationException -> L35
        L32:
            r5 = r4
            goto Lab
        L35:
            r0 = r4
            goto Lda
        L38:
            kotlin.jvm.internal.y r0 = r6.f17734q
            java.lang.Object r4 = r6.f17737t
            M5.w r4 = (M5.InterfaceC0261w) r4
            m5.AbstractC1362a.e(r7)
            goto L98
        L42:
            kotlin.jvm.internal.y r0 = r6.f17735r
            kotlin.jvm.internal.y r4 = r6.f17734q
            java.lang.Object r5 = r6.f17737t
            M5.w r5 = (M5.InterfaceC0261w) r5
            m5.AbstractC1362a.e(r7)
            goto L77
        L4e:
            m5.AbstractC1362a.e(r7)
            java.lang.Object r7 = r6.f17737t
            M5.w r7 = (M5.InterfaceC0261w) r7
            r5 = r7
        L56:
            boolean r7 = M5.AbstractC0263y.r(r5)
            if (r7 == 0) goto Le8
            kotlin.jvm.internal.y r0 = new kotlin.jvm.internal.y
            r0.<init>()
            O5.e r7 = r2.f17748K
            if (r7 == 0) goto L7a
            r6.f17737t = r5
            r6.f17734q = r0
            r6.f17735r = r0
            r4 = 1
            r6.f17736s = r4
            java.lang.Object r7 = r7.h(r6)
            if (r7 != r3) goto L76
            goto Le7
        L76:
            r4 = r0
        L77:
            w.s r7 = (w.AbstractC1806s) r7
            goto L7c
        L7a:
            r4 = r0
            r7 = r1
        L7c:
            r0.f14268q = r7
            java.lang.Object r7 = r4.f14268q
            boolean r0 = r7 instanceof w.C1803q
            if (r0 == 0) goto L56
            w.q r7 = (w.C1803q) r7
            r6.f17737t = r5
            r6.f17734q = r4
            r6.f17735r = r1
            r0 = 2
            r6.f17736s = r0
            java.lang.Object r7 = w.C.B0(r2, r7, r6)
            if (r7 != r3) goto L96
            goto Le7
        L96:
            r0 = r4
            r4 = r5
        L98:
            w.A r7 = new w.A     // Catch: java.util.concurrent.CancellationException -> L35
            r7.<init>(r0, r2, r1)     // Catch: java.util.concurrent.CancellationException -> L35
            r6.f17737t = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r6.f17734q = r0     // Catch: java.util.concurrent.CancellationException -> L35
            r5 = 3
            r6.f17736s = r5     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r7 = r2.E0(r7, r6)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r7 != r3) goto L32
            goto Le7
        Lab:
            java.lang.Object r7 = r0.f14268q     // Catch: java.util.concurrent.CancellationException -> Lc6
            boolean r0 = r7 instanceof w.r     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r0 == 0) goto Lc8
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
            kotlin.jvm.internal.m.c(r7, r0)     // Catch: java.util.concurrent.CancellationException -> Lc6
            w.r r7 = (w.r) r7     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f17737t = r5     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f17734q = r1     // Catch: java.util.concurrent.CancellationException -> Lc6
            r0 = 4
            r6.f17736s = r0     // Catch: java.util.concurrent.CancellationException -> Lc6
            java.lang.Object r7 = w.C.C0(r2, r7, r6)     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 != r3) goto L56
            goto Le7
        Lc6:
            r0 = r5
            goto Lda
        Lc8:
            boolean r7 = r7 instanceof w.C1799o     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 == 0) goto L56
            r6.f17737t = r5     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f17734q = r1     // Catch: java.util.concurrent.CancellationException -> Lc6
            r7 = 5
            r6.f17736s = r7     // Catch: java.util.concurrent.CancellationException -> Lc6
            java.lang.Object r7 = w.C.A0(r2, r6)     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 != r3) goto L56
            goto Le7
        Lda:
            r6.f17737t = r0
            r6.f17734q = r1
            r7 = 6
            r6.f17736s = r7
            java.lang.Object r7 = w.C.A0(r2, r6)
            if (r7 != r3) goto L27
        Le7:
            return r3
        Le8:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1770B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
