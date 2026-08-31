package androidx.room;

import j2.InterfaceC1161g;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1362a;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    private final w database;
    private final AtomicBoolean lock;
    private final InterfaceC1369h stmt$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(w database) {
        kotlin.jvm.internal.m.e(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = AbstractC1362a.d(new A0.d(18, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1161g acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (InterfaceC1161g) this.stmt$delegate.getValue();
        }
        return this.database.compileStatement(createQuery());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void release(InterfaceC1161g statement) {
        kotlin.jvm.internal.m.e(statement, "statement");
        if (statement == ((InterfaceC1161g) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
