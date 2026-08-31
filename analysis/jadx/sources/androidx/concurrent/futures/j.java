package androidx.concurrent.futures;

import C0.S;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements I4.b {
    static final a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(j.class.getName());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, FirebaseAnalytics.Param.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f9353b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f9356a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T checkNotNull(T t6) {
        t6.getClass();
        return t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void complete(j jVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = jVar.waiters;
            if (ATOMIC_HELPER.c(jVar, iVar, i.f9368c)) {
                while (iVar != null) {
                    Thread thread = iVar.f9369a;
                    if (thread != null) {
                        iVar.f9369a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f9370b;
                }
                jVar.afterDone();
                do {
                    eVar = jVar.listeners;
                } while (!ATOMIC_HELPER.a(jVar, eVar, e.f9357d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f9360c;
                    eVar3.f9360c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f9360c;
                    Runnable runnable = eVar2.f9358a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        jVar = gVar.f9366q;
                        if (jVar.value == gVar) {
                            if (ATOMIC_HELPER.b(jVar, gVar, getFutureValue(gVar.f9367r))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f9359b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getFutureValue(I4.b bVar) {
        if (bVar instanceof j) {
            Object obj = ((j) bVar).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar2 = (b) obj;
            return bVar2.f9352a ? bVar2.f9353b != null ? new b(false, bVar2.f9353b) : b.f9351d : obj;
        }
        boolean zIsCancelled = bVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return b.f9351d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(bVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new b(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <V> V getUninterruptibly(Future<V> future) {
        V v6;
        boolean z5 = false;
        while (true) {
            try {
                v6 = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return v6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I4.b
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        e eVar2 = e.f9357d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f9360c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != eVar2);
        }
        b(runnable, executor);
    }

    public void afterDone() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        b bVar = GENERATE_CANCELLATION_CAUSES ? new b(z5, new CancellationException("Future.cancel() was called.")) : z5 ? b.f9350c : b.f9351d;
        j jVar = this;
        boolean z6 = false;
        while (true) {
            if (ATOMIC_HELPER.b(jVar, obj, bVar)) {
                if (z5) {
                    jVar.interruptTask();
                }
                complete(jVar);
                if (!(obj instanceof g)) {
                    break;
                }
                I4.b bVar2 = ((g) obj).f9367r;
                if (!(bVar2 instanceof j)) {
                    bVar2.cancel(z5);
                    break;
                }
                jVar = (j) bVar2;
                obj = jVar.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z6 = true;
            } else {
                obj = jVar.value;
                if (!(obj instanceof g)) {
                    return z6;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(i iVar) {
        iVar.f9369a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f9368c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f9370b;
                if (iVar2.f9369a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f9370b = iVar4;
                    if (iVar3.f9369a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z5;
        i iVar = i.f9368c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            i iVar2 = this.waiters;
            if (iVar2 != iVar) {
                i iVar3 = new i();
                z5 = true;
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar2);
                    if (aVar.c(this, iVar2, iVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        d(iVar3);
                    } else {
                        iVar2 = this.waiters;
                    }
                } while (iVar2 != iVar);
            }
            return c(this.value);
        }
        z5 = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z5 : false) && (!(obj3 instanceof g))) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strL = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String strL2 = S.l(strL, " (plus ");
            long j7 = -nanos;
            long jConvert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(jConvert);
            boolean z6 = (jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS) ? z5 : false;
            if (jConvert > 0) {
                String strL3 = strL2 + jConvert + " " + lowerCase;
                if (z6) {
                    strL3 = S.l(strL3, ",");
                }
                strL2 = S.l(strL3, " ");
            }
            if (z6) {
                strL2 = strL2 + nanos2 + " nanoseconds ";
            }
            strL = S.l(strL2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(S.l(strL, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strL + " for " + string);
    }

    public void interruptTask() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.value != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.concurrent.futures.j */
    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            I4.b bVar = ((g) obj).f9367r;
            return k1.i.k(sb, bVar == this ? "this future" : String.valueOf(bVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFuture(I4.b r6) {
        /*
            r5 = this;
            checkNotNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = getFutureValue(r6)
            androidx.concurrent.futures.a r0 = androidx.concurrent.futures.j.ATOMIC_HELPER
            boolean r6 = r0.b(r5, r3, r6)
            if (r6 == 0) goto L4f
            complete(r5)
            return r2
        L20:
            androidx.concurrent.futures.g r0 = new androidx.concurrent.futures.g
            r0.<init>(r5, r6)
            androidx.concurrent.futures.a r4 = androidx.concurrent.futures.j.ATOMIC_HELPER
            boolean r3 = r4.b(r5, r3, r0)
            if (r3 == 0) goto L42
            androidx.concurrent.futures.o r1 = androidx.concurrent.futures.o.f9378q     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            androidx.concurrent.futures.d r1 = new androidx.concurrent.futures.d     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            androidx.concurrent.futures.d r1 = androidx.concurrent.futures.d.f9355b
        L3c:
            androidx.concurrent.futures.a r6 = androidx.concurrent.futures.j.ATOMIC_HELPER
            r6.b(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.value
        L44:
            boolean r2 = r0 instanceof androidx.concurrent.futures.b
            if (r2 == 0) goto L4f
            androidx.concurrent.futures.b r0 = (androidx.concurrent.futures.b) r0
            boolean r0 = r0.f9352a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.j.setFuture(I4.b):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e7) {
                strPendingToString = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f9352a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        i iVar = i.f9368c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return c(obj2);
            }
            i iVar2 = this.waiters;
            if (iVar2 != iVar) {
                i iVar3 = new i();
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar2);
                    if (aVar.c(this, iVar2, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return c(obj);
                    }
                    iVar2 = this.waiters;
                } while (iVar2 != iVar);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
