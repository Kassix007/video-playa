package k6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import q6.C1538g;
import q6.C1541j;
import q6.G;
import q6.I;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class q implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1540i f14205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14210v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(InterfaceC1540i source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f14205q = source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) throws IOException {
        int i;
        int i7;
        kotlin.jvm.internal.m.e(sink, "sink");
        do {
            int i8 = this.f14209u;
            InterfaceC1540i interfaceC1540i = this.f14205q;
            if (i8 == 0) {
                interfaceC1540i.skip(this.f14210v);
                this.f14210v = 0;
                if ((this.f14207s & 4) == 0) {
                    i = this.f14208t;
                    int iP = e6.b.p(interfaceC1540i);
                    this.f14209u = iP;
                    this.f14206r = iP;
                    int i9 = interfaceC1540i.readByte() & 255;
                    this.f14207s = interfaceC1540i.readByte() & 255;
                    Logger logger = r.f14211t;
                    if (logger.isLoggable(Level.FINE)) {
                        C1541j c1541j = f.f14155a;
                        logger.fine(f.a(true, this.f14208t, this.f14206r, i9, this.f14207s));
                    }
                    i7 = interfaceC1540i.readInt() & Integer.MAX_VALUE;
                    this.f14208t = i7;
                    if (i9 != 9) {
                        throw new IOException(i9 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jF = interfaceC1540i.F(Math.min(j, i8), sink);
                if (jF != -1) {
                    this.f14209u -= (int) jF;
                    return jF;
                }
            }
            return -1L;
        } while (i7 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f14205q.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
