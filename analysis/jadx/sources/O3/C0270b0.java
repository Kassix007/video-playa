package O3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.AbstractC0846p2;
import com.google.android.gms.internal.measurement.C0769a1;
import com.google.android.gms.internal.measurement.C0773b;
import com.google.android.gms.internal.measurement.C0780c1;
import com.google.android.gms.internal.measurement.C0795f1;
import com.google.android.gms.internal.measurement.C0800g1;
import com.google.android.gms.internal.measurement.C0810i1;
import com.google.android.gms.internal.measurement.C0811i2;
import com.google.android.gms.internal.measurement.C0815j1;
import com.google.android.gms.internal.measurement.C0820k1;
import com.google.android.gms.internal.measurement.C0830m1;
import com.google.android.gms.internal.measurement.C0835n1;
import com.google.android.gms.internal.measurement.C0850q1;
import com.google.android.gms.internal.measurement.C0854r1;
import com.google.android.gms.internal.measurement.C0859s1;
import com.google.android.gms.internal.measurement.C0874v1;
import com.google.android.gms.internal.measurement.C0884x1;
import com.google.android.gms.internal.measurement.C0893z0;
import com.google.android.gms.internal.measurement.C0894z1;
import com.google.android.gms.internal.measurement.C0895z2;
import com.google.android.gms.internal.measurement.InterfaceC0875v2;
import com.google.android.gms.internal.measurement.InterfaceC0880w2;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.Y3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import x3.AbstractC1887A;
import y3.C1916b;

/* JADX INFO: renamed from: O3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0270b0 extends O1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4746u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0270b0(T1 t12, int i) {
        super(t12);
        this.f4746u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void A(StringBuilder sb, int i) {
        for (int i7 = 0; i7 < i; i7++) {
            sb.append("  ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void B(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String C(boolean z5, boolean z6, boolean z7) {
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append("Dynamic ");
        }
        if (z6) {
            sb.append("Sequence ");
        }
        if (z7) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable D(C0835n1 c0835n1) {
        if (c0835n1.r()) {
            return c0835n1.s();
        }
        if (c0835n1.t()) {
            return Long.valueOf(c0835n1.u());
        }
        if (c0835n1.x()) {
            return Double.valueOf(c0835n1.y());
        }
        if (c0835n1.A() > 0) {
            return d0((InterfaceC0880w2) c0835n1.z());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void E(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                B(builder, str3, string, set);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void F(StringBuilder sb, String str, C0874v1 c0874v1) {
        if (c0874v1 == null) {
            return;
        }
        A(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c0874v1.s() != 0) {
            A(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l7 : c0874v1.r()) {
                int i7 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i = i7;
            }
            sb.append('\n');
        }
        if (c0874v1.q() != 0) {
            A(sb, 4);
            sb.append("status: ");
            int i8 = 0;
            for (Long l8 : c0874v1.p()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (c0874v1.u() != 0) {
            A(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i10 = 0;
            for (C0810i1 c0810i1 : c0874v1.t()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(c0810i1.p() ? Integer.valueOf(c0810i1.q()) : null);
                sb.append(":");
                sb.append(c0810i1.r() ? Long.valueOf(c0810i1.s()) : null);
                i10 = i11;
            }
            sb.append("}\n");
        }
        if (c0874v1.w() != 0) {
            A(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i12 = 0;
            for (C0884x1 c0884x1 : c0874v1.v()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(c0884x1.p() ? Integer.valueOf(c0884x1.q()) : null);
                sb.append(": [");
                Iterator it = c0884x1.r().iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i14 = i15;
                }
                sb.append("]");
                i12 = i13;
            }
            sb.append("}\n");
        }
        A(sb, 3);
        sb.append("}\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        A(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void H(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.C0 c02) {
        if (c02 == null) {
            return;
        }
        A(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c02.p()) {
            int iZ = c02.z();
            G(sb, i, "comparison_type", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c02.q()) {
            G(sb, i, "match_as_float", Boolean.valueOf(c02.r()));
        }
        if (c02.s()) {
            G(sb, i, "comparison_value", c02.t());
        }
        if (c02.u()) {
            G(sb, i, "min_comparison_value", c02.v());
        }
        if (c02.w()) {
            G(sb, i, "max_comparison_value", c02.x());
        }
        A(sb, i);
        sb.append("}\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean U(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean V(InterfaceC0875v2 interfaceC0875v2, int i) {
        if (i < interfaceC0875v2.size() * 64) {
            return ((1 << (i % 64)) & ((Long) interfaceC0875v2.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList W(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i7 = 0; i7 < 64; i7++) {
                int i8 = (i * 64) + i7;
                if (i8 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i8)) {
                    j |= 1 << i7;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0846p2 b0(AbstractC0846p2 abstractC0846p2, byte[] bArr) throws C0895z2 {
        C0811i2 c0811i2Z;
        C0811i2 c0811i2 = C0811i2.f10874a;
        if (c0811i2 == null) {
            synchronized (C0811i2.class) {
                try {
                    c0811i2Z = C0811i2.f10874a;
                    if (c0811i2Z == null) {
                        P2 p22 = P2.f10684c;
                        c0811i2Z = AbstractC0836n2.Z();
                        C0811i2.f10874a = c0811i2Z;
                    }
                } finally {
                }
            }
            c0811i2 = c0811i2Z;
        }
        if (c0811i2 != null) {
            abstractC0846p2.getClass();
            abstractC0846p2.g(bArr, bArr.length, c0811i2);
            return abstractC0846p2;
        }
        abstractC0846p2.getClass();
        int length = bArr.length;
        C0811i2 c0811i22 = C0811i2.f10874a;
        P2 p23 = P2.f10684c;
        abstractC0846p2.g(bArr, length, C0811i2.f10875b);
        return abstractC0846p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c0(C0854r1 c0854r1, String str) {
        for (int i = 0; i < ((C0859s1) c0854r1.f11012r).V1(); i++) {
            if (str.equals(((C0859s1) c0854r1.f11012r).W1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle[] d0(InterfaceC0880w2 interfaceC0880w2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0880w2.iterator();
        while (it.hasNext()) {
            C0835n1 c0835n1 = (C0835n1) it.next();
            if (c0835n1 != null) {
                Bundle bundle = new Bundle();
                for (C0835n1 c0835n12 : c0835n1.z()) {
                    if (c0835n12.r()) {
                        bundle.putString(c0835n12.q(), c0835n12.s());
                    } else if (c0835n12.t()) {
                        bundle.putLong(c0835n12.q(), c0835n12.u());
                    } else if (c0835n12.x()) {
                        bundle.putDouble(c0835n12.q(), c0835n12.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap e0(Bundle bundle, boolean z5) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z6 = obj instanceof Parcelable[];
            if (z6 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z5) {
                    ArrayList arrayList = new ArrayList();
                    if (z6) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(e0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(e0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(e0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0328v s(C0773b c0773b) {
        Object obj;
        Bundle bundleT = t(c0773b.f10801c, true);
        String string = (!bundleT.containsKey("_o") || (obj = bundleT.get("_o")) == null) ? "app" : obj.toString();
        String strG = K0.g(c0773b.f10799a, K0.f4502a, K0.f4504c);
        if (strG == null) {
            strG = c0773b.f10799a;
        }
        return new C0328v(strG, new C0325u(bundleT), string, c0773b.f10800b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle t(Map map, boolean z5) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z5) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(t((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(C0815j1 c0815j1, String str, Long l7) {
        List listH = c0815j1.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((C0835n1) listH.get(i)).q())) {
                break;
            } else {
                i++;
            }
        }
        C0830m1 c0830m1B = C0835n1.B();
        c0830m1B.h(str);
        c0830m1B.j(l7.longValue());
        if (i < 0) {
            c0815j1.k(c0830m1B);
        } else {
            c0815j1.b();
            ((C0820k1) c0815j1.f11012r).A(i, (C0835n1) c0830m1B.e());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle v(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0835n1 c0835n1 = (C0835n1) it.next();
            String strQ = c0835n1.q();
            if (c0835n1.x()) {
                bundle.putDouble(strQ, c0835n1.y());
            } else if (c0835n1.v()) {
                bundle.putFloat(strQ, c0835n1.w());
            } else if (c0835n1.r()) {
                bundle.putString(strQ, c0835n1.s());
            } else if (c0835n1.t()) {
                bundle.putLong(strQ, c0835n1.u());
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0835n1 w(C0820k1 c0820k1, String str) {
        for (C0835n1 c0835n1 : c0820k1.p()) {
            if (c0835n1.q().equals(str)) {
                return c0835n1;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Serializable x(C0820k1 c0820k1, String str) {
        C0835n1 c0835n1W = w(c0820k1, str);
        if (c0835n1W == null) {
            return null;
        }
        return D(c0835n1W);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean I() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C0323t0) this.f4346r).f5072q.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void M(com.google.android.gms.internal.measurement.A1 a12, Object obj) {
        AbstractC1887A.g(obj);
        a12.b();
        ((com.google.android.gms.internal.measurement.B1) a12.f11012r).E();
        a12.b();
        ((com.google.android.gms.internal.measurement.B1) a12.f11012r).G();
        a12.b();
        ((com.google.android.gms.internal.measurement.B1) a12.f11012r).I();
        if (obj instanceof String) {
            a12.b();
            ((com.google.android.gms.internal.measurement.B1) a12.f11012r).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            a12.b();
            ((com.google.android.gms.internal.measurement.B1) a12.f11012r).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            a12.b();
            ((com.google.android.gms.internal.measurement.B1) a12.f11012r).H(dDoubleValue);
        } else {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void N(String str, P1 p12, C0850q1 c0850q1, Z z5) {
        String str2;
        URL url;
        byte[] bArrA;
        C0312p0 c0312p0;
        Map map;
        String str3 = p12.f4551a;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        try {
            url = new URI(str3).toURL();
            this.f4510s.i0();
            bArrA = c0850q1.a();
            c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            map = p12.f4552b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            c0312p0.A(new RunnableC0267a0(this, str2, url, bArrA, map, z5));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.d(X.w(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void O(C0830m1 c0830m1, Object obj) {
        c0830m1.b();
        ((C0835n1) c0830m1.f11012r).E();
        c0830m1.b();
        ((C0835n1) c0830m1.f11012r).G();
        c0830m1.b();
        ((C0835n1) c0830m1.f11012r).I();
        c0830m1.b();
        ((C0835n1) c0830m1.f11012r).L();
        if (obj instanceof String) {
            c0830m1.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0830m1.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c0830m1.b();
            ((C0835n1) c0830m1.f11012r).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0830m1 c0830m1B = C0835n1.B();
                for (String str : bundle.keySet()) {
                    C0830m1 c0830m1B2 = C0835n1.B();
                    c0830m1B2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c0830m1B2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c0830m1B2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c0830m1B2.b();
                        ((C0835n1) c0830m1B2.f11012r).H(dDoubleValue2);
                    }
                    c0830m1B.b();
                    ((C0835n1) c0830m1B.f11012r).J((C0835n1) c0830m1B2.e());
                }
                if (((C0835n1) c0830m1B.f11012r).A() > 0) {
                    arrayList.add((C0835n1) c0830m1B.e());
                }
            }
        }
        c0830m1.b();
        ((C0835n1) c0830m1.f11012r).K(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I1 P(String str, C0854r1 c0854r1, C0815j1 c0815j1, String str2) {
        int iIndexOf;
        Y3.a();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        if (!c0284g.y(str, F.f4392P0)) {
            return null;
        }
        c0323t0.f5052A.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = c0284g.u(str, F.f4460u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        T1 t12 = this.f4510s;
        Q1 q1 = t12.f4616z;
        C0300l0 c0300l0 = t12.f4607q;
        C0300l0 c0300l02 = q1.f4510s.f4607q;
        T1.S(c0300l02);
        String strB = c0300l02.B(str);
        Uri.Builder builder = new Uri.Builder();
        C0284g c0284g2 = ((C0323t0) q1.f4346r).f5075t;
        builder.scheme(c0284g2.u(str, F.f4446n0));
        if (TextUtils.isEmpty(strB)) {
            builder.authority(c0284g2.u(str, F.f4448o0));
        } else {
            String strU = c0284g2.u(str, F.f4448o0);
            StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strU).length());
            sb.append(strB);
            sb.append(".");
            sb.append(strU);
            builder.authority(sb.toString());
        }
        builder.path(c0284g2.u(str, F.f4450p0));
        B(builder, "gmp_app_id", ((C0859s1) c0854r1.f11012r).E(), setUnmodifiableSet);
        c0284g.t();
        B(builder, "gmp_version", String.valueOf(130000L), setUnmodifiableSet);
        String strY = ((C0859s1) c0854r1.f11012r).y();
        E e7 = F.f4398S0;
        if (c0284g.y(str, e7)) {
            T1.S(c0300l0);
            if (c0300l0.H(str)) {
                strY = "";
            }
        }
        B(builder, "app_instance_id", strY, setUnmodifiableSet);
        B(builder, "rdid", ((C0859s1) c0854r1.f11012r).v(), setUnmodifiableSet);
        B(builder, "bundle_id", c0854r1.o(), setUnmodifiableSet);
        String strL = c0815j1.l();
        String strG = K0.g(strL, K0.f4504c, K0.f4502a);
        if (true != TextUtils.isEmpty(strG)) {
            strL = strG;
        }
        B(builder, "app_event_name", strL, setUnmodifiableSet);
        B(builder, "app_version", String.valueOf(((C0859s1) c0854r1.f11012r).K()), setUnmodifiableSet);
        String strI2 = ((C0859s1) c0854r1.f11012r).i2();
        if (c0284g.y(str, e7)) {
            T1.S(c0300l0);
            if (c0300l0.G(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        B(builder, "os_version", strI2, setUnmodifiableSet);
        B(builder, "timestamp", String.valueOf(c0815j1.m()), setUnmodifiableSet);
        if (((C0859s1) c0854r1.f11012r).x()) {
            B(builder, "lat", "1", setUnmodifiableSet);
        }
        B(builder, "privacy_sandbox_version", String.valueOf(((C0859s1) c0854r1.f11012r).G0()), setUnmodifiableSet);
        B(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        B(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        B(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C0835n1> listH = c0815j1.h();
        Bundle bundle = new Bundle();
        for (C0835n1 c0835n1 : listH) {
            String strQ = c0835n1.q();
            if (c0835n1.x()) {
                bundle.putString(strQ, String.valueOf(c0835n1.y()));
            } else if (c0835n1.v()) {
                bundle.putString(strQ, String.valueOf(c0835n1.w()));
            } else if (c0835n1.r()) {
                bundle.putString(strQ, c0835n1.s());
            } else if (c0835n1.t()) {
                bundle.putString(strQ, String.valueOf(c0835n1.u()));
            }
        }
        E(builder, c0284g.u(str, F.f4458t0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.B1> listUnmodifiableList = Collections.unmodifiableList(((C0859s1) c0854r1.f11012r).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.B1 b12 : listUnmodifiableList) {
            String strR = b12.r();
            if (b12.y()) {
                bundle2.putString(strR, String.valueOf(b12.z()));
            } else if (b12.w()) {
                bundle2.putString(strR, String.valueOf(b12.x()));
            } else if (b12.s()) {
                bundle2.putString(strR, b12.t());
            } else if (b12.u()) {
                bundle2.putString(strR, String.valueOf(b12.v()));
            }
        }
        E(builder, c0284g.u(str, F.f4456s0).split("\\|"), bundle2, setUnmodifiableSet);
        B(builder, "dma", true != ((C0859s1) c0854r1.f11012r).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((C0859s1) c0854r1.f11012r).F0().isEmpty()) {
            B(builder, "dma_cps", ((C0859s1) c0854r1.f11012r).F0(), setUnmodifiableSet);
        }
        if (((C0859s1) c0854r1.f11012r).L0()) {
            com.google.android.gms.internal.measurement.X0 x0M0 = ((C0859s1) c0854r1.f11012r).M0();
            if (!x0M0.z().isEmpty()) {
                B(builder, "dl_gclid", x0M0.z(), setUnmodifiableSet);
            }
            if (!x0M0.B().isEmpty()) {
                B(builder, "dl_gbraid", x0M0.B(), setUnmodifiableSet);
            }
            if (!x0M0.D().isEmpty()) {
                B(builder, "dl_gs", x0M0.D(), setUnmodifiableSet);
            }
            if (x0M0.F() > 0) {
                B(builder, "dl_ss_ts", String.valueOf(x0M0.F()), setUnmodifiableSet);
            }
            if (!x0M0.H().isEmpty()) {
                B(builder, "mr_gclid", x0M0.H(), setUnmodifiableSet);
            }
            if (!x0M0.J().isEmpty()) {
                B(builder, "mr_gbraid", x0M0.J(), setUnmodifiableSet);
            }
            if (!x0M0.L().isEmpty()) {
                B(builder, "mr_gs", x0M0.L(), setUnmodifiableSet);
            }
            if (x0M0.N() > 0) {
                B(builder, "mr_click_ts", String.valueOf(x0M0.N()), setUnmodifiableSet);
            }
        }
        return new I1(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0820k1 Q(r rVar) {
        C0815j1 c0815j1Z = C0820k1.z();
        long j = rVar.f5035e;
        c0815j1Z.b();
        ((C0820k1) c0815j1Z.f11012r).H(j);
        C0325u c0325u = rVar.f;
        Objects.requireNonNull(c0325u);
        Bundle bundle = c0325u.f5085q;
        for (String str : bundle.keySet()) {
            C0830m1 c0830m1B = C0835n1.B();
            c0830m1B.h(str);
            Object obj = bundle.get(str);
            AbstractC1887A.g(obj);
            O(c0830m1B, obj);
            c0815j1Z.k(c0830m1B);
        }
        String str2 = rVar.f5033c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            C0830m1 c0830m1B2 = C0835n1.B();
            c0830m1B2.h("_o");
            c0830m1B2.i(str2);
            c0815j1Z.j((C0835n1) c0830m1B2.e());
        }
        return (C0820k1) c0815j1Z.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String R(C0850q1 c0850q1) {
        C0769a1 c0769a1I0;
        StringBuilder sbQ = C0.S.q("\nbatch {\n");
        if (c0850q1.u()) {
            G(sbQ, 0, "upload_subdomain", c0850q1.v());
        }
        if (c0850q1.s()) {
            G(sbQ, 0, "sgtm_join_id", c0850q1.t());
        }
        for (C0859s1 c0859s1 : c0850q1.p()) {
            if (c0859s1 != null) {
                A(sbQ, 1);
                sbQ.append("bundle {\n");
                if (c0859s1.P()) {
                    G(sbQ, 1, "protocol_version", Integer.valueOf(c0859s1.P0()));
                }
                C0323t0 c0323t0 = (C0323t0) this.f4346r;
                C0284g c0284g = c0323t0.f5075t;
                Q q7 = c0323t0.f5081z;
                if (c0284g.y(c0859s1.p(), F.f4386M0) && c0859s1.v0()) {
                    G(sbQ, 1, "session_stitching_token", c0859s1.w0());
                }
                G(sbQ, 1, "platform", c0859s1.h2());
                if (c0859s1.r()) {
                    G(sbQ, 1, "gmp_version", Long.valueOf(c0859s1.s()));
                }
                if (c0859s1.t()) {
                    G(sbQ, 1, "uploading_gmp_version", Long.valueOf(c0859s1.u()));
                }
                if (c0859s1.r0()) {
                    G(sbQ, 1, "dynamite_version", Long.valueOf(c0859s1.s0()));
                }
                if (c0859s1.L()) {
                    G(sbQ, 1, "config_version", Long.valueOf(c0859s1.M()));
                }
                G(sbQ, 1, "gmp_app_id", c0859s1.E());
                G(sbQ, 1, "app_id", c0859s1.p());
                G(sbQ, 1, "app_version", c0859s1.q());
                if (c0859s1.J()) {
                    G(sbQ, 1, "app_version_major", Integer.valueOf(c0859s1.K()));
                }
                G(sbQ, 1, "firebase_instance_id", c0859s1.I());
                if (c0859s1.z()) {
                    G(sbQ, 1, "dev_cert_hash", Long.valueOf(c0859s1.A()));
                }
                G(sbQ, 1, "app_store", c0859s1.n2());
                if (c0859s1.X1()) {
                    G(sbQ, 1, "upload_timestamp_millis", Long.valueOf(c0859s1.Y1()));
                }
                if (c0859s1.Z1()) {
                    G(sbQ, 1, "start_timestamp_millis", Long.valueOf(c0859s1.a2()));
                }
                if (c0859s1.b2()) {
                    G(sbQ, 1, "end_timestamp_millis", Long.valueOf(c0859s1.c2()));
                }
                if (c0859s1.d2()) {
                    G(sbQ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0859s1.e2()));
                }
                if (c0859s1.f2()) {
                    G(sbQ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0859s1.g2()));
                }
                G(sbQ, 1, "app_instance_id", c0859s1.y());
                G(sbQ, 1, "resettable_device_id", c0859s1.v());
                G(sbQ, 1, "ds_id", c0859s1.O());
                if (c0859s1.w()) {
                    G(sbQ, 1, "limited_ad_tracking", Boolean.valueOf(c0859s1.x()));
                }
                G(sbQ, 1, "os_version", c0859s1.i2());
                G(sbQ, 1, "device_model", c0859s1.j2());
                G(sbQ, 1, "user_default_language", c0859s1.k2());
                if (c0859s1.l2()) {
                    G(sbQ, 1, "time_zone_offset_minutes", Integer.valueOf(c0859s1.m2()));
                }
                if (c0859s1.B()) {
                    G(sbQ, 1, "bundle_sequential_index", Integer.valueOf(c0859s1.C()));
                }
                if (c0859s1.J0()) {
                    G(sbQ, 1, "delivery_index", Integer.valueOf(c0859s1.K0()));
                }
                if (c0859s1.F()) {
                    G(sbQ, 1, "service_upload", Boolean.valueOf(c0859s1.G()));
                }
                G(sbQ, 1, "health_monitor", c0859s1.D());
                if (c0859s1.p0()) {
                    G(sbQ, 1, "retry_counter", Integer.valueOf(c0859s1.q0()));
                }
                if (c0859s1.t0()) {
                    G(sbQ, 1, "consent_signals", c0859s1.u0());
                }
                if (c0859s1.C0()) {
                    G(sbQ, 1, "is_dma_region", Boolean.valueOf(c0859s1.D0()));
                }
                if (c0859s1.E0()) {
                    G(sbQ, 1, "core_platform_services", c0859s1.F0());
                }
                if (c0859s1.A0()) {
                    G(sbQ, 1, "consent_diagnostics", c0859s1.B0());
                }
                if (c0859s1.x0()) {
                    G(sbQ, 1, "target_os_version", Long.valueOf(c0859s1.y0()));
                }
                Y3.a();
                if (c0323t0.f5075t.y(c0859s1.p(), F.f4392P0)) {
                    G(sbQ, 1, "ad_services_version", Integer.valueOf(c0859s1.G0()));
                    if (c0859s1.H0() && (c0769a1I0 = c0859s1.I0()) != null) {
                        A(sbQ, 2);
                        sbQ.append("attribution_eligibility_status {\n");
                        G(sbQ, 2, "eligible", Boolean.valueOf(c0769a1I0.p()));
                        G(sbQ, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c0769a1I0.q()));
                        G(sbQ, 2, "pre_r", Boolean.valueOf(c0769a1I0.r()));
                        G(sbQ, 2, "r_extensions_too_old", Boolean.valueOf(c0769a1I0.s()));
                        G(sbQ, 2, "adservices_extension_too_old", Boolean.valueOf(c0769a1I0.t()));
                        G(sbQ, 2, "ad_storage_not_allowed", Boolean.valueOf(c0769a1I0.u()));
                        G(sbQ, 2, "measurement_manager_disabled", Boolean.valueOf(c0769a1I0.v()));
                        A(sbQ, 2);
                        sbQ.append("}\n");
                    }
                }
                if (c0859s1.L0()) {
                    com.google.android.gms.internal.measurement.X0 x0M0 = c0859s1.M0();
                    A(sbQ, 2);
                    sbQ.append("ad_campaign_info {\n");
                    if (x0M0.y()) {
                        G(sbQ, 2, "deep_link_gclid", x0M0.z());
                    }
                    if (x0M0.A()) {
                        G(sbQ, 2, "deep_link_gbraid", x0M0.B());
                    }
                    if (x0M0.C()) {
                        G(sbQ, 2, "deep_link_gad_source", x0M0.D());
                    }
                    if (x0M0.E()) {
                        G(sbQ, 2, "deep_link_session_millis", Long.valueOf(x0M0.F()));
                    }
                    if (x0M0.G()) {
                        G(sbQ, 2, "market_referrer_gclid", x0M0.H());
                    }
                    if (x0M0.I()) {
                        G(sbQ, 2, "market_referrer_gbraid", x0M0.J());
                    }
                    if (x0M0.K()) {
                        G(sbQ, 2, "market_referrer_gad_source", x0M0.L());
                    }
                    if (x0M0.M()) {
                        G(sbQ, 2, "market_referrer_click_millis", Long.valueOf(x0M0.N()));
                    }
                    A(sbQ, 2);
                    sbQ.append("}\n");
                }
                if (c0859s1.Q()) {
                    G(sbQ, 1, "batching_timestamp_millis", Long.valueOf(c0859s1.R()));
                }
                if (c0859s1.N0()) {
                    C0894z1 c0894z1O0 = c0859s1.O0();
                    A(sbQ, 2);
                    sbQ.append("sgtm_diagnostics {\n");
                    int iT = c0894z1O0.t();
                    G(sbQ, 2, "upload_type", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    G(sbQ, 2, "client_upload_eligibility", C0.S.y(c0894z1O0.p()));
                    int iU = c0894z1O0.u();
                    G(sbQ, 2, "service_upload_eligibility", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    A(sbQ, 2);
                    sbQ.append("}\n");
                }
                if (c0859s1.S()) {
                    C0800g1 c0800g1T = c0859s1.T();
                    A(sbQ, 2);
                    sbQ.append("consent_info_extra {\n");
                    for (C0795f1 c0795f1 : c0800g1T.p()) {
                        A(sbQ, 3);
                        sbQ.append("limited_data_modes {\n");
                        int iQ = c0795f1.q();
                        G(sbQ, 3, "type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iR = c0795f1.r();
                        G(sbQ, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        A(sbQ, 3);
                        sbQ.append("}\n");
                    }
                    A(sbQ, 2);
                    sbQ.append("}\n");
                }
                InterfaceC0880w2<com.google.android.gms.internal.measurement.B1> interfaceC0880w2U1 = c0859s1.U1();
                if (interfaceC0880w2U1 != null) {
                    for (com.google.android.gms.internal.measurement.B1 b12 : interfaceC0880w2U1) {
                        if (b12 != null) {
                            A(sbQ, 2);
                            sbQ.append("user_property {\n");
                            G(sbQ, 2, "set_timestamp_millis", b12.p() ? Long.valueOf(b12.q()) : null);
                            G(sbQ, 2, "name", q7.c(b12.r()));
                            G(sbQ, 2, "string_value", b12.t());
                            G(sbQ, 2, "int_value", b12.u() ? Long.valueOf(b12.v()) : null);
                            G(sbQ, 2, "double_value", b12.y() ? Double.valueOf(b12.z()) : null);
                            A(sbQ, 2);
                            sbQ.append("}\n");
                        }
                    }
                }
                InterfaceC0880w2<C0780c1> interfaceC0880w2H = c0859s1.H();
                if (interfaceC0880w2H != null) {
                    for (C0780c1 c0780c1 : interfaceC0880w2H) {
                        if (c0780c1 != null) {
                            A(sbQ, 2);
                            sbQ.append("audience_membership {\n");
                            if (c0780c1.p()) {
                                G(sbQ, 2, "audience_id", Integer.valueOf(c0780c1.q()));
                            }
                            if (c0780c1.u()) {
                                G(sbQ, 2, "new_audience", Boolean.valueOf(c0780c1.v()));
                            }
                            F(sbQ, "current_data", c0780c1.r());
                            if (c0780c1.s()) {
                                F(sbQ, "previous_data", c0780c1.t());
                            }
                            A(sbQ, 2);
                            sbQ.append("}\n");
                        }
                    }
                }
                List<C0820k1> listP1 = c0859s1.P1();
                if (listP1 != null) {
                    for (C0820k1 c0820k1 : listP1) {
                        if (c0820k1 != null) {
                            A(sbQ, 2);
                            sbQ.append("event {\n");
                            G(sbQ, 2, "name", q7.a(c0820k1.s()));
                            if (c0820k1.t()) {
                                G(sbQ, 2, "timestamp_millis", Long.valueOf(c0820k1.u()));
                            }
                            if (c0820k1.v()) {
                                G(sbQ, 2, "previous_timestamp_millis", Long.valueOf(c0820k1.w()));
                            }
                            if (c0820k1.x()) {
                                G(sbQ, 2, "count", Integer.valueOf(c0820k1.y()));
                            }
                            if (c0820k1.q() != 0) {
                                y(sbQ, 2, (InterfaceC0880w2) c0820k1.p());
                            }
                            A(sbQ, 2);
                            sbQ.append("}\n");
                        }
                    }
                }
                A(sbQ, 1);
                sbQ.append("}\n");
            }
        }
        sbQ.append("} // End-of-batch\n");
        return sbQ.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String S(com.google.android.gms.internal.measurement.E0 e02) {
        StringBuilder sbQ = C0.S.q("\nproperty_filter {\n");
        if (e02.p()) {
            G(sbQ, 0, "filter_id", Integer.valueOf(e02.q()));
        }
        G(sbQ, 0, "property_name", ((C0323t0) this.f4346r).f5081z.c(e02.r()));
        String strC = C(e02.t(), e02.u(), e02.w());
        if (!strC.isEmpty()) {
            G(sbQ, 0, "filter_type", strC);
        }
        z(sbQ, 1, e02.s());
        sbQ.append("}\n");
        return sbQ.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Parcelable T(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (C1916b unused) {
                X x6 = ((C0323t0) this.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4670w.b("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List X(InterfaceC0875v2 interfaceC0875v2, List list) {
        int i;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        ArrayList arrayList = new ArrayList(interfaceC0875v2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4673z.d(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i7 = size2;
            i = size;
            size = i7;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean Y(long j, long j7) {
        if (j == 0 || j7 <= 0) {
            return true;
        }
        ((C0323t0) this.f4346r).f5052A.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long Z(byte[] bArr) {
        AbstractC1887A.g(bArr);
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        Y1 y12 = c0323t0.f5080y;
        C0323t0.j(y12);
        y12.o();
        MessageDigest messageDigestF = Y1.F();
        if (messageDigestF != null) {
            return Y1.G(messageDigestF.digest(bArr));
        }
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4670w.b("Failed to get MD5");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] a0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(e7, "Failed to gzip content");
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.O1
    public final void r() {
        int i = this.f4746u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(StringBuilder sb, int i, InterfaceC0880w2 interfaceC0880w2) {
        if (interfaceC0880w2 == null) {
            return;
        }
        int i7 = i + 1;
        Iterator it = interfaceC0880w2.iterator();
        while (it.hasNext()) {
            C0835n1 c0835n1 = (C0835n1) it.next();
            if (c0835n1 != null) {
                A(sb, i7);
                sb.append("param {\n");
                G(sb, i7, "name", c0835n1.p() ? ((C0323t0) this.f4346r).f5081z.b(c0835n1.q()) : null);
                G(sb, i7, "string_value", c0835n1.r() ? c0835n1.s() : null);
                G(sb, i7, "int_value", c0835n1.t() ? Long.valueOf(c0835n1.u()) : null);
                G(sb, i7, "double_value", c0835n1.x() ? Double.valueOf(c0835n1.y()) : null);
                if (c0835n1.A() > 0) {
                    y(sb, i7, (InterfaceC0880w2) c0835n1.z());
                }
                A(sb, i7);
                sb.append("}\n");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z(StringBuilder sb, int i, C0893z0 c0893z0) {
        String str;
        if (c0893z0 == null) {
            return;
        }
        A(sb, i);
        sb.append("filter {\n");
        if (c0893z0.t()) {
            G(sb, i, "complement", Boolean.valueOf(c0893z0.u()));
        }
        if (c0893z0.v()) {
            G(sb, i, "param_name", ((C0323t0) this.f4346r).f5081z.b(c0893z0.w()));
        }
        if (c0893z0.p()) {
            int i7 = i + 1;
            com.google.android.gms.internal.measurement.F0 f0Q = c0893z0.q();
            if (f0Q != null) {
                A(sb, i7);
                sb.append("string_filter {\n");
                if (f0Q.p()) {
                    switch (f0Q.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    G(sb, i7, "match_type", str);
                }
                if (f0Q.q()) {
                    G(sb, i7, "expression", f0Q.r());
                }
                if (f0Q.s()) {
                    G(sb, i7, "case_sensitive", Boolean.valueOf(f0Q.t()));
                }
                if (f0Q.v() > 0) {
                    A(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : f0Q.u()) {
                        A(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                A(sb, i7);
                sb.append("}\n");
            }
        }
        if (c0893z0.r()) {
            H(sb, i + 1, "number_filter", c0893z0.s());
        }
        A(sb, i);
        sb.append("}\n");
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void L() {
    }
}
