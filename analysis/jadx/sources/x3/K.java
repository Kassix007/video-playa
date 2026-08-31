package x3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.work.PeriodicWorkRequest;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u4.C1702e;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f18408g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static K f18409h;
    public static HandlerThread i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18410a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile I3.e f18412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A3.b f18413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18414e;
    public final long f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public K(Context context, Looper looper) {
        C1702e c1702e = new C1702e(1, this);
        this.f18411b = context.getApplicationContext();
        I3.e eVar = new I3.e(looper, c1702e);
        Looper.getMainLooper();
        this.f18412c = eVar;
        this.f18413d = A3.b.a();
        this.f18414e = 5000L;
        this.f = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static K a(Context context) {
        synchronized (f18408g) {
            try {
                if (f18409h == null) {
                    f18409h = new K(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18409h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final com.google.android.gms.common.b b(I i7, E e7, String str, Executor executor) {
        synchronized (this.f18410a) {
            try {
                J j = (J) this.f18410a.get(i7);
                com.google.android.gms.common.b bVarA = null;
                if (executor == null) {
                    executor = null;
                }
                if (j == null) {
                    j = new J(this, i7);
                    j.f18401q.put(e7, e7);
                    bVarA = J.a(j, str, executor);
                    this.f18410a.put(i7, j);
                } else {
                    this.f18412c.removeMessages(0, i7);
                    if (j.f18401q.containsKey(e7)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(i7.toString()));
                    }
                    j.f18401q.put(e7, e7);
                    int i8 = j.f18402r;
                    if (i8 == 1) {
                        e7.onServiceConnected(j.f18406v, j.f18404t);
                    } else if (i8 == 2) {
                        bVarA = J.a(j, str, executor);
                    }
                }
                if (j.f18403s) {
                    return com.google.android.gms.common.b.f10321u;
                }
                if (bVarA == null) {
                    bVarA = new com.google.android.gms.common.b(-1);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(String str, ServiceConnection serviceConnection, boolean z5) {
        I i7 = new I(str, z5);
        AbstractC1887A.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f18410a) {
            try {
                J j = (J) this.f18410a.get(i7);
                if (j == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(i7.toString()));
                }
                if (!j.f18401q.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(i7.toString()));
                }
                j.f18401q.remove(serviceConnection);
                if (j.f18401q.isEmpty()) {
                    this.f18412c.sendMessageDelayed(this.f18412c.obtainMessage(0, i7), this.f18414e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
