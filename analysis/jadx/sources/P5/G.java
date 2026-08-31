package P5;

import M5.C0247h;
import Q5.AbstractC0422b;
import Q5.AbstractC0423c;
import Q5.AbstractC0424d;
import java.util.Arrays;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public class G extends AbstractC0422b implements InterfaceC0397h, InterfaceC0398i, Q5.v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6346A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f6349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f6351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6352z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(int i, int i7) {
        this.f6347u = i;
        this.f6348v = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x001e */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [P5.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [Q5.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [P5.G] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [P5.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Q5.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [P5.I] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [P5.I] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(P5.G r8, P5.InterfaceC0398i r9, q5.InterfaceC1524c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof P5.F
            if (r0 == 0) goto L13
            r0 = r10
            P5.F r0 = (P5.F) r0
            int r1 = r0.f6345w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6345w = r1
            goto L18
        L13:
            P5.F r0 = new P5.F
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f6343u
            int r1 = r0.f6345w
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            M5.b0 r8 = r0.f6342t
            P5.I r9 = r0.f6341s
            P5.i r1 = r0.f6340r
            P5.G r4 = r0.f6339q
            m5.AbstractC1362a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L74
        L36:
            r8 = move-exception
            goto Lb4
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            M5.b0 r8 = r0.f6342t
            P5.I r9 = r0.f6341s
            P5.i r1 = r0.f6340r
            P5.G r4 = r0.f6339q
            m5.AbstractC1362a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L77
        L4d:
            P5.I r9 = r0.f6341s
            P5.i r8 = r0.f6340r
            P5.G r1 = r0.f6339q
            m5.AbstractC1362a.e(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb4
        L5c:
            m5.AbstractC1362a.e(r10)
            Q5.d r10 = r8.b()
            P5.I r10 = (P5.I) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            q5.h r1 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            M5.t r4 = M5.C0258t.f3885r     // Catch: java.lang.Throwable -> Lb1
            q5.f r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb1
            M5.b0 r1 = (M5.InterfaceC0241b0) r1     // Catch: java.lang.Throwable -> Lb1
        L74:
            r4 = r8
            r8 = r1
            r1 = r10
        L77:
            java.lang.Object r10 = r4.q(r9)     // Catch: java.lang.Throwable -> L36
            E4.f r5 = P5.H.f6353a     // Catch: java.lang.Throwable -> L36
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r10 != r5) goto L92
            r0.f6339q = r4     // Catch: java.lang.Throwable -> L36
            r0.f6340r = r1     // Catch: java.lang.Throwable -> L36
            r0.f6341s = r9     // Catch: java.lang.Throwable -> L36
            r0.f6342t = r8     // Catch: java.lang.Throwable -> L36
            r0.f6345w = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.g(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L77
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.v()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La0:
            r0.f6339q = r4     // Catch: java.lang.Throwable -> L36
            r0.f6340r = r1     // Catch: java.lang.Throwable -> L36
            r0.f6341s = r9     // Catch: java.lang.Throwable -> L36
            r0.f6342t = r8     // Catch: java.lang.Throwable -> L36
            r0.f6345w = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb4:
            r4.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.G.h(P5.G, P5.i, q5.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.v
    public final InterfaceC0397h a(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return ((i == 0 || i == -3) && aVar == O5.a.f5206q) ? this : new Q5.j(this, interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0422b
    public final AbstractC0424d c() {
        I i = new I();
        i.f6356a = -1L;
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0397h
    public final Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) throws Throwable {
        h(this, interfaceC0398i, interfaceC1524c);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0422b
    public final AbstractC0424d[] d() {
        return new I[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        n(obj);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(I i, F f) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(f));
        c0247h.s();
        synchronized (this) {
            try {
                if (p(i) < 0) {
                    i.f6357b = c0247h;
                } else {
                    c0247h.resumeWith(C1386y.f15098a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = c0247h.r();
        return objR == EnumC1580a.f16356q ? objR : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        AbstractC0424d[] abstractC0424dArr;
        Object[] objArr = this.f6349w;
        kotlin.jvm.internal.m.b(objArr);
        H.d(objArr, l(), null);
        this.f6352z--;
        long jL = l() + 1;
        if (this.f6350x < jL) {
            this.f6350x = jL;
        }
        if (this.f6351y < jL) {
            if (this.f6600r != 0 && (abstractC0424dArr = this.f6599q) != null) {
                for (AbstractC0424d abstractC0424d : abstractC0424dArr) {
                    if (abstractC0424d != null) {
                        I i = (I) abstractC0424d;
                        long j = i.f6356a;
                        if (j >= 0 && j < jL) {
                            i.f6356a = jL;
                        }
                    }
                }
            }
            this.f6351y = jL;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Object obj) {
        int i = this.f6352z + this.f6346A;
        Object[] objArrM = this.f6349w;
        if (objArrM == null) {
            objArrM = m(null, 0, 2);
        } else if (i >= objArrM.length) {
            objArrM = m(objArrM, i, objArrM.length * 2);
        }
        H.d(objArrM, l() + ((long) i), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0040 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q5.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final InterfaceC1524c[] k(InterfaceC1524c[] interfaceC1524cArr) {
        AbstractC0424d[] abstractC0424dArr;
        I i;
        C0247h c0247h;
        int length = interfaceC1524cArr.length;
        if (this.f6600r != 0 && (abstractC0424dArr = this.f6599q) != null) {
            int length2 = abstractC0424dArr.length;
            int i7 = 0;
            interfaceC1524cArr = interfaceC1524cArr;
            while (i7 < length2) {
                AbstractC0424d abstractC0424d = abstractC0424dArr[i7];
                if (abstractC0424d != null && (c0247h = (i = (I) abstractC0424d).f6357b) != null && p(i) >= 0) {
                    int length3 = interfaceC1524cArr.length;
                    interfaceC1524cArr = interfaceC1524cArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC1524cArr, Math.max(2, interfaceC1524cArr.length * 2));
                        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                        interfaceC1524cArr = objArrCopyOf;
                    }
                    ((InterfaceC1524c[]) interfaceC1524cArr)[length] = c0247h;
                    i.f6357b = null;
                    length++;
                }
                i7++;
                interfaceC1524cArr = interfaceC1524cArr;
            }
        }
        return (InterfaceC1524c[]) interfaceC1524cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long l() {
        return Math.min(this.f6351y, this.f6350x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] m(Object[] objArr, int i, int i7) {
        if (i7 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i7];
        this.f6349w = objArr2;
        if (objArr != null) {
            long jL = l();
            for (int i8 = 0; i8 < i; i8++) {
                long j = ((long) i8) + jL;
                H.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n(Object obj) {
        InterfaceC1524c[] interfaceC1524cArrK;
        InterfaceC1524c[] interfaceC1524cArr = AbstractC0423c.f6603a;
        synchronized (this) {
            o(obj);
            interfaceC1524cArrK = k(interfaceC1524cArr);
        }
        for (InterfaceC1524c interfaceC1524c : interfaceC1524cArrK) {
            if (interfaceC1524c != null) {
                interfaceC1524c.resumeWith(C1386y.f15098a);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(Object obj) {
        int i = this.f6600r;
        int i7 = this.f6347u;
        if (i != 0) {
            int i8 = this.f6348v;
            j(obj);
            int i9 = this.f6352z + 1;
            this.f6352z = i9;
            if (i9 > i8) {
                i();
            }
            long jL = l() + ((long) this.f6352z);
            long j = this.f6350x;
            if (((int) (jL - j)) > i7) {
                r(1 + j, this.f6351y, l() + ((long) this.f6352z), l() + ((long) this.f6352z) + ((long) this.f6346A));
            }
        } else if (i7 != 0) {
            j(obj);
            int i10 = this.f6352z + 1;
            this.f6352z = i10;
            if (i10 > i7) {
                i();
            }
            this.f6351y = l() + ((long) this.f6352z);
            return true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long p(I i) {
        long j = i.f6356a;
        if (j < l() + ((long) this.f6352z)) {
            return j;
        }
        if (this.f6348v <= 0 && j <= l() && this.f6346A != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(I i) {
        Object obj;
        InterfaceC1524c[] interfaceC1524cArrS = AbstractC0423c.f6603a;
        synchronized (this) {
            try {
                long jP = p(i);
                if (jP < 0) {
                    obj = H.f6353a;
                } else {
                    long j = i.f6356a;
                    Object[] objArr = this.f6349w;
                    kotlin.jvm.internal.m.b(objArr);
                    Object obj2 = objArr[((int) jP) & (objArr.length - 1)];
                    if (obj2 instanceof E) {
                        ((E) obj2).getClass();
                        obj2 = null;
                    }
                    i.f6356a = jP + 1;
                    Object obj3 = obj2;
                    interfaceC1524cArrS = s(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1524c interfaceC1524c : interfaceC1524cArrS) {
            if (interfaceC1524c != null) {
                interfaceC1524c.resumeWith(C1386y.f15098a);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(long j, long j7, long j8, long j9) {
        long jMin = Math.min(j7, j);
        for (long jL = l(); jL < jMin; jL++) {
            Object[] objArr = this.f6349w;
            kotlin.jvm.internal.m.b(objArr);
            H.d(objArr, jL, null);
        }
        this.f6350x = j;
        this.f6351y = j7;
        this.f6352z = (int) (j8 - jMin);
        this.f6346A = (int) (j9 - j8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1524c[] s(long j) {
        long j7;
        long j8;
        InterfaceC1524c[] interfaceC1524cArr;
        InterfaceC1524c[] interfaceC1524cArr2;
        AbstractC0424d[] abstractC0424dArr;
        E4.f fVar = H.f6353a;
        InterfaceC1524c[] interfaceC1524cArr3 = AbstractC0423c.f6603a;
        if (j <= this.f6351y) {
            long jL = l();
            long j9 = ((long) this.f6352z) + jL;
            int i = this.f6348v;
            if (i == 0 && this.f6346A > 0) {
                j9++;
            }
            int i7 = 0;
            if (this.f6600r != 0 && (abstractC0424dArr = this.f6599q) != null) {
                for (AbstractC0424d abstractC0424d : abstractC0424dArr) {
                    if (abstractC0424d != null) {
                        long j10 = ((I) abstractC0424d).f6356a;
                        if (j10 >= 0 && j10 < j9) {
                            j9 = j10;
                        }
                    }
                }
            }
            if (j9 > this.f6351y) {
                long jL2 = l() + ((long) this.f6352z);
                int iMin = this.f6600r > 0 ? Math.min(this.f6346A, i - ((int) (jL2 - j9))) : this.f6346A;
                long j11 = ((long) this.f6346A) + jL2;
                if (iMin > 0) {
                    j8 = 1;
                    Object[] objArr = this.f6349w;
                    kotlin.jvm.internal.m.b(objArr);
                    j7 = jL;
                    InterfaceC1524c[] interfaceC1524cArr4 = new InterfaceC1524c[iMin];
                    long j12 = jL2;
                    while (true) {
                        if (jL2 >= j11) {
                            interfaceC1524cArr2 = interfaceC1524cArr4;
                            break;
                        }
                        interfaceC1524cArr2 = interfaceC1524cArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jL2)];
                        if (obj != fVar) {
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            int i8 = i7 + 1;
                            ((E) obj).getClass();
                            interfaceC1524cArr2[i7] = null;
                            H.d(objArr, jL2, fVar);
                            H.d(objArr, j12, null);
                            j12++;
                            if (i8 >= iMin) {
                                break;
                            }
                            i7 = i8;
                        }
                        jL2++;
                        interfaceC1524cArr4 = interfaceC1524cArr2;
                    }
                    jL2 = j12;
                    interfaceC1524cArr = interfaceC1524cArr2;
                } else {
                    j7 = jL;
                    j8 = 1;
                    interfaceC1524cArr = interfaceC1524cArr3;
                }
                int i9 = (int) (jL2 - j7);
                long j13 = this.f6600r == 0 ? jL2 : j9;
                long jMax = Math.max(this.f6350x, jL2 - ((long) Math.min(this.f6347u, i9)));
                if (i == 0 && jMax < j11) {
                    Object[] objArr2 = this.f6349w;
                    kotlin.jvm.internal.m.b(objArr2);
                    if (kotlin.jvm.internal.m.a(objArr2[((int) jMax) & (objArr2.length - 1)], fVar)) {
                        jL2 += j8;
                        jMax += j8;
                    }
                }
                r(jMax, j13, jL2, j11);
                if (this.f6348v != 0 || this.f6346A > 1) {
                    Object[] objArr3 = this.f6349w;
                    kotlin.jvm.internal.m.b(objArr3);
                    while (this.f6346A > 0) {
                        long jL3 = l();
                        int i10 = this.f6352z;
                        int i11 = this.f6346A;
                        if (objArr3[((int) ((jL3 + ((long) (i10 + i11))) - 1)) & (objArr3.length - 1)] != H.f6353a) {
                            break;
                        }
                        this.f6346A = i11 - 1;
                        H.d(objArr3, l() + ((long) (this.f6352z + this.f6346A)), null);
                    }
                }
                return interfaceC1524cArr.length == 0 ? interfaceC1524cArr : k(interfaceC1524cArr);
            }
        }
        return interfaceC1524cArr3;
    }
}
