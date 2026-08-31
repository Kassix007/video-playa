package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863t0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0863t0 f11035g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N3.a f11037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11040e;
    public volatile J f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0863t0(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0814j0(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11036a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11037b = new N3.a(this);
        this.f11038c = new ArrayList();
        try {
            if (O3.K0.b(context, O3.K0.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0863t0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f11040e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new C0794f0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0858s0(this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0863t0 e(Context context, Bundle bundle) {
        AbstractC1887A.g(context);
        if (f11035g == null) {
            synchronized (C0863t0.class) {
                try {
                    if (f11035g == null) {
                        f11035g = new C0863t0(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f11035g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map a(String str, String str2, boolean z5) {
        G g7 = new G();
        c(new Y(this, str, str2, z5, g7));
        Bundle bundleK = g7.K(5000L);
        if (bundleK == null || bundleK.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleK.size());
        for (String str3 : bundleK.keySet()) {
            Object obj = bundleK.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(String str) {
        G g7 = new G();
        c(new C0794f0(this, str, g7));
        Integer num = (Integer) G.L(g7.K(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(AbstractRunnableC0839o0 abstractRunnableC0839o0) {
        this.f11036a.execute(abstractRunnableC0839o0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Exception exc, boolean z5, boolean z6) {
        this.f11040e |= z5;
        if (z5) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z6) {
            c(new C0794f0(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(O3.M0 m02) {
        AbstractC1887A.g(m02);
        ArrayList arrayList = this.f11038c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (m02.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0849q0 binderC0849q0 = new BinderC0849q0(m02);
            arrayList.add(new Pair(m02, binderC0849q0));
            if (this.f != null) {
                try {
                    this.f.registerOnMeasurementEventListener(binderC0849q0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c(new C0829m0(this, binderC0849q0, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List g(String str, String str2) {
        G g7 = new G();
        c(new C0768a0(this, str, str2, g7));
        List list = (List) G.L(g7.K(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
