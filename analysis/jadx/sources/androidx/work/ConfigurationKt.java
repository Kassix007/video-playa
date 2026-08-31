package androidx.work;

import C0.S;
import E3.h;
import M5.AbstractC0257s;
import M5.G;
import M5.T;
import android.os.Build;
import android.os.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;
import p2.AbstractC1443a;
import q5.C1525d;
import q5.InterfaceC1526e;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(InterfaceC1529h interfaceC1529h) {
        Executor executorA0;
        InterfaceC1526e interfaceC1526e = interfaceC1529h != null ? (InterfaceC1526e) interfaceC1529h.get(C1525d.f16021q) : null;
        AbstractC0257s abstractC0257s = interfaceC1526e instanceof AbstractC0257s ? (AbstractC0257s) interfaceC1526e : null;
        if (abstractC0257s == null) {
            return null;
        }
        T t6 = abstractC0257s instanceof T ? (T) abstractC0257s : null;
        return (t6 == null || (executorA0 = t6.a0()) == null) ? new G(abstractC0257s) : executorA0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z5) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                m.e(runnable, "runnable");
                StringBuilder sbQ = S.q(z5 ? "WM.task-" : "androidx.work-");
                sbQ.append(this.threadCount.incrementAndGet());
                return new Thread(runnable, sbQ.toString());
            }
        });
        m.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String methodName, int i) {
                m.e(methodName, "methodName");
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1443a.a(h.O(methodName), i);
                    return;
                }
                String strO = h.O(methodName);
                try {
                    if (h.f1721m == null) {
                        h.f1721m = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                    }
                    h.f1721m.invoke(null, Long.valueOf(h.f1719k), strO, Integer.valueOf(i));
                } catch (Exception e7) {
                    h.D("asyncTraceBegin", e7);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.work.Tracer
            public void beginSection(String label) {
                m.e(label, "label");
                Trace.beginSection(h.O(label));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.work.Tracer
            public void endAsyncSection(String methodName, int i) {
                m.e(methodName, "methodName");
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1443a.b(h.O(methodName), i);
                    return;
                }
                String strO = h.O(methodName);
                try {
                    if (h.f1722n == null) {
                        h.f1722n = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    h.f1722n.invoke(null, Long.valueOf(h.f1719k), strO, Integer.valueOf(i));
                } catch (Exception e7) {
                    h.D("asyncTraceEnd", e7);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.work.Tracer
            public void endSection() {
                Trace.endSection();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.work.Tracer
            public boolean isEnabled() {
                return h.E();
            }
        };
    }
}
