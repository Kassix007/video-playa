package u;

import P.C0350d0;
import P.C0354f0;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v0 f17055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f17056r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, float f) {
        super(1);
        this.f17055q = v0Var;
        this.f17056r = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        v0 v0Var = this.f17055q;
        boolean zG = v0Var.g();
        C0350d0 c0350d0 = v0Var.f17074g;
        if (!zG) {
            if (((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c == Long.MIN_VALUE) {
                c0350d0.e(jLongValue);
                ((C0354f0) v0Var.f17069a.f4346r).setValue(Boolean.TRUE);
            }
            long jH = jLongValue - ((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c;
            float f = this.f17056r;
            if (f != 0.0f) {
                jH = D5.a.H(jH / ((double) f));
            }
            v0Var.n(jH);
            v0Var.h(f == 0.0f, jH);
        }
        return C1386y.f15098a;
    }
}
