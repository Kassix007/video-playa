package P;

import B0.C0029a;
import B0.C0050o;
import M5.C0247h;
import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0245f;
import a0.AbstractC0606h;
import a0.C0602d;
import a0.C0607i;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m5.C1386y;
import q5.InterfaceC1529h;
import r.C1548G;
import r.C1549H;

/* JADX INFO: renamed from: P.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0385v0 extends r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final P5.S f5552x = P5.H.b(V.b.f7914t);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReference f5553y = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351e f5554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0241b0 f5556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f5557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5558e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1549H f5559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R.e f5560h;
    public final ArrayList i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1548G f5561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0050o f5562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1548G f5563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1548G f5564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f5565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashSet f5566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0247h f5567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k3.d f5568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final P5.S f5570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M5.d0 f5571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC1529h f5572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S f5573w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0385v0(InterfaceC1529h interfaceC1529h) {
        C0351e c0351e = new C0351e(new A0.d(11, this));
        this.f5554a = c0351e;
        this.f5555b = new Object();
        this.f5558e = new ArrayList();
        this.f5559g = new C1549H();
        this.f5560h = new R.e(new C0382u[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f5561k = new C1548G();
        this.f5562l = new C0050o(21);
        this.f5563m = new C1548G();
        this.f5564n = new C1548G();
        this.f5570t = P5.H.b(EnumC0374p0.f5492s);
        new AtomicReference(X.k.f8156a);
        M5.d0 d0Var = new M5.d0((InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r));
        d0Var.G(new C0029a(20, this));
        this.f5571u = d0Var;
        this.f5572v = interfaceC1529h.plus(c0351e).plus(d0Var);
        this.f5573w = new S(9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0382u q(C0385v0 c0385v0, C0382u c0382u, C1549H c1549h) {
        LinkedHashSet linkedHashSet;
        C0602d c0602dC;
        if (!c0382u.f5527I.f5443E && !c0382u.f5528J && ((linkedHashSet = c0385v0.f5566p) == null || !linkedHashSet.contains(c0382u))) {
            C0029a c0029a = new C0029a(21, c0382u);
            A.Y y6 = new A.Y(19, c0382u, c1549h);
            AbstractC0606h abstractC0606hK = a0.n.k();
            C0602d c0602d = abstractC0606hK instanceof C0602d ? (C0602d) abstractC0606hK : null;
            if (c0602d == null || (c0602dC = c0602d.C(c0029a, y6)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0606h abstractC0606hJ = c0602dC.j();
                if (c1549h != null) {
                    try {
                        if (c1549h.h()) {
                            B0.K k7 = new B0.K(13, c1549h, c0382u);
                            C0371o c0371o = c0382u.f5527I;
                            if (c0371o.f5443E) {
                                AbstractC0373p.c("Preparing a composition while composing is not supported");
                            }
                            c0371o.f5443E = true;
                            try {
                                k7.invoke();
                                c0371o.f5443E = false;
                            } catch (Throwable th) {
                                c0371o.f5443E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC0606h.q(abstractC0606hJ);
                        throw th2;
                    }
                }
                boolean zV = c0382u.v();
                AbstractC0606h.q(abstractC0606hJ);
                if (zV) {
                    return c0382u;
                }
            } finally {
                s(c0602dC);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final boolean r(C0385v0 c0385v0) {
        List listX;
        synchronized (c0385v0.f5555b) {
            boolean z5 = true;
            if (c0385v0.f5559g.g()) {
                if (c0385v0.f5560h.f6678s == 0 && !c0385v0.v()) {
                    z5 = false;
                }
                return z5;
            }
            R.h hVar = new R.h(c0385v0.f5559g);
            c0385v0.f5559g = new C1549H();
            synchronized (c0385v0.f5555b) {
                listX = c0385v0.x();
            }
            try {
                int size = listX.size();
                for (int i = 0; i < size; i++) {
                    ((C0382u) listX.get(i)).w(hVar);
                    if (((EnumC0374p0) c0385v0.f5570t.getValue()).compareTo(EnumC0374p0.f5491r) <= 0) {
                        break;
                    }
                }
                synchronized (c0385v0.f5555b) {
                    c0385v0.f5559g = new C1549H();
                }
                synchronized (c0385v0.f5555b) {
                    if (c0385v0.u() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (c0385v0.f5560h.f6678s == 0 && !c0385v0.v()) {
                        z5 = false;
                    }
                }
                return z5;
            } catch (Throwable th) {
                synchronized (c0385v0.f5555b) {
                    C1549H c1549h = c0385v0.f5559g;
                    c1549h.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        c1549h.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(C0602d c0602d) {
        try {
            if (c0602d.w() instanceof C0607i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0602d.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void y(ArrayList arrayList, C0385v0 c0385v0, C0382u c0382u) {
        arrayList.clear();
        synchronized (c0385v0.f5555b) {
            Iterator it = c0385v0.j.iterator();
            if (it.hasNext()) {
                ((V) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(Throwable th, C0382u c0382u) throws Throwable {
        if (!((Boolean) f5553y.get()).booleanValue() || (th instanceof C0361j)) {
            synchronized (this.f5555b) {
                k3.d dVar = this.f5568r;
                if (dVar != null) {
                    throw ((Throwable) dVar.f14122r);
                }
                this.f5568r = new k3.d(14, th);
            }
            throw th;
        }
        synchronized (this.f5555b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.f5560h.i();
                this.f5559g = new C1549H();
                this.j.clear();
                this.f5561k.a();
                this.f5563m.a();
                this.f5568r = new k3.d(14, th);
                if (c0382u != null) {
                    B(c0382u);
                }
                u();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(C0382u c0382u) {
        ArrayList arrayList = this.f5565o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5565o = arrayList;
        }
        if (!arrayList.contains(c0382u)) {
            arrayList.add(c0382u);
        }
        if (this.f5558e.remove(c0382u)) {
            this.f = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void a(C0382u c0382u, X.e eVar) throws Throwable {
        C0602d c0602dC;
        boolean z5 = c0382u.f5527I.f5443E;
        try {
            C0029a c0029a = new C0029a(21, c0382u);
            A.Y y6 = new A.Y(19, c0382u, null);
            AbstractC0606h abstractC0606hK = a0.n.k();
            C0602d c0602d = abstractC0606hK instanceof C0602d ? (C0602d) abstractC0606hK : null;
            if (c0602d == null || (c0602dC = c0602d.C(c0029a, y6)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0606h abstractC0606hJ = c0602dC.j();
                try {
                    c0382u.i(eVar);
                    if (!z5) {
                        a0.n.k().m();
                    }
                    synchronized (this.f5555b) {
                        if (((EnumC0374p0) this.f5570t.getValue()).compareTo(EnumC0374p0.f5491r) > 0 && !x().contains(c0382u)) {
                            this.f5558e.add(c0382u);
                            this.f = null;
                        }
                    }
                    try {
                        synchronized (this.f5555b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((V) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0382u.d();
                            c0382u.f();
                            if (z5) {
                                return;
                            }
                            a0.n.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, c0382u);
                    }
                } finally {
                    AbstractC0606h.q(abstractC0606hJ);
                }
            } finally {
                s(c0602dC);
            }
        } catch (Throwable th3) {
            A(th3, c0382u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean c() {
        return ((Boolean) f5553y.get()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean d() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final int g() {
        return 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final InterfaceC1529h h() {
        return this.f5572v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void i(C0382u c0382u) {
        InterfaceC0245f interfaceC0245fU;
        synchronized (this.f5555b) {
            if (this.f5560h.j(c0382u)) {
                interfaceC0245fU = null;
            } else {
                this.f5560h.c(c0382u);
                interfaceC0245fU = u();
            }
        }
        if (interfaceC0245fU != null) {
            ((C0247h) interfaceC0245fU).resumeWith(C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final U j(V v6) {
        U u6;
        synchronized (this.f5555b) {
            u6 = (U) this.f5563m.j(v6);
        }
        return u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void m(C0382u c0382u) {
        synchronized (this.f5555b) {
            try {
                LinkedHashSet linkedHashSet = this.f5566p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f5566p = linkedHashSet;
                }
                linkedHashSet.add(c0382u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void p(C0382u c0382u) {
        synchronized (this.f5555b) {
            if (this.f5558e.remove(c0382u)) {
                this.f = null;
            }
            this.f5560h.l(c0382u);
            this.i.remove(c0382u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        synchronized (this.f5555b) {
            if (((EnumC0374p0) this.f5570t.getValue()).compareTo(EnumC0374p0.f5494u) >= 0) {
                P5.S s6 = this.f5570t;
                EnumC0374p0 enumC0374p0 = EnumC0374p0.f5491r;
                s6.getClass();
                s6.h(null, enumC0374p0);
            }
        }
        this.f5571u.a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0245f u() {
        P5.S s6 = this.f5570t;
        int iCompareTo = ((EnumC0374p0) s6.getValue()).compareTo(EnumC0374p0.f5491r);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        R.e eVar = this.f5560h;
        if (iCompareTo <= 0) {
            this.f5558e.clear();
            this.f = n5.s.f15299q;
            this.f5559g = new C1549H();
            eVar.i();
            arrayList2.clear();
            arrayList.clear();
            this.f5565o = null;
            C0247h c0247h = this.f5567q;
            if (c0247h != null) {
                c0247h.g(null);
            }
            this.f5567q = null;
            this.f5568r = null;
            return null;
        }
        k3.d dVar = this.f5568r;
        EnumC0374p0 enumC0374p0 = EnumC0374p0.f5495v;
        EnumC0374p0 enumC0374p02 = EnumC0374p0.f5492s;
        if (dVar == null) {
            if (this.f5556c == null) {
                this.f5559g = new C1549H();
                eVar.i();
                if (v()) {
                    enumC0374p02 = EnumC0374p0.f5493t;
                }
            } else {
                enumC0374p02 = (eVar.f6678s == 0 && !this.f5559g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !v()) ? EnumC0374p0.f5494u : enumC0374p0;
            }
        }
        s6.getClass();
        s6.h(null, enumC0374p02);
        if (enumC0374p02 != enumC0374p0) {
            return null;
        }
        C0247h c0247h2 = this.f5567q;
        this.f5567q = null;
        return c0247h2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v() {
        return (this.f5569s || this.f5554a.f5398v.get() == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5555b
            monitor-enter(r0)
            r.H r1 = r2.f5559g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            R.e r1 = r2.f5560h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f6678s     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.v()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0385v0.w():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List x() {
        Object obj = this.f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f5558e;
            Object arrayList2 = arrayList.isEmpty() ? n5.s.f15299q : new ArrayList(arrayList);
            this.f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        if (((m5.C1371j) r10.get(r4)).f15081r == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0165, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0167, code lost:
    
        r11 = (m5.C1371j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
    
        if (r11.f15081r != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        r11 = (P.V) r11.f15080q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
    
        r4 = r17.f5555b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        n5.q.e0(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019d, code lost:
    
        if (((m5.C1371j) r11).f15081r == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a2, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a5, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List z(java.util.List r18, r.C1549H r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r0.size()
            r2.<init>(r3)
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r5 = 0
        L15:
            if (r5 >= r3) goto L38
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            P.V r7 = (P.V) r7
            r7.getClass()
            r7 = 0
            java.lang.Object r8 = r2.get(r7)
            if (r8 != 0) goto L30
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.put(r7, r8)
        L30:
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r6)
            int r5 = r5 + 1
            goto L15
        L38:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1c9
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            P.u r5 = (P.C0382u) r5
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            P.o r6 = r5.f5527I
            boolean r6 = r6.f5443E
            if (r6 == 0) goto L63
            java.lang.String r6 = "Check failed"
            P.AbstractC0373p.c(r6)
        L63:
            B0.a r6 = new B0.a
            r7 = 21
            r6.<init>(r7, r5)
            A.Y r7 = new A.Y
            r8 = 19
            r9 = r19
            r7.<init>(r8, r5, r9)
            a0.h r8 = a0.n.k()
            boolean r10 = r8 instanceof a0.C0602d
            r11 = 0
            if (r10 == 0) goto L7f
            a0.d r8 = (a0.C0602d) r8
            goto L80
        L7f:
            r8 = r11
        L80:
            if (r8 == 0) goto L1c1
            a0.d r6 = r8.C(r6, r7)
            if (r6 == 0) goto L1c1
            a0.h r7 = r6.j()     // Catch: java.lang.Throwable -> L1b5
            java.lang.Object r8 = r1.f5555b     // Catch: java.lang.Throwable -> L176
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L176
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            int r12 = r3.size()     // Catch: java.lang.Throwable -> Lc0
            r10.<init>(r12)     // Catch: java.lang.Throwable -> Lc0
            r12 = r3
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> Lc0
            int r12 = r12.size()     // Catch: java.lang.Throwable -> Lc0
            r13 = 0
        La0:
            if (r13 >= r12) goto Lc3
            java.lang.Object r14 = r3.get(r13)     // Catch: java.lang.Throwable -> Lc0
            P.V r14 = (P.V) r14     // Catch: java.lang.Throwable -> Lc0
            r.G r15 = r1.f5561k     // Catch: java.lang.Throwable -> Lc0
            r14.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r15 = R.a.a(r15)     // Catch: java.lang.Throwable -> Lc0
            r16 = r15
            P.V r16 = (P.V) r16     // Catch: java.lang.Throwable -> Lc0
            m5.j r4 = new m5.j     // Catch: java.lang.Throwable -> Lc0
            r4.<init>(r14, r15)     // Catch: java.lang.Throwable -> Lc0
            r10.add(r4)     // Catch: java.lang.Throwable -> Lc0
            int r13 = r13 + 1
            goto La0
        Lc0:
            r0 = move-exception
            goto L1b7
        Lc3:
            int r3 = r10.size()     // Catch: java.lang.Throwable -> Lc0
            r4 = 0
        Lc8:
            if (r4 >= r3) goto L12e
            java.lang.Object r12 = r10.get(r4)     // Catch: java.lang.Throwable -> Lc0
            m5.j r12 = (m5.C1371j) r12     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r13 = r12.f15081r     // Catch: java.lang.Throwable -> Lc0
            if (r13 != 0) goto L12b
            B0.o r13 = r1.f5562l     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r12 = r12.f15080q     // Catch: java.lang.Throwable -> Lc0
            P.V r12 = (P.V) r12     // Catch: java.lang.Throwable -> Lc0
            r12.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r12 = r13.f499q     // Catch: java.lang.Throwable -> Lc0
            r.G r12 = (r.C1548G) r12     // Catch: java.lang.Throwable -> Lc0
            boolean r12 = r12.b(r11)     // Catch: java.lang.Throwable -> Lc0
            if (r12 == 0) goto L12b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r4 = 10
            int r4 = n5.m.c0(r10, r4)     // Catch: java.lang.Throwable -> Lc0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc0
            int r4 = r10.size()     // Catch: java.lang.Throwable -> Lc0
            r11 = 0
        Lf7:
            if (r11 >= r4) goto L129
            java.lang.Object r12 = r10.get(r11)     // Catch: java.lang.Throwable -> Lc0
            int r11 = r11 + 1
            m5.j r12 = (m5.C1371j) r12     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r13 = r12.f15081r     // Catch: java.lang.Throwable -> Lc0
            if (r13 != 0) goto L125
            B0.o r13 = r1.f5562l     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r14 = r12.f15080q     // Catch: java.lang.Throwable -> Lc0
            P.V r14 = (P.V) r14     // Catch: java.lang.Throwable -> Lc0
            r14.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r14 = r13.f499q     // Catch: java.lang.Throwable -> Lc0
            r.G r14 = (r.C1548G) r14     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r15 = R.a.a(r14)     // Catch: java.lang.Throwable -> Lc0
            P.X r15 = (P.X) r15     // Catch: java.lang.Throwable -> Lc0
            boolean r14 = r14.i()     // Catch: java.lang.Throwable -> Lc0
            if (r14 == 0) goto L125
            java.lang.Object r13 = r13.f500r     // Catch: java.lang.Throwable -> Lc0
            r.G r13 = (r.C1548G) r13     // Catch: java.lang.Throwable -> Lc0
            r13.a()     // Catch: java.lang.Throwable -> Lc0
        L125:
            r3.add(r12)     // Catch: java.lang.Throwable -> Lc0
            goto Lf7
        L129:
            r10 = r3
            goto L12e
        L12b:
            int r4 = r4 + 1
            goto Lc8
        L12e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L176
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L176
            r4 = 0
        L134:
            if (r4 >= r3) goto L1aa
            java.lang.Object r8 = r10.get(r4)     // Catch: java.lang.Throwable -> L176
            m5.j r8 = (m5.C1371j) r8     // Catch: java.lang.Throwable -> L176
            java.lang.Object r8 = r8.f15081r     // Catch: java.lang.Throwable -> L176
            if (r8 != 0) goto L143
            int r4 = r4 + 1
            goto L134
        L143:
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L176
            r4 = 0
        L148:
            if (r4 >= r3) goto L1aa
            java.lang.Object r8 = r10.get(r4)     // Catch: java.lang.Throwable -> L176
            m5.j r8 = (m5.C1371j) r8     // Catch: java.lang.Throwable -> L176
            java.lang.Object r8 = r8.f15081r     // Catch: java.lang.Throwable -> L176
            if (r8 == 0) goto L157
            int r4 = r4 + 1
            goto L148
        L157:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L176
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L176
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L176
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L176
            r8 = 0
        L165:
            if (r8 >= r4) goto L17b
            java.lang.Object r11 = r10.get(r8)     // Catch: java.lang.Throwable -> L176
            m5.j r11 = (m5.C1371j) r11     // Catch: java.lang.Throwable -> L176
            java.lang.Object r12 = r11.f15081r     // Catch: java.lang.Throwable -> L176
            if (r12 != 0) goto L178
            java.lang.Object r11 = r11.f15080q     // Catch: java.lang.Throwable -> L176
            P.V r11 = (P.V) r11     // Catch: java.lang.Throwable -> L176
            goto L178
        L176:
            r0 = move-exception
            goto L1b9
        L178:
            int r8 = r8 + 1
            goto L165
        L17b:
            java.lang.Object r4 = r1.f5555b     // Catch: java.lang.Throwable -> L176
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L176
            java.util.ArrayList r8 = r1.j     // Catch: java.lang.Throwable -> L1a7
            n5.q.e0(r8, r3)     // Catch: java.lang.Throwable -> L1a7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L176
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L176
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L176
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L176
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L176
            r8 = 0
        L192:
            if (r8 >= r4) goto L1a5
            java.lang.Object r11 = r10.get(r8)     // Catch: java.lang.Throwable -> L176
            r12 = r11
            m5.j r12 = (m5.C1371j) r12     // Catch: java.lang.Throwable -> L176
            java.lang.Object r12 = r12.f15081r     // Catch: java.lang.Throwable -> L176
            if (r12 == 0) goto L1a2
            r3.add(r11)     // Catch: java.lang.Throwable -> L176
        L1a2:
            int r8 = r8 + 1
            goto L192
        L1a5:
            r10 = r3
            goto L1aa
        L1a7:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L176
            throw r0     // Catch: java.lang.Throwable -> L176
        L1aa:
            r5.p(r10)     // Catch: java.lang.Throwable -> L176
            a0.AbstractC0606h.q(r7)     // Catch: java.lang.Throwable -> L1b5
            s(r6)
            goto L40
        L1b5:
            r0 = move-exception
            goto L1bd
        L1b7:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L176
            throw r0     // Catch: java.lang.Throwable -> L176
        L1b9:
            a0.AbstractC0606h.q(r7)     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L1bd:
            s(r6)
            throw r0
        L1c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot create a mutable snapshot of an read-only snapshot"
            r0.<init>(r2)
            throw r0
        L1c9:
            java.util.Set r0 = r2.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = n5.l.B0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0385v0.z(java.util.List, r.H):java.util.List");
    }

    @Override // P.r
    public final void k(Set set) {
    }
}
