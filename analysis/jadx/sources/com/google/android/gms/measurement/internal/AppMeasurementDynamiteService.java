package com.google.android.gms.measurement.internal;

import B0.C0050o;
import B0.G0;
import D3.b;
import I4.a;
import O3.A;
import O3.B0;
import O3.C0271b1;
import O3.C0283f1;
import O3.C0295j1;
import O3.C0304m1;
import O3.C0312p0;
import O3.C0323t0;
import O3.C0325u;
import O3.C0328v;
import O3.EnumC0289h1;
import O3.K0;
import O3.L0;
import O3.L1;
import O3.M0;
import O3.N1;
import O3.R0;
import O3.RunnableC0267a0;
import O3.RunnableC0315q0;
import O3.S0;
import O3.T0;
import O3.V0;
import O3.W0;
import O3.X;
import O3.Y0;
import O3.Y1;
import O3.Z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.V;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r.C1554e;
import s4.e;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0323t0 f11336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1554e f11337d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f11336c = null;
        this.f11337d = new C1554e(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J() {
        if (this.f11336c == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(String str, L l7) {
        J();
        Y1 y12 = this.f11336c.f5080y;
        C0323t0.j(y12);
        y12.W(str, l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void beginAdUnitExposure(String str, long j) {
        J();
        A a7 = this.f11336c.f5055D;
        C0323t0.i(a7);
        a7.p(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.C(str, str2, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void clearMeasurementEnabled(long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.p();
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new a(8, (Object) c0271b1, (Object) null, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void endAdUnitExposure(String str, long j) {
        J();
        A a7 = this.f11336c.f5055D;
        C0323t0.i(a7);
        a7.q(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void generateEventId(L l7) {
        J();
        Y1 y12 = this.f11336c.f5080y;
        C0323t0.j(y12);
        long jK0 = y12.k0();
        J();
        Y1 y13 = this.f11336c.f5080y;
        C0323t0.j(y13);
        y13.X(l7, jK0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getAppInstanceId(L l7) {
        J();
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new RunnableC0315q0(this, l7, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getCachedAppInstanceId(L l7) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        K((String) c0271b1.f4765x.get(), l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getConditionalUserProperties(String str, String str2, L l7) {
        J();
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new B0(this, l7, str, str2, 4, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenClass(L l7) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0304m1 c0304m1 = ((C0323t0) c0271b1.f4346r).f5053B;
        C0323t0.k(c0304m1);
        C0295j1 c0295j1 = c0304m1.f4965t;
        K(c0295j1 != null ? c0295j1.f4926b : null, l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenName(L l7) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0304m1 c0304m1 = ((C0323t0) c0271b1.f4346r).f5053B;
        C0323t0.k(c0304m1);
        C0295j1 c0295j1 = c0304m1.f4965t;
        K(c0295j1 != null ? c0295j1.f4925a : null, l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getGmpAppId(L l7) {
        String strB;
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        try {
            strB = K0.b(c0323t0.f5072q, c0323t0.f5057F);
        } catch (IllegalStateException e7) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(e7, "getGoogleAppId failed with exception");
            strB = null;
        }
        K(strB, l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getMaxUserProperties(String str, L l7) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        AbstractC1887A.d(str);
        ((C0323t0) c0271b1.f4346r).getClass();
        J();
        Y1 y12 = this.f11336c.f5080y;
        C0323t0.j(y12);
        y12.Y(l7, 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getSessionId(L l7) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new a(c0271b1, l7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getTestFlag(L l7, int i) {
        J();
        if (i == 0) {
            Y1 y12 = this.f11336c.f5080y;
            C0323t0.j(y12);
            C0271b1 c0271b1 = this.f11336c.f5054C;
            C0323t0.k(c0271b1);
            AtomicReference atomicReference = new AtomicReference();
            C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
            C0323t0.l(c0312p0);
            y12.W((String) c0312p0.y(atomicReference, 15000L, "String test flag value", new V0(c0271b1, atomicReference, 1)), l7);
            return;
        }
        if (i == 1) {
            Y1 y13 = this.f11336c.f5080y;
            C0323t0.j(y13);
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            AtomicReference atomicReference2 = new AtomicReference();
            C0312p0 c0312p02 = ((C0323t0) c0271b12.f4346r).f5078w;
            C0323t0.l(c0312p02);
            y13.X(l7, ((Long) c0312p02.y(atomicReference2, 15000L, "long test flag value", new V0(c0271b12, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            Y1 y14 = this.f11336c.f5080y;
            C0323t0.j(y14);
            C0271b1 c0271b13 = this.f11336c.f5054C;
            C0323t0.k(c0271b13);
            AtomicReference atomicReference3 = new AtomicReference();
            C0312p0 c0312p03 = ((C0323t0) c0271b13.f4346r).f5078w;
            C0323t0.l(c0312p03);
            double dDoubleValue = ((Double) c0312p03.y(atomicReference3, 15000L, "double test flag value", new V0(c0271b13, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                l7.a(bundle);
                return;
            } catch (RemoteException e7) {
                X x6 = ((C0323t0) y14.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4673z.c(e7, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            Y1 y15 = this.f11336c.f5080y;
            C0323t0.j(y15);
            C0271b1 c0271b14 = this.f11336c.f5054C;
            C0323t0.k(c0271b14);
            AtomicReference atomicReference4 = new AtomicReference();
            C0312p0 c0312p04 = ((C0323t0) c0271b14.f4346r).f5078w;
            C0323t0.l(c0312p04);
            y15.Y(l7, ((Integer) c0312p04.y(atomicReference4, 15000L, "int test flag value", new V0(c0271b14, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        Y1 y16 = this.f11336c.f5080y;
        C0323t0.j(y16);
        C0271b1 c0271b15 = this.f11336c.f5054C;
        C0323t0.k(c0271b15);
        AtomicReference atomicReference5 = new AtomicReference();
        C0312p0 c0312p05 = ((C0323t0) c0271b15.f4346r).f5078w;
        C0323t0.l(c0312p05);
        y16.a0(l7, ((Boolean) c0312p05.y(atomicReference5, 15000L, "boolean test flag value", new V0(c0271b15, atomicReference5, 0))).booleanValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void getUserProperties(String str, String str2, boolean z5, L l7) {
        J();
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new T0(this, l7, str, str2, z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void initForTests(Map map) {
        J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void initialize(D3.a aVar, V v6, long j) {
        C0323t0 c0323t0 = this.f11336c;
        if (c0323t0 == null) {
            Context context = (Context) b.K(aVar);
            AbstractC1887A.g(context);
            this.f11336c = C0323t0.r(context, v6, Long.valueOf(j));
        } else {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4673z.b("Attempting to initialize multiple times");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void isDataCollectionEnabled(L l7) {
        J();
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new RunnableC0315q0(this, l7, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.t(str, str2, bundle, z5, z6, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void logEventAndBundle(String str, String str2, Bundle bundle, L l7, long j) {
        J();
        AbstractC1887A.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C0328v c0328v = new C0328v(str2, new C0325u(bundle), "app", j);
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new B0(this, l7, c0328v, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void logHealthData(int i, String str, D3.a aVar, D3.a aVar2, D3.a aVar3) {
        J();
        Object objK = aVar == null ? null : b.K(aVar);
        Object objK2 = aVar2 == null ? null : b.K(aVar2);
        Object objK3 = aVar3 != null ? b.K(aVar3) : null;
        X x6 = this.f11336c.f5077v;
        C0323t0.l(x6);
        x6.x(i, true, false, str, objK, objK2, objK3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreated(D3.a aVar, Bundle bundle, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), bundle, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, Bundle bundle, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Y0 y02 = c0271b1.f4761t;
        if (y02 != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
            y02.a(x6, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyed(D3.a aVar, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Y0 y02 = c0271b1.f4761t;
        if (y02 != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
            y02.b(x6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPaused(D3.a aVar, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Y0 y02 = c0271b1.f4761t;
        if (y02 != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
            y02.c(x6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumed(D3.a aVar, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Y0 y02 = c0271b1.f4761t;
        if (y02 != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
            y02.d(x6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceState(D3.a aVar, L l7, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), l7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, L l7, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Y0 y02 = c0271b1.f4761t;
        Bundle bundle = new Bundle();
        if (y02 != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
            y02.e(x6, bundle);
        }
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x7 = this.f11336c.f5077v;
            C0323t0.l(x7);
            x7.f4673z.c(e7, "Error returning bundle value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStarted(D3.a aVar, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        if (c0271b1.f4761t != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStopped(D3.a aVar, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.X x6, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        if (c0271b1.f4761t != null) {
            C0271b1 c0271b12 = this.f11336c.f5054C;
            C0323t0.k(c0271b12);
            c0271b12.G();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void performAction(Bundle bundle, L l7, long j) {
        J();
        l7.a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void registerOnMeasurementEventListener(S s6) {
        Object z1;
        J();
        C1554e c1554e = this.f11337d;
        synchronized (c1554e) {
            try {
                z1 = (M0) c1554e.get(Integer.valueOf(s6.d()));
                if (z1 == null) {
                    z1 = new Z1(this, s6);
                    c1554e.put(Integer.valueOf(s6.d()), z1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.p();
        if (c0271b1.f4763v.add(z1)) {
            return;
        }
        X x6 = ((C0323t0) c0271b1.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4673z.b("OnEventListener already registered");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void resetAnalyticsData(long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.f4765x.set(null);
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new S0(c0271b1, j, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void retrieveAndUploadBatches(N n7) {
        EnumC0289h1 enumC0289h1;
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.p();
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        if (c0312p0.u()) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        if (Thread.currentThread() == c0312p02.f5013u) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.b("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (e.i()) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4670w.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        X x9 = c0323t0.f5077v;
        C0323t0.l(x9);
        x9.f4666E.b("[sgtm] Started client-side batch upload work.");
        boolean z5 = false;
        int size = 0;
        int i = 0;
        while (!z5) {
            X x10 = c0323t0.f5077v;
            C0323t0.l(x10);
            x10.f4666E.b("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C0312p0 c0312p03 = c0323t0.f5078w;
            C0323t0.l(c0312p03);
            c0312p03.y(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "[sgtm] Getting upload batches", new V0(c0271b1, atomicReference, 6, false));
            N1 n12 = (N1) atomicReference.get();
            if (n12 == null) {
                break;
            }
            List list = n12.f4540q;
            if (list.isEmpty()) {
                break;
            }
            X x11 = c0323t0.f5077v;
            C0323t0.l(x11);
            x11.f4666E.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                L1 l12 = (L1) it.next();
                try {
                    URL url = new URI(l12.f4513s).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    O3.N nQ = ((C0323t0) c0271b1.f4346r).q();
                    nQ.p();
                    AbstractC1887A.g(nQ.f4531x);
                    String str = nQ.f4531x;
                    C0323t0 c0323t02 = (C0323t0) c0271b1.f4346r;
                    X x12 = c0323t02.f5077v;
                    C0323t0.l(x12);
                    O3.V v6 = x12.f4666E;
                    Long lValueOf = Long.valueOf(l12.f4511q);
                    v6.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, l12.f4513s, Integer.valueOf(l12.f4512r.length));
                    if (!TextUtils.isEmpty(l12.f4517w)) {
                        X x13 = c0323t02.f5077v;
                        C0323t0.l(x13);
                        x13.f4666E.d(lValueOf, l12.f4517w, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = l12.f4514t;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    C0283f1 c0283f1 = c0323t02.f5056E;
                    C0323t0.l(c0283f1);
                    byte[] bArr = l12.f4512r;
                    G0 g02 = new G0(c0271b1, atomicReference2, l12, 9);
                    c0283f1.q();
                    AbstractC1887A.g(url);
                    AbstractC1887A.g(bArr);
                    C0312p0 c0312p04 = ((C0323t0) c0283f1.f4346r).f5078w;
                    C0323t0.l(c0312p04);
                    c0312p04.A(new RunnableC0267a0(c0283f1, str, url, bArr, map, g02));
                    try {
                        Y1 y12 = c0323t02.f5080y;
                        C0323t0.j(y12);
                        C0323t0 c0323t03 = (C0323t0) y12.f4346r;
                        c0323t03.f5052A.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    c0323t03.f5052A.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        X x14 = ((C0323t0) c0271b1.f4346r).f5077v;
                        C0323t0.l(x14);
                        x14.f4673z.b("[sgtm] Interrupted waiting for uploading batch");
                    }
                    enumC0289h1 = atomicReference2.get() == null ? EnumC0289h1.UNKNOWN : (EnumC0289h1) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e7) {
                    X x15 = ((C0323t0) c0271b1.f4346r).f5077v;
                    C0323t0.l(x15);
                    x15.f4670w.e("[sgtm] Bad upload url for row_id", l12.f4513s, Long.valueOf(l12.f4511q), e7);
                    enumC0289h1 = EnumC0289h1.FAILURE;
                }
                if (enumC0289h1 != EnumC0289h1.SUCCESS) {
                    if (enumC0289h1 == EnumC0289h1.BACKOFF) {
                        z5 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        X x16 = c0323t0.f5077v;
        C0323t0.l(x16);
        x16.f4666E.d(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            n7.c();
        } catch (RemoteException e8) {
            C0323t0 c0323t04 = this.f11336c;
            AbstractC1887A.g(c0323t04);
            X x17 = c0323t04.f5077v;
            C0323t0.l(x17);
            x17.f4673z.c(e8, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setConditionalUserProperty(Bundle bundle, long j) {
        J();
        if (bundle == null) {
            X x6 = this.f11336c.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Conditional user property must not be null");
        } else {
            C0271b1 c0271b1 = this.f11336c.f5054C;
            C0323t0.k(c0271b1);
            c0271b1.B(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConsent(Bundle bundle, long j) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setConsentThirdParty(Bundle bundle, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.H(bundle, -20, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setCurrentScreen(D3.a aVar, String str, String str2, long j) {
        J();
        Activity activity = (Activity) b.K(aVar);
        AbstractC1887A.g(activity);
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.X.W(activity), str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.X r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            r5 = this;
            r5.J()
            O3.t0 r9 = r5.f11336c
            O3.m1 r9 = r9.f5053B
            O3.C0323t0.k(r9)
            java.lang.Object r10 = r9.f4346r
            O3.t0 r10 = (O3.C0323t0) r10
            O3.g r0 = r10.f5075t
            boolean r0 = r0.C()
            if (r0 != 0) goto L23
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            java.lang.String r7 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r6.b(r7)
            return
        L23:
            O3.j1 r0 = r9.f4965t
            if (r0 != 0) goto L34
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            java.lang.String r7 = "setCurrentScreen cannot be called while no activity active"
            r6.b(r7)
            return
        L34:
            java.util.concurrent.ConcurrentHashMap r1 = r9.f4968w
            int r2 = r6.f10749q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r1.get(r2)
            if (r3 != 0) goto L4f
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            java.lang.String r7 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r6.b(r7)
            return
        L4f:
            if (r8 != 0) goto L57
            java.lang.String r8 = r6.f10750r
            java.lang.String r8 = r9.v(r8)
        L57:
            java.lang.String r3 = r0.f4926b
            java.lang.String r0 = r0.f4925a
            boolean r3 = java.util.Objects.equals(r3, r8)
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r3 == 0) goto L75
            if (r0 != 0) goto L68
            goto L75
        L68:
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            java.lang.String r7 = "setCurrentScreen cannot be called with the same class and name"
            r6.b(r7)
            return
        L75:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 == 0) goto La0
            int r3 = r7.length()
            if (r3 <= 0) goto L8b
            int r3 = r7.length()
            O3.g r4 = r10.f5075t
            r4.getClass()
            if (r3 > r0) goto L8b
            goto La0
        L8b:
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            int r7 = r7.length()
            java.lang.String r8 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.c(r7, r8)
            return
        La0:
            if (r8 == 0) goto Lc9
            int r3 = r8.length()
            if (r3 <= 0) goto Lb4
            int r3 = r8.length()
            O3.g r4 = r10.f5075t
            r4.getClass()
            if (r3 > r0) goto Lb4
            goto Lc9
        Lb4:
            O3.X r6 = r10.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4663B
            int r7 = r8.length()
            java.lang.String r8 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.c(r7, r8)
            return
        Lc9:
            O3.X r0 = r10.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            if (r7 != 0) goto Ld5
            java.lang.String r3 = "null"
            goto Ld6
        Ld5:
            r3 = r7
        Ld6:
            java.lang.String r4 = "Setting current screen to name, class"
            r0.d(r3, r8, r4)
            O3.j1 r0 = new O3.j1
            O3.Y1 r10 = r10.f5080y
            O3.C0323t0.j(r10)
            long r3 = r10.k0()
            r0.<init>(r7, r8, r3)
            r1.put(r2, r0)
            java.lang.String r6 = r6.f10750r
            r7 = 1
            r9.x(r6, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.X, java.lang.String, java.lang.String, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setDataCollectionEnabled(boolean z5) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.p();
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new R0(c0271b1, z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setDefaultEventParameters(Bundle bundle) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new W0(c0271b1, bundle2, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setEventInterceptor(S s6) {
        J();
        C0050o c0050o = new C0050o(this, s6, false);
        C0312p0 c0312p0 = this.f11336c.f5078w;
        C0323t0.l(c0312p0);
        if (!c0312p0.u()) {
            C0312p0 c0312p02 = this.f11336c.f5078w;
            C0323t0.l(c0312p02);
            c0312p02.x(new a(10, (Object) this, (Object) c0050o, false));
            return;
        }
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.o();
        c0271b1.p();
        L0 l02 = c0271b1.f4762u;
        if (c0050o != l02) {
            AbstractC1887A.i(l02 == null, "EventInterceptor already set.");
        }
        c0271b1.f4762u = c0050o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setInstanceIdProvider(U u6) {
        J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setMeasurementEnabled(boolean z5, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        Boolean boolValueOf = Boolean.valueOf(z5);
        c0271b1.p();
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new a(8, (Object) c0271b1, (Object) boolValueOf, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setMinimumSessionDuration(long j) {
        J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setSessionTimeoutDuration(long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0312p0 c0312p0 = ((C0323t0) c0271b1.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new S0(c0271b1, j, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setSgtmDebugInfo(Intent intent) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        Uri data = intent.getData();
        if (data == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4664C.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4664C.b("[sgtm] Preview Mode was not enabled.");
            c0323t0.f5075t.f4856t = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        X x8 = c0323t0.f5077v;
        C0323t0.l(x8);
        x8.f4664C.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c0323t0.f5075t.f4856t = queryParameter2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setUserId(String str, long j) {
        J();
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        if (str != null && TextUtils.isEmpty(str)) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4673z.b("User ID must be non-empty or null");
        } else {
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new a(12, c0271b1, str));
            c0271b1.y(null, "_id", str, true, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void setUserProperty(String str, String str2, D3.a aVar, boolean z5, long j) {
        J();
        Object objK = b.K(aVar);
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.y(str, str2, objK, z5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public void unregisterOnMeasurementEventListener(S s6) {
        Object z1;
        J();
        C1554e c1554e = this.f11337d;
        synchronized (c1554e) {
            z1 = (M0) c1554e.remove(Integer.valueOf(s6.d()));
        }
        if (z1 == null) {
            z1 = new Z1(this, s6);
        }
        C0271b1 c0271b1 = this.f11336c.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.p();
        if (c0271b1.f4763v.remove(z1)) {
            return;
        }
        X x6 = ((C0323t0) c0271b1.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4673z.b("OnEventListener had not been registered");
    }
}
