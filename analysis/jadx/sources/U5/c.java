package U5;

import M5.AbstractC0263y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7896h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() {
        super(1);
        this.owner$volatile = d.f7897a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return Math.max(h.f7903g.get(this), 0) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f7895r;
        U5.c.f7896h.set(r2, null);
        r3 = r0.f7894q;
        r3.B(r1, r3.f3809s, new M5.C0246g(0, new J5.i(6, r2, r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(s5.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.f()
            m5.y r1 = m5.C1386y.f15098a
            if (r0 == 0) goto L9
            goto L51
        L9:
            q5.c r7 = n5.AbstractC1397A.v(r7)
            M5.h r7 = M5.AbstractC0263y.o(r7)
            U5.b r0 = new U5.b     // Catch: java.lang.Throwable -> L52
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L52
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = U5.h.f7903g     // Catch: java.lang.Throwable -> L52
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L52
            int r3 = r6.f7904a     // Catch: java.lang.Throwable -> L52
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3e
            U5.c r2 = r0.f7895r     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = U5.c.f7896h     // Catch: java.lang.Throwable -> L52
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L52
            M5.h r3 = r0.f7894q     // Catch: java.lang.Throwable -> L52
            J5.i r4 = new J5.i     // Catch: java.lang.Throwable -> L52
            r5 = 6
            r4.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L52
            int r0 = r3.f3809s     // Catch: java.lang.Throwable -> L52
            M5.g r2 = new M5.g     // Catch: java.lang.Throwable -> L52
            r5 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L52
            r3.B(r1, r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L44
        L3e:
            boolean r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L16
        L44:
            java.lang.Object r7 = r7.r()
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r7 != r0) goto L4d
            goto L4e
        L4d:
            r7 = r1
        L4e:
            if (r7 != r0) goto L51
            return r7
        L51:
            return r1
        L52:
            r0 = move-exception
            r7.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.c.e(s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        int i;
        char c7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f7903g;
            int i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = this.f7904a;
            if (i7 > i8) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i8) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i8));
            } else {
                if (i7 <= 0) {
                    c7 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 - 1)) {
                    f7896h.set(this, null);
                    c7 = 0;
                    break;
                }
            }
        }
        if (c7 == 0) {
            return true;
        }
        if (c7 == 1) {
            return false;
        }
        if (c7 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7896h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            E4.f fVar = d.f7897a;
            if (obj2 != fVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Mutex@" + AbstractC0263y.m(this) + "[isLocked=" + d() + ",owner=" + f7896h.get(this) + ']';
    }
}
