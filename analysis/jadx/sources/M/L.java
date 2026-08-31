package M;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ M f3335r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(M m4, int i) {
        super(1);
        this.f3334q = i;
        this.f3335r = m4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f3334q) {
            case 0:
                M m4 = this.f3335r;
                if (m4.f3338u.f3498b) {
                    m4.f3337t.invoke();
                }
                return C1386y.f15098a;
            default:
                M m7 = this.f3335r;
                m7.show();
                return new C0.Y(4, m7);
        }
    }
}
