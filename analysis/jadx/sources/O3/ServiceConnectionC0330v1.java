package O3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import x3.AbstractC1887A;
import x3.InterfaceC1890b;
import x3.InterfaceC1891c;

/* JADX INFO: renamed from: O3.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0330v1 implements ServiceConnection, InterfaceC1890b, InterfaceC1891c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f5098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile S f5099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f5100s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServiceConnectionC0330v1(C0333w1 c0333w1) {
        this.f5100s = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1890b
    public final void f() {
        C0312p0 c0312p0 = ((C0323t0) this.f5100s.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.t();
        synchronized (this) {
            try {
                AbstractC1887A.g(this.f5099r);
                I i = (I) this.f5099r.t();
                C0312p0 c0312p02 = ((C0323t0) this.f5100s.f4346r).f5078w;
                C0323t0.l(c0312p02);
                c0312p02.x(new RunnableC0324t1(this, i, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5099r = null;
                this.f5098q = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1891c
    public final void onConnectionFailed(com.google.android.gms.common.b bVar) {
        C0333w1 c0333w1 = this.f5100s;
        C0312p0 c0312p0 = ((C0323t0) c0333w1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.t();
        X x6 = ((C0323t0) c0333w1.f4346r).f5077v;
        if (x6 == null || !x6.f4356s) {
            x6 = null;
        }
        if (x6 != null) {
            x6.f4666E.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f5098q = false;
            this.f5099r = null;
        }
        C0312p0 c0312p02 = ((C0323t0) this.f5100s.f4346r).f5078w;
        C0323t0.l(c0312p02);
        c0312p02.x(new I4.a(15, (Object) this, (Object) bVar, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1890b
    public final void onConnectionSuspended(int i) {
        C0323t0 c0323t0 = (C0323t0) this.f5100s.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.t();
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4665D.b("Service connection suspended");
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.x(new A1.b(7, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0312p0 c0312p0 = ((C0323t0) this.f5100s.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.t();
        synchronized (this) {
            if (iBinder == null) {
                this.f5098q = false;
                X x6 = ((C0323t0) this.f5100s.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4670w.b("Service connected with null binder");
                return;
            }
            I g7 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g7 = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(iBinder);
                    X x7 = ((C0323t0) this.f5100s.f4346r).f5077v;
                    C0323t0.l(x7);
                    x7.f4666E.b("Bound to IMeasurementService interface");
                } else {
                    X x8 = ((C0323t0) this.f5100s.f4346r).f5077v;
                    C0323t0.l(x8);
                    x8.f4670w.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                X x9 = ((C0323t0) this.f5100s.f4346r).f5077v;
                C0323t0.l(x9);
                x9.f4670w.b("Service connect failed to get IMeasurementService");
            }
            if (g7 == null) {
                this.f5098q = false;
                try {
                    A3.b bVarA = A3.b.a();
                    C0333w1 c0333w1 = this.f5100s;
                    bVarA.b(((C0323t0) c0333w1.f4346r).f5072q, c0333w1.f5108t);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C0312p0 c0312p02 = ((C0323t0) this.f5100s.f4346r).f5078w;
                C0323t0.l(c0312p02);
                c0312p02.x(new RunnableC0324t1(this, g7, 0));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0323t0 c0323t0 = (C0323t0) this.f5100s.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.t();
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4665D.b("Service disconnected");
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.x(new I4.a(14, (Object) this, (Object) componentName, false));
    }
}
