package x3;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import i3.C1136a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: x3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1893e {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.android.gms.common.d[] f18417N = new com.google.android.gms.common.d[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public IInterface f18418A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public E f18420C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final InterfaceC1890b f18422E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final InterfaceC1891c f18423F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f18424G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f18425H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile String f18426I;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c4.c f18432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f18433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final K f18434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.google.android.gms.common.f f18435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C f18436v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w f18439y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC1892d f18440z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile String f18431q = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f18437w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f18438x = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f18419B = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f18421D = 1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public com.google.android.gms.common.b f18427J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f18428K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public volatile H f18429L = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final AtomicInteger f18430M = new AtomicInteger(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1893e(Context context, Looper looper, K k7, com.google.android.gms.common.f fVar, int i, InterfaceC1890b interfaceC1890b, InterfaceC1891c interfaceC1891c, String str) {
        AbstractC1887A.h(context, "Context must not be null");
        this.f18433s = context;
        AbstractC1887A.h(looper, "Looper must not be null");
        AbstractC1887A.h(k7, "Supervisor must not be null");
        this.f18434t = k7;
        AbstractC1887A.h(fVar, "API availability must not be null");
        this.f18435u = fVar;
        this.f18436v = new C(this, looper);
        this.f18424G = i;
        this.f18422E = interfaceC1890b;
        this.f18423F = interfaceC1891c;
        this.f18425H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ boolean x(AbstractC1893e abstractC1893e, int i, int i7, IInterface iInterface) {
        synchronized (abstractC1893e.f18437w) {
            try {
                if (abstractC1893e.f18421D != i) {
                    return false;
                }
                abstractC1893e.y(i7, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        boolean z5;
        synchronized (this.f18437w) {
            z5 = this.f18421D == 4;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(InterfaceC1892d interfaceC1892d) {
        this.f18440z = interfaceC1892d;
        y(2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        this.f18431q = str;
        j();
    }

    public abstract int e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        boolean z5;
        synchronized (this.f18437w) {
            int i = this.f18421D;
            z5 = true;
            if (i != 2 && i != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final com.google.android.gms.common.d[] g() {
        H h4 = this.f18429L;
        if (h4 == null) {
            return null;
        }
        return h4.f18394r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        if (!a() || this.f18432r == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.f18431q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        this.f18430M.incrementAndGet();
        synchronized (this.f18419B) {
            try {
                int size = this.f18419B.size();
                for (int i = 0; i < size; i++) {
                    u uVar = (u) this.f18419B.get(i);
                    synchronized (uVar) {
                        uVar.f18519a = null;
                    }
                }
                this.f18419B.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f18438x) {
            this.f18439y = null;
        }
        y(1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(C1136a c1136a) {
        ((v3.o) c1136a.f13562r).f17590n.f17574m.post(new A1.b(23, c1136a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(InterfaceC1897i interfaceC1897i, Set set) {
        Bundle bundleR = r();
        String str = Build.VERSION.SDK_INT < 31 ? this.f18426I : this.f18426I;
        int i = this.f18424G;
        int i7 = com.google.android.gms.common.f.f10342a;
        Scope[] scopeArr = C1895g.f18447E;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.d[] dVarArr = C1895g.f18448F;
        C1895g c1895g = new C1895g(6, i, i7, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1895g.f18456t = this.f18433s.getPackageName();
        c1895g.f18459w = bundleR;
        if (set != null) {
            c1895g.f18458v = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            c1895g.f18460x = accountP;
            if (interfaceC1897i != null) {
                c1895g.f18457u = interfaceC1897i.asBinder();
            }
        }
        c1895g.f18461y = f18417N;
        c1895g.f18462z = q();
        try {
            synchronized (this.f18438x) {
                try {
                    w wVar = this.f18439y;
                    if (wVar != null) {
                        wVar.I(new D(this, this.f18430M.get()), c1895g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i8 = this.f18430M.get();
            C c7 = this.f18436v;
            c7.sendMessage(c7.obtainMessage(6, i8, 3));
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i9 = this.f18430M.get();
            F f = new F(this, 8, null, null);
            C c8 = this.f18436v;
            c8.sendMessage(c8.obtainMessage(1, i9, -1, f));
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i92 = this.f18430M.get();
            F f7 = new F(this, 8, null, null);
            C c82 = this.f18436v;
            c82.sendMessage(c82.obtainMessage(1, i92, -1, f7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        int iC = this.f18435u.c(this.f18433s, e());
        if (iC == 0) {
            c(new C1136a(18, this));
            return;
        }
        y(1, null);
        this.f18440z = new C1136a(18, this);
        int i = this.f18430M.get();
        C c7 = this.f18436v;
        c7.sendMessage(c7.obtainMessage(3, i, iC, null));
    }

    public abstract IInterface o(IBinder iBinder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account p() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public com.google.android.gms.common.d[] q() {
        return f18417N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Bundle r() {
        return new Bundle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set s() {
        return Collections.EMPTY_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f18437w) {
            try {
                if (this.f18421D == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f18418A;
                AbstractC1887A.h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean w() {
        return e() >= 211700000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(int i, IInterface iInterface) {
        c4.c cVar;
        AbstractC1887A.a((i == 4) == (iInterface != null));
        synchronized (this.f18437w) {
            try {
                this.f18421D = i;
                this.f18418A = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    E e7 = this.f18420C;
                    if (e7 != null) {
                        K k7 = this.f18434t;
                        String str = (String) this.f18432r.f10240r;
                        AbstractC1887A.g(str);
                        this.f18432r.getClass();
                        if (this.f18425H == null) {
                            this.f18433s.getClass();
                        }
                        k7.c(str, e7, this.f18432r.f10239q);
                        this.f18420C = null;
                    }
                } else if (i == 2 || i == 3) {
                    E e8 = this.f18420C;
                    if (e8 != null && (cVar = this.f18432r) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) cVar.f10240r) + " on com.google.android.gms");
                        K k8 = this.f18434t;
                        String str2 = (String) this.f18432r.f10240r;
                        AbstractC1887A.g(str2);
                        this.f18432r.getClass();
                        if (this.f18425H == null) {
                            this.f18433s.getClass();
                        }
                        k8.c(str2, e8, this.f18432r.f10239q);
                        this.f18430M.incrementAndGet();
                    }
                    E e9 = new E(this, this.f18430M.get());
                    this.f18420C = e9;
                    String strV = v();
                    boolean zW = w();
                    this.f18432r = new c4.c(strV, zW);
                    if (zW && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f18432r.f10240r)));
                    }
                    K k9 = this.f18434t;
                    String str3 = (String) this.f18432r.f10240r;
                    AbstractC1887A.g(str3);
                    this.f18432r.getClass();
                    String name = this.f18425H;
                    if (name == null) {
                        name = this.f18433s.getClass().getName();
                    }
                    com.google.android.gms.common.b bVarB = k9.b(new I(str3, this.f18432r.f10239q), e9, name, null);
                    if (!(bVarB.f10323r == 0)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f18432r.f10240r) + " on com.google.android.gms");
                        int i7 = bVarB.f10323r;
                        if (i7 == -1) {
                            i7 = 16;
                        }
                        if (bVarB.f10324s != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarB.f10324s);
                        }
                        int i8 = this.f18430M.get();
                        G g7 = new G(this, i7, bundle);
                        C c7 = this.f18436v;
                        c7.sendMessage(c7.obtainMessage(7, i8, -1, g7));
                    }
                } else if (i == 4) {
                    AbstractC1887A.g(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
