package q6;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC1539h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E f16101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1538g f16102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16103s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(E sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f16101q = sink;
        this.f16102r = new C1538g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h R(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.i0(string);
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.Z(j, source);
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1539h a() {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        C1538g c1538g = this.f16102r;
        long jB = c1538g.b();
        if (jB > 0) {
            this.f16101q.Z(jB, c1538g);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1539h b(long j) {
        boolean z5;
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        C1538g c1538g = this.f16102r;
        c1538g.getClass();
        if (j == 0) {
            c1538g.e0(48);
        } else {
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    c1538g.i0("-9223372036854775808");
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
            byte[] bArr = r6.a.f16366a;
            int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
            int i = iNumberOfLeadingZeros + (j > r6.a.f16367b[iNumberOfLeadingZeros] ? 1 : 0);
            if (z5) {
                i++;
            }
            B bA0 = c1538g.a0(i);
            byte[] bArr2 = bA0.f16028a;
            int i7 = bA0.f16030c + i;
            while (j != 0) {
                long j7 = 10;
                i7--;
                bArr2[i7] = r6.a.f16366a[(int) (j % j7)];
                j /= j7;
            }
            if (z5) {
                bArr2[i7 - 1] = 45;
            }
            bA0.f16030c += i;
            c1538g.f16063r += (long) i;
        }
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        E e7 = this.f16101q;
        if (this.f16103s) {
            return;
        }
        try {
            C1538g c1538g = this.f16102r;
            long j = c1538g.f16063r;
            if (j > 0) {
                e7.Z(j, c1538g);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            e7.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16103s = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        return this.f16101q.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h, q6.E, java.io.Flushable
    public final void flush() {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        C1538g c1538g = this.f16102r;
        long j = c1538g.f16063r;
        E e7 = this.f16101q;
        if (j > 0) {
            e7.Z(j, c1538g);
        }
        e7.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h i(C1541j byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.c0(byteString);
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16103s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h j(long j) {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.f0(j);
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "buffer(" + this.f16101q + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f16102r.write(source);
        a();
        return iWrite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h writeByte(int i) {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.e0(i);
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h writeInt(int i) {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.g0(i);
        a();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h writeShort(int i) {
        if (this.f16103s) {
            throw new IllegalStateException("closed");
        }
        this.f16102r.h0(i);
        a();
        return this;
    }

    @Override // q6.InterfaceC1539h
    public final InterfaceC1539h write(byte[] bArr) {
        if (!this.f16103s) {
            this.f16102r.m21write(bArr);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
