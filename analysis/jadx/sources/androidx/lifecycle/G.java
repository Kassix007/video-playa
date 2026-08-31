package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import n.C1388a;
import o.C1407c;
import o.C1408d;
import o.C1410f;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f9484k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1410f f9486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f9489e;
    public volatile Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9491h;
    public boolean i;
    public final C j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(Object obj) {
        this.f9485a = new Object();
        this.f9486b = new C1410f();
        this.f9487c = 0;
        this.f = f9484k;
        this.j = new C(this);
        this.f9489e = obj;
        this.f9490g = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(String str) {
        C1388a.Q().f15119d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(C0.S.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(F f) {
        if (f.f9481r) {
            if (!f.i()) {
                f.d(false);
                return;
            }
            int i = f.f9482s;
            int i7 = this.f9490g;
            if (i >= i7) {
                return;
            }
            f.f9482s = i7;
            f.f9480q.onChanged(this.f9489e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(F f) {
        if (this.f9491h) {
            this.i = true;
            return;
        }
        this.f9491h = true;
        do {
            this.i = false;
            if (f != null) {
                b(f);
                f = null;
            } else {
                C1410f c1410f = this.f9486b;
                c1410f.getClass();
                C1408d c1408d = new C1408d(c1410f);
                c1410f.f15319s.put(c1408d, Boolean.FALSE);
                while (c1408d.hasNext()) {
                    b((F) ((Map.Entry) c1408d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f9491h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        Object obj = this.f9489e;
        if (obj != f9484k) {
            return obj;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(InterfaceC0660x interfaceC0660x, K k7) {
        Object obj;
        a("observe");
        if (interfaceC0660x.getLifecycle().b() == EnumC0653p.f9556q) {
            return;
        }
        E e7 = new E(this, interfaceC0660x, k7);
        C1410f c1410f = this.f9486b;
        C1407c c1407cD = c1410f.d(k7);
        if (c1407cD != null) {
            obj = c1407cD.f15311r;
        } else {
            C1407c c1407c = new C1407c(k7, e7);
            c1410f.f15320t++;
            C1407c c1407c2 = c1410f.f15318r;
            if (c1407c2 == null) {
                c1410f.f15317q = c1407c;
                c1410f.f15318r = c1407c;
            } else {
                c1407c2.f15312s = c1407c;
                c1407c.f15313t = c1407c2;
                c1410f.f15318r = c1407c;
            }
            obj = null;
        }
        F f = (F) obj;
        if (f != null && !f.h(interfaceC0660x)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f != null) {
            return;
        }
        interfaceC0660x.getLifecycle().a(e7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(K k7) {
        Object obj;
        a("observeForever");
        D d5 = new D(this, k7);
        C1410f c1410f = this.f9486b;
        C1407c c1407cD = c1410f.d(k7);
        if (c1407cD != null) {
            obj = c1407cD.f15311r;
        } else {
            C1407c c1407c = new C1407c(k7, d5);
            c1410f.f15320t++;
            C1407c c1407c2 = c1410f.f15318r;
            if (c1407c2 == null) {
                c1410f.f15317q = c1407c;
                c1410f.f15318r = c1407c;
            } else {
                c1407c2.f15312s = c1407c;
                c1407c.f15313t = c1407c2;
                c1410f.f15318r = c1407c;
            }
            obj = null;
        }
        F f = (F) obj;
        if (f instanceof E) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f != null) {
            return;
        }
        d5.d(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(Object obj) {
        boolean z5;
        synchronized (this.f9485a) {
            z5 = this.f == f9484k;
            this.f = obj;
        }
        if (z5) {
            C1388a.Q().R(this.j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(K k7) {
        a("removeObserver");
        F f = (F) this.f9486b.g(k7);
        if (f == null) {
            return;
        }
        f.g();
        f.d(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(Object obj) {
        a("setValue");
        this.f9490g++;
        this.f9489e = obj;
        c(null);
    }

    public G() {
        this.f9485a = new Object();
        this.f9486b = new C1410f();
        this.f9487c = 0;
        Object obj = f9484k;
        this.f = obj;
        this.j = new C(this);
        this.f9489e = obj;
        this.f9490g = -1;
    }
}
