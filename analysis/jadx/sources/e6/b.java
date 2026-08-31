package e6;

import J5.k;
import O3.B;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.P1;
import d6.l;
import d6.n;
import d6.q;
import d6.u;
import d6.v;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C1193b;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.C1541j;
import q6.G;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12674b = P1.F(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f12675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f12676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f12677e;
    public static final String f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte[] bArr = new byte[0];
        f12673a = bArr;
        C1538g c1538g = new C1538g();
        c1538g.m21write(bArr);
        long j = 0;
        f12675c = new v(j, c1538g);
        if (j < 0 || j > j || 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C1541j c1541j = C1541j.f16064t;
        I1.y0(B.g("efbbbf"), B.g("feff"), B.g("fffe"), B.g("0000ffff"), B.g("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        m.b(timeZone);
        f12676d = timeZone;
        f12677e = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f = J5.m.b1(J5.m.a1(q.class.getName(), "okhttp3."), "Client");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(n nVar, n other) {
        m.e(nVar, "<this>");
        m.e(other, "other");
        return m.a(nVar.f12371d, other.f12371d) && nVar.f12372e == other.f12372e && m.a(nVar.f12368a, other.f12368a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(Closeable closeable) {
        m.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(Socket socket) {
        m.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!m.a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(int i, int i7, String str, String str2) {
        while (i < i7) {
            if (J5.m.J0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(String str, char c7, int i, int i7) {
        while (i < i7) {
            if (str.charAt(i) == c7) {
                return i;
            }
            i++;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f(String format, Object... objArr) {
        m.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        m.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C1193b c1193bH = m.h(strArr2);
                while (c1193bH.hasNext()) {
                    if (comparator.compare(str, (String) c1193bH.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long h(u uVar) {
        String strD = uVar.f12437v.d("Content-Length");
        if (strD == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List i(Object... elements) {
        m.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC0836n2.A(Arrays.copyOf(objArr, objArr.length)));
        m.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (m.f(cCharAt, 31) <= 0 || m.f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int k(String str, int i, int i7) {
        while (i < i7) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int l(String str, int i, int i7) {
        int i8 = i7 - 1;
        if (i <= i8) {
            while (true) {
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i8 + 1;
                }
                if (i8 == i) {
                    break;
                }
                i8--;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] m(String[] strArr, String[] other, Comparator comparator) {
        m.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean n(String name) {
        m.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int o(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' > c7 || c7 >= 'G') {
            return -1;
        }
        return c7 - '7';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int p(InterfaceC1540i interfaceC1540i) {
        m.e(interfaceC1540i, "<this>");
        return (interfaceC1540i.readByte() & 255) | ((interfaceC1540i.readByte() & 255) << 16) | ((interfaceC1540i.readByte() & 255) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean q(G g7, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = g7.d().e() ? g7.d().c() - jNanoTime : Long.MAX_VALUE;
        g7.d().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C1538g c1538g = new C1538g();
            while (g7.F(8192L, c1538g) != -1) {
                c1538g.a();
            }
            if (jC == Long.MAX_VALUE) {
                g7.d().a();
                return true;
            }
            g7.d().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                g7.d().a();
                return false;
            }
            g7.d().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                g7.d().a();
            } else {
                g7.d().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final l r(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k6.b bVar = (k6.b) it.next();
            C1541j c1541j = bVar.f14137a;
            C1541j c1541j2 = bVar.f14138b;
            String strP = c1541j.p();
            String strP2 = c1541j2.p();
            arrayList.add(strP);
            arrayList.add(J5.m.n1(strP2).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String s(n nVar, boolean z5) {
        m.e(nVar, "<this>");
        int i = nVar.f12372e;
        String str = nVar.f12371d;
        if (J5.m.K0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z5) {
            String scheme = nVar.f12368a;
            m.e(scheme, "scheme");
            if (i == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List t(List list) {
        m.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(n5.l.C0(list));
        m.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int u(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String v(String str, int i, int i7) {
        int iK = k(str, i, i7);
        String strSubstring = str.substring(iK, l(str, iK, i7));
        m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
