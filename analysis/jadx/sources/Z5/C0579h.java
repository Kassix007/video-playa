package Z5;

/* JADX INFO: renamed from: Z5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0579h extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0579h f8597c = new C0579h(C0580i.f8600a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        C0578g builder = (C0578g) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte bT = aVar.t(this.f8565b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f8593a;
        int i7 = builder.f8594b;
        builder.f8594b = i7 + 1;
        bArr[i7] = bT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        C0578g c0578g = new C0578g();
        c0578g.f8593a = bArr;
        c0578g.f8594b = bArr.length;
        c0578g.b(10);
        return c0578g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new byte[0];
    }
}
