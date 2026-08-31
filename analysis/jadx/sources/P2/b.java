package P2;

import I2.n;
import java.util.Map;
import kotlin.jvm.internal.m;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5617b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(n nVar, Map map) {
        this.f5616a = nVar;
        this.f5617b = AbstractC1397A.F(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f5616a, bVar.f5616a) && m.a(this.f5617b, bVar.f5617b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5617b.hashCode() + (this.f5616a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Value(image=" + this.f5616a + ", extras=" + this.f5617b + ')';
    }
}
