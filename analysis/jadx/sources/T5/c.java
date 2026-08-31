package T5;

import C0.S;
import M5.AbstractC0263y;
import R5.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f7463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f7465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f7466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f7467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7458x = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7459y = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7460z = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final E4.f f7457A = new E4.f("NOT_IN_STACK", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i, int i7, long j, String str) {
        this.f7461q = i;
        this.f7462r = i7;
        this.f7463s = j;
        this.f7464t = str;
        if (i < 1) {
            throw new IllegalArgumentException(S.m("Core pool size ", " should be at least 1", i).toString());
        }
        if (i7 < i) {
            throw new IllegalArgumentException(S.j(i7, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i7 > 2097150) {
            throw new IllegalArgumentException(S.m("Max pool size ", " should not exceed maximal supported number of threads 2097150", i7).toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7465u = new f();
        this.f7466v = new f();
        this.f7467w = new q((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void c(c cVar, Runnable runnable, int i) {
        cVar.b(runnable, false, (i & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        synchronized (this.f7467w) {
            try {
                if (f7460z.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7459y;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i7 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= this.f7461q) {
                    return 0;
                }
                if (i >= this.f7462r) {
                    return 0;
                }
                int i8 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f7467w.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i8);
                this.f7467w.c(i8, aVar);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = i7 + 1;
                aVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Runnable runnable, boolean z5, boolean z6) {
        i jVar;
        b bVar;
        k.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7473q = jNanoTime;
            jVar.f7474r = z5;
        } else {
            jVar = new j(runnable, jNanoTime, z5);
        }
        boolean z7 = jVar.f7474r;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7459y;
        long jAddAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.m.a(aVar.f7450x, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7445s) != b.f7455u && (jVar.f7474r || bVar != b.f7452r)) {
            aVar.f7449w = true;
            m mVar = aVar.f7443q;
            if (z6) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7482b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7474r ? this.f7466v.a(jVar) : this.f7465u.a(jVar))) {
                throw new RejectedExecutionException(k1.i.k(new StringBuilder(), this.f7464t, " was terminated"));
            }
        }
        if (z7) {
            if (n() || f(jAddAndGet)) {
                return;
            }
            n();
            return;
        }
        if (n() || f(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = T5.c.f7460z
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof T5.a
            r3 = 0
            if (r1 == 0) goto L17
            T5.a r0 = (T5.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            T5.c r1 = r0.f7450x
            boolean r1 = kotlin.jvm.internal.m.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            R5.q r1 = r8.f7467w
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = T5.c.f7459y     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            R5.q r5 = r8.f7467w
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.m.b(r5)
            T5.a r5 = (T5.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            T5.m r5 = r5.f7443q
            T5.f r6 = r8.f7466v
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = T5.m.f7482b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            T5.i r7 = (T5.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            T5.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            T5.f r1 = r8.f7466v
            r1.b()
            T5.f r1 = r8.f7465u
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            T5.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            T5.f r1 = r8.f7465u
            java.lang.Object r1 = r1.d()
            T5.i r1 = (T5.i) r1
            if (r1 != 0) goto Lb2
            T5.f r1 = r8.f7466v
            java.lang.Object r1 = r1.d()
            T5.i r1 = (T5.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            T5.b r1 = T5.b.f7455u
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = T5.c.f7458x
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = T5.c.f7459y
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.c.close():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(a aVar, int i, int i7) {
        while (true) {
            long j = f7458x.get(this);
            int i8 = (int) (2097151 & j);
            long j7 = (2097152 + j) & (-2097152);
            if (i8 == i) {
                if (i7 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f7457A) {
                            i8 = -1;
                            break;
                        }
                        if (objC == null) {
                            i8 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i8 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i8 = i7;
                }
            }
            if (i8 >= 0) {
                if (f7458x.compareAndSet(this, j, ((long) i8) | j7)) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i7 = this.f7461q;
        if (i < i7) {
            int iA = a();
            if (iA == 1 && i7 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        E4.f fVar;
        int iB;
        while (true) {
            long j = f7458x.get(this);
            a aVar = (a) this.f7467w.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    fVar = f7457A;
                    if (objC == fVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f7458x.compareAndSet(this, j, ((long) iB) | j7)) {
                        aVar.g(fVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7442y.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 99 */
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f7467w;
        int iA = qVar.a();
        int i = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < iA; i11++) {
            a aVar = (a) qVar.b(i11);
            if (aVar != null) {
                m mVar = aVar.f7443q;
                mVar.getClass();
                int i12 = m.f7482b.get(mVar) != null ? (m.f7483c.get(mVar) - m.f7484d.get(mVar)) + 1 : m.f7483c.get(mVar) - m.f7484d.get(mVar);
                int iOrdinal = aVar.f7445s.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i8++;
                } else if (iOrdinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i12);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C2.e();
                    }
                    i10++;
                }
            }
        }
        long j = f7459y.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7464t);
        sb4.append('@');
        sb4.append(AbstractC0263y.m(this));
        sb4.append("[Pool Size {core = ");
        int i13 = this.f7461q;
        sb4.append(i13);
        sb4.append(", max = ");
        sb4.append(this.f7462r);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i7);
        sb4.append(", parked = ");
        sb4.append(i8);
        sb4.append(", dormant = ");
        sb4.append(i9);
        sb4.append(", terminated = ");
        sb4.append(i10);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f7465u.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7466v.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i13 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
