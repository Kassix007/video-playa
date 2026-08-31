package t;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: t.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1596E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1596E f16580b = new C1596E(new L((C1597F) null, (D5.a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1596E f16581c = new C1596E(new L((C1597F) (0 == true ? 1 : 0), (D5.a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 47));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f16582a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1596E(L l7) {
        this.f16582a = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1596E) && kotlin.jvm.internal.m.a(((C1596E) obj).f16582a, this.f16582a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16582a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f16580b)) {
            return "ExitTransition.None";
        }
        if (equals(f16581c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        L l7 = this.f16582a;
        C1597F c1597f = l7.f16590a;
        k1.i.s(sb, c1597f != null ? c1597f.toString() : null, ",\nSlide - ", null, ",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(l7.f16591b);
        return sb.toString();
    }
}
