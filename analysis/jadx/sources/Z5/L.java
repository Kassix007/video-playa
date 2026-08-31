package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class L implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V5.a f8549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f8550b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(V5.a serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.f8549a = serializer;
        this.f8550b = new W(serializer.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return this.f8550b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        if (bVar.f()) {
            return bVar.p(this.f8549a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && L.class == obj.getClass() && kotlin.jvm.internal.m.a(this.f8549a, ((L) obj).f8549a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8549a.hashCode();
    }
}
