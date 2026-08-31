package G0;

import C0.S;
import android.content.res.Resources;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f1973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1974b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Resources.Theme theme, int i) {
        this.f1973a = theme;
        this.f1974b = i;
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
        return m.a(this.f1973a, bVar.f1973a) && this.f1974b == bVar.f1974b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1974b) + (this.f1973a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f1973a);
        sb.append(", id=");
        return S.o(sb, this.f1974b, ')');
    }
}
