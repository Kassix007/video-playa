package Z5;

/* JADX INFO: renamed from: Z5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0583l extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0583l f8609c = new C0583l(C0584m.f8611a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        C0582k builder = (C0582k) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        char cY = aVar.y(this.f8565b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f8605a;
        int i7 = builder.f8606b;
        builder.f8606b = i7 + 1;
        cArr[i7] = cY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.e(cArr, "<this>");
        C0582k c0582k = new C0582k();
        c0582k.f8605a = cArr;
        c0582k.f8606b = cArr.length;
        c0582k.b(10);
        return c0582k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new char[0];
    }
}
