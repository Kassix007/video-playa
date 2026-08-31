package L2;

import java.nio.ByteBuffer;
import q6.C1538g;
import q6.G;
import q6.I;

/* JADX INFO: loaded from: classes.dex */
public final class d implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ByteBuffer f3255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3256r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f3255q = byteBufferSlice;
        this.f3256r = byteBufferSlice.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g c1538g) {
        ByteBuffer byteBuffer = this.f3255q;
        int iPosition = byteBuffer.position();
        int i = this.f3256r;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return c1538g.write(byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return I.f16040d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
