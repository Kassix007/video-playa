package Z5;

/* JADX INFO: renamed from: Z5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576e extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0576e f8587c = new C0576e(C0577f.f8590a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        C0575d builder = (C0575d) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        boolean zC = aVar.c(this.f8565b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f8583a;
        int i7 = builder.f8584b;
        builder.f8584b = i7 + 1;
        zArr[i7] = zC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.e(zArr, "<this>");
        C0575d c0575d = new C0575d();
        c0575d.f8583a = zArr;
        c0575d.f8584b = zArr.length;
        c0575d.b(10);
        return c0575d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new boolean[0];
    }
}
