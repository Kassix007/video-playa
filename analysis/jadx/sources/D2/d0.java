package d2;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import s.AbstractC1585a;
import s.C1586b;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12094e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12095g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0(int i) {
        this.f12090a = 1;
        this.f12091b = i;
        if (i <= 0) {
            AbstractC1585a.c("maxSize <= 0");
            throw null;
        }
        this.f = new Q2.r();
        this.f12095g = new C1586b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        View view = (View) ((ArrayList) this.f).get(r0.size() - 1);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f12092c = ((StaggeredGridLayoutManager) this.f12095g).f9681r.b(view);
        a0Var.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        ((ArrayList) this.f).clear();
        this.f12091b = Integer.MIN_VALUE;
        this.f12092c = Integer.MIN_VALUE;
        this.f12093d = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object c(Object key) {
        kotlin.jvm.internal.m.e(key, "key");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(oldValue, "oldValue");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int e() {
        return ((StaggeredGridLayoutManager) this.f12095g).f9686w ? g(r0.size() - 1, -1) : g(0, ((ArrayList) this.f).size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int f() {
        return ((StaggeredGridLayoutManager) this.f12095g).f9686w ? g(0, ((ArrayList) this.f).size()) : g(r0.size() - 1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g(int i, int i7) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f12095g;
        int iK = staggeredGridLayoutManager.f9681r.k();
        int iG = staggeredGridLayoutManager.f9681r.g();
        int i8 = i7 > i ? 1 : -1;
        while (i != i7) {
            View view = (View) ((ArrayList) this.f).get(i);
            int iE = staggeredGridLayoutManager.f9681r.e(view);
            int iB = staggeredGridLayoutManager.f9681r.b(view);
            boolean z5 = iE <= iG;
            boolean z6 = iB >= iK;
            if (z5 && z6 && (iE < iK || iB > iG)) {
                return AbstractC0960G.H(view);
            }
            i += i8;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object h(Object key) {
        Object objPut;
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((C1586b) this.f12095g)) {
            Q2.r rVar = (Q2.r) this.f;
            rVar.getClass();
            Object obj = rVar.f6574a.get(key);
            if (obj != null) {
                this.f12093d++;
                return obj;
            }
            this.f12094e++;
            Object objC = c(key);
            if (objC == null) {
                return null;
            }
            synchronized (((C1586b) this.f12095g)) {
                Q2.r rVar2 = (Q2.r) this.f;
                rVar2.getClass();
                objPut = rVar2.f6574a.put(key, objC);
                if (objPut != null) {
                    Q2.r rVar3 = (Q2.r) this.f;
                    rVar3.getClass();
                    rVar3.f6574a.put(key, objPut);
                } else {
                    this.f12092c += n(key, objC);
                }
            }
            if (objPut != null) {
                d(key, objC, objPut);
                return objPut;
            }
            p(this.f12091b);
            return objC;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int i(int i) {
        int i7 = this.f12092c;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.f12092c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View j(int i, int i7) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f12095g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i7 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f9686w && AbstractC0960G.H(view2) >= i) || ((!staggeredGridLayoutManager.f9686w && AbstractC0960G.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            View view3 = (View) arrayList.get(i8);
            if ((staggeredGridLayoutManager.f9686w && AbstractC0960G.H(view3) <= i) || ((!staggeredGridLayoutManager.f9686w && AbstractC0960G.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i8++;
            view = view3;
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k(int i) {
        int i7 = this.f12091b;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f).get(0);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f12091b = ((StaggeredGridLayoutManager) this.f12095g).f9681r.e(view);
        a0Var.getClass();
        return this.f12091b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object l(Object key, Object value) {
        Object objPut;
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        synchronized (((C1586b) this.f12095g)) {
            this.f12092c += n(key, value);
            Q2.r rVar = (Q2.r) this.f;
            rVar.getClass();
            objPut = rVar.f6574a.put(key, value);
            if (objPut != null) {
                this.f12092c -= n(key, objPut);
            }
        }
        if (objPut != null) {
            d(key, objPut, value);
        }
        p(this.f12091b);
        return objPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object m(Object key) {
        Object objRemove;
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((C1586b) this.f12095g)) {
            Q2.r rVar = (Q2.r) this.f;
            rVar.getClass();
            objRemove = rVar.f6574a.remove(key);
            if (objRemove != null) {
                this.f12092c -= n(key, objRemove);
            }
        }
        if (objRemove != null) {
            d(key, objRemove, null);
        }
        return objRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int n(Object obj, Object obj2) {
        int iO = o(obj, obj2);
        if (iO >= 0) {
            return iO;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.m.e(message, "message");
        throw new IllegalStateException(message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int o(Object key, Object value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f12095g
            s.b r0 = (s.C1586b) r0
            monitor-enter(r0)
            int r1 = r6.f12092c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L93
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            Q2.r r1 = (Q2.r) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6574a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r6.f12092c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L93
            goto L1d
        L1a:
            r7 = move-exception
            goto L9b
        L1d:
            int r1 = r6.f12092c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r7) goto L91
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            Q2.r r1 = (Q2.r) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6574a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L91
        L2e:
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            Q2.r r1 = (Q2.r) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6574a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "<get-entries>(...)"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L54
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L4e
        L4c:
            r1 = r3
            goto L63
        L4e:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L63
        L54:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L5f
            goto L4c
        L5f:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L63:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L69
            monitor-exit(r0)
            return
        L69:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r6.f     // Catch: java.lang.Throwable -> L1a
            Q2.r r4 = (Q2.r) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "key"
            kotlin.jvm.internal.m.e(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f6574a     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r6.f12092c     // Catch: java.lang.Throwable -> L1a
            int r5 = r6.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r5
            r6.f12092c = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r6.d(r2, r1, r3)
            goto L0
        L91:
            monitor-exit(r0)
            return
        L93:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L9b:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.d0.p(int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        switch (this.f12090a) {
            case 1:
                synchronized (((C1586b) this.f12095g)) {
                    try {
                        int i = this.f12093d;
                        int i7 = this.f12094e + i;
                        str = "LruCache[maxSize=" + this.f12091b + ",hits=" + this.f12093d + ",misses=" + this.f12094e + ",hitRate=" + (i7 != 0 ? (i * 100) / i7 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public d0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f12090a = 0;
        this.f12095g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.f12091b = Integer.MIN_VALUE;
        this.f12092c = Integer.MIN_VALUE;
        this.f12093d = 0;
        this.f12094e = i;
    }
}
