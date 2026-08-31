package P5;

/* JADX INFO: renamed from: P5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0395f implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6398q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f6399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f6400s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0395f(C0396g c0396g, kotlin.jvm.internal.y yVar, InterfaceC0398i interfaceC0398i) {
        this.f6400s = yVar;
        this.f6399r = interfaceC0398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, q5.InterfaceC1524c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f6398q
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof P5.C0405p
            if (r0 == 0) goto L18
            r0 = r7
            P5.p r0 = (P5.C0405p) r0
            int r1 = r0.f6426t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f6426t = r1
            goto L1d
        L18:
            P5.p r0 = new P5.p
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f6424r
            int r1 = r0.f6426t
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            P5.f r6 = r0.f6423q
            m5.AbstractC1362a.e(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L2c:
            r7 = move-exception
            goto L4d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            m5.AbstractC1362a.e(r7)
            P5.i r7 = r5.f6399r     // Catch: java.lang.Throwable -> L4b
            r0.f6423q = r5     // Catch: java.lang.Throwable -> L4b
            r0.f6426t = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r7.emit(r6, r0)     // Catch: java.lang.Throwable -> L4b
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L48
            goto L4a
        L48:
            m5.y r7 = m5.C1386y.f15098a
        L4a:
            return r7
        L4b:
            r7 = move-exception
            r6 = r5
        L4d:
            kotlin.jvm.internal.y r6 = r6.f6400s
            r6.f14268q = r7
            throw r7
        L52:
            boolean r0 = r7 instanceof P5.C0394e
            if (r0 == 0) goto L65
            r0 = r7
            P5.e r0 = (P5.C0394e) r0
            int r1 = r0.f6397s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f6397s = r1
            goto L6a
        L65:
            P5.e r0 = new P5.e
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.f6395q
            int r1 = r0.f6397s
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L81
            if (r1 != r3) goto L79
            m5.AbstractC1362a.e(r7)
            goto La1
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L81:
            m5.AbstractC1362a.e(r7)
            kotlin.jvm.internal.y r7 = r5.f6400s
            java.lang.Object r1 = r7.f14268q
            E4.f r4 = Q5.AbstractC0423c.f6604b
            if (r1 == r4) goto L92
            boolean r1 = kotlin.jvm.internal.m.a(r1, r6)
            if (r1 != 0) goto La1
        L92:
            r7.f14268q = r6
            r0.f6397s = r3
            P5.i r7 = r5.f6399r
            java.lang.Object r6 = r7.emit(r6, r0)
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto La1
            r2 = r7
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0395f.emit(java.lang.Object, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0395f(InterfaceC0398i interfaceC0398i, kotlin.jvm.internal.y yVar) {
        this.f6399r = interfaceC0398i;
        this.f6400s = yVar;
    }
}
