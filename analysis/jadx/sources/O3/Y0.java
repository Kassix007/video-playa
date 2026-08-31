package O3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4684q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y0(C0271b1 c0271b1) {
        this.f4684q = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0025, RuntimeException -> 0x0028, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x0002, B:5:0x0016, B:7:0x001c, B:22:0x0046, B:25:0x004d, B:27:0x0060, B:29:0x0068, B:35:0x0078, B:40:0x0085, B:15:0x002b, B:17:0x0032, B:19:0x003e), top: B:49:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.measurement.X r9, android.os.Bundle r10) {
        /*
            r8 = this;
            O3.b1 r1 = r8.f4684q
            java.lang.Object r0 = r1.f4346r     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.X r2 = r0.f5077v     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.V r2 = r2.f4666E     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.b(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r9.f10751s     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L94
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2b
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L23
            goto L2b
        L23:
            r5 = r3
            goto L44
        L25:
            r0 = move-exception
            goto Lb6
        L28:
            r0 = move-exception
            goto La1
        L2b:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L43
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto L23
        L43:
            r5 = r4
        L44:
            if (r5 == 0) goto L94
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4d
            goto L94
        L4d:
            O3.Y1 r3 = r0.f5080y     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.C0323t0.j(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L71
            goto L75
        L71:
            java.lang.String r2 = "auto"
        L73:
            r6 = r2
            goto L78
        L75:
            java.lang.String r2 = "gs"
            goto L73
        L78:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r10 != 0) goto L83
            r2 = 1
        L81:
            r4 = r2
            goto L85
        L83:
            r2 = 0
            goto L81
        L85:
            O3.p0 r0 = r0.f5078w     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            O3.T0 r2 = new O3.T0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r0.x(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto Lb1
        L94:
            java.lang.Object r0 = r1.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
        L98:
            O3.m1 r0 = r0.f5053B
            O3.C0323t0.k(r0)
            r0.w(r9, r10)
            return
        La1:
            java.lang.Object r2 = r1.f4346r     // Catch: java.lang.Throwable -> L25
            O3.t0 r2 = (O3.C0323t0) r2     // Catch: java.lang.Throwable -> L25
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> L25
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L25
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L25
        Lb1:
            java.lang.Object r0 = r1.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            goto L98
        Lb6:
            java.lang.Object r1 = r1.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.m1 r1 = r1.f5053B
            O3.C0323t0.k(r1)
            r1.w(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Y0.a(com.google.android.gms.internal.measurement.X, android.os.Bundle):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(com.google.android.gms.internal.measurement.X x6) {
        C0304m1 c0304m1 = ((C0323t0) this.f4684q.f4346r).f5053B;
        C0323t0.k(c0304m1);
        synchronized (c0304m1.f4964C) {
            try {
                if (Objects.equals(c0304m1.f4969x, x6)) {
                    c0304m1.f4969x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C0323t0) c0304m1.f4346r).f5075t.C()) {
            c0304m1.f4968w.remove(Integer.valueOf(x6.f10749q));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(com.google.android.gms.internal.measurement.X x6) {
        C0323t0 c0323t0 = (C0323t0) this.f4684q.f4346r;
        C0304m1 c0304m1 = c0323t0.f5053B;
        C0323t0.k(c0304m1);
        synchronized (c0304m1.f4964C) {
            c0304m1.f4963B = false;
            c0304m1.f4970y = true;
        }
        C0323t0 c0323t02 = (C0323t0) c0304m1.f4346r;
        c0323t02.f5052A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c0323t02.f5075t.C()) {
            C0295j1 c0295j1T = c0304m1.t(x6);
            c0304m1.f4966u = c0304m1.f4965t;
            c0304m1.f4965t = null;
            C0312p0 c0312p0 = c0323t02.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new RunnableC0266a(c0304m1, c0295j1T, jElapsedRealtime));
        } else {
            c0304m1.f4965t = null;
            C0312p0 c0312p02 = c0323t02.f5078w;
            C0323t0.l(c0312p02);
            c0312p02.x(new RunnableC0334x(c0304m1, jElapsedRealtime));
        }
        E1 e12 = c0323t0.f5079x;
        C0323t0.k(e12);
        C0323t0 c0323t03 = (C0323t0) e12.f4346r;
        c0323t03.f5052A.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C0312p0 c0312p03 = c0323t03.f5078w;
        C0323t0.l(c0312p03);
        c0312p03.x(new A1(e12, jElapsedRealtime2, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(com.google.android.gms.internal.measurement.X x6) {
        C0323t0 c0323t0 = (C0323t0) this.f4684q.f4346r;
        E1 e12 = c0323t0.f5079x;
        C0323t0.k(e12);
        C0323t0 c0323t02 = (C0323t0) e12.f4346r;
        c0323t02.f5052A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0312p0 c0312p0 = c0323t02.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new A1(e12, jElapsedRealtime, 0));
        C0304m1 c0304m1 = c0323t0.f5053B;
        C0323t0.k(c0304m1);
        Object obj = c0304m1.f4964C;
        synchronized (obj) {
            c0304m1.f4963B = true;
            if (!Objects.equals(x6, c0304m1.f4969x)) {
                synchronized (obj) {
                    c0304m1.f4969x = x6;
                    c0304m1.f4970y = false;
                    C0323t0 c0323t03 = (C0323t0) c0304m1.f4346r;
                    if (c0323t03.f5075t.C()) {
                        c0304m1.f4971z = null;
                        C0312p0 c0312p02 = c0323t03.f5078w;
                        C0323t0.l(c0312p02);
                        c0312p02.x(new RunnableC0301l1(c0304m1, 1));
                    }
                }
            }
        }
        C0323t0 c0323t04 = (C0323t0) c0304m1.f4346r;
        if (!c0323t04.f5075t.C()) {
            c0304m1.f4965t = c0304m1.f4971z;
            C0312p0 c0312p03 = c0323t04.f5078w;
            C0323t0.l(c0312p03);
            c0312p03.x(new RunnableC0301l1(c0304m1, 0));
            return;
        }
        c0304m1.x(x6.f10750r, c0304m1.t(x6), false);
        A a7 = ((C0323t0) c0304m1.f4346r).f5055D;
        C0323t0.i(a7);
        C0323t0 c0323t05 = (C0323t0) a7.f4346r;
        c0323t05.f5052A.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C0312p0 c0312p04 = c0323t05.f5078w;
        C0323t0.l(c0312p04);
        c0312p04.x(new RunnableC0334x(a7, jElapsedRealtime2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(com.google.android.gms.internal.measurement.X x6, Bundle bundle) {
        C0295j1 c0295j1;
        C0304m1 c0304m1 = ((C0323t0) this.f4684q.f4346r).f5053B;
        C0323t0.k(c0304m1);
        if (!((C0323t0) c0304m1.f4346r).f5075t.C() || bundle == null || (c0295j1 = (C0295j1) c0304m1.f4968w.get(Integer.valueOf(x6.f10749q))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c0295j1.f4927c);
        bundle2.putString("name", c0295j1.f4925a);
        bundle2.putString("referrer_name", c0295j1.f4926b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(com.google.android.gms.internal.measurement.X.W(activity), bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.X.W(activity));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(com.google.android.gms.internal.measurement.X.W(activity));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.X.W(activity));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(com.google.android.gms.internal.measurement.X.W(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
