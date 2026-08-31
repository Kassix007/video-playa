package Z5;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC0585n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f8565b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(V5.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.m.e(primitiveSerializer, "primitiveSerializer");
        this.f8565b = new S(primitiveSerializer.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return this.f8565b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a, V5.a
    public final Object c(Y5.b bVar) {
        return f(bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object d() {
        return (Q) h(k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final int e(Object obj) {
        Q q7 = (Q) obj;
        kotlin.jvm.internal.m.e(q7, "<this>");
        return q7.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object i(Object obj) {
        Q q7 = (Q) obj;
        kotlin.jvm.internal.m.e(q7, "<this>");
        return q7.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n
    public final void j(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.m.e((Q) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object k();
}
