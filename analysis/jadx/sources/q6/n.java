package q6;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E f16074q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(E delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f16074q = delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public void Z(long j, C1538g source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f16074q.Z(j, source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16074q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        return this.f16074q.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Flushable
    public void flush() {
        this.f16074q.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16074q + ')';
    }
}
