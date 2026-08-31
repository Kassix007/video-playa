package v3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.v0;
import java.util.Map;
import u3.InterfaceC1697b;

/* JADX INFO: loaded from: classes.dex */
public final class y extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f17607b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(v0 v0Var) {
        super(2);
        this.f17607b = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void a(Status status) {
        try {
            this.f17607b.C0(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void b(Exception exc) {
        try {
            this.f17607b.C0(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void c(o oVar) throws DeadObjectException {
        try {
            v0 v0Var = this.f17607b;
            InterfaceC1697b interfaceC1697b = oVar.f17583d;
            v0Var.getClass();
            try {
                v0Var.B0(interfaceC1697b);
            } catch (DeadObjectException e7) {
                v0Var.C0(new Status(8, e7.getLocalizedMessage(), null, null));
                throw e7;
            } catch (RemoteException e8) {
                v0Var.C0(new Status(8, e8.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e9) {
            b(e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void d(l lVar, boolean z5) {
        v0 v0Var = this.f17607b;
        ((Map) lVar.f17579r).put(v0Var, Boolean.valueOf(z5));
        k kVar = new k(lVar, v0Var);
        v0Var.getClass();
        synchronized (v0Var.f10317b) {
            if (v0Var.z0()) {
                ((Map) lVar.f17579r).remove(v0Var);
            } else {
                v0Var.f10319d.add(kVar);
            }
        }
    }
}
