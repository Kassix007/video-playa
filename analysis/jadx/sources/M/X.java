package M;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f3419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.a f3420s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(I0 i02, B5.a aVar, int i) {
        super(1);
        this.f3418q = i;
        this.f3419r = i02;
        this.f3420s = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f3418q) {
            case 0:
                if (!this.f3419r.c()) {
                    this.f3420s.invoke();
                }
                break;
            default:
                if (!this.f3419r.c()) {
                    this.f3420s.invoke();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
