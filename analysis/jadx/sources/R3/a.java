package R3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.z0;
import u3.InterfaceC1697b;
import u3.f;
import x3.AbstractC1896h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1896h implements InterfaceC1697b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f6705P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final z0 f6706Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Bundle f6707R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Integer f6708S;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(Context context, Looper looper, z0 z0Var, Bundle bundle, u3.e eVar, f fVar) {
        super(context, looper, 44, z0Var, eVar, fVar, 0);
        this.f6705P = true;
        this.f6706Q = z0Var;
        this.f6707R = bundle;
        this.f6708S = (Integer) z0Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final int e() {
        return 12451000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e, u3.InterfaceC1697b
    public final boolean k() {
        return this.f6705P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final Bundle r() {
        z0 z0Var = this.f6706Q;
        boolean zEquals = this.f18433s.getPackageName().equals((String) z0Var.f15877c);
        Bundle bundle = this.f6707R;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) z0Var.f15877c);
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
