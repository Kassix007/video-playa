package Z5;

/* JADX INFO: renamed from: Z5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0591u extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0591u f8634c = new C0591u(C0592v.f8635a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        C0590t builder = (C0590t) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        float fK = aVar.k(this.f8565b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f8632a;
        int i7 = builder.f8633b;
        builder.f8633b = i7 + 1;
        fArr[i7] = fK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.e(fArr, "<this>");
        C0590t c0590t = new C0590t();
        c0590t.f8632a = fArr;
        c0590t.f8633b = fArr.length;
        c0590t.b(10);
        return c0590t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new float[0];
    }
}
