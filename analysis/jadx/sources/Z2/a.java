package Z2;

import C0.S;
import java.util.HashMap;
import java.util.Map;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8408e;
    public final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8410h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(f fVar, String str, String str2, String str3, Map map, HashMap map2, String str4, String str5) {
        this.f8404a = fVar;
        this.f8405b = str;
        this.f8406c = str2;
        this.f8407d = str3;
        this.f8408e = map;
        this.f = map2;
        this.f8409g = str4;
        this.f8410h = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8404a == aVar.f8404a && this.f8405b.equals(aVar.f8405b) && this.f8406c.equals(aVar.f8406c) && this.f8407d.equals(aVar.f8407d) && this.f8408e.equals(aVar.f8408e) && this.f.equals(aVar.f) && this.f8409g.equals(aVar.f8409g) && m.a(this.f8410h, aVar.f8410h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iH = S.h(this.f8409g, (this.f.hashCode() + ((this.f8408e.hashCode() + S.h(this.f8407d, S.h(this.f8406c, S.h(this.f8405b, this.f8404a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
        String str = this.f8410h;
        return iH + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordedRequest(type=");
        sb.append(this.f8404a);
        sb.append(", url=");
        sb.append(this.f8405b);
        sb.append(", method=");
        i.s(sb, this.f8406c, ", body=", this.f8407d, ", formParameters=");
        sb.append(this.f8408e);
        sb.append(", headers=");
        sb.append(this.f);
        sb.append(", trace=");
        sb.append(this.f8409g);
        sb.append(", enctype=");
        sb.append(this.f8410h);
        sb.append(")");
        return sb.toString();
    }
}
