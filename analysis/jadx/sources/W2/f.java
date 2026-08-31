package w2;

import J5.i;
import java.io.EOFException;
import java.io.IOException;
import q6.C1538g;
import q6.E;
import q6.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f18278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18279s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(E e7, i iVar) {
        super(e7);
        this.f18278r = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E
    public final void Z(long j, C1538g c1538g) throws EOFException {
        if (this.f18279s) {
            c1538g.skip(j);
            return;
        }
        try {
            super.Z(j, c1538g);
        } catch (IOException e7) {
            this.f18279s = true;
            this.f18278r.invoke(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e7) {
            this.f18279s = true;
            this.f18278r.invoke(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.n, q6.E, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e7) {
            this.f18279s = true;
            this.f18278r.invoke(e7);
        }
    }
}
