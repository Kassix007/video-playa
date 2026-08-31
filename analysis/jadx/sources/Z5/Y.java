package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y f8574c = new Y(Z.f8575a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        X builder = (X) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sG = aVar.g(this.f8565b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f8572a;
        int i7 = builder.f8573b;
        builder.f8573b = i7 + 1;
        sArr[i7] = sG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.e(sArr, "<this>");
        X x6 = new X();
        x6.f8572a = sArr;
        x6.f8573b = sArr.length;
        x6.b(10);
        return x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new short[0];
    }
}
