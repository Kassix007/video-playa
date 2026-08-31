package Z5;

import m5.C1378q;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f8582c = new c0(d0.f8585a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        b0 builder = (b0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte bS = aVar.r(this.f8565b, i).s();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f8579a;
        int i7 = builder.f8580b;
        builder.f8580b = i7 + 1;
        bArr[i7] = bS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        byte[] toBuilder = ((C1378q) obj).f15090q;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        b0 b0Var = new b0();
        b0Var.f8579a = toBuilder;
        b0Var.f8580b = toBuilder.length;
        b0Var.b(10);
        return b0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new C1378q(new byte[0]);
    }
}
