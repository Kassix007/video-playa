package Z2;

import C0.S;
import J5.g;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k1.i;
import kotlin.jvm.internal.m;
import n5.l;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f8420e;
    public final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8422h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8423k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(f fVar, String str, String str2, String str3, Map map, HashMap map2, String str4, String str5, boolean z5, boolean z6, boolean z7) {
        this.f8416a = fVar;
        this.f8417b = str;
        this.f8418c = str2;
        this.f8419d = str3;
        this.f8420e = map;
        this.f = map2;
        this.f8421g = str4;
        this.f8422h = str5;
        this.i = z5;
        this.j = z6;
        this.f8423k = z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8416a == eVar.f8416a && this.f8417b.equals(eVar.f8417b) && this.f8418c.equals(eVar.f8418c) && this.f8419d.equals(eVar.f8419d) && this.f8420e.equals(eVar.f8420e) && this.f.equals(eVar.f) && this.f8421g.equals(eVar.f8421g) && m.a(this.f8422h, eVar.f8422h) && this.i == eVar.i && this.j == eVar.j && this.f8423k == eVar.f8423k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iH = S.h(this.f8421g, (this.f.hashCode() + ((this.f8420e.hashCode() + S.h(this.f8419d, S.h(this.f8418c, S.h(this.f8417b, this.f8416a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
        String str = this.f8422h;
        return Boolean.hashCode(this.f8423k) + i.e(i.e((iH + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Iterable iterableZ;
        String strQ0 = l.q0(this.f.entrySet(), "\n", "\n", null, new I5.m(27), 28);
        String strQ02 = l.q0(this.f8420e.entrySet(), "\n", "\n", null, new I5.m(28), 28);
        g gVar = new g(this.f8421g);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                iterableZ = arrayList;
            } else {
                iterableZ = AbstractC0836n2.z(next);
            }
        } else {
            iterableZ = s.f15299q;
        }
        String strQ03 = l.q0(l.i0(iterableZ), "\n", "\n", null, new I5.m(29), 28);
        StringBuilder sb = new StringBuilder("\n  Type: ");
        sb.append(this.f8416a);
        sb.append("\n  URL: ");
        sb.append(this.f8417b);
        sb.append("\n  Method: ");
        i.s(sb, this.f8418c, "\n  Body: ", this.f8419d, "\n  Headers: ");
        i.s(sb, strQ0, "\n  FormParameters: ", strQ02, "\n  Trace: ");
        i.s(sb, strQ03, "\n  Encoding type (form submissions only): ", this.f8422h, "\n  Is for main frame? ");
        sb.append(this.i);
        sb.append("\n  Is redirect? ");
        sb.append(this.j);
        sb.append("\n  Has gesture? ");
        sb.append(this.f8423k);
        sb.append("\n        ");
        return sb.toString();
    }
}
