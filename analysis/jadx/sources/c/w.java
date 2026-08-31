package C;

import E.I;
import a0.AbstractC0606h;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f690q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f691r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i) {
        super(1);
        this.f691r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f690q) {
            case 0:
                I i = (I) obj;
                AbstractC0606h abstractC0606hC = a0.r.c();
                a0.r.f(abstractC0606hC, a0.r.d(abstractC0606hC), abstractC0606hC != null ? abstractC0606hC.e() : null);
                for (int i7 = 0; i7 < 2; i7++) {
                    i.a(this.f691r + i7);
                }
                return C1386y.f15098a;
            default:
                return Boolean.valueOf(((h0.o) obj).B0(this.f691r));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a7, int i) {
        super(1);
        this.f691r = i;
    }
}
