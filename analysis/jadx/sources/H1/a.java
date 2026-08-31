package H1;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f2074r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(f fVar) {
        this.f2074r = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j7 = this.f2073q;
            f fVar = this.f2074r;
            if (j7 != j) {
                if (j7 >= 0 && j >= j7 + ((long) fVar.f2075q.available())) {
                    return -1;
                }
                fVar.b(j);
                this.f2073q = j;
            }
            if (i7 > fVar.f2075q.available()) {
                i7 = fVar.f2075q.available();
            }
            int i8 = fVar.read(bArr, i, i7);
            if (i8 >= 0) {
                this.f2073q += (long) i8;
                return i8;
            }
        } catch (IOException unused) {
        }
        this.f2073q = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
