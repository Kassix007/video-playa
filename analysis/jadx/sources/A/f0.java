package A;

import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g0 f98q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f99r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1933J f100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B0.T f102u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, int i, AbstractC1933J abstractC1933J, int i7, B0.T t6) {
        super(1);
        this.f98q = g0Var;
        this.f99r = i;
        this.f100s = abstractC1933J;
        this.f101t = i7;
        this.f102u = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [B5.e, kotlin.jvm.internal.n] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        ?? r02 = this.f98q.f104F;
        AbstractC1933J abstractC1933J = this.f100s;
        AbstractC1932I.e((AbstractC1932I) obj, abstractC1933J, ((W0.i) r02.invoke(new W0.k((((long) (this.f99r - abstractC1933J.f18664q)) << 32) | (((long) (this.f101t - abstractC1933J.f18665r)) & 4294967295L)), this.f102u.getLayoutDirection())).f8015a);
        return C1386y.f15098a;
    }
}
