package u;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17019b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r0(Object obj, Object obj2) {
        this.f17018a = obj;
        this.f17019b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.q0
    public final Object a() {
        return this.f17018a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.q0
    public final Object c() {
        return this.f17019b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.a(this.f17018a, q0Var.a()) && kotlin.jvm.internal.m.a(this.f17019b, q0Var.c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f17018a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f17019b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
