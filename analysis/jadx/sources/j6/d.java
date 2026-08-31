package j6;

import C0.S;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import q6.C1538g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f13904u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, long j) {
        super(fVar);
        this.f13904u = fVar;
        this.f13903t = j;
        if (j == 0) {
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j6.a, q6.G
    public final long F(long j, C1538g sink) throws IOException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        if (this.f13894r) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f13903t;
        if (j7 == 0) {
            return -1L;
        }
        long jF = super.F(Math.min(j7, j), sink);
        if (jF == -1) {
            this.f13904u.f13907b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j8 = this.f13903t - jF;
        this.f13903t = j8;
        if (j8 == 0) {
            a();
        }
        return jF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zQ;
        if (this.f13894r) {
            return;
        }
        if (this.f13903t != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = e6.b.f12673a;
            m.e(timeUnit, "timeUnit");
            try {
                zQ = e6.b.q(this, 100);
            } catch (IOException unused) {
                zQ = false;
            }
            if (!zQ) {
                this.f13904u.f13907b.k();
                a();
            }
        }
        this.f13894r = true;
    }
}
