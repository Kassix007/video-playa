package w;

import B0.AbstractC0049n;
import F.C0156j;
import v0.C1731A;
import v0.C1737f;
import v0.EnumC1738g;
import y.C1903a;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends AbstractC0049n implements B0.y0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EnumC1778d0 f17744G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public kotlin.jvm.internal.n f17745H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f17746I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public y.i f17747J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public O5.e f17748K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public y.b f17749L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f17750M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1731A f17751N;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public C(B5.c cVar, boolean z5, y.i iVar, EnumC1778d0 enumC1778d0) {
        this.f17744G = enumC1778d0;
        this.f17745H = (kotlin.jvm.internal.n) cVar;
        this.f17746I = z5;
        this.f17747J = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0(w.C r4, s5.c r5) {
        /*
            boolean r0 = r5 instanceof w.C1816x
            if (r0 == 0) goto L13
            r0 = r5
            w.x r0 = (w.C1816x) r0
            int r1 = r0.f18100t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18100t = r1
            goto L18
        L13:
            w.x r0 = new w.x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f18098r
            int r1 = r0.f18100t
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            w.C r4 = r0.f18097q
            m5.AbstractC1362a.e(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            m5.AbstractC1362a.e(r5)
            y.b r5 = r4.f17749L
            if (r5 == 0) goto L4f
            y.i r1 = r4.f17747J
            if (r1 == 0) goto L4c
            y.a r3 = new y.a
            r3.<init>(r5)
            r0.f18097q = r4
            r0.f18100t = r2
            java.lang.Object r5 = r1.a(r3, r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r5 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r4.f17749L = r5
        L4f:
            r0 = 0
            r4.G0(r0)
            m5.y r4 = m5.C1386y.f15098a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C.A0(w.C, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B0(w.C r6, w.C1803q r7, s5.c r8) {
        /*
            boolean r0 = r8 instanceof w.C1818y
            if (r0 == 0) goto L13
            r0 = r8
            w.y r0 = (w.C1818y) r0
            int r1 = r0.f18110v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18110v = r1
            goto L18
        L13:
            w.y r0 = new w.y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f18108t
            int r1 = r0.f18110v
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            y.b r6 = r0.f18107s
            w.q r7 = r0.f18106r
            w.C r0 = r0.f18105q
            m5.AbstractC1362a.e(r8)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            w.q r7 = r0.f18106r
            w.C r6 = r0.f18105q
            m5.AbstractC1362a.e(r8)
            goto L5d
        L40:
            m5.AbstractC1362a.e(r8)
            y.b r8 = r6.f17749L
            if (r8 == 0) goto L5d
            y.i r1 = r6.f17747J
            if (r1 == 0) goto L5d
            y.a r5 = new y.a
            r5.<init>(r8)
            r0.f18105q = r6
            r0.f18106r = r7
            r0.f18110v = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L5d
            goto L74
        L5d:
            y.b r8 = new y.b
            r8.<init>()
            y.i r1 = r6.f17747J
            if (r1 == 0) goto L79
            r0.f18105q = r6
            r0.f18106r = r7
            r0.f18107s = r8
            r0.f18110v = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L75
        L74:
            return r4
        L75:
            r0 = r6
            r6 = r8
        L77:
            r8 = r6
            r6 = r0
        L79:
            r6.f17749L = r8
            long r7 = r7.f18045a
            r6.F0(r7)
            m5.y r6 = m5.C1386y.f15098a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C.B0(w.C, w.q, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C0(w.C r4, w.r r5, s5.c r6) {
        /*
            boolean r0 = r6 instanceof w.C1820z
            if (r0 == 0) goto L13
            r0 = r6
            w.z r0 = (w.C1820z) r0
            int r1 = r0.f18118u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18118u = r1
            goto L18
        L13:
            w.z r0 = new w.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18116s
            int r1 = r0.f18118u
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            w.r r5 = r0.f18115r
            w.C r4 = r0.f18114q
            m5.AbstractC1362a.e(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            m5.AbstractC1362a.e(r6)
            y.b r6 = r4.f17749L
            if (r6 == 0) goto L53
            y.i r1 = r4.f17747J
            if (r1 == 0) goto L50
            y.c r3 = new y.c
            r3.<init>(r6)
            r0.f18114q = r4
            r0.f18115r = r5
            r0.f18118u = r2
            java.lang.Object r6 = r1.a(r3, r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r6 != r0) goto L50
            return r0
        L50:
            r6 = 0
            r4.f17749L = r6
        L53:
            long r5 = r5.f18050a
            r4.G0(r5)
            m5.y r4 = m5.C1386y.f15098a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C.C0(w.C, w.r, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D0() {
        y.b bVar = this.f17749L;
        if (bVar != null) {
            y.i iVar = this.f17747J;
            if (iVar != null) {
                iVar.b(new C1903a(bVar));
            }
            this.f17749L = null;
        }
    }

    public abstract Object E0(C1769A c1769a, C1770B c1770b);

    public abstract void F0(long j);

    public abstract void G0(long j);

    public abstract boolean H0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(B5.c cVar, boolean z5, y.i iVar, EnumC1778d0 enumC1778d0, boolean z6) {
        C1731A c1731a;
        this.f17745H = (kotlin.jvm.internal.n) cVar;
        boolean z7 = true;
        if (this.f17746I != z5) {
            this.f17746I = z5;
            if (!z5) {
                D0();
                C1731A c1731a2 = this.f17751N;
                if (c1731a2 != null) {
                    y0(c1731a2);
                }
                this.f17751N = null;
            }
            z6 = true;
        }
        if (!kotlin.jvm.internal.m.a(this.f17747J, iVar)) {
            D0();
            this.f17747J = iVar;
        }
        if (this.f17744G != enumC1778d0) {
            this.f17744G = enumC1778d0;
        } else {
            z7 = z6;
        }
        if (!z7 || (c1731a = this.f17751N) == null) {
            return;
        }
        c1731a.y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void U() {
        C1731A c1731a = this.f17751N;
        if (c1731a != null) {
            c1731a.U();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        this.f17750M = false;
        D0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public void t(C1737f c1737f, EnumC1738g enumC1738g, long j) {
        if (this.f17746I && this.f17751N == null) {
            C0156j c0156j = new C0156j(4, this);
            C1737f c1737f2 = v0.u.f17495a;
            C1731A c1731a = new C1731A(null, null, c0156j);
            x0(c1731a);
            this.f17751N = c1731a;
        }
        C1731A c1731a2 = this.f17751N;
        if (c1731a2 != null) {
            c1731a2.t(c1737f, enumC1738g, j);
        }
    }
}
