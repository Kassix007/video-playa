package androidx.work;

import android.content.ComponentName;
import androidx.work.Data;
import androidx.work.impl.utils.EnqueueUtilsKt;
import java.util.UUID;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParametersExtensions {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Data buildDelegatedRemoteRequestData(String delegatedWorkerName, ComponentName componentName, Data inputData) {
        m.e(delegatedWorkerName, "delegatedWorkerName");
        m.e(componentName, "componentName");
        m.e(inputData, "inputData");
        Data.Builder builder = new Data.Builder();
        builder.putAll(inputData).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, componentName.getPackageName()).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, componentName.getClassName()).putString(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, delegatedWorkerName);
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isRemoteWorkRequest(WorkerParameters workerParameters) {
        m.e(workerParameters, "<this>");
        Data inputData = workerParameters.getInputData();
        m.d(inputData, "inputData");
        return isRemoteWorkRequest(inputData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkerParameters usingRemoteService(WorkerParameters workerParameters, String workerClassName, ComponentName componentName) {
        m.e(workerParameters, "<this>");
        m.e(workerClassName, "workerClassName");
        m.e(componentName, "componentName");
        UUID id = workerParameters.getId();
        Data inputData = workerParameters.getInputData();
        m.d(inputData, "inputData");
        return new WorkerParameters(id, buildDelegatedRemoteRequestData(workerClassName, componentName, inputData), workerParameters.getTags(), workerParameters.getRuntimeExtras(), workerParameters.getRunAttemptCount(), workerParameters.getGeneration(), workerParameters.getBackgroundExecutor(), workerParameters.getWorkerContext(), workerParameters.getTaskExecutor(), workerParameters.getWorkerFactory(), workerParameters.getProgressUpdater(), workerParameters.getForegroundUpdater());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final boolean isRemoteWorkRequest(Data data) {
        m.e(data, "<this>");
        return data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, String.class);
    }

    public static final <T extends ListenableWorker> WorkerParameters usingRemoteService(WorkerParameters workerParameters, ComponentName componentName) {
        m.e(workerParameters, "<this>");
        m.e(componentName, "componentName");
        m.j();
        throw null;
    }
}
