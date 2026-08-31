package Z5;

import m5.C1385x;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f8610c = new l0(m0.f8613a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        k0 builder = (k0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sV = aVar.r(this.f8565b, i).v();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f8607a;
        int i7 = builder.f8608b;
        builder.f8608b = i7 + 1;
        sArr[i7] = sV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        short[] toBuilder = ((C1385x) obj).f15097q;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        k0 k0Var = new k0();
        k0Var.f8607a = toBuilder;
        k0Var.f8608b = toBuilder.length;
        k0Var.b(10);
        return k0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new C1385x(new short[0]);
    }
}
