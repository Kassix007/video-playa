package x3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class E implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1893e f18389r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E(AbstractC1893e abstractC1893e, int i) {
        this.f18389r = abstractC1893e;
        this.f18388q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i7;
        AbstractC1893e abstractC1893e = this.f18389r;
        if (iBinder == null) {
            synchronized (abstractC1893e.f18437w) {
                i = abstractC1893e.f18421D;
            }
            if (i == 3) {
                abstractC1893e.f18428K = true;
                i7 = 5;
            } else {
                i7 = 4;
            }
            C c7 = abstractC1893e.f18436v;
            c7.sendMessage(c7.obtainMessage(i7, abstractC1893e.f18430M.get(), 16));
            return;
        }
        synchronized (abstractC1893e.f18438x) {
            try {
                AbstractC1893e abstractC1893e2 = this.f18389r;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1893e2.f18439y = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w)) ? new w(iBinder) : (w) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1893e abstractC1893e3 = this.f18389r;
        int i8 = this.f18388q;
        G g7 = new G(abstractC1893e3, 0, null);
        C c8 = abstractC1893e3.f18436v;
        c8.sendMessage(c8.obtainMessage(7, i8, -1, g7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1893e abstractC1893e;
        synchronized (this.f18389r.f18438x) {
            abstractC1893e = this.f18389r;
            abstractC1893e.f18439y = null;
        }
        int i = this.f18388q;
        C c7 = abstractC1893e.f18436v;
        c7.sendMessage(c7.obtainMessage(6, i, 1));
    }
}
