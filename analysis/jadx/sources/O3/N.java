package O3;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class N extends H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f4519A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f4520B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f4521C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4522D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f4523E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f4524F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f4525G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f4526H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f4527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f4528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f4530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f4531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f4533z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(C0323t0 c0323t0, long j, long j7) {
        super(c0323t0);
        this.f4525G = 0L;
        this.f4526H = null;
        this.f4533z = j;
        this.f4519A = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.a2 s(java.lang.String r45) {
        /*
            r44 = this;
            r1 = r44
            r1.o()
            O3.a2 r2 = new O3.a2
            java.lang.String r3 = r1.u()
            java.lang.String r4 = r1.v()
            r1.p()
            java.lang.String r5 = r1.f4528u
            r1.p()
            int r0 = r1.f4529v
            long r6 = (long) r0
            r1.p()
            java.lang.String r0 = r1.f4530w
            x3.AbstractC1887A.g(r0)
            java.lang.String r8 = r1.f4530w
            java.lang.Object r0 = r1.f4346r
            r9 = r0
            O3.t0 r9 = (O3.C0323t0) r9
            O3.g r0 = r9.f5075t
            O3.X r10 = r9.f5077v
            O3.g r11 = r9.f5075t
            android.content.Context r12 = r9.f5072q
            O3.Y1 r13 = r9.f5080y
            O3.h0 r14 = r9.f5076u
            r0.t()
            r1.p()
            r1.o()
            r15 = r2
            r16 = r3
            long r2 = r1.f4532y
            r17 = 0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r19 = r2
            if (r0 != 0) goto Le6
            O3.C0323t0.j(r13)
            java.lang.Object r0 = r13.f4346r
            r3 = r0
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.String r0 = r12.getPackageName()
            r13.o()
            x3.AbstractC1887A.d(r0)
            android.content.pm.PackageManager r19 = r12.getPackageManager()
            r21 = 0
            java.security.MessageDigest r2 = O3.Y1.F()
            r22 = -1
            if (r2 != 0) goto L7f
            O3.X r0 = r3.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r2 = "Could not get MD5 instance"
            r0.b(r2)
            r24 = r4
            r25 = r5
        L7b:
            r2 = r22
            goto Le3
        L7f:
            if (r19 == 0) goto Lde
            boolean r0 = r13.R(r12, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            if (r0 != 0) goto Lc8
            C3.b r0 = C3.c.a(r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            r24 = r4
            android.content.Context r4 = r3.f5072q     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc0
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc0
            r25 = r5
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.a(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r0 == 0) goto Lb3
            int r4 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r4 <= 0) goto Lb3
            r0 = r0[r21]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            byte[] r0 = r2.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            long r22 = O3.Y1.G(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto L7b
        Lb1:
            r0 = move-exception
            goto Lcf
        Lb3:
            O3.X r0 = r3.f5077v     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            O3.C0323t0.l(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            O3.V r0 = r0.f4673z     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r2 = "Could not get signatures"
            r0.b(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto L7b
        Lc0:
            r0 = move-exception
        Lc1:
            r25 = r5
            goto Lcf
        Lc4:
            r0 = move-exception
            r24 = r4
            goto Lc1
        Lc8:
            r24 = r4
            r25 = r5
            r22 = r17
            goto L7b
        Lcf:
            O3.X r2 = r3.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            java.lang.String r3 = "Package name not found"
            r2.c(r0, r3)
        Ldb:
            r2 = r17
            goto Le3
        Lde:
            r24 = r4
            r25 = r5
            goto Ldb
        Le3:
            r1.f4532y = r2
            goto Lee
        Le6:
            r24 = r4
            r25 = r5
            r21 = 0
            r2 = r19
        Lee:
            boolean r0 = r9.a()
            O3.C0323t0.j(r14)
            boolean r4 = r14.f4885I
            r5 = 1
            r4 = r4 ^ r5
            r1.o()
            boolean r19 = r9.a()
            if (r19 != 0) goto L109
            r22 = r0
        L104:
            r26 = r2
        L106:
            r0 = 0
            goto L174
        L109:
            com.google.android.gms.internal.measurement.t4 r5 = com.google.android.gms.internal.measurement.t4.f11043r
            G4.g r5 = r5.f11044q
            java.lang.Object r5 = r5.f2014q
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.u4) r5
            O3.E r5 = O3.F.f4376H0
            r22 = r0
            r0 = 0
            boolean r5 = r11.y(r0, r5)
            if (r5 == 0) goto L127
            O3.C0323t0.l(r10)
            O3.V r0 = r10.f4666E
            java.lang.String r5 = "Disabled IID for tests."
            r0.b(r5)
            goto L104
        L127:
            java.lang.ClassLoader r0 = r12.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L104
            java.lang.String r5 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r5)     // Catch: java.lang.ClassNotFoundException -> L104
            if (r0 != 0) goto L134
            goto L104
        L134:
            java.lang.String r5 = "getInstance"
            java.lang.Class<android.content.Context> r23 = android.content.Context.class
            r26 = r2
            java.lang.Class[] r2 = new java.lang.Class[]{r23}     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r5, r2)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r3 = new java.lang.Object[]{r12}     // Catch: java.lang.Exception -> L169
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r3)     // Catch: java.lang.Exception -> L169
            if (r2 != 0) goto L14f
            r0 = r5
            goto L174
        L14f:
            java.lang.String r3 = "getFirebaseInstanceId"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L15c
            java.lang.Object r0 = r0.invoke(r2, r5)     // Catch: java.lang.Exception -> L15c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L15c
            goto L174
        L15c:
            O3.C0323t0.l(r10)
            O3.V r0 = r10.f4663B
            java.lang.String r2 = "Failed to retrieve Firebase Instance Id"
            r0.b(r2)
            goto L106
        L167:
            r26 = r2
        L169:
            O3.C0323t0.l(r10)
            O3.V r0 = r10.f4662A
            java.lang.String r2 = "Failed to obtain Firebase Analytics instance"
            r0.b(r2)
            goto L106
        L174:
            long r2 = r9.f5071T
            O3.C0323t0.j(r14)
            O3.f0 r5 = r14.f4896w
            r10 = r4
            long r4 = r5.a()
            int r12 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r12 != 0) goto L185
            goto L189
        L185:
            long r2 = java.lang.Math.min(r2, r4)
        L189:
            r1.p()
            int r4 = r1.f4522D
            java.lang.String r5 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r5 = r11.A(r5)
            if (r5 == 0) goto L1a0
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L19d
            goto L1a0
        L19d:
            r5 = r21
            goto L1a1
        L1a0:
            r5 = 1
        L1a1:
            O3.C0323t0.j(r14)
            r14.o()
            android.content.SharedPreferences r12 = r14.s()
            r23 = r0
            java.lang.String r0 = "deferred_analytics_collection"
            r28 = r2
            r2 = r21
            boolean r0 = r12.getBoolean(r0, r2)
            java.lang.String r2 = "google_analytics_default_allow_ad_personalization_signals"
            r3 = 1
            O3.G0 r12 = r11.D(r2, r3)
            O3.G0 r3 = O3.G0.GRANTED
            if (r12 == r3) goto L1c4
            r3 = 1
            goto L1c5
        L1c4:
            r3 = 0
        L1c5:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.util.List r12 = r1.f4520B
            O3.J0 r30 = r14.v()
            java.lang.String r30 = r30.g()
            r31 = r0
            java.lang.String r0 = r1.f4521C
            if (r0 != 0) goto L1e2
            O3.C0323t0.j(r13)
            java.lang.String r0 = r13.g0()
            r1.f4521C = r0
        L1e2:
            java.lang.String r0 = r1.f4521C
            r32 = r0
            O3.J0 r0 = r14.v()
            r33 = r3
            O3.I0 r3 = O3.I0.ANALYTICS_STORAGE
            boolean r0 = r0.i(r3)
            if (r0 != 0) goto L1f8
            r34 = r4
            r0 = 0
            goto L231
        L1f8:
            r1.o()
            r0 = r4
            long r3 = r1.f4525G
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 != 0) goto L205
            r34 = r0
            goto L228
        L205:
            B3.a r3 = r9.f5052A
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r34 = r3
            long r3 = r1.f4525G
            long r3 = r34 - r3
            r34 = r0
            java.lang.String r0 = r1.f4524F
            if (r0 == 0) goto L228
            r35 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r0 <= 0) goto L228
            java.lang.String r0 = r1.f4526H
            if (r0 != 0) goto L228
            r1.t()
        L228:
            java.lang.String r0 = r1.f4524F
            if (r0 != 0) goto L22f
            r1.t()
        L22f:
            java.lang.String r0 = r1.f4524F
        L231:
            java.lang.String r3 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r3 = r11.A(r3)
            if (r3 != 0) goto L23b
            r3 = 0
            goto L23f
        L23b:
            boolean r3 = r3.booleanValue()
        L23f:
            O3.C0323t0.j(r13)
            java.lang.Object r4 = r13.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            r35 = r0
            java.lang.String r0 = r1.u()
            r36 = r3
            android.content.Context r3 = r4.f5072q
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L25c
            r37 = r5
            r3 = r17
            r5 = 0
            goto L287
        L25c:
            android.content.Context r3 = r4.f5072q     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L276
            C3.b r3 = C3.c.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L276
            android.content.Context r3 = r3.f1185a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L276
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L276
            r37 = r5
            r5 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L279
            if (r3 == 0) goto L274
            int r0 = r3.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L279
            goto L286
        L274:
            r0 = r5
            goto L286
        L276:
            r37 = r5
            r5 = 0
        L279:
            O3.X r3 = r4.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4664C
            java.lang.String r4 = "PackageManager failed to find running app: app_id"
            r3.c(r0, r4)
            goto L274
        L286:
            long r3 = (long) r0
        L287:
            O3.C0323t0.j(r14)
            O3.J0 r0 = r14.v()
            int r0 = r0.f4498b
            O3.C0323t0.j(r14)
            r14.o()
            android.content.SharedPreferences r14 = r14.s()
            java.lang.String r5 = "dma_consent_settings"
            r38 = r0
            r0 = 0
            java.lang.String r5 = r14.getString(r5, r0)
            O3.p r5 = O3.C0311p.b(r5)
            java.lang.String r5 = r5.f5006b
            com.google.android.gms.internal.measurement.Y3.a()
            O3.E r14 = O3.F.f4394Q0
            boolean r39 = r11.y(r0, r14)
            if (r39 == 0) goto L2cb
            O3.C0323t0.j(r13)
            int r0 = android.os.Build.VERSION.SDK_INT
            r39 = r3
            r3 = 30
            if (r0 < r3) goto L2cd
            int r0 = C0.D0.b()
            r3 = 3
            if (r0 <= r3) goto L2cd
            int r0 = C0.D0.C()
            goto L2ce
        L2cb:
            r39 = r3
        L2cd:
            r0 = 0
        L2ce:
            com.google.android.gms.internal.measurement.Y3.a()
            r3 = 0
            boolean r3 = r11.y(r3, r14)
            if (r3 == 0) goto L2df
            O3.C0323t0.j(r13)
            long r17 = r13.J()
        L2df:
            java.lang.String r3 = r11.f4856t
            r4 = 1
            O3.G0 r2 = r11.D(r2, r4)
            char r2 = O3.J0.h(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            long r13 = r9.f5071T
            O3.g1 r4 = r9.f5062K
            O3.C0323t0.i(r4)
            O3.g1 r4 = r9.f5062K
            int r4 = r4.t()
            int r41 = C0.S.e(r4)
            r21 = r31
            r42 = r38
            r38 = r2
            r2 = r15
            r15 = r10
            r43 = r33
            r33 = r5
            r5 = r25
            r25 = r12
            r11 = r26
            r26 = r30
            r27 = r32
            r32 = r42
            r30 = r39
            r39 = r13
            r14 = r22
            r22 = r43
            long r9 = r1.f4533z
            r13 = r45
            r4 = r24
            r19 = r34
            r20 = r37
            r34 = r0
            r37 = r3
            r3 = r16
            r16 = r23
            r23 = r9
            r9 = 130000(0x1fbd0, double:6.42285E-319)
            r42 = r28
            r28 = r35
            r29 = r36
            r35 = r17
            r17 = r42
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39, r41)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.N.s(java.lang.String):O3.a2");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        String str;
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        X x6 = c0323t0.f5077v;
        C0323t0.j(c0288h0);
        if (c0288h0.v().i(I0.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            Y1 y12 = c0323t0.f5080y;
            C0323t0.j(y12);
            y12.l0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C0323t0.l(x6);
            x6.f4665D.b("Analytics Storage consent is not granted");
            str = null;
        }
        C0323t0.l(x6);
        x6.f4665D.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f4524F = str;
        c0323t0.f5052A.getClass();
        this.f4525G = System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String u() {
        p();
        AbstractC1887A.g(this.f4527t);
        return this.f4527t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String v() {
        o();
        p();
        AbstractC1887A.g(this.f4523E);
        return this.f4523E;
    }
}
