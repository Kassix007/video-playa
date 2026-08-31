package B0;

import c0.InterfaceC0723k;
import m5.C1386y;

/* JADX INFO: renamed from: B0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033c extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0035d f373r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033c(C0035d c0035d, int i) {
        super(0);
        this.f372q = i;
        this.f373r = c0035d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f372q) {
            case 0:
                this.f373r.A0();
                break;
            default:
                C0035d c0035d = this.f373r;
                InterfaceC0723k interfaceC0723k = c0035d.f405E;
                kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((A0.c) interfaceC0723k).e(c0035d);
                break;
        }
        return C1386y.f15098a;
    }
}
