package androidx.work;

import B5.e;
import C0.RunnableC0089m;
import M5.AbstractC0263y;
import M5.C0258t;
import M5.EnumC0262x;
import M5.InterfaceC0241b0;
import Q2.g;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import q5.C1530i;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <V> I4.b executeAsync(Executor executor, String debugTag, B5.a block) {
        m.e(executor, "<this>");
        m.e(debugTag, "debugTag");
        m.e(block, "block");
        return g.E(new a(executor, debugTag, block, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, B5.a aVar, k completer) {
        m.e(completer, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar = new b(atomicBoolean, 0);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        p pVar = completer.f9373c;
        if (pVar != null) {
            pVar.addListener(bVar, directExecutor);
        }
        executor.execute(new c(atomicBoolean, completer, aVar, 0));
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, k kVar, B5.a aVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            kVar.a(aVar.invoke());
        } catch (Throwable th) {
            kVar.b(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> I4.b launchFuture(InterfaceC1529h context, EnumC0262x start, e block) {
        m.e(context, "context");
        m.e(start, "start");
        m.e(block, "block");
        return g.E(new a(context, start, block, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ I4.b launchFuture$default(InterfaceC1529h interfaceC1529h, EnumC0262x enumC0262x, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC1529h = C1530i.f16022q;
        }
        if ((i & 2) != 0) {
            enumC0262x = EnumC0262x.f3895q;
        }
        return launchFuture(interfaceC1529h, enumC0262x, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(InterfaceC1529h interfaceC1529h, EnumC0262x enumC0262x, e eVar, k completer) {
        m.e(completer, "completer");
        RunnableC0089m runnableC0089m = new RunnableC0089m(11, (InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r));
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        p pVar = completer.f9373c;
        if (pVar != null) {
            pVar.addListener(runnableC0089m, directExecutor);
        }
        return AbstractC0263y.t(AbstractC0263y.a(interfaceC1529h), null, enumC0262x, new ListenableFutureKt$launchFuture$1$2(eVar, completer, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(InterfaceC0241b0 interfaceC0241b0) {
        if (interfaceC0241b0 != null) {
            interfaceC0241b0.a(null);
        }
    }
}
