package b;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0683A f9915r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(C0683A c0683a, int i) {
        super(0);
        this.f9914q = i;
        this.f9915r = c0683a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f9914q) {
            case 0:
                this.f9915r.c();
                break;
            case 1:
                this.f9915r.b();
                break;
            default:
                this.f9915r.c();
                break;
        }
        return C1386y.f15098a;
    }
}
