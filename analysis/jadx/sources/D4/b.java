package D4;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PendingIntent f1455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1456r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(PendingIntent pendingIntent, boolean z5) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f1455q = pendingIntent;
        this.f1456r = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1455q.equals(((b) aVar).f1455q)) {
                if (this.f1456r == ((b) aVar).f1456r) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f1455q.hashCode() ^ 1000003) * 1000003) ^ (true != this.f1456r ? 1237 : 1231);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f1455q.toString() + ", isNoOp=" + this.f1456r + "}";
    }
}
