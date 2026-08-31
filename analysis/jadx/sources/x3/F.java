package x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class F extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f18390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1893e f18391h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC1893e abstractC1893e, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC1893e, i, bundle);
        this.f18391h = abstractC1893e;
        this.f18390g = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.u
    public final void a(com.google.android.gms.common.b bVar) {
        InterfaceC1891c interfaceC1891c = this.f18391h.f18423F;
        if (interfaceC1891c != null) {
            interfaceC1891c.onConnectionFailed(bVar);
        }
        System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.u
    public final boolean b() {
        IBinder iBinder = this.f18390g;
        try {
            AbstractC1887A.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1893e abstractC1893e = this.f18391h;
            if (!abstractC1893e.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC1893e.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceO = abstractC1893e.o(iBinder);
            if (iInterfaceO == null || !(AbstractC1893e.x(abstractC1893e, 2, 4, iInterfaceO) || AbstractC1893e.x(abstractC1893e, 3, 4, iInterfaceO))) {
                return false;
            }
            abstractC1893e.f18427J = null;
            InterfaceC1890b interfaceC1890b = abstractC1893e.f18422E;
            if (interfaceC1890b == null) {
                return true;
            }
            interfaceC1890b.f();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
