package O3;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: O3.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0315q0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.L f5024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f5025s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0315q0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l7, int i) {
        this.f5023q = i;
        this.f5024r = l7;
        this.f5025s = appMeasurementDynamiteService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5023q) {
            case 0:
                C0333w1 c0333w1O = this.f5025s.f11336c.o();
                com.google.android.gms.internal.measurement.L l7 = this.f5024r;
                c0333w1O.o();
                c0333w1O.p();
                c0333w1O.C(new RunnableC0335x0(c0333w1O, c0333w1O.E(false), l7, 6));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f5025s;
                Y1 y12 = appMeasurementDynamiteService.f11336c.f5080y;
                C0323t0.j(y12);
                C0323t0 c0323t0 = appMeasurementDynamiteService.f11336c;
                y12.a0(this.f5024r, c0323t0.f5066O != null && c0323t0.f5066O.booleanValue());
                break;
        }
    }
}
