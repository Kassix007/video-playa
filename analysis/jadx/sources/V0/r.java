package V0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f7947c = new r(AbstractC0836n2.y(0), AbstractC0836n2.y(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7949b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(long j, long j7) {
        this.f7948a = j;
        this.f7949b = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return W0.n.a(this.f7948a, rVar.f7948a) && W0.n.a(this.f7949b, rVar.f7949b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        W0.o[] oVarArr = W0.n.f8026b;
        return Long.hashCode(this.f7949b) + (Long.hashCode(this.f7948a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) W0.n.d(this.f7948a)) + ", restLine=" + ((Object) W0.n.d(this.f7949b)) + ')';
    }
}
