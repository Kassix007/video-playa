package q6;

import C0.S;
import a.AbstractC0597a;
import com.google.android.gms.internal.measurement.I1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC1540i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f16025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1538g f16026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16027s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(G source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f16025q = source;
        this.f16026r = new C1538g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final long B(byte b7, long j, long j7) {
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j7) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j7).toString());
        }
        long jMax = j;
        while (jMax < j7) {
            C1538g c1538g = this.f16026r;
            byte b8 = b7;
            long j8 = j7;
            long jB = c1538g.B(b8, jMax, j8);
            if (jB != -1) {
                return jB;
            }
            long j9 = c1538g.f16063r;
            if (j9 >= j8 || this.f16025q.F(8192L, c1538g) == -1) {
                break;
            }
            jMax = Math.max(jMax, j9);
            b7 = b8;
            j7 = j8;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final String E(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(S.k("limit < 0: ", j).toString());
        }
        long j7 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jB = B((byte) 10, 0L, j7);
        C1538g c1538g = this.f16026r;
        if (jB != -1) {
            return r6.a.a(jB, c1538g);
        }
        if (j7 < Long.MAX_VALUE && o(j7) && c1538g.f(j7 - 1) == 13 && o(j7 + 1) && c1538g.f(j7) == 10) {
            return r6.a.a(j7, c1538g);
        }
        C1538g c1538g2 = new C1538g();
        c1538g.c(c1538g2, 0L, Math.min(32, c1538g.f16063r));
        throw new EOFException("\\n not found: limit=" + Math.min(c1538g.f16063r, j) + " content=" + c1538g2.k(c1538g2.f16063r).d() + (char) 8230);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        C1538g c1538g = this.f16026r;
        if (c1538g.f16063r == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f16025q.F(8192L, c1538g) == -1) {
                return -1L;
            }
        }
        return c1538g.F(Math.min(j, c1538g.f16063r), sink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final void Q(long j) {
        if (!o(j)) {
            throw new EOFException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final long T(InterfaceC1539h interfaceC1539h) {
        C1538g c1538g;
        long j = 0;
        while (true) {
            G g7 = this.f16025q;
            c1538g = this.f16026r;
            if (g7.F(8192L, c1538g) == -1) {
                break;
            }
            long jB = c1538g.b();
            if (jB > 0) {
                j += jB;
                interfaceC1539h.Z(jB, c1538g);
            }
        }
        long j7 = c1538g.f16063r;
        if (j7 <= 0) {
            return j;
        }
        long j8 = j + j7;
        interfaceC1539h.Z(j7, c1538g);
        return j8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final long X() {
        C1538g c1538g;
        byte bF;
        Q(1L);
        int i = 0;
        while (true) {
            int i7 = i + 1;
            boolean zO = o(i7);
            c1538g = this.f16026r;
            if (!zO) {
                break;
            }
            bF = c1538g.f(i);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                break;
            }
            i = i7;
        }
        if (i == 0) {
            I1.M(16);
            String string = Integer.toString(bF, 16);
            kotlin.jvm.internal.m.d(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c1538g.X();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final InputStream Y() {
        return new C1537f(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        C1538g c1538g = this.f16026r;
        return c1538g.e() && this.f16025q.F(8192L, c1538g) == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b(C1541j targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C1538g c1538g = this.f16026r;
            long jN = c1538g.n(jMax, targetBytes);
            if (jN != -1) {
                return jN;
            }
            long j = c1538g.f16063r;
            if (this.f16025q.F(8192L, c1538g) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final A c() {
        return AbstractC0597a.j(new y(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f16027s) {
            return;
        }
        this.f16027s = true;
        this.f16025q.close();
        this.f16026r.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f16025q.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        Q(4L);
        int i = this.f16026r.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long f() throws EOFException {
        char c7;
        char c8;
        char c9;
        char c10;
        long j;
        Q(8L);
        C1538g c1538g = this.f16026r;
        if (c1538g.f16063r < 8) {
            throw new EOFException();
        }
        B b7 = c1538g.f16062q;
        kotlin.jvm.internal.m.b(b7);
        int i = b7.f16029b;
        int i7 = b7.f16030c;
        if (i7 - i < 8) {
            j = ((((long) c1538g.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) c1538g.readInt()));
            c9 = '8';
            c10 = '\b';
            c7 = 24;
            c8 = '(';
        } else {
            byte[] bArr = b7.f16028a;
            c7 = 24;
            c8 = '(';
            c9 = '8';
            c10 = '\b';
            int i8 = i + 7;
            long j7 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i9 = i + 8;
            long j8 = j7 | (((long) bArr[i8]) & 255);
            c1538g.f16063r -= 8;
            if (i9 == i7) {
                c1538g.f16062q = b7.a();
                C.a(b7);
            } else {
                b7.f16029b = i9;
            }
            j = j8;
        }
        return ((j & 255) << c9) | (((-72057594037927936L) & j) >>> c9) | ((71776119061217280L & j) >>> c8) | ((280375465082880L & j) >>> c7) | ((1095216660480L & j) >>> c10) | ((4278190080L & j) << c10) | ((16711680 & j) << c7) | ((65280 & j) << c8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16027s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final C1541j k(long j) {
        Q(j);
        return this.f16026r.k(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final short n() {
        Q(2L);
        return this.f16026r.G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final boolean o(long j) {
        C1538g c1538g;
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        do {
            c1538g = this.f16026r;
            if (c1538g.f16063r >= j) {
                return true;
            }
        } while (this.f16025q.F(8192L, c1538g) != -1);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        C1538g c1538g = this.f16026r;
        if (c1538g.f16063r == 0 && this.f16025q.F(8192L, c1538g) == -1) {
            return -1;
        }
        return c1538g.read(sink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final byte readByte() {
        Q(1L);
        return this.f16026r.readByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final int readInt() {
        Q(4L);
        return this.f16026r.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final short readShort() {
        Q(2L);
        return this.f16026r.readShort();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final void skip(long j) {
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1538g c1538g = this.f16026r;
            if (c1538g.f16063r == 0 && this.f16025q.F(8192L, c1538g) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c1538g.f16063r);
            c1538g.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final boolean t(long j, C1541j bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        int iC = bytes.c();
        if (this.f16027s) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && iC >= 0 && bytes.c() >= iC) {
            for (int i = 0; i < iC; i++) {
                long j7 = ((long) i) + j;
                if (o(1 + j7) && this.f16026r.f(j7) == bytes.h(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "buffer(" + this.f16025q + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final String u() {
        return E(Long.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String v(long j) {
        Q(j);
        C1538g c1538g = this.f16026r;
        c1538g.getClass();
        return c1538g.K(j, J5.a.f2809a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final C1538g w() {
        return this.f16026r;
    }
}
