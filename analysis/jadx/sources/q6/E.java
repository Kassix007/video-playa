package q6;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface E extends Closeable, Flushable {
    void Z(long j, C1538g c1538g);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    I d();

    void flush();
}
