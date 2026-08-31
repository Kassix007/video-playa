package Q2;

import java.io.IOException;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class v implements AutoCloseable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1540i f6586q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [D5.a.k(d6.u):Q2.u] */
    public /* synthetic */ v(InterfaceC1540i interfaceC1540i) {
        this.f6586q = interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6586q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return kotlin.jvm.internal.m.a(this.f6586q, ((v) obj).f6586q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6586q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SourceResponseBody(source=" + this.f6586q + ')';
    }
}
