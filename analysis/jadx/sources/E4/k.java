package E4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f1738n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1740b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f1745h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f1747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f1748m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1742d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f1743e = new HashSet();
    public final Object f = new Object();
    public final h j = new h(0, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1746k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1741c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(Context context, f fVar, Intent intent) {
        this.f1739a = context;
        this.f1740b = fVar;
        this.f1745h = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Handler a() {
        Handler handler;
        HashMap map = f1738n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f1741c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1741c, 10);
                    handlerThread.start();
                    map.put(this.f1741c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f1741c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.f1743e.iterator();
                while (it.hasNext()) {
                    ((S3.e) it.next()).a(new RemoteException(String.valueOf(this.f1741c).concat(" : Binder has died.")));
                }
                this.f1743e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
