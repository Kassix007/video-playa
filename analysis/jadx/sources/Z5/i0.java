package Z5;

import m5.C1382u;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f8602c = new i0(j0.f8603a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        h0 builder = (h0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jD = aVar.r(this.f8565b, i).d();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f8598a;
        int i7 = builder.f8599b;
        builder.f8599b = i7 + 1;
        jArr[i7] = jD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        long[] toBuilder = ((C1382u) obj).f15094q;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        h0 h0Var = new h0();
        h0Var.f8598a = toBuilder;
        h0Var.f8599b = toBuilder.length;
        h0Var.b(10);
        return h0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new C1382u(new long[0]);
    }
}
