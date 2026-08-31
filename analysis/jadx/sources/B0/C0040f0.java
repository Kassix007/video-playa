package B0;

import c0.AbstractC0724l;
import c0.InterfaceC0723k;

/* JADX INFO: renamed from: B0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f426e;
    public final /* synthetic */ Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0040f0(t3.a r6, byte[] r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.f = r6
            int r0 = r6.f16725e
            r5.f422a = r0
            java.lang.String r0 = r6.f16724d
            r5.f424c = r0
            com.google.android.gms.internal.clearcut.p0 r0 = r6.f
            r5.f425d = r0
            com.google.android.gms.internal.clearcut.w0 r0 = new com.google.android.gms.internal.clearcut.w0
            r0.<init>()
            r1 = 0
            r0.f10568q = r1
            r0.f10569r = r1
            r1 = 0
            r0.f10570s = r1
            com.google.android.gms.internal.clearcut.x0[] r2 = com.google.android.gms.internal.clearcut.x0.f10578q
            if (r2 != 0) goto L35
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.o0.f10536a
            monitor-enter(r2)
            com.google.android.gms.internal.clearcut.x0[] r3 = com.google.android.gms.internal.clearcut.x0.f10578q     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L31
            com.google.android.gms.internal.clearcut.x0[] r3 = new com.google.android.gms.internal.clearcut.x0[r1]     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.clearcut.x0.f10578q = r3     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r6 = move-exception
            goto L33
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r6
        L35:
            com.google.android.gms.internal.clearcut.x0[] r2 = com.google.android.gms.internal.clearcut.x0.f10578q
            r0.f10571t = r2
            byte[] r2 = com.google.android.gms.internal.clearcut.l0.f
            r0.f10572u = r2
            r0.f10573v = r2
            java.lang.String r3 = ""
            r0.f10574w = r3
            java.lang.String r3 = ""
            r0.f10575x = r3
            java.lang.String r3 = ""
            r0.f10576y = r3
            r3 = 180000(0x2bf20, double:8.8932E-319)
            r0.f10577z = r3
            r0.f10564A = r2
            java.lang.String r2 = ""
            r0.f10565B = r2
            int[] r2 = com.google.android.gms.internal.clearcut.l0.f10528e
            r0.f10566C = r2
            r0.f10567D = r1
            r5.f426e = r0
            r5.f423b = r1
            android.content.Context r1 = r6.f16721a
            boolean r2 = com.google.android.gms.internal.clearcut.l0.f10526c
            r3 = 1
            if (r2 != 0) goto L95
            android.os.UserManager r2 = com.google.android.gms.internal.clearcut.l0.f10525b
            if (r2 != 0) goto L8a
            java.lang.Class<com.google.android.gms.internal.clearcut.l0> r4 = com.google.android.gms.internal.clearcut.l0.class
            monitor-enter(r4)
            android.os.UserManager r2 = com.google.android.gms.internal.clearcut.l0.f10525b     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L86
            java.lang.Class<android.os.UserManager> r2 = android.os.UserManager.class
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L83
            android.os.UserManager r1 = (android.os.UserManager) r1     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.clearcut.l0.f10525b = r1     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L85
            com.google.android.gms.internal.clearcut.l0.f10526c = r3     // Catch: java.lang.Throwable -> L83
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            r2 = r3
            goto L95
        L83:
            r6 = move-exception
            goto L88
        L85:
            r2 = r1
        L86:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            goto L8a
        L88:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            throw r6
        L8a:
            boolean r2 = r2.isUserUnlocked()
            com.google.android.gms.internal.clearcut.l0.f10526c = r2
            if (r2 == 0) goto L95
            r1 = 0
            com.google.android.gms.internal.clearcut.l0.f10525b = r1
        L95:
            r1 = r2 ^ 1
            r0.f10567D = r1
            B3.a r1 = r6.f16727h
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r0.f10568q = r1
            B3.a r6 = r6.f16727h
            r6.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f10569r = r1
            long r1 = r0.f10568q
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            int r6 = r6.getOffset(r1)
            int r6 = r6 / 1000
            long r1 = (long) r6
            r0.f10577z = r1
            r0.f10573v = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0040f0.<init>(t3.a, byte[]):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(int i, int i7) {
        R.e eVar = (R.e) this.f425d;
        int i8 = this.f422a;
        InterfaceC0723k interfaceC0723k = (InterfaceC0723k) eVar.f6676q[i + i8];
        InterfaceC0723k interfaceC0723k2 = (InterfaceC0723k) ((R.e) this.f426e).f6676q[i8 + i7];
        h0 h0Var = i0.f443a;
        return kotlin.jvm.internal.m.a(interfaceC0723k, interfaceC0723k2) || interfaceC0723k.getClass() == interfaceC0723k2.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r0 = r1.f
            r2 = r0
            t3.a r2 = (t3.a) r2
            boolean r0 = r1.f423b
            if (r0 != 0) goto L259
            r3 = 1
            r1.f423b = r3
            t3.c r4 = new t3.c
            com.google.android.gms.internal.clearcut.C0 r5 = new com.google.android.gms.internal.clearcut.C0
            java.lang.String r6 = r2.f16722b
            int r7 = r2.f16723c
            int r8 = r1.f422a
            java.lang.Object r0 = r1.f424c
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r1.f425d
            r10 = r0
            com.google.android.gms.internal.clearcut.p0 r10 = (com.google.android.gms.internal.clearcut.p0) r10
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r1.f426e
            com.google.android.gms.internal.clearcut.w0 r0 = (com.google.android.gms.internal.clearcut.w0) r0
            r4.<init>(r5, r0)
            com.google.android.gms.internal.clearcut.B0 r6 = r2.i
            android.content.Context r6 = r6.f10383a
            r7 = 0
            if (r0 == 0) goto L36
            int r0 = r0.f10570s
            goto L37
        L36:
            r0 = r7
        L37:
            com.google.android.gms.internal.clearcut.c r8 = com.google.android.gms.internal.clearcut.B0.i
            java.lang.Object r8 = r8.a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9 = 0
            java.lang.String r10 = r5.f10402w
            int r5 = r5.f10398s
            if (r8 != 0) goto L186
            if (r10 == 0) goto L53
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L53
            goto L5b
        L53:
            if (r5 < 0) goto L5a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            goto L5b
        L5a:
            r10 = r9
        L5b:
            if (r10 == 0) goto L209
            if (r6 == 0) goto L87
            boolean r0 = com.google.android.gms.internal.clearcut.B0.c(r6)
            if (r0 != 0) goto L66
            goto L87
        L66:
            java.util.HashMap r0 = com.google.android.gms.internal.clearcut.B0.f
            java.lang.Object r5 = r0.get(r10)
            com.google.android.gms.internal.clearcut.b r5 = (com.google.android.gms.internal.clearcut.AbstractC0738b) r5
            if (r5 != 0) goto L7f
            com.google.android.gms.internal.clearcut.f r5 = com.google.android.gms.internal.clearcut.B0.f10379d
            r5.getClass()
            com.google.android.gms.internal.clearcut.c r8 = new com.google.android.gms.internal.clearcut.c
            r11 = 1
            r8.<init>(r5, r10, r9, r11)
            r0.put(r10, r8)
            r5 = r8
        L7f:
            java.lang.Object r0 = r5.a()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            goto L88
        L87:
            r5 = r9
        L88:
            if (r5 != 0) goto L8d
        L8a:
            r0 = r9
            goto L16a
        L8d:
            r0 = 44
            int r0 = r5.indexOf(r0)
            if (r0 < 0) goto L9b
            java.lang.String r8 = r5.substring(r7, r0)
            int r0 = r0 + r3
            goto L9e
        L9b:
            java.lang.String r8 = ""
            r0 = r7
        L9e:
            r10 = 47
            int r10 = r5.indexOf(r10, r0)
            java.lang.String r11 = "LogSamplerImpl"
            if (r10 > 0) goto Lbe
            int r0 = r5.length()
            java.lang.String r8 = "Failed to parse the rule: "
            if (r0 == 0) goto Lb5
            java.lang.String r0 = r8.concat(r5)
            goto Lba
        Lb5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
        Lba:
            android.util.Log.e(r11, r0)
            goto L8a
        Lbe:
            java.lang.String r0 = r5.substring(r0, r10)     // Catch: java.lang.NumberFormatException -> L152
            long r12 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L152
            int r10 = r10 + r3
            java.lang.String r0 = r5.substring(r10)     // Catch: java.lang.NumberFormatException -> L152
            long r14 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L152
            r16 = 0
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L132
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 >= 0) goto Lda
            goto L132
        Lda:
            com.google.android.gms.internal.clearcut.r0 r0 = com.google.android.gms.internal.clearcut.s0.m()
            r0.b()
            com.google.android.gms.internal.clearcut.x r5 = r0.f10561r
            com.google.android.gms.internal.clearcut.s0 r5 = (com.google.android.gms.internal.clearcut.s0) r5
            com.google.android.gms.internal.clearcut.s0.g(r5, r8)
            r0.b()
            com.google.android.gms.internal.clearcut.x r5 = r0.f10561r
            com.google.android.gms.internal.clearcut.s0 r5 = (com.google.android.gms.internal.clearcut.s0) r5
            com.google.android.gms.internal.clearcut.s0.f(r5, r12)
            r0.b()
            com.google.android.gms.internal.clearcut.x r5 = r0.f10561r
            com.google.android.gms.internal.clearcut.s0 r5 = (com.google.android.gms.internal.clearcut.s0) r5
            com.google.android.gms.internal.clearcut.s0.h(r5, r14)
            com.google.android.gms.internal.clearcut.x r0 = r0.c()
            java.lang.Object r5 = r0.a(r3)
            java.lang.Byte r5 = (java.lang.Byte) r5
            byte r5 = r5.byteValue()
            if (r5 != r3) goto L10e
            r5 = r3
            goto L127
        L10e:
            if (r5 != 0) goto L112
            r5 = r7
            goto L127
        L112:
            com.google.android.gms.internal.clearcut.V r5 = com.google.android.gms.internal.clearcut.V.f10444c
            r5.getClass()
            java.lang.Class r8 = r0.getClass()
            com.google.android.gms.internal.clearcut.Z r5 = r5.a(r8)
            boolean r5 = r5.f(r0)
            r8 = 2
            r0.a(r8)
        L127:
            if (r5 == 0) goto L12c
            com.google.android.gms.internal.clearcut.s0 r0 = (com.google.android.gms.internal.clearcut.s0) r0
            goto L16a
        L12c:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L132:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r5 = 72
            r0.<init>(r5)
            java.lang.String r5 = "negative values not supported: "
            r0.append(r5)
            r0.append(r12)
            java.lang.String r5 = "/"
            r0.append(r5)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r11, r0)
            goto L8a
        L152:
            r0 = move-exception
            int r8 = r5.length()
            java.lang.String r10 = "parseLong() failed while parsing: "
            if (r8 == 0) goto L160
            java.lang.String r5 = r10.concat(r5)
            goto L165
        L160:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r10)
        L165:
            android.util.Log.e(r11, r5, r0)
            goto L8a
        L16a:
            if (r0 == 0) goto L209
            java.lang.String r5 = r0.j()
            long r10 = com.google.android.gms.internal.clearcut.B0.d(r6)
            long r12 = com.google.android.gms.internal.clearcut.B0.a(r5, r10)
            long r14 = r0.k()
            long r16 = r0.l()
            boolean r0 = com.google.android.gms.internal.clearcut.B0.b(r12, r14, r16)
            goto L20a
        L186:
            if (r10 == 0) goto L18f
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L18f
            goto L197
        L18f:
            if (r5 < 0) goto L196
            java.lang.String r10 = java.lang.String.valueOf(r5)
            goto L197
        L196:
            r10 = r9
        L197:
            if (r10 == 0) goto L209
            if (r6 != 0) goto L19e
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            goto L1cb
        L19e:
            java.util.concurrent.ConcurrentHashMap r5 = com.google.android.gms.internal.clearcut.B0.f10380e
            java.lang.Object r8 = r5.get(r10)
            com.google.android.gms.internal.clearcut.b r8 = (com.google.android.gms.internal.clearcut.AbstractC0738b) r8
            if (r8 != 0) goto L1c1
            com.google.android.gms.internal.clearcut.f r8 = com.google.android.gms.internal.clearcut.B0.f10378c
            com.google.android.gms.internal.clearcut.t0 r11 = com.google.android.gms.internal.clearcut.t0.f()
            r8.getClass()
            com.google.android.gms.internal.clearcut.d r12 = new com.google.android.gms.internal.clearcut.d
            r12.<init>(r8, r10, r11)
            java.lang.Object r5 = r5.putIfAbsent(r10, r12)
            r8 = r5
            com.google.android.gms.internal.clearcut.b r8 = (com.google.android.gms.internal.clearcut.AbstractC0738b) r8
            if (r8 == 0) goto L1c0
            goto L1c1
        L1c0:
            r8 = r12
        L1c1:
            java.lang.Object r5 = r8.a()
            com.google.android.gms.internal.clearcut.t0 r5 = (com.google.android.gms.internal.clearcut.t0) r5
            com.google.android.gms.internal.clearcut.A r5 = r5.e()
        L1cb:
            java.util.Iterator r5 = r5.iterator()
        L1cf:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L209
            java.lang.Object r8 = r5.next()
            com.google.android.gms.internal.clearcut.s0 r8 = (com.google.android.gms.internal.clearcut.s0) r8
            boolean r10 = r8.i()
            if (r10 == 0) goto L1ed
            int r10 = r8.e()
            if (r10 == 0) goto L1ed
            int r10 = r8.e()
            if (r10 != r0) goto L1cf
        L1ed:
            java.lang.String r10 = r8.j()
            long r11 = com.google.android.gms.internal.clearcut.B0.d(r6)
            long r13 = com.google.android.gms.internal.clearcut.B0.a(r10, r11)
            long r15 = r8.k()
            long r17 = r8.l()
            boolean r8 = com.google.android.gms.internal.clearcut.B0.b(r13, r15, r17)
            if (r8 != 0) goto L1cf
            r0 = r7
            goto L20a
        L209:
            r0 = r3
        L20a:
            if (r0 == 0) goto L24e
            com.google.android.gms.internal.clearcut.U r0 = r2.f16726g
            r0.getClass()
            com.google.android.gms.internal.clearcut.v0 r2 = new com.google.android.gms.internal.clearcut.v0
            v3.r r5 = r0.f17202h
            r2.<init>(r4, r5)
            boolean r4 = r2.f
            if (r4 != 0) goto L22c
            C0.d0 r4 = com.google.android.gms.common.api.internal.BasePendingResult.f10316g
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L22b
            goto L22c
        L22b:
            r3 = r7
        L22c:
            r2.f = r3
            v3.e r3 = r0.j
            r3.getClass()
            v3.y r4 = new v3.y
            r4.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r3.i
            v3.w r5 = new v3.w
            int r2 = r2.get()
            r5.<init>(r4, r2, r0)
            I3.e r0 = r3.f17574m
            r2 = 4
            android.os.Message r2 = r0.obtainMessage(r2, r5)
            r0.sendMessage(r2)
            return
        L24e:
            v3.j r0 = new v3.j
            r0.<init>(r9)
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.f10309u
            r0.A0(r2)
            return
        L259:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "do not reuse LogEventBuilder"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0040f0.b():void");
    }

    public C0040f0(C0042g0 c0042g0, AbstractC0724l abstractC0724l, int i, R.e eVar, R.e eVar2, boolean z5) {
        this.f = c0042g0;
        this.f424c = abstractC0724l;
        this.f422a = i;
        this.f425d = eVar;
        this.f426e = eVar2;
        this.f423b = z5;
    }
}
