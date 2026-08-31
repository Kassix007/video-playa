package P2;

import java.util.Map;
import kotlin.jvm.internal.m;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5615b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String str, Map map) {
        this.f5614a = str;
        this.f5615b = AbstractC1397A.F(map);
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
        return m.a(this.f5614a, aVar.f5614a) && m.a(this.f5615b, aVar.f5615b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5615b.hashCode() + (this.f5614a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Key(key=" + this.f5614a + ", extras=" + this.f5615b + ')';
    }
}
