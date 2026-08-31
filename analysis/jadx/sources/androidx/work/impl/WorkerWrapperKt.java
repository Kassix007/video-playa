package androidx.work.impl;

import M5.C0247h;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.m;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapperKt {
    private static final String TAG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkerWrapper");
        m.d(strTagWithPrefix, "tagWithPrefix(\"WorkerWrapper\")");
        TAG = strTagWithPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> Object awaitWithin(I4.b bVar, ListenableWorker listenableWorker, InterfaceC1524c<? super T> interfaceC1524c) throws Throwable {
        try {
            if (bVar.isDone()) {
                return getUninterruptibly(bVar);
            }
            C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
            c0247h.s();
            bVar.addListener(new ToContinuation(bVar, c0247h), DirectExecutor.INSTANCE);
            c0247h.u(new WorkerWrapperKt$awaitWithin$2$1(listenableWorker, bVar));
            return c0247h.r();
        } catch (ExecutionException e7) {
            throw nonNullCause(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
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
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        m.b(cause);
        return cause;
    }
}
