package q6;

import C0.S;
import a.AbstractC0597a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: q6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1534c implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16052q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16054s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1534c(InputStream input, I i) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f16053r = input;
        this.f16054s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) throws IOException {
        switch (this.f16052q) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                F f = (F) this.f16053r;
                C1534c c1534c = (C1534c) this.f16054s;
                f.h();
                try {
                    long jF = c1534c.F(j, sink);
                    if (f.i()) {
                        throw f.k(null);
                    }
                    return jF;
                } catch (IOException e7) {
                    if (f.i()) {
                        throw f.k(e7);
                    }
                    throw e7;
                } finally {
                    f.i();
                }
            default:
                kotlin.jvm.internal.m.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
                }
                try {
                    ((I) this.f16054s).f();
                    B bA0 = sink.a0(1);
                    int i = ((InputStream) this.f16053r).read(bA0.f16028a, bA0.f16030c, (int) Math.min(j, 8192 - bA0.f16030c));
                    if (i == -1) {
                        if (bA0.f16029b == bA0.f16030c) {
                            sink.f16062q = bA0.a();
                            C.a(bA0);
                        }
                        return -1L;
                    }
                    bA0.f16030c += i;
                    long j7 = i;
                    sink.f16063r += j7;
                    return j7;
                } catch (AssertionError e8) {
                    if (AbstractC0597a.G(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f16052q) {
            case 0:
                F f = (F) this.f16053r;
                C1534c c1534c = (C1534c) this.f16054s;
                f.h();
                try {
                    c1534c.close();
                    if (f.i()) {
                        throw f.k(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!f.i()) {
                        throw e7;
                    }
                    throw f.k(e7);
                } finally {
                    f.i();
                }
            default:
                ((InputStream) this.f16053r).close();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        switch (this.f16052q) {
            case 0:
                return (F) this.f16053r;
            default:
                return (I) this.f16054s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f16052q) {
            case 0:
                return "AsyncTimeout.source(" + ((C1534c) this.f16054s) + ')';
            default:
                return "source(" + ((InputStream) this.f16053r) + ')';
        }
    }

    public C1534c(F f, C1534c c1534c) {
        this.f16053r = f;
        this.f16054s = c1534c;
    }
}
