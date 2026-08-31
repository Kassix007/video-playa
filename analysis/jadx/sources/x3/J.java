package x3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class J implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f18401q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18402r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IBinder f18404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final I f18405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ComponentName f18406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K f18407w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(K k7, I i) {
        this.f18407w = k7;
        this.f18405u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static com.google.android.gms.common.b a(J j, String str, Executor executor) {
        try {
            Intent intentA = j.f18405u.a(j.f18407w.f18411b);
            j.f18402r = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(B3.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                K k7 = j.f18407w;
                boolean zC = k7.f18413d.c(k7.f18411b, str, intentA, j, 4225, executor);
                j.f18403s = zC;
                if (zC) {
                    j.f18407w.f18412c.sendMessageDelayed(j.f18407w.f18412c.obtainMessage(1, j.f18405u), j.f18407w.f);
                    com.google.android.gms.common.b bVar = com.google.android.gms.common.b.f10321u;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                j.f18402r = 2;
                try {
                    K k8 = j.f18407w;
                    k8.f18413d.b(k8.f18411b, j);
                } catch (IllegalArgumentException unused) {
                }
                com.google.android.gms.common.b bVar2 = new com.google.android.gms.common.b(16);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (C1888B e7) {
            return e7.f18384q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f18407w.f18410a) {
            try {
                this.f18407w.f18412c.removeMessages(1, this.f18405u);
                this.f18404t = iBinder;
                this.f18406v = componentName;
                Iterator it = this.f18401q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f18402r = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f18407w.f18410a) {
            try {
                this.f18407w.f18412c.removeMessages(1, this.f18405u);
                this.f18404t = null;
                this.f18406v = componentName;
                Iterator it = this.f18401q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f18402r = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
