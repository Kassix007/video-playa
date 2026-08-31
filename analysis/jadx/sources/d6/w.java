package d6;

import a.AbstractC0597a;
import java.io.Closeable;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Closeable {
    public abstract InterfaceC1540i O();

    public abstract long a();

    public abstract p b();

    public abstract AbstractC0597a c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e6.b.b(O());
    }
}
