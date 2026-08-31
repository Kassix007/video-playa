package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class r implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f8625a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8626b = new U("kotlin.time.Duration", X5.d.f8183k);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f8626b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        int i = K5.a.f2967t;
        String value = bVar.w();
        kotlin.jvm.internal.m.e(value, "value");
        try {
            return new K5.a(K5.f.a(value));
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(C0.S.n("Invalid ISO duration string format: '", value, "'."), e7);
        }
    }
}
