package O3;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: O3.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0324t1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f5083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0330v1 f5084s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0324t1(ServiceConnectionC0330v1 serviceConnectionC0330v1, I i, int i7) {
        this.f5082q = i7;
        this.f5083r = i;
        this.f5084s = serviceConnectionC0330v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5082q) {
            case 0:
                ServiceConnectionC0330v1 serviceConnectionC0330v1 = this.f5084s;
                synchronized (serviceConnectionC0330v1) {
                    try {
                        serviceConnectionC0330v1.f5098q = false;
                        C0333w1 c0333w1 = serviceConnectionC0330v1.f5100s;
                        if (!c0333w1.F()) {
                            X x6 = ((C0323t0) c0333w1.f4346r).f5077v;
                            C0323t0.l(x6);
                            x6.f4666E.b("Connected to service");
                            I i = this.f5083r;
                            c0333w1.o();
                            c0333w1.f5109u = i;
                            c0333w1.B();
                            c0333w1.D();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                ServiceConnectionC0330v1 serviceConnectionC0330v12 = this.f5084s;
                synchronized (serviceConnectionC0330v12) {
                    try {
                        serviceConnectionC0330v12.f5098q = false;
                        C0333w1 c0333w12 = serviceConnectionC0330v12.f5100s;
                        if (!c0333w12.F()) {
                            X x7 = ((C0323t0) c0333w12.f4346r).f5077v;
                            C0323t0.l(x7);
                            x7.f4665D.b("Connected to remote service");
                            I i7 = this.f5083r;
                            c0333w12.o();
                            c0333w12.f5109u = i7;
                            c0333w12.B();
                            c0333w12.D();
                        }
                    } finally {
                    }
                    break;
                }
                C0333w1 c0333w13 = this.f5084s.f5100s;
                ScheduledExecutorService scheduledExecutorService = c0333w13.f5112x;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c0333w13.f5112x = null;
                    return;
                }
                return;
        }
    }
}
