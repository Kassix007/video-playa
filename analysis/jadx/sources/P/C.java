package P;

import a0.AbstractC0606h;

/* JADX INFO: loaded from: classes.dex */
public final class C extends a0.v implements S0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B5.a f5283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final I0 f5284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B f5285t = new B(a0.n.k().g());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C(B5.a aVar, I0 i02) {
        this.f5283r = aVar;
        this.f5284s = i02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w d() {
        return this.f5285t;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, IGET, CONST]}, finally: {[IGET, IGET, CONST, AGET, CHECK_CAST, INVOKE, ARITH, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P.B e(P.B r22, a0.AbstractC0606h r23, boolean r24, B5.a r25) {
        /*
            r21 = this;
            r1 = r21
            r6 = r22
            r0 = r23
            boolean r2 = r6.c(r1, r0)
            if (r2 == 0) goto Lc9
            if (r24 == 0) goto Lc8
            R.e r2 = P.C0345b.l()
            java.lang.Object[] r3 = r2.f6676q
            int r4 = r2.f6678s
            r5 = 0
        L17:
            if (r5 >= r4) goto L23
            r8 = r3[r5]
            P.n r8 = (P.C0369n) r8
            r8.b()
            int r5 = r5 + 1
            goto L17
        L23:
            r.B r3 = r6.f5278e     // Catch: java.lang.Throwable -> L38
            B0.G0 r4 = P.J0.f5322a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r4.s()     // Catch: java.lang.Throwable -> L38
            X.f r5 = (X.f) r5     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L3b
            X.f r5 = new X.f     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            r4.T(r5)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto Lb6
        L3b:
            int r4 = r5.f8141a     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r8 = r3.f16110b     // Catch: java.lang.Throwable -> L38
            int[] r9 = r3.f16111c     // Catch: java.lang.Throwable -> L38
            long[] r3 = r3.f16109a     // Catch: java.lang.Throwable -> L38
            int r10 = r3.length     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + (-2)
            if (r10 < 0) goto La3
            r11 = 0
        L49:
            r12 = r3[r11]     // Catch: java.lang.Throwable -> L38
            long r14 = ~r12     // Catch: java.lang.Throwable -> L38
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L9c
            int r14 = r11 - r10
            int r14 = ~r14     // Catch: java.lang.Throwable -> L38
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r7 = 0
        L66:
            if (r7 >= r14) goto L99
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L8e
            int r17 = r11 << 3
            int r17 = r17 + r7
            r18 = r8[r17]     // Catch: java.lang.Throwable -> L38
            r17 = r9[r17]     // Catch: java.lang.Throwable -> L38
            r24 = r15
            r15 = r18
            a0.u r15 = (a0.u) r15     // Catch: java.lang.Throwable -> L38
            int r0 = r4 + r17
            r5.f8141a = r0     // Catch: java.lang.Throwable -> L38
            B5.c r0 = r23.e()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L90
            r0.invoke(r15)     // Catch: java.lang.Throwable -> L38
            goto L90
        L8e:
            r24 = r15
        L90:
            long r12 = r12 >> r24
            int r7 = r7 + 1
            r0 = r23
            r15 = r24
            goto L66
        L99:
            r0 = r15
            if (r14 != r0) goto La3
        L9c:
            if (r11 == r10) goto La3
            int r11 = r11 + 1
            r0 = r23
            goto L49
        La3:
            r5.f8141a = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = r2.f6676q
            int r2 = r2.f6678s
            r7 = 0
        Laa:
            if (r7 >= r2) goto Lc8
            r3 = r0[r7]
            P.n r3 = (P.C0369n) r3
            r3.a()
            int r7 = r7 + 1
            goto Laa
        Lb6:
            java.lang.Object[] r3 = r2.f6676q
            int r2 = r2.f6678s
            r7 = 0
        Lbb:
            if (r7 >= r2) goto Lc7
            r4 = r3[r7]
            P.n r4 = (P.C0369n) r4
            r4.a()
            int r7 = r7 + 1
            goto Lbb
        Lc7:
            throw r0
        Lc8:
            return r6
        Lc9:
            r.B r3 = new r.B
            r3.<init>()
            B0.G0 r0 = P.J0.f5322a
            java.lang.Object r2 = r0.s()
            X.f r2 = (X.f) r2
            if (r2 != 0) goto Le0
            X.f r2 = new X.f
            r2.<init>()
            r0.T(r2)
        Le0:
            int r4 = r2.f8141a
            R.e r7 = P.C0345b.l()
            java.lang.Object[] r0 = r7.f6676q
            int r5 = r7.f6678s
            r8 = 0
        Leb:
            if (r8 >= r5) goto Lf7
            r9 = r0[r8]
            P.n r9 = (P.C0369n) r9
            r9.b()
            int r8 = r8 + 1
            goto Leb
        Lf7:
            int r0 = r4 + 1
            r2.f8141a = r0     // Catch: java.lang.Throwable -> L18e
            A.P r0 = new A.P     // Catch: java.lang.Throwable -> L18e
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L18e
            r5 = r25
            java.lang.Object r0 = a0.r.e(r0, r5)     // Catch: java.lang.Throwable -> L18e
            r2.f8141a = r4     // Catch: java.lang.Throwable -> L18e
            java.lang.Object[] r2 = r7.f6676q
            int r4 = r7.f6678s
            r7 = 0
        L10e:
            if (r7 >= r4) goto L11a
            r5 = r2[r7]
            P.n r5 = (P.C0369n) r5
            r5.a()
            int r7 = r7 + 1
            goto L10e
        L11a:
            java.lang.Object r2 = a0.n.f8680b
            monitor-enter(r2)
            a0.h r4 = a0.n.k()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r5 = r6.f     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r7 = P.B.f5275h     // Catch: java.lang.Throwable -> L13c
            if (r5 == r7) goto L13e
            P.I0 r7 = r1.f5284s     // Catch: java.lang.Throwable -> L13c
            if (r7 == 0) goto L13e
            boolean r5 = r7.a(r0, r5)     // Catch: java.lang.Throwable -> L13c
            r7 = 1
            if (r5 != r7) goto L13e
            r6.f5278e = r3     // Catch: java.lang.Throwable -> L13c
            int r0 = r6.d(r1, r4)     // Catch: java.lang.Throwable -> L13c
            r6.f5279g = r0     // Catch: java.lang.Throwable -> L13c
            r5 = r6
            goto L15c
        L13c:
            r0 = move-exception
            goto L18c
        L13e:
            P.B r5 = r1.f5285t     // Catch: java.lang.Throwable -> L13c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L13c
            a0.w r6 = a0.n.m(r5, r1)     // Catch: java.lang.Throwable -> L189
            r6.a(r5)     // Catch: java.lang.Throwable -> L189
            long r7 = r4.g()     // Catch: java.lang.Throwable -> L189
            r6.f8708a = r7     // Catch: java.lang.Throwable -> L189
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13c
            r5 = r6
            P.B r5 = (P.B) r5     // Catch: java.lang.Throwable -> L13c
            r5.f5278e = r3     // Catch: java.lang.Throwable -> L13c
            int r3 = r5.d(r1, r4)     // Catch: java.lang.Throwable -> L13c
            r5.f5279g = r3     // Catch: java.lang.Throwable -> L13c
            r5.f = r0     // Catch: java.lang.Throwable -> L13c
        L15c:
            monitor-exit(r2)
            B0.G0 r0 = P.J0.f5322a
            java.lang.Object r0 = r0.s()
            X.f r0 = (X.f) r0
            if (r0 == 0) goto L188
            int r0 = r0.f8141a
            if (r0 != 0) goto L188
            a0.h r0 = a0.n.k()
            r0.m()
            monitor-enter(r2)
            a0.h r0 = a0.n.k()     // Catch: java.lang.Throwable -> L185
            long r3 = r0.g()     // Catch: java.lang.Throwable -> L185
            r5.f5276c = r3     // Catch: java.lang.Throwable -> L185
            int r0 = r0.h()     // Catch: java.lang.Throwable -> L185
            r5.f5277d = r0     // Catch: java.lang.Throwable -> L185
            monitor-exit(r2)
            return r5
        L185:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L188:
            return r5
        L189:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> L13c
        L18c:
            monitor-exit(r2)
            throw r0
        L18e:
            r0 = move-exception
            java.lang.Object[] r2 = r7.f6676q
            int r3 = r7.f6678s
            r7 = 0
        L194:
            if (r7 >= r3) goto L1a0
            r4 = r2[r7]
            P.n r4 = (P.C0369n) r4
            r4.a()
            int r7 = r7 + 1
            goto L194
        L1a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C.e(P.B, a0.h, boolean, B5.a):P.B");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B f() {
        AbstractC0606h abstractC0606hK = a0.n.k();
        return e((B) a0.n.j(this.f5285t, abstractC0606hK), abstractC0606hK, false, this.f5283r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        B5.c cVarE = a0.n.k().e();
        if (cVarE != null) {
            cVarE.invoke(this);
        }
        AbstractC0606h abstractC0606hK = a0.n.k();
        return e((B) a0.n.j(this.f5285t, abstractC0606hK), abstractC0606hK, true, this.f5283r).f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f5285t = (B) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        B b7 = (B) a0.n.i(this.f5285t);
        sb.append(b7.c(this, a0.n.k()) ? String.valueOf(b7.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
