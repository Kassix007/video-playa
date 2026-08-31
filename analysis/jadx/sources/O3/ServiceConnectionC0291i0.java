package O3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.C0892z;
import java.util.Objects;

/* JADX INFO: renamed from: O3.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0291i0 implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0294j0 f4908r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServiceConnectionC0291i0(C0294j0 c0294j0, String str) {
        Objects.requireNonNull(c0294j0);
        this.f4908r = c0294j0;
        this.f4907q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0294j0 c0294j0 = this.f4908r;
        if (iBinder == null) {
            X x6 = c0294j0.f4924b.f5077v;
            C0323t0.l(x6);
            x6.f4673z.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = com.google.android.gms.internal.measurement.A.f10582c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.B c0892z = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.B ? (com.google.android.gms.internal.measurement.B) iInterfaceQueryLocalInterface : new C0892z(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            if (c0892z == null) {
                X x7 = c0294j0.f4924b.f5077v;
                C0323t0.l(x7);
                x7.f4673z.b("Install Referrer Service implementation was not found");
                return;
            }
            C0323t0 c0323t0 = c0294j0.f4924b;
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4666E.b("Install Referrer Service connected");
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new I4.a(this, c0892z, this));
        } catch (RuntimeException e7) {
            X x9 = c0294j0.f4924b.f5077v;
            C0323t0.l(x9);
            x9.f4673z.c(e7, "Exception occurred while calling Install Referrer API");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        X x6 = this.f4908r.f4924b.f5077v;
        C0323t0.l(x6);
        x6.f4666E.b("Install Referrer Service disconnected");
    }
}
