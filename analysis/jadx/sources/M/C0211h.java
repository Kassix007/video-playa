package M;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: M.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211h extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3490q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X.e f3491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3496w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211h(X.e eVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.f3491r = eVar;
        this.f3493t = obj;
        this.f3494u = obj2;
        this.f3495v = obj3;
        this.f3496w = obj4;
        this.f3492s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3490q) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC0725m interfaceC0725m = (InterfaceC0725m) this.f3493t;
                j0.E e7 = (j0.E) this.f3494u;
                C0205e c0205e = (C0205e) this.f3495v;
                C0207f c0207f = (C0207f) this.f3496w;
                s0.b(interfaceC0725m, e7, c0205e, c0207f, this.f3491r, (C0371o) obj, C0345b.w(this.f3492s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                this.f3491r.d(this.f3493t, this.f3494u, this.f3495v, this.f3496w, (C0371o) obj, C0345b.w(this.f3492s) | 1);
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211h(InterfaceC0725m interfaceC0725m, j0.E e7, C0205e c0205e, C0207f c0207f, X.e eVar, int i) {
        super(2);
        this.f3493t = interfaceC0725m;
        this.f3494u = e7;
        this.f3495v = c0205e;
        this.f3496w = c0207f;
        this.f3491r = eVar;
        this.f3492s = i;
    }
}
