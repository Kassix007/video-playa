package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        m.e(command, "command");
        command.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
