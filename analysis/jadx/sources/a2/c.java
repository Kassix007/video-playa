package a2;

import java.util.concurrent.Executor;
import n.C1388a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8750q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8750q) {
            case 0:
                runnable.run();
                break;
            default:
                C1388a.Q().f15119d.f15122e.execute(runnable);
                break;
        }
    }
}
