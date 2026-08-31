package q6;

import C0.S;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class q implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f16077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A f16078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Inflater f16079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f16080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CRC32 f16081u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(G source) {
        kotlin.jvm.internal.m.e(source, "source");
        A a7 = new A(source);
        this.f16078r = a7;
        Inflater inflater = new Inflater(true);
        this.f16079s = inflater;
        this.f16080t = new r(a7, inflater);
        this.f16081u = new CRC32();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(String str, int i, int i7) throws IOException {
        if (i7 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + J5.m.Y0(8, Q2.g.O(i7)) + " != expected 0x" + J5.m.Y0(8, Q2.g.O(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) throws IOException {
        q qVar = this;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b7 = qVar.f16077q;
        CRC32 crc32 = qVar.f16081u;
        A a7 = qVar.f16078r;
        if (b7 == 0) {
            a7.Q(10L);
            C1538g c1538g = a7.f16026r;
            byte bF = c1538g.f(3L);
            boolean z5 = ((bF >> 1) & 1) == 1;
            if (z5) {
                qVar.b(c1538g, 0L, 10L);
            }
            a("ID1ID2", 8075, a7.readShort());
            a7.skip(8L);
            if (((bF >> 2) & 1) == 1) {
                a7.Q(2L);
                if (z5) {
                    b(c1538g, 0L, 2L);
                }
                long jG = c1538g.G() & 65535;
                a7.Q(jG);
                if (z5) {
                    b(c1538g, 0L, jG);
                }
                a7.skip(jG);
            }
            if (((bF >> 3) & 1) == 1) {
                long jB = a7.B((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    b(c1538g, 0L, jB + 1);
                }
                a7.skip(jB + 1);
            }
            if (((bF >> 4) & 1) == 1) {
                long jB2 = a7.B((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    qVar = this;
                    qVar.b(c1538g, 0L, jB2 + 1);
                } else {
                    qVar = this;
                }
                a7.skip(jB2 + 1);
            } else {
                qVar = this;
            }
            if (z5) {
                a("FHCRC", a7.n(), (short) crc32.getValue());
                crc32.reset();
            }
            qVar.f16077q = (byte) 1;
        }
        if (qVar.f16077q == 1) {
            long j7 = sink.f16063r;
            long jF = qVar.f16080t.F(j, sink);
            if (jF != -1) {
                qVar.b(sink, j7, jF);
                return jF;
            }
            qVar.f16077q = (byte) 2;
        }
        if (qVar.f16077q == 2) {
            a("CRC", a7.e(), (int) crc32.getValue());
            a("ISIZE", a7.e(), (int) qVar.f16079s.getBytesWritten());
            qVar.f16077q = (byte) 3;
            if (!a7.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C1538g c1538g, long j, long j7) {
        B b7 = c1538g.f16062q;
        kotlin.jvm.internal.m.b(b7);
        while (true) {
            int i = b7.f16030c;
            int i7 = b7.f16029b;
            if (j < i - i7) {
                break;
            }
            j -= (long) (i - i7);
            b7 = b7.f;
            kotlin.jvm.internal.m.b(b7);
        }
        while (j7 > 0) {
            int i8 = (int) (((long) b7.f16029b) + j);
            int iMin = (int) Math.min(b7.f16030c - i8, j7);
            this.f16081u.update(b7.f16028a, i8, iMin);
            j7 -= (long) iMin;
            b7 = b7.f;
            kotlin.jvm.internal.m.b(b7);
            j = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16080t.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f16078r.f16025q.d();
    }
}
