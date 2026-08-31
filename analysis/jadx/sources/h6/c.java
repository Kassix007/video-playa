package h6;

import L.s;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.G;
import q6.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f13471w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, G delegate, long j) {
        super(delegate);
        m.e(delegate, "delegate");
        this.f13471w = sVar;
        this.f13466r = j;
        this.f13468t = true;
        if (j == 0) {
            a(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.o, q6.G
    public final long F(long j, C1538g sink) throws IOException {
        m.e(sink, "sink");
        if (this.f13470v) {
            throw new IllegalStateException("closed");
        }
        try {
            long jF = this.f16075q.F(j, sink);
            if (this.f13468t) {
                this.f13468t = false;
            }
            if (jF == -1) {
                a(null);
                return -1L;
            }
            long j7 = this.f13467s + jF;
            long j8 = this.f13466r;
            if (j8 == -1 || j7 <= j8) {
                this.f13467s = j7;
                if (j7 == j8) {
                    a(null);
                }
                return jF;
            }
            throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
        } catch (IOException e7) {
            throw a(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException a(IOException iOException) {
        if (this.f13469u) {
            return iOException;
        }
        this.f13469u = true;
        if (iOException == null && this.f13468t) {
            this.f13468t = false;
        }
        return this.f13471w.a(true, false, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13470v) {
            return;
        }
        this.f13470v = true;
        try {
            super.close();
            a(null);
        } catch (IOException e7) {
            throw a(e7);
        }
    }
}
