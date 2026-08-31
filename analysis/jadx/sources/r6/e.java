package r6;

import java.io.IOException;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.G;
import q6.o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16378t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(G g7, long j, boolean z5) {
        super(g7);
        this.f16376r = j;
        this.f16377s = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.o, q6.G
    public final long F(long j, C1538g sink) throws IOException {
        m.e(sink, "sink");
        long j7 = this.f16378t;
        long j8 = this.f16376r;
        if (j7 > j8) {
            j = 0;
        } else if (this.f16377s) {
            long j9 = j8 - j7;
            if (j9 == 0) {
                return -1L;
            }
            j = Math.min(j, j9);
        }
        long jF = super.F(j, sink);
        if (jF != -1) {
            this.f16378t += jF;
        }
        long j10 = this.f16378t;
        if ((j10 >= j8 || jF != -1) && j10 <= j8) {
            return jF;
        }
        if (jF > 0 && j10 > j8) {
            long j11 = sink.f16063r - (j10 - j8);
            C1538g c1538g = new C1538g();
            c1538g.d0(sink);
            sink.Z(j11, c1538g);
            c1538g.a();
        }
        throw new IOException("expected " + j8 + " bytes but got " + this.f16378t);
    }
}
