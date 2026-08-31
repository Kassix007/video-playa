package M;

import i0.C1130b;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f3378r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(B5.a aVar, int i) {
        super(1);
        this.f3377q = i;
        this.f3378r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f3377q;
        C1386y c1386y = C1386y.f15098a;
        B5.a aVar = this.f3378r;
        switch (i) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                long j = ((C1130b) obj).f13520a;
                aVar.invoke();
                break;
            default:
                I0.e eVar = new I0.e(((Number) aVar.invoke()).floatValue(), new G5.a(0.0f, 1.0f));
                H5.k[] kVarArr = I0.r.f2326a;
                I0.s sVar = I0.p.f2304c;
                H5.k kVar = I0.r.f2326a[1];
                sVar.a((I0.i) obj, eVar);
                break;
        }
        return c1386y;
    }
}
