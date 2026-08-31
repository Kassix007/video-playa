package R5;

import C0.S;
import M5.AbstractC0257s;
import M5.C0256q;
import M5.D;
import M5.InterfaceC0259u;
import M5.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1362a;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E4.f f7226a = new E4.f("CLOSED", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E4.f f7227b = new E4.f("UNDEFINED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E4.f f7228c = new E4.f("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E4.f f7229d = new E4.f("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0256q f7230e;
    public static final C0256q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0256q f7231g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte b7 = 0;
        f7230e = new C0256q(4, b7);
        f = new C0256q(5, b7);
        f7231g = new C0256q(6, b7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(k1.i.i(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(s sVar, long j, B5.e eVar) {
        while (true) {
            if (sVar.f7268c >= j && !sVar.c()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7232a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            E4.f fVar = f7226a;
            if (obj == fVar) {
                return fVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) eVar.invoke(Long.valueOf(sVar.f7268c + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.c()) {
                    sVar.d();
                }
            }
            sVar = sVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final s c(Object obj) {
        if (obj != f7226a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(Throwable th, InterfaceC1529h interfaceC1529h) {
        Throwable runtimeException;
        Iterator it = e.f7235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0259u) it.next()).W(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1362a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC1362a.a(th, new f(interfaceC1529h));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(Object obj) {
        return obj == f7226a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(InterfaceC1529h interfaceC1529h, Object obj) {
        if (obj == f7229d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object objFold = interfaceC1529h.fold(null, f);
            kotlin.jvm.internal.m.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            S.t(objFold);
            throw null;
        }
        w wVar = (w) obj;
        r0[] r0VarArr = wVar.f7274b;
        int length = r0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        r0 r0Var = r0VarArr[length];
        kotlin.jvm.internal.m.b(null);
        Object obj2 = wVar.f7273a[length];
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, q5.InterfaceC1524c r10) {
        /*
            boolean r0 = r10 instanceof R5.g
            if (r0 == 0) goto Lae
            R5.g r10 = (R5.g) r10
            M5.s r0 = r10.f7238t
            java.lang.Throwable r1 = m5.AbstractC1374m.a(r9)
            if (r1 != 0) goto L10
            r2 = r9
            goto L16
        L10:
            M5.p r2 = new M5.p
            r3 = 0
            r2.<init>(r3, r1)
        L16:
            q5.c r1 = r10.f7239u
            q5.h r3 = r1.getContext()
            boolean r3 = j(r0, r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r10.f7240v = r2
            r10.f3809s = r4
            q5.h r9 = r1.getContext()
            i(r0, r9, r10)
            return
        L2f:
            M5.S r0 = M5.s0.a()
            long r5 = r0.f3826q
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r10.f7240v = r2
            r10.f3809s = r4
            r0.b0(r10)
            goto La8
        L46:
            r0.d0(r4)
            q5.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            M5.t r3 = M5.C0258t.f3885r     // Catch: java.lang.Throwable -> L69
            q5.f r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            M5.b0 r2 = (M5.InterfaceC0241b0) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.v()     // Catch: java.lang.Throwable -> L69
            m5.l r9 = m5.AbstractC1362a.b(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f7241w     // Catch: java.lang.Throwable -> L69
            q5.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = n(r3, r2)     // Catch: java.lang.Throwable -> L69
            E4.f r5 = R5.b.f7229d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            M5.y0 r5 = M5.AbstractC0263y.A(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.f0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.f0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.a0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.f0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.f(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.a0(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.b.h(java.lang.Object, q5.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(AbstractC0257s abstractC0257s, InterfaceC1529h interfaceC1529h, Runnable runnable) {
        try {
            abstractC0257s.dispatch(interfaceC1529h, runnable);
        } catch (Throwable th) {
            throw new D(th, abstractC0257s, interfaceC1529h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean j(AbstractC0257s abstractC0257s, InterfaceC1529h interfaceC1529h) throws D {
        try {
            return abstractC0257s.isDispatchNeeded(interfaceC1529h);
        } catch (Throwable th) {
            throw new D(th, abstractC0257s, interfaceC1529h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long k(String str, long j, long j7, long j8) {
        String property;
        int i = u.f7270a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lI0 = J5.t.I0(property);
        if (lI0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lI0.longValue();
        if (j7 <= jLongValue && jLongValue <= j8) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j8 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l(String str, int i, int i7) {
        return (int) k(str, i, 1, (i7 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object m(InterfaceC1529h interfaceC1529h) {
        Object objFold = interfaceC1529h.fold(0, f7230e);
        kotlin.jvm.internal.m.b(objFold);
        return objFold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object n(InterfaceC1529h interfaceC1529h, Object obj) {
        if (obj == null) {
            obj = m(interfaceC1529h);
        }
        if (obj == 0) {
            return f7229d;
        }
        if (obj instanceof Integer) {
            return interfaceC1529h.fold(new w(((Number) obj).intValue(), interfaceC1529h), f7231g);
        }
        S.t(obj);
        throw null;
    }
}
