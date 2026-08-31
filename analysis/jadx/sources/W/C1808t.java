package w;

import F.C0162p;
import m5.C1386y;
import q5.InterfaceC1524c;
import v0.C1743l;

/* JADX INFO: renamed from: w.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1808t extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f18057A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1814w f18058B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18059C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ EnumC1778d0 f18060D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0162p f18061E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ B0.j0 f18062F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C1814w f18063G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ A.J f18064H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f18065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f18066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f18067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.x f18068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public O3.T f18069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1743l f18070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f18072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18073z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808t(C1814w c1814w, kotlin.jvm.internal.x xVar, EnumC1778d0 enumC1778d0, C0162p c0162p, B0.j0 j0Var, C1814w c1814w2, A.J j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18058B = c1814w;
        this.f18059C = xVar;
        this.f18060D = enumC1778d0;
        this.f18061E = c0162p;
        this.f18062F = j0Var;
        this.f18063G = c1814w2;
        this.f18064H = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1808t c1808t = new C1808t(this.f18058B, this.f18059C, this.f18060D, this.f18061E, this.f18062F, this.f18063G, this.f18064H, interfaceC1524c);
        c1808t.f18057A = obj;
        return c1808t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1808t) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:119:0x0361) to fix multi-entry loop: BACK_EDGE: B:119:0x0361 -> B:168:0x0471 */
    /* JADX DEBUG: Duplicate block (B:160:0x0441) to fix multi-entry loop: BACK_EDGE: B:160:0x0441 -> B:125:0x0388 */
    /* JADX DEBUG: Duplicate block (B:71:0x026b) to fix multi-entry loop: BACK_EDGE: B:71:0x026b -> B:35:0x01b1 */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04fe, code lost:
    
        if (r4 == r5) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0588, code lost:
    
        if (r4 == 0.0f) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0169, code lost:
    
        if (r8 != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ed, code lost:
    
        if (r2 == r5) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a6 A[PHI: r1 r2 r3 r4 r6 r7 r8 r9 r10 r11 r13 r18 r20
  0x03a6: PHI (r1v27 v0.y) = (r1v26 v0.y), (r1v28 v0.y) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r2v21 kotlin.jvm.internal.x) = (r2v20 kotlin.jvm.internal.x), (r2v22 kotlin.jvm.internal.x) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r3v28 v0.g) = (r3v27 v0.g), (r3v29 v0.g) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r4v27 v0.l) = (r4v26 v0.l), (r4v29 v0.l) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r6v21 v0.y) = (r6v20 v0.y), (r6v25 v0.y) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r7v16 O3.T) = (r7v15 O3.T), (r7v17 O3.T) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r8v23 java.lang.Object) = (r8v22 java.lang.Object), (r8v35 java.lang.Object) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r9v1 w.d0) = (r9v0 w.d0), (r9v11 w.d0) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r10v15 float) = (r10v14 float), (r10v17 float) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r11v18 kotlin.jvm.internal.x) = (r11v17 kotlin.jvm.internal.x), (r11v19 kotlin.jvm.internal.x) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r13v9 v0.g) = (r13v8 v0.g), (r13v20 v0.g) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r18v15 long) = (r18v14 long), (r18v16 long) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r20v11 kotlin.jvm.internal.x) = (r20v10 kotlin.jvm.internal.x), (r20v12 kotlin.jvm.internal.x) binds: [B:8:0x006c, B:126:0x03a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd A[PHI: r1 r2 r3 r4 r6 r7 r8 r10 r12 r14 r15 r18
  0x01cd: PHI (r1v13 float) = (r1v12 float), (r1v14 float) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r2v1 v0.g) = (r2v0 v0.g), (r2v12 v0.g) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r3v2 v0.g) = (r3v0 v0.g), (r3v17 v0.g) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r4v10 kotlin.jvm.internal.x) = (r4v9 kotlin.jvm.internal.x), (r4v12 kotlin.jvm.internal.x) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r6v6 v0.y) = (r6v5 v0.y), (r6v9 v0.y) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r7v4 v0.y) = (r7v3 v0.y), (r7v6 v0.y) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r8v7 O3.T) = (r8v6 O3.T), (r8v10 O3.T) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r10v3 v0.l) = (r10v2 v0.l), (r10v4 v0.l) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r12v1 kotlin.jvm.internal.x) = (r12v0 kotlin.jvm.internal.x), (r12v10 kotlin.jvm.internal.x) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r14v3 kotlin.jvm.internal.x) = (r14v2 kotlin.jvm.internal.x), (r14v4 kotlin.jvm.internal.x) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r15v1 java.lang.Object) = (r15v0 java.lang.Object), (r15v6 java.lang.Object) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r18v6 long) = (r18v5 long), (r18v7 long) binds: [B:11:0x00e2, B:36:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bb  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v57, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x031d -> B:93:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0465 -> B:165:0x0468). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x048c -> B:87:0x02b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x04fe -> B:185:0x0501). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0183 -> B:29:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x020e -> B:29:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x025c -> B:79:0x0298). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x028b -> B:76:0x028e). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.f18073z
            v0.g r2 = v0.EnumC1738g.f17456s
            v0.g r3 = v0.EnumC1738g.f17455r
            w.d0 r9 = r0.f18060D
            kotlin.jvm.internal.x r12 = r0.f18059C
            r13 = 0
            r14 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.a r5 = r5.EnumC1580a.f16356q
            switch(r1) {
                case 0: goto L12f;
                case 1: goto L11f;
                case 2: goto L10a;
                case 3: goto Le2;
                case 4: goto Lb7;
                case 5: goto L9a;
                case 6: goto L6c;
                case 7: goto L3c;
                case 8: goto L20;
                default: goto L18;
            }
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            kotlin.jvm.internal.x r1 = r0.f18068u
            java.lang.Object r2 = r0.f18067t
            v0.y r2 = (v0.y) r2
            java.lang.Object r4 = r0.f18066s
            w.d0 r4 = (w.EnumC1778d0) r4
            java.lang.Object r6 = r0.f18065r
            B5.e r6 = (B5.e) r6
            java.lang.Object r7 = r0.f18057A
            v0.y r7 = (v0.y) r7
            m5.AbstractC1362a.e(r27)
            r9 = r3
            r3 = r4
            r15 = 0
            r4 = r27
            goto L501
        L3c:
            float r1 = r0.f18072y
            v0.l r6 = r0.f18070w
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            O3.T r7 = r0.f18069v
            kotlin.jvm.internal.x r8 = r0.f18068u
            java.lang.Object r15 = r0.f18067t
            kotlin.jvm.internal.x r15 = (kotlin.jvm.internal.x) r15
            java.lang.Object r10 = r0.f18066s
            v0.y r10 = (v0.y) r10
            java.lang.Object r11 = r0.f18065r
            v0.l r11 = (v0.C1743l) r11
            java.lang.Object r4 = r0.f18057A
            v0.y r4 = (v0.y) r4
            m5.AbstractC1362a.e(r27)
            r14 = r8
            r8 = r1
            r1 = r4
            r4 = r11
            r11 = r14
            r22 = r9
            r20 = r12
            r9 = r3
            r3 = r2
            r2 = r15
            r14 = 0
            goto L468
        L6c:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r1 = r0.f18072y
            O3.T r4 = r0.f18069v
            kotlin.jvm.internal.x r6 = r0.f18068u
            java.lang.Object r7 = r0.f18067t
            kotlin.jvm.internal.x r7 = (kotlin.jvm.internal.x) r7
            java.lang.Object r8 = r0.f18066s
            v0.y r8 = (v0.y) r8
            java.lang.Object r10 = r0.f18065r
            v0.l r10 = (v0.C1743l) r10
            java.lang.Object r11 = r0.f18057A
            v0.y r11 = (v0.y) r11
            m5.AbstractC1362a.e(r27)
            r13 = r3
            r20 = r12
            r12 = 2
            r3 = r2
            r2 = r7
            r7 = r4
            r4 = r10
            r10 = r1
            r1 = r11
            r11 = r6
            r6 = r8
            r8 = r27
            goto L3a6
        L9a:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r1 = r0.f18066s
            v0.l r1 = (v0.C1743l) r1
            java.lang.Object r4 = r0.f18065r
            v0.l r4 = (v0.C1743l) r4
            java.lang.Object r6 = r0.f18057A
            v0.y r6 = (v0.y) r6
            m5.AbstractC1362a.e(r27)
            r24 = r3
            r20 = r12
            r3 = r2
            r2 = r27
            goto L2f1
        Lb7:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r1 = r0.f18072y
            v0.l r4 = r0.f18070w
            O3.T r6 = r0.f18069v
            kotlin.jvm.internal.x r7 = r0.f18068u
            java.lang.Object r8 = r0.f18067t
            kotlin.jvm.internal.x r8 = (kotlin.jvm.internal.x) r8
            java.lang.Object r10 = r0.f18066s
            v0.y r10 = (v0.y) r10
            java.lang.Object r11 = r0.f18065r
            v0.l r11 = (v0.C1743l) r11
            java.lang.Object r15 = r0.f18057A
            v0.y r15 = (v0.y) r15
            m5.AbstractC1362a.e(r27)
            r24 = r3
            r14 = r8
            r20 = r12
            r3 = r2
            r8 = r6
            r6 = r10
            r10 = r11
            goto L28e
        Le2:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r1 = r0.f18072y
            O3.T r4 = r0.f18069v
            kotlin.jvm.internal.x r6 = r0.f18068u
            java.lang.Object r7 = r0.f18067t
            kotlin.jvm.internal.x r7 = (kotlin.jvm.internal.x) r7
            java.lang.Object r8 = r0.f18066s
            v0.y r8 = (v0.y) r8
            java.lang.Object r10 = r0.f18065r
            v0.l r10 = (v0.C1743l) r10
            java.lang.Object r11 = r0.f18057A
            v0.y r11 = (v0.y) r11
            m5.AbstractC1362a.e(r27)
            r14 = r8
            r8 = r4
            r4 = r6
            r6 = r14
            r15 = r27
            r14 = r7
            r7 = r11
            goto L1cd
        L10a:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r1 = r0.f18071x
            java.lang.Object r4 = r0.f18065r
            v0.l r4 = (v0.C1743l) r4
            java.lang.Object r6 = r0.f18057A
            v0.y r6 = (v0.y) r6
            m5.AbstractC1362a.e(r27)
            r8 = r27
            goto L16d
        L11f:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r1 = r0.f18057A
            v0.y r1 = (v0.y) r1
            m5.AbstractC1362a.e(r27)
            r4 = r27
        L12d:
            r6 = r1
            goto L149
        L12f:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            m5.AbstractC1362a.e(r27)
            java.lang.Object r1 = r0.f18057A
            v0.y r1 = (v0.y) r1
            r0.f18057A = r1
            r0.f18073z = r14
            v0.g r4 = v0.EnumC1738g.f17454q
            java.lang.Object r4 = w.g1.b(r1, r13, r4, r0)
            if (r4 != r5) goto L12d
            goto L500
        L149:
            v0.l r4 = (v0.C1743l) r4
            w.w r1 = r0.f18058B
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L15c
            r4.a()
        L15c:
            r0.f18057A = r6
            r0.f18065r = r4
            r0.f18071x = r1
            r7 = 2
            r0.f18073z = r7
            java.lang.Object r8 = w.g1.c(r6, r0, r7)
            if (r8 != r5) goto L16d
            goto L500
        L16d:
            v0.l r8 = (v0.C1743l) r8
            r10 = 0
            r12.f14267q = r10
            if (r1 == 0) goto L2b4
        L175:
            long r10 = r8.f17460a
            int r1 = r8.i
            v0.A r4 = r6.f17509v
            v0.f r4 = r4.f17429I
            boolean r4 = w.AbstractC1810u.a(r4, r10)
            if (r4 == 0) goto L18b
            r24 = r3
            r20 = r12
            r3 = r2
        L188:
            r2 = 0
            goto L298
        L18b:
            C0.b1 r4 = r6.e()
            r7 = 2
            if (r1 != r7) goto L19a
            float r1 = r4.c()
            float r4 = w.AbstractC1810u.f18077a
            float r1 = r1 * r4
            goto L19e
        L19a:
            float r1 = r4.c()
        L19e:
            kotlin.jvm.internal.x r4 = new kotlin.jvm.internal.x
            r4.<init>()
            r4.f14267q = r10
            O3.T r7 = new O3.T
            r10 = 4
            r14 = 0
            r7.<init>(r10, r14, r9)
            r10 = r8
            r14 = r12
            r8 = r7
            r7 = r6
        L1b1:
            r0.f18057A = r7
            r0.f18065r = r10
            r0.f18066s = r6
            r0.f18067t = r14
            r0.f18068u = r4
            r0.f18069v = r8
            r15 = 0
            r0.f18070w = r15
            r0.f18072y = r1
            r15 = 3
            r0.f18073z = r15
            java.lang.Object r15 = r6.a(r3, r0)
            if (r15 != r5) goto L1cd
            goto L500
        L1cd:
            v0.f r15 = (v0.C1737f) r15
            java.lang.Object r11 = r15.f17451a
            r20 = r11
            java.util.Collection r20 = (java.util.Collection) r20
            int r13 = r20.size()
            r20 = r12
            r12 = 0
        L1dc:
            if (r12 >= r13) goto L202
            java.lang.Object r21 = r11.get(r12)
            r22 = r11
            r11 = r21
            v0.l r11 = (v0.C1743l) r11
            r23 = r12
            long r11 = r11.f17460a
            r25 = r2
            r24 = r3
            long r2 = r4.f14267q
            boolean r2 = v0.v.d(r11, r2)
            if (r2 == 0) goto L1f9
            goto L208
        L1f9:
            int r12 = r23 + 1
            r11 = r22
            r3 = r24
            r2 = r25
            goto L1dc
        L202:
            r25 = r2
            r24 = r3
            r21 = 0
        L208:
            r2 = r21
            v0.l r2 = (v0.C1743l) r2
            if (r2 != 0) goto L214
        L20e:
            r6 = r7
            r8 = r10
            r3 = r25
            goto L188
        L214:
            boolean r3 = r2.b()
            if (r3 == 0) goto L21b
            goto L20e
        L21b:
            boolean r3 = v0.v.c(r2)
            if (r3 == 0) goto L247
            java.lang.Object r2 = r15.f17451a
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r11 = 0
        L22b:
            if (r11 >= r3) goto L23c
            java.lang.Object r12 = r2.get(r11)
            r13 = r12
            v0.l r13 = (v0.C1743l) r13
            boolean r13 = r13.f17463d
            if (r13 == 0) goto L239
            goto L23d
        L239:
            int r11 = r11 + 1
            goto L22b
        L23c:
            r12 = 0
        L23d:
            v0.l r12 = (v0.C1743l) r12
            if (r12 != 0) goto L242
            goto L20e
        L242:
            long r2 = r12.f17460a
            r4.f14267q = r2
            goto L265
        L247:
            long r11 = r8.a(r2, r1)
            long r21 = r11 & r18
            int r3 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r3 == 0) goto L26e
            r2.a()
            r14.f14267q = r11
            boolean r3 = r2.b()
            if (r3 == 0) goto L261
            r6 = r7
            r8 = r10
            r3 = r25
            goto L298
        L261:
            r2 = 0
            r8.f4572r = r2
        L265:
            r12 = r20
            r3 = r24
            r2 = r25
        L26b:
            r13 = 0
            goto L1b1
        L26e:
            r0.f18057A = r7
            r0.f18065r = r10
            r0.f18066s = r6
            r0.f18067t = r14
            r0.f18068u = r4
            r0.f18069v = r8
            r0.f18070w = r2
            r0.f18072y = r1
            r3 = 4
            r0.f18073z = r3
            r3 = r25
            java.lang.Object r11 = r6.a(r3, r0)
            if (r11 != r5) goto L28b
            goto L500
        L28b:
            r15 = r7
            r7 = r4
            r4 = r2
        L28e:
            boolean r2 = r4.b()
            if (r2 == 0) goto L2ac
            r8 = r10
            r6 = r15
            goto L188
        L298:
            if (r2 == 0) goto L2aa
            boolean r1 = r2.b()
            if (r1 == 0) goto L2a1
            goto L2aa
        L2a1:
            r2 = r3
            r12 = r20
            r3 = r24
            r13 = 0
            r14 = 1
            goto L175
        L2aa:
            r4 = r2
            goto L2b9
        L2ac:
            r2 = r3
            r4 = r7
            r7 = r15
            r12 = r20
            r3 = r24
            goto L26b
        L2b4:
            r24 = r3
            r20 = r12
            r3 = r2
        L2b9:
            if (r4 != 0) goto L49c
            v0.A r1 = r6.f17509v
            v0.f r1 = r1.f17429I
            java.lang.Object r1 = r1.f17451a
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r7 = 0
        L2c9:
            if (r7 >= r2) goto L49c
            java.lang.Object r10 = r1.get(r7)
            v0.l r10 = (v0.C1743l) r10
            boolean r10 = r10.f17463d
            if (r10 == 0) goto L490
            r1 = r4
            r4 = r8
        L2d7:
            r0.f18057A = r6
            r0.f18065r = r4
            r0.f18066s = r1
            r15 = 0
            r0.f18067t = r15
            r0.f18068u = r15
            r0.f18069v = r15
            r0.f18070w = r15
            r2 = 5
            r0.f18073z = r2
            java.lang.Object r2 = r6.a(r3, r0)
            if (r2 != r5) goto L2f1
            goto L500
        L2f1:
            v0.f r2 = (v0.C1737f) r2
            java.lang.Object r2 = r2.f17451a
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
        L2fd:
            if (r8 >= r7) goto L326
            java.lang.Object r10 = r2.get(r8)
            v0.l r10 = (v0.C1743l) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto L323
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
        L313:
            if (r8 >= r7) goto L326
            java.lang.Object r10 = r2.get(r8)
            v0.l r10 = (v0.C1743l) r10
            boolean r10 = r10.f17463d
            if (r10 == 0) goto L320
            goto L2d7
        L320:
            int r8 = r8 + 1
            goto L313
        L323:
            int r8 = r8 + 1
            goto L2fd
        L326:
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
        L32e:
            if (r8 >= r7) goto L48c
            java.lang.Object r10 = r2.get(r8)
            v0.l r10 = (v0.C1743l) r10
            boolean r10 = r10.f17463d
            if (r10 == 0) goto L480
            java.lang.Object r1 = n5.l.m0(r2)
            v0.l r1 = (v0.C1743l) r1
            if (r1 == 0) goto L345
            long r10 = r1.f17462c
            goto L347
        L345:
            r10 = 0
        L347:
            long r1 = r4.f17462c
            long r1 = i0.C1130b.d(r10, r1)
            long r7 = r4.f17460a
            int r10 = r4.i
            v0.A r11 = r6.f17509v
            v0.f r11 = r11.f17429I
            boolean r11 = w.AbstractC1810u.a(r11, r7)
            if (r11 == 0) goto L365
            r8 = r4
            r22 = r9
            r9 = r24
        L360:
            r4 = 0
        L361:
            r14 = 0
            goto L471
        L365:
            C0.b1 r11 = r6.e()
            r12 = 2
            if (r10 != r12) goto L374
            float r10 = r11.c()
            float r11 = w.AbstractC1810u.f18077a
            float r10 = r10 * r11
            goto L378
        L374:
            float r10 = r11.c()
        L378:
            kotlin.jvm.internal.x r11 = new kotlin.jvm.internal.x
            r11.<init>()
            r11.f14267q = r7
            O3.T r7 = new O3.T
            r8 = 4
            r7.<init>(r8, r1, r9)
            r1 = r6
            r2 = r20
        L388:
            r0.f18057A = r1
            r0.f18065r = r4
            r0.f18066s = r6
            r0.f18067t = r2
            r0.f18068u = r11
            r0.f18069v = r7
            r15 = 0
            r0.f18070w = r15
            r0.f18072y = r10
            r8 = 6
            r0.f18073z = r8
            r13 = r24
            java.lang.Object r8 = r6.a(r13, r0)
            if (r8 != r5) goto L3a6
            goto L500
        L3a6:
            v0.f r8 = (v0.C1737f) r8
            java.lang.Object r14 = r8.f17451a
            r15 = r14
            java.util.Collection r15 = (java.util.Collection) r15
            int r15 = r15.size()
            r12 = 0
        L3b2:
            if (r12 >= r15) goto L3dc
            java.lang.Object r21 = r14.get(r12)
            r22 = r9
            r9 = r21
            v0.l r9 = (v0.C1743l) r9
            r23 = r14
            r24 = r15
            long r14 = r9.f17460a
            r25 = r12
            r9 = r13
            long r12 = r11.f14267q
            boolean r12 = v0.v.d(r14, r12)
            if (r12 == 0) goto L3d2
            r15 = r21
            goto L3e0
        L3d2:
            int r12 = r25 + 1
            r13 = r9
            r9 = r22
            r14 = r23
            r15 = r24
            goto L3b2
        L3dc:
            r22 = r9
            r9 = r13
            r15 = 0
        L3e0:
            r12 = r15
            v0.l r12 = (v0.C1743l) r12
            if (r12 != 0) goto L3e9
        L3e5:
            r6 = r1
            r8 = r4
            goto L360
        L3e9:
            boolean r13 = r12.b()
            if (r13 == 0) goto L3f0
            goto L3e5
        L3f0:
            boolean r13 = v0.v.c(r12)
            if (r13 == 0) goto L41e
            java.lang.Object r8 = r8.f17451a
            r12 = r8
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r13 = 0
        L400:
            if (r13 >= r12) goto L411
            java.lang.Object r15 = r8.get(r13)
            r14 = r15
            v0.l r14 = (v0.C1743l) r14
            boolean r14 = r14.f17463d
            if (r14 == 0) goto L40e
            goto L412
        L40e:
            int r13 = r13 + 1
            goto L400
        L411:
            r15 = 0
        L412:
            v0.l r15 = (v0.C1743l) r15
            if (r15 != 0) goto L417
            goto L3e5
        L417:
            long r12 = r15.f17460a
            r11.f14267q = r12
            r14 = 0
            goto L441
        L41e:
            long r13 = r7.a(r12, r10)
            long r13 = r13 & r18
            int r8 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r8 == 0) goto L448
            r12.a()
            r8 = 0
            long r13 = v0.v.f(r12, r8)
            r2.f14267q = r13
            boolean r8 = r12.b()
            if (r8 == 0) goto L43d
            r6 = r1
            r8 = r4
            r4 = r12
            goto L361
        L43d:
            r14 = 0
            r7.f4572r = r14
        L441:
            r24 = r9
            r9 = r22
            r12 = 2
            goto L388
        L448:
            r14 = 0
            r0.f18057A = r1
            r0.f18065r = r4
            r0.f18066s = r6
            r0.f18067t = r2
            r0.f18068u = r11
            r0.f18069v = r7
            r0.f18070w = r12
            r0.f18072y = r10
            r8 = 7
            r0.f18073z = r8
            java.lang.Object r8 = r6.a(r3, r0)
            if (r8 != r5) goto L465
            goto L500
        L465:
            r8 = r10
            r10 = r6
            r6 = r12
        L468:
            boolean r6 = r6.b()
            if (r6 == 0) goto L477
            r6 = r1
            r8 = r4
            r4 = 0
        L471:
            r24 = r9
            r9 = r22
            goto L2b9
        L477:
            r24 = r9
            r6 = r10
            r9 = r22
            r12 = 2
            r10 = r8
            goto L388
        L480:
            r22 = r9
            r9 = r24
            r14 = 0
            int r8 = r8 + 1
            r9 = r22
            goto L32e
        L48c:
            r8 = r4
            r4 = r1
            goto L2b9
        L490:
            r22 = r9
            r9 = r24
            r14 = 0
            int r7 = r7 + 1
            r9 = r22
            goto L2c9
        L49c:
            r22 = r9
            r9 = r24
            if (r4 == 0) goto L5c6
            r1 = r20
            long r2 = r1.f14267q
            i0.b r7 = new i0.b
            r7.<init>(r2)
            F.p r2 = r0.f18061E
            r2.invoke(r8, r4, r7)
            long r1 = r1.f14267q
            B0.j0 r3 = r0.f18062F
            java.lang.Object r7 = r3.f450r
            O3.l r7 = (O3.C0299l) r7
            com.google.android.gms.internal.measurement.P1.d(r7, r4)
            java.lang.Object r7 = r3.f451s
            w.C r7 = (w.C) r7
            O5.e r7 = r7.f17748K
            if (r7 == 0) goto L4cb
            w.p r8 = new w.p
            r8.<init>(r1)
            r7.j(r8)
        L4cb:
            long r1 = r4.f17460a
            v0.A r4 = r6.f17509v
            v0.f r4 = r4.f17429I
            boolean r4 = w.AbstractC1810u.a(r4, r1)
            if (r4 == 0) goto L4da
            r15 = 0
            goto L59f
        L4da:
            kotlin.jvm.internal.x r4 = new kotlin.jvm.internal.x
            r4.<init>()
            r4.f14267q = r1
            r1 = r4
            r2 = r6
            r7 = r2
            r6 = r3
            r3 = r22
        L4e7:
            r0.f18057A = r7
            r0.f18065r = r6
            r0.f18066s = r3
            r0.f18067t = r2
            r0.f18068u = r1
            r15 = 0
            r0.f18069v = r15
            r0.f18070w = r15
            r4 = 8
            r0.f18073z = r4
            java.lang.Object r4 = r2.a(r9, r0)
            if (r4 != r5) goto L501
        L500:
            return r5
        L501:
            v0.f r4 = (v0.C1737f) r4
            java.lang.Object r8 = r4.f17451a
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
        L50d:
            if (r11 >= r10) goto L52c
            java.lang.Object r12 = r8.get(r11)
            r13 = r12
            v0.l r13 = (v0.C1743l) r13
            long r13 = r13.f17460a
            r16 = r7
            r17 = r8
            long r7 = r1.f14267q
            boolean r7 = v0.v.d(r13, r7)
            if (r7 == 0) goto L525
            goto L52f
        L525:
            int r11 = r11 + 1
            r7 = r16
            r8 = r17
            goto L50d
        L52c:
            r16 = r7
            r12 = r15
        L52f:
            r7 = r12
            v0.l r7 = (v0.C1743l) r7
            if (r7 != 0) goto L537
            r7 = r15
        L535:
            r11 = 1
            goto L58e
        L537:
            boolean r8 = v0.v.c(r7)
            if (r8 == 0) goto L564
            java.lang.Object r4 = r4.f17451a
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r10 = 0
        L547:
            if (r10 >= r8) goto L558
            java.lang.Object r11 = r4.get(r10)
            r12 = r11
            v0.l r12 = (v0.C1743l) r12
            boolean r12 = r12.f17463d
            if (r12 == 0) goto L555
            goto L559
        L555:
            int r10 = r10 + 1
            goto L547
        L558:
            r11 = r15
        L559:
            v0.l r11 = (v0.C1743l) r11
            if (r11 != 0) goto L55e
            goto L535
        L55e:
            long r7 = r11.f17460a
            r1.f14267q = r7
            r11 = 1
            goto L58a
        L564:
            r11 = 1
            long r12 = v0.v.f(r7, r11)
            if (r3 != 0) goto L570
            float r4 = i0.C1130b.c(r12)
            goto L585
        L570:
            w.d0 r4 = w.EnumC1778d0.f17945q
            if (r3 != r4) goto L581
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r17
        L57b:
            int r4 = (int) r12
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L585
        L581:
            r4 = 32
            long r12 = r12 >> r4
            goto L57b
        L585:
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L58e
        L58a:
            r7 = r16
            goto L4e7
        L58e:
            if (r7 != 0) goto L591
            goto L59f
        L591:
            boolean r1 = r7.b()
            if (r1 == 0) goto L598
            goto L59f
        L598:
            boolean r1 = v0.v.c(r7)
            if (r1 == 0) goto L5ad
            r15 = r7
        L59f:
            if (r15 != 0) goto L5a7
            w.w r1 = r0.f18063G
            r1.invoke()
            goto L5c6
        L5a7:
            A.J r1 = r0.f18064H
            r1.invoke(r15)
            goto L5c6
        L5ad:
            r8 = 0
            long r1 = v0.v.f(r7, r8)
            i0.b r4 = new i0.b
            r4.<init>(r1)
            r6.invoke(r7, r4)
            r7.a()
            long r1 = r7.f17460a
            r22 = r3
            r3 = r6
            r6 = r16
            goto L4da
        L5c6:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1808t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
