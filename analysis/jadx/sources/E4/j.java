package E4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import z4.C1978l;
import z4.C1979m;
import z4.C1980n;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1737r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(int i, Object obj) {
        this.f1736q = i;
        this.f1737r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f1736q) {
            case 0:
                k kVar = (k) this.f1737r;
                kVar.f1740b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                kVar.a().post(new D4.d(this, iBinder));
                break;
            default:
                C1980n c1980n = (C1980n) this.f1737r;
                c1980n.f18761b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c1980n.a().post(new C1979m(this, iBinder));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f1736q) {
            case 0:
                k kVar = (k) this.f1737r;
                kVar.f1740b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                kVar.a().post(new i(1, this));
                break;
            default:
                C1980n c1980n = (C1980n) this.f1737r;
                c1980n.f18761b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c1980n.a().post(new C1978l(1, this));
                break;
        }
    }
}
