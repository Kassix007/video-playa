package M5;

import C0.C0100s;
import com.google.android.gms.internal.measurement.I1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m5.AbstractC1362a;
import m5.AbstractC1374m;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.C1525d;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1526e;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: M5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0263y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E4.f f3901a = new E4.f("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E4.f f3902b = new E4.f("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E4.f f3903c = new E4.f("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E4.f f3904d = new E4.f("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E4.f f3905e = new E4.f("COMPLETING_WAITING_CHILDREN", 1);
    public static final E4.f f = new E4.f("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E4.f f3906g = new E4.f("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E4.f f3907h = new E4.f("SEALED", 1);
    public static final L i = new L(false);
    public static final L j = new L(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final y0 A(InterfaceC1524c interfaceC1524c, InterfaceC1529h interfaceC1529h, Object obj) {
        y0 y0Var = null;
        if ((interfaceC1524c instanceof s5.d) && interfaceC1529h.get(z0.f3911q) != null) {
            s5.d callerFrame = (s5.d) interfaceC1524c;
            while (true) {
                if ((callerFrame instanceof E) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof y0) {
                    y0Var = (y0) callerFrame;
                    break;
                }
            }
            if (y0Var != null) {
                y0Var.h0(interfaceC1529h, obj);
            }
        }
        return y0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object B(InterfaceC1529h interfaceC1529h, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        InterfaceC1529h context = interfaceC1524c.getContext();
        InterfaceC1529h interfaceC1529hPlus = !((Boolean) interfaceC1529h.fold(Boolean.FALSE, new C0256q(0, (byte) 0))).booleanValue() ? context.plus(interfaceC1529h) : j(context, interfaceC1529h, false);
        i(interfaceC1529hPlus);
        if (interfaceC1529hPlus == context) {
            R5.r rVar = new R5.r(interfaceC1524c, interfaceC1529hPlus);
            return I1.D0(rVar, true, rVar, eVar);
        }
        C1525d c1525d = C1525d.f16021q;
        if (kotlin.jvm.internal.m.a(interfaceC1529hPlus.get(c1525d), context.get(c1525d))) {
            y0 y0Var = new y0(interfaceC1524c, interfaceC1529hPlus);
            InterfaceC1529h interfaceC1529h2 = y0Var.f3835s;
            Object objN = R5.b.n(interfaceC1529h2, null);
            try {
                return I1.D0(y0Var, true, y0Var, eVar);
            } finally {
                R5.b.g(interfaceC1529h2, objN);
            }
        }
        E e7 = new E(interfaceC1524c, interfaceC1529hPlus);
        try {
            R5.b.h(C1386y.f15098a, AbstractC1397A.v(AbstractC1397A.p(eVar, e7, e7)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E.f3808u;
            do {
                int i7 = atomicIntegerFieldUpdater.get(e7);
                if (i7 != 0) {
                    if (i7 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objZ = z(i0.f3864q.get(e7));
                    if (objZ instanceof C0255p) {
                        throw ((C0255p) objZ).f3878a;
                    }
                    return objZ;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(e7, 0, 1));
            return EnumC1580a.f16356q;
        } catch (Throwable th) {
            th = th;
            if (th instanceof D) {
                th = ((D) th).f3807q;
            }
            e7.resumeWith(AbstractC1362a.b(th));
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(long r5, B5.e r7, s5.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof M5.w0
            if (r0 == 0) goto L13
            r0 = r8
            M5.w0 r0 = (M5.w0) r0
            int r1 = r0.f3894s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3894s = r1
            goto L18
        L13:
            M5.w0 r0 = new M5.w0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3893r
            int r1 = r0.f3894s
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.y r5 = r0.f3892q
            m5.AbstractC1362a.e(r8)     // Catch: M5.u0 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L79
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            m5.AbstractC1362a.e(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L7f
        L3b:
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            r0.f3892q = r8     // Catch: M5.u0 -> L77
            r0.f3894s = r2     // Catch: M5.u0 -> L77
            M5.v0 r1 = new M5.v0     // Catch: M5.u0 -> L77
            r1.<init>(r5, r0)     // Catch: M5.u0 -> L77
            r8.f14268q = r1     // Catch: M5.u0 -> L77
            q5.c r5 = r1.f7266t     // Catch: M5.u0 -> L73
            q5.h r5 = r5.getContext()     // Catch: M5.u0 -> L73
            M5.C r5 = l(r5)     // Catch: M5.u0 -> L73
            long r3 = r1.f3891u     // Catch: M5.u0 -> L73
            q5.h r6 = r1.f3835s     // Catch: M5.u0 -> L73
            M5.J r5 = r5.n(r3, r1, r6)     // Catch: M5.u0 -> L73
            M5.K r6 = new M5.K     // Catch: M5.u0 -> L73
            r0 = 0
            r6.<init>(r0, r5)     // Catch: M5.u0 -> L73
            q(r1, r2, r6)     // Catch: M5.u0 -> L73
            r5 = 0
            java.lang.Object r5 = com.google.android.gms.internal.measurement.I1.D0(r1, r5, r1, r7)     // Catch: M5.u0 -> L73
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r5 != r6) goto L70
            return r6
        L70:
            return r5
        L71:
            r6 = r5
            goto L75
        L73:
            r5 = move-exception
            goto L71
        L75:
            r5 = r8
            goto L79
        L77:
            r6 = move-exception
            goto L75
        L79:
            M5.b0 r7 = r6.f3889q
            java.lang.Object r5 = r5.f14268q
            if (r7 != r5) goto L81
        L7f:
            r5 = 0
            return r5
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.AbstractC0263y.C(long, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final R5.d a(InterfaceC1529h interfaceC1529h) {
        if (interfaceC1529h.get(C0258t.f3885r) == null) {
            interfaceC1529h = interfaceC1529h.plus(b());
        }
        return new R5.d(interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d0 b() {
        return new d0(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q0 c() {
        return new q0(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static B d(InterfaceC0261w interfaceC0261w, N5.f fVar, B5.e eVar, int i7) {
        boolean z5 = true;
        InterfaceC1529h interfaceC1529h = fVar;
        if ((i7 & 1) != 0) {
            interfaceC1529h = C1530i.f16022q;
        }
        B b7 = new B(u(interfaceC0261w, interfaceC1529h), z5, 0);
        b7.d0(EnumC0262x.f3895q, b7, eVar);
        return b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(InterfaceC0261w interfaceC0261w, CancellationException cancellationException) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC0261w.d().get(C0258t.f3885r);
        if (interfaceC0241b0 != null) {
            interfaceC0241b0.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0261w).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(InterfaceC1529h interfaceC1529h, CancellationException cancellationException) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r);
        if (interfaceC0241b0 != null) {
            interfaceC0241b0.a(cancellationException);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object g(B5.e eVar, InterfaceC1524c interfaceC1524c) {
        R5.r rVar = new R5.r(interfaceC1524c, interfaceC1524c.getContext());
        return I1.D0(rVar, true, rVar, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object h(long j7, s5.c cVar) {
        if (j7 > 0) {
            C0247h c0247h = new C0247h(1, AbstractC1397A.v(cVar));
            c0247h.s();
            if (j7 < Long.MAX_VALUE) {
                l(c0247h.f3858u).z(j7, c0247h);
            }
            Object objR = c0247h.r();
            if (objR == EnumC1580a.f16356q) {
                return objR;
            }
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(InterfaceC1529h interfaceC1529h) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r);
        if (interfaceC0241b0 != null && !interfaceC0241b0.b()) {
            throw interfaceC0241b0.v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC1529h j(InterfaceC1529h interfaceC1529h, InterfaceC1529h interfaceC1529h2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        byte b7 = 0;
        boolean zBooleanValue = ((Boolean) interfaceC1529h.fold(bool, new C0256q(0, b7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC1529h2.fold(bool, new C0256q(b7, (byte) 0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC1529h.plus(interfaceC1529h2);
        }
        C0256q c0256q = new C0256q(1, (byte) 0);
        C1530i c1530i = C1530i.f16022q;
        InterfaceC1529h interfaceC1529h3 = (InterfaceC1529h) interfaceC1529h.fold(c1530i, c0256q);
        Object objFold = interfaceC1529h2;
        if (zBooleanValue2) {
            objFold = interfaceC1529h2.fold(c1530i, new C0256q(2, (byte) 0));
        }
        return interfaceC1529h3.plus((InterfaceC1529h) objFold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0257s k(Executor executor) {
        G g7 = executor instanceof G ? (G) executor : null;
        return g7 != null ? g7.f3810q : new U(executor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C l(InterfaceC1529h interfaceC1529h) {
        InterfaceC1527f interfaceC1527f = interfaceC1529h.get(C1525d.f16021q);
        C c7 = interfaceC1527f instanceof C ? (C) interfaceC1527f : null;
        return c7 == null ? A.f3804a : c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0241b0 n(InterfaceC1529h interfaceC1529h) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r);
        if (interfaceC0241b0 != null) {
            return interfaceC0241b0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC1529h).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0247h o(InterfaceC1524c interfaceC1524c) {
        C0247h c0247h;
        C0247h c0247h2;
        if (!(interfaceC1524c instanceof R5.g)) {
            return new C0247h(1, interfaceC1524c);
        }
        R5.g gVar = (R5.g) interfaceC1524c;
        E4.f fVar = R5.b.f7228c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.g.f7237x;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            c0247h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, fVar);
                c0247h2 = null;
                break;
            }
            if (obj instanceof C0247h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, fVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                c0247h2 = (C0247h) obj;
                break loop0;
            }
            if (obj != fVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0247h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0247h.f3855w;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0247h2);
            if (!(obj2 instanceof C0254o) || ((C0254o) obj2).f3875d == null) {
                C0247h.f3854v.set(c0247h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0247h2, C0240b.f3838a);
                c0247h = c0247h2;
            } else {
                c0247h2.l();
            }
            if (c0247h != null) {
                return c0247h;
            }
        }
        return new C0247h(2, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(Throwable th, InterfaceC1529h interfaceC1529h) {
        if (th instanceof D) {
            th = ((D) th).f3807q;
        }
        try {
            InterfaceC0259u interfaceC0259u = (InterfaceC0259u) interfaceC1529h.get(C0258t.f3884q);
            if (interfaceC0259u != null) {
                interfaceC0259u.W(th);
            } else {
                R5.b.d(th, interfaceC1529h);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1362a.a(runtimeException, th);
                th = runtimeException;
            }
            R5.b.d(th, interfaceC1529h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final J q(InterfaceC0241b0 interfaceC0241b0, boolean z5, e0 e0Var) {
        if (interfaceC0241b0 instanceof i0) {
            return ((i0) interfaceC0241b0).J(z5, e0Var);
        }
        return interfaceC0241b0.c(e0Var.k(), z5, new C0100s(1, e0Var, e0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean r(InterfaceC0261w interfaceC0261w) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC0261w.d().get(C0258t.f3885r);
        if (interfaceC0241b0 != null) {
            return interfaceC0241b0.b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(InterfaceC1529h interfaceC1529h) {
        InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r);
        if (interfaceC0241b0 != null) {
            return interfaceC0241b0.b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static B t(InterfaceC0261w interfaceC0261w, InterfaceC1529h interfaceC1529h, EnumC0262x enumC0262x, B5.e eVar, int i7) {
        B b7;
        if ((i7 & 1) != 0) {
            interfaceC1529h = C1530i.f16022q;
        }
        if ((i7 & 2) != 0) {
            enumC0262x = EnumC0262x.f3895q;
        }
        InterfaceC1529h interfaceC1529hU = u(interfaceC0261w, interfaceC1529h);
        enumC0262x.getClass();
        if (enumC0262x == EnumC0262x.f3896r) {
            b7 = new j0(interfaceC1529hU, eVar);
        } else {
            b7 = new B(interfaceC1529hU, true, 1);
        }
        b7.d0(enumC0262x, b7, eVar);
        return b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC1529h u(InterfaceC0261w interfaceC0261w, InterfaceC1529h interfaceC1529h) {
        InterfaceC1529h interfaceC1529hJ = j(interfaceC0261w.d(), interfaceC1529h, true);
        T5.e eVar = H.f3811a;
        return (interfaceC1529hJ == eVar || interfaceC1529hJ.get(C1525d.f16021q) != null) ? interfaceC1529hJ : interfaceC1529hJ.plus(eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object v(Object obj) {
        return obj instanceof C0255p ? AbstractC1362a.b(((C0255p) obj).f3878a) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(C0247h c0247h, InterfaceC1524c interfaceC1524c, boolean z5) {
        Object obj = C0247h.f3855w.get(c0247h);
        Throwable thD = c0247h.d(obj);
        Object objB = thD != null ? AbstractC1362a.b(thD) : c0247h.e(obj);
        if (!z5) {
            interfaceC1524c.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.m.c(interfaceC1524c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        R5.g gVar = (R5.g) interfaceC1524c;
        InterfaceC1524c interfaceC1524c2 = gVar.f7239u;
        Object obj2 = gVar.f7241w;
        InterfaceC1529h context = interfaceC1524c2.getContext();
        Object objN = R5.b.n(context, obj2);
        y0 y0VarA = objN != R5.b.f7229d ? A(interfaceC1524c2, context, objN) : null;
        try {
            interfaceC1524c2.resumeWith(objB);
            if (y0VarA == null || y0VarA.f0()) {
                R5.b.g(context, objN);
            }
        } catch (Throwable th) {
            if (y0VarA == null || y0VarA.f0()) {
                R5.b.g(context, objN);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object x(InterfaceC1529h interfaceC1529h, B5.e eVar) throws Throwable {
        S sA;
        InterfaceC1529h interfaceC1529hJ;
        long jE0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC1528g interfaceC1528g = C1525d.f16021q;
        InterfaceC1526e interfaceC1526e = (InterfaceC1526e) interfaceC1529h.get(interfaceC1528g);
        C1530i c1530i = C1530i.f16022q;
        if (interfaceC1526e == null) {
            sA = s0.a();
            interfaceC1529hJ = j(c1530i, interfaceC1529h.plus(sA), true);
            T5.e eVar2 = H.f3811a;
            if (interfaceC1529hJ != eVar2 && interfaceC1529hJ.get(interfaceC1528g) == null) {
                interfaceC1529hJ = interfaceC1529hJ.plus(eVar2);
            }
        } else {
            if (interfaceC1526e instanceof S) {
            }
            sA = (S) s0.f3883a.get();
            interfaceC1529hJ = j(c1530i, interfaceC1529h, true);
            T5.e eVar3 = H.f3811a;
            if (interfaceC1529hJ != eVar3 && interfaceC1529hJ.get(interfaceC1528g) == null) {
                interfaceC1529hJ = interfaceC1529hJ.plus(eVar3);
            }
        }
        C0242c c0242c = new C0242c(interfaceC1529hJ, threadCurrentThread, sA);
        c0242c.d0(EnumC0262x.f3895q, c0242c, eVar);
        S s6 = c0242c.f3840u;
        if (s6 != null) {
            int i7 = S.f3825t;
            s6.d0(false);
        }
        while (true) {
            if (s6 != null) {
                try {
                    jE0 = s6.e0();
                } catch (Throwable th) {
                    if (s6 != null) {
                        int i8 = S.f3825t;
                        s6.a0(false);
                    }
                    throw th;
                }
            } else {
                jE0 = Long.MAX_VALUE;
            }
            atomicReferenceFieldUpdater = i0.f3864q;
            if (!(atomicReferenceFieldUpdater.get(c0242c) instanceof X)) {
                break;
            }
            LockSupport.parkNanos(c0242c, jE0);
            if (Thread.interrupted()) {
                c0242c.s(new InterruptedException());
            }
        }
        if (s6 != null) {
            int i9 = S.f3825t;
            s6.a0(false);
        }
        Object objZ = z(atomicReferenceFieldUpdater.get(c0242c));
        C0255p c0255p = objZ instanceof C0255p ? (C0255p) objZ : null;
        if (c0255p == null) {
            return objZ;
        }
        throw c0255p.f3878a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String y(InterfaceC1524c interfaceC1524c) {
        Object objB;
        if (interfaceC1524c instanceof R5.g) {
            return ((R5.g) interfaceC1524c).toString();
        }
        try {
            objB = interfaceC1524c + '@' + m(interfaceC1524c);
        } catch (Throwable th) {
            objB = AbstractC1362a.b(th);
        }
        if (AbstractC1374m.a(objB) != null) {
            objB = interfaceC1524c.getClass().getName() + '@' + m(interfaceC1524c);
        }
        return (String) objB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object z(Object obj) {
        X x6;
        Y y6 = obj instanceof Y ? (Y) obj : null;
        return (y6 == null || (x6 = y6.f3832a) == null) ? obj : x6;
    }
}
