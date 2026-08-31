package q6;

import java.io.EOFException;

/* JADX INFO: renamed from: q6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1536e implements E {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) throws EOFException {
        kotlin.jvm.internal.m.e(source, "source");
        source.skip(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        return I.f16040d;
    }

    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // q6.E, java.io.Flushable
    public final void flush() {
    }
}
