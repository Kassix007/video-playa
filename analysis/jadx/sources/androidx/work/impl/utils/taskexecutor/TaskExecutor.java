package androidx.work.impl.utils.taskexecutor;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface TaskExecutor {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void executeOnTaskThread(Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default AbstractC0257s getTaskCoroutineDispatcher() {
        return AbstractC0263y.k(getSerialTaskExecutor());
    }
}
