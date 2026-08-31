package q6;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f16075q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(G delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f16075q = delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public long F(long j, C1538g sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        return this.f16075q.F(j, sink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16075q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f16075q.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16075q + ')';
    }
}
