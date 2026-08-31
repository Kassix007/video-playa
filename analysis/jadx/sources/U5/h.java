package U5;

import M5.A0;
import M5.C0246g;
import M5.InterfaceC0245f;
import R5.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7900c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7901d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7902e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7903g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0246g f7905b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(int i) {
        this.f7904a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(k1.i.i(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(k1.i.i(i, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i;
        this.f7905b = new C0246g(2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.n(r3, r4.f7905b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(s5.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = U5.h.f7903g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f7904a
            if (r1 > r2) goto L0
            m5.y r3 = m5.C1386y.f15098a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            q5.c r5 = n5.AbstractC1397A.v(r5)
            M5.h r5 = M5.AbstractC0263y.o(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            M5.g r0 = r4.f7905b     // Catch: java.lang.Throwable -> L3f
            r5.n(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.r()
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.h.a(s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(A0 a02) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        f fVar = f.f7898q;
        long j = andIncrement / ((long) j.f);
        loop0: while (true) {
            objB = R5.b.b(kVar, j, fVar);
            if (!R5.b.e(objB)) {
                s sVarC = R5.b.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f7268c >= sVarC.f7268c) {
                        break loop0;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.e()) {
                                sVarC.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) R5.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.f7911e;
        int i = (int) (andIncrement % ((long) j.f));
        while (!atomicReferenceArray.compareAndSet(i, null, a02)) {
            if (atomicReferenceArray.get(i) != null) {
                E4.f fVar2 = j.f7907b;
                E4.f fVar3 = j.f7908c;
                while (!atomicReferenceArray.compareAndSet(i, fVar2, fVar3)) {
                    if (atomicReferenceArray.get(i) != fVar2) {
                        return false;
                    }
                }
                ((InterfaceC0245f) a02).n(C1386y.f15098a, this.f7905b);
                return true;
            }
        }
        a02.a(kVar2, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int i;
        Object objB;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7903g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i7 = this.f7904a;
            if (andIncrement >= i7) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i7) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i7));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i7).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7900c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f7901d.getAndIncrement(this);
            long j = andIncrement2 / ((long) j.f);
            g gVar = g.f7899q;
            while (true) {
                objB = R5.b.b(kVar, j, gVar);
                if (R5.b.e(objB)) {
                    break;
                }
                s sVarC = R5.b.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f7268c >= sVarC.f7268c) {
                        break;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.e()) {
                                sVarC.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            }
            k kVar2 = (k) R5.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.f7911e;
            kVar2.a();
            z5 = false;
            if (kVar2.f7268c <= j) {
                int i8 = (int) (andIncrement2 % ((long) j.f));
                Object andSet = atomicReferenceArray.getAndSet(i8, j.f7907b);
                if (andSet == null) {
                    int i9 = j.f7906a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (atomicReferenceArray.get(i8) == j.f7908c) {
                            z5 = true;
                            break;
                        }
                    }
                    E4.f fVar = j.f7907b;
                    E4.f fVar2 = j.f7909d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i8, fVar, fVar2)) {
                            if (atomicReferenceArray.get(i8) != fVar) {
                                break;
                            }
                        } else {
                            z5 = true;
                            break;
                        }
                    }
                    z5 = !z5;
                } else if (andSet != j.f7910e) {
                    if (!(andSet instanceof InterfaceC0245f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0245f interfaceC0245f = (InterfaceC0245f) andSet;
                    E4.f fVarO = interfaceC0245f.o(C1386y.f15098a, this.f7905b);
                    if (fVarO != null) {
                        interfaceC0245f.q(fVarO);
                        z5 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z5);
    }
}
