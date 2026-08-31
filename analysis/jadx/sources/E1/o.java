package E1;

import E.c0;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l6.d f1651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1652b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(l6.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1651a = dVar;
        this.f1652b = threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void A(c0 c0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f1652b;
        try {
            this.f1651a.A(c0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void z(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1652b;
        try {
            this.f1651a.z(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
