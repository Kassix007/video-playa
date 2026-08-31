package A;

import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1933J f9s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(int i, AbstractC1933J abstractC1933J, int i7) {
        super(1);
        this.f8r = i;
        this.f9s = abstractC1933J;
        this.f10t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7q) {
            case 0:
                AbstractC1932I.d((AbstractC1932I) obj, this.f9s, this.f8r, this.f10t);
                break;
            default:
                AbstractC1932I.d((AbstractC1932I) obj, this.f9s, D5.a.G((this.f8r - r0.f18664q) / 2.0f), D5.a.G((this.f10t - r0.f18665r) / 2.0f));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC1933J abstractC1933J, int i, int i7) {
        super(1);
        this.f9s = abstractC1933J;
        this.f8r = i;
        this.f10t = i7;
    }
}
