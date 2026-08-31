package A;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f92q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f93r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, int i7, Object obj) {
        super(2);
        this.f92q = i7;
        this.f93r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v24, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0328 A[PHI: r4
  0x0328: PHI (r4v17 M.J0) = (r4v15 M.J0), (r4v16 M.J0) binds: [B:173:0x0326, B:176:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARN: Type inference failed for: r0v81, types: [B5.f, java.lang.Object, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v53, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v24, types: [B5.e, kotlin.jvm.internal.n] */
    @Override // B5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            int r2 = r1.f92q
            switch(r2) {
                case 0: goto L3d4;
                case 1: goto L3ba;
                case 2: goto L394;
                case 3: goto L36b;
                case 4: goto L351;
                case 5: goto L339;
                case 6: goto L2da;
                case 7: goto L2b1;
                case 8: goto L28f;
                case 9: goto L1de;
                case 10: goto L14c;
                case 11: goto L10a;
                case 12: goto La2;
                case 13: goto L76;
                case 14: goto L62;
                case 15: goto L44;
                case 16: goto L2c;
                default: goto L9;
            }
        L9:
            r2 = r20
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r3 = r1.f93r
            w.z0 r3 = (w.C1821z0) r3
            M5.w r4 = r3.l0()
            w.x0 r5 = new w.x0
            r6 = 0
            r5.<init>(r3, r2, r0, r6)
            r0 = 3
            M5.AbstractC0263y.t(r4, r6, r6, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2c:
            r2 = r20
            P.o r2 = (P.C0371o) r2
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            java.lang.Object r0 = r1.f93r
            u.H r0 = (u.C1629H) r0
            r3 = 1
            int r3 = P.C0345b.w(r3)
            r0.a(r3, r2)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L44:
            r2 = r20
            t.t r2 = (t.t) r2
            t.t r0 = (t.t) r0
            t.t r3 = t.t.f16639s
            if (r2 != r3) goto L5c
            if (r0 != r3) goto L5c
            java.lang.Object r0 = r1.f93r
            t.E r0 = (t.C1596E) r0
            t.L r0 = r0.f16582a
            boolean r0 = r0.f16591b
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L62:
            r2 = r20
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            I0.m r0 = (I0.m) r0
            java.lang.Object r3 = r1.f93r
            e0.c r3 = (e0.ViewOnAttachStateChangeListenerC1018c) r3
            r3.m(r2, r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L76:
            r2 = r20
            c0.m r2 = (c0.InterfaceC0725m) r2
            c0.k r0 = (c0.InterfaceC0723k) r0
            java.lang.Object r3 = r1.f93r
            P.o r3 = (P.C0371o) r3
            boolean r4 = r0 instanceof c0.C0720h
            if (r4 == 0) goto L9d
            c0.h r0 = (c0.C0720h) r0
            kotlin.jvm.internal.n r0 = r0.f10093q
            r4 = 3
            kotlin.jvm.internal.B.b(r4, r0)
            c0.j r4 = c0.C0722j.f10095q
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.invoke(r4, r3, r5)
            c0.m r0 = (c0.InterfaceC0725m) r0
            c0.m r0 = c0.AbstractC0727o.b(r3, r0)
        L9d:
            c0.m r0 = r2.d(r0)
            return r0
        La2:
            r2 = r20
            java.util.Set r2 = (java.util.Set) r2
            a0.h r0 = (a0.AbstractC0606h) r0
            java.lang.Object r0 = r1.f93r
            a0.t r0 = (a0.t) r0
            java.util.concurrent.atomic.AtomicReference r3 = r0.f8701b
        Lae:
            java.lang.Object r4 = r3.get()
            if (r4 != 0) goto Lb8
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            goto Ldd
        Lb8:
            boolean r5 = r4 instanceof java.util.Set
            if (r5 == 0) goto Lcc
            r5 = 2
            java.util.Set[] r5 = new java.util.Set[r5]
            r6 = 0
            r5[r6] = r4
            r6 = 1
            r5[r6] = r2
            java.util.List r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.A(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            goto Ldd
        Lcc:
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto Lff
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r6 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r2)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = n5.l.u0(r5, r6)
        Ldd:
            boolean r6 = r3.compareAndSet(r4, r5)
            if (r6 == 0) goto Lf8
            boolean r2 = a0.t.a(r0)
            if (r2 == 0) goto Lf5
            kotlin.jvm.internal.n r2 = r0.f8700a
            A0.d r3 = new A0.d
            r4 = 17
            r3.<init>(r4, r0)
            r2.invoke(r3)
        Lf5:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        Lf8:
            java.lang.Object r6 = r3.get()
            if (r6 == r4) goto Ldd
            goto Lae
        Lff:
            java.lang.String r0 = "Unexpected notification"
            P.AbstractC0373p.d(r0)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L10a:
            r2 = r20
            Z.b r2 = (Z.b) r2
            java.lang.Object r3 = r1.f93r
            kotlin.jvm.internal.n r3 = (kotlin.jvm.internal.n) r3
            java.lang.Object r0 = r3.invoke(r2, r0)
            java.util.List r0 = (java.util.List) r0
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r4 = r3.size()
            r5 = 0
        L120:
            if (r5 >= r4) goto L13e
            java.lang.Object r6 = r0.get(r5)
            if (r6 == 0) goto L13b
            Z.i r7 = r2.f8287r
            if (r7 == 0) goto L13b
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L133
            goto L13b
        L133:
            java.lang.String r0 = "item can't be saved"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            throw r2
        L13b:
            int r5 = r5 + 1
            goto L120
        L13e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L14a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            goto L14b
        L14a:
            r0 = 0
        L14b:
            return r0
        L14c:
            r2 = r20
            java.util.Set r2 = (java.util.Set) r2
            a0.h r0 = (a0.AbstractC0606h) r0
            boolean r0 = r2 instanceof R.h
            r3 = 4
            if (r0 == 0) goto L1a9
            r0 = r2
            R.h r0 = (R.h) r0
            r.H r0 = r0.f6689q
            java.lang.Object[] r4 = r0.f16139b
            long[] r0 = r0.f16138a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1db
            r6 = 0
            r7 = r6
        L167:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L1a4
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L181:
            if (r12 >= r10) goto L1a2
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L19e
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof a0.v
            if (r14 == 0) goto L1d4
            a0.v r13 = (a0.v) r13
            boolean r13 = r13.b(r3)
            if (r13 == 0) goto L19e
            goto L1d4
        L19e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L181
        L1a2:
            if (r10 != r11) goto L1db
        L1a4:
            if (r7 == r5) goto L1db
            int r7 = r7 + 1
            goto L167
        L1a9:
            r0 = r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L1ba
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1ba
            goto L1db
        L1ba:
            java.util.Iterator r0 = r0.iterator()
        L1be:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1db
            java.lang.Object r4 = r0.next()
            boolean r5 = r4 instanceof a0.v
            if (r5 == 0) goto L1d4
            a0.v r4 = (a0.v) r4
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L1be
        L1d4:
            java.lang.Object r0 = r1.f93r
            O5.e r0 = (O5.e) r0
            r0.j(r2)
        L1db:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L1de:
            r2 = r20
            java.util.Set r2 = (java.util.Set) r2
            a0.h r0 = (a0.AbstractC0606h) r0
            java.lang.Object r0 = r1.f93r
            P.v0 r0 = (P.C0385v0) r0
            java.lang.Object r3 = r0.f5555b
            monitor-enter(r3)
            P5.S r4 = r0.f5570t     // Catch: java.lang.Throwable -> L248
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L248
            P.p0 r4 = (P.EnumC0374p0) r4     // Catch: java.lang.Throwable -> L248
            P.p0 r5 = P.EnumC0374p0.f5494u     // Catch: java.lang.Throwable -> L248
            int r4 = r4.compareTo(r5)     // Catch: java.lang.Throwable -> L248
            if (r4 < 0) goto L27f
            r.H r4 = r0.f5559g     // Catch: java.lang.Throwable -> L248
            boolean r5 = r2 instanceof R.h     // Catch: java.lang.Throwable -> L248
            r6 = 1
            if (r5 == 0) goto L258
            R.h r2 = (R.h) r2     // Catch: java.lang.Throwable -> L248
            r.H r2 = r2.f6689q     // Catch: java.lang.Throwable -> L248
            java.lang.Object[] r5 = r2.f16139b     // Catch: java.lang.Throwable -> L248
            long[] r2 = r2.f16138a     // Catch: java.lang.Throwable -> L248
            int r7 = r2.length     // Catch: java.lang.Throwable -> L248
            int r7 = r7 + (-2)
            if (r7 < 0) goto L27a
            r9 = 0
        L210:
            r10 = r2[r9]     // Catch: java.lang.Throwable -> L248
            long r12 = ~r10     // Catch: java.lang.Throwable -> L248
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L253
            int r12 = r9 - r7
            int r12 = ~r12     // Catch: java.lang.Throwable -> L248
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L22a:
            if (r14 >= r12) goto L251
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L24d
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]     // Catch: java.lang.Throwable -> L248
            boolean r8 = r15 instanceof a0.v     // Catch: java.lang.Throwable -> L248
            if (r8 == 0) goto L24a
            r8 = r15
            a0.v r8 = (a0.v) r8     // Catch: java.lang.Throwable -> L248
            boolean r8 = r8.b(r6)     // Catch: java.lang.Throwable -> L248
            if (r8 != 0) goto L24a
            goto L24d
        L248:
            r0 = move-exception
            goto L28d
        L24a:
            r4.a(r15)     // Catch: java.lang.Throwable -> L248
        L24d:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L22a
        L251:
            if (r12 != r13) goto L27a
        L253:
            if (r9 == r7) goto L27a
            int r9 = r9 + 1
            goto L210
        L258:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L248
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L248
        L25e:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L248
            if (r5 == 0) goto L27a
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L248
            boolean r7 = r5 instanceof a0.v     // Catch: java.lang.Throwable -> L248
            if (r7 == 0) goto L276
            r7 = r5
            a0.v r7 = (a0.v) r7     // Catch: java.lang.Throwable -> L248
            boolean r7 = r7.b(r6)     // Catch: java.lang.Throwable -> L248
            if (r7 != 0) goto L276
            goto L25e
        L276:
            r4.a(r5)     // Catch: java.lang.Throwable -> L248
            goto L25e
        L27a:
            M5.f r0 = r0.u()     // Catch: java.lang.Throwable -> L248
            goto L280
        L27f:
            r0 = 0
        L280:
            monitor-exit(r3)
            if (r0 == 0) goto L28a
            m5.y r2 = m5.C1386y.f15098a
            M5.h r0 = (M5.C0247h) r0
            r0.resumeWith(r2)
        L28a:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L28d:
            monitor-exit(r3)
            throw r0
        L28f:
            r2 = r20
            P.o r2 = (P.C0371o) r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = r0 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L2a1
            r3 = r5
            goto L2a2
        L2a1:
            r3 = 0
        L2a2:
            r0 = r0 & r5
            boolean r0 = r2.K(r0, r3)
            if (r0 != 0) goto L2af
            r2.N()
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L2af:
            r0 = 0
            throw r0
        L2b1:
            r2 = r20
            P.o r2 = (P.C0371o) r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r0 = r0 & 3
            r3 = 2
            if (r0 != r3) goto L2cb
            boolean r0 = r2.x()
            if (r0 != 0) goto L2c7
            goto L2cb
        L2c7:
            r2.N()
            goto L2d7
        L2cb:
            java.lang.Object r0 = r1.f93r
            B5.e r0 = (B5.e) r0
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.invoke(r2, r3)
        L2d7:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L2da:
            r2 = r20
            W0.k r2 = (W0.k) r2
            long r2 = r2.f8021a
            W0.a r0 = (W0.a) r0
            long r4 = r0.f8007a
            M.J0 r0 = M.J0.f3323q
            int r4 = W0.a.g(r4)
            float r4 = (float) r4
            M.Z r5 = new M.Z
            java.lang.Object r6 = r1.f93r
            M.I0 r6 = (M.I0) r6
            r5.<init>(r4, r2, r6)
            N.y r2 = new N.y
            N.t r3 = new N.t
            r3.<init>()
            r5.invoke(r3)
            java.util.LinkedHashMap r3 = r3.f3980a
            r2.<init>(r3)
            N.r r4 = r6.f3322c
            P.C r4 = r4.f3974h
            java.lang.Object r4 = r4.getValue()
            M.J0 r4 = (M.J0) r4
            int r4 = r4.ordinal()
            if (r4 == 0) goto L333
            r5 = 1
            if (r4 == r5) goto L320
            r5 = 2
            if (r4 != r5) goto L31a
            goto L320
        L31a:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L320:
            M.J0 r4 = M.J0.f3325s
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L32a
        L328:
            r0 = r4
            goto L333
        L32a:
            M.J0 r4 = M.J0.f3324r
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L333
            goto L328
        L333:
            m5.j r3 = new m5.j
            r3.<init>(r2, r0)
            return r3
        L339:
            r2 = r20
            P.o r2 = (P.C0371o) r2
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            java.lang.Object r0 = r1.f93r
            M.K r0 = (M.K) r0
            r3 = 1
            int r3 = P.C0345b.w(r3)
            r0.a(r3, r2)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L351:
            r2 = r20
            w.i0 r2 = (w.InterfaceC1788i0) r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r1.f93r
            F.N r2 = (F.N) r2
            int r0 = r2.i(r0)
            P.c0 r2 = r2.f1833s
            r2.f(r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L36b:
            r2 = r20
            P.o r2 = (P.C0371o) r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = r0 & 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L37e
            r3 = r6
            goto L37f
        L37e:
            r3 = r5
        L37f:
            r0 = r0 & r6
            boolean r0 = r2.K(r0, r3)
            if (r0 == 0) goto L38e
            java.lang.Object r0 = r1.f93r
            C0.a r0 = (C0.AbstractC0065a) r0
            r0.a(r5, r2)
            goto L391
        L38e:
            r2.N()
        L391:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L394:
            r2 = r20
            W0.k r2 = (W0.k) r2
            long r2 = r2.f8021a
            W0.l r0 = (W0.l) r0
            java.lang.Object r4 = r1.f93r
            c0.c r4 = (c0.C0715c) r4
            r5 = 32
            long r2 = r2 >> r5
            int r2 = (int) r2
            r3 = 0
            int r0 = r4.a(r3, r2, r0)
            long r6 = (long) r0
            long r4 = r6 << r5
            long r2 = (long) r3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            W0.i r0 = new W0.i
            r0.<init>(r2)
            return r0
        L3ba:
            r2 = r20
            W0.k r2 = (W0.k) r2
            long r6 = r2.f8021a
            r8 = r0
            W0.l r8 = (W0.l) r8
            java.lang.Object r0 = r1.f93r
            r3 = r0
            c0.e r3 = (c0.C0717e) r3
            r4 = 0
            long r2 = r3.a(r4, r6, r8)
            W0.i r0 = new W0.i
            r0.<init>(r2)
            return r0
        L3d4:
            r2 = r20
            W0.k r2 = (W0.k) r2
            long r2 = r2.f8021a
            W0.l r0 = (W0.l) r0
            java.lang.Object r0 = r1.f93r
            c0.d r0 = (c0.C0716d) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            r3 = 0
            int r0 = r0.a(r3, r2)
            long r2 = (long) r3
            r6 = 32
            long r2 = r2 << r6
            long r6 = (long) r0
            long r4 = r4 & r6
            long r2 = r2 | r4
            W0.i r0 = new W0.i
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, Object obj) {
        super(2);
        this.f92q = i;
        this.f93r = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(B5.e eVar) {
        super(2);
        this.f92q = 11;
        this.f93r = (kotlin.jvm.internal.n) eVar;
    }
}
