package M5;

import C0.C0100s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements InterfaceC0241b0, o0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3864q = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3865r = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i0(boolean z5) {
        this._state$volatile = z5 ? AbstractC0263y.j : AbstractC0263y.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0014 */
    public static C0251l Q(R5.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.j.f7251r;
            R5.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (R5.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0251l) {
                    return (C0251l) jVar;
                }
                if (jVar instanceof k0) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Y(Object obj) {
        if (!(obj instanceof h0)) {
            return obj instanceof X ? ((X) obj).b() ? "Active" : "New" : obj instanceof C0255p ? "Cancelled" : "Completed";
        }
        h0 h0Var = (h0) obj;
        return h0Var.e() ? "Cancelling" : h0.f3859r.get(h0Var) == 1 ? "Completing" : "Active";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object A(h0 h0Var, Object obj) {
        Throwable thB;
        C0255p c0255p = obj instanceof C0255p ? (C0255p) obj : null;
        Throwable th = c0255p != null ? c0255p.f3878a : null;
        synchronized (h0Var) {
            h0Var.e();
            ArrayList arrayListF = h0Var.f(th);
            thB = B(h0Var, arrayListF);
            if (thB != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListF.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thB && th2 != thB && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC1362a.a(thB, th2);
                    }
                }
            }
        }
        if (thB != null && thB != th) {
            obj = new C0255p(false, thB);
        }
        if (thB != null && (u(thB) || F(thB))) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0255p.f3877b.compareAndSet((C0255p) obj, 0, 1);
        }
        S(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864q;
        Object y6 = obj instanceof X ? new Y((X) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h0Var, y6) && atomicReferenceFieldUpdater.get(this) == h0Var) {
        }
        y(h0Var, obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable B(h0 h0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (h0Var.e()) {
                return new c0(w(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof u0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof u0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean C() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean D() {
        return this instanceof C0252m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k0 E(X x6) {
        k0 k0VarD = x6.d();
        if (k0VarD != null) {
            return k0VarD;
        }
        if (x6 instanceof L) {
            return new k0();
        }
        if (x6 instanceof e0) {
            V((e0) x6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x6).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean F(Throwable th) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final J G(B5.c cVar) {
        return J(true, new K(1, cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(InterfaceC0241b0 interfaceC0241b0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3865r;
        m0 m0Var = m0.f3871q;
        if (interfaceC0241b0 == null) {
            atomicReferenceFieldUpdater.set(this, m0Var);
            return;
        }
        interfaceC0241b0.start();
        InterfaceC0250k interfaceC0250kM = interfaceC0241b0.M(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0250kM);
        if (f3864q.get(this) instanceof X) {
            return;
        }
        interfaceC0250kM.a();
        atomicReferenceFieldUpdater.set(this, m0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J J(boolean z5, e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m0 m0Var;
        boolean z6;
        boolean zE;
        e0Var.f3846t = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f3864q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj instanceof L;
            m0Var = m0.f3871q;
            z6 = true;
            if (!z7) {
                if (!(obj instanceof X)) {
                    z6 = false;
                    break;
                }
                X x6 = (X) obj;
                k0 k0VarD = x6.d();
                if (k0VarD == null) {
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    V((e0) obj);
                } else {
                    if (e0Var.k()) {
                        h0 h0Var = x6 instanceof h0 ? (h0) x6 : null;
                        Throwable thC = h0Var != null ? h0Var.c() : null;
                        if (thC == null) {
                            zE = k0VarD.e(e0Var, 5);
                        } else if (z5) {
                            e0Var.l(thC);
                            return m0Var;
                        }
                    } else {
                        zE = k0VarD.e(e0Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                L l7 = (L) obj;
                if (l7.f3815q) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                U(l7);
            }
        }
        if (z6) {
            return e0Var;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0255p c0255p = obj2 instanceof C0255p ? (C0255p) obj2 : null;
            e0Var.l(c0255p != null ? c0255p.f3878a : null);
        }
        return m0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean L() {
        return this instanceof C0242c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final InterfaceC0250k M(i0 i0Var) {
        C0251l c0251l = new C0251l(i0Var);
        c0251l.f3846t = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof L) {
                L l7 = (L) obj;
                if (l7.f3815q) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0251l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                U(l7);
            } else {
                boolean z5 = obj instanceof X;
                m0 m0Var = m0.f3871q;
                if (!z5) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0255p c0255p = obj2 instanceof C0255p ? (C0255p) obj2 : null;
                    c0251l.l(c0255p != null ? c0255p.f3878a : null);
                    return m0Var;
                }
                k0 k0VarD = ((X) obj).d();
                if (k0VarD == null) {
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    V((e0) obj);
                } else if (!k0VarD.e(c0251l, 7)) {
                    boolean zE = k0VarD.e(c0251l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof h0) {
                        thC = ((h0) obj3).c();
                    } else {
                        C0255p c0255p2 = obj3 instanceof C0255p ? (C0255p) obj3 : null;
                        if (c0255p2 != null) {
                            thC = c0255p2.f3878a;
                        }
                    }
                    c0251l.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return m0Var;
                }
            }
        }
        return c0251l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N(Object obj) {
        Object objZ;
        do {
            objZ = Z(f3864q.get(this), obj);
            if (objZ == AbstractC0263y.f3904d) {
                return false;
            }
            if (objZ == AbstractC0263y.f3905e) {
                return true;
            }
        } while (objZ == AbstractC0263y.f);
        m(objZ);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object O(Object obj) {
        Object objZ;
        do {
            objZ = Z(f3864q.get(this), obj);
            if (objZ == AbstractC0263y.f3904d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0255p c0255p = obj instanceof C0255p ? (C0255p) obj : null;
                throw new IllegalStateException(str, c0255p != null ? c0255p.f3878a : null);
            }
        } while (objZ == AbstractC0263y.f);
        return objZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String P() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(k0 k0Var, Throwable th) {
        k0Var.e(new R5.i(4), 4);
        Object obj = R5.j.f7250q.get(k0Var);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C2.e eVar = null;
        for (R5.j jVarH = (R5.j) obj; !jVarH.equals(k0Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof e0) && ((e0) jVarH).k()) {
                try {
                    ((e0) jVarH).l(th);
                } catch (Throwable th2) {
                    if (eVar != null) {
                        AbstractC1362a.a(eVar, th2);
                    } else {
                        eVar = new C2.e("Exception in completion handler " + jVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (eVar != null) {
            H(eVar);
        }
        u(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(L l7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var = new k0();
        Object w3 = k0Var;
        if (!l7.f3815q) {
            w3 = new W(k0Var);
        }
        do {
            atomicReferenceFieldUpdater = f3864q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l7, w3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var = new k0();
        e0Var.getClass();
        R5.j.f7251r.set(k0Var, e0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R5.j.f7250q;
        atomicReferenceFieldUpdater2.set(k0Var, e0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(e0Var) == e0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(e0Var, e0Var, k0Var)) {
                    if (atomicReferenceFieldUpdater2.get(e0Var) != e0Var) {
                        break;
                    }
                }
                k0Var.g(e0Var);
                break loop0;
            }
            break;
        }
        R5.j jVarH = e0Var.h();
        do {
            atomicReferenceFieldUpdater = f3864q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e0Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int X(Object obj) {
        boolean z5 = obj instanceof L;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864q;
        if (z5) {
            if (((L) obj).f3815q) {
                return 0;
            }
            L l7 = AbstractC0263y.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            T();
            return 1;
        }
        if (!(obj instanceof W)) {
            return 0;
        }
        k0 k0Var = ((W) obj).f3831q;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        T();
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object Z(Object obj, Object obj2) {
        if (!(obj instanceof X)) {
            return AbstractC0263y.f3904d;
        }
        if (((obj instanceof L) || (obj instanceof e0)) && !(obj instanceof C0251l) && !(obj2 instanceof C0255p)) {
            X x6 = (X) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864q;
            Object y6 = obj2 instanceof X ? new Y((X) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x6, y6)) {
                if (atomicReferenceFieldUpdater.get(this) != x6) {
                    return AbstractC0263y.f;
                }
            }
            S(obj2);
            y(x6, obj2);
            return obj2;
        }
        X x7 = (X) obj;
        k0 k0VarE = E(x7);
        if (k0VarE == null) {
            return AbstractC0263y.f;
        }
        h0 h0Var = x7 instanceof h0 ? (h0) x7 : null;
        if (h0Var == null) {
            h0Var = new h0(k0VarE, null);
        }
        synchronized (h0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f3859r;
            if (atomicIntegerFieldUpdater.get(h0Var) == 1) {
                return AbstractC0263y.f3904d;
            }
            atomicIntegerFieldUpdater.set(h0Var, 1);
            if (h0Var != x7) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3864q;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x7, h0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x7) {
                        return AbstractC0263y.f;
                    }
                }
            }
            boolean zE = h0Var.e();
            C0255p c0255p = obj2 instanceof C0255p ? (C0255p) obj2 : null;
            if (c0255p != null) {
                h0Var.a(c0255p.f3878a);
            }
            Throwable thC = zE ? null : h0Var.c();
            if (thC != null) {
                R(k0VarE, thC);
            }
            C0251l c0251lQ = Q(k0VarE);
            if (c0251lQ != null && a0(h0Var, c0251lQ, obj2)) {
                return AbstractC0263y.f3905e;
            }
            k0VarE.e(new R5.i(2), 2);
            C0251l c0251lQ2 = Q(k0VarE);
            return (c0251lQ2 == null || !a0(h0Var, c0251lQ2, obj2)) ? A(h0Var, obj2) : AbstractC0263y.f3905e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new c0(w(), null, this);
        }
        t(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a0(h0 h0Var, C0251l c0251l, Object obj) {
        while (AbstractC0263y.q(c0251l.f3869u, false, new g0(this, h0Var, c0251l, obj)) == m0.f3871q) {
            c0251l = Q(c0251l);
            if (c0251l == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public boolean b() {
        Object obj = f3864q.get(this);
        return (obj instanceof X) && ((X) obj).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final J c(boolean z5, boolean z6, C0100s c0100s) {
        return J(z6, z5 ? new C0239a0(c0100s) : new K(1, c0100s));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final Object f(s5.c cVar) {
        Object obj;
        C1386y c1386y;
        do {
            obj = f3864q.get(this);
            boolean z5 = obj instanceof X;
            c1386y = C1386y.f15098a;
            if (!z5) {
                AbstractC0263y.i(cVar.getContext());
                return c1386y;
            }
        } while (X(obj) < 0);
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(cVar));
        c0247h.s();
        c0247h.v(new C0244e(2, AbstractC0263y.q(this, true, new C0249j(c0247h, 1))));
        Object objR = c0247h.r();
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objR != enumC1580a) {
            objR = c1386y;
        }
        return objR == enumC1580a ? objR : c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return eVar.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        return E3.h.A(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1527f
    public final InterfaceC1528g getKey() {
        return C0258t.f3885r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final boolean isCancelled() {
        Object obj = f3864q.get(this);
        if (obj instanceof C0255p) {
            return true;
        }
        return (obj instanceof h0) && ((h0) obj).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        return E3.h.I(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p(Object obj) {
        m(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        return E3.h.L(this, interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object r(s5.i iVar) throws Throwable {
        Object obj;
        do {
            obj = f3864q.get(this);
            if (!(obj instanceof X)) {
                if (obj instanceof C0255p) {
                    throw ((C0255p) obj).f3878a;
                }
                return AbstractC0263y.z(obj);
            }
        } while (X(obj) < 0);
        f0 f0Var = new f0(AbstractC1397A.v(iVar), this);
        f0Var.s();
        f0Var.v(new C0244e(2, AbstractC0263y.q(this, true, new K(2, f0Var))));
        return f0Var.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.lang.Object r10) {
        /*
            r9 = this;
            E4.f r0 = M5.AbstractC0263y.f3904d
            boolean r1 = r9.D()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L41
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.i0.f3864q
            java.lang.Object r0 = r0.get(r9)
            boolean r1 = r0 instanceof M5.X
            if (r1 == 0) goto L39
            boolean r1 = r0 instanceof M5.h0
            if (r1 == 0) goto L27
            r1 = r0
            M5.h0 r1 = (M5.h0) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = M5.h0.f3859r
            int r1 = r4.get(r1)
            if (r1 != r3) goto L27
            goto L39
        L27:
            M5.p r1 = new M5.p
            java.lang.Throwable r4 = r9.z(r10)
            r1.<init>(r2, r4)
            java.lang.Object r0 = r9.Z(r0, r1)
            E4.f r1 = M5.AbstractC0263y.f
            if (r0 == r1) goto La
            goto L3b
        L39:
            E4.f r0 = M5.AbstractC0263y.f3904d
        L3b:
            E4.f r1 = M5.AbstractC0263y.f3905e
            if (r0 != r1) goto L41
            goto L106
        L41:
            E4.f r1 = M5.AbstractC0263y.f3904d
            if (r0 != r1) goto Lfd
            r0 = 0
            r1 = r0
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = M5.i0.f3864q
            java.lang.Object r5 = r4.get(r9)
            boolean r6 = r5 instanceof M5.h0
            if (r6 == 0) goto L9b
            monitor-enter(r5)
            r4 = r5
            M5.h0 r4 = (M5.h0) r4     // Catch: java.lang.Throwable -> L6d
            r4.getClass()     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = M5.h0.f3861t     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L6d
            E4.f r6 = M5.AbstractC0263y.f3907h     // Catch: java.lang.Throwable -> L6d
            if (r4 != r6) goto L64
            r4 = r3
            goto L65
        L64:
            r4 = r2
        L65:
            if (r4 == 0) goto L6f
            E4.f r10 = M5.AbstractC0263y.f3906g     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
        L6a:
            r0 = r10
            goto Lfd
        L6d:
            r10 = move-exception
            goto L99
        L6f:
            r4 = r5
            M5.h0 r4 = (M5.h0) r4     // Catch: java.lang.Throwable -> L6d
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L7c
            java.lang.Throwable r1 = r9.z(r10)     // Catch: java.lang.Throwable -> L6d
        L7c:
            r10 = r5
            M5.h0 r10 = (M5.h0) r10     // Catch: java.lang.Throwable -> L6d
            r10.a(r1)     // Catch: java.lang.Throwable -> L6d
            r10 = r5
            M5.h0 r10 = (M5.h0) r10     // Catch: java.lang.Throwable -> L6d
            java.lang.Throwable r10 = r10.c()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L8c
            r0 = r10
        L8c:
            monitor-exit(r5)
            if (r0 == 0) goto L96
            M5.h0 r5 = (M5.h0) r5
            M5.k0 r10 = r5.f3862q
            r9.R(r10, r0)
        L96:
            E4.f r10 = M5.AbstractC0263y.f3904d
            goto L6a
        L99:
            monitor-exit(r5)
            throw r10
        L9b:
            boolean r6 = r5 instanceof M5.X
            if (r6 == 0) goto Lf9
            if (r1 != 0) goto La5
            java.lang.Throwable r1 = r9.z(r10)
        La5:
            r6 = r5
            M5.X r6 = (M5.X) r6
            boolean r7 = r6.b()
            if (r7 == 0) goto Lce
            M5.k0 r7 = r9.E(r6)
            if (r7 != 0) goto Lb5
            goto L47
        Lb5:
            M5.h0 r8 = new M5.h0
            r8.<init>(r7, r1)
        Lba:
            boolean r5 = r4.compareAndSet(r9, r6, r8)
            if (r5 == 0) goto Lc6
            r9.R(r7, r1)
            E4.f r10 = M5.AbstractC0263y.f3904d
            goto L6a
        Lc6:
            java.lang.Object r5 = r4.get(r9)
            if (r5 == r6) goto Lba
            goto L47
        Lce:
            M5.p r4 = new M5.p
            r4.<init>(r2, r1)
            java.lang.Object r4 = r9.Z(r5, r4)
            E4.f r6 = M5.AbstractC0263y.f3904d
            if (r4 == r6) goto Le1
            E4.f r5 = M5.AbstractC0263y.f
            if (r4 == r5) goto L47
            r0 = r4
            goto Lfd
        Le1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lf9:
            E4.f r10 = M5.AbstractC0263y.f3906g
            goto L6a
        Lfd:
            E4.f r10 = M5.AbstractC0263y.f3904d
            if (r0 != r10) goto L102
            goto L106
        L102:
            E4.f r10 = M5.AbstractC0263y.f3905e
            if (r0 != r10) goto L107
        L106:
            return r3
        L107:
            E4.f r10 = M5.AbstractC0263y.f3906g
            if (r0 != r10) goto L10c
            return r2
        L10c:
            r9.m(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.i0.s(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final boolean start() {
        int iX;
        do {
            iX = X(f3864q.get(this));
            if (iX == 0) {
                return false;
            }
        } while (iX != 1);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P() + '{' + Y(f3864q.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0263y.m(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u(Throwable th) {
        if (L()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC0250k interfaceC0250k = (InterfaceC0250k) f3865r.get(this);
        return (interfaceC0250k == null || interfaceC0250k == m0.f3871q) ? z5 : interfaceC0250k.c(th) || z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final CancellationException v() {
        CancellationException cancellationException;
        Object obj = f3864q.get(this);
        if (!(obj instanceof h0)) {
            if (obj instanceof X) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0255p)) {
                return new c0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0255p) obj).f3878a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new c0(w(), th, this) : cancellationException;
        }
        Throwable thC = ((h0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = w();
        }
        return new c0(strConcat, thC, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String w() {
        return "Job was cancelled";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(X x6, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3865r;
        InterfaceC0250k interfaceC0250k = (InterfaceC0250k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0250k != null) {
            interfaceC0250k.a();
            atomicReferenceFieldUpdater.set(this, m0.f3871q);
        }
        C2.e eVar = null;
        C0255p c0255p = obj instanceof C0255p ? (C0255p) obj : null;
        Throwable th = c0255p != null ? c0255p.f3878a : null;
        if (x6 instanceof e0) {
            try {
                ((e0) x6).l(th);
                return;
            } catch (Throwable th2) {
                H(new C2.e("Exception in completion handler " + x6 + " for " + this, th2));
                return;
            }
        }
        k0 k0VarD = x6.d();
        if (k0VarD != null) {
            k0VarD.e(new R5.i(1), 1);
            Object obj2 = R5.j.f7250q.get(k0VarD);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (R5.j jVarH = (R5.j) obj2; !jVarH.equals(k0VarD); jVarH = jVarH.h()) {
                if (jVarH instanceof e0) {
                    try {
                        ((e0) jVarH).l(th);
                    } catch (Throwable th3) {
                        if (eVar != null) {
                            AbstractC1362a.a(eVar, th3);
                        } else {
                            eVar = new C2.e("Exception in completion handler " + jVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (eVar != null) {
                H(eVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable z(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        i0 i0Var = (i0) ((o0) obj);
        Object obj2 = f3864q.get(i0Var);
        if (obj2 instanceof h0) {
            thC = ((h0) obj2).c();
        } else if (obj2 instanceof C0255p) {
            thC = ((C0255p) obj2).f3878a;
        } else {
            if (obj2 instanceof X) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new c0("Parent job is ".concat(Y(obj2)), thC, i0Var) : cancellationException;
    }

    public void T() {
    }

    public void H(C2.e eVar) {
        throw eVar;
    }

    public void S(Object obj) {
    }

    public void m(Object obj) {
    }
}
