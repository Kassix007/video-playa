package O5;

import C0.S;
import M5.A0;
import M5.AbstractC0263y;
import M5.C0247h;
import M5.InterfaceC0245f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.B;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public class e implements i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5219r = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5220s = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5221t = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5222u = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5223v = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5224w = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5225x = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5226y = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5227z = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5228q;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(int i) {
        this.f5228q = i;
        if (i < 0) {
            throw new IllegalArgumentException(S.m("Invalid channel capacity: ", ", should be >=0", i).toString());
        }
        m mVar = g.f5230a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f5221t.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (z()) {
            mVar2 = g.f5230a;
            kotlin.jvm.internal.m.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f5245s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(O5.e r13, s5.c r14) {
        /*
            boolean r0 = r14 instanceof O5.c
            if (r0 == 0) goto L14
            r0 = r14
            O5.c r0 = (O5.c) r0
            int r1 = r0.f5215s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5215s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            O5.c r0 = new O5.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f5213q
            int r0 = r6.f5215s
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            m5.AbstractC1362a.e(r14)
            O5.l r14 = (O5.l) r14
            java.lang.Object r13 = r14.f5251a
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            m5.AbstractC1362a.e(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = O5.e.f5224w
            java.lang.Object r14 = r14.get(r13)
            O5.m r14 = (O5.m) r14
        L3e:
            boolean r0 = r13.w()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.q()
            O5.j r14 = new O5.j
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.e.f5220s
            long r4 = r0.getAndIncrement(r13)
            int r0 = O5.g.f5231b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f7268c
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            O5.m r0 = r13.p(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.H(r8, r9, r10, r12)
            E4.f r14 = O5.g.f5239m
            if (r13 == r14) goto La0
            E4.f r14 = O5.g.f5241o
            if (r13 != r14) goto L8b
            long r13 = r7.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.a()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            E4.f r14 = O5.g.f5240n
            if (r13 != r14) goto L9c
            r6.f5215s = r1
            r1 = r7
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            r5.a r14 = r5.EnumC1580a.f16356q
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.C(O5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean G(Object obj) {
        if (obj instanceof InterfaceC0245f) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0245f) obj, C1386y.f15098a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final m b(e eVar, long j, m mVar) {
        Object objB;
        e eVar2;
        m mVar2 = g.f5230a;
        f fVar = f.f5229q;
        loop0: while (true) {
            objB = R5.b.b(mVar, j, fVar);
            if (!R5.b.e(objB)) {
                R5.s sVarC = R5.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5223v;
                    R5.s sVar = (R5.s) atomicReferenceFieldUpdater.get(eVar);
                    if (sVar.f7268c >= sVarC.f7268c) {
                        break loop0;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != sVar) {
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
        boolean zE = R5.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5220s;
        if (zE) {
            eVar.x();
            if (mVar.f7268c * ((long) g.f5231b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) R5.b.c(objB);
            long j7 = mVar3.f7268c;
            if (j7 <= j) {
                return mVar3;
            }
            long j8 = ((long) g.f5231b) * j7;
            while (true) {
                long j9 = f5219r.get(eVar);
                long j10 = 1152921504606846975L & j9;
                if (j10 >= j8) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f5219r.compareAndSet(eVar2, j9, (((long) ((int) (j9 >> 60))) << 60) + j10)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j7 * ((long) g.f5231b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(e eVar, Object obj, C0247h c0247h) {
        c0247h.resumeWith(AbstractC1362a.b(eVar.s()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(e eVar, m mVar, int i, Object obj, long j, Object obj2, boolean z5) {
        mVar.m(i, obj);
        if (z5) {
            return eVar.I(mVar, i, obj, j, obj2, z5);
        }
        Object objK = mVar.k(i);
        if (objK == null) {
            if (eVar.e(j)) {
                if (mVar.j(i, null, g.f5233d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof A0) {
            mVar.m(i, null);
            if (eVar.F(objK, obj)) {
                mVar.n(i, g.i);
                return 0;
            }
            E4.f fVar = g.f5237k;
            if (mVar.f.getAndSet((i * 2) + 1, fVar) == fVar) {
                return 5;
            }
            mVar.l(i, true);
            return 5;
        }
        return eVar.I(mVar, i, obj, j, obj2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5222u;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r5, O5.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f7268c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            R5.c r0 = r7.b()
            O5.m r0 = (O5.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            R5.c r5 = r7.b()
            O5.m r5 = (O5.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = O5.e.f5225x
            java.lang.Object r6 = r5.get(r4)
            R5.s r6 = (R5.s) r6
            long r0 = r6.f7268c
            long r2 = r7.f7268c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.A(long, O5.m):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj, InterfaceC1524c interfaceC1524c) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
        c0247h.s();
        c0247h.resumeWith(AbstractC1362a.b(s()));
        Object objR = c0247h.r();
        return objR == EnumC1580a.f16356q ? objR : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(O5.m r14, int r15, long r16, s5.c r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof O5.d
            if (r1 == 0) goto L15
            r1 = r0
            O5.d r1 = (O5.d) r1
            int r2 = r1.f5218s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f5218s = r2
            goto L1a
        L15:
            O5.d r1 = new O5.d
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f5216q
            int r2 = r1.f5218s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            m5.AbstractC1362a.e(r0)
            goto Lf3
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L30:
            m5.AbstractC1362a.e(r0)
            r1.f5218s = r3
            q5.c r0 = n5.AbstractC1397A.v(r1)
            M5.h r1 = M5.AbstractC0263y.o(r0)
            O5.u r7 = new O5.u     // Catch: java.lang.Throwable -> L54
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L54
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            java.lang.Object r0 = r2.H(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L54
            E4.f r5 = O5.g.f5239m     // Catch: java.lang.Throwable -> L54
            if (r0 != r5) goto L58
            r7.a(r14, r15)     // Catch: java.lang.Throwable -> L54
            goto Lea
        L54:
            r0 = move-exception
            r14 = r0
            goto Lf8
        L58:
            E4.f r15 = O5.g.f5241o     // Catch: java.lang.Throwable -> L54
            r8 = 0
            if (r0 != r15) goto Ldf
            long r4 = r13.t()     // Catch: java.lang.Throwable -> L54
            int r15 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r15 >= 0) goto L68
            r14.a()     // Catch: java.lang.Throwable -> L54
        L68:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = O5.e.f5224w     // Catch: java.lang.Throwable -> L54
            java.lang.Object r14 = r14.get(r13)     // Catch: java.lang.Throwable -> L54
            O5.m r14 = (O5.m) r14     // Catch: java.lang.Throwable -> L54
        L70:
            boolean r15 = r13.w()     // Catch: java.lang.Throwable -> L54
            if (r15 == 0) goto L89
            java.lang.Throwable r14 = r13.q()     // Catch: java.lang.Throwable -> L54
            O5.j r15 = new O5.j     // Catch: java.lang.Throwable -> L54
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L54
            O5.l r14 = new O5.l     // Catch: java.lang.Throwable -> L54
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L54
            r1.resumeWith(r14)     // Catch: java.lang.Throwable -> L54
            goto Lea
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r15 = O5.e.f5220s     // Catch: java.lang.Throwable -> L54
            long r5 = r15.getAndIncrement(r13)     // Catch: java.lang.Throwable -> L54
            int r15 = O5.g.f5231b     // Catch: java.lang.Throwable -> L54
            long r3 = (long) r15     // Catch: java.lang.Throwable -> L54
            long r9 = r5 / r3
            long r3 = r5 % r3
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L54
            long r11 = r14.f7268c     // Catch: java.lang.Throwable -> L54
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 == 0) goto La7
            O5.m r15 = r13.p(r9, r14)     // Catch: java.lang.Throwable -> L54
            if (r15 != 0) goto La4
            goto L70
        La4:
            r3 = r15
        La5:
            r2 = r13
            goto La9
        La7:
            r3 = r14
            goto La5
        La9:
            java.lang.Object r14 = r2.H(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L54
            r15 = r3
            E4.f r0 = O5.g.f5239m     // Catch: java.lang.Throwable -> L54
            if (r14 != r0) goto Lb6
            r7.a(r15, r4)     // Catch: java.lang.Throwable -> L54
            goto Lea
        Lb6:
            E4.f r0 = O5.g.f5241o     // Catch: java.lang.Throwable -> L54
            if (r14 != r0) goto Lc7
            long r2 = r13.t()     // Catch: java.lang.Throwable -> L54
            int r14 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r14 >= 0) goto Lc5
            r15.a()     // Catch: java.lang.Throwable -> L54
        Lc5:
            r14 = r15
            goto L70
        Lc7:
            E4.f r0 = O5.g.f5240n     // Catch: java.lang.Throwable -> L54
            if (r14 == r0) goto Ld7
            r15.a()     // Catch: java.lang.Throwable -> L54
            O5.l r15 = new O5.l     // Catch: java.lang.Throwable -> L54
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L54
            r1.n(r15, r8)     // Catch: java.lang.Throwable -> L54
            goto Lea
        Ld7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L54
            throw r14     // Catch: java.lang.Throwable -> L54
        Ldf:
            r14.a()     // Catch: java.lang.Throwable -> L54
            O5.l r14 = new O5.l     // Catch: java.lang.Throwable -> L54
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L54
            r1.n(r14, r8)     // Catch: java.lang.Throwable -> L54
        Lea:
            java.lang.Object r0 = r1.r()
            r5.a r14 = r5.EnumC1580a.f16356q
            if (r0 != r14) goto Lf3
            return r14
        Lf3:
            O5.l r0 = (O5.l) r0
            java.lang.Object r14 = r0.f5251a
            return r14
        Lf8:
            r1.A()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.D(O5.m, int, long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(A0 a02, boolean z5) {
        if (a02 instanceof InterfaceC0245f) {
            ((InterfaceC1524c) a02).resumeWith(AbstractC1362a.b(z5 ? r() : s()));
            return;
        }
        if (a02 instanceof u) {
            ((u) a02).f5261q.resumeWith(new l(new j(q())));
            return;
        }
        if (!(a02 instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + a02).toString());
        }
        b bVar = (b) a02;
        C0247h c0247h = bVar.f5211r;
        kotlin.jvm.internal.m.b(c0247h);
        bVar.f5211r = null;
        bVar.f5210q = g.f5238l;
        Throwable thQ = bVar.f5212s.q();
        if (thQ == null) {
            c0247h.resumeWith(Boolean.FALSE);
        } else {
            c0247h.resumeWith(AbstractC1362a.b(thQ));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof u) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.a(((u) obj).f5261q, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof InterfaceC0245f) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return g.a((InterfaceC0245f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0247h c0247h = bVar.f5211r;
        kotlin.jvm.internal.m.b(c0247h);
        bVar.f5211r = null;
        bVar.f5210q = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f5212s.getClass();
        return g.a(c0247h, bool, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object H(m mVar, int i, long j, Object obj) {
        Object objK = mVar.k(i);
        AtomicReferenceArray atomicReferenceArray = mVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5219r;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f5240n;
                }
                if (mVar.j(i, objK, obj)) {
                    o();
                    return g.f5239m;
                }
            }
        } else if (objK == g.f5233d && mVar.j(i, objK, g.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            mVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object objK2 = mVar.k(i);
            if (objK2 == null || objK2 == g.f5234e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(i, objK2, g.f5236h)) {
                        o();
                        return g.f5241o;
                    }
                } else {
                    if (obj == null) {
                        return g.f5240n;
                    }
                    if (mVar.j(i, objK2, obj)) {
                        o();
                        return g.f5239m;
                    }
                }
            } else if (objK2 != g.f5233d) {
                E4.f fVar = g.j;
                if (objK2 == fVar) {
                    return g.f5241o;
                }
                if (objK2 == g.f5236h) {
                    return g.f5241o;
                }
                if (objK2 == g.f5238l) {
                    o();
                    return g.f5241o;
                }
                if (objK2 != g.f5235g && mVar.j(i, objK2, g.f)) {
                    boolean z5 = objK2 instanceof x;
                    if (z5) {
                        objK2 = ((x) objK2).f5262a;
                    }
                    if (G(objK2)) {
                        mVar.n(i, g.i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        mVar.m(i, null);
                        return obj3;
                    }
                    mVar.n(i, fVar);
                    mVar.h();
                    if (z5) {
                        o();
                    }
                    return g.f5241o;
                }
            } else if (mVar.j(i, objK2, g.i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i * 2);
                mVar.m(i, null);
                return obj4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int I(m mVar, int i, Object obj, long j, Object obj2, boolean z5) {
        while (true) {
            Object objK = mVar.k(i);
            if (objK == null) {
                if (!e(j) || z5) {
                    if (z5) {
                        if (mVar.j(i, null, g.j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(i, null, g.f5233d)) {
                    break;
                }
            } else {
                if (objK != g.f5234e) {
                    E4.f fVar = g.f5237k;
                    if (objK == fVar) {
                        mVar.m(i, null);
                        return 5;
                    }
                    if (objK == g.f5236h) {
                        mVar.m(i, null);
                        return 5;
                    }
                    if (objK == g.f5238l) {
                        mVar.m(i, null);
                        x();
                        return 4;
                    }
                    mVar.m(i, null);
                    if (objK instanceof x) {
                        objK = ((x) objK).f5262a;
                    }
                    if (F(objK, obj)) {
                        mVar.n(i, g.i);
                        return 0;
                    }
                    if (mVar.f.getAndSet((i * 2) + 1, fVar) != fVar) {
                        mVar.l(i, true);
                    }
                    return 5;
                }
                if (mVar.j(i, objK, g.f5233d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f5221t;
            if (atomicLongFieldUpdater.get(eVar) > j) {
                break;
            } else {
                eVar = this;
            }
        }
        int i = g.f5232c;
        int i7 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5222u;
            if (i7 < i) {
                long j7 = atomicLongFieldUpdater.get(eVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j7 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i7++;
                }
            } else {
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j8, (j8 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater.get(eVar);
                    long j10 = atomicLongFieldUpdater2.get(eVar);
                    long j11 = j10 & 4611686018427387903L;
                    boolean z5 = (j10 & 4611686018427387904L) != 0;
                    if (j9 == j11 && j9 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z5) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j10, 4611686018427387904L + j11);
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j12, j12 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(long j) {
        return j < f5221t.get(this) || j < f5220s.get(this) + ((long) this.f5228q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(Throwable th) {
        return g(false, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(boolean z5, Throwable th) {
        e eVar;
        boolean z6;
        long j;
        long j7;
        long j8;
        Object obj;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5219r;
        if (!z5) {
            eVar = this;
            break;
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f5230a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j10, (j10 & 1152921504606846975L) + (((long) 1) << 60)));
        E4.f fVar = g.f5245s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5226y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, th)) {
                z6 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != fVar) {
                z6 = false;
                break;
            }
        }
        if (z5) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j9, (((long) 3) << 60) + (j9 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j7 = j & 1152921504606846975L;
                    j8 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j7 = j & 1152921504606846975L;
                    j8 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j, (j8 << 60) + j7));
        }
        x();
        if (z6) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5227z;
                obj = atomicReferenceFieldUpdater2.get(this);
                E4.f fVar2 = obj == null ? g.f5243q : g.f5244r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, fVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                B.b(1, obj);
                ((B5.c) obj).invoke(q());
                return z6;
            }
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object h(s5.i iVar) throws Throwable {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5224w;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5220s;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = g.f5231b;
            long j7 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (mVar3.f7268c != j7) {
                m mVarP = p(j7, mVar3);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar3;
            }
            Object objH = H(mVar, i, andIncrement, null);
            E4.f fVar = g.f5239m;
            if (objH == fVar) {
                throw new IllegalStateException("unexpected");
            }
            E4.f fVar2 = g.f5241o;
            if (objH == fVar2) {
                if (andIncrement < t()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (objH != g.f5240n) {
                    mVar.a();
                    return objH;
                }
                C0247h c0247hO = AbstractC0263y.o(AbstractC1397A.v(iVar));
                e eVar = this;
                try {
                    Object objH2 = eVar.H(mVar, i, andIncrement, c0247hO);
                    if (objH2 == fVar) {
                        c0247hO.a(mVar, i);
                    } else {
                        if (objH2 == fVar2) {
                            if (andIncrement < t()) {
                                mVar.a();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    c0247hO.resumeWith(AbstractC1362a.b(r()));
                                    break;
                                }
                                C0247h c0247h = c0247hO;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j8 = g.f5231b;
                                    long j9 = andIncrement2 / j8;
                                    int i7 = (int) (andIncrement2 % j8);
                                    if (mVar4.f7268c != j9) {
                                        try {
                                            m mVarP2 = p(j9, mVar4);
                                            if (mVarP2 == null) {
                                                c0247hO = c0247h;
                                            } else {
                                                mVar2 = mVarP2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0247hO = c0247h;
                                            c0247hO.A();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objH2 = eVar.H(mVar2, i7, andIncrement2, c0247h);
                                    m mVar5 = mVar2;
                                    c0247hO = c0247h;
                                    if (objH2 == g.f5239m) {
                                        c0247hO.a(mVar5, i7);
                                        break;
                                    }
                                    if (objH2 == g.f5241o) {
                                        if (andIncrement2 < t()) {
                                            mVar5.a();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (objH2 == g.f5240n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0247hO = c0247h;
                                    th = th;
                                    c0247hO.A();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.a();
                        }
                        c0247hO.n(objH2, null);
                    }
                    return c0247hO.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thR = r();
        int i8 = R5.t.f7269a;
        throw thR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object i() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5220s;
        long j = atomicLongFieldUpdater.get(this);
        long j7 = f5219r.get(this);
        if (v(true, j7)) {
            return new j(q());
        }
        long j8 = j7 & 1152921504606846975L;
        k kVar = l.f5250b;
        if (j >= j8) {
            return kVar;
        }
        Object obj = g.f5237k;
        m mVar2 = (m) f5224w.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = g.f5231b;
            long j10 = andIncrement / j9;
            int i = (int) (andIncrement % j9);
            if (mVar2.f7268c != j10) {
                m mVarP = p(j10, mVar2);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar2;
            }
            Object objH = H(mVar, i, andIncrement, obj);
            m mVar3 = mVar;
            if (objH == g.f5239m) {
                A0 a02 = obj instanceof A0 ? (A0) obj : null;
                if (a02 != null) {
                    a02.a(mVar3, i);
                }
                J(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (objH != g.f5241o) {
                if (objH == g.f5240n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return objH;
            }
            if (andIncrement < t()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new j(q());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final b iterator() {
        return new b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // O5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = O5.e.f5219r
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.v(r9, r1)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.e(r1)
            r1 = r1 ^ r10
        L1b:
            O5.k r13 = O5.l.f5250b
            if (r1 == 0) goto L20
            return r13
        L20:
            E4.f r6 = O5.g.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O5.e.f5223v
            java.lang.Object r1 = r1.get(r15)
            O5.m r1 = (O5.m) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.v(r9, r2)
            int r14 = O5.g.f5231b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f7268c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            O5.m r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            m5.y r3 = m5.C1386y.f15098a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = O5.e.f5220s
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.h()
            java.lang.Throwable r1 = r15.s()
            O5.j r2 = new O5.j
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof M5.A0
            if (r3 == 0) goto Lb2
            M5.A0 r6 = (M5.A0) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.h()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.j(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // O5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.Object r23, q5.InterfaceC1524c r24) throws java.lang.Throwable {
        /*
            r22 = this;
            r1 = r22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = O5.e.f5223v
            java.lang.Object r2 = r0.get(r1)
            O5.m r2 = (O5.m) r2
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = O5.e.f5219r
            long r3 = r9.getAndIncrement(r1)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r3 & r10
            r12 = 0
            boolean r8 = r1.v(r12, r3)
            int r13 = O5.g.f5231b
            long r3 = (long) r13
            long r14 = r5 / r3
            long r3 = r5 % r3
            int r3 = (int) r3
            r16 = r10
            long r10 = r2.f7268c
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r5.a r10 = r5.EnumC1580a.f16356q
            m5.y r11 = m5.C1386y.f15098a
            if (r4 == 0) goto L43
            O5.m r4 = b(r1, r14, r2)
            if (r4 != 0) goto L42
            if (r8 == 0) goto La
            java.lang.Object r0 = r22.B(r23, r24)
            if (r0 != r10) goto L3f
            return r0
        L3f:
            r4 = r1
            goto L177
        L42:
            r2 = r4
        L43:
            r7 = 0
            r4 = r23
            int r7 = d(r1, r2, r3, r4, r5, r7, r8)
            if (r7 == 0) goto L178
            r14 = 1
            if (r7 == r14) goto L3f
            r15 = 2
            if (r7 == r15) goto L168
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = O5.e.f5220s
            r8 = 5
            r12 = 4
            r15 = 3
            if (r7 == r15) goto L74
            if (r7 == r12) goto L62
            if (r7 == r8) goto L5e
            goto La
        L5e:
            r2.a()
            goto La
        L62:
            long r3 = r4.get(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r2.a()
        L6d:
            java.lang.Object r0 = r22.B(r23, r24)
            if (r0 != r10) goto L3f
            return r0
        L74:
            q5.c r7 = n5.AbstractC1397A.v(r24)
            M5.h r7 = M5.AbstractC0263y.o(r7)
            r18 = r8
            r8 = 0
            r19 = r4
            r15 = r18
            r4 = r23
            int r8 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Lc8
            if (r8 == 0) goto L154
            if (r8 == r14) goto L14f
            r14 = 2
            if (r8 == r14) goto L149
            if (r8 == r12) goto L139
            java.lang.String r13 = "unexpected"
            if (r8 != r15) goto L131
            r2.a()     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc8
            O5.m r0 = (O5.m) r0     // Catch: java.lang.Throwable -> Lc8
        L9f:
            long r2 = r9.getAndIncrement(r1)     // Catch: java.lang.Throwable -> Lc8
            long r5 = r2 & r16
            r14 = 0
            boolean r8 = r1.v(r14, r2)     // Catch: java.lang.Throwable -> Lc8
            int r2 = O5.g.f5231b     // Catch: java.lang.Throwable -> Lc8
            long r14 = (long) r2     // Catch: java.lang.Throwable -> Lc8
            r20 = r13
            long r12 = r5 / r14
            long r14 = r5 % r14
            int r3 = (int) r14     // Catch: java.lang.Throwable -> Lc8
            long r14 = r0.f7268c     // Catch: java.lang.Throwable -> Lc8
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 == 0) goto Ld4
            O5.m r12 = b(r1, r12, r0)     // Catch: java.lang.Throwable -> Lc8
            if (r12 != 0) goto Ld1
            if (r8 == 0) goto Lcc
            c(r1, r4, r7)     // Catch: java.lang.Throwable -> Lc8
            r4 = r1
            goto L159
        Lc8:
            r0 = move-exception
            r4 = r1
            goto L164
        Lcc:
            r13 = r20
            r12 = 4
            r15 = 5
            goto L9f
        Ld1:
            r0 = r2
            r2 = r12
            goto Ld9
        Ld4:
            r21 = r2
            r2 = r0
            r0 = r21
        Ld9:
            int r12 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Lc8
            r21 = r4
            r4 = r1
            r1 = r2
            r2 = r3
            r3 = r21
            if (r12 == 0) goto L12d
            r13 = 1
            if (r12 == r13) goto L129
            r14 = 2
            if (r12 == r14) goto L11d
            r15 = 3
            if (r12 == r15) goto L115
            r0 = 4
            if (r12 == r0) goto L104
            r2 = 5
            if (r12 == r2) goto Lf6
            goto Lf9
        Lf6:
            r1.a()     // Catch: java.lang.Throwable -> L101
        Lf9:
            r12 = r0
            r0 = r1
            r15 = r2
            r1 = r4
            r13 = r20
            r4 = r3
            goto L9f
        L101:
            r0 = move-exception
            goto L164
        L104:
            r0 = r19
            long r8 = r0.get(r4)     // Catch: java.lang.Throwable -> L101
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L111
            r1.a()     // Catch: java.lang.Throwable -> L101
        L111:
            c(r4, r3, r7)     // Catch: java.lang.Throwable -> L101
            goto L159
        L115:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1 = r20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L101
            throw r0     // Catch: java.lang.Throwable -> L101
        L11d:
            if (r8 == 0) goto L123
            r1.h()     // Catch: java.lang.Throwable -> L101
            goto L111
        L123:
            int r3 = r2 + r0
            r7.a(r1, r3)     // Catch: java.lang.Throwable -> L101
            goto L159
        L129:
            r7.resumeWith(r11)     // Catch: java.lang.Throwable -> L101
            goto L159
        L12d:
            r1.a()     // Catch: java.lang.Throwable -> L101
            goto L129
        L131:
            r4 = r1
            r1 = r13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L101
            throw r0     // Catch: java.lang.Throwable -> L101
        L139:
            r3 = r4
            r0 = r19
            r4 = r1
            long r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L101
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L111
            r2.a()     // Catch: java.lang.Throwable -> L101
            goto L111
        L149:
            r4 = r1
            int r3 = r3 + r13
            r7.a(r2, r3)     // Catch: java.lang.Throwable -> L101
            goto L159
        L14f:
            r4 = r1
            r7.resumeWith(r11)     // Catch: java.lang.Throwable -> L101
            goto L159
        L154:
            r4 = r1
            r2.a()     // Catch: java.lang.Throwable -> L101
            goto L129
        L159:
            java.lang.Object r0 = r7.r()
            if (r0 != r10) goto L160
            goto L161
        L160:
            r0 = r11
        L161:
            if (r0 != r10) goto L177
            return r0
        L164:
            r7.A()
            throw r0
        L168:
            r3 = r23
            r4 = r1
            if (r8 == 0) goto L177
            r2.h()
            java.lang.Object r0 = r22.B(r23, r24)
            if (r0 != r10) goto L177
            return r0
        L177:
            return r11
        L178:
            r4 = r1
            r2.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.k(java.lang.Object, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object l(Q5.t tVar) {
        return C(this, tVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (O5.m) ((R5.c) R5.c.f7233b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O5.m m(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = O5.e.f5225x
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O5.e.f5223v
            java.lang.Object r1 = r1.get(r12)
            O5.m r1 = (O5.m) r1
            long r2 = r1.f7268c
            r4 = r0
            O5.m r4 = (O5.m) r4
            long r4 = r4.f7268c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r0 = r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O5.e.f5224w
            java.lang.Object r1 = r1.get(r12)
            O5.m r1 = (O5.m) r1
            long r2 = r1.f7268c
            r4 = r0
            O5.m r4 = (O5.m) r4
            long r4 = r4.f7268c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2e
            r0 = r1
        L2e:
            R5.c r0 = (R5.c) r0
        L30:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = R5.c.f7232a
            java.lang.Object r2 = r1.get(r0)
            E4.f r3 = R5.b.f7226a
            r4 = 0
            if (r2 != r3) goto L3f
            goto L49
        L3f:
            R5.c r2 = (R5.c) r2
            if (r2 != 0) goto L12f
        L43:
            boolean r2 = r1.compareAndSet(r0, r4, r3)
            if (r2 == 0) goto L127
        L49:
            O5.m r0 = (O5.m) r0
            boolean r1 = r12.y()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto La1
            r1 = r0
        L54:
            int r5 = O5.g.f5231b
            int r5 = r5 - r2
        L57:
            r6 = -1
            if (r3 >= r5) goto L8d
            long r8 = r1.f7268c
            int r10 = O5.g.f5231b
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r5
            long r8 = r8 + r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = O5.e.f5220s
            long r10 = r10.get(r12)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6f
        L6d:
            r8 = r6
            goto L9a
        L6f:
            java.lang.Object r10 = r1.k(r5)
            if (r10 == 0) goto L7f
            E4.f r11 = O5.g.f5234e
            if (r10 != r11) goto L7a
            goto L7f
        L7a:
            E4.f r11 = O5.g.f5233d
            if (r10 != r11) goto L8a
            goto L9a
        L7f:
            E4.f r11 = O5.g.f5238l
            boolean r10 = r1.j(r5, r10, r11)
            if (r10 == 0) goto L6f
            r1.h()
        L8a:
            int r5 = r5 + (-1)
            goto L57
        L8d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = R5.c.f7233b
            java.lang.Object r1 = r5.get(r1)
            R5.c r1 = (R5.c) r1
            O5.m r1 = (O5.m) r1
            if (r1 != 0) goto L54
            goto L6d
        L9a:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto La1
            r12.n(r8)
        La1:
            r1 = r0
        La2:
            if (r1 == 0) goto L105
            int r5 = O5.g.f5231b
            int r5 = r5 - r2
        La7:
            if (r3 >= r5) goto Lfa
            long r6 = r1.f7268c
            int r8 = O5.g.f5231b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 < 0) goto L105
        Lb5:
            java.lang.Object r6 = r1.k(r5)
            if (r6 == 0) goto Lec
            E4.f r7 = O5.g.f5234e
            if (r6 != r7) goto Lc0
            goto Lec
        Lc0:
            boolean r7 = r6 instanceof O5.x
            if (r7 == 0) goto Ld8
            E4.f r7 = O5.g.f5238l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto Lb5
            O5.x r6 = (O5.x) r6
            M5.A0 r6 = r6.f5262a
            java.lang.Object r4 = R5.b.f(r4, r6)
            r1.l(r5, r2)
            goto Lf7
        Ld8:
            boolean r7 = r6 instanceof M5.A0
            if (r7 == 0) goto Lf7
            E4.f r7 = O5.g.f5238l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto Lb5
            java.lang.Object r4 = R5.b.f(r4, r6)
            r1.l(r5, r2)
            goto Lf7
        Lec:
            E4.f r7 = O5.g.f5238l
            boolean r6 = r1.j(r5, r6, r7)
            if (r6 == 0) goto Lb5
            r1.h()
        Lf7:
            int r5 = r5 + (-1)
            goto La7
        Lfa:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = R5.c.f7233b
            java.lang.Object r1 = r5.get(r1)
            R5.c r1 = (R5.c) r1
            O5.m r1 = (O5.m) r1
            goto La2
        L105:
            if (r4 == 0) goto L126
            boolean r13 = r4 instanceof java.util.ArrayList
            if (r13 != 0) goto L111
            M5.A0 r4 = (M5.A0) r4
            r12.E(r4, r2)
            return r0
        L111:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r13 = r4.size()
            int r13 = r13 - r2
        L118:
            if (r3 >= r13) goto L126
            java.lang.Object r14 = r4.get(r13)
            M5.A0 r14 = (M5.A0) r14
            r12.E(r14, r2)
            int r13 = r13 + (-1)
            goto L118
        L126:
            return r0
        L127:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L43
            goto L30
        L12f:
            r0 = r2
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.m(long):O5.m");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(long j) {
        m mVar = (m) f5224w.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5220s;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f5228q) + j7, f5221t.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j8 = g.f5231b;
                long j9 = j7 / j8;
                int i = (int) (j7 % j8);
                if (mVar.f7268c != j9) {
                    m mVarP = p(j9, mVar);
                    if (mVarP != null) {
                        mVar = mVarP;
                    }
                }
                m mVar2 = mVar;
                if (H(mVar2, i, j7, null) != g.f5241o || j7 < t()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        u(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r15 = this;
            boolean r0 = r15.z()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = O5.e.f5225x
            java.lang.Object r0 = r6.get(r15)
            O5.m r0 = (O5.m) r0
            r7 = r0
        L10:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.e.f5221t
            long r8 = r0.getAndIncrement(r15)
            int r0 = O5.g.f5231b
            long r2 = (long) r0
            long r2 = r8 / r2
            long r4 = r15.t()
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L36
            long r4 = r7.f7268c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            R5.c r0 = r7.b()
            if (r0 == 0) goto L32
            r15.A(r2, r7)
        L32:
            u(r15)
            return
        L36:
            long r4 = r7.f7268c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld3
            O5.f r0 = O5.f.f5229q
        L3e:
            java.lang.Object r4 = R5.b.b(r7, r2, r0)
            boolean r5 = R5.b.e(r4)
            if (r5 != 0) goto L82
            R5.s r5 = R5.b.c(r4)
        L4c:
            java.lang.Object r10 = r6.get(r15)
            R5.s r10 = (R5.s) r10
            long r11 = r10.f7268c
            long r13 = r5.f7268c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L5b
            goto L82
        L5b:
            boolean r11 = r5.i()
            if (r11 != 0) goto L62
            goto L3e
        L62:
            boolean r11 = r6.compareAndSet(r15, r10, r5)
            if (r11 == 0) goto L72
            boolean r0 = r10.e()
            if (r0 == 0) goto L82
            r10.d()
            goto L82
        L72:
            java.lang.Object r11 = r6.get(r15)
            if (r11 == r10) goto L62
            boolean r10 = r5.e()
            if (r10 == 0) goto L4c
            r5.d()
            goto L4c
        L82:
            boolean r0 = R5.b.e(r4)
            r10 = 0
            if (r0 == 0) goto L93
            r15.x()
            r15.A(r2, r7)
            u(r15)
            goto Lce
        L93:
            R5.s r0 = R5.b.c(r4)
            O5.m r0 = (O5.m) r0
            long r4 = r0.f7268c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lcd
            r2 = 1
            long r2 = r2 + r8
            int r0 = O5.g.f5231b
            long r11 = (long) r0
            long r4 = r4 * r11
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.e.f5221t
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Lc9
            long r4 = r4 - r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.e.f5222u
            long r2 = r0.addAndGet(r15, r4)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r2 = r2 & r4
            r11 = 0
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
        Lbf:
            long r2 = r0.get(r15)
            long r2 = r2 & r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
            goto Lbf
        Lc9:
            u(r15)
            goto Lce
        Lcd:
            r10 = r0
        Lce:
            if (r10 != 0) goto Ld2
            goto L10
        Ld2:
            r7 = r10
        Ld3:
            int r0 = O5.g.f5231b
            long r2 = (long) r0
            long r2 = r8 % r2
            int r0 = (int) r2
            java.lang.Object r2 = r7.k(r0)
            boolean r3 = r2 instanceof M5.A0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = O5.e.f5220s
            if (r3 == 0) goto L109
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L109
            E4.f r3 = O5.g.f5235g
            boolean r3 = r7.j(r0, r2, r3)
            if (r3 == 0) goto L109
            boolean r2 = G(r2)
            if (r2 == 0) goto L100
            E4.f r2 = O5.g.f5233d
            r7.n(r0, r2)
            goto L18e
        L100:
            E4.f r2 = O5.g.j
            r7.n(r0, r2)
            r7.h()
            goto L14a
        L109:
            java.lang.Object r2 = r7.k(r0)
            boolean r3 = r2 instanceof M5.A0
            if (r3 == 0) goto L146
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L129
            O5.x r3 = new O5.x
            r5 = r2
            M5.A0 r5 = (M5.A0) r5
            r3.<init>(r5)
            boolean r2 = r7.j(r0, r2, r3)
            if (r2 == 0) goto L109
            goto L18e
        L129:
            E4.f r3 = O5.g.f5235g
            boolean r3 = r7.j(r0, r2, r3)
            if (r3 == 0) goto L109
            boolean r2 = G(r2)
            if (r2 == 0) goto L13d
            E4.f r2 = O5.g.f5233d
            r7.n(r0, r2)
            goto L18e
        L13d:
            E4.f r2 = O5.g.j
            r7.n(r0, r2)
            r7.h()
            goto L14a
        L146:
            E4.f r3 = O5.g.j
            if (r2 != r3) goto L14f
        L14a:
            u(r15)
            goto L10
        L14f:
            if (r2 != 0) goto L15a
            E4.f r3 = O5.g.f5234e
            boolean r2 = r7.j(r0, r2, r3)
            if (r2 == 0) goto L109
            goto L18e
        L15a:
            E4.f r3 = O5.g.f5233d
            if (r2 != r3) goto L15f
            goto L18e
        L15f:
            E4.f r3 = O5.g.f5236h
            if (r2 == r3) goto L18e
            E4.f r3 = O5.g.i
            if (r2 == r3) goto L18e
            E4.f r3 = O5.g.f5237k
            if (r2 != r3) goto L16c
            goto L18e
        L16c:
            E4.f r3 = O5.g.f5238l
            if (r2 != r3) goto L171
            goto L18e
        L171:
            E4.f r3 = O5.g.f
            if (r2 != r3) goto L176
            goto L109
        L176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected cell state: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L18e:
            u(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.o():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m p(long j, m mVar) {
        Object objB;
        long j7;
        m mVar2 = g.f5230a;
        f fVar = f.f5229q;
        loop0: while (true) {
            objB = R5.b.b(mVar, j, fVar);
            if (!R5.b.e(objB)) {
                R5.s sVarC = R5.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5224w;
                    R5.s sVar = (R5.s) atomicReferenceFieldUpdater.get(this);
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
        if (R5.b.e(objB)) {
            x();
            if (mVar.f7268c * ((long) g.f5231b) < t()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) R5.b.c(objB);
            long j8 = mVar3.f7268c;
            if (!z() && j <= f5221t.get(this) / ((long) g.f5231b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5225x;
                    R5.s sVar2 = (R5.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f7268c >= j8 || !mVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (mVar3.e()) {
                                mVar3.d();
                            }
                        }
                    }
                    if (sVar2.e()) {
                        sVar2.d();
                    }
                }
            }
            if (j8 <= j) {
                return mVar3;
            }
            long j9 = j8 * ((long) g.f5231b);
            do {
                j7 = f5220s.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!f5220s.compareAndSet(this, j7, j9));
            if (j8 * ((long) g.f5231b) < t()) {
                mVar3.a();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable q() {
        return (Throwable) f5226y.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new n("Channel was closed") : thQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new o("Channel was closed") : thQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long t() {
        return f5219r.get(this) & 1152921504606846975L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: O5.m[] */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        r16 = r7;
        r3 = (O5.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = O5.e.f5219r
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L1e
            if (r2 == r3) goto L18
            goto L23
        L18:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L23
        L1e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.f5228q
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            O5.m[] r2 = new O5.m[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = O5.e.f5224w
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = O5.e.f5223v
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = O5.e.f5225x
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = com.google.android.gms.internal.measurement.AbstractC0836n2.A(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r2.next()
            r8 = r4
            O5.m r8 = (O5.m) r8
            O5.m r9 = O5.g.f5230a
            if (r8 == r9) goto L6b
            r3.add(r4)
            goto L6b
        L80:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1ce
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L95
            goto Laf
        L95:
            r4 = r3
            O5.m r4 = (O5.m) r4
            long r8 = r4.f7268c
        L9a:
            java.lang.Object r4 = r2.next()
            r10 = r4
            O5.m r10 = (O5.m) r10
            long r10 = r10.f7268c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto La9
            r3 = r4
            r8 = r10
        La9:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L9a
        Laf:
            O5.m r3 = (O5.m) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = O5.e.f5220s
            long r10 = r2.get(r0)
            long r12 = r0.t()
        Lbb:
            int r2 = O5.g.f5231b
            r4 = r6
        Lbe:
            if (r4 >= r2) goto L19f
            long r8 = r3.f7268c
            int r14 = O5.g.f5231b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto Ld5
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto Ld1
            goto Ld5
        Ld1:
            r16 = r7
            goto L1aa
        Ld5:
            java.lang.Object r15 = r3.k(r4)
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r3.f
            r16 = r7
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r15 instanceof M5.InterfaceC0245f
            if (r7 == 0) goto Lfd
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto Lf1
            if (r14 < 0) goto Lf1
            java.lang.String r7 = "receive"
            goto L167
        Lf1:
            if (r14 >= 0) goto Lf9
            if (r7 < 0) goto Lf9
            java.lang.String r7 = "send"
            goto L167
        Lf9:
            java.lang.String r7 = "cont"
            goto L167
        Lfd:
            boolean r7 = r15 instanceof O5.u
            if (r7 == 0) goto L104
            java.lang.String r7 = "receiveCatching"
            goto L167
        L104:
            boolean r7 = r15 instanceof O5.x
            if (r7 == 0) goto L11c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r7.<init>(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L167
        L11c:
            E4.f r7 = O5.g.f
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
            if (r7 != 0) goto L165
            E4.f r7 = O5.g.f5235g
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
            if (r7 == 0) goto L12d
            goto L165
        L12d:
            if (r15 == 0) goto L198
            E4.f r7 = O5.g.f5234e
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L198
            E4.f r7 = O5.g.i
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L198
            E4.f r7 = O5.g.f5236h
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L198
            E4.f r7 = O5.g.f5237k
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L198
            E4.f r7 = O5.g.j
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L198
            E4.f r7 = O5.g.f5238l
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L160
            goto L198
        L160:
            java.lang.String r7 = r15.toString()
            goto L167
        L165:
            java.lang.String r7 = "resuming_sender"
        L167:
            if (r6 == 0) goto L186
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L198
        L186:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L198:
            int r4 = r4 + 1
            r7 = r16
            r6 = 0
            goto Lbe
        L19f:
            r16 = r7
            R5.c r2 = r3.b()
            r3 = r2
            O5.m r3 = (O5.m) r3
            if (r3 != 0) goto L1c9
        L1aa:
            char r2 = J5.m.V0(r1)
            if (r2 != r5) goto L1bf
            int r2 = r1.length()
            int r2 = r2 + (-1)
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "deleteCharAt(...)"
            kotlin.jvm.internal.m.d(r2, r3)
        L1bf:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L1c9:
            r7 = r16
            r6 = 0
            goto Lbb
        L1ce:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.toString():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (O5.m) ((R5.c) R5.c.f7233b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(boolean r14, long r15) {
        /*
            r13 = this;
            r0 = 60
            long r0 = r15 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 == 0) goto L16f
            r2 = 1
            if (r0 == r2) goto L16f
            r3 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = O5.e.f5220s
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r3) goto Le0
            r3 = 3
            if (r0 != r3) goto Ld0
            long r5 = r5 & r15
            O5.m r0 = r13.m(r5)
            r3 = 0
            r5 = r3
        L1f:
            int r6 = O5.g.f5231b
            int r6 = r6 - r2
        L22:
            r7 = -1
            if (r7 >= r6) goto La2
            long r8 = r0.f7268c
            int r10 = O5.g.f5231b
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r6
            long r8 = r8 + r10
        L2d:
            java.lang.Object r10 = r0.k(r6)
            E4.f r11 = O5.g.i
            if (r10 == r11) goto Lae
            E4.f r11 = O5.g.f5233d
            if (r10 != r11) goto L50
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            E4.f r11 = O5.g.f5238l
            boolean r10 = r0.j(r6, r10, r11)
            if (r10 == 0) goto L2d
            r0.m(r6, r3)
            r0.h()
            goto L9f
        L50:
            E4.f r11 = O5.g.f5234e
            if (r10 == r11) goto L94
            if (r10 != 0) goto L57
            goto L94
        L57:
            boolean r11 = r10 instanceof M5.A0
            if (r11 != 0) goto L6c
            boolean r11 = r10 instanceof O5.x
            if (r11 == 0) goto L60
            goto L6c
        L60:
            E4.f r11 = O5.g.f5235g
            if (r10 == r11) goto Lae
            E4.f r12 = O5.g.f
            if (r10 != r12) goto L69
            goto Lae
        L69:
            if (r10 == r11) goto L2d
            goto L9f
        L6c:
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            boolean r11 = r10 instanceof O5.x
            if (r11 == 0) goto L7e
            r11 = r10
            O5.x r11 = (O5.x) r11
            M5.A0 r11 = r11.f5262a
            goto L81
        L7e:
            r11 = r10
            M5.A0 r11 = (M5.A0) r11
        L81:
            E4.f r12 = O5.g.f5238l
            boolean r10 = r0.j(r6, r10, r12)
            if (r10 == 0) goto L2d
            java.lang.Object r5 = R5.b.f(r5, r11)
            r0.m(r6, r3)
            r0.h()
            goto L9f
        L94:
            E4.f r11 = O5.g.f5238l
            boolean r10 = r0.j(r6, r10, r11)
            if (r10 == 0) goto L2d
            r0.h()
        L9f:
            int r6 = r6 + (-1)
            goto L22
        La2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = R5.c.f7233b
            java.lang.Object r0 = r6.get(r0)
            R5.c r0 = (R5.c) r0
            O5.m r0 = (O5.m) r0
            if (r0 != 0) goto L1f
        Lae:
            if (r5 == 0) goto L16e
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 != 0) goto Lbb
            M5.A0 r5 = (M5.A0) r5
            r13.E(r5, r1)
            goto L16e
        Lbb:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            int r0 = r0 - r2
        Lc2:
            if (r7 >= r0) goto L16e
            java.lang.Object r3 = r5.get(r0)
            M5.A0 r3 = (M5.A0) r3
            r13.E(r3, r1)
            int r0 = r0 + (-1)
            goto Lc2
        Ld0:
            java.lang.String r1 = "unexpected close status: "
            java.lang.String r0 = k1.i.i(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Le0:
            long r5 = r5 & r15
            r13.m(r5)
            if (r14 == 0) goto L16e
        Le6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = O5.e.f5224w
            java.lang.Object r3 = r0.get(r13)
            O5.m r3 = (O5.m) r3
            long r7 = r4.get(r13)
            long r5 = r13.t()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto Lfc
            goto L16e
        Lfc:
            int r5 = O5.g.f5231b
            long r5 = (long) r5
            long r9 = r7 / r5
            long r11 = r3.f7268c
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L11a
            O5.m r3 = r13.p(r9, r3)
            if (r3 != 0) goto L11a
            java.lang.Object r0 = r0.get(r13)
            O5.m r0 = (O5.m) r0
            long r5 = r0.f7268c
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto Le6
            goto L16e
        L11a:
            r3.a()
            long r5 = r7 % r5
            int r0 = (int) r5
        L120:
            java.lang.Object r5 = r3.k(r0)
            if (r5 == 0) goto L157
            E4.f r6 = O5.g.f5234e
            if (r5 != r6) goto L12b
            goto L157
        L12b:
            E4.f r0 = O5.g.f5233d
            if (r5 != r0) goto L130
            goto L16f
        L130:
            E4.f r0 = O5.g.j
            if (r5 != r0) goto L135
            goto L162
        L135:
            E4.f r0 = O5.g.f5238l
            if (r5 != r0) goto L13a
            goto L162
        L13a:
            E4.f r0 = O5.g.i
            if (r5 != r0) goto L13f
            goto L162
        L13f:
            E4.f r0 = O5.g.f5236h
            if (r5 != r0) goto L144
            goto L162
        L144:
            E4.f r0 = O5.g.f5235g
            if (r5 != r0) goto L149
            goto L16f
        L149:
            E4.f r0 = O5.g.f
            if (r5 != r0) goto L14e
            goto L162
        L14e:
            long r5 = r4.get(r13)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L162
            goto L16f
        L157:
            E4.f r6 = O5.g.f5236h
            boolean r5 = r3.j(r0, r5, r6)
            if (r5 == 0) goto L120
            r13.o()
        L162:
            r5 = 1
            long r9 = r7 + r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = O5.e.f5220s
            r6 = r13
            r5.compareAndSet(r6, r7, r9)
            goto Le6
        L16e:
            return r2
        L16f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.e.v(boolean, long):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w() {
        return v(true, f5219r.get(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        return v(false, f5219r.get(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean y() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z() {
        long j = f5221t.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }
}
