package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
enum DirectExecutor implements Executor {
    INSTANCE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
