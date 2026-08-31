package g6;

import O3.D;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f13186h = new D(21);
    public static final d i;
    public static final Logger j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.c f13187a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13190d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13188b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13191e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A1.b f13192g = new A1.b(18, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String name = e6.b.f + " TaskRunner";
        m.e(name, "name");
        e6.a aVar = new e6.a(name, true);
        k3.c cVar = new k3.c();
        cVar.f14120q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        i = new d(cVar);
        Logger logger = Logger.getLogger(d.class.getName());
        m.d(logger, "getLogger(TaskRunner::class.java.name)");
        j = logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(k3.c cVar) {
        this.f13187a = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void a(d dVar, a aVar) {
        byte[] bArr = e6.b.f12673a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f13176a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(a aVar, long j7) {
        byte[] bArr = e6.b.f12673a;
        c cVar = aVar.f13178c;
        m.b(cVar);
        if (cVar.f13184d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z5 = cVar.f;
        cVar.f = false;
        cVar.f13184d = null;
        this.f13191e.remove(cVar);
        if (j7 != -1 && !z5 && !cVar.f13183c) {
            cVar.d(aVar, j7, true);
        }
        if (cVar.f13185e.isEmpty()) {
            return;
        }
        this.f.add(cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a c() {
        long j7;
        a aVar;
        boolean z5;
        byte[] bArr = e6.b.f12673a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i7 = 0;
            a aVar2 = null;
            while (true) {
                if (i7 >= size) {
                    j7 = jNanoTime;
                    aVar = null;
                    z5 = false;
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                a aVar3 = (a) ((c) obj).f13185e.get(0);
                j7 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f13179d - j7);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z5 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j7;
            }
            ArrayList arrayList2 = this.f13191e;
            if (aVar2 != null) {
                byte[] bArr2 = e6.b.f12673a;
                aVar2.f13179d = -1L;
                c cVar = aVar2.f13178c;
                m.b(cVar);
                cVar.f13185e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f13184d = aVar2;
                arrayList2.add(cVar);
                if (z5 || (!this.f13189c && !arrayList.isEmpty())) {
                    A1.b runnable = this.f13192g;
                    m.e(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f13187a.f14120q).execute(runnable);
                }
                return aVar2;
            }
            if (this.f13189c) {
                if (jMin >= this.f13190d - j7) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f13189c = true;
            this.f13190d = j7 + jMin;
            try {
                try {
                    long j8 = jMin / 1000000;
                    long j9 = jMin - (1000000 * j8);
                    if (j8 > 0 || jMin > 0) {
                        wait(j8, (int) j9);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f13185e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f13189c = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(c taskQueue) {
        m.e(taskQueue, "taskQueue");
        byte[] bArr = e6.b.f12673a;
        if (taskQueue.f13184d == null) {
            boolean zIsEmpty = taskQueue.f13185e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                m.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f13189c) {
            notify();
            return;
        }
        A1.b runnable = this.f13192g;
        m.e(runnable, "runnable");
        ((ThreadPoolExecutor) this.f13187a.f14120q).execute(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c e() {
        int i7;
        synchronized (this) {
            i7 = this.f13188b;
            this.f13188b = i7 + 1;
        }
        return new c(this, i.i(i7, "Q"));
    }
}
