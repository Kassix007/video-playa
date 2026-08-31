package T1;

import B0.G0;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1376o;
import m5.C1386y;
import m5.EnumC1370i;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final J5.k f7382m = new J5.k("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final J5.k f7383n = new J5.k("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final J5.k f7384o = new J5.k("http[s]?://");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final J5.k f7385p = new J5.k(".*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final J5.k f7386q = new J5.k("([^/]*?|)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J5.k f7387r = new J5.k("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f7391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1376o f7392e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7394h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1376o f7395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7396l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(String str) {
        this.f7388a = str;
        ArrayList arrayList = new ArrayList();
        this.f7389b = arrayList;
        final int i = 0;
        this.f7391d = AbstractC1362a.d(new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i7 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i8 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i7);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i9 = i7;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i8) {
                                        String strSubstring = str6.substring(i8, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i7 = i9;
                                }
                                if (i8 < str6.length()) {
                                    String strSubstring2 = str6.substring(i8);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 1;
        this.f7392e = AbstractC1362a.d(new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i7) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i8 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i9 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i8) {
                                        String strSubstring = str6.substring(i8, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i9;
                                }
                                if (i8 < str6.length()) {
                                    String strSubstring2 = str6.substring(i8);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 2;
        B5.a aVar = new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i8) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i9 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i9;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        EnumC1370i enumC1370i = EnumC1370i.f15078r;
        this.f = AbstractC1362a.c(enumC1370i, aVar);
        final int i9 = 3;
        this.f7394h = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i9) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i92 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i10 = 4;
        this.i = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i92 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i11 = 5;
        this.j = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i92 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 6;
        this.f7395k = AbstractC1362a.d(new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i92 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i13 = 7;
        AbstractC1362a.d(new B5.a(this) { // from class: T1.k

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n f7377r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7377r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, m5.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f7377r.f7390c;
                        if (str2 != null) {
                            return new J5.k(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f7377r.f7388a;
                        return Boolean.valueOf(str3 != null && n.f7387r.c(str3));
                    case 2:
                        n nVar = this.f7377r;
                        String str4 = nVar.f7388a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) n5.l.m0(queryParameters);
                                if (str6 == null) {
                                    nVar.f7393g = true;
                                    str6 = str5;
                                }
                                G0 g0A = J5.k.a(n.f7383n, str6);
                                m mVar = new m();
                                int i82 = 0;
                                while (g0A != null) {
                                    J5.h hVarG = ((J5.j) g0A.f236t).g(i72);
                                    kotlin.jvm.internal.m.b(hVarG);
                                    int i92 = i72;
                                    mVar.f7381b.add(hVarG.f2830a);
                                    if (g0A.D().f2017q > i82) {
                                        String strSubstring = str6.substring(i82, g0A.D().f2017q);
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = g0A.D().f2018r + 1;
                                    g0A = g0A.M();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String strSubstring2 = str6.substring(i82);
                                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                kotlin.jvm.internal.m.d(string, "toString(...)");
                                mVar.f7380a = n.g(string);
                                linkedHashMap.put(str5, mVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f7377r.f7388a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.b(fragment);
                        n.a(fragment, arrayList2, sb2);
                        return new C1371j(arrayList2, sb2.toString());
                    case 4:
                        C1371j c1371j = (C1371j) this.f7377r.f7394h.getValue();
                        return (c1371j == null || (list = (List) c1371j.f15080q) == null) ? new ArrayList() : list;
                    case 5:
                        C1371j c1371j2 = (C1371j) this.f7377r.f7394h.getValue();
                        if (c1371j2 != null) {
                            return (String) c1371j2.f15081r;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f7377r.j.getValue();
                        if (str8 != null) {
                            return new J5.k(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!f7382m.f2836q.matcher(str).find()) {
            String strPattern = f7384o.f2836q.pattern();
            kotlin.jvm.internal.m.d(strPattern, "pattern(...)");
            sb.append(strPattern);
        }
        G0 g0A = J5.k.a(new J5.k("(\\?|#|$)"), str);
        if (g0A != null) {
            boolean z5 = false;
            String strSubstring = str.substring(0, g0A.D().f2017q);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            if (!f7385p.f2836q.matcher(sb).find() && !f7386q.f2836q.matcher(sb).find()) {
                z5 = true;
            }
            this.f7396l = z5;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        this.f7390c = g(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (G0 g0A = J5.k.a(f7383n, str); g0A != null; g0A = g0A.M()) {
            J5.h hVarG = ((J5.j) g0A.f236t).g(1);
            kotlin.jvm.internal.m.b(hVarG);
            arrayList.add(hVarG.f2830a);
            if (g0A.D().f2017q > i) {
                String strSubstring = str.substring(i, g0A.D().f2017q);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                kotlin.jvm.internal.m.d(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = f7386q.f2836q.pattern();
            kotlin.jvm.internal.m.d(strPattern, "pattern(...)");
            sb.append(strPattern);
            i = g0A.D().f2018r + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(String str) {
        return (J5.m.K0(str, "\\Q") && J5.m.K0(str, "\\E")) ? J5.t.E0(str, ".*", "\\E.*\\Q") : J5.m.K0(str, "\\.\\*") ? J5.t.E0(str, "\\.\\*", ".*") : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(Uri uri) {
        LinkedHashSet linkedHashSet;
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.f7388a);
        kotlin.jvm.internal.m.d(uri2, "parse(...)");
        List<String> list = pathSegments;
        List<String> other = uri2.getPathSegments();
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (list instanceof Collection) {
            linkedHashSet = new LinkedHashSet(list);
        } else {
            linkedHashSet = new LinkedHashSet();
            n5.l.z0(list, linkedHashSet);
        }
        linkedHashSet.retainAll(other instanceof Collection ? other : n5.l.B0(other));
        return linkedHashSet.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m5.h] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            n5.q.e0(arrayList, ((m) it.next()).f7381b);
        }
        return n5.l.u0(n5.l.u0(this.f7389b, arrayList), (List) this.i.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, m5.h] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        G0 g0B;
        G0 g0B2;
        String strDecode;
        kotlin.jvm.internal.m.e(deepLink, "deepLink");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        J5.k kVar = (J5.k) this.f7391d.getValue();
        if (kVar != null && (g0B = kVar.b(deepLink.toString())) != null) {
            int i = 0;
            Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            if (e(g0B, bundleG, arguments) && (!((Boolean) this.f7392e.getValue()).booleanValue() || f(deepLink, bundleG, arguments))) {
                String fragment = deepLink.getFragment();
                J5.k kVar2 = (J5.k) this.f7395k.getValue();
                if (kVar2 != null && (g0B2 = kVar2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(n5.m.c0(list, 10));
                    for (Object obj : list) {
                        int i7 = i + 1;
                        if (i < 0) {
                            AbstractC0836n2.N();
                            throw null;
                        }
                        String str = (String) obj;
                        J5.h hVarG = ((J5.j) g0B2.f236t).g(i7);
                        if (hVarG != null) {
                            strDecode = Uri.decode(hVarG.f2830a);
                            kotlin.jvm.internal.m.d(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        if (arguments.get(str) != null) {
                            throw new ClassCastException();
                        }
                        try {
                            P1.I(str, strDecode, bundleG);
                            arrayList.add(C1386y.f15098a);
                            i = i7;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC0836n2.B(arguments, new l(0, bundleG)).isEmpty()) {
                    return bundleG;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(G0 g02, Bundle bundle, Map map) {
        ArrayList arrayList = this.f7389b;
        ArrayList arrayList2 = new ArrayList(n5.m.c0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int i8 = i + 1;
            String strDecode = null;
            if (i < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            String str = (String) obj;
            J5.h hVarG = ((J5.j) g02.f236t).g(i8);
            if (hVarG != null) {
                strDecode = Uri.decode(hVarG.f2830a);
                kotlin.jvm.internal.m.d(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            if (map.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                P1.I(str, strDecode, bundle);
                arrayList2.add(C1386y.f15098a);
                i = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        return this.f7388a.equals(((n) obj).f7388a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Type inference failed for r5v5. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            java.lang.Object r2 = r0.f
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L131
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            T1.m r3 = (T1.m) r3
            r6 = r20
            java.util.List r5 = r6.getQueryParameters(r5)
            boolean r7 = r0.f7393g
            if (r7 == 0) goto L4a
            java.lang.String r7 = r6.getQuery()
            if (r7 == 0) goto L4a
            java.lang.String r8 = r6.toString()
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L4a
            java.util.List r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r7)
        L4a:
            m5.y r7 = m5.C1386y.f15098a
            r8 = 0
            m5.j[] r9 = new m5.C1371j[r8]
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r8)
            m5.j[] r9 = (m5.C1371j[]) r9
            android.os.Bundle r9 = com.google.android.gms.internal.measurement.P1.g(r9)
            java.util.ArrayList r10 = r3.f7381b
            int r11 = r10.size()
            r12 = r8
        L60:
            if (r12 >= r11) goto L77
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r1.get(r13)
            if (r13 != 0) goto L71
            goto L60
        L71:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L77:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L7d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L128
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r3.f7380a
            if (r11 == 0) goto Lb1
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            java.lang.String r13 = "compile(...)"
            kotlin.jvm.internal.m.d(r11, r13)
            java.lang.String r13 = "input"
            kotlin.jvm.internal.m.e(r10, r13)
            java.util.regex.Matcher r11 = r11.matcher(r10)
            java.lang.String r13 = "matcher(...)"
            kotlin.jvm.internal.m.d(r11, r13)
            boolean r13 = r11.matches()
            if (r13 != 0) goto Lab
            goto Lb1
        Lab:
            B0.G0 r13 = new B0.G0
            r13.<init>(r11, r10)
            goto Lb2
        Lb1:
            r13 = 0
        Lb2:
            if (r13 != 0) goto Lb5
            return r8
        Lb5:
            java.util.ArrayList r10 = r3.f7381b
            java.util.ArrayList r11 = new java.util.ArrayList
            r14 = 10
            int r14 = n5.m.c0(r10, r14)
            r11.<init>(r14)
            int r14 = r10.size()
            r4 = r8
            r15 = r4
            r16 = 1
        Lca:
            if (r4 >= r14) goto L124
            java.lang.Object r17 = r10.get(r4)
            int r4 = r4 + 1
            int r8 = r15 + 1
            if (r15 < 0) goto L11e
            r15 = r17
            java.lang.String r15 = (java.lang.String) r15
            r17 = 0
            java.lang.Object r12 = r13.f236t
            J5.j r12 = (J5.j) r12
            J5.h r12 = r12.g(r8)
            if (r12 == 0) goto Le9
            java.lang.String r12 = r12.f2830a
            goto Leb
        Le9:
            r12 = r17
        Leb:
            if (r12 != 0) goto Lef
            java.lang.String r12 = ""
        Lef:
            java.lang.Object r18 = r1.get(r15)
            if (r18 != 0) goto L118
            java.lang.String r0 = "key"
            kotlin.jvm.internal.m.e(r15, r0)     // Catch: java.lang.IllegalArgumentException -> L10f
            boolean r0 = r9.containsKey(r15)     // Catch: java.lang.IllegalArgumentException -> L10f
            if (r0 != 0) goto L104
            com.google.android.gms.internal.measurement.P1.I(r15, r12, r9)     // Catch: java.lang.IllegalArgumentException -> L10f
            goto L10f
        L104:
            boolean r0 = r9.containsKey(r15)     // Catch: java.lang.IllegalArgumentException -> L10f
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L10f
            goto L110
        L10f:
            r0 = r7
        L110:
            r11.add(r0)
            r0 = r19
            r15 = r8
            r8 = 0
            goto Lca
        L118:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L11e:
            r17 = 0
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            throw r17
        L124:
            r0 = r19
            goto L7d
        L128:
            r0 = r21
            r0.putAll(r9)
            r0 = r19
            goto L14
        L131:
            r16 = 1
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.n.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7388a.hashCode() * 961;
    }
}
