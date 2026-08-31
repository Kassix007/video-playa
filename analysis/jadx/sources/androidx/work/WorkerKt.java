package androidx.work;

import Q2.g;
import U4.E;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> I4.b future(Executor executor, B5.a aVar) {
        return g.E(new E(executor, aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C1386y future$lambda$2(Executor executor, B5.a aVar, k it) {
        m.e(it, "it");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar = new b(atomicBoolean, 1);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        p pVar = it.f9373c;
        if (pVar != null) {
            pVar.addListener(bVar, directExecutor);
        }
        executor.execute(new c(atomicBoolean, it, aVar, 1));
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, k kVar, B5.a aVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            kVar.a(aVar.invoke());
        } catch (Throwable th) {
            kVar.b(th);
        }
    }
}
