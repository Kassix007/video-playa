package P;

import a0.AbstractC0606h;
import r.C1543B;

/* JADX INFO: loaded from: classes.dex */
public final class B extends a0.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f5275h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1543B f5278e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5279g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(long j) {
        super(j);
        C1543B c1543b = r.L.f16158a;
        kotlin.jvm.internal.m.c(c1543b, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f5278e = c1543b;
        this.f = f5275h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        B b7 = (B) wVar;
        this.f5278e = b7.f5278e;
        this.f = b7.f;
        this.f5279g = b7.f5279g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final a0.w b(long j) {
        return new B(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(P.C r7, a0.AbstractC0606h r8) {
        /*
            r6 = this;
            java.lang.Object r0 = a0.n.f8680b
            monitor-enter(r0)
            long r1 = r6.f5276c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f5277d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = P.B.f5275h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f5279g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f5276c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f5277d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P.B.c(P.C, a0.h):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(C c7, AbstractC0606h abstractC0606h) throws Throwable {
        C1543B c1543b;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        long[] jArr2;
        int i7;
        int i8;
        a0.w wVarE;
        synchronized (a0.n.f8680b) {
            c1543b = this.f5278e;
        }
        int i9 = 7;
        if (c1543b.f16113e == 0) {
            return 7;
        }
        R.e eVarL = C0345b.l();
        Object[] objArr = eVarL.f6676q;
        int i10 = eVarL.f6678s;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C0369n) objArr[i11]).b();
        }
        try {
            Object[] objArr2 = c1543b.f16110b;
            int[] iArr = c1543b.f16111c;
            long[] jArr3 = c1543b.f16109a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i12 = 0;
                while (true) {
                    long j = jArr3[i12];
                    if ((((~j) << i9) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr2[i16];
                                i7 = i9;
                                int i17 = iArr[i16];
                                i8 = i13;
                                a0.u uVar = (a0.u) obj;
                                if (i17 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (uVar instanceof C) {
                                        try {
                                            C c8 = (C) uVar;
                                            wVarE = c8.e((B) a0.n.j(c8.f5285t, abstractC0606h), abstractC0606h, false, c8.f5283r);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = eVarL.f6676q;
                                            int i18 = eVarL.f6678s;
                                            for (int i19 = 0; i19 < i18; i19++) {
                                                ((C0369n) objArr3[i19]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        wVarE = a0.n.j(uVar.d(), abstractC0606h);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(wVarE)) * 31) + Long.hashCode(wVarE.f8708a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i7 = i9;
                                i8 = i13;
                            }
                            j >>= i8;
                            i15++;
                            i9 = i7;
                            jArr3 = jArr2;
                            i13 = i8;
                        }
                        jArr = jArr3;
                        i = i9;
                        if (i14 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i9;
                    }
                    if (i12 == length) {
                        i9 = iIdentityHashCode;
                        break;
                    }
                    i12++;
                    i9 = i;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i9;
            Object[] objArr4 = eVarL.f6676q;
            int i20 = eVarL.f6678s;
            for (int i21 = 0; i21 < i20; i21++) {
                ((C0369n) objArr4[i21]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
