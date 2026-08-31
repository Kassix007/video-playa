package d6;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12372e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12374h;
    public final boolean i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(String scheme, String str, String str2, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.m.e(scheme, "scheme");
        kotlin.jvm.internal.m.e(host, "host");
        this.f12368a = scheme;
        this.f12369b = str;
        this.f12370c = str2;
        this.f12371d = host;
        this.f12372e = i;
        this.f = arrayList2;
        this.f12373g = str3;
        this.f12374h = str4;
        this.i = scheme.equals("https");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        if (this.f12370c.length() == 0) {
            return "";
        }
        int length = this.f12368a.length() + 3;
        String str = this.f12374h;
        String strSubstring = str.substring(J5.m.R0(str, ':', length, 4) + 1, J5.m.R0(str, '@', 0, 6));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        int length = this.f12368a.length() + 3;
        String str = this.f12374h;
        int iR0 = J5.m.R0(str, '/', length, 4);
        String strSubstring = str.substring(iR0, e6.b.d(iR0, str.length(), str, "?#"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList c() {
        int length = this.f12368a.length() + 3;
        String str = this.f12374h;
        int iR0 = J5.m.R0(str, '/', length, 4);
        int iD = e6.b.d(iR0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iR0 < iD) {
            int i = iR0 + 1;
            int iE = e6.b.e(str, '/', i, iD);
            String strSubstring = str.substring(i, iE);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iR0 = iE;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.f12374h;
        int iR0 = J5.m.R0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iR0, e6.b.e(str, '#', iR0, str.length()));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        if (this.f12369b.length() == 0) {
            return "";
        }
        int length = this.f12368a.length() + 3;
        String str = this.f12374h;
        String strSubstring = str.substring(length, e6.b.d(length, str.length(), str, ":@"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof n) && kotlin.jvm.internal.m.a(((n) obj).f12374h, this.f12374h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        m mVar;
        try {
            mVar = new m();
            mVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        kotlin.jvm.internal.m.b(mVar);
        mVar.f12362b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        mVar.f12363c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return mVar.a().f12374h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        m mVar = new m();
        String scheme = this.f12368a;
        mVar.f12361a = scheme;
        mVar.f12362b = e();
        mVar.f12363c = a();
        mVar.f12364d = this.f12371d;
        kotlin.jvm.internal.m.e(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i7 = this.f12372e;
        mVar.f12365e = i7 != i ? i7 : -1;
        ArrayList arrayList = mVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        mVar.f12366g = strD != null ? b.f(b.b(strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.f12373g == null) {
            strSubstring = null;
        } else {
            String str = this.f12374h;
            strSubstring = str.substring(J5.m.R0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        mVar.f12367h = strSubstring;
        String str2 = mVar.f12364d;
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        mVar.f12364d = strReplaceAll;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.set(i8, b.b((String) arrayList.get(i8), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = mVar.f12366g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String str3 = (String) arrayList2.get(i9);
                arrayList2.set(i9, str3 != null ? b.b(str3, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str4 = mVar.f12367h;
        mVar.f12367h = str4 != null ? b.b(str4, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = mVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.m.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.m.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12374h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f12374h;
    }
}
