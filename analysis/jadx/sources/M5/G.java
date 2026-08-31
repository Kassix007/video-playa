package M5;

import java.util.concurrent.Executor;
import q5.C1530i;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0257s f3810q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(AbstractC0257s abstractC0257s) {
        this.f3810q = abstractC0257s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0257s abstractC0257s = this.f3810q;
        C1530i c1530i = C1530i.f16022q;
        if (R5.b.j(abstractC0257s, c1530i)) {
            R5.b.i(abstractC0257s, c1530i, runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f3810q.toString();
    }
}
