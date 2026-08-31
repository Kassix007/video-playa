package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public final class q implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f14263q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(Class jClass) {
        m.e(jClass, "jClass");
        this.f14263q = jClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f14263q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return m.a(this.f14263q, ((q) obj).f14263q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14263q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14263q + " (Kotlin reflection is not available)";
    }
}
