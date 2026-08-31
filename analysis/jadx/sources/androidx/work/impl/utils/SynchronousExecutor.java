package androidx.work.impl.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class SynchronousExecutor implements Executor {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
