package M5;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: M5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244e implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3845b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0244e(int i, Object obj) {
        this.f3844a = i;
        this.f3845b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f3844a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3845b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((B5.c) this.f3845b).getClass().getSimpleName() + '@' + AbstractC0263y.m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((J) this.f3845b) + ']';
        }
    }
}
