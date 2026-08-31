package M5;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC0257s implements Closeable, AutoCloseable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        r baseKey = AbstractC0257s.Key;
        kotlin.jvm.internal.m.e(baseKey, "baseKey");
    }

    public abstract Executor a0();
}
