package q6;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReentrantLock f16088s = new ReentrantLock();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RandomAccessFile f16089t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(RandomAccessFile randomAccessFile) {
        this.f16089t = randomAccessFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k a(long j) {
        ReentrantLock reentrantLock = this.f16088s;
        reentrantLock.lock();
        try {
            if (this.f16086q) {
                throw new IllegalStateException("closed");
            }
            this.f16087r++;
            reentrantLock.unlock();
            return new k(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f16088s;
        reentrantLock.lock();
        try {
            if (this.f16086q) {
                return;
            }
            this.f16086q = true;
            if (this.f16087r != 0) {
                return;
            }
            synchronized (this) {
                this.f16089t.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f16088s;
        reentrantLock.lock();
        try {
            if (this.f16086q) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f16089t.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
