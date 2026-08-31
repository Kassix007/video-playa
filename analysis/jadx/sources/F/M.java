package F;

import P.C0346b0;
import P.C0348c0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1810r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(N n7, int i) {
        super(0);
        this.f1809q = i;
        this.f1810r = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f1809q) {
            case 0:
                N n7 = this.f1810r;
                return Integer.valueOf(n7.f1825k.b() ? n7.f1834t.e() : n7.j());
            default:
                N n8 = this.f1810r;
                C0348c0 c0348c0 = n8.f1833s;
                return Integer.valueOf(n8.i(!n8.f1825k.b() ? n8.j() : c0348c0.e() != -1 ? c0348c0.e() : Math.abs(((C0346b0) n8.f1821d.f1779t).e()) >= Math.abs(Math.min(n8.f1831q.u(S.f1843a), ((float) n8.m()) / 2.0f) / ((float) n8.m())) ? ((Boolean) n8.f1816F.getValue()).booleanValue() ? n8.f1822e + 1 : n8.f1822e : n8.j()));
        }
    }
}
