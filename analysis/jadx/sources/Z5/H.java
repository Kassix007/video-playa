package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class H extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f8543c = new H(I.f8544a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        G builder = (G) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jA = aVar.A(this.f8565b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f8541a;
        int i7 = builder.f8542b;
        builder.f8542b = i7 + 1;
        jArr[i7] = jA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        G g7 = new G();
        g7.f8541a = jArr;
        g7.f8542b = jArr.length;
        g7.b(10);
        return g7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new long[0];
    }
}
