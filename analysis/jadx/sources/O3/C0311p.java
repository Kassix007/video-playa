package O3;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: renamed from: O3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311p {
    public static final C0311p f = new C0311p((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f5007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f5009e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0311p(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(I0.class);
        this.f5009e = enumMap;
        enumMap.put(I0.AD_USER_DATA, bool == null ? G0.UNINITIALIZED : bool.booleanValue() ? G0.GRANTED : G0.DENIED);
        this.f5005a = i;
        this.f5006b = d();
        this.f5007c = bool2;
        this.f5008d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0311p b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(I0.class);
        I0[] i0Arr = H0.DMA.f4485q;
        int length = i0Arr.length;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            enumMap.put(i0Arr[i8], J0.e(strArrSplit[i7].charAt(0)));
            i8++;
            i7++;
        }
        return new C0311p(enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0311p c(int i, Bundle bundle) {
        if (bundle == null) {
            return new C0311p((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(I0.class);
        for (I0 i02 : H0.DMA.f4485q) {
            enumMap.put(i02, J0.d(bundle.getString(i02.f4492q)));
        }
        return new C0311p(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G0 a() {
        G0 g02 = (G0) this.f5009e.get(I0.AD_USER_DATA);
        return g02 == null ? G0.UNINITIALIZED : g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5005a);
        for (I0 i02 : H0.DMA.f4485q) {
            sb.append(":");
            sb.append(J0.h((G0) this.f5009e.get(i02)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0311p)) {
            return false;
        }
        C0311p c0311p = (C0311p) obj;
        if (this.f5006b.equalsIgnoreCase(c0311p.f5006b) && Objects.equals(this.f5007c, c0311p.f5007c)) {
            return Objects.equals(this.f5008d, c0311p.f5008d);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f5007c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f5008d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f5006b.hashCode() + (i * 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(J0.a(this.f5005a));
        for (I0 i02 : H0.DMA.f4485q) {
            sb.append(",");
            sb.append(i02.f4492q);
            sb.append("=");
            G0 g02 = (G0) this.f5009e.get(i02);
            if (g02 == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = g02.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f5007c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f5008d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C0311p(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(I0.class);
        this.f5009e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f5005a = i;
        this.f5006b = d();
        this.f5007c = bool;
        this.f5008d = str;
    }
}
