package M;

import P.C0345b;
import P.C0371o;
import m5.C1386y;
import u.C1642c;

/* JADX INFO: renamed from: M.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237z extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X.e f3685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3689v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0237z(Object obj, Object obj2, Object obj3, X.e eVar, int i, int i7) {
        super(2);
        this.f3684q = i7;
        this.f3687t = obj;
        this.f3688u = obj2;
        this.f3689v = obj3;
        this.f3685r = eVar;
        this.f3686s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3684q) {
            case 0:
                ((Number) obj2).intValue();
                C0213i c0213i = (C0213i) this.f3687t;
                C0 c02 = (C0) this.f3688u;
                O0 o02 = (O0) this.f3689v;
                A.a(c0213i, c02, o02, this.f3685r, (C0371o) obj, C0345b.w(this.f3686s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                B5.a aVar = (B5.a) this.f3687t;
                C0212h0 c0212h0 = (C0212h0) this.f3688u;
                C1642c c1642c = (C1642c) this.f3689v;
                s0.d(aVar, c0212h0, c1642c, this.f3685r, (C0371o) obj, C0345b.w(this.f3686s | 1));
                break;
        }
        return C1386y.f15098a;
    }
}
