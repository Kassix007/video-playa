package k6;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f14154b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b bVar = new b(b.i, "");
        C1541j c1541j = b.f;
        b bVar2 = new b(c1541j, "GET");
        b bVar3 = new b(c1541j, "POST");
        C1541j c1541j2 = b.f14135g;
        b bVar4 = new b(c1541j2, "/");
        b bVar5 = new b(c1541j2, "/index.html");
        C1541j c1541j3 = b.f14136h;
        b bVar6 = new b(c1541j3, "http");
        b bVar7 = new b(c1541j3, "https");
        C1541j c1541j4 = b.f14134e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(c1541j4, "200"), new b(c1541j4, "204"), new b(c1541j4, "206"), new b(c1541j4, "304"), new b(c1541j4, "400"), new b(c1541j4, "404"), new b(c1541j4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b(FirebaseAnalytics.Param.LOCATION, ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f14153a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f14137a)) {
                linkedHashMap.put(bVarArr[i].f14137a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f14154b = mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(C1541j name) throws IOException {
        kotlin.jvm.internal.m.e(name, "name");
        int iC = name.c();
        for (int i = 0; i < iC; i++) {
            byte bH = name.h(i);
            if (65 <= bH && bH < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.p()));
            }
        }
    }
}
