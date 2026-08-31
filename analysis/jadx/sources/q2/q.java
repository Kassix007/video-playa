package Q2;

import a.AbstractC0597a;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import java.io.IOException;
import m5.AbstractC1362a;
import m5.C1376o;
import m5.InterfaceC1369h;
import n5.x;
import q6.A;

/* JADX INFO: loaded from: classes.dex */
public final class q implements L2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2.n f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1369h f6571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f6572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1369h f6573e;
    public final e f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(String str, U2.n nVar, C1376o c1376o, C1376o c1376o2, C1376o c1376o3, e eVar) {
        this.f6569a = str;
        this.f6570b = nVar;
        this.f6571c = c1376o;
        this.f6572d = c1376o2;
        this.f6573e = c1376o3;
        this.f = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Q2.q r4, Q2.v r5, s5.c r6) {
        /*
            boolean r0 = r6 instanceof Q2.o
            if (r0 == 0) goto L13
            r0 = r6
            Q2.o r0 = (Q2.o) r0
            int r1 = r0.f6562t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6562t = r1
            goto L18
        L13:
            Q2.o r0 = new Q2.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6560r
            int r1 = r0.f6562t
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            q6.g r5 = r0.f6559q
            m5.AbstractC1362a.e(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            m5.AbstractC1362a.e(r6)
            q6.g r6 = new q6.g
            r6.<init>()
            r0.f6559q = r6
            r0.f6562t = r2
            q6.i r5 = r5.f6586q
            r5.T(r6)
            m5.y r5 = m5.C1386y.f15098a
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r5 != r0) goto L47
            return r0
        L47:
            r5 = r6
        L48:
            q6.l r4 = r4.e()
            J2.s r6 = new J2.s
            r0 = 0
            r6.<init>(r5, r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.q.b(Q2.q, Q2.v, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x01a7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x01e7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(Q2.q r22, K2.h r23, Q2.u r24, Q2.u r25, s5.c r26) {
        /*
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            boolean r5 = r4 instanceof Q2.p
            if (r5 == 0) goto L1d
            r5 = r4
            Q2.p r5 = (Q2.p) r5
            int r6 = r5.f6568v
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f6568v = r6
            goto L22
        L1d:
            Q2.p r5 = new Q2.p
            r5.<init>(r1, r4)
        L22:
            java.lang.Object r4 = r5.f6566t
            r5.a r6 = r5.EnumC1580a.f16356q
            int r7 = r5.f6568v
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r7 == 0) goto L5c
            if (r7 == r10) goto L4d
            if (r7 != r8) goto L45
            k3.c r1 = r5.f6565s
            Q2.u r2 = r5.f6564r
            java.lang.Object r0 = r5.f6563q
            r3 = r0
            Q2.u r3 = (Q2.u) r3
            m5.AbstractC1362a.e(r4)     // Catch: java.lang.Exception -> L42
            r26 = r11
            goto L203
        L42:
            r0 = move-exception
            goto L22c
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4d:
            Q2.u r0 = r5.f6564r
            java.lang.Object r2 = r5.f6563q
            K2.h r2 = (K2.h) r2
            m5.AbstractC1362a.e(r4)
            r3 = r0
            r0 = r2
            r26 = r11
            goto L12e
        L5c:
            m5.AbstractC1362a.e(r4)
            U2.n r4 = r1.f6570b
            U2.b r4 = r4.f7692h
            boolean r4 = r4.f7629r
            if (r4 != 0) goto L73
            if (r0 == 0) goto L6f
            C0.S.s(r0)     // Catch: java.lang.Exception -> L6c java.lang.RuntimeException -> L6d
        L6c:
            return r11
        L6d:
            r0 = move-exception
            throw r0
        L6f:
            r26 = r11
            goto L189
        L73:
            m5.h r4 = r1.f6573e
            java.lang.Object r4 = r4.getValue()
            Q2.c r4 = (Q2.c) r4
            r5.f6563q = r0
            r5.f6564r = r3
            r5.f6568v = r10
            R2.a r4 = (R2.a) r4
            r4.getClass()
            int r4 = r3.f6581a
            r7 = 304(0x130, float:4.26E-43)
            if (r4 != r7) goto L122
            if (r2 == 0) goto L122
            Q2.s r2 = r2.f6584d
            Q2.s r4 = r3.f6584d
            r2.getClass()
            java.util.Map r2 = r2.f6576a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        La6:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lc4
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.ArrayList r12 = n5.l.C0(r12)
            r7.put(r13, r12)
            goto La6
        Lc4:
            java.util.Map r2 = r4.f6576a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lce:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lfb
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r12 = r4.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r13)
            java.lang.String r13 = "toLowerCase(...)"
            kotlin.jvm.internal.m.d(r12, r13)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r4 = n5.l.C0(r4)
            r7.put(r12, r4)
            goto Lce
        Lfb:
            Q2.s r2 = new Q2.s
            java.util.Map r4 = n5.x.O(r7)
            r2.<init>(r4)
            Q2.b r4 = new Q2.b
            int r14 = r3.f6581a
            long r12 = r3.f6582b
            r26 = r11
            r15 = r12
            long r11 = r3.f6583c
            java.lang.Object r7 = r3.f
            Q2.u r13 = new Q2.u
            r20 = 0
            r19 = r2
            r21 = r7
            r17 = r11
            r13.<init>(r14, r15, r17, r19, r20, r21)
            r4.<init>(r13)
            goto L12a
        L122:
            r26 = r11
            Q2.b r2 = new Q2.b
            r2.<init>(r3)
            r4 = r2
        L12a:
            if (r4 != r6) goto L12e
            goto L227
        L12e:
            Q2.b r4 = (Q2.b) r4
            Q2.u r2 = r4.f6526a
            if (r2 != 0) goto L135
            goto L189
        L135:
            if (r0 == 0) goto L155
            K2.c r0 = r0.f2896q
            K2.f r4 = r0.f2872s
            java.lang.Object r7 = r4.f2889x
            monitor-enter(r7)
            r0.close()     // Catch: java.lang.Throwable -> L152
            K2.b r0 = r0.f2870q     // Catch: java.lang.Throwable -> L152
            java.lang.String r0 = r0.f2863a     // Catch: java.lang.Throwable -> L152
            K2.a r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L152
            monitor-exit(r7)
            if (r0 == 0) goto L185
            k3.c r4 = new k3.c
            r4.<init>(r0)
            goto L187
        L152:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L155:
            m5.o r0 = r1.f6572d
            java.lang.Object r0 = r0.getValue()
            K2.i r0 = (K2.i) r0
            if (r0 == 0) goto L185
            U2.n r4 = r1.f6570b
            java.lang.String r4 = r4.f7690e
            if (r4 != 0) goto L167
            java.lang.String r4 = r1.f6569a
        L167:
            K2.f r0 = r0.f2898b
            q6.j r7 = q6.C1541j.f16064t
            q6.j r4 = O3.B.h(r4)
            java.lang.String r7 = "SHA-256"
            q6.j r4 = r4.b(r7)
            java.lang.String r4 = r4.d()
            K2.a r0 = r0.b(r4)
            if (r0 == 0) goto L185
            k3.c r4 = new k3.c
            r4.<init>(r0)
            goto L187
        L185:
            r4 = r26
        L187:
            if (r4 != 0) goto L18a
        L189:
            return r26
        L18a:
            q6.l r0 = r1.e()     // Catch: java.lang.Exception -> L200
            java.lang.Object r7 = r4.f14120q     // Catch: java.lang.Exception -> L200
            K2.a r7 = (K2.a) r7     // Catch: java.lang.Exception -> L200
            q6.x r7 = r7.b(r9)     // Catch: java.lang.Exception -> L200
            q6.E r0 = r0.W(r7, r9)     // Catch: java.lang.Exception -> L200
            q6.z r7 = a.AbstractC0597a.i(r0)     // Catch: java.lang.Exception -> L200
            Q2.g.R(r2, r7)     // Catch: java.lang.Throwable -> L1a9
            r7.close()     // Catch: java.lang.Throwable -> L1a7
            r0 = r26
            goto L1b4
        L1a7:
            r0 = move-exception
            goto L1b4
        L1a9:
            r0 = move-exception
            r11 = r0
            r7.close()     // Catch: java.lang.Throwable -> L1af
            goto L1b3
        L1af:
            r0 = move-exception
            m5.AbstractC1362a.a(r11, r0)     // Catch: java.lang.Exception -> L200
        L1b3:
            r0 = r11
        L1b4:
            if (r0 != 0) goto L22b
            Q2.v r0 = r2.f6585e     // Catch: java.lang.Exception -> L200
            if (r0 == 0) goto L202
            q6.l r1 = r1.e()     // Catch: java.lang.Exception -> L200
            java.lang.Object r7 = r4.f14120q     // Catch: java.lang.Exception -> L200
            K2.a r7 = (K2.a) r7     // Catch: java.lang.Exception -> L200
            q6.x r7 = r7.b(r10)     // Catch: java.lang.Exception -> L200
            r5.f6563q = r3     // Catch: java.lang.Exception -> L200
            r5.f6564r = r2     // Catch: java.lang.Exception -> L200
            r5.f6565s = r4     // Catch: java.lang.Exception -> L200
            r5.f6568v = r8     // Catch: java.lang.Exception -> L200
            q6.i r0 = r0.f6586q     // Catch: java.lang.Exception -> L200
            q6.E r1 = r1.W(r7, r9)     // Catch: java.lang.Exception -> L200
            q6.z r1 = a.AbstractC0597a.i(r1)     // Catch: java.lang.Exception -> L200
            long r7 = r0.T(r1)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L1eb
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L1eb
            r1.close()     // Catch: java.lang.Throwable -> L1e7
            r0 = r26
            goto L1f6
        L1e7:
            r0 = move-exception
            goto L1f6
        L1e9:
            r5 = r0
            goto L1ed
        L1eb:
            r0 = move-exception
            goto L1e9
        L1ed:
            r1.close()     // Catch: java.lang.Throwable -> L1f1
            goto L1f5
        L1f1:
            r0 = move-exception
            m5.AbstractC1362a.a(r5, r0)     // Catch: java.lang.Exception -> L200
        L1f5:
            r0 = r5
        L1f6:
            if (r0 != 0) goto L1fd
            m5.y r0 = m5.C1386y.f15098a     // Catch: java.lang.Exception -> L200
            if (r0 != r6) goto L202
            goto L227
        L1fd:
            throw r0     // Catch: java.lang.Exception -> L200
        L1fe:
            r1 = r4
            goto L22c
        L200:
            r0 = move-exception
            goto L1fe
        L202:
            r1 = r4
        L203:
            java.lang.Object r0 = r1.f14120q     // Catch: java.lang.Exception -> L42
            K2.a r0 = (K2.a) r0     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r0.f2862e     // Catch: java.lang.Exception -> L42
            K2.f r4 = (K2.f) r4     // Catch: java.lang.Exception -> L42
            java.lang.Object r5 = r4.f2889x     // Catch: java.lang.Exception -> L42
            monitor-enter(r5)     // Catch: java.lang.Exception -> L42
            r0.a(r10)     // Catch: java.lang.Throwable -> L228
            java.lang.Object r0 = r0.f2860c     // Catch: java.lang.Throwable -> L228
            K2.b r0 = (K2.b) r0     // Catch: java.lang.Throwable -> L228
            java.lang.String r0 = r0.f2863a     // Catch: java.lang.Throwable -> L228
            K2.c r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L228
            monitor-exit(r5)     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L225
            K2.h r4 = new K2.h     // Catch: java.lang.Exception -> L42
            r4.<init>(r0)     // Catch: java.lang.Exception -> L42
            r6 = r4
            goto L227
        L225:
            r6 = r26
        L227:
            return r6
        L228:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Exception -> L42
            throw r0     // Catch: java.lang.Exception -> L42
        L22b:
            throw r0     // Catch: java.lang.Exception -> L200
        L22c:
            java.lang.Object r1 = r1.f14120q     // Catch: java.lang.Exception -> L233
            K2.a r1 = (K2.a) r1     // Catch: java.lang.Exception -> L233
            r1.a(r9)     // Catch: java.lang.Exception -> L233
        L233:
            Q2.v r1 = r3.f6585e
            if (r1 == 0) goto L23d
            C0.S.s(r1)     // Catch: java.lang.RuntimeException -> L23b java.lang.Exception -> L23d
            goto L23d
        L23b:
            r0 = move-exception
            throw r0
        L23d:
            Q2.v r1 = r2.f6585e
            if (r1 == 0) goto L247
            C0.S.s(r1)     // Catch: java.lang.RuntimeException -> L245 java.lang.Exception -> L247
            goto L247
        L245:
            r0 = move-exception
            throw r0
        L247:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.q.c(Q2.q, K2.h, Q2.u, Q2.u, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String f(String str, String str2) {
        String strB;
        if ((str2 == null || J5.t.G0(str2, "text/plain", false)) && (strB = E3.h.B(str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return J5.m.j1(str2, ';');
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x003d */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: kotlin.jvm.internal.y */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r0 == r10) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x0171, B:22:0x004a, B:69:0x0159, B:71:0x015d, B:58:0x0117, B:60:0x011d, B:66:0x0142, B:41:0x009f, B:43:0x00a6, B:45:0x00b4, B:52:0x00e6, B:54:0x00f2, B:48:0x00ca, B:50:0x00d4, B:63:0x0139, B:64:0x0140), top: B:84:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159 A[Catch: Exception -> 0x003d, PHI: r0 r1
  0x0159: PHI (r0v26 java.lang.Object) = (r0v19 java.lang.Object), (r0v2 java.lang.Object) binds: [B:67:0x0156, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0159: PHI (r1v10 kotlin.jvm.internal.y) = (r1v8 kotlin.jvm.internal.y), (r1v14 kotlin.jvm.internal.y) binds: [B:67:0x0156, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x0171, B:22:0x004a, B:69:0x0159, B:71:0x015d, B:58:0x0117, B:60:0x011d, B:66:0x0142, B:41:0x009f, B:43:0x00a6, B:45:0x00b4, B:52:0x00e6, B:54:0x00f2, B:48:0x00ca, B:50:0x00d4, B:63:0x0139, B:64:0x0140), top: B:84:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x0171, B:22:0x004a, B:69:0x0159, B:71:0x015d, B:58:0x0117, B:60:0x011d, B:66:0x0142, B:41:0x009f, B:43:0x00a6, B:45:0x00b4, B:52:0x00e6, B:54:0x00f2, B:48:0x00ca, B:50:0x00d4, B:63:0x0139, B:64:0x0140), top: B:84:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // L2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q5.InterfaceC1524c r17) throws java.lang.Exception {
        /*
            r16 = this;
            r2 = r16
            r0 = r17
            boolean r1 = r0 instanceof Q2.l
            if (r1 == 0) goto L18
            r1 = r0
            Q2.l r1 = (Q2.l) r1
            int r3 = r1.f6548u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r1.f6548u = r3
        L16:
            r6 = r1
            goto L20
        L18:
            Q2.l r1 = new Q2.l
            s5.c r0 = (s5.c) r0
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r6.f6546s
            int r1 = r6.f6548u
            J2.h r3 = J2.h.f2769s
            java.lang.String r4 = r2.f6569a
            r7 = 3
            r8 = 2
            r5 = 1
            r9 = 0
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L5f
            if (r1 == r5) goto L4f
            if (r1 == r8) goto L48
            if (r1 != r7) goto L40
            kotlin.jvm.internal.y r1 = r6.f6544q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Exception -> L3d
            goto L171
        L3d:
            r0 = move-exception
            goto L174
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L48:
            kotlin.jvm.internal.y r1 = r6.f6544q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Exception -> L3d
            goto L159
        L4f:
            kotlin.jvm.internal.y r1 = r6.f6545r
            kotlin.jvm.internal.y r5 = r6.f6544q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Exception -> L5b
            r15 = r5
            r5 = r1
            r1 = r15
            goto L117
        L5b:
            r0 = move-exception
            r1 = r5
            goto L174
        L5f:
            m5.AbstractC1362a.e(r0)
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
            r1.<init>()
            U2.n r0 = r2.f6570b
            U2.b r11 = r0.f7692h
            boolean r11 = r11.f7628q
            if (r11 == 0) goto L9c
            m5.o r11 = r2.f6572d
            java.lang.Object r11 = r11.getValue()
            K2.i r11 = (K2.i) r11
            if (r11 == 0) goto L9c
            java.lang.String r0 = r0.f7690e
            if (r0 != 0) goto L7e
            r0 = r4
        L7e:
            K2.f r11 = r11.f2898b
            q6.j r12 = q6.C1541j.f16064t
            q6.j r0 = O3.B.h(r0)
            java.lang.String r12 = "SHA-256"
            q6.j r0 = r0.b(r12)
            java.lang.String r0 = r0.d()
            K2.c r0 = r11.c(r0)
            if (r0 == 0) goto L9c
            K2.h r11 = new K2.h
            r11.<init>(r0)
            goto L9d
        L9c:
            r11 = r9
        L9d:
            r1.f14268q = r11
            kotlin.jvm.internal.y r0 = new kotlin.jvm.internal.y     // Catch: java.lang.Exception -> L3d
            r0.<init>()     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L141
            q6.l r11 = r2.e()     // Catch: java.lang.Exception -> L3d
            java.lang.Object r12 = r1.f14268q     // Catch: java.lang.Exception -> L3d
            K2.h r12 = (K2.h) r12     // Catch: java.lang.Exception -> L3d
            K2.c r12 = r12.f2896q     // Catch: java.lang.Exception -> L3d
            boolean r13 = r12.f2871r     // Catch: java.lang.Exception -> L3d
            if (r13 != 0) goto L139
            K2.b r12 = r12.f2870q     // Catch: java.lang.Exception -> L3d
            java.util.ArrayList r12 = r12.f2865c     // Catch: java.lang.Exception -> L3d
            r13 = 0
            java.lang.Object r12 = r12.get(r13)     // Catch: java.lang.Exception -> L3d
            q6.x r12 = (q6.x) r12     // Catch: java.lang.Exception -> L3d
            e1.e r11 = r11.G(r12)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r11 = r11.f12515e     // Catch: java.lang.Exception -> L3d
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Exception -> L3d
            if (r11 != 0) goto Lca
            goto Le6
        Lca:
            long r11 = r11.longValue()     // Catch: java.lang.Exception -> L3d
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto Le6
            L2.i r0 = new L2.i     // Catch: java.lang.Exception -> L3d
            java.lang.Object r5 = r1.f14268q     // Catch: java.lang.Exception -> L3d
            K2.h r5 = (K2.h) r5     // Catch: java.lang.Exception -> L3d
            J2.p r5 = r2.h(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r4 = f(r4, r9)     // Catch: java.lang.Exception -> L3d
            r0.<init>(r5, r4, r3)     // Catch: java.lang.Exception -> L3d
            return r0
        Le6:
            java.lang.Object r11 = r1.f14268q     // Catch: java.lang.Exception -> L3d
            K2.h r11 = (K2.h) r11     // Catch: java.lang.Exception -> L3d
            Q2.u r11 = r2.i(r11)     // Catch: java.lang.Exception -> L3d
            r0.f14268q = r11     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L141
            m5.h r11 = r2.f6573e     // Catch: java.lang.Exception -> L3d
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L3d
            Q2.c r11 = (Q2.c) r11     // Catch: java.lang.Exception -> L3d
            java.lang.Object r12 = r0.f14268q     // Catch: java.lang.Exception -> L3d
            Q2.u r12 = (Q2.u) r12     // Catch: java.lang.Exception -> L3d
            r2.g()     // Catch: java.lang.Exception -> L3d
            r6.f6544q = r1     // Catch: java.lang.Exception -> L3d
            r6.f6545r = r0     // Catch: java.lang.Exception -> L3d
            r6.f6548u = r5     // Catch: java.lang.Exception -> L3d
            R2.a r11 = (R2.a) r11     // Catch: java.lang.Exception -> L3d
            r11.getClass()     // Catch: java.lang.Exception -> L3d
            Q2.a r5 = new Q2.a     // Catch: java.lang.Exception -> L3d
            r5.<init>(r12)     // Catch: java.lang.Exception -> L3d
            if (r5 != r10) goto L114
            goto L170
        L114:
            r15 = r5
            r5 = r0
            r0 = r15
        L117:
            Q2.a r0 = (Q2.a) r0     // Catch: java.lang.Exception -> L3d
            Q2.u r11 = r0.f6525a     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L137
            L2.i r5 = new L2.i     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r1.f14268q     // Catch: java.lang.Exception -> L3d
            K2.h r6 = (K2.h) r6     // Catch: java.lang.Exception -> L3d
            J2.p r6 = r2.h(r6)     // Catch: java.lang.Exception -> L3d
            Q2.u r0 = r0.f6525a     // Catch: java.lang.Exception -> L3d
            Q2.s r0 = r0.f6584d     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = f(r4, r0)     // Catch: java.lang.Exception -> L3d
            r5.<init>(r6, r0, r3)     // Catch: java.lang.Exception -> L3d
            return r5
        L137:
            r3 = r5
            goto L142
        L139:
            java.lang.String r0 = "snapshot is closed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L3d
            r3.<init>(r0)     // Catch: java.lang.Exception -> L3d
            throw r3     // Catch: java.lang.Exception -> L3d
        L141:
            r3 = r0
        L142:
            Q2.t r4 = r2.g()     // Catch: java.lang.Exception -> L3d
            Q2.n r0 = new Q2.n     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L3d
            r6.f6544q = r1     // Catch: java.lang.Exception -> L3d
            r6.f6545r = r9     // Catch: java.lang.Exception -> L3d
            r6.f6548u = r8     // Catch: java.lang.Exception -> L3d
            java.lang.Object r0 = r2.d(r4, r0, r6)     // Catch: java.lang.Exception -> L3d
            if (r0 != r10) goto L159
            goto L170
        L159:
            L2.i r0 = (L2.i) r0     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L173
            Q2.t r0 = r2.g()     // Catch: java.lang.Exception -> L3d
            Q2.m r3 = new Q2.m     // Catch: java.lang.Exception -> L3d
            r3.<init>(r2, r9)     // Catch: java.lang.Exception -> L3d
            r6.f6544q = r1     // Catch: java.lang.Exception -> L3d
            r6.f6548u = r7     // Catch: java.lang.Exception -> L3d
            java.lang.Object r0 = r2.d(r0, r3, r6)     // Catch: java.lang.Exception -> L3d
            if (r0 != r10) goto L171
        L170:
            return r10
        L171:
            L2.i r0 = (L2.i) r0     // Catch: java.lang.Exception -> L3d
        L173:
            return r0
        L174:
            java.lang.Object r1 = r1.f14268q
            K2.h r1 = (K2.h) r1
            if (r1 == 0) goto L180
            C0.S.s(r1)     // Catch: java.lang.RuntimeException -> L17e java.lang.Exception -> L180
            goto L180
        L17e:
            r0 = move-exception
            throw r0
        L180:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.q.a(q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(t tVar, B5.e eVar, l lVar) {
        if (this.f6570b.i.f7628q && kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        T2.b bVar = (T2.b) this.f6571c.getValue();
        return T2.b.a(bVar.f7439a, tVar, new k(eVar, null), lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q6.l e() {
        q6.l lVar;
        K2.i iVar = (K2.i) this.f6572d.getValue();
        return (iVar == null || (lVar = iVar.f2897a) == null) ? this.f6570b.f : lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t g() {
        I2.l lVar = h.f6535b;
        U2.n nVar = this.f6570b;
        s sVar = (s) I2.q.e(nVar, lVar);
        sVar.getClass();
        r rVar = new r(sVar);
        U2.b bVar = nVar.f7692h;
        boolean z5 = bVar.f7628q;
        boolean z6 = nVar.i.f7628q && this.f.a();
        if (!z6 && z5) {
            rVar.a("only-if-cached, max-stale=2147483647");
        } else if (!z6 || z5) {
            if (!z6 && !z5) {
                rVar.a("no-cache, only-if-cached");
            }
        } else if (bVar.f7629r) {
            rVar.a("no-cache");
        } else {
            rVar.a("no-cache, no-store");
        }
        String str = (String) I2.q.e(nVar, h.f6534a);
        s sVar2 = new s(x.O(rVar.f6574a));
        if (I2.q.e(nVar, h.f6536c) == null) {
            return new t(this.f6569a, str, sVar2, nVar.j);
        }
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J2.p h(K2.h hVar) {
        K2.c cVar = hVar.f2896q;
        if (cVar.f2871r) {
            throw new IllegalStateException("snapshot is closed");
        }
        q6.x xVar = (q6.x) cVar.f2870q.f2865c.get(1);
        q6.l lVarE = e();
        String str = this.f6570b.f7690e;
        if (str == null) {
            str = this.f6569a;
        }
        return g.c(xVar, lVarE, str, hVar, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u i(K2.h hVar) throws Throwable {
        Throwable th;
        u uVarL;
        try {
            q6.l lVarE = e();
            K2.c cVar = hVar.f2896q;
            if (cVar.f2871r) {
                throw new IllegalStateException("snapshot is closed");
            }
            A aJ = AbstractC0597a.j(lVarE.a0((q6.x) cVar.f2870q.f2865c.get(0)));
            try {
                uVarL = g.L(aJ);
                try {
                    aJ.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    aJ.close();
                } catch (Throwable th4) {
                    AbstractC1362a.a(th3, th4);
                }
                th = th3;
                uVarL = null;
            }
            if (th == null) {
                return uVarL;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
