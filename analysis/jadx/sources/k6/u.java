package k6;

import java.net.SocketTimeoutException;
import q6.C1535d;

/* JADX INFO: loaded from: classes.dex */
public final class u extends C1535d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f14225m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(v vVar) {
        this.f14225m = vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1535d
    public final void j() {
        this.f14225m.e(9);
        n nVar = this.f14225m.f14227b;
        synchronized (nVar) {
            long j = nVar.f14176D;
            long j7 = nVar.f14175C;
            if (j < j7) {
                return;
            }
            nVar.f14175C = j7 + 1;
            nVar.f14177E = System.nanoTime() + ((long) 1000000000);
            nVar.f14195x.c(new g6.b(k1.i.k(new StringBuilder(), nVar.f14190s, " ping"), nVar, 2), 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
