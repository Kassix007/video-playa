package q6;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1533b implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16051s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1533b(int i, Object obj, Object obj2) {
        this.f16049q = i;
        this.f16050r = obj;
        this.f16051s = obj2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) throws IOException {
        switch (this.f16049q) {
            case 0:
                kotlin.jvm.internal.m.e(source, "source");
                Q2.g.o(source.f16063r, 0L, j);
                long j7 = j;
                while (true) {
                    long j8 = 0;
                    if (j7 <= 0) {
                        return;
                    }
                    B b7 = source.f16062q;
                    kotlin.jvm.internal.m.b(b7);
                    while (true) {
                        if (j8 < 65536) {
                            j8 += (long) (b7.f16030c - b7.f16029b);
                            if (j8 >= j7) {
                                j8 = j7;
                            } else {
                                b7 = b7.f;
                                kotlin.jvm.internal.m.b(b7);
                            }
                        }
                    }
                    F f = (F) this.f16050r;
                    C1533b c1533b = (C1533b) this.f16051s;
                    f.h();
                    try {
                        try {
                            c1533b.Z(j8, source);
                            if (f.i()) {
                                throw f.k(null);
                            }
                            j7 -= j8;
                        } catch (IOException e7) {
                            if (!f.i()) {
                                throw e7;
                            }
                            throw f.k(e7);
                        }
                    } catch (Throwable th) {
                        f.i();
                        throw th;
                    }
                }
                break;
            default:
                kotlin.jvm.internal.m.e(source, "source");
                Q2.g.o(source.f16063r, 0L, j);
                while (j > 0) {
                    ((I) this.f16051s).f();
                    B b8 = source.f16062q;
                    kotlin.jvm.internal.m.b(b8);
                    int iMin = (int) Math.min(j, b8.f16030c - b8.f16029b);
                    ((OutputStream) this.f16050r).write(b8.f16028a, b8.f16029b, iMin);
                    int i = b8.f16029b + iMin;
                    b8.f16029b = i;
                    long j9 = iMin;
                    j -= j9;
                    source.f16063r -= j9;
                    if (i == b8.f16030c) {
                        source.f16062q = b8.a();
                        C.a(b8);
                    }
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f16049q) {
            case 0:
                F f = (F) this.f16050r;
                C1533b c1533b = (C1533b) this.f16051s;
                f.h();
                try {
                    c1533b.close();
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
                ((OutputStream) this.f16050r).close();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        switch (this.f16049q) {
            case 0:
                return (F) this.f16050r;
            default:
                return (I) this.f16051s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f16049q) {
            case 0:
                F f = (F) this.f16050r;
                C1533b c1533b = (C1533b) this.f16051s;
                f.h();
                try {
                    c1533b.flush();
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
                ((OutputStream) this.f16050r).flush();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f16049q) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1533b) this.f16051s) + ')';
            default:
                return "sink(" + ((OutputStream) this.f16050r) + ')';
        }
    }
}
