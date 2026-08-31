package O3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284g extends D0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f4855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f4856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0281f f4857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f4858v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean A(String str) {
        AbstractC1887A.d(str);
        Bundle bundleZ = z();
        if (bundleZ != null) {
            if (bundleZ.containsKey(str)) {
                return Boolean.valueOf(bundleZ.getBoolean(str));
            }
            return null;
        }
        X x6 = ((C0323t0) this.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4670w.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B() {
        ((C0323t0) this.f4346r).getClass();
        Boolean boolA = A("firebase_analytics_collection_deactivated");
        return boolA != null && boolA.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean C() {
        Boolean boolA = A("google_analytics_automatic_screen_reporting_enabled");
        return boolA == null || boolA.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G0 D(String str, boolean z5) {
        Object obj;
        AbstractC1887A.d(str);
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        Bundle bundleZ = z();
        if (bundleZ == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZ.get(str);
        }
        G0 g02 = G0.UNINITIALIZED;
        if (obj == null) {
            return g02;
        }
        if (Boolean.TRUE.equals(obj)) {
            return G0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return G0.DENIED;
        }
        if (z5 && "eu_consent_policy".equals(obj)) {
            return G0.POLICY;
        }
        X x7 = c0323t0.f5077v;
        C0323t0.l(x7);
        x7.f4673z.c(str, "Invalid manifest metadata for");
        return g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(String str) {
        return "1".equals(this.f4857u.a(str, "gaia_collection_enabled"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q(String str) {
        return "1".equals(this.f4857u.a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r() {
        if (this.f4855s == null) {
            Boolean boolA = A("app_measurement_lite");
            this.f4855s = boolA;
            if (boolA == null) {
                this.f4855s = Boolean.FALSE;
            }
        }
        return this.f4855s.booleanValue() || !((C0323t0) this.f4346r).f5073r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String s(String str) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC1887A.g(str2);
            return str2;
        } catch (ClassNotFoundException e7) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(e7, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e8) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(e8, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e9) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4670w.c(e9, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e10) {
            X x9 = c0323t0.f5077v;
            C0323t0.l(x9);
            x9.f4670w.c(e10, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        ((C0323t0) this.f4346r).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String u(String str, E e7) {
        return TextUtils.isEmpty(str) ? (String) e7.a(null) : (String) e7.a(this.f4857u.a(str, e7.f4351a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long v(String str, E e7) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e7.a(null)).longValue();
        }
        String strA = this.f4857u.a(str, e7.f4351a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) e7.a(null)).longValue();
        }
        try {
            return ((Long) e7.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e7.a(null)).longValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int w(String str, E e7) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e7.a(null)).intValue();
        }
        String strA = this.f4857u.a(str, e7.f4351a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) e7.a(null)).intValue();
        }
        try {
            return ((Integer) e7.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e7.a(null)).intValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double x(String str, E e7) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e7.a(null)).doubleValue();
        }
        String strA = this.f4857u.a(str, e7.f4351a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) e7.a(null)).doubleValue();
        }
        try {
            return ((Double) e7.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e7.a(null)).doubleValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y(String str, E e7) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e7.a(null)).booleanValue();
        }
        String strA = this.f4857u.a(str, e7.f4351a);
        return TextUtils.isEmpty(strA) ? ((Boolean) e7.a(null)).booleanValue() : ((Boolean) e7.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle z() {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        try {
            Context context = c0323t0.f5072q;
            X x6 = c0323t0.f5077v;
            if (context.getPackageManager() == null) {
                C0323t0.l(x6);
                x6.f4670w.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            C3.b bVarA = C3.c.a(context);
            ApplicationInfo applicationInfo = bVarA.f1185a.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            C0323t0.l(x6);
            x6.f4670w.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(e7, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
