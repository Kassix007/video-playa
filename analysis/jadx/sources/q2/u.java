package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f6584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f6585e;
    public final Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(int i, long j, long j7, s sVar, v vVar, Object obj) {
        this.f6581a = i;
        this.f6582b = j;
        this.f6583c = j7;
        this.f6584d = sVar;
        this.f6585e = vVar;
        this.f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f6581a == uVar.f6581a && this.f6582b == uVar.f6582b && this.f6583c == uVar.f6583c && kotlin.jvm.internal.m.a(this.f6584d, uVar.f6584d) && kotlin.jvm.internal.m.a(this.f6585e, uVar.f6585e) && kotlin.jvm.internal.m.a(this.f, uVar.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f6584d.f6576a.hashCode() + k1.i.d(k1.i.d(this.f6581a * 31, 31, this.f6582b), 31, this.f6583c)) * 31;
        v vVar = this.f6585e;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.f6586q.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NetworkResponse(code=" + this.f6581a + ", requestMillis=" + this.f6582b + ", responseMillis=" + this.f6583c + ", headers=" + this.f6584d + ", body=" + this.f6585e + ", delegate=" + this.f + ')';
    }
}
