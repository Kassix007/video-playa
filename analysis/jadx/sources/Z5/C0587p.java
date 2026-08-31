package Z5;

/* JADX INFO: renamed from: Z5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0587p extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0587p f8622c = new C0587p(C0588q.f8623a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        C0586o builder = (C0586o) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        double dU = aVar.u(this.f8565b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f8618a;
        int i7 = builder.f8619b;
        builder.f8619b = i7 + 1;
        dArr[i7] = dU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.e(dArr, "<this>");
        C0586o c0586o = new C0586o();
        c0586o.f8618a = dArr;
        c0586o.f8619b = dArr.length;
        c0586o.b(10);
        return c0586o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new double[0];
    }
}
