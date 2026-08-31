package z3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.d;
import p3.z0;
import v3.o;
import x3.AbstractC1896h;
import x3.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1896h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final n f18744P;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Context context, Looper looper, z0 z0Var, n nVar, o oVar, o oVar2) {
        super(context, looper, 270, z0Var, oVar, oVar2, 0);
        this.f18744P = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final int e() {
        return 203400000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C1965a ? (C1965a) iInterfaceQueryLocalInterface : new C1965a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final d[] q() {
        return I3.c.f2414b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final Bundle r() {
        n nVar = this.f18744P;
        nVar.getClass();
        Bundle bundle = new Bundle();
        String str = nVar.f18501a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final boolean w() {
        return true;
    }
}
