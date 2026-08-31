package K;

import j0.o;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2845b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(long j, long j7) {
        this.f2844a = j;
        this.f2845b = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return o.c(this.f2844a, cVar.f2844a) && o.c(this.f2845b, cVar.f2845b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = o.f13723h;
        return Long.hashCode(this.f2845b) + (Long.hashCode(this.f2844a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        i.r(this.f2844a, sb, ", selectionBackgroundColor=");
        sb.append((Object) o.i(this.f2845b));
        sb.append(')');
        return sb.toString();
    }
}
