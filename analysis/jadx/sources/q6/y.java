package q6;

/* JADX INFO: loaded from: classes.dex */
public final class y implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1540i f16095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1538g f16096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B f16097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f16100v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(InterfaceC1540i interfaceC1540i) {
        this.f16095q = interfaceC1540i;
        C1538g c1538gW = interfaceC1540i.w();
        this.f16096r = c1538gW;
        B b7 = c1538gW.f16062q;
        this.f16097s = b7;
        this.f16098t = b7 != null ? b7.f16029b : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f16029b) goto L15;
     */
    @Override // q6.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(long r9, q6.C1538g r11) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.m.e(r11, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f16099u
            if (r3 != 0) goto L63
            q6.B r3 = r8.f16097s
            q6.g r4 = r8.f16096r
            if (r3 == 0) goto L2b
            q6.B r5 = r4.f16062q
            if (r3 != r5) goto L23
            int r3 = r8.f16098t
            kotlin.jvm.internal.m.b(r5)
            int r5 = r5.f16029b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f16100v
            r2 = 1
            long r0 = r0 + r2
            q6.i r2 = r8.f16095q
            boolean r0 = r2.o(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            q6.B r0 = r8.f16097s
            if (r0 != 0) goto L4c
            q6.B r0 = r4.f16062q
            if (r0 == 0) goto L4c
            r8.f16097s = r0
            int r0 = r0.f16029b
            r8.f16098t = r0
        L4c:
            long r0 = r4.f16063r
            long r2 = r8.f16100v
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            q6.g r2 = r8.f16096r
            long r4 = r8.f16100v
            r3 = r11
            r2.c(r3, r4, r6)
            long r9 = r8.f16100v
            long r9 = r9 + r6
            r8.f16100v = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r9 = C0.S.k(r11, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.y.F(long, q6.g):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16099u = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f16095q.d();
    }
}
