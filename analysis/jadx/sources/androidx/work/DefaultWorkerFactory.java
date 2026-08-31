package androidx.work;

import android.content.Context;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultWorkerFactory extends WorkerFactory {
    public static final DefaultWorkerFactory INSTANCE = new DefaultWorkerFactory();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DefaultWorkerFactory() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Possible override for method androidx.work.WorkerFactory.createWorker(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker; */
    /* JADX INFO: renamed from: createWorker, reason: collision with other method in class */
    public Void m6createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        m.e(appContext, "appContext");
        m.e(workerClassName, "workerClassName");
        m.e(workerParameters, "workerParameters");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.work.WorkerFactory
    public /* bridge */ /* synthetic */ ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        return (ListenableWorker) m6createWorker(context, str, workerParameters);
    }
}
