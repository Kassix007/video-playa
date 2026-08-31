package M5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1374m;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: M5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0247h extends F implements InterfaceC0245f, s5.d, A0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3854v = AtomicIntegerFieldUpdater.newUpdater(C0247h.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3855w = AtomicReferenceFieldUpdater.newUpdater(C0247h.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3856x = AtomicReferenceFieldUpdater.newUpdater(C0247h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1524c f3857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1529h f3858u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0247h(int i, InterfaceC1524c interfaceC1524c) {
        super(i);
        this.f3857t = interfaceC1524c;
        this.f3858u = interfaceC1524c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0240b.f3838a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object D(n0 n0Var, Object obj, int i, B5.f fVar) {
        if (obj instanceof C0255p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (fVar != null || (n0Var instanceof C0244e)) {
            return new C0254o(obj, n0Var instanceof C0244e ? (C0244e) n0Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        InterfaceC1524c interfaceC1524c = this.f3857t;
        Throwable th = null;
        R5.g gVar = interfaceC1524c instanceof R5.g ? (R5.g) interfaceC1524c : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.g.f7237x;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                E4.f fVar = R5.b.f7228c;
                if (obj == fVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != fVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            l();
            g(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(Object obj, int i, B5.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3855w;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n0) {
                Object objD = D((n0) obj2, obj, i, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    l();
                }
                m(i);
                return;
            }
            if (obj2 instanceof C0248i) {
                C0248i c0248i = (C0248i) obj2;
                c0248i.getClass();
                if (C0248i.f3863c.compareAndSet(c0248i, 0, 1)) {
                    if (fVar != null) {
                        j(fVar, c0248i.f3878a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(AbstractC0257s abstractC0257s) {
        InterfaceC1524c interfaceC1524c = this.f3857t;
        R5.g gVar = interfaceC1524c instanceof R5.g ? (R5.g) interfaceC1524c : null;
        B(C1386y.f15098a, (gVar != null ? gVar.f7238t : null) == abstractC0257s ? 4 : this.f3809s, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.A0
    public final void a(R5.s sVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f3854v;
            i7 = atomicIntegerFieldUpdater.get(this);
            if ((i7 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, ((i7 >> 29) << 29) + i));
        v(sVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3855w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof n0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0255p) {
                return;
            }
            if (!(obj instanceof C0254o)) {
                cancellationException2 = cancellationException;
                C0254o c0254o = new C0254o(obj, (C0244e) null, (B5.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0254o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0254o c0254o2 = (C0254o) obj;
            if (c0254o2.f3876e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0254o c0254oA = C0254o.a(c0254o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0254oA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C0244e c0244e = c0254o2.f3873b;
            if (c0244e != null) {
                i(c0244e, cancellationException);
            }
            B5.f fVar = c0254o2.f3874c;
            if (fVar != null) {
                j(fVar, cancellationException, c0254o2.f3872a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final InterfaceC1524c c() {
        return this.f3857t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final Object e(Object obj) {
        return obj instanceof C0254o ? ((C0254o) obj).f3872a : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final boolean g(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3855w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n0)) {
                return false;
            }
            boolean z5 = (obj instanceof C0244e) || (obj instanceof R5.s);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0248i c0248i = new C0248i(z5, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0248i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            n0 n0Var = (n0) obj;
            if (n0Var instanceof C0244e) {
                i((C0244e) obj, th);
            } else if (n0Var instanceof R5.s) {
                k((R5.s) obj, th);
            }
            if (!x()) {
                l();
            }
            m(this.f3809s);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f3857t;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f3858u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final Object h() {
        return f3855w.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(C0244e c0244e, Throwable th) {
        try {
            switch (c0244e.f3844a) {
                case 0:
                    ((ScheduledFuture) c0244e.f3845b).cancel(false);
                    break;
                case 1:
                    ((B5.c) c0244e.f3845b).invoke(th);
                    break;
                default:
                    ((J) c0244e.f3845b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0263y.p(new C2.e("Exception in invokeOnCancellation handler for " + this, th2), this.f3858u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(B5.f fVar, Throwable th, Object obj) {
        InterfaceC1529h interfaceC1529h = this.f3858u;
        try {
            fVar.invoke(th, obj, interfaceC1529h);
        } catch (Throwable th2) {
            AbstractC0263y.p(new C2.e("Exception in resume onCancellation handler for " + this, th2), interfaceC1529h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(R5.s sVar, Throwable th) {
        InterfaceC1529h interfaceC1529h = this.f3858u;
        int i = f3854v.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i, interfaceC1529h);
        } catch (Throwable th2) {
            AbstractC0263y.p(new C2.e("Exception in invokeOnCancellation handler for " + this, th2), interfaceC1529h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3856x;
        J j = (J) atomicReferenceFieldUpdater.get(this);
        if (j == null) {
            return;
        }
        j.a();
        atomicReferenceFieldUpdater.set(this, m0.f3871q);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f3854v;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i == 4;
                InterfaceC1524c interfaceC1524c = this.f3857t;
                if (!z5 && (interfaceC1524c instanceof R5.g)) {
                    boolean z6 = i == 1 || i == 2;
                    int i9 = this.f3809s;
                    if (z6 == (i9 == 1 || i9 == 2)) {
                        R5.g gVar = (R5.g) interfaceC1524c;
                        AbstractC0257s abstractC0257s = gVar.f7238t;
                        InterfaceC1529h context = gVar.f7239u.getContext();
                        if (R5.b.j(abstractC0257s, context)) {
                            R5.b.i(abstractC0257s, context, this);
                            return;
                        }
                        S sA = s0.a();
                        if (sA.f3826q >= 4294967296L) {
                            sA.b0(this);
                            return;
                        }
                        sA.d0(true);
                        try {
                            AbstractC0263y.w(this, interfaceC1524c, true);
                            do {
                            } while (sA.f0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0263y.w(this, interfaceC1524c, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final void n(Object obj, B5.f fVar) {
        B(obj, this.f3809s, fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final E4.f o(Object obj, B5.f fVar) {
        E4.f fVar2 = AbstractC0263y.f3901a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3855w;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n0)) {
                return null;
            }
            Object objD = D((n0) obj2, obj, this.f3809s, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                l();
            }
            return fVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Throwable p(i0 i0Var) {
        return i0Var.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final void q(Object obj) {
        m(this.f3809s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC0241b0 interfaceC0241b0;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f3854v;
            i = atomicIntegerFieldUpdater.get(this);
            int i7 = i >> 29;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f3855w.get(this);
                if (obj instanceof C0255p) {
                    throw ((C0255p) obj).f3878a;
                }
                int i8 = this.f3809s;
                if ((i8 != 1 && i8 != 2) || (interfaceC0241b0 = (InterfaceC0241b0) this.f3858u.get(C0258t.f3885r)) == null || interfaceC0241b0.b()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionV = interfaceC0241b0.v();
                b(cancellationExceptionV);
                throw cancellationExceptionV;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((J) f3856x.get(this)) == null) {
            t();
        }
        if (zX) {
            A();
        }
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        Throwable thA = AbstractC1374m.a(obj);
        if (thA != null) {
            obj = new C0255p(false, thA);
        }
        B(obj, this.f3809s, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        J jT = t();
        if (jT != null && w()) {
            jT.a();
            f3856x.set(this, m0.f3871q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) this.f3858u.get(C0258t.f3885r);
        if (interfaceC0241b0 == null) {
            return null;
        }
        J jQ = AbstractC0263y.q(interfaceC0241b0, true, new C0249j(this, 0));
        do {
            atomicReferenceFieldUpdater = f3856x;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, jQ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return jQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0263y.y(this.f3857t));
        sb.append("){");
        Object obj = f3855w.get(this);
        sb.append(obj instanceof n0 ? "Active" : obj instanceof C0248i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0263y.m(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(B5.c cVar) {
        v(new C0244e(1, cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(M5.n0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.C0247h.f3855w
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof M5.C0240b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lae
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof M5.C0244e
            r3 = 0
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof R5.s
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof M5.C0255p
            if (r1 == 0) goto L5b
            r0 = r2
            M5.p r0 = (M5.C0255p) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = M5.C0255p.f3877b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L57
            boolean r1 = r2 instanceof M5.C0248i
            if (r1 == 0) goto Lae
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.f3878a
        L42:
            boolean r0 = r8 instanceof M5.C0244e
            if (r0 == 0) goto L4c
            M5.e r8 = (M5.C0244e) r8
            r7.i(r8, r3)
            return
        L4c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.m.c(r8, r0)
            R5.s r8 = (R5.s) r8
            r7.k(r8, r3)
            return
        L57:
            y(r8, r2)
            throw r3
        L5b:
            boolean r1 = r2 instanceof M5.C0254o
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L94
            r1 = r2
            M5.o r1 = (M5.C0254o) r1
            M5.e r5 = r1.f3873b
            if (r5 != 0) goto L90
            boolean r5 = r8 instanceof R5.s
            if (r5 == 0) goto L6d
            return
        L6d:
            kotlin.jvm.internal.m.c(r8, r4)
            r4 = r8
            M5.e r4 = (M5.C0244e) r4
            java.lang.Throwable r5 = r1.f3876e
            if (r5 == 0) goto L7b
            r7.i(r4, r5)
            return
        L7b:
            r5 = 29
            M5.o r1 = M5.C0254o.a(r1, r4, r3, r5)
        L81:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L88
            goto Lae
        L88:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L81
            goto L0
        L90:
            y(r8, r2)
            throw r3
        L94:
            boolean r1 = r8 instanceof R5.s
            if (r1 == 0) goto L99
            return
        L99:
            kotlin.jvm.internal.m.c(r8, r4)
            r3 = r8
            M5.e r3 = (M5.C0244e) r3
            M5.o r1 = new M5.o
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        La8:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Laf
        Lae:
            return
        Laf:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto La8
            goto L0
        Lb7:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.C0247h.v(M5.n0):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w() {
        return !(f3855w.get(this) instanceof n0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        if (this.f3809s != 2) {
            return false;
        }
        InterfaceC1524c interfaceC1524c = this.f3857t;
        kotlin.jvm.internal.m.c(interfaceC1524c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return R5.g.f7237x.get((R5.g) interfaceC1524c) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String z() {
        return "CancellableContinuation";
    }
}
