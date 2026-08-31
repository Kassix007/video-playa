package O3;

import B0.C0050o;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.Y3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0271b1 extends H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4747A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public P0 f4748B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public P0 f4749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PriorityQueue f4750D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f4751E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public J0 f4752F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final AtomicLong f4753G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f4754H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0317r0 f4755I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f4756J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public P0 f4757K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferencesOnSharedPreferenceChangeListenerC0268a1 f4758L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public P0 f4759M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final k3.c f4760N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Y0 f4761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public L0 f4762u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f4763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference f4765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f4766y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4767z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0271b1(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4763v = new CopyOnWriteArraySet();
        this.f4766y = new Object();
        this.f4767z = false;
        this.f4747A = 1;
        this.f4756J = true;
        this.f4760N = new k3.c(this);
        this.f4765x = new AtomicReference();
        this.f4752F = J0.f4496c;
        this.f4754H = -1L;
        this.f4753G = new AtomicLong(0L);
        this.f4755I = new C0317r0(c0323t0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        o();
        p();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (c0323t0.h()) {
            C0284g c0284g = c0323t0.f5075t;
            ((C0323t0) c0284g.f4346r).getClass();
            Boolean boolA = c0284g.A("google_analytics_deferred_deep_link_enabled");
            if (boolA != null && boolA.booleanValue()) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4665D.b("Deferred Deep Link feature enabled.");
                C0312p0 c0312p0 = c0323t0.f5078w;
                C0323t0.l(c0312p0);
                c0312p0.x(new O0(this, 2));
            }
            C0333w1 c0333w1O = c0323t0.o();
            c0333w1O.o();
            c0333w1O.p();
            a2 a2VarE = c0333w1O.E(true);
            c0333w1O.A();
            C0323t0 c0323t02 = (C0323t0) c0333w1O.f4346r;
            c0323t02.f5075t.y(null, F.f4420c1);
            c0323t02.n().v(3, new byte[0]);
            c0333w1O.C(new RunnableC0318r1(c0333w1O, a2VarE, 1));
            this.f4756J = false;
            C0288h0 c0288h0 = c0323t0.f5076u;
            C0323t0.j(c0288h0);
            c0288h0.o();
            String string = c0288h0.s().getString("previous_os_version", null);
            ((C0323t0) c0288h0.f4346r).p().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c0288h0.s().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c0323t0.p().q();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            v("auto", "_ou", bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(Bundle bundle, long j) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        AbstractC1887A.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4673z.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        K0.e(bundle2, "app_id", String.class, null);
        K0.e(bundle2, FirebaseAnalytics.Param.ORIGIN, String.class, null);
        K0.e(bundle2, "name", String.class, null);
        K0.e(bundle2, FirebaseAnalytics.Param.VALUE, Object.class, null);
        K0.e(bundle2, "trigger_event_name", String.class, null);
        K0.e(bundle2, "trigger_timeout", Long.class, 0L);
        K0.e(bundle2, "timed_out_event_name", String.class, null);
        K0.e(bundle2, "timed_out_event_params", Bundle.class, null);
        K0.e(bundle2, "triggered_event_name", String.class, null);
        K0.e(bundle2, "triggered_event_params", Bundle.class, null);
        K0.e(bundle2, "time_to_live", Long.class, 0L);
        K0.e(bundle2, "expired_event_name", String.class, null);
        K0.e(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1887A.d(bundle2.getString("name"));
        AbstractC1887A.d(bundle2.getString(FirebaseAnalytics.Param.ORIGIN));
        AbstractC1887A.g(bundle2.get(FirebaseAnalytics.Param.VALUE));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(FirebaseAnalytics.Param.VALUE);
        Y1 y12 = c0323t0.f5080y;
        Q q7 = c0323t0.f5081z;
        X x7 = c0323t0.f5077v;
        C0323t0.j(y12);
        if (y12.t0(string) != 0) {
            C0323t0.l(x7);
            x7.f4670w.c(q7.c(string), "Invalid conditional user property name");
            return;
        }
        C0323t0.j(y12);
        if (y12.B(obj, string) != 0) {
            C0323t0.l(x7);
            x7.f4670w.d(q7.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objC = y12.C(obj, string);
        if (objC == null) {
            C0323t0.l(x7);
            x7.f4670w.d(q7.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        K0.d(bundle2, objC);
        long j7 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j7 > 15552000000L || j7 < 1)) {
            C0323t0.l(x7);
            x7.f4670w.d(q7.c(string), Long.valueOf(j7), "Invalid conditional user property timeout");
            return;
        }
        long j8 = bundle2.getLong("time_to_live");
        if (j8 > 15552000000L || j8 < 1) {
            C0323t0.l(x7);
            x7.f4670w.d(q7.c(string), Long.valueOf(j8), "Invalid conditional user property time to live");
        } else {
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new W0(this, bundle2, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(String str, String str2, Bundle bundle) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        c0323t0.f5052A.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC1887A.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new W0(this, bundle2, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(J0 j02, long j, boolean z5) {
        int i = j02.f4498b;
        o();
        p();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        X x6 = c0323t0.f5077v;
        C0323t0.j(c0288h0);
        J0 j0V = c0288h0.v();
        if (j <= this.f4754H && J0.l(j0V.f4498b, i)) {
            C0323t0.l(x6);
            x6.f4664C.c(j02, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C0288h0 c0288h02 = c0323t0.f5076u;
        C0323t0.j(c0288h02);
        c0288h02.o();
        if (!J0.l(i, c0288h02.s().getInt("consent_source", 100))) {
            C0323t0.l(x6);
            x6.f4664C.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c0288h02.s().edit();
        editorEdit.putString("consent_settings", j02.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        C0323t0.l(x6);
        x6.f4666E.c(j02, "Setting storage consent(FE)");
        this.f4754H = j;
        if (c0323t0.o().y()) {
            C0333w1 c0333w1O = c0323t0.o();
            c0333w1O.o();
            c0333w1O.p();
            c0333w1O.C(new RunnableC0327u1(c0333w1O, 2));
        } else {
            C0333w1 c0333w1O2 = c0323t0.o();
            c0333w1O2.o();
            c0333w1O2.p();
            if (c0333w1O2.x()) {
                c0333w1O2.C(new RunnableC0318r1(c0333w1O2, c0333w1O2.E(false)));
            }
        }
        if (z5) {
            c0323t0.o().s(new AtomicReference());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(Boolean bool, boolean z5) {
        o();
        p();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4665D.c(bool, "Setting app measurement enabled (FE)");
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        c0288h0.o();
        SharedPreferences.Editor editorEdit = c0288h0.s().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z5) {
            c0288h0.o();
            SharedPreferences.Editor editorEdit2 = c0288h0.s().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.o();
        if (c0323t0.f5067P || !(bool == null || bool.booleanValue())) {
            F();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F() {
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        X x6 = c0323t0.f5077v;
        B3.a aVar = c0323t0.f5052A;
        C0323t0.j(c0288h0);
        String strE = c0288h0.f4880D.e();
        if (strE != null) {
            if ("unset".equals(strE)) {
                aVar.getClass();
                z(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strE) ? 0L : 1L);
                aVar.getClass();
                z(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c0323t0.a() || !this.f4756J) {
            C0323t0.l(x6);
            x6.f4665D.b("Updating Scion state (FE)");
            C0333w1 c0333w1O = c0323t0.o();
            c0333w1O.o();
            c0333w1O.p();
            c0333w1O.C(new RunnableC0318r1(c0333w1O, c0333w1O.E(true), 3));
            return;
        }
        C0323t0.l(x6);
        x6.f4665D.b("Recording app launch after enabling measurement for the first time (FE)");
        A();
        E1 e12 = c0323t0.f5079x;
        C0323t0.k(e12);
        e12.f4359v.t();
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new O0(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (!(c0323t0.f5072q.getApplicationContext() instanceof Application) || this.f4761t == null) {
            return;
        }
        ((Application) c0323t0.f5072q.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f4761t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        G0 g02;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        p();
        J0 j02 = J0.f4496c;
        I0[] i0Arr = H0.STORAGE.f4485q;
        int length = i0Arr.length;
        int i7 = 0;
        while (true) {
            bool = null;
            if (i7 >= length) {
                string = null;
                break;
            }
            String str = i0Arr[i7].f4492q;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i7++;
        }
        if (string != null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4663B.c(string, "Ignoring invalid consent setting");
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4663B.b("Valid consent values are 'granted', 'denied'");
        }
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        boolean zU = c0312p0.u();
        J0 j0B = J0.b(i, bundle);
        Iterator it = j0B.f4497a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g02 = G0.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((G0) it.next()) != g02) {
                J(j0B, zU);
                break;
            }
        }
        C0311p c0311pC = C0311p.c(i, bundle);
        Iterator it2 = c0311pC.f5009e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((G0) it2.next()) != g02) {
                I(c0311pC, zU);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = J0.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zU) {
                z(j, bool.toString(), str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS);
            } else {
                y(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, bool.toString(), false, j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(C0311p c0311p, boolean z5) {
        I4.a aVar = new I4.a(9, (Object) this, (Object) c0311p, false);
        if (z5) {
            o();
            aVar.run();
        } else {
            C0312p0 c0312p0 = ((C0323t0) this.f4346r).f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:70:0x0116) to fix multi-entry loop: BACK_EDGE: B:70:0x0116 -> B:67:0x0113 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void J(O3.J0 r14, boolean r15) {
        /*
            r13 = this;
            r13.p()
            int r0 = r14.f4498b
            r1 = -10
            if (r0 == r1) goto L3c
            java.util.EnumMap r2 = r14.f4497a
            O3.I0 r3 = O3.I0.AD_STORAGE
            java.lang.Object r2 = r2.get(r3)
            O3.G0 r2 = (O3.G0) r2
            if (r2 != 0) goto L17
            O3.G0 r2 = O3.G0.UNINITIALIZED
        L17:
            O3.G0 r3 = O3.G0.UNINITIALIZED
            if (r2 != r3) goto L3c
            java.util.EnumMap r2 = r14.f4497a
            O3.I0 r4 = O3.I0.ANALYTICS_STORAGE
            java.lang.Object r2 = r2.get(r4)
            O3.G0 r2 = (O3.G0) r2
            if (r2 != 0) goto L28
            r2 = r3
        L28:
            if (r2 == r3) goto L2b
            goto L3c
        L2b:
            java.lang.Object r14 = r13.f4346r
            O3.t0 r14 = (O3.C0323t0) r14
            O3.X r14 = r14.f5077v
            O3.C0323t0.l(r14)
            O3.V r14 = r14.f4663B
            java.lang.String r15 = "Ignoring empty consent settings"
            r14.b(r15)
            return
        L3c:
            java.lang.Object r2 = r13.f4766y
            monitor-enter(r2)
            O3.J0 r3 = r13.f4752F     // Catch: java.lang.Throwable -> L111
            int r3 = r3.f4498b     // Catch: java.lang.Throwable -> L111
            boolean r3 = O3.J0.l(r0, r3)     // Catch: java.lang.Throwable -> L111
            r4 = 0
            if (r3 == 0) goto L9e
            O3.J0 r3 = r13.f4752F     // Catch: java.lang.Throwable -> L8d
            java.util.EnumMap r5 = r14.f4497a     // Catch: java.lang.Throwable -> L8d
            java.util.Set r6 = r5.keySet()     // Catch: java.lang.Throwable -> L8d
            O3.I0[] r7 = new O3.I0[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch: java.lang.Throwable -> L8d
            O3.I0[] r6 = (O3.I0[]) r6     // Catch: java.lang.Throwable -> L8d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L8d
            r8 = r4
        L5c:
            r9 = 1
            if (r8 >= r7) goto L7a
            r10 = r6[r8]     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r11 = r5.get(r10)     // Catch: java.lang.Throwable -> L8d
            O3.G0 r11 = (O3.G0) r11     // Catch: java.lang.Throwable -> L8d
            java.util.EnumMap r12 = r3.f4497a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r10 = r12.get(r10)     // Catch: java.lang.Throwable -> L8d
            O3.G0 r10 = (O3.G0) r10     // Catch: java.lang.Throwable -> L8d
            O3.G0 r12 = O3.G0.DENIED     // Catch: java.lang.Throwable -> L8d
            if (r11 != r12) goto L77
            if (r10 == r12) goto L77
            r3 = r9
            goto L7b
        L77:
            int r8 = r8 + 1
            goto L5c
        L7a:
            r3 = r4
        L7b:
            O3.I0 r5 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L8d
            boolean r6 = r14.i(r5)     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L92
            O3.J0 r6 = r13.f4752F     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r6.i(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L92
            r4 = r9
            goto L92
        L8d:
            r0 = move-exception
            r14 = r0
            r4 = r13
            goto L114
        L92:
            O3.J0 r5 = r13.f4752F     // Catch: java.lang.Throwable -> L8d
            O3.J0 r14 = r14.k(r5)     // Catch: java.lang.Throwable -> L8d
            r13.f4752F = r14     // Catch: java.lang.Throwable -> L8d
            r8 = r4
            r4 = r9
        L9c:
            r5 = r14
            goto La1
        L9e:
            r3 = r4
            r8 = r3
            goto L9c
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto Lb5
            java.lang.Object r14 = r13.f4346r
            O3.t0 r14 = (O3.C0323t0) r14
            O3.X r14 = r14.f5077v
            O3.C0323t0.l(r14)
            O3.V r14 = r14.f4664C
            java.lang.String r15 = "Ignoring lower-priority consent settings, proposed settings"
            r14.c(r5, r15)
            return
        Lb5:
            java.util.concurrent.atomic.AtomicLong r14 = r13.f4753G
            long r6 = r14.getAndIncrement()
            if (r3 == 0) goto Le0
            java.util.concurrent.atomic.AtomicReference r14 = r13.f4765x
            r0 = 0
            r14.set(r0)
            O3.X0 r3 = new O3.X0
            r9 = 0
            r4 = r13
            r3.<init>(r4, r5, r6, r8, r9)
            if (r15 == 0) goto Ld3
            r13.o()
            r3.run()
            return
        Ld3:
            java.lang.Object r14 = r4.f4346r
            O3.t0 r14 = (O3.C0323t0) r14
            O3.p0 r14 = r14.f5078w
            O3.C0323t0.l(r14)
            r14.z(r3)
            return
        Le0:
            r4 = r13
            O3.X0 r3 = new O3.X0
            r9 = 1
            r3.<init>(r4, r5, r6, r8, r9)
            if (r15 == 0) goto Lf0
            r13.o()
            r3.run()
            return
        Lf0:
            r14 = 30
            if (r0 == r14) goto L104
            if (r0 != r1) goto Lf7
            goto L104
        Lf7:
            java.lang.Object r14 = r4.f4346r
            O3.t0 r14 = (O3.C0323t0) r14
            O3.p0 r14 = r14.f5078w
            O3.C0323t0.l(r14)
            r14.x(r3)
            return
        L104:
            java.lang.Object r14 = r4.f4346r
            O3.t0 r14 = (O3.C0323t0) r14
            O3.p0 r14 = r14.f5078w
            O3.C0323t0.l(r14)
            r14.z(r3)
            return
        L111:
            r0 = move-exception
            r4 = r13
        L113:
            r14 = r0
        L114:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L116
            throw r14
        L116:
            r0 = move-exception
            goto L113
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0271b1.J(O3.J0, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K() {
        Y3.a();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        C0312p0 c0312p0 = c0323t0.f5078w;
        X x6 = c0323t0.f5077v;
        if (c0284g.y(null, F.f4394Q0)) {
            C0323t0.l(c0312p0);
            if (c0312p0.u()) {
                C0323t0.l(x6);
                x6.f4670w.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (s4.e.i()) {
                C0323t0.l(x6);
                x6.f4670w.b("Cannot get trigger URIs from main thread");
                return;
            }
            p();
            C0323t0.l(x6);
            x6.f4666E.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C0323t0.l(c0312p0);
            c0312p0.y(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "get trigger URIs", new V0(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                C0323t0.l(x6);
                x6.f4672y.b("Timed out waiting for get trigger URIs");
            } else {
                C0323t0.l(c0312p0);
                c0312p0.x(new I4.a(11, this, list));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final PriorityQueue L() {
        if (this.f4750D == null) {
            this.f4750D = new PriorityQueue(Comparator.comparing(Z0.f4693a, I2.A.f2332b));
        }
        return this.f4750D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void M() {
        I1 i12;
        o();
        this.f4751E = false;
        if (L().isEmpty() || this.f4767z || (i12 = (I1) L().poll()) == null) {
            return;
        }
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        Y1 y12 = c0323t0.f5080y;
        C0323t0.j(y12);
        Z1.d dVarI = y12.I();
        if (dVarI != null) {
            this.f4767z = true;
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            V v6 = x6.f4666E;
            String str = i12.f4493q;
            v6.c(str, "Registering trigger URI");
            I4.b bVarE = dVarI.e(Uri.parse(str));
            if (bVarE != null) {
                bVarE.addListener(new I4.a((int) (0 == true ? 1 : 0), (Object) bVarE, (Object) new C0050o(this, i12, false)), new Q0(0, this));
            } else {
                this.f4767z = false;
                L().add(i12);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(J0 j02) {
        o();
        boolean z5 = (j02.i(I0.ANALYTICS_STORAGE) && j02.i(I0.AD_STORAGE)) || ((C0323t0) this.f4346r).o().x();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.o();
        if (z5 != c0323t0.f5067P) {
            C0312p0 c0312p02 = c0323t0.f5078w;
            C0323t0.l(c0312p02);
            c0312p02.o();
            c0323t0.f5067P = z5;
            C0288h0 c0288h0 = ((C0323t0) this.f4346r).f5076u;
            C0323t0.j(c0288h0);
            c0288h0.o();
            Boolean boolValueOf = c0288h0.s().contains("measurement_enabled_from_api") ? Boolean.valueOf(c0288h0.s().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z5 || boolValueOf == null || boolValueOf.booleanValue()) {
                E(Boolean.valueOf(z5), false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            r12 = this;
            if (r15 != 0) goto L8
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L9
        L8:
            r0 = r15
        L9:
            java.lang.String r1 = "screen_view"
            boolean r1 = java.util.Objects.equals(r14, r1)
            r2 = 0
            if (r1 == 0) goto L144
            java.lang.Object r13 = r12.f4346r
            O3.t0 r13 = (O3.C0323t0) r13
            O3.m1 r13 = r13.f5053B
            O3.C0323t0.k(r13)
            java.lang.Object r1 = r13.f4964C
            monitor-enter(r1)
            boolean r3 = r13.f4963B     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L38
            java.lang.Object r13 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r13 = (O3.C0323t0) r13     // Catch: java.lang.Throwable -> L34
            O3.X r13 = r13.f5077v     // Catch: java.lang.Throwable -> L34
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> L34
            O3.V r13 = r13.f4663B     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "Cannot log screen view event when the app is in the background."
            r13.b(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            r13 = r0
            goto L142
        L38:
            java.lang.String r3 = "screen_name"
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> L34
            r3 = 500(0x1f4, float:7.0E-43)
            if (r5 == 0) goto L71
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L57
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r6 = (O3.C0323t0) r6     // Catch: java.lang.Throwable -> L34
            O3.g r6 = r6.f5075t     // Catch: java.lang.Throwable -> L34
            r6.getClass()     // Catch: java.lang.Throwable -> L34
            if (r4 <= r3) goto L71
        L57:
            java.lang.Object r13 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r13 = (O3.C0323t0) r13     // Catch: java.lang.Throwable -> L34
            O3.X r13 = r13.f5077v     // Catch: java.lang.Throwable -> L34
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> L34
            O3.V r13 = r13.f4663B     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "Invalid screen name length for screen view. Length"
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            r13.c(r2, r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return
        L71:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto La8
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L34
            if (r6 <= 0) goto L8e
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r7 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r7 = (O3.C0323t0) r7     // Catch: java.lang.Throwable -> L34
            O3.g r7 = r7.f5075t     // Catch: java.lang.Throwable -> L34
            r7.getClass()     // Catch: java.lang.Throwable -> L34
            if (r6 <= r3) goto La8
        L8e:
            java.lang.Object r13 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r13 = (O3.C0323t0) r13     // Catch: java.lang.Throwable -> L34
            O3.X r13 = r13.f5077v     // Catch: java.lang.Throwable -> L34
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> L34
            O3.V r13 = r13.f4663B     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "Invalid screen class length for screen view. Length"
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            r13.c(r2, r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return
        La8:
            if (r4 != 0) goto Lb4
            com.google.android.gms.internal.measurement.X r3 = r13.f4969x     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto Lb6
            java.lang.String r3 = r3.f10750r     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r13.v(r3)     // Catch: java.lang.Throwable -> L34
        Lb4:
            r6 = r4
            goto Lb9
        Lb6:
            java.lang.String r4 = "Activity"
            goto Lb4
        Lb9:
            O3.j1 r3 = r13.f4965t     // Catch: java.lang.Throwable -> L34
            boolean r4 = r13.f4970y     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto Le5
            if (r3 == 0) goto Le5
            r13.f4970y = r2     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r3.f4926b     // Catch: java.lang.Throwable -> L34
            boolean r2 = java.util.Objects.equals(r2, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r3.f4925a     // Catch: java.lang.Throwable -> L34
            boolean r3 = java.util.Objects.equals(r3, r5)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto Le5
            if (r3 == 0) goto Le5
            java.lang.Object r13 = r13.f4346r     // Catch: java.lang.Throwable -> L34
            O3.t0 r13 = (O3.C0323t0) r13     // Catch: java.lang.Throwable -> L34
            O3.X r13 = r13.f5077v     // Catch: java.lang.Throwable -> L34
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> L34
            O3.V r13 = r13.f4663B     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "Ignoring call to log screen view event with duplicate parameters."
            r13.b(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return
        Le5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r13.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.X r2 = r1.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4666E
            if (r5 != 0) goto Lf6
            java.lang.String r3 = "null"
            goto Lf7
        Lf6:
            r3 = r5
        Lf7:
            if (r6 != 0) goto Lfc
            java.lang.String r4 = "null"
            goto Lfd
        Lfc:
            r4 = r6
        Lfd:
            java.lang.String r7 = "Logging screen view with name, class"
            r2.d(r3, r4, r7)
            O3.j1 r2 = r13.f4965t
            if (r2 != 0) goto L109
            O3.j1 r2 = r13.f4966u
            goto L10b
        L109:
            O3.j1 r2 = r13.f4965t
        L10b:
            O3.j1 r4 = new O3.j1
            O3.Y1 r3 = r1.f5080y
            O3.C0323t0.j(r3)
            long r7 = r3.k0()
            r9 = 1
            r10 = r18
            r4.<init>(r5, r6, r7, r9, r10)
            r13.f4965t = r4
            r13.f4966u = r2
            r13.f4971z = r4
            B3.a r3 = r1.f5052A
            r3.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            O3.p0 r1 = r1.f5078w
            O3.C0323t0.l(r1)
            O3.w0 r3 = new O3.w0
            r14 = r13
            r15 = r0
            r17 = r2
            r13 = r3
            r16 = r4
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r1.x(r13)
            return
        L142:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r13
        L144:
            r1 = 1
            if (r17 == 0) goto L151
            O3.L0 r3 = r12.f4762u
            if (r3 == 0) goto L151
            boolean r3 = O3.Y1.M(r14)
            if (r3 == 0) goto L153
        L151:
            r10 = r1
            goto L154
        L153:
            r10 = r2
        L154:
            if (r13 != 0) goto L158
            java.lang.String r13 = "app"
        L158:
            r4 = r13
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r0)
            java.util.Set r13 = r8.keySet()
            java.util.Iterator r13 = r13.iterator()
        L166:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L1c3
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.get(r0)
            boolean r3 = r1 instanceof android.os.Bundle
            if (r3 == 0) goto L185
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r3.<init>(r1)
            r8.putBundle(r0, r3)
            goto L166
        L185:
            boolean r0 = r1 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L1a1
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            r0 = r2
        L18c:
            int r3 = r1.length
            if (r0 >= r3) goto L166
            r3 = r1[r0]
            boolean r6 = r3 instanceof android.os.Bundle
            if (r6 == 0) goto L19e
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r3 = (android.os.Bundle) r3
            r6.<init>(r3)
            r1[r0] = r6
        L19e:
            int r0 = r0 + 1
            goto L18c
        L1a1:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L166
            java.util.List r1 = (java.util.List) r1
            r0 = r2
        L1a8:
            int r3 = r1.size()
            if (r0 >= r3) goto L166
            java.lang.Object r3 = r1.get(r0)
            boolean r6 = r3 instanceof android.os.Bundle
            if (r6 == 0) goto L1c0
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r3 = (android.os.Bundle) r3
            r6.<init>(r3)
            r1.set(r0, r6)
        L1c0:
            int r0 = r0 + 1
            goto L1a8
        L1c3:
            java.lang.Object r13 = r12.f4346r
            O3.t0 r13 = (O3.C0323t0) r13
            O3.p0 r13 = r13.f5078w
            O3.C0323t0.l(r13)
            O3.U0 r2 = new O3.U0
            r3 = r12
            r5 = r14
            r11 = r16
            r9 = r17
            r6 = r18
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11)
            r13.x(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0271b1.t(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        X x6;
        String str;
        int i;
        int i7;
        int i8;
        int i9;
        F1 f12;
        F1 f13;
        C0271b1 c0271b1;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        com.google.android.gms.internal.measurement.X1 x12;
        H4.m mVarC;
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X x7 = c0323t0.f5077v;
        B3.a aVar = c0323t0.f5052A;
        C0323t0.l(x7);
        x7.f4665D.b("Handle tcf update.");
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        SharedPreferences sharedPreferencesT = c0288h0.t();
        HashMap map = new HashMap();
        E e7 = F.f4411Z0;
        int i17 = 1;
        if (((Boolean) e7.a(null)).booleanValue()) {
            H4.h hVar = H1.f4486a;
            com.google.android.gms.internal.measurement.W1 w12 = com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            x6 = x7;
            G1 g12 = G1.f4478q;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(w12, g12);
            com.google.android.gms.internal.measurement.W1 w13 = com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            G1 g13 = G1.f4479r;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(w13, g13);
            com.google.android.gms.internal.measurement.W1 w14 = com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(w14, g12);
            com.google.android.gms.internal.measurement.W1 w15 = com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(w15, g12);
            com.google.android.gms.internal.measurement.W1 w16 = com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(w16, g13), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, g13), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, g13));
            E.Y y6 = new E.Y(listAsList instanceof Collection ? listAsList.size() : 4, 2);
            y6.q(listAsList);
            H4.m mVarC2 = y6.c();
            int i18 = H4.f.f2178s;
            H4.o oVar = new H4.o("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesT.contains("IABTCF_TCString");
            try {
                i10 = sharedPreferencesT.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i10 = -1;
            }
            try {
                i11 = sharedPreferencesT.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i11 = -1;
            }
            try {
                i12 = sharedPreferencesT.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i12 = -1;
            }
            int i19 = i11;
            try {
                i13 = sharedPreferencesT.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i13 = -1;
            }
            try {
                i14 = sharedPreferencesT.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i14 = -1;
            }
            String strA = H1.a(sharedPreferencesT, "IABTCF_PublisherCC");
            int i20 = i10;
            E.Y y7 = new E.Y(4, 2);
            H4.k kVar = mVarC2.f2196r;
            if (kVar == null) {
                i15 = i13;
                i16 = i14;
                H4.k kVar2 = new H4.k(mVarC2, new H4.l(mVarC2.f2199u, 0, mVarC2.f2200v));
                mVarC2.f2196r = kVar2;
                kVar = kVar2;
            } else {
                i15 = i13;
                i16 = i14;
            }
            H4.p pVarO = kVar.iterator();
            while (true) {
                boolean zHasNext = pVarO.hasNext();
                x12 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_UNDEFINED;
                if (!zHasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.W1 w17 = (com.google.android.gms.internal.measurement.W1) pVarO.next();
                int iZza = w17.zza();
                H4.p pVar = pVarO;
                H4.m mVar = mVarC2;
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strA2 = H1.a(sharedPreferencesT, sb.toString());
                if (!TextUtils.isEmpty(strA2) && strA2.length() >= 755) {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    com.google.android.gms.internal.measurement.X1 x13 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.X1.values().length || iDigit == 0) {
                        x12 = x13;
                    } else if (iDigit == i17) {
                        x12 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (iDigit == 2) {
                        x12 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                y7.p(w17, x12);
                pVarO = pVar;
                mVarC2 = mVar;
                i17 = 1;
            }
            H4.m mVar2 = mVarC2;
            H4.m mVarC3 = y7.c();
            String strA3 = H1.a(sharedPreferencesT, "IABTCF_PurposeConsents");
            String strA4 = H1.a(sharedPreferencesT, "IABTCF_VendorConsents");
            boolean z5 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = H1.a(sharedPreferencesT, "IABTCF_PurposeLegitimateInterests");
            String strA6 = H1.a(sharedPreferencesT, "IABTCF_VendorLegitimateInterests");
            boolean z6 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (!((Boolean) F.f4414a1.a(null)).booleanValue() || zContains) {
                com.google.android.gms.internal.measurement.X1 x14 = (com.google.android.gms.internal.measurement.X1) mVarC3.get(w12);
                com.google.android.gms.internal.measurement.X1 x15 = (com.google.android.gms.internal.measurement.X1) mVarC3.get(w14);
                com.google.android.gms.internal.measurement.X1 x16 = (com.google.android.gms.internal.measurement.X1) mVarC3.get(w15);
                com.google.android.gms.internal.measurement.X1 x17 = (com.google.android.gms.internal.measurement.X1) mVarC3.get(w16);
                E.Y y8 = new E.Y(4, 2);
                y8.p("Version", "2");
                boolean z7 = z5;
                y8.p("VendorConsent", true != z5 ? "0" : "1");
                y8.p("VendorLegitimateInterest", true != z6 ? "0" : "1");
                y8.p("gdprApplies", i12 != 1 ? "0" : "1");
                int i21 = i16;
                y8.p("EnableAdvertiserConsentMode", i21 != 1 ? "0" : "1");
                y8.p("PolicyVersion", String.valueOf(i19));
                y8.p("CmpSdkID", String.valueOf(i20));
                int i22 = i15;
                y8.p("PurposeOneTreatment", i22 != 1 ? "0" : "1");
                y8.p("PublisherCC", strA);
                y8.p("PublisherRestrictions1", String.valueOf(x14 != null ? x14.zza() : x12.zza()));
                y8.p("PublisherRestrictions3", String.valueOf(x15 != null ? x15.zza() : x12.zza()));
                y8.p("PublisherRestrictions4", String.valueOf(x16 != null ? x16.zza() : x12.zza()));
                y8.p("PublisherRestrictions7", String.valueOf(x17 != null ? x17.zza() : x12.zza()));
                String strD = H1.d(w12, strA3, strA5);
                String strD2 = H1.d(w14, strA3, strA5);
                String strD3 = H1.d(w15, strA3, strA5);
                String strD4 = H1.d(w16, strA3, strA5);
                l6.d.j("Purpose1", strD);
                l6.d.j("Purpose3", strD2);
                l6.d.j("Purpose4", strD3);
                l6.d.j("Purpose7", strD4);
                y8.q(H4.m.a(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                boolean z8 = z6;
                int i23 = i12;
                y8.q(H4.m.a(5, new Object[]{"AuthorizePurpose1", true != H1.b(w12, mVar2, mVarC3, oVar, cArr, i21, i23, i22, strA, strA3, strA5, z7, z8) ? "0" : "1", "AuthorizePurpose3", true != H1.b(w14, mVar2, mVarC3, oVar, cArr, i21, i23, i22, strA, strA3, strA5, z7, z8) ? "0" : "1", "AuthorizePurpose4", true != H1.b(w15, mVar2, mVarC3, oVar, cArr, i21, i23, i22, strA, strA3, strA5, z7, z8) ? "0" : "1", "AuthorizePurpose7", true != H1.b(w16, mVar2, mVarC3, oVar, cArr, i21, i23, i22, strA, strA3, strA5, z7, z8) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                mVarC = y8.c();
            } else {
                mVarC = H4.m.f2194w;
            }
            f12 = new F1(mVarC);
            str = "";
        } else {
            x6 = x7;
            String strA7 = H1.a(sharedPreferencesT, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i = sharedPreferencesT.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i7 = sharedPreferencesT.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i7 = -1;
            }
            if (i7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i7));
            }
            try {
                i8 = sharedPreferencesT.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i8 = -1;
            }
            if (i8 != -1) {
                map.put("PolicyVersion", String.valueOf(i8));
            }
            String strA8 = H1.a(sharedPreferencesT, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i9 = sharedPreferencesT.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i9 = -1;
            }
            if (i9 != -1) {
                map.put("CmpSdkID", String.valueOf(i9));
            }
            f12 = new F1(map);
        }
        C0323t0.l(x6);
        X x8 = x6;
        V v6 = x8.f4666E;
        v6.c(f12, "Tcf preferences read");
        if (!c0323t0.f5075t.y(null, e7)) {
            if (c0288h0.w(f12)) {
                Bundle bundleB = f12.b();
                C0323t0.l(x8);
                v6.c(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    H(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", f12.c());
                v("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        c0288h0.o();
        String string = c0288h0.s().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            f13 = new F1(map2);
        } else {
            for (String str2 : string.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length >= 2 && H1.f4486a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            f13 = new F1(map2);
        }
        if (c0288h0.w(f12)) {
            Bundle bundleB2 = f12.b();
            C0323t0.l(x8);
            v6.c(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                c0271b1 = this;
                c0271b1.H(bundleB2, -30, System.currentTimeMillis());
            } else {
                c0271b1 = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = f13.f4471a;
            String str3 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = f12.b();
            Bundle bundleB4 = f13.b();
            bundle2.putString("_tcfm", str3.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str4 = (String) f12.f4471a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str4)) {
                str4 = "200000";
            }
            bundle2.putString("_tcfd2", str4);
            bundle2.putString("_tcfd", f12.c());
            c0271b1.v("auto", "_tcf", bundle2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(String str, String str2, Bundle bundle) {
        o();
        ((C0323t0) this.f4346r).f5052A.getClass();
        w(str, str2, bundle, System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(String str, String str2, Bundle bundle, long j) {
        o();
        boolean z5 = true;
        if (this.f4762u != null && !Y1.M(str2)) {
            z5 = false;
        }
        x(str, str2, j, bundle, true, z5, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36) {
        /*
            r28 = this;
            r1 = r28
            r7 = r29
            r8 = r30
            r9 = r33
            r10 = r36
            x3.AbstractC1887A.d(r7)
            x3.AbstractC1887A.g(r9)
            r1.o()
            r1.p()
            java.lang.Object r0 = r1.f4346r
            r11 = r0
            O3.t0 r11 = (O3.C0323t0) r11
            boolean r0 = r11.a()
            O3.E1 r12 = r11.f5079x
            O3.g r13 = r11.f5075t
            android.content.Context r2 = r11.f5072q
            O3.Y1 r14 = r11.f5080y
            O3.X r15 = r11.f5077v
            if (r0 == 0) goto L4ca
            O3.N r0 = r11.q()
            java.util.List r0 = r0.f4520B
            if (r0 == 0) goto L45
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L3a
            goto L45
        L3a:
            O3.C0323t0.l(r15)
            O3.V r0 = r15.f4665D
            java.lang.String r2 = "Dropping non-safelisted event. event name, origin"
            r0.d(r8, r7, r2)
            return
        L45:
            boolean r0 = r1.f4764w
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L8a
            r1.f4764w = r4
            boolean r0 = r11.f5073r     // Catch: java.lang.ClassNotFoundException -> L80
            java.lang.String r5 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L5c
            java.lang.ClassLoader r0 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L80
            java.lang.Class r0 = java.lang.Class.forName(r5, r4, r0)     // Catch: java.lang.ClassNotFoundException -> L80
            goto L60
        L5c:
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L80
        L60:
            java.lang.String r5 = "initialize"
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Exception -> L74
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L74
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L74
            r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L74
            goto L8a
        L74:
            r0 = move-exception
            O3.C0323t0.l(r15)     // Catch: java.lang.ClassNotFoundException -> L80
            O3.V r2 = r15.f4673z     // Catch: java.lang.ClassNotFoundException -> L80
            java.lang.String r5 = "Failed to invoke Tag Manager's initialize() method"
            r2.c(r0, r5)     // Catch: java.lang.ClassNotFoundException -> L80
            goto L8a
        L80:
            O3.C0323t0.l(r15)
            O3.V r0 = r15.f4664C
            java.lang.String r2 = "Tag Manager is not found and thus will not be used"
            r0.b(r2)
        L8a:
            O3.Q r0 = r11.f5081z
            O3.h0 r2 = r11.f5076u
            B3.a r5 = r11.f5052A
            O3.E r6 = O3.F.f4431g1
            boolean r6 = r13.y(r3, r6)
            if (r6 != 0) goto Lcb
            java.lang.String r6 = "_cmp"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto Lcb
            java.lang.String r6 = "gclid"
            boolean r16 = r9.containsKey(r6)
            if (r16 == 0) goto Lcb
            java.lang.String r6 = r9.getString(r6)
            r5.getClass()
            r16 = r2
            r17 = r3
            long r2 = java.lang.System.currentTimeMillis()
            r18 = r5
            java.lang.String r5 = "auto"
            r19 = r4
            r4 = r6
            java.lang.String r6 = "_lgclid"
            r17 = r16
            r16 = r13
            r13 = r19
            r1.z(r2, r4, r5, r6)
            r6 = r1
            goto Ld3
        Lcb:
            r6 = r1
            r17 = r2
            r18 = r5
            r16 = r13
            r13 = r4
        Ld3:
            r1 = 0
            if (r34 == 0) goto Lf2
            java.lang.String[] r2 = O3.Y1.f4685A
            r2 = r2[r1]
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto Lf2
            O3.C0323t0.j(r14)
            O3.C0323t0.j(r17)
            r2 = r17
            E.c0 r3 = r2.f4892P
            android.os.Bundle r3 = r3.B()
            r14.z(r9, r3)
            goto Lf4
        Lf2:
            r2 = r17
        Lf4:
            k3.c r3 = r6.f4760N
            r4 = 40
            if (r10 != 0) goto L160
            java.lang.String r5 = "_iap"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L160
            O3.C0323t0.j(r14)
            java.lang.String r5 = "event"
            boolean r17 = r14.o0(r5, r8)
            r19 = 2
            if (r17 != 0) goto L110
            goto L12d
        L110:
            java.lang.String[] r1 = O3.K0.f4502a
            java.lang.String[] r13 = O3.K0.f4503b
            boolean r1 = r14.q0(r5, r1, r13, r8)
            if (r1 != 0) goto L11d
            r19 = 13
            goto L12d
        L11d:
            java.lang.Object r1 = r14.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            r1.getClass()
            boolean r1 = r14.r0(r5, r8, r4)
            if (r1 != 0) goto L12b
            goto L12d
        L12b:
            r19 = 0
        L12d:
            if (r19 == 0) goto L160
            O3.C0323t0.l(r15)
            O3.V r1 = r15.f4672y
            java.lang.String r0 = r0.a(r8)
            java.lang.String r2 = "Invalid public event name. Event will not be logged (FE)"
            r1.c(r0, r2)
            O3.C0323t0.j(r14)
            r13 = 1
            java.lang.String r0 = O3.Y1.t(r8, r13, r4)
            if (r8 == 0) goto L14c
            int r1 = r8.length()
            goto L14d
        L14c:
            r1 = 0
        L14d:
            r2 = 0
            java.lang.String r4 = "_ev"
            r33 = r0
            r34 = r1
            r30 = r2
            r29 = r3
            r32 = r4
            r31 = r19
            O3.Y1.E(r29, r30, r31, r32, r33, r34)
            return
        L160:
            r1 = r3
            O3.m1 r13 = r11.f5053B
            O3.C0323t0.k(r13)
            r3 = 0
            O3.j1 r5 = r13.u(r3)
            java.lang.String r3 = "_sc"
            if (r5 == 0) goto L178
            boolean r19 = r9.containsKey(r3)
            if (r19 != 0) goto L178
            r4 = 1
            r5.f4928d = r4
        L178:
            if (r34 == 0) goto L17e
            if (r10 != 0) goto L17e
            r4 = 1
            goto L17f
        L17e:
            r4 = 0
        L17f:
            O3.Y1.f0(r5, r9, r4)
            java.lang.String r4 = "am"
            boolean r4 = r4.equals(r7)
            boolean r5 = O3.Y1.M(r8)
            if (r34 == 0) goto L1c1
            r20 = r1
            O3.L0 r1 = r6.f4762u
            if (r1 == 0) goto L1bf
            if (r5 != 0) goto L1bf
            if (r4 == 0) goto L19b
            r21 = 1
            goto L1c6
        L19b:
            O3.C0323t0.l(r15)
            O3.V r1 = r15.f4665D
            java.lang.String r2 = r0.a(r8)
            java.lang.String r0 = r0.e(r9)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r1.d(r2, r0, r3)
            O3.L0 r0 = r6.f4762u
            x3.AbstractC1887A.g(r0)
            O3.L0 r0 = r6.f4762u
            B0.o r0 = (B0.C0050o) r0
            r4 = r31
            r1 = r7
            r2 = r8
            r3 = r9
            r0.D(r1, r2, r3, r4)
            return
        L1bf:
            r1 = r4
            goto L1c4
        L1c1:
            r20 = r1
            goto L1bf
        L1c4:
            r21 = r1
        L1c6:
            boolean r1 = r11.h()
            if (r1 != 0) goto L1ce
            goto L4c9
        L1ce:
            O3.C0323t0.j(r14)
            java.lang.Object r1 = r14.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            int r22 = r14.s0(r8)
            if (r22 == 0) goto L20e
            O3.C0323t0.l(r15)
            O3.V r1 = r15.f4672y
            java.lang.String r0 = r0.a(r8)
            java.lang.String r2 = "Invalid event name. Event will not be logged (FE)"
            r1.c(r0, r2)
            r0 = 40
            r13 = 1
            java.lang.String r0 = O3.Y1.t(r8, r13, r0)
            if (r8 == 0) goto L1f7
            int r1 = r8.length()
            goto L1f8
        L1f7:
            r1 = 0
        L1f8:
            O3.C0323t0.j(r14)
            java.lang.String r2 = "_ev"
            r3 = 0
            r33 = r0
            r34 = r1
            r32 = r2
            r30 = r3
            r29 = r20
            r31 = r22
            O3.Y1.E(r29, r30, r31, r32, r33, r34)
            return
        L20e:
            java.lang.String r0 = "_sn"
            java.lang.String r6 = "_si"
            r19 = r11
            java.lang.String r11 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r11, r0, r3, r6}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            android.os.Bundle r0 = r14.w(r8, r9, r0, r10)
            x3.AbstractC1887A.g(r0)
            O3.C0323t0.k(r13)
            r3 = 0
            O3.j1 r6 = r13.u(r3)
            java.lang.String r9 = "_ae"
            r34 = r11
            if (r6 == 0) goto L263
            boolean r6 = r9.equals(r8)
            if (r6 == 0) goto L263
            O3.C0323t0.k(r12)
            O3.D1 r6 = r12.f4360w
            java.lang.Object r3 = r6.f4350d
            O3.E1 r3 = (O3.E1) r3
            java.lang.Object r3 = r3.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            B3.a r3 = r3.f5052A
            r3.getClass()
            r22 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r3 = r6.f4348b
            long r3 = r10 - r3
            r6.f4348b = r10
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 <= 0) goto L265
            r14.V(r0, r3)
            goto L265
        L263:
            r22 = 0
        L265:
            java.lang.String r3 = "auto"
            boolean r3 = r3.equals(r7)
            java.lang.String r4 = "_ffr"
            if (r3 != 0) goto L2bb
            java.lang.String r3 = "_ssr"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L2bb
            java.lang.String r3 = r0.getString(r4)
            int r4 = B3.d.f559a
            if (r3 == 0) goto L291
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L28a
            goto L291
        L28a:
            if (r3 == 0) goto L292
            java.lang.String r3 = r3.trim()
            goto L292
        L291:
            r3 = 0
        L292:
            O3.h0 r4 = r1.f5076u
            O3.C0323t0.j(r4)
            K2.a r4 = r4.f4889M
            java.lang.String r4 = r4.e()
            boolean r4 = java.util.Objects.equals(r3, r4)
            if (r4 != 0) goto L2ae
            O3.h0 r1 = r1.f5076u
            O3.C0323t0.j(r1)
            K2.a r1 = r1.f4889M
            r1.f(r3)
            goto L2d5
        L2ae:
            O3.X r0 = r1.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4665D
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.b(r1)
            return
        L2bb:
            boolean r3 = r9.equals(r8)
            if (r3 == 0) goto L2d5
            O3.h0 r1 = r1.f5076u
            O3.C0323t0.j(r1)
            K2.a r1 = r1.f4889M
            java.lang.String r1 = r1.e()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L2d5
            r0.putString(r4, r1)
        L2d5:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r0)
            O3.E r1 = O3.F.f4401U0
            r3 = r16
            r11 = 0
            boolean r1 = r3.y(r11, r1)
            if (r1 == 0) goto L2f1
            O3.C0323t0.k(r12)
            r12.o()
            boolean r1 = r12.f4358u
            goto L2fa
        L2f1:
            O3.C0323t0.j(r2)
            O3.e0 r1 = r2.f4886J
            boolean r1 = r1.d()
        L2fa:
            O3.C0323t0.j(r2)
            O3.f0 r3 = r2.f4883G
            long r3 = r3.a()
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 <= 0) goto L357
            r4 = r31
            boolean r3 = r2.y(r4)
            if (r3 == 0) goto L357
            if (r1 == 0) goto L357
            O3.C0323t0.l(r15)
            O3.V r1 = r15.f4666E
            java.lang.String r3 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.b(r3)
            r18.getClass()
            r16 = r2
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "_sid"
            r4 = 0
            java.lang.String r5 = "auto"
            r17 = 0
            r1 = r28
            r11 = r16
            r1.z(r2, r4, r5, r6)
            r18.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "_sno"
            java.lang.String r5 = "auto"
            r1.z(r2, r4, r5, r6)
            r18.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "_se"
            java.lang.String r5 = "auto"
            r1.z(r2, r4, r5, r6)
            r6 = r1
            O3.f0 r1 = r11.f4884H
            r2 = r22
            r1.b(r2)
            goto L35d
        L357:
            r6 = r28
            r2 = r22
            r17 = 0
        L35d:
            java.lang.String r1 = "extend_session"
            long r1 = r0.getLong(r1, r2)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L37e
            O3.C0323t0.l(r15)
            O3.V r1 = r15.f4666E
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.b(r2)
            O3.C0323t0.k(r12)
            k3.c r1 = r12.f4359v
            r4 = r31
            r1.u(r4)
            goto L380
        L37e:
            r4 = r31
        L380:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r0.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = r17
        L392:
            if (r3 >= r2) goto L3eb
            java.lang.Object r11 = r1.get(r3)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L3e0
            O3.C0323t0.j(r14)
            java.lang.Object r15 = r0.get(r11)
            r33 = r1
            boolean r1 = r15 instanceof android.os.Bundle
            if (r1 == 0) goto L3b4
            r36 = r2
            r1 = 1
            android.os.Bundle[] r2 = new android.os.Bundle[r1]
            android.os.Bundle r15 = (android.os.Bundle) r15
            r2[r17] = r15
            r1 = r2
            goto L3da
        L3b4:
            r36 = r2
            boolean r1 = r15 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L3c6
            android.os.Parcelable[] r15 = (android.os.Parcelable[]) r15
            int r1 = r15.length
            java.lang.Class<android.os.Bundle[]> r2 = android.os.Bundle[].class
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r1, r2)
            android.os.Bundle[] r1 = (android.os.Bundle[]) r1
            goto L3da
        L3c6:
            boolean r1 = r15 instanceof java.util.ArrayList
            if (r1 == 0) goto L3d9
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r1 = r15.size()
            android.os.Bundle[] r1 = new android.os.Bundle[r1]
            java.lang.Object[] r1 = r15.toArray(r1)
            android.os.Bundle[] r1 = (android.os.Bundle[]) r1
            goto L3da
        L3d9:
            r1 = 0
        L3da:
            if (r1 == 0) goto L3e4
            r0.putParcelableArray(r11, r1)
            goto L3e4
        L3e0:
            r33 = r1
            r36 = r2
        L3e4:
            int r3 = r3 + 1
            r1 = r33
            r2 = r36
            goto L392
        L3eb:
            r11 = r17
        L3ed:
            int r0 = r10.size()
            if (r11 >= r0) goto L4a9
            java.lang.Object r0 = r10.get(r11)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r11 == 0) goto L400
            java.lang.String r1 = "_ep"
        L3fd:
            r15 = r34
            goto L402
        L400:
            r1 = r8
            goto L3fd
        L402:
            r0.putString(r15, r7)
            if (r35 == 0) goto L40b
            android.os.Bundle r0 = r14.P(r0)
        L40b:
            O3.v r26 = new O3.v
            O3.u r2 = new O3.u
            r2.<init>(r0)
            r3 = r7
            r7 = r0
            r0 = r26
            r0.<init>(r1, r2, r3, r4)
            O3.w1 r1 = r19.o()
            r1.getClass()
            r1.o()
            r1.p()
            r1.A()
            java.lang.Object r2 = r1.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.P r2 = r2.n()
            r2.getClass()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = r17
            A1.i.a(r0, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L45d
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4671x
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.b(r3)
            r25 = 0
        L45b:
            r4 = 1
            goto L465
        L45d:
            r3 = 0
            boolean r2 = r2.v(r3, r4)
            r25 = r2
            goto L45b
        L465:
            O3.a2 r24 = r1.E(r4)
            O3.q1 r22 = new O3.q1
            r27 = 1
            r26 = r0
            r23 = r1
            r22.<init>(r23, r24, r25, r26, r27)
            r1 = r22
            r0 = r23
            r0.C(r1)
            if (r21 != 0) goto L49d
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.f4763v
            java.util.Iterator r16 = r0.iterator()
        L483:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L49d
            java.lang.Object r0 = r16.next()
            O3.M0 r0 = (O3.M0) r0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r7)
            r1 = r29
            r4 = r31
            r2 = r8
            r0.onEvent(r1, r2, r3, r4)
            goto L483
        L49d:
            int r11 = r11 + 1
            r7 = r29
            r4 = r31
            r34 = r15
            r17 = 0
            goto L3ed
        L4a9:
            O3.C0323t0.k(r13)
            r3 = 0
            O3.j1 r0 = r13.u(r3)
            if (r0 == 0) goto L4c9
            boolean r0 = r9.equals(r8)
            if (r0 == 0) goto L4c9
            O3.C0323t0.k(r12)
            r18.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            O3.D1 r2 = r12.f4360w
            r13 = 1
            r2.e(r13, r13, r0)
        L4c9:
            return
        L4ca:
            r6 = r1
            O3.C0323t0.l(r15)
            O3.V r0 = r15.f4665D
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0271b1.x(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            java.lang.Object r2 = r11.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            r4 = 0
            r5 = 24
            if (r15 == 0) goto L13
            O3.Y1 r6 = r2.f5080y
            O3.C0323t0.j(r6)
            int r6 = r6.t0(r13)
            goto L3e
        L13:
            O3.Y1 r6 = r2.f5080y
            O3.C0323t0.j(r6)
            java.lang.String r7 = "user property"
            boolean r8 = r6.o0(r7, r13)
            r9 = 6
            if (r8 != 0) goto L23
        L21:
            r6 = r9
            goto L3e
        L23:
            java.lang.String[] r8 = O3.K0.i
            r10 = 0
            boolean r8 = r6.q0(r7, r8, r10, r13)
            if (r8 != 0) goto L2f
            r6 = 15
            goto L3e
        L2f:
            java.lang.Object r8 = r6.f4346r
            O3.t0 r8 = (O3.C0323t0) r8
            r8.getClass()
            boolean r6 = r6.r0(r7, r13, r5)
            if (r6 != 0) goto L3d
            goto L21
        L3d:
            r6 = r4
        L3e:
            k3.c r7 = r11.f4760N
            r8 = 1
            if (r6 == 0) goto L66
            O3.Y1 r0 = r2.f5080y
            O3.C0323t0.j(r0)
            java.lang.String r0 = O3.Y1.t(r13, r8, r5)
            if (r13 == 0) goto L52
            int r4 = r13.length()
        L52:
            O3.Y1 r2 = r2.f5080y
            O3.C0323t0.j(r2)
            r2 = 0
            java.lang.String r3 = "_ev"
            r16 = r0
            r13 = r2
            r15 = r3
            r17 = r4
            r14 = r6
            r12 = r7
            O3.Y1.E(r12, r13, r14, r15, r16, r17)
            return
        L66:
            r6 = r7
            if (r12 != 0) goto L6c
            java.lang.String r7 = "app"
            goto L6d
        L6c:
            r7 = r12
        L6d:
            if (r14 == 0) goto Lc2
            O3.Y1 r9 = r2.f5080y
            O3.C0323t0.j(r9)
            int r10 = r9.B(r14, r13)
            if (r10 == 0) goto La5
            O3.C0323t0.j(r9)
            java.lang.String r3 = O3.Y1.t(r13, r8, r5)
            boolean r5 = r14 instanceof java.lang.String
            if (r5 != 0) goto L89
            boolean r5 = r14 instanceof java.lang.CharSequence
            if (r5 == 0) goto L91
        L89:
            java.lang.String r0 = r14.toString()
            int r4 = r0.length()
        L91:
            O3.Y1 r0 = r2.f5080y
            O3.C0323t0.j(r0)
            r0 = 0
            java.lang.String r2 = "_ev"
            r13 = r0
            r15 = r2
            r16 = r3
            r17 = r4
            r12 = r6
            r14 = r10
            O3.Y1.E(r12, r13, r14, r15, r16, r17)
            return
        La5:
            O3.C0323t0.j(r9)
            java.lang.Object r4 = r9.C(r14, r13)
            if (r4 == 0) goto Lc1
            O3.p0 r8 = r2.f5078w
            O3.C0323t0.l(r8)
            O3.w0 r0 = new O3.w0
            r2 = r7
            r7 = 1
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.x(r0)
        Lc1:
            return
        Lc2:
            O3.p0 r8 = r2.f5078w
            O3.C0323t0.l(r8)
            O3.w0 r0 = new O3.w0
            r2 = r7
            r7 = 1
            r4 = 0
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.x(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0271b1.y(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            r19 = this;
            r0 = r22
            r1 = r19
            java.lang.Object r2 = r1.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            x3.AbstractC1887A.d(r23)
            x3.AbstractC1887A.d(r24)
            r1.o()
            r1.p()
            java.lang.String r3 = "allow_personalized_ads"
            r4 = r24
            boolean r3 = r3.equals(r4)
            r5 = 1
            if (r3 == 0) goto L78
            boolean r3 = r0 instanceof java.lang.String
            java.lang.String r6 = "_npa"
            if (r3 == 0) goto L57
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L57
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r3 = "false"
            boolean r0 = r3.equals(r0)
            r7 = 1
            if (r5 == r0) goto L41
            r9 = 0
            goto L42
        L41:
            r9 = r7
        L42:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            O3.h0 r4 = r2.f5076u
            O3.C0323t0.j(r4)
            K2.a r4 = r4.f4880D
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L53
            java.lang.String r3 = "true"
        L53:
            r4.f(r3)
            goto L67
        L57:
            if (r0 != 0) goto L66
            O3.h0 r3 = r2.f5076u
            O3.C0323t0.j(r3)
            K2.a r3 = r3.f4880D
            java.lang.String r4 = "unset"
            r3.f(r4)
            goto L67
        L66:
            r6 = r4
        L67:
            O3.X r3 = r2.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4666E
            java.lang.String r4 = "Setting user property(FE)"
            java.lang.String r7 = "non_personalized_ads(_npa)"
            r3.d(r7, r0, r4)
            r12 = r6
        L76:
            r11 = r0
            goto L7a
        L78:
            r12 = r4
            goto L76
        L7a:
            boolean r0 = r2.a()
            if (r0 != 0) goto L8d
            O3.X r0 = r2.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "User property not set since app measurement is disabled"
            r0.b(r2)
            return
        L8d:
            boolean r0 = r2.h()
            if (r0 != 0) goto L94
            return
        L94:
            O3.V1 r17 = new O3.V1
            r9 = r20
            r13 = r23
            r8 = r17
            r8.<init>(r9, r11, r12, r13)
            O3.w1 r14 = r2.o()
            r14.o()
            r14.p()
            r14.A()
            java.lang.Object r0 = r14.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.P r0 = r0.n()
            r0.getClass()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            A1.i.b(r8, r2)
            byte[] r3 = r2.marshall()
            r2.recycle()
            int r2 = r3.length
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r4) goto Lde
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4671x
            java.lang.String r2 = "User property too long for local database. Sending directly to service"
            r0.b(r2)
            r0 = 0
        Ldb:
            r16 = r0
            goto Le3
        Lde:
            boolean r0 = r0.v(r5, r3)
            goto Ldb
        Le3:
            O3.a2 r15 = r14.E(r5)
            O3.q1 r13 = new O3.q1
            r18 = 0
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            r14.C(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0271b1.z(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }
}
