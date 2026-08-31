package O3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0276d0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f4826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4828c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0276d0(T1 t12) {
        AbstractC1887A.g(t12);
        this.f4826a = t12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        T1 t12 = this.f4826a;
        t12.k0();
        t12.c().o();
        t12.c().o();
        if (this.f4827b) {
            t12.b().f4666E.b("Unregistering connectivity change receiver");
            this.f4827b = false;
            this.f4828c = false;
            try {
                t12.f4582B.f5072q.unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                t12.b().f4670w.c(e7, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        T1 t12 = this.f4826a;
        t12.k0();
        String action = intent.getAction();
        t12.b().f4666E.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            t12.b().f4673z.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C0270b0 c0270b0 = t12.f4608r;
        T1.S(c0270b0);
        boolean zI = c0270b0.I();
        if (this.f4828c != zI) {
            this.f4828c = zI;
            t12.c().x(new A1.b(this, zI));
        }
    }
}
