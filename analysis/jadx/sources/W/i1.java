package w;

import m5.C1386y;
import u.C1659m;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j1 f17994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f17995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.c f17996s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, float f, B5.c cVar) {
        super(1);
        this.f17994q = j1Var;
        this.f17995r = f;
        this.f17996s = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        j1 j1Var = this.f17994q;
        if (j1Var.f18010b == Long.MIN_VALUE) {
            j1Var.f18010b = jLongValue;
        }
        float f = j1Var.f18013e;
        C1659m c1659m = new C1659m(f);
        float f7 = this.f17995r;
        C1659m c1659m2 = j1.f;
        long jB = f7 == 0.0f ? j1Var.f18009a.b(new C1659m(f), c1659m2, j1Var.f18011c) : D5.a.H((jLongValue - j1Var.f18010b) / f7);
        float f8 = ((C1659m) j1Var.f18009a.g(jB, c1659m, c1659m2, j1Var.f18011c)).f16972a;
        j1Var.f18011c = (C1659m) j1Var.f18009a.n(jB, c1659m, c1659m2, j1Var.f18011c);
        j1Var.f18010b = jLongValue;
        float f9 = j1Var.f18013e - f8;
        j1Var.f18013e = f8;
        this.f17996s.invoke(Float.valueOf(f9));
        return C1386y.f15098a;
    }
}
