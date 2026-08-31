package C;

import E.InterfaceC0140x;
import P.W;

/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f609r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(W w3, int i) {
        super(0);
        this.f608q = i;
        this.f609r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f608q) {
            case 0:
                return new g((B5.c) this.f609r.getValue());
            case 1:
                return new D.h((B5.c) this.f609r.getValue());
            case 2:
                return (InterfaceC0140x) ((B5.a) this.f609r.getValue()).invoke();
            default:
                return (L.g) this.f609r.getValue();
        }
    }
}
