package X;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;
import z0.AbstractC1938O;
import z0.S;

/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8135u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i, int i7) {
        super(2);
        this.f8131q = i7;
        this.f8133s = obj;
        this.f8134t = obj2;
        this.f8135u = obj3;
        this.f8132r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8131q) {
            case 0:
                ((Number) obj2).intValue();
                e eVar = (e) this.f8133s;
                int iW = C0345b.w(this.f8132r) | 1;
                eVar.c(this.f8134t, this.f8135u, (C0371o) obj, iW);
                break;
            case 1:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.a((B5.c) this.f8133s, (InterfaceC0725m) this.f8134t, (B5.c) this.f8135u, (C0371o) obj, C0345b.w(this.f8132r | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1938O.b((S) this.f8133s, (InterfaceC0725m) this.f8134t, (B5.e) this.f8135u, (C0371o) obj, C0345b.w(this.f8132r | 1));
                break;
        }
        return C1386y.f15098a;
    }
}
