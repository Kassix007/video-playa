package g6;

import O3.Y;
import h6.j;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import k6.n;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13180e;
    public final /* synthetic */ Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f13180e = i;
        this.f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        switch (this.f13180e) {
            case 0:
                ((B5.a) this.f).invoke();
                return -1L;
            case 1:
                Y y6 = (Y) this.f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                j jVar = null;
                int i7 = 0;
                for (j connection : (ConcurrentLinkedQueue) y6.f4683e) {
                    m.d(connection, "connection");
                    synchronized (connection) {
                        if (y6.b(connection, jNanoTime) > 0) {
                            i7++;
                        } else {
                            i++;
                            long j7 = jNanoTime - connection.f13512q;
                            if (j7 > j) {
                                jVar = connection;
                                j = j7;
                            }
                        }
                    }
                }
                long j8 = y6.f4680b;
                if (j < j8 && i <= 5) {
                    if (i > 0) {
                        return j8 - j;
                    }
                    if (i7 > 0) {
                        return j8;
                    }
                    return -1L;
                }
                m.b(jVar);
                synchronized (jVar) {
                    if (!jVar.f13511p.isEmpty()) {
                        return 0L;
                    }
                    if (jVar.f13512q + j != jNanoTime) {
                        return 0L;
                    }
                    jVar.j = true;
                    ((ConcurrentLinkedQueue) y6.f4683e).remove(jVar);
                    Socket socket = jVar.f13502d;
                    m.b(socket);
                    e6.b.c(socket);
                    if (!((ConcurrentLinkedQueue) y6.f4683e).isEmpty()) {
                        return 0L;
                    }
                    ((c) y6.f4681c).a();
                    return 0L;
                }
            default:
                n nVar = (n) this.f;
                nVar.getClass();
                try {
                    nVar.f14185M.n(2, 0, false);
                    return -1L;
                } catch (IOException e7) {
                    nVar.a(2, 2, e7);
                    return -1L;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y y6, String str) {
        super(str, true);
        this.f13180e = 1;
        this.f = y6;
    }
}
