package J2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m extends InputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InputStream f2778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2779s = 1073741824;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(InputStream inputStream, int i) {
        this.f2777q = i;
        this.f2778r = inputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        switch (this.f2777q) {
        }
        return this.f2779s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f2777q) {
            case 0:
                this.f2778r.close();
                break;
            default:
                this.f2778r.close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2777q) {
            case 0:
                int i = this.f2778r.read();
                if (i == -1) {
                    this.f2779s = 0;
                }
                return i;
            default:
                int i7 = this.f2778r.read();
                if (i7 == -1) {
                    this.f2779s = 0;
                }
                return i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j) {
        switch (this.f2777q) {
        }
        return this.f2778r.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        switch (this.f2777q) {
            case 0:
                int i = this.f2778r.read(bArr);
                if (i == -1) {
                    this.f2779s = 0;
                }
                return i;
            default:
                int i7 = this.f2778r.read(bArr);
                if (i7 == -1) {
                    this.f2779s = 0;
                }
                return i7;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i7) throws IOException {
        switch (this.f2777q) {
            case 0:
                int i8 = this.f2778r.read(bArr, i, i7);
                if (i8 == -1) {
                    this.f2779s = 0;
                }
                return i8;
            default:
                int i9 = this.f2778r.read(bArr, i, i7);
                if (i9 == -1) {
                    this.f2779s = 0;
                }
                return i9;
        }
    }
}
