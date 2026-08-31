package H2;

import B0.G0;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import k1.AbstractC1175c;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f2157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f2158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2.f f2159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2161u = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(t2.l lVar) {
        this.f2157q = new WeakReference(lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a() {
        C2.f eVar;
        try {
            t2.l lVar = (t2.l) this.f2157q.get();
            if (lVar == null) {
                b();
            } else if (this.f2159s == null) {
                if (lVar.f16717d.f2149b) {
                    Context context = lVar.f16714a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC1175c.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        eVar = new s4.e(1);
                    } else {
                        try {
                            eVar = new G0(connectivityManager, this);
                        } catch (Exception unused) {
                            eVar = new s4.e(1);
                        }
                    }
                } else {
                    eVar = new s4.e(1);
                }
                this.f2159s = eVar;
                this.f2161u = eVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void b() {
        try {
            if (this.f2160t) {
                return;
            }
            this.f2160t = true;
            Context context = this.f2158r;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            C2.f fVar = this.f2159s;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f2157q.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((t2.l) this.f2157q.get()) == null) {
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        t2.l lVar = (t2.l) this.f2157q.get();
        if (lVar != null) {
            B2.c cVar = (B2.c) lVar.f16716c.getValue();
            if (cVar != null) {
                cVar.f539a.j(i);
                B2.g gVar = cVar.f540b;
                synchronized (gVar) {
                    if (i >= 10 && i != 20) {
                        gVar.a();
                    }
                }
            }
        } else {
            b();
        }
    }
}
