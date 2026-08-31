package t;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: t.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1595D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1595D f16578b = new C1595D(new L((C1597F) null, (D5.a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f16579a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1595D(L l7) {
        this.f16579a = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1595D) && kotlin.jvm.internal.m.a(((C1595D) obj).f16579a, this.f16579a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16579a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f16578b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C1597F c1597f = this.f16579a.f16590a;
        k1.i.s(sb, c1597f != null ? c1597f.toString() : null, ",\nSlide - ", null, ",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
