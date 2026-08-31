package O3;

import android.text.TextUtils;
import android.util.Log;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class X extends E0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final V f4662A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final V f4663B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final V f4664C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final V f4665D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final V f4666E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public char f4667t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4668u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f4669v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V f4670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V f4671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final V f4672y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V f4673z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4667t = (char) 0;
        this.f4668u = -1L;
        this.f4670w = new V(this, 6, false, false);
        this.f4671x = new V(this, 6, true, false);
        this.f4672y = new V(this, 6, false, true);
        this.f4673z = new V(this, 5, false, false);
        this.f4662A = new V(this, 5, true, false);
        this.f4663B = new V(this, 5, false, true);
        this.f4664C = new V(this, 4, false, false);
        this.f4665D = new V(this, 3, false, false);
        this.f4666E = new V(this, 2, false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String A(Object obj, boolean z5) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z5) {
                return obj.toString();
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l7.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof W ? ((W) obj).f4653a : z5 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z5 ? th.getClass().getName() : th.toString());
        String canonicalName = C0323t0.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static W w(String str) {
        if (str == null) {
            return null;
        }
        return new W(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String z(boolean z5, String str, Object obj, Object obj2, Object obj3) {
        String strA = A(obj, z5);
        String strA2 = A(obj2, z5);
        String strA3 = A(obj3, z5);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.E0
    public final boolean p() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V s() {
        return this.f4670w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V t() {
        return this.f4673z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V u() {
        return this.f4665D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V v() {
        return this.f4666E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(int i, boolean z5, boolean z6, String str, Object obj, Object obj2, Object obj3) {
        if (!z5 && Log.isLoggable(y(), i)) {
            Log.println(i, y(), z(false, str, obj, obj2, obj3));
        }
        if (z6 || i < 5) {
            return;
        }
        AbstractC1887A.g(str);
        C0312p0 c0312p0 = ((C0323t0) this.f4346r).f5078w;
        if (c0312p0 == null) {
            Log.println(6, y(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c0312p0.f4356s) {
                Log.println(6, y(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            c0312p0.x(new U(this, i, str, obj, obj2, obj3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String y() {
        String str;
        synchronized (this) {
            try {
                if (this.f4669v == null) {
                    ((C0323t0) ((C0323t0) this.f4346r).f5075t.f4346r).getClass();
                    this.f4669v = "FA";
                }
                AbstractC1887A.g(this.f4669v);
                str = this.f4669v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
