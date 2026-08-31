package O3;

import B0.C0029a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends E0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SecureRandom f4687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f4688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z1.d f4690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f4691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f4692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f4686z = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f4685A = {"_err"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y1(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4692y = null;
        this.f4688u = new AtomicLong(0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void E(X1 x12, String str, int i, String str2, String str3, int i7) {
        Bundle bundle = new Bundle();
        h0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i7);
        }
        x12.zza(str, "_err", bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MessageDigest F() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long G(byte[] bArr) {
        AbstractC1887A.g(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i7 = length - 1; i7 >= 0 && i7 >= bArr.length - 8; i7--) {
            j += (((long) bArr[i7]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean H(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean K(String str) {
        String str2 = (String) F.f4454r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean M(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N(String str, String[] strArr) {
        AbstractC1887A.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] S(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList d0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0278e c0278e = (C0278e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0278e.f4830q);
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, c0278e.f4831r);
            bundle.putLong("creation_timestamp", c0278e.f4833t);
            bundle.putString("name", c0278e.f4832s.f4647r);
            Object objW = c0278e.f4832s.W();
            AbstractC1887A.g(objW);
            K0.d(bundle, objW);
            bundle.putBoolean("active", c0278e.f4834u);
            String str = c0278e.f4835v;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0328v c0328v = c0278e.f4836w;
            if (c0328v != null) {
                bundle.putString("timed_out_event_name", c0328v.f5091q);
                C0325u c0325u = c0328v.f5092r;
                if (c0325u != null) {
                    bundle.putBundle("timed_out_event_params", c0325u.c0());
                }
            }
            bundle.putLong("trigger_timeout", c0278e.f4837x);
            C0328v c0328v2 = c0278e.f4838y;
            if (c0328v2 != null) {
                bundle.putString("triggered_event_name", c0328v2.f5091q);
                C0325u c0325u2 = c0328v2.f5092r;
                if (c0325u2 != null) {
                    bundle.putBundle("triggered_event_params", c0325u2.c0());
                }
            }
            bundle.putLong("triggered_timestamp", c0278e.f4832s.f4648s);
            bundle.putLong("time_to_live", c0278e.f4839z);
            C0328v c0328v3 = c0278e.f4829A;
            if (c0328v3 != null) {
                bundle.putString("expired_event_name", c0328v3.f5091q);
                C0325u c0325u3 = c0328v3.f5092r;
                if (c0325u3 != null) {
                    bundle.putBundle("expired_event_params", c0325u3.c0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean e0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1887A.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f0(C0295j1 c0295j1, Bundle bundle, boolean z5) {
        if (bundle != null && c0295j1 != null) {
            if (!bundle.containsKey("_sc") || z5) {
                String str = c0295j1.f4925a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c0295j1.f4926b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c0295j1.f4927c);
                return;
            }
            z5 = false;
        }
        if (bundle != null && c0295j1 == null && z5) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean h0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m0(String str) {
        AbstractC1887A.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String t(String str, boolean z5, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z5) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean w0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(Bundle bundle, int i, String str, Object obj) {
        if (h0(i, bundle)) {
            ((C0323t0) this.f4346r).getClass();
            bundle.putString("_ev", t(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int B(Object obj, String str) {
        return "_ldl".equals(str) ? x0("user property referrer", str, j0(str), obj) : x0("user property", str, j0(str), obj) ? 0 : 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object C(Object obj, String str) {
        return "_ldl".equals(str) ? i0(j0(str), obj, true, false) : i0(j0(str), obj, false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4663B.d(c0323t0.f5081z.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Z1.d I() {
        a2.e bVar;
        Object objInvoke;
        if (this.f4690w == null) {
            Context context = ((C0323t0) this.f4346r).f5072q;
            kotlin.jvm.internal.m.e(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            X1.b bVar2 = X1.b.f8167a;
            sb.append(i >= 33 ? bVar2.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? bVar2.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) AbstractC0320s0.i());
                kotlin.jvm.internal.m.d(systemService, "context.getSystemService…ementManager::class.java)");
                bVar = new a2.b(AbstractC0320s0.c(systemService));
            } else {
                X1.a aVar = X1.a.f8166a;
                if (((i == 31 || i == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        objInvoke = new C0029a(26, context).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i7 = Build.VERSION.SDK_INT;
                        sb2.append((i7 == 31 || i7 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        objInvoke = null;
                    }
                    bVar = (a2.e) objInvoke;
                } else {
                    bVar = null;
                }
            }
            this.f4690w = bVar != null ? new Z1.d(bVar) : null;
        }
        return this.f4690w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J() {
        /*
            r11 = this;
            r11.o()
            java.lang.Object r0 = r11.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.N r1 = r0.q()
            O3.X r0 = r0.f5077v
            java.lang.String r1 = r1.u()
            boolean r1 = K(r1)
            r2 = 0
            if (r1 != 0) goto L1a
            return r2
        L1a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 0
            r6 = 30
            if (r1 >= r6) goto L25
            r6 = 4
            goto L50
        L25:
            int r7 = C0.D0.b()
            r8 = 4
            if (r7 >= r8) goto L2f
            r6 = 8
            goto L50
        L2f:
            if (r1 < r6) goto L3d
            int r1 = C0.D0.b()
            r6 = 3
            if (r1 <= r6) goto L3d
            int r1 = C0.D0.C()
            goto L3e
        L3d:
            r1 = r4
        L3e:
            O3.E r6 = O3.F.f4442l0
            java.lang.Object r6 = r6.a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r1 >= r6) goto L4f
            r6 = 16
            goto L50
        L4f:
            r6 = r2
        L50:
            java.lang.String r1 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r1 = r11.L(r1)
            if (r1 != 0) goto L5b
            r8 = 2
            long r6 = r6 | r8
        L5b:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto Lc0
            java.lang.Boolean r1 = r11.f4691x
            if (r1 != 0) goto Lb6
            Z1.d r1 = r11.I()
            if (r1 != 0) goto L6a
            goto Lbc
        L6a:
            I4.b r1 = r1.b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L94 java.lang.InterruptedException -> L97 java.util.concurrent.ExecutionException -> L99 java.util.concurrent.CancellationException -> L9b
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = r1.get(r9, r8)     // Catch: java.util.concurrent.TimeoutException -> L94 java.lang.InterruptedException -> L97 java.util.concurrent.ExecutionException -> L99 java.util.concurrent.CancellationException -> L9b
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.util.concurrent.TimeoutException -> L94 java.lang.InterruptedException -> L97 java.util.concurrent.ExecutionException -> L99 java.util.concurrent.CancellationException -> L9b
            if (r1 == 0) goto L8b
            int r5 = r1.intValue()     // Catch: java.util.concurrent.TimeoutException -> L83 java.lang.InterruptedException -> L85 java.util.concurrent.ExecutionException -> L87 java.util.concurrent.CancellationException -> L89
            r8 = 1
            if (r5 != r8) goto L8b
            r4 = r8
            goto L8b
        L83:
            r4 = move-exception
            goto L92
        L85:
            r4 = move-exception
            goto L92
        L87:
            r4 = move-exception
            goto L92
        L89:
            r4 = move-exception
            goto L92
        L8b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.util.concurrent.TimeoutException -> L83 java.lang.InterruptedException -> L85 java.util.concurrent.ExecutionException -> L87 java.util.concurrent.CancellationException -> L89
            r11.f4691x = r4     // Catch: java.util.concurrent.TimeoutException -> L83 java.lang.InterruptedException -> L85 java.util.concurrent.ExecutionException -> L87 java.util.concurrent.CancellationException -> L89
            goto Lac
        L92:
            r5 = r1
            goto L9d
        L94:
            r1 = move-exception
        L95:
            r4 = r1
            goto L9d
        L97:
            r1 = move-exception
            goto L95
        L99:
            r1 = move-exception
            goto L95
        L9b:
            r1 = move-exception
            goto L95
        L9d:
            O3.C0323t0.l(r0)
            O3.V r1 = r0.f4673z
            java.lang.String r8 = "Measurement manager api exception"
            r1.c(r4, r8)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11.f4691x = r1
            r1 = r5
        Lac:
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r4 = "Measurement manager api status result"
            r0.c(r1, r4)
        Lb6:
            java.lang.Boolean r0 = r11.f4691x
            boolean r4 = r0.booleanValue()
        Lbc:
            if (r4 != 0) goto Lc0
            r6 = 64
        Lc0:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc7
            r0 = 1
            return r0
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Y1.J():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean L(String str) {
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (C3.c.a(c0323t0.f5072q).f1185a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4665D.c(str, "Permission not granted");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean O(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C0323t0) this.f4346r).f5075t.s("debug.firebase.analytics.app").equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle P(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objV = v(bundle.get(str), str);
                if (objV == null) {
                    C0323t0 c0323t0 = (C0323t0) this.f4346r;
                    X x6 = c0323t0.f5077v;
                    C0323t0.l(x6);
                    x6.f4663B.c(c0323t0.f5081z.b(str), "Param value can't be null");
                } else {
                    D(bundle2, str, objV);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0328v Q(String str, Bundle bundle, String str2, long j, boolean z5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (s0(str) != 0) {
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(c0323t0.f5081z.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleW = w(str, bundle2, Collections.singletonList("_o"), true);
        if (z5) {
            bundleW = P(bundleW);
        }
        AbstractC1887A.g(bundleW);
        return new C0328v(str, new C0325u(bundleW), str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean R(Context context, String str) {
        Signature[] signatureArr;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoA = C3.c.a(context).a(64, str);
            if (packageInfoA == null || (signatureArr = packageInfoA.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(e7, "Package name not found");
            return true;
        } catch (CertificateException e8) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(e8, "Error obtaining certificate");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean T(int i) {
        Boolean bool = ((C0323t0) this.f4346r).o().f5110v;
        if (U() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int U() {
        if (this.f4692y == null) {
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            com.google.android.gms.common.f fVar = com.google.android.gms.common.f.f10343b;
            Context context = c0323t0.f5072q;
            fVar.getClass();
            this.f4692y = Integer.valueOf(com.google.android.gms.common.h.getApkVersion(context) / 1000);
        }
        return this.f4692y.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(Bundle bundle, long j) {
        long j7 = bundle.getLong("_et");
        if (j7 != 0) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(Long.valueOf(j7), "Params already contained engagement");
        } else {
            j7 = 0;
        }
        bundle.putLong("_et", j + j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(String str, com.google.android.gms.internal.measurement.L l7) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning string value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(com.google.android.gms.internal.measurement.L l7, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning long value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(com.google.android.gms.internal.measurement.L l7, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning int value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z(com.google.android.gms.internal.measurement.L l7, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning byte array to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(com.google.android.gms.internal.measurement.L l7, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z5);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning boolean value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(com.google.android.gms.internal.measurement.L l7, Bundle bundle) {
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning bundle value to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0(com.google.android.gms.internal.measurement.L l7, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l7.a(bundle);
        } catch (RemoteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error returning bundle list to wrapper");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g0() {
        byte[] bArr = new byte[16];
        l0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object i0(int i, Object obj, boolean z5, boolean z6) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return t(obj.toString(), z5, i);
        }
        if (!z6) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleP = P((Bundle) parcelable);
                if (!bundleP.isEmpty()) {
                    arrayList.add(bundleP);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j0(String str) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if ("_ldl".equals(str)) {
            c0323t0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c0323t0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c0323t0.getClass();
            return 100;
        }
        c0323t0.getClass();
        return 36;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long k0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f4688u;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f4688u;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((C0323t0) this.f4346r).f5052A.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f4689v + 1;
            this.f4689v = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SecureRandom l0() {
        o();
        if (this.f4687t == null) {
            this.f4687t = new SecureRandom();
        }
        return this.f4687t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle n0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE, queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o0(String str, String str2) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str2 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4672y.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4672y.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4672y.d(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                X x9 = c0323t0.f5077v;
                C0323t0.l(x9);
                x9.f4672y.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.E0
    public final boolean p() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p0(String str, String str2) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str2 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4672y.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4672y.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                X x8 = c0323t0.f5077v;
                C0323t0.l(x8);
                x8.f4672y.d(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                X x9 = c0323t0.f5077v;
                C0323t0.l(x9);
                x9.f4672y.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q0(String str, String[] strArr, String[] strArr2, String str2) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str2 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4672y.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f4686z[i])) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4672y.d(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !N(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && N(str2, strArr2)) {
            return true;
        }
        X x8 = c0323t0.f5077v;
        C0323t0.l(x8);
        x8.f4672y.d(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r0(String str, String str2, int i) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str2 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4672y.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        X x7 = c0323t0.f5077v;
        C0323t0.l(x7);
        x7.f4672y.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s(String str) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (TextUtils.isEmpty(str)) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4672y.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC1887A.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        X x7 = c0323t0.f5077v;
        C0323t0.l(x7);
        x7.f4672y.c(X.w(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int s0(String str) {
        if (!p0("event", str)) {
            return 2;
        }
        if (!q0("event", K0.f4502a, K0.f4503b, str)) {
            return 13;
        }
        ((C0323t0) this.f4346r).getClass();
        return !r0("event", str, 40) ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t0(String str) {
        if (!p0("user property", str)) {
            return 6;
        }
        if (!q0("user property", K0.i, null, str)) {
            return 15;
        }
        ((C0323t0) this.f4346r).getClass();
        return !r0("user property", str, 24) ? 6 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            r12 = this;
            r3 = r16
            java.lang.Object r4 = r12.f4346r
            r6 = r4
            O3.t0 r6 = (O3.C0323t0) r6
            r12.o()
            boolean r4 = w0(r15)
            java.lang.String r5 = "param"
            r7 = 0
            if (r4 == 0) goto L9c
            if (r19 == 0) goto L9e
            java.lang.String[] r4 = O3.K0.f4507g
            boolean r4 = N(r14, r4)
            if (r4 != 0) goto L20
            r1 = 20
            return r1
        L20:
            O3.w1 r4 = r6.o()
            r4.o()
            r4.p()
            boolean r8 = r4.v()
            if (r8 != 0) goto L31
            goto L46
        L31:
            java.lang.Object r4 = r4.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            O3.Y1 r4 = r4.f5080y
            O3.C0323t0.j(r4)
            int r4 = r4.U()
            r8 = 200900(0x310c4, float:2.81521E-40)
            if (r4 >= r8) goto L46
            r1 = 25
            return r1
        L46:
            boolean r4 = r15 instanceof android.os.Parcelable[]
            if (r4 == 0) goto L4f
            r8 = r15
            android.os.Parcelable[] r8 = (android.os.Parcelable[]) r8
            int r8 = r8.length
            goto L5a
        L4f:
            boolean r8 = r15 instanceof java.util.ArrayList
            if (r8 == 0) goto L9c
            r8 = r15
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
        L5a:
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 <= r9) goto L9c
            O3.X r10 = r6.f5077v
            O3.C0323t0.l(r10)
            O3.V r10 = r10.f4663B
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.e(r11, r5, r14, r8)
            r8 = 17
            if (r4 == 0) goto L82
            r4 = r15
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r10 = r4.length
            if (r10 <= r9) goto La1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            r3.putParcelableArray(r14, r4)
            goto La1
        L82:
            boolean r4 = r15 instanceof java.util.ArrayList
            if (r4 == 0) goto La1
            r4 = r15
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r10 = r4.size()
            if (r10 <= r9) goto La1
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List r4 = r4.subList(r7, r9)
            r10.<init>(r4)
            r3.putParcelableArrayList(r14, r10)
            goto La1
        L9c:
            r8 = r7
            goto La1
        L9e:
            r1 = 21
            return r1
        La1:
            boolean r3 = M(r13)
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 != 0) goto Lb6
            boolean r3 = M(r14)
            if (r3 == 0) goto Lb0
            goto Lb6
        Lb0:
            O3.g r3 = r6.f5075t
            r3.getClass()
            goto Lc1
        Lb6:
            O3.g r3 = r6.f5075t
            r3.getClass()
            r3 = 256(0x100, float:3.59E-43)
            int r4 = java.lang.Math.max(r4, r3)
        Lc1:
            boolean r3 = r12.x0(r5, r14, r4, r15)
            if (r3 == 0) goto Lc9
            goto L149
        Lc9:
            if (r19 == 0) goto L14a
            boolean r3 = r15 instanceof android.os.Bundle
            if (r3 == 0) goto Ldd
            r3 = r15
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.y0(r1, r2, r3, r4, r5)
            return r8
        Ldd:
            boolean r0 = r15 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L10e
            r9 = r15
            android.os.Parcelable[] r9 = (android.os.Parcelable[]) r9
            int r10 = r9.length
        Le5:
            if (r7 >= r10) goto L149
            r0 = r9[r7]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto Lfe
            O3.X r1 = r6.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4663B
            java.lang.Class r0 = r0.getClass()
            java.lang.String r3 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.d(r0, r14, r3)
            goto L14a
        Lfe:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.y0(r1, r2, r3, r4, r5)
            int r7 = r7 + 1
            goto Le5
        L10e:
            boolean r0 = r15 instanceof java.util.ArrayList
            if (r0 == 0) goto L14a
            r9 = r15
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r10 = r9.size()
        L119:
            if (r7 >= r10) goto L149
            java.lang.Object r0 = r9.get(r7)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L139
            O3.X r1 = r6.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4663B
            if (r0 == 0) goto L131
            java.lang.Class r0 = r0.getClass()
            goto L133
        L131:
            java.lang.String r0 = "null"
        L133:
            java.lang.String r3 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.d(r0, r14, r3)
            goto L14a
        L139:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.y0(r1, r2, r3, r4, r5)
            int r7 = r7 + 1
            goto L119
        L149:
            return r8
        L14a:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Y1.u(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int u0(String str) {
        if (!o0("event param", str)) {
            return 3;
        }
        if (!q0("event param", null, null, str)) {
            return 14;
        }
        ((C0323t0) this.f4346r).getClass();
        return !r0("event param", str, 40) ? 3 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object v(Object obj, String str) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        int iMax = 500;
        if ("_ev".equals(str)) {
            c0323t0.f5075t.getClass();
            return i0(Math.max(500, 256), obj, true, true);
        }
        if (M(str)) {
            c0323t0.f5075t.getClass();
            iMax = Math.max(500, 256);
        } else {
            c0323t0.f5075t.getClass();
        }
        return i0(iMax, obj, false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v0(String str) {
        if (!p0("event param", str)) {
            return 3;
        }
        if (!q0("event param", null, null, str)) {
            return 14;
        }
        ((C0323t0) this.f4346r).getClass();
        return !r0("event param", str, 40) ? 3 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle w(String str, Bundle bundle, List list, boolean z5) {
        int iU0;
        String str2;
        List list2 = list;
        boolean zN = N(str, K0.f4505d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        Q q7 = c0323t0.f5081z;
        Y1 y12 = ((C0323t0) c0284g.f4346r).f5080y;
        C0323t0.j(y12);
        int i = y12.T(201500000) ? 100 : 25;
        int i7 = 0;
        boolean z6 = false;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                iU0 = !z5 ? u0(str4) : 0;
                if (iU0 == 0) {
                    iU0 = v0(str4);
                }
            } else {
                iU0 = 0;
            }
            if (iU0 != 0) {
                A(bundle2, iU0, str4, iU0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int iU = u(str, str4, bundle.get(str4), bundle2, list2, z5, zN);
                if (iU == 17) {
                    A(bundle2, 17, str4, Boolean.FALSE);
                } else if (iU != 0 && !"_ev".equals(str4)) {
                    A(bundle2, iU, iU == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (m0(str4)) {
                    i7++;
                    if (i7 > i) {
                        if (c0323t0.f5075t.y(str3, F.f4428f1) && z6) {
                            str2 = str3;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            X x6 = c0323t0.f5077v;
                            C0323t0.l(x6);
                            str2 = str3;
                            x6.f4672y.d(q7.a(str), q7.e(bundle), string);
                        }
                        h0(5, bundle2);
                        bundle2.remove(str4);
                        z6 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(Y y6, int i) {
        Bundle bundle = (Bundle) y6.f4683e;
        int i7 = 0;
        boolean z5 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m0(str) && (i7 = i7 + 1) > i) {
                C0323t0 c0323t0 = (C0323t0) this.f4346r;
                C0284g c0284g = c0323t0.f5075t;
                Q q7 = c0323t0.f5081z;
                if (!c0284g.y(null, F.f4428f1) || !z5) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    X x6 = c0323t0.f5077v;
                    C0323t0.l(x6);
                    x6.f4672y.d(q7.a((String) y6.f4681c), q7.e(bundle), string);
                    h0(5, bundle);
                }
                bundle.remove(str);
                z5 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4663B.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(Parcelable[] parcelableArr, int i) {
        AbstractC1887A.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i7 = 0;
            boolean z5 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m0(str) && !N(str, K0.f4508h) && (i7 = i7 + 1) > i) {
                    C0323t0 c0323t0 = (C0323t0) this.f4346r;
                    C0284g c0284g = c0323t0.f5075t;
                    Q q7 = c0323t0.f5081z;
                    if (!c0284g.y(null, F.f4428f1) || !z5) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        V v6 = x6.f4672y;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        v6.d(q7.b(str), q7.e(bundle), sb.toString());
                    }
                    h0(28, bundle);
                    bundle.remove(str);
                    z5 = true;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0(String str, String str2, Bundle bundle, List list, boolean z5) {
        int iU0;
        String str3;
        int iU;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        X x6 = c0323t0.f5077v;
        Q q7 = c0323t0.f5081z;
        Y1 y12 = ((C0323t0) c0284g.f4346r).f5080y;
        C0323t0.j(y12);
        int i = true != y12.T(231100000) ? 0 : 35;
        int i7 = 0;
        boolean z6 = false;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                iU0 = !z5 ? u0(str4) : 0;
                if (iU0 == 0) {
                    iU0 = v0(str4);
                }
            } else {
                iU0 = 0;
            }
            if (iU0 != 0) {
                A(bundle, iU0, str4, iU0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (w0(bundle.get(str4))) {
                    C0323t0.l(x6);
                    x6.f4663B.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iU = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    iU = u(str, str4, bundle.get(str4), bundle, list2, z5, false);
                }
                if (iU != 0 && !"_ev".equals(str4)) {
                    A(bundle, iU, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m0(str4) && !N(str4, K0.f4508h)) {
                    int i8 = i7 + 1;
                    if (!T(231100000)) {
                        C0323t0.l(x6);
                        x6.f4672y.d(q7.a(str), q7.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        h0(23, bundle);
                        bundle.remove(str4);
                    } else if (i8 > i) {
                        if (!c0323t0.f5075t.y(str3, F.f4428f1) || !z6) {
                            C0323t0.l(x6);
                            V v6 = x6.f4672y;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            v6.d(q7.a(str), q7.e(bundle), sb.toString());
                        }
                        h0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i7 = i8;
                        z6 = true;
                    }
                    list2 = list;
                    i7 = i8;
                }
            }
            list2 = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                Y1 y12 = ((C0323t0) this.f4346r).f5080y;
                C0323t0.j(y12);
                y12.D(bundle, str, bundle2.get(str));
            }
        }
    }
}
