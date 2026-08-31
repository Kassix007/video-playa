package q6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: q6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1537f extends InputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1540i f16061r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1537f(InterfaceC1540i interfaceC1540i, int i) {
        this.f16060q = i;
        this.f16061r = interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f16060q) {
            case 0:
                jMin = Math.min(((C1538g) this.f16061r).f16063r, Integer.MAX_VALUE);
                break;
            default:
                A a7 = (A) this.f16061r;
                if (a7.f16027s) {
                    throw new IOException("closed");
                }
                jMin = Math.min(a7.f16026r.f16063r, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16060q) {
            case 0:
                break;
            default:
                ((A) this.f16061r).close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f16060q) {
            case 0:
                C1538g c1538g = (C1538g) this.f16061r;
                if (c1538g.f16063r > 0) {
                    return c1538g.readByte() & 255;
                }
                return -1;
            default:
                A a7 = (A) this.f16061r;
                C1538g c1538g2 = a7.f16026r;
                if (a7.f16027s) {
                    throw new IOException("closed");
                }
                if (c1538g2.f16063r == 0 && a7.f16025q.F(8192L, c1538g2) == -1) {
                    return -1;
                }
                return c1538g2.readByte() & 255;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f16060q) {
            case 0:
                return ((C1538g) this.f16061r) + ".inputStream()";
            default:
                return ((A) this.f16061r) + ".inputStream()";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public long transferTo(OutputStream out) throws IOException {
        switch (this.f16060q) {
            case 1:
                kotlin.jvm.internal.m.e(out, "out");
                A a7 = (A) this.f16061r;
                C1538g c1538g = a7.f16026r;
                if (a7.f16027s) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j7 = 0;
                while (true) {
                    if (c1538g.f16063r == j && a7.f16025q.F(8192L, c1538g) == -1) {
                        return j7;
                    }
                    long j8 = c1538g.f16063r;
                    j7 += j8;
                    Q2.g.o(j8, 0L, j8);
                    B b7 = c1538g.f16062q;
                    while (j8 > j) {
                        kotlin.jvm.internal.m.b(b7);
                        int iMin = (int) Math.min(j8, b7.f16030c - b7.f16029b);
                        out.write(b7.f16028a, b7.f16029b, iMin);
                        int i = b7.f16029b + iMin;
                        b7.f16029b = i;
                        long j9 = iMin;
                        c1538g.f16063r -= j9;
                        j8 -= j9;
                        if (i == b7.f16030c) {
                            B bA = b7.a();
                            c1538g.f16062q = bA;
                            C.a(b7);
                            b7 = bA;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i7) throws IOException {
        switch (this.f16060q) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                return ((C1538g) this.f16061r).read(sink, i, i7);
            default:
                kotlin.jvm.internal.m.e(sink, "data");
                A a7 = (A) this.f16061r;
                C1538g c1538g = a7.f16026r;
                if (!a7.f16027s) {
                    Q2.g.o(sink.length, i, i7);
                    if (c1538g.f16063r == 0 && a7.f16025q.F(8192L, c1538g) == -1) {
                        return -1;
                    }
                    return c1538g.read(sink, i, i7);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
