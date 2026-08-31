package M5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends S implements C {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3822u = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3823v = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3824w = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        h0(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // M5.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e0() {
        /*
            r10 = this;
            E4.f r0 = M5.AbstractC0263y.f3903c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = M5.Q.f3822u
            boolean r2 = r10.f0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.i0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof R5.m
            if (r6 == 0) goto L3e
            r6 = r2
            R5.m r6 = (R5.m) r6
            java.lang.Object r7 = r6.d()
            E4.f r8 = R5.m.f7256g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            R5.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            n5.j r2 = r10.f3828s
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof R5.m
            if (r2 == 0) goto L8d
            R5.m r1 = (R5.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = R5.m.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.Q.f3823v
            java.lang.Object r0 = r0.get(r10)
            M5.P r0 = (M5.P) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            M5.O[] r1 = r0.f7272a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f3819q
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.Q.e0():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h0(Runnable runnable) {
        i0();
        if (!j0(runnable)) {
            RunnableC0264z.f3909x.h0(runnable);
            return;
        }
        Thread threadC0 = c0();
        if (Thread.currentThread() != threadC0) {
            LockSupport.unpark(threadC0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0() {
        O oB;
        P p7 = (P) f3823v.get(this);
        if (p7 == null || R5.v.f7271b.get(p7) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (p7) {
                try {
                    O[] oArr = p7.f7272a;
                    O o6 = oArr != null ? oArr[0] : null;
                    if (o6 != null) {
                        oB = ((jNanoTime - o6.f3819q) > 0L ? 1 : ((jNanoTime - o6.f3819q) == 0L ? 0 : -1)) >= 0 ? j0(o6) : false ? p7.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (oB != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3822u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f3824w.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof R5.m)) {
                        if (obj != AbstractC0263y.f3903c) {
                            R5.m mVar = new R5.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    R5.m mVar2 = (R5.m) obj;
                    int iA = mVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        R5.m mVarC = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k0() {
        /*
            r7 = this;
            n5.j r0 = r7.f3828s
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.Q.f3823v
            java.lang.Object r0 = r0.get(r7)
            M5.P r0 = (M5.P) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = R5.v.f7271b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.Q.f3822u
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof R5.m
            if (r3 == 0) goto L4f
            R5.m r0 = (R5.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = R5.m.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            E4.f r3 = M5.AbstractC0263y.f3903c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.Q.k0():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0(long j, O o6) {
        int iB;
        Thread threadC0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3823v;
        if (f3824w.get(this) == 1) {
            iB = 1;
        } else {
            P p7 = (P) atomicReferenceFieldUpdater.get(this);
            if (p7 == null) {
                P p8 = new P();
                p8.f3821c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, p8) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.m.b(obj);
                p7 = (P) obj;
            }
            iB = o6.b(j, p7, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                g0(j, o6);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        P p9 = (P) atomicReferenceFieldUpdater.get(this);
        if (p9 != null) {
            synchronized (p9) {
                O[] oArr = p9.f7272a;
                o = oArr != null ? oArr[0] : null;
            }
        }
        if (o != o6 || Thread.currentThread() == (threadC0 = c0())) {
            return;
        }
        LockSupport.unpark(threadC0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public J n(long j, v0 v0Var, InterfaceC1529h interfaceC1529h) {
        return A.f3804a.n(j, v0Var, interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.S
    public void shutdown() {
        O oB;
        s0.f3883a.set(null);
        f3824w.set(this, 1);
        E4.f fVar = AbstractC0263y.f3903c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3822u;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof R5.m)) {
                    if (obj != fVar) {
                        R5.m mVar = new R5.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((R5.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (e0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            P p7 = (P) f3823v.get(this);
            if (p7 == null) {
                return;
            }
            synchronized (p7) {
                oB = R5.v.f7271b.get(p7) > 0 ? p7.b(0) : null;
            }
            if (oB == null) {
                return;
            } else {
                g0(jNanoTime, oB);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final void z(long j, C0247h c0247h) {
        long j7 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j7 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            M m4 = new M(this, j7 + jNanoTime, c0247h);
            l0(jNanoTime, m4);
            c0247h.v(new C0244e(2, m4));
        }
    }
}
