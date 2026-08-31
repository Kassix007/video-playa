package O3;

import android.os.IBinder;
import android.os.IInterface;
import x3.AbstractC1893e;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1893e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final int e() {
        return 12451000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(iBinder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
