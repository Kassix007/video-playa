package d6;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f12413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.c f12416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f12417e;
    public c f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(n url, String method, l lVar, k3.c cVar, Map map) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(method, "method");
        this.f12413a = url;
        this.f12414b = method;
        this.f12415c = lVar;
        this.f12416d = cVar;
        this.f12417e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c a() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f12305n;
        c cVarJ = Q2.g.J(this.f12415c);
        this.f = cVarJ;
        return cVarJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final L0.l b() {
        L0.l lVar = new L0.l();
        lVar.f3124a = new LinkedHashMap();
        lVar.f3125b = this.f12413a;
        lVar.f3126c = this.f12414b;
        lVar.f3128e = this.f12416d;
        Map map = this.f12417e;
        lVar.f3124a = map.isEmpty() ? new LinkedHashMap() : n5.x.P(map);
        lVar.f3127d = this.f12415c.h();
        return lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f12414b);
        sb.append(", url=");
        sb.append(this.f12413a);
        l lVar = this.f12415c;
        if (lVar.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : lVar) {
                int i7 = i + 1;
                if (i < 0) {
                    AbstractC0836n2.N();
                    throw null;
                }
                C1371j c1371j = (C1371j) obj;
                String str = (String) c1371j.f15080q;
                String str2 = (String) c1371j.f15081r;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i7;
            }
            sb.append(']');
        }
        Map map = this.f12417e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
