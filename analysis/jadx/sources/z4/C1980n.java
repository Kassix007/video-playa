package z4;

import E1.t;
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

/* JADX INFO: renamed from: z4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1980n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f18759n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f18761b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f18766h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E4.j f18768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1973g f18769m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18763d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f18764e = new HashSet();
    public final Object f = new Object();
    public final E4.h j = new E4.h(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f18767k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18762c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1980n(Context context, t tVar, Intent intent) {
        this.f18760a = context;
        this.f18761b = tVar;
        this.f18766h = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(C1980n c1980n, AbstractRunnableC1977k abstractRunnableC1977k) {
        InterfaceC1973g interfaceC1973g = c1980n.f18769m;
        t tVar = c1980n.f18761b;
        ArrayList arrayList = c1980n.f18763d;
        int i = 0;
        if (interfaceC1973g != null || c1980n.f18765g) {
            if (!c1980n.f18765g) {
                abstractRunnableC1977k.run();
                return;
            } else {
                tVar.e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC1977k);
                return;
            }
        }
        tVar.e("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractRunnableC1977k);
        E4.j jVar = new E4.j(1, c1980n);
        c1980n.f18768l = jVar;
        c1980n.f18765g = true;
        if (c1980n.f18760a.bindService(c1980n.f18766h, jVar, 1)) {
            return;
        }
        tVar.e("Failed to bind to the service.", new Object[0]);
        c1980n.f18765g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C2.e eVar = new C2.e("Failed to bind to the service.");
            S3.e eVar2 = ((AbstractRunnableC1977k) obj).f18754q;
            if (eVar2 != null) {
                eVar2.a(eVar);
            }
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Handler a() {
        Handler handler;
        HashMap map = f18759n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f18762c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f18762c, 10);
                    handlerThread.start();
                    map.put(this.f18762c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f18762c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(S3.e eVar) {
        synchronized (this.f) {
            this.f18764e.remove(eVar);
        }
        a().post(new C1978l(0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        HashSet hashSet = this.f18764e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((S3.e) it.next()).a(new RemoteException(String.valueOf(this.f18762c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
