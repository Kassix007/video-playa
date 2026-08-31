package a0;

import B0.G0;
import E.Y;
import E.a0;
import java.util.HashMap;
import r.C1549H;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G0 f8679a = new G0(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f8680b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f8681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f8682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f8683e;
    public static final Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object f8684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f8685h;
    public static final C0601c i;
    public static final X.a j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        l lVar = l.f8672u;
        f8681c = lVar;
        f8682d = ((long) 1) + 1;
        a0 a0Var = new a0();
        a0Var.f1530c = new long[16];
        a0Var.f1531d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            iArr[i7] = i8;
            i7 = i8;
        }
        a0Var.f1532e = iArr;
        f8683e = a0Var;
        Y y6 = new Y(4, (byte) 0);
        y6.f1520c = new int[16];
        y6.f1521d = new X.n[16];
        f = y6;
        n5.s sVar = n5.s.f15299q;
        f8684g = sVar;
        f8685h = sVar;
        long j7 = f8682d;
        f8682d = 1 + j7;
        C0601c c0601c = new C0601c(j7, lVar, null, C0599a.f8644r);
        f8681c = f8681c.j(c0601c.f8662b);
        i = c0601c;
        j = new X.a(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a() {
        f(C0599a.f8645s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B5.c b(B5.c cVar, B5.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0600b(cVar, cVar2, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashMap c(long j7, C0602d c0602d, l lVar) {
        long[] jArr;
        l lVar2;
        long[] jArr2;
        l lVar3;
        int i7;
        w wVarS;
        long j8 = j7;
        C1549H c1549hX = c0602d.x();
        if (c1549hX != null) {
            l lVarI = c0602d.d().j(c0602d.g()).i(c0602d.j);
            Object[] objArr = c1549hX.f16139b;
            long[] jArr3 = c1549hX.f16138a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                HashMap map = null;
                while (true) {
                    long j9 = jArr3[i8];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j9 & 255) < 128) {
                                u uVar = (u) objArr[(i8 << 3) + i11];
                                w wVarD = uVar.d();
                                jArr2 = jArr3;
                                i7 = i9;
                                w wVarS2 = s(wVarD, j8, lVar);
                                if (wVarS2 == null || (wVarS = s(wVarD, j8, lVarI)) == null || wVarS2.equals(wVarS)) {
                                    lVar3 = lVarI;
                                } else {
                                    lVar3 = lVarI;
                                    w wVarS3 = s(wVarD, c0602d.g(), c0602d.d());
                                    if (wVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    w wVarG = uVar.g(wVarS, wVarS2, wVarS3);
                                    if (wVarG == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(wVarS2, wVarG);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                lVar3 = lVarI;
                                i7 = i9;
                            }
                            j9 >>= i7;
                            i11++;
                            j8 = j7;
                            i9 = i7;
                            jArr3 = jArr2;
                            lVarI = lVar3;
                        }
                        jArr = jArr3;
                        lVar2 = lVarI;
                        if (i10 != i9) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        lVar2 = lVarI;
                    }
                    if (i8 == length) {
                        return map;
                    }
                    i8++;
                    j8 = j7;
                    jArr3 = jArr;
                    lVarI = lVar2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(AbstractC0606h abstractC0606h) {
        long j7;
        if (f8681c.h(abstractC0606h.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC0606h.g());
        sb.append(", disposed=");
        sb.append(abstractC0606h.f8663c);
        sb.append(", applied=");
        C0602d c0602d = abstractC0606h instanceof C0602d ? (C0602d) abstractC0606h : null;
        sb.append(c0602d != null ? Boolean.valueOf(c0602d.f8656m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f8680b) {
            a0 a0Var = f8683e;
            j7 = a0Var.f1528a > 0 ? ((long[]) a0Var.f1530c)[0] : -1L;
        }
        sb.append(j7);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final l e(l lVar, long j7, long j8) {
        while (j7 < j8) {
            lVar = lVar.j(j7);
            j7++;
        }
        return lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(B5.c r15) {
        /*
            a0.c r0 = a0.n.i
            java.lang.Object r1 = a0.n.f8680b
            monitor-enter(r1)
            r.H r2 = r0.f8653h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            X.a r3 = a0.n.j     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L9a
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.lang.Object r4 = a0.n.f8684g     // Catch: java.lang.Throwable -> L39
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L39
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L26:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            B5.e r7 = (B5.e) r7     // Catch: java.lang.Throwable -> L39
            R.h r8 = new R.h     // Catch: java.lang.Throwable -> L39
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L26
        L39:
            r15 = move-exception
            goto L41
        L3b:
            X.a r0 = a0.n.j
            r0.addAndGet(r3)
            goto L47
        L41:
            X.a r0 = a0.n.j
            r0.addAndGet(r3)
            throw r15
        L47:
            java.lang.Object r0 = a0.n.f8680b
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L96
            java.lang.Object[] r3 = r2.f16139b     // Catch: java.lang.Throwable -> L89
            long[] r2 = r2.f16138a     // Catch: java.lang.Throwable -> L89
            int r4 = r2.length     // Catch: java.lang.Throwable -> L89
            int r4 = r4 + (-2)
            if (r4 < 0) goto L96
            r5 = r1
        L59:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L89
            long r8 = ~r6     // Catch: java.lang.Throwable -> L89
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L91
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L89
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L73:
            if (r10 >= r8) goto L8f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L89
            a0.u r11 = (a0.u) r11     // Catch: java.lang.Throwable -> L89
            q(r11)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r15 = move-exception
            goto L98
        L8b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L73
        L8f:
            if (r8 != r9) goto L96
        L91:
            if (r5 == r4) goto L96
            int r5 = r5 + 1
            goto L59
        L96:
            monitor-exit(r0)
            return r15
        L98:
            monitor-exit(r0)
            throw r15
        L9a:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.n.f(B5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g() {
        Y y6 = f;
        int i7 = y6.f1519b;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            X.n nVar = ((X.n[]) y6.f1521d)[i8];
            Object obj = nVar != null ? nVar.get() : null;
            if (obj != null && p((u) obj)) {
                if (i9 != i8) {
                    ((X.n[]) y6.f1521d)[i9] = nVar;
                    int[] iArr = (int[]) y6.f1520c;
                    iArr[i9] = iArr[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < i7; i10++) {
            ((X.n[]) y6.f1521d)[i10] = null;
            ((int[]) y6.f1520c)[i10] = 0;
        }
        if (i9 != i7) {
            y6.f1519b = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0606h h(AbstractC0606h abstractC0606h, B5.c cVar, boolean z5) {
        boolean z6 = abstractC0606h instanceof C0602d;
        if (z6 || abstractC0606h == null) {
            return new z(z6 ? (C0602d) abstractC0606h : null, cVar, null, false, z5);
        }
        return new C0598A(abstractC0606h, cVar, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w i(w wVar) {
        w wVarS;
        AbstractC0606h abstractC0606hK = k();
        w wVarS2 = s(wVar, abstractC0606hK.g(), abstractC0606hK.d());
        if (wVarS2 != null) {
            return wVarS2;
        }
        synchronized (f8680b) {
            AbstractC0606h abstractC0606hK2 = k();
            wVarS = s(wVar, abstractC0606hK2.g(), abstractC0606hK2.d());
        }
        if (wVarS != null) {
            return wVarS;
        }
        r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w j(w wVar, AbstractC0606h abstractC0606h) {
        w wVarS;
        w wVarS2 = s(wVar, abstractC0606h.g(), abstractC0606h.d());
        if (wVarS2 != null) {
            return wVarS2;
        }
        synchronized (f8680b) {
            wVarS = s(wVar, abstractC0606h.g(), abstractC0606h.d());
        }
        if (wVarS != null) {
            return wVarS;
        }
        r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0606h k() {
        AbstractC0606h abstractC0606h = (AbstractC0606h) f8679a.s();
        return abstractC0606h == null ? i : abstractC0606h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B5.c l(B5.c cVar, B5.c cVar2, boolean z5) {
        if (!z5) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0600b(cVar, cVar2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r6 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a0.w m(a0.w r16, a0.u r17) {
        /*
            a0.w r0 = r17.d()
            long r1 = a0.n.f8682d
            E.a0 r3 = a0.n.f8683e
            int r4 = r3.f1528a
            r5 = 0
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f1530c
            long[] r1 = (long[]) r1
            r2 = r1[r5]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r6 = 0
            r7 = r6
        L19:
            if (r0 == 0) goto L6c
            long r8 = r0.f8708a
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L24
            goto L65
        L24:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L69
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 > 0) goto L69
            long r8 = r8 - r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 64
            r15 = 1
            if (r12 < 0) goto L43
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 >= 0) goto L43
            int r8 = (int) r8
            long r8 = r3 << r8
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L41
            goto L57
        L41:
            r15 = r5
            goto L57
        L43:
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 < 0) goto L41
            r12 = 128(0x80, double:6.32E-322)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L41
            int r8 = (int) r8
            int r8 = r8 + (-64)
            long r8 = r3 << r8
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L41
        L57:
            if (r15 != 0) goto L69
            if (r7 != 0) goto L5d
            r7 = r0
            goto L69
        L5d:
            long r1 = r0.f8708a
            long r3 = r7.f8708a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L67
        L65:
            r6 = r0
            goto L6c
        L67:
            r6 = r7
            goto L6c
        L69:
            a0.w r0 = r0.f8709b
            goto L19
        L6c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == 0) goto L76
            r6.f8708a = r0
            return r6
        L76:
            r2 = r16
            a0.w r0 = r2.b(r0)
            a0.w r1 = r17.d()
            r0.f8709b = r1
            r1 = r17
            r1.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.n.m(a0.w, a0.u):a0.w");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(AbstractC0606h abstractC0606h, u uVar) {
        abstractC0606h.t(abstractC0606h.h() + 1);
        B5.c cVarI = abstractC0606h.i();
        if (cVarI != null) {
            cVarI.invoke(uVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w o(w wVar, v vVar, AbstractC0606h abstractC0606h, w wVar2) {
        w wVarM;
        if (abstractC0606h.f()) {
            abstractC0606h.n(vVar);
        }
        long jG = abstractC0606h.g();
        if (wVar2.f8708a == jG) {
            return wVar2;
        }
        synchronized (f8680b) {
            wVarM = m(wVar, vVar);
        }
        wVarM.f8708a = jG;
        if (wVar2.f8708a != 1) {
            abstractC0606h.n(vVar);
        }
        return wVarM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(u uVar) {
        w wVar;
        long j7 = f8682d;
        a0 a0Var = f8683e;
        if (a0Var.f1528a > 0) {
            j7 = ((long[]) a0Var.f1530c)[0];
        }
        w wVar2 = null;
        w wVarD = null;
        int i7 = 0;
        for (w wVarD2 = uVar.d(); wVarD2 != null; wVarD2 = wVarD2.f8709b) {
            long j8 = wVarD2.f8708a;
            if (j8 != 0) {
                if (j8 >= j7) {
                    i7++;
                } else if (wVar2 == null) {
                    i7++;
                    wVar2 = wVarD2;
                } else {
                    if (j8 < wVar2.f8708a) {
                        wVar = wVar2;
                        wVar2 = wVarD2;
                    } else {
                        wVar = wVarD2;
                    }
                    if (wVarD == null) {
                        wVarD = uVar.d();
                        w wVar3 = wVarD;
                        while (true) {
                            if (wVarD == null) {
                                wVarD = wVar3;
                                break;
                            }
                            long j9 = wVarD.f8708a;
                            if (j9 >= j7) {
                                break;
                            }
                            if (wVar3.f8708a < j9) {
                                wVar3 = wVarD;
                            }
                            wVarD = wVarD.f8709b;
                        }
                    }
                    wVar2.f8708a = 0L;
                    wVar2.a(wVarD);
                    wVar2 = wVar;
                }
            }
        }
        return i7 > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(u uVar) {
        if (p(uVar)) {
            Y y6 = f;
            int i7 = y6.f1519b;
            int iIdentityHashCode = System.identityHashCode(uVar);
            int i8 = -1;
            if (i7 > 0) {
                int i9 = y6.f1519b - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > i9) {
                        i8 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + i9) >>> 1;
                    int i12 = ((int[]) y6.f1520c)[i11];
                    if (i12 < iIdentityHashCode) {
                        i10 = i11 + 1;
                    } else if (i12 > iIdentityHashCode) {
                        i9 = i11 - 1;
                    } else {
                        X.n nVar = ((X.n[]) y6.f1521d)[i11];
                        if (uVar == (nVar != null ? nVar.get() : null)) {
                            i8 = i11;
                        } else {
                            for (int i13 = i11 - 1; -1 < i13 && ((int[]) y6.f1520c)[i13] == iIdentityHashCode; i13--) {
                                X.n nVar2 = ((X.n[]) y6.f1521d)[i13];
                                if ((nVar2 != null ? nVar2.get() : null) == uVar) {
                                    i8 = i13;
                                    break;
                                }
                            }
                            i11++;
                            int i14 = y6.f1519b;
                            while (true) {
                                if (i11 >= i14) {
                                    i8 = -(y6.f1519b + 1);
                                    break;
                                } else {
                                    if (((int[]) y6.f1520c)[i11] != iIdentityHashCode) {
                                        i8 = -(i11 + 1);
                                        break;
                                    }
                                    X.n nVar3 = ((X.n[]) y6.f1521d)[i11];
                                    if ((nVar3 != null ? nVar3.get() : null) == uVar) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            i8 = i11;
                        }
                    }
                }
                if (i8 >= 0) {
                    return;
                }
            }
            int i15 = -(i8 + 1);
            X.n[] nVarArr = (X.n[]) y6.f1521d;
            int length = nVarArr.length;
            if (i7 == length) {
                int i16 = length * 2;
                X.n[] nVarArr2 = new X.n[i16];
                int[] iArr = new int[i16];
                int i17 = i15 + 1;
                System.arraycopy(nVarArr, i15, nVarArr2, i17, i7 - i15);
                System.arraycopy((X.n[]) y6.f1521d, 0, nVarArr2, 0, i15);
                n5.k.C0(i17, i15, i7, (int[]) y6.f1520c, iArr);
                n5.k.F0(0, i15, 6, (int[]) y6.f1520c, iArr);
                y6.f1521d = nVarArr2;
                y6.f1520c = iArr;
            } else {
                int i18 = i15 + 1;
                System.arraycopy(nVarArr, i15, nVarArr, i18, i7 - i15);
                int[] iArr2 = (int[]) y6.f1520c;
                n5.k.C0(i18, i15, i7, iArr2, iArr2);
            }
            ((X.n[]) y6.f1521d)[i15] = new X.n(uVar);
            ((int[]) y6.f1520c)[i15] = iIdentityHashCode;
            y6.f1519b++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w s(w wVar, long j7, l lVar) {
        w wVar2 = null;
        while (wVar != null) {
            long j8 = wVar.f8708a;
            if (j8 != 0 && j8 <= j7 && !lVar.h(j8) && (wVar2 == null || wVar2.f8708a < wVar.f8708a)) {
                wVar2 = wVar;
            }
            wVar = wVar.f8709b;
        }
        if (wVar2 != null) {
            return wVar2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w t(w wVar, u uVar) {
        w wVarS;
        AbstractC0606h abstractC0606hK = k();
        B5.c cVarE = abstractC0606hK.e();
        if (cVarE != null) {
            cVarE.invoke(uVar);
        }
        w wVarS2 = s(wVar, abstractC0606hK.g(), abstractC0606hK.d());
        if (wVarS2 != null) {
            return wVarS2;
        }
        synchronized (f8680b) {
            AbstractC0606h abstractC0606hK2 = k();
            w wVarD = uVar.d();
            kotlin.jvm.internal.m.c(wVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            wVarS = s(wVarD, abstractC0606hK2.g(), abstractC0606hK2.d());
            if (wVarS == null) {
                r();
                throw null;
            }
        }
        return wVarS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(int i7) {
        a0 a0Var = f8683e;
        int i8 = ((int[]) a0Var.f1532e)[i7];
        a0Var.c(i8, a0Var.f1528a - 1);
        a0Var.f1528a--;
        long[] jArr = (long[]) a0Var.f1530c;
        long j7 = jArr[i8];
        int i9 = i8;
        while (i9 > 0) {
            int i10 = ((i9 + 1) >> 1) - 1;
            if (jArr[i10] <= j7) {
                break;
            }
            a0Var.c(i10, i9);
            i9 = i10;
        }
        long[] jArr2 = (long[]) a0Var.f1530c;
        int i11 = a0Var.f1528a >> 1;
        while (i8 < i11) {
            int i12 = (i8 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < a0Var.f1528a) {
                long j8 = jArr2[i12];
                if (j8 < jArr2[i13]) {
                    if (j8 >= jArr2[i8]) {
                        break;
                    }
                    a0Var.c(i12, i8);
                    i8 = i12;
                }
            }
            if (jArr2[i13] >= jArr2[i8]) {
                break;
            }
            a0Var.c(i13, i8);
            i8 = i13;
        }
        ((int[]) a0Var.f1532e)[i7] = a0Var.f1529b;
        a0Var.f1529b = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object v(C0601c c0601c, B5.c cVar) {
        long j7 = c0601c.f8662b;
        Object objInvoke = cVar.invoke(f8681c.g(j7));
        long j8 = f8682d;
        f8682d = 1 + j8;
        l lVarG = f8681c.g(j7);
        f8681c = lVarG;
        c0601c.f8662b = j8;
        c0601c.f8661a = lVarG;
        c0601c.f8652g = 0;
        c0601c.f8653h = null;
        c0601c.o();
        f8681c = f8681c.j(j8);
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w w(w wVar, u uVar, AbstractC0606h abstractC0606h) {
        w wVarS;
        if (abstractC0606h.f()) {
            abstractC0606h.n(uVar);
        }
        long jG = abstractC0606h.g();
        w wVarS2 = s(wVar, jG, abstractC0606h.d());
        if (wVarS2 == null) {
            r();
            throw null;
        }
        if (wVarS2.f8708a == abstractC0606h.g()) {
            return wVarS2;
        }
        synchronized (f8680b) {
            wVarS = s(uVar.d(), jG, abstractC0606h.d());
            if (wVarS == null) {
                r();
                throw null;
            }
            if (wVarS.f8708a != jG) {
                w wVarM = m(wVarS, uVar);
                wVarM.a(wVarS);
                wVarM.f8708a = abstractC0606h.g();
                wVarS = wVarM;
            }
        }
        if (wVarS2.f8708a != 1) {
            abstractC0606h.n(uVar);
        }
        return wVarS;
    }
}
