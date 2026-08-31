package Y2;

import I2.t;
import I2.y;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f8198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f8199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8200s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(y yVar) {
        this.f8198q = new WeakReference(yVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a() {
        try {
            if (this.f8200s) {
                return;
            }
            this.f8200s = true;
            Context context = this.f8199r;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f8198q.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((y) this.f8198q.get()) == null) {
            a();
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
        P2.c cVar;
        long jC;
        try {
            y yVar = (y) this.f8198q.get();
            if (yVar != null) {
                t tVar = yVar.f2404a;
                if (i >= 40) {
                    P2.c cVar2 = (P2.c) tVar.f2380c.getValue();
                    if (cVar2 != null) {
                        synchronized (cVar2.f5620c) {
                            cVar2.f5618a.clear();
                            B2.g gVar = cVar2.f5619b;
                            gVar.f550b = 0;
                            gVar.f549a.clear();
                        }
                    }
                } else if (i >= 10 && (cVar = (P2.c) tVar.f2380c.getValue()) != null) {
                    synchronized (cVar.f5620c) {
                        jC = cVar.f5618a.c();
                    }
                    long j = jC / ((long) 2);
                    synchronized (cVar.f5620c) {
                        cVar.f5618a.p(j);
                    }
                }
            } else {
                a();
            }
        } finally {
        }
    }
}
