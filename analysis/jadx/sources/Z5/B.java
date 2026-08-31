package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class B extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f8534c = new B(C.f8535a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        A builder = (A) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iO = aVar.o(this.f8565b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f8532a;
        int i7 = builder.f8533b;
        builder.f8533b = i7 + 1;
        iArr[i7] = iO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        A a7 = new A();
        a7.f8532a = iArr;
        a7.f8533b = iArr.length;
        a7.b(10);
        return a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new int[0];
    }
}
