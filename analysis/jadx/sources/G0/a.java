package G0;

import C0.S;
import kotlin.jvm.internal.m;
import p0.C1437e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1437e f1971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1972b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(C1437e c1437e, int i) {
        this.f1971a = c1437e;
        this.f1972b = i;
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
        return m.a(this.f1971a, aVar.f1971a) && this.f1972b == aVar.f1972b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1972b) + (this.f1971a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f1971a);
        sb.append(", configFlags=");
        return S.o(sb, this.f1972b, ')');
    }
}
