package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class S extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8564b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(X5.f primitive) {
        super(primitive);
        kotlin.jvm.internal.m.e(primitive, "primitive");
        this.f8564b = primitive.b() + "Array";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return this.f8564b;
    }
}
