package androidx.work;

import android.content.Context;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkerFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final ListenableWorker createWorkerWithDefaultFallback$fallbackToReflection(Context context, String str, WorkerParameters workerParameters) {
        try {
            ListenableWorker listenableWorkerNewInstance = createWorkerWithDefaultFallback$getWorkerClass(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            m.d(listenableWorkerNewInstance, "{\n                val co…Parameters)\n            }");
            return listenableWorkerNewInstance;
        } catch (Throwable th) {
            Logger.get().error(WorkerFactoryKt.TAG, "Could not instantiate " + str, th);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.lang.Class<? extends U>, java.lang.Object, java.lang.Class<? extends androidx.work.ListenableWorker> */
    private static final Class<? extends ListenableWorker> createWorkerWithDefaultFallback$getWorkerClass(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            m.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            return clsAsSubclass;
        } catch (Throwable th) {
            Logger.get().error(WorkerFactoryKt.TAG, "Invalid class: " + str, th);
            throw th;
        }
    }

    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ListenableWorker createWorkerWithDefaultFallback(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        m.e(appContext, "appContext");
        m.e(workerClassName, "workerClassName");
        m.e(workerParameters, "workerParameters");
        ListenableWorker listenableWorkerCreateWorker = createWorker(appContext, workerClassName, workerParameters);
        if (listenableWorkerCreateWorker == null) {
            listenableWorkerCreateWorker = createWorkerWithDefaultFallback$fallbackToReflection(appContext, workerClassName, workerParameters);
        }
        if (!listenableWorkerCreateWorker.isUsed()) {
            return listenableWorkerCreateWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
