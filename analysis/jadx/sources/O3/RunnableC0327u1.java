package O3;

import android.os.RemoteException;

/* JADX INFO: renamed from: O3.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327u1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f5090r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0327u1(C0333w1 c0333w1, int i) {
        this.f5089q = i;
        this.f5090r = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5089q) {
            case 0:
                this.f5090r.u();
                break;
            case 1:
                C0333w1 c0333w1 = this.f5090r;
                C0323t0 c0323t0 = (C0323t0) c0333w1.f4346r;
                I i = c0333w1.f5109u;
                if (i == null) {
                    X x6 = c0323t0.f5077v;
                    C0323t0.l(x6);
                    x6.f4670w.b("Failed to send Dma consent settings to service");
                } else {
                    try {
                        i.C(c0333w1.E(false));
                        c0333w1.B();
                    } catch (RemoteException e7) {
                        X x7 = c0323t0.f5077v;
                        C0323t0.l(x7);
                        x7.f4670w.c(e7, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                C0333w1 c0333w12 = this.f5090r;
                C0323t0 c0323t02 = (C0323t0) c0333w12.f4346r;
                I i7 = c0333w12.f5109u;
                if (i7 == null) {
                    X x8 = c0323t02.f5077v;
                    C0323t0.l(x8);
                    x8.f4670w.b("Failed to send storage consent settings to service");
                } else {
                    try {
                        i7.s(c0333w12.E(false));
                        c0333w12.B();
                    } catch (RemoteException e8) {
                        X x9 = c0323t02.f5077v;
                        C0323t0.l(x9);
                        x9.f4670w.c(e8, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
