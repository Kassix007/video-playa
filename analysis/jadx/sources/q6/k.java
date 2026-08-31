package q6;

import C0.S;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class k implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f16068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16070s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(s sVar, long j) {
        this.f16068q = sVar;
        this.f16069r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) {
        long j7;
        long j8;
        int i;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.f16070s) {
            throw new IllegalStateException("closed");
        }
        s sVar = this.f16068q;
        long j9 = this.f16069r;
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        long j10 = j + j9;
        long j11 = j9;
        while (true) {
            if (j11 >= j10) {
                j7 = -1;
                break;
            }
            B bA0 = sink.a0(1);
            byte[] array = bA0.f16028a;
            int i7 = bA0.f16030c;
            j7 = -1;
            int iMin = (int) Math.min(j10 - j11, 8192 - i7);
            synchronized (sVar) {
                kotlin.jvm.internal.m.e(array, "array");
                sVar.f16089t.seek(j11);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i8 = sVar.f16089t.read(array, i7, iMin - i);
                    if (i8 != -1) {
                        i += i8;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (bA0.f16029b == bA0.f16030c) {
                    sink.f16062q = bA0.a();
                    C.a(bA0);
                }
                if (j9 == j11) {
                    j8 = -1;
                }
            } else {
                bA0.f16030c += i;
                long j12 = i;
                j11 += j12;
                sink.f16063r += j12;
            }
        }
        j8 = j11 - j9;
        if (j8 != j7) {
            this.f16069r += j8;
        }
        return j8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.f16068q;
        if (this.f16070s) {
            return;
        }
        this.f16070s = true;
        ReentrantLock reentrantLock = sVar.f16088s;
        reentrantLock.lock();
        try {
            int i = sVar.f16087r - 1;
            sVar.f16087r = i;
            if (i == 0) {
                if (sVar.f16086q) {
                    synchronized (sVar) {
                        sVar.f16089t.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return I.f16040d;
    }
}
