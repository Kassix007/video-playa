package h6;

import L.s;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.E;
import q6.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f13465v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, E delegate, long j) {
        super(delegate);
        m.e(delegate, "delegate");
        this.f13465v = sVar;
        this.f13461r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E
    public final void Z(long j, C1538g source) throws IOException {
        m.e(source, "source");
        if (this.f13464u) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f13461r;
        if (j7 == -1 || this.f13463t + j <= j7) {
            try {
                super.Z(j, source);
                this.f13463t += j;
                return;
            } catch (IOException e7) {
                throw a(e7);
            }
        }
        throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f13463t + j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException a(IOException iOException) {
        if (this.f13462s) {
            return iOException;
        }
        this.f13462s = true;
        return this.f13465v.a(false, true, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13464u) {
            return;
        }
        this.f13464u = true;
        long j = this.f13461r;
        if (j != -1 && this.f13463t != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e7) {
            throw a(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e7) {
            throw a(e7);
        }
    }
}
