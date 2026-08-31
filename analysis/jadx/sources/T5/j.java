package T5;

import C0.S;
import M5.AbstractC0263y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f7475s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Runnable runnable, long j, boolean z5) {
        super(z5, j);
        this.f7475s = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f7475s.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7475s;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0263y.m(runnable));
        sb.append(", ");
        sb.append(this.f7473q);
        sb.append(", ");
        return S.p(sb, this.f7474r ? "Blocking" : "Non-blocking", ']');
    }
}
