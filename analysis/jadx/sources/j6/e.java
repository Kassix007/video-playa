package j6;

import C0.S;
import java.io.IOException;
import kotlin.jvm.internal.m;
import q6.C1538g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13905t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j6.a, q6.G
    public final long F(long j, C1538g sink) throws IOException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        if (this.f13894r) {
            throw new IllegalStateException("closed");
        }
        if (this.f13905t) {
            return -1L;
        }
        long jF = super.F(j, sink);
        if (jF != -1) {
            return jF;
        }
        this.f13905t = true;
        a();
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13894r) {
            return;
        }
        if (!this.f13905t) {
            a();
        }
        this.f13894r = true;
    }
}
