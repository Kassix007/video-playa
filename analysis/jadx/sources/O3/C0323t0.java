package O3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.F2;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import x3.AbstractC1887A;
import x3.C1899k;

/* JADX INFO: renamed from: O3.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0323t0 implements F0 {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static volatile C0323t0 f5051U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B3.a f5052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0304m1 f5053B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0271b1 f5054C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final A f5055D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0283f1 f5056E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f5057F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public P f5058G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0333w1 f5059H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0314q f5060I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public N f5061J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0286g1 f5062K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Boolean f5064M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f5065N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public volatile Boolean f5066O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public volatile boolean f5067P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5068Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5069R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final long f5071T;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f5072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f5073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s4.e f5074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0284g f5075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0288h0 f5076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X f5077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0312p0 f5078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E1 f5079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Y1 f5080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Q f5081z;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f5063L = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final AtomicInteger f5070S = new AtomicInteger(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0323t0(N0 n02) {
        Context context;
        Context context2 = n02.f4534a;
        s4.e eVar = new s4.e(12);
        this.f5074s = eVar;
        K0.f4509k = eVar;
        this.f5072q = context2;
        this.f5073r = n02.f4538e;
        this.f5066O = n02.f4535b;
        this.f5057F = n02.f4539g;
        this.f5067P = true;
        if (com.google.android.gms.internal.measurement.T1.f10706h == null && context2 != null) {
            Object obj = com.google.android.gms.internal.measurement.T1.f10705g;
            synchronized (obj) {
                try {
                    if (com.google.android.gms.internal.measurement.T1.f10706h == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.L1 l12 = com.google.android.gms.internal.measurement.T1.f10706h;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (l12 == null || l12.f10654a != applicationContext) {
                                if (l12 != null) {
                                    com.google.android.gms.internal.measurement.M1.c();
                                    com.google.android.gms.internal.measurement.V1.a();
                                    synchronized (com.google.android.gms.internal.measurement.O1.class) {
                                        try {
                                            com.google.android.gms.internal.measurement.O1 o12 = com.google.android.gms.internal.measurement.O1.f10678d;
                                            if (o12 != null && (context = (Context) o12.f10680b) != null && ((com.google.android.gms.internal.clearcut.F0) o12.f10681c) != null && o12.f10679a) {
                                                context.getContentResolver().unregisterContentObserver((com.google.android.gms.internal.clearcut.F0) com.google.android.gms.internal.measurement.O1.f10678d.f10681c);
                                            }
                                            com.google.android.gms.internal.measurement.O1.f10678d = null;
                                        } finally {
                                        }
                                    }
                                }
                                F2 f22 = new F2(applicationContext);
                                com.google.android.gms.internal.measurement.T1.f10706h = new com.google.android.gms.internal.measurement.L1(applicationContext, f22 instanceof Serializable ? new G4.e(f22) : new G4.f(f22));
                                com.google.android.gms.internal.measurement.T1.i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.f5052A = B3.a.f551a;
        Long l7 = n02.f;
        this.f5071T = l7 != null ? l7.longValue() : System.currentTimeMillis();
        C0284g c0284g = new C0284g(this);
        c0284g.f4857u = C1899k.f18484s;
        this.f5075t = c0284g;
        C0288h0 c0288h0 = new C0288h0(this);
        c0288h0.r();
        this.f5076u = c0288h0;
        X x6 = new X(this);
        x6.r();
        this.f5077v = x6;
        Y1 y12 = new Y1(this);
        y12.r();
        this.f5080y = y12;
        this.f5081z = new Q(new C0294j0(n02, this));
        this.f5055D = new A(this);
        C0304m1 c0304m1 = new C0304m1(this);
        c0304m1.q();
        this.f5053B = c0304m1;
        C0271b1 c0271b1 = new C0271b1(this);
        c0271b1.q();
        this.f5054C = c0271b1;
        E1 e12 = new E1(this);
        e12.q();
        this.f5079x = e12;
        C0283f1 c0283f1 = new C0283f1(this);
        c0283f1.r();
        this.f5056E = c0283f1;
        C0312p0 c0312p0 = new C0312p0(this);
        c0312p0.r();
        this.f5078w = c0312p0;
        com.google.android.gms.internal.measurement.V v6 = n02.f4537d;
        boolean z5 = v6 == null || v6.f10722r == 0;
        if (context2.getApplicationContext() instanceof Application) {
            k(c0271b1);
            if (((C0323t0) c0271b1.f4346r).f5072q.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C0323t0) c0271b1.f4346r).f5072q.getApplicationContext();
                if (c0271b1.f4761t == null) {
                    c0271b1.f4761t = new Y0(c0271b1);
                }
                if (z5) {
                    application.unregisterActivityLifecycleCallbacks(c0271b1.f4761t);
                    application.registerActivityLifecycleCallbacks(c0271b1.f4761t);
                    X x7 = ((C0323t0) c0271b1.f4346r).f5077v;
                    l(x7);
                    x7.f4666E.b("Registered activity lifecycle callback");
                }
            }
        } else {
            l(x6);
            x6.f4673z.b("Application context is not an Application");
        }
        c0312p0.x(new I4.a(5, (Object) this, (Object) n02, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(C c7) {
        if (c7 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(D0 d02) {
        if (d02 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(H h4) {
        if (h4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!h4.f4481s) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h4.getClass())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(E0 e02) {
        if (e02 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!e02.f4356s) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e02.getClass())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0323t0 r(Context context, com.google.android.gms.internal.measurement.V v6, Long l7) {
        Bundle bundle;
        if (v6 != null) {
            Bundle bundle2 = v6.f10724t;
            v6 = new com.google.android.gms.internal.measurement.V(v6.f10721q, v6.f10722r, v6.f10723s, bundle2, null);
        }
        AbstractC1887A.g(context);
        AbstractC1887A.g(context.getApplicationContext());
        if (f5051U == null) {
            synchronized (C0323t0.class) {
                try {
                    if (f5051U == null) {
                        f5051U = new C0323t0(new N0(context, v6, l7));
                    }
                } finally {
                }
            }
        } else if (v6 != null && (bundle = v6.f10724t) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1887A.g(f5051U);
            f5051U.f5066O = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1887A.g(f5051U);
        return f5051U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return f() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final X b() {
        X x6 = this.f5077v;
        l(x6);
        return x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final C0312p0 c() {
        C0312p0 c0312p0 = this.f5078w;
        l(c0312p0);
        return c0312p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final Context d() {
        return this.f5072q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final B3.a e() {
        return this.f5052A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f() {
        C0312p0 c0312p0 = this.f5078w;
        l(c0312p0);
        c0312p0.o();
        C0284g c0284g = this.f5075t;
        if (c0284g.B()) {
            return 1;
        }
        l(c0312p0);
        c0312p0.o();
        if (!this.f5067P) {
            return 8;
        }
        C0288h0 c0288h0 = this.f5076u;
        j(c0288h0);
        c0288h0.o();
        Boolean boolValueOf = c0288h0.s().contains("measurement_enabled") ? Boolean.valueOf(c0288h0.s().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        s4.e eVar = ((C0323t0) c0284g.f4346r).f5074s;
        Boolean boolA = c0284g.A("firebase_analytics_collection_enabled");
        return boolA != null ? boolA.booleanValue() ? 0 : 4 : (this.f5066O == null || this.f5066O.booleanValue()) ? 0 : 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final s4.e g() {
        return this.f5074s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.f5063L
            if (r0 == 0) goto L96
            O3.p0 r0 = r6.f5078w
            l(r0)
            r0.o()
            java.lang.Boolean r0 = r6.f5064M
            B3.a r1 = r6.f5052A
            if (r0 == 0) goto L34
            long r2 = r6.f5065N
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f5065N
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f5065N = r0
            O3.Y1 r0 = r6.f5080y
            j(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.L(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.L(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f5072q
            C3.b r3 = C3.c.a(r1)
            boolean r3 = r3.b()
            r4 = 1
            if (r3 != 0) goto L74
            O3.g r3 = r6.f5075t
            boolean r3 = r3.r()
            if (r3 != 0) goto L74
            boolean r3 = O3.Y1.e0(r1)
            if (r3 == 0) goto L75
            boolean r1 = O3.Y1.H(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f5064M = r1
            if (r2 == 0) goto L8f
            O3.N r1 = r6.q()
            java.lang.String r1 = r1.v()
            boolean r0 = r0.s(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f5064M = r0
        L8f:
            java.lang.Boolean r0 = r6.f5064M
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0323t0.h():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Q m() {
        return this.f5081z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final P n() {
        k(this.f5058G);
        return this.f5058G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0333w1 o() {
        k(this.f5059H);
        return this.f5059H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0314q p() {
        l(this.f5060I);
        return this.f5060I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final N q() {
        k(this.f5061J);
        return this.f5061J;
    }
}
