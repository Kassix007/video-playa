package I2;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2371a = new l(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static B a(String str) {
        String str2 = q6.x.f16093r;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new B(sb.toString(), str2, "file", null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Drawable b(n nVar, Resources resources) {
        return nVar instanceof h ? ((h) nVar).f2360a : nVar instanceof C0167a ? new BitmapDrawable(resources, ((C0167a) nVar).f2339a) : new o(0, nVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final n c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C0167a(((BitmapDrawable) drawable).getBitmap()) : new h(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object d(U2.g gVar, l lVar) {
        Object obj = gVar.f7671q.f2367a.get(lVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = gVar.f7673s.f7652n.f2367a.get(lVar);
        return obj2 == null ? lVar.f2365a : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object e(U2.n nVar, l lVar) {
        Object obj = nVar.j.f2367a.get(lVar);
        return obj == null ? lVar.f2365a : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f(B b7) {
        List listG = g(b7);
        String str = b7.f2335b;
        if (listG.isEmpty()) {
            return null;
        }
        String str2 = b7.f2338e;
        kotlin.jvm.internal.m.b(str2);
        if (!J5.t.G0(str2, str, false)) {
            str = "";
        }
        return n5.l.q0(listG, b7.f2335b, str, null, null, 60);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List g(B b7) {
        String str = b7.f2338e;
        if (str == null) {
            return n5.s.f15299q;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i7 = i + 1;
            int iR0 = J5.m.R0(str, '/', i7, 4);
            if (iR0 == -1) {
                iR0 = str.length();
            }
            String strSubstring = str.substring(i7, iR0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iR0;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String h(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i7 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i7) {
                    return str;
                }
                if (i >= length) {
                    K1.i(0, i7, bArr.length);
                    return new String(bArr, 0, i7, J5.a.f2809a);
                }
            } else if (str.charAt(i) == '%') {
                int i8 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i8);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    I1.M(16);
                    bArr[i7] = (byte) Integer.parseInt(strSubstring, 16);
                    i7++;
                    i = i8;
                } catch (NumberFormatException unused) {
                    bArr[i7] = (byte) str.charAt(i);
                    i7++;
                    i++;
                }
            }
            bArr[i7] = (byte) str.charAt(i);
            i7++;
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static B i(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = q6.x.f16093r;
        String strE0 = !kotlin.jvm.internal.m.a(str2, "/") ? J5.t.E0(str, str2, "/") : str;
        int i = 0;
        boolean z5 = true;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (i < strE0.length()) {
            char cCharAt = strE0.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i9 == -1 && i7 == -1) {
                            i9 = i + 1;
                        }
                    } else if (z5 && i9 == -1 && i7 == -1) {
                        int i12 = i + 2;
                        if (i12 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i12) == '/') {
                            i10 = i + 3;
                            z5 = false;
                            i11 = i;
                            i = i12;
                        } else if (strE0.equals(str)) {
                            i8 = i + 1;
                            i11 = i;
                            i = i8;
                            i10 = i;
                        }
                    }
                } else if (i8 == -1 && i9 == -1 && i7 == -1) {
                    i8 = i10 == -1 ? 0 : i;
                    z5 = false;
                }
            } else if (i7 == -1) {
                i7 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i7 == -1 ? Integer.MAX_VALUE : i7 - 1, strE0.length());
        int iMin2 = Math.min(i9 == -1 ? Integer.MAX_VALUE : i9 - 1, iMin);
        if (i10 != -1) {
            strSubstring2 = strE0.substring(0, i11);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            strSubstring = strE0.substring(i10, Math.min(i8 != -1 ? i8 : Integer.MAX_VALUE, iMin2));
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i8 != -1) {
            strSubstring3 = strE0.substring(i8, iMin2);
            kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i9 != -1) {
            strSubstring4 = strE0.substring(i9, iMin);
            kotlin.jvm.internal.m.d(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i7 != -1) {
            strSubstring5 = strE0.substring(i7, strE0.length());
            kotlin.jvm.internal.m.d(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strH = strSubstring2 != null ? h(strSubstring2, bArr) : null;
        String strH2 = strSubstring != null ? h(strSubstring, bArr) : null;
        String strH3 = strSubstring3 != null ? h(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            h(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            h(strSubstring5, bArr);
        }
        return new B(strE0, str2, strH, strH2, strH3);
    }
}
