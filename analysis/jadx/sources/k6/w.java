package k6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q6.C1538g;
import q6.InterfaceC1539h;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f14237v = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1539h f14238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1538g f14239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f14242u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(q6.z sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f14238q = sink;
        C1538g c1538g = new C1538g();
        this.f14239r = c1538g;
        this.f14240s = 16384;
        this.f14242u = new d(c1538g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a(z peerSettings) {
        try {
            kotlin.jvm.internal.m.e(peerSettings, "peerSettings");
            if (this.f14241t) {
                throw new IOException("closed");
            }
            int i = this.f14240s;
            int i7 = peerSettings.f14247a;
            if ((i7 & 32) != 0) {
                i = peerSettings.f14248b[5];
            }
            this.f14240s = i;
            if (((i7 & 2) != 0 ? peerSettings.f14248b[1] : -1) != -1) {
                d dVar = this.f14242u;
                int i8 = (i7 & 2) != 0 ? peerSettings.f14248b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i8, 16384);
                int i9 = dVar.f14149d;
                if (i9 != iMin) {
                    if (iMin < i9) {
                        dVar.f14147b = Math.min(dVar.f14147b, iMin);
                    }
                    dVar.f14148c = true;
                    dVar.f14149d = iMin;
                    int i10 = dVar.f14152h;
                    if (iMin < i10) {
                        if (iMin == 0) {
                            b[] bVarArr = dVar.f14150e;
                            n5.k.J0(0, bVarArr.length, null, bVarArr);
                            dVar.f = dVar.f14150e.length - 1;
                            dVar.f14151g = 0;
                            dVar.f14152h = 0;
                        } else {
                            dVar.a(i10 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f14238q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void b(boolean z5, int i, C1538g c1538g, int i7) {
        if (this.f14241t) {
            throw new IOException("closed");
        }
        c(i, i7, 0, z5 ? 1 : 0);
        if (i7 > 0) {
            InterfaceC1539h interfaceC1539h = this.f14238q;
            kotlin.jvm.internal.m.b(c1538g);
            interfaceC1539h.Z(i7, c1538g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, int i7, int i8, int i9) {
        Level level = Level.FINE;
        Logger logger = f14237v;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i7, i8, i9));
        }
        if (i7 > this.f14240s) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f14240s + ": " + i7).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(k1.i.i(i, "reserved bit set: ").toString());
        }
        byte[] bArr = e6.b.f12673a;
        InterfaceC1539h interfaceC1539h = this.f14238q;
        kotlin.jvm.internal.m.e(interfaceC1539h, "<this>");
        interfaceC1539h.writeByte((i7 >>> 16) & 255);
        interfaceC1539h.writeByte((i7 >>> 8) & 255);
        interfaceC1539h.writeByte(i7 & 255);
        interfaceC1539h.writeByte(i8 & 255);
        interfaceC1539h.writeByte(i9 & 255);
        interfaceC1539h.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f14241t = true;
        this.f14238q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void e(byte[] bArr, int i, int i7) {
        k1.i.p(i7, "errorCode");
        if (this.f14241t) {
            throw new IOException("closed");
        }
        if (O.c.a(i7) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, bArr.length + 8, 7, 0);
        this.f14238q.writeInt(i);
        this.f14238q.writeInt(O.c.a(i7));
        if (bArr.length != 0) {
            this.f14238q.write(bArr);
        }
        this.f14238q.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void f(boolean z5, int i, ArrayList arrayList) {
        if (this.f14241t) {
            throw new IOException("closed");
        }
        this.f14242u.d(arrayList);
        long j = this.f14239r.f16063r;
        long jMin = Math.min(this.f14240s, j);
        int i7 = j == jMin ? 4 : 0;
        if (z5) {
            i7 |= 1;
        }
        c(i, (int) jMin, 1, i7);
        this.f14238q.Z(jMin, this.f14239r);
        if (j > jMin) {
            long j7 = j - jMin;
            while (j7 > 0) {
                long jMin2 = Math.min(this.f14240s, j7);
                j7 -= jMin2;
                c(i, (int) jMin2, 9, j7 == 0 ? 4 : 0);
                this.f14238q.Z(jMin2, this.f14239r);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void flush() {
        if (this.f14241t) {
            throw new IOException("closed");
        }
        this.f14238q.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void n(int i, int i7, boolean z5) {
        if (this.f14241t) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z5 ? 1 : 0);
        this.f14238q.writeInt(i);
        this.f14238q.writeInt(i7);
        this.f14238q.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void v(int i, int i7) {
        k1.i.p(i7, "errorCode");
        if (this.f14241t) {
            throw new IOException("closed");
        }
        if (O.c.a(i7) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i, 4, 3, 0);
        this.f14238q.writeInt(O.c.a(i7));
        this.f14238q.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void z(int i, long j) {
        if (this.f14241t) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        c(i, 4, 8, 0);
        this.f14238q.writeInt((int) j);
        this.f14238q.flush();
    }
}
