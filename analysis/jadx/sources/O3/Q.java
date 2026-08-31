package O3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f4555b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f4556c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f4557d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0294j0 f4558a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(C0294j0 c0294j0) {
        this.f4558a = c0294j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC1887A.g(atomicReference);
        AbstractC1887A.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4558a.a() ? str : g(str, K0.f4504c, K0.f4502a, f4555b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4558a.a() ? str : g(str, K0.f, K0.f4506e, f4556c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4558a.a() ? str : str.startsWith("_exp_") ? C0.S.n("experiment_id(", str, ")") : g(str, K0.j, K0.i, f4557d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d(C0328v c0328v) {
        C0294j0 c0294j0 = this.f4558a;
        if (!c0294j0.a()) {
            return c0328v.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c0328v.f5093s);
        sb.append(",name=");
        sb.append(a(c0328v.f5091q));
        sb.append(",params=");
        C0325u c0325u = c0328v.f5092r;
        sb.append(c0325u == null ? null : !c0294j0.a() ? c0325u.f5085q.toString() : e(c0325u.c0()));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f4558a.a()) {
            return bundle.toString();
        }
        StringBuilder sbQ = C0.S.q("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbQ.length() != 8) {
                sbQ.append(", ");
            }
            sbQ.append(b(str));
            sbQ.append("=");
            Object obj = bundle.get(str);
            sbQ.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbQ.append("}]");
        return sbQ.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbQ = C0.S.q("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbQ.length() != 1) {
                    sbQ.append(", ");
                }
                sbQ.append(strE);
            }
        }
        sbQ.append("]");
        return sbQ.toString();
    }
}
