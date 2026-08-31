package E;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: E.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0139w extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1596q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1601v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139w(B5.c cVar, InterfaceC0725m interfaceC0725m, B5.c cVar2, int i, int i7) {
        super(2);
        this.f1600u = cVar;
        this.f1597r = interfaceC0725m;
        this.f1601v = cVar2;
        this.f1598s = i;
        this.f1599t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1596q;
        C0371o c0371o = (C0371o) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                C.d((InterfaceC0140x) this.f1600u, this.f1597r, this.f1598s, this.f1601v, c0371o, C0345b.w(this.f1599t | 1));
                break;
            case 1:
                C.b(this.f1597r, this.f1598s, (H) this.f1600u, (X.e) this.f1601v, c0371o, C0345b.w(this.f1599t | 1));
                break;
            default:
                androidx.compose.ui.viewinterop.a.b((B5.c) this.f1600u, (InterfaceC0725m) this.f1597r, (B5.c) this.f1601v, c0371o, C0345b.w(this.f1598s | 1), this.f1599t);
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139w(InterfaceC0140x interfaceC0140x, Object obj, int i, Object obj2, int i7) {
        super(2);
        this.f1600u = interfaceC0140x;
        this.f1597r = obj;
        this.f1598s = i;
        this.f1601v = obj2;
        this.f1599t = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139w(Object obj, int i, H h4, X.e eVar, int i7) {
        super(2);
        this.f1597r = obj;
        this.f1598s = i;
        this.f1600u = h4;
        this.f1601v = eVar;
        this.f1599t = i7;
    }
}
