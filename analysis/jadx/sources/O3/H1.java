package O3;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H4.h f4486a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        H4.b bVar = H4.d.f2174r;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        C3.a.n(24, objArr);
        f4486a = H4.d.j(24, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(com.google.android.gms.internal.measurement.W1 w12, H4.m mVar, H4.m mVar2, H4.o oVar, char[] cArr, int i, int i7, int i8, String str, String str2, String str3, boolean z5, boolean z6) {
        G1 g12;
        char c7;
        int iC = c(w12);
        if (iC > 0 && (i7 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(w12, mVar2) == com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c7 = '3';
        } else {
            if (w12 == com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i8 == 1 && oVar.f2208t.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (mVar.containsKey(w12) && (g12 = (G1) mVar.get(w12)) != null) {
                int iOrdinal = g12.ordinal();
                com.google.android.gms.internal.measurement.X1 x12 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.X1 x13 = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(w12, mVar2) == x12 ? f(w12, cArr, str3, z6) : e(w12, cArr, str2, z5);
                        }
                        if (iOrdinal == 3) {
                            return g(w12, mVar2) == x13 ? e(w12, cArr, str2, z5) : f(w12, cArr, str3, z6);
                        }
                        c7 = '0';
                    } else if (g(w12, mVar2) != x13) {
                        return f(w12, cArr, str3, z6);
                    }
                } else if (g(w12, mVar2) != x12) {
                    return e(w12, cArr, str2, z5);
                }
                c7 = '8';
            } else {
                c7 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c7;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(com.google.android.gms.internal.measurement.W1 w12) {
        if (w12 == com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (w12 == com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (w12 == com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return w12 == com.google.android.gms.internal.measurement.W1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String d(com.google.android.gms.internal.measurement.W1 w12, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < w12.zza()) ? "0" : String.valueOf(str.charAt(w12.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= w12.zza()) {
            strValueOf = String.valueOf(str2.charAt(w12.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(com.google.android.gms.internal.measurement.W1 w12, char[] cArr, String str, boolean z5) {
        char c7;
        int iC = c(w12);
        if (!z5) {
            c7 = '4';
        } else {
            if (str.length() >= w12.zza()) {
                char cCharAt = str.charAt(w12.zza() - 1);
                boolean z6 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z6;
            }
            c7 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c7;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(com.google.android.gms.internal.measurement.W1 w12, char[] cArr, String str, boolean z5) {
        char c7;
        int iC = c(w12);
        if (!z5) {
            c7 = '5';
        } else {
            if (str.length() >= w12.zza()) {
                char cCharAt = str.charAt(w12.zza() - 1);
                boolean z6 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z6;
            }
            c7 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c7;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final com.google.android.gms.internal.measurement.X1 g(com.google.android.gms.internal.measurement.W1 w12, H4.m mVar) {
        Object obj = mVar.get(w12);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.X1.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.X1) obj;
    }
}
