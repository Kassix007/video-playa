package q6;

import C0.S;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class r implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f16082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Inflater f16083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16085t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(A a7, Inflater inflater) {
        this.f16082q = a7;
        this.f16083r = inflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) throws IOException {
        long j7;
        kotlin.jvm.internal.m.e(sink, "sink");
        while (j >= 0) {
            if (this.f16085t) {
                throw new IllegalStateException("closed");
            }
            A a7 = this.f16082q;
            Inflater inflater = this.f16083r;
            if (j == 0) {
                j7 = 0;
            } else {
                try {
                    B bA0 = sink.a0(1);
                    int iMin = (int) Math.min(j, 8192 - bA0.f16030c);
                    if (inflater.needsInput() && !a7.a()) {
                        B b7 = a7.f16026r.f16062q;
                        kotlin.jvm.internal.m.b(b7);
                        int i = b7.f16030c;
                        int i7 = b7.f16029b;
                        int i8 = i - i7;
                        this.f16084s = i8;
                        inflater.setInput(b7.f16028a, i7, i8);
                    }
                    int iInflate = inflater.inflate(bA0.f16028a, bA0.f16030c, iMin);
                    int i9 = this.f16084s;
                    if (i9 != 0) {
                        int remaining = i9 - inflater.getRemaining();
                        this.f16084s -= remaining;
                        a7.skip(remaining);
                    }
                    if (iInflate > 0) {
                        bA0.f16030c += iInflate;
                        j7 = iInflate;
                        sink.f16063r += j7;
                    } else {
                        if (bA0.f16029b == bA0.f16030c) {
                            sink.f16062q = bA0.a();
                            C.a(bA0);
                        }
                        j7 = 0;
                    }
                } catch (DataFormatException e7) {
                    throw new IOException(e7);
                }
            }
            if (j7 > 0) {
                return j7;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (a7.a()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16085t) {
            return;
        }
        this.f16083r.end();
        this.f16085t = true;
        this.f16082q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f16082q.f16025q.d();
    }
}
