package Z5;

import m5.C1380s;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f8592c = new f0(g0.f8595a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n, Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        e0 builder = (e0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iN = aVar.r(this.f8565b, i).n();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f8588a;
        int i7 = builder.f8589b;
        builder.f8589b = i7 + 1;
        iArr[i7] = iN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        int[] toBuilder = ((C1380s) obj).f15092q;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        e0 e0Var = new e0();
        e0Var.f8588a = toBuilder;
        e0Var.f8589b = toBuilder.length;
        e0Var.b(10);
        return e0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.T
    public final Object k() {
        return new C1380s(new int[0]);
    }
}
