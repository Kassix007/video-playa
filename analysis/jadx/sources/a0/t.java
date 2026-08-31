package a0;

import A.e0;
import B0.C0029a;
import B0.G0;
import P.AbstractC0362j0;
import P.AbstractC0373p;
import R4.L0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.B;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f8700a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8702c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L0 f8706h;
    public s i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8701b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f8703d = new e0(12, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0029a f8704e = new C0029a(25, this);
    public final R.e f = new R.e(new s[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8705g = new Object();
    public long j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public t(B5.c cVar) {
        this.f8700a = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(t tVar) {
        boolean z5;
        Set set;
        Set set2;
        synchronized (tVar.f8705g) {
            z5 = tVar.f8702c;
        }
        if (z5) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            AtomicReference atomicReference = tVar.f8701b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0373p.d("Unexpected notification");
                        throw new C2.e();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z6;
            }
            synchronized (tVar.f8705g) {
                R.e eVar = tVar.f;
                Object[] objArr = eVar.f6676q;
                int i = eVar.f6678s;
                for (int i7 = 0; i7 < i; i7++) {
                    z6 = ((s) objArr[i7]).b(set) || z6;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f8705g
            monitor-enter(r2)
            R.e r3 = r1.f     // Catch: java.lang.Throwable -> L93
            int r4 = r3.f6678s     // Catch: java.lang.Throwable -> L93
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L9b
            java.lang.Object[] r8 = r3.f6676q     // Catch: java.lang.Throwable -> L93
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L93
            a0.s r8 = (a0.s) r8     // Catch: java.lang.Throwable -> L93
            r.G r9 = r8.f     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r9.j(r0)     // Catch: java.lang.Throwable -> L93
            r.B r9 = (r.C1543B) r9     // Catch: java.lang.Throwable -> L93
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f16110b     // Catch: java.lang.Throwable -> L93
            int[] r11 = r9.f16111c     // Catch: java.lang.Throwable -> L93
            long[] r9 = r9.f16109a     // Catch: java.lang.Throwable -> L93
            int r12 = r9.length     // Catch: java.lang.Throwable -> L93
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L93
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L93
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L93
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L93
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L93
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L93
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            r.G r1 = r8.f     // Catch: java.lang.Throwable -> L93
            int r1 = r1.f16137e     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r1 != 0) goto L88
            int r7 = r7 + 1
            goto L95
        L88:
            if (r7 <= 0) goto L95
            java.lang.Object[] r1 = r3.f6676q     // Catch: java.lang.Throwable -> L93
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L93
            r1[r6] = r5     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r0 = move-exception
            goto La7
        L95:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L9b:
            java.lang.Object[] r0 = r3.f6676q     // Catch: java.lang.Throwable -> L93
            int r1 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L93
            r3.f6678s = r1     // Catch: java.lang.Throwable -> L93
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.t.b(java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Object obj, B5.c cVar, B5.a aVar) {
        Object obj2;
        s sVar;
        synchronized (this.f8705g) {
            R.e eVar = this.f;
            Object[] objArr = eVar.f6676q;
            int i = eVar.f6678s;
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i7];
                if (((s) obj2).f8691a == cVar) {
                    break;
                } else {
                    i7++;
                }
            }
            sVar = (s) obj2;
            if (sVar == null) {
                kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                B.b(1, cVar);
                sVar = new s(cVar);
                eVar.c(sVar);
            }
        }
        s sVar2 = this.i;
        long j = this.j;
        if (j != -1 && j != X.k.b()) {
            AbstractC0362j0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + X.k.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = sVar;
            this.j = X.k.b();
            sVar.a(obj, this.f8704e, aVar);
        } finally {
            this.i = sVar2;
            this.j = j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        e0 e0Var = this.f8703d;
        G0 g02 = n.f8679a;
        n.f(C0599a.f8645s);
        synchronized (n.f8680b) {
            n.f8684g = n5.l.v0((Collection) n.f8684g, e0Var);
        }
        this.f8706h = new L0(9, e0Var);
    }
}
