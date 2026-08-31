package P5;

import M5.C0247h;
import Q5.AbstractC0422b;
import Q5.AbstractC0423c;
import Q5.AbstractC0424d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0422b implements C, InterfaceC0397h, Q5.v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6378v = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6379u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.v
    public final InterfaceC0397h a(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != O5.a.f5207r) && !((i == 0 || i == -3) && aVar == O5.a.f5206q)) ? new Q5.j(this, interfaceC1529h, i, aVar) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0422b
    public final AbstractC0424d c() {
        return new T();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:59:0x00f7) to fix multi-entry loop: BACK_EDGE: B:59:0x00f7 -> B:28:0x007d */
    /* JADX WARN: Path cross not found for [B:58:0x00f6, B:59:0x00f7], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // P5.InterfaceC0397h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(P5.InterfaceC0398i r18, q5.InterfaceC1524c r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof P5.Q
            if (r1 == 0) goto L17
            r1 = r0
            P5.Q r1 = (P5.Q) r1
            int r2 = r1.f6377x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f6377x = r2
            r2 = r17
            goto L1e
        L17:
            P5.Q r1 = new P5.Q
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f6375v
            int r3 = r1.f6377x
            r5.a r4 = r5.EnumC1580a.f16356q
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L61
            if (r3 == r8) goto L57
            if (r3 == r7) goto L49
            if (r3 != r6) goto L41
            java.lang.Object r3 = r1.f6374u
            M5.b0 r9 = r1.f6373t
            P5.T r10 = r1.f6372s
            P5.i r11 = r1.f6371r
            P5.S r12 = r1.f6370q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            goto L7d
        L3e:
            r0 = move-exception
            goto Lfa
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L49:
            java.lang.Object r3 = r1.f6374u
            M5.b0 r9 = r1.f6373t
            P5.T r10 = r1.f6372s
            P5.i r11 = r1.f6371r
            P5.S r12 = r1.f6370q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L3e
            goto Lb3
        L57:
            P5.T r10 = r1.f6372s
            P5.i r3 = r1.f6371r
            P5.S r12 = r1.f6370q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L3e
            goto L6e
        L61:
            m5.AbstractC1362a.e(r0)
            Q5.d r0 = r2.b()
            P5.T r0 = (P5.T) r0
            r3 = r18
            r10 = r0
            r12 = r2
        L6e:
            q5.h r0 = r1.getContext()     // Catch: java.lang.Throwable -> L3e
            M5.t r9 = M5.C0258t.f3885r     // Catch: java.lang.Throwable -> L3e
            q5.f r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L3e
            M5.b0 r0 = (M5.InterfaceC0241b0) r0     // Catch: java.lang.Throwable -> L3e
            r9 = r0
            r11 = r3
            r0 = 0
        L7d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = P5.S.f6378v     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L91
            boolean r13 = r9.b()     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L8c
            goto L91
        L8c:
            java.util.concurrent.CancellationException r0 = r9.v()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L91:
            if (r0 == 0) goto L99
            boolean r13 = r0.equals(r3)     // Catch: java.lang.Throwable -> L3e
            if (r13 != 0) goto Lb4
        L99:
            E4.f r0 = Q5.AbstractC0423c.f6604b     // Catch: java.lang.Throwable -> L3e
            if (r3 != r0) goto L9f
            r0 = 0
            goto La0
        L9f:
            r0 = r3
        La0:
            r1.f6370q = r12     // Catch: java.lang.Throwable -> L3e
            r1.f6371r = r11     // Catch: java.lang.Throwable -> L3e
            r1.f6372s = r10     // Catch: java.lang.Throwable -> L3e
            r1.f6373t = r9     // Catch: java.lang.Throwable -> L3e
            r1.f6374u = r3     // Catch: java.lang.Throwable -> L3e
            r1.f6377x = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r11.emit(r0, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r4) goto Lb3
            goto Lf9
        Lb3:
            r0 = r3
        Lb4:
            java.util.concurrent.atomic.AtomicReference r3 = r10.f6380a     // Catch: java.lang.Throwable -> L3e
            E4.f r13 = P5.H.f6354b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.getAndSet(r13)     // Catch: java.lang.Throwable -> L3e
            kotlin.jvm.internal.m.b(r3)     // Catch: java.lang.Throwable -> L3e
            E4.f r14 = P5.H.f6355c     // Catch: java.lang.Throwable -> L3e
            if (r3 != r14) goto Lc4
            goto L7d
        Lc4:
            r1.f6370q = r12     // Catch: java.lang.Throwable -> L3e
            r1.f6371r = r11     // Catch: java.lang.Throwable -> L3e
            r1.f6372s = r10     // Catch: java.lang.Throwable -> L3e
            r1.f6373t = r9     // Catch: java.lang.Throwable -> L3e
            r1.f6374u = r0     // Catch: java.lang.Throwable -> L3e
            r1.f6377x = r6     // Catch: java.lang.Throwable -> L3e
            m5.y r3 = m5.C1386y.f15098a     // Catch: java.lang.Throwable -> L3e
            M5.h r14 = new M5.h     // Catch: java.lang.Throwable -> L3e
            q5.c r15 = n5.AbstractC1397A.v(r1)     // Catch: java.lang.Throwable -> L3e
            r14.<init>(r8, r15)     // Catch: java.lang.Throwable -> L3e
            r14.s()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference r15 = r10.f6380a     // Catch: java.lang.Throwable -> L3e
        Le0:
            boolean r16 = r15.compareAndSet(r13, r14)     // Catch: java.lang.Throwable -> L3e
            if (r16 == 0) goto Le7
            goto Lf0
        Le7:
            java.lang.Object r5 = r15.get()     // Catch: java.lang.Throwable -> L3e
            if (r5 == r13) goto Le0
            r14.resumeWith(r3)     // Catch: java.lang.Throwable -> L3e
        Lf0:
            java.lang.Object r5 = r14.r()     // Catch: java.lang.Throwable -> L3e
            if (r5 != r4) goto Lf7
            r3 = r5
        Lf7:
            if (r3 != r4) goto L7d
        Lf9:
            return r4
        Lfa:
            r12.e(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.S.collect(P5.i, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0422b
    public final AbstractC0424d[] d() {
        return new T[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        g(obj);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        if (obj == null) {
            obj = AbstractC0423c.f6604b;
        }
        h(null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.P
    public final Object getValue() {
        E4.f fVar = AbstractC0423c.f6604b;
        Object obj = f6378v.get(this);
        if (obj == fVar) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(Object obj, Object obj2) {
        int i;
        AbstractC0424d[] abstractC0424dArr;
        E4.f fVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6378v;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i7 = this.f6379u;
            if ((i7 & 1) != 0) {
                this.f6379u = i7 + 2;
                return true;
            }
            int i8 = i7 + 1;
            this.f6379u = i8;
            AbstractC0424d[] abstractC0424dArr2 = this.f6599q;
            while (true) {
                T[] tArr = (T[]) abstractC0424dArr2;
                if (tArr != null) {
                    for (T t6 : tArr) {
                        if (t6 != null) {
                            AtomicReference atomicReference = t6.f6380a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (fVar = H.f6355c)) {
                                    E4.f fVar2 = H.f6354b;
                                    if (obj4 != fVar2) {
                                        while (!atomicReference.compareAndSet(obj4, fVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0247h) obj4).resumeWith(C1386y.f15098a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, fVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f6379u;
                    if (i == i8) {
                        this.f6379u = i8 + 1;
                        return true;
                    }
                    abstractC0424dArr = this.f6599q;
                }
                abstractC0424dArr2 = abstractC0424dArr;
                i8 = i;
            }
        }
    }
}
