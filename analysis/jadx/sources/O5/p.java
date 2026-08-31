package O5;

import C0.S;
import kotlin.jvm.internal.z;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f5254A;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(int i, a aVar) {
        super(i);
        this.f5254A = aVar;
        if (aVar != a.f5206q) {
            if (i < 1) {
                throw new IllegalArgumentException(S.m("Buffered channel capacity must be at least 1, but ", " was specified", i).toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.a(e.class).c() + " instead").toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            O5.a r1 = r15.f5254A
            O5.a r2 = O5.a.f5208s
            m5.y r8 = m5.C1386y.f15098a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.j(r16)
            boolean r2 = r1 instanceof O5.k
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof O5.j
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            E4.f r6 = O5.g.f5233d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O5.e.f5223v
            java.lang.Object r1 = r1.get(r15)
            O5.m r1 = (O5.m) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = O5.e.f5219r
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.v(r7, r2)
            int r9 = O5.g.f5231b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f7268c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            O5.m r2 = O5.e.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = O5.e.d(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = O5.e.f5220s
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.h()
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof M5.A0
            if (r3 == 0) goto La6
            M5.A0 r6 = (M5.A0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f7268c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.n(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.p.K(java.lang.Object, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.e, O5.w
    public final Object j(Object obj) {
        return K(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.e, O5.w
    public final Object k(Object obj, InterfaceC1524c interfaceC1524c) throws Throwable {
        if (K(obj, true) instanceof j) {
            throw s();
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.e
    public final boolean y() {
        return this.f5254A == a.f5207r;
    }
}
