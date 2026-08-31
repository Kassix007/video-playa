package O3;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.S f4694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4695b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Z1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.S s6) {
        this.f4695b = appMeasurementDynamiteService;
        this.f4694a = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.M0
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f4694a.j(str, str2, bundle, j);
        } catch (RemoteException e7) {
            C0323t0 c0323t0 = this.f4695b.f11336c;
            if (c0323t0 != null) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.c(e7, "Event listener threw exception");
            }
        }
    }
}
