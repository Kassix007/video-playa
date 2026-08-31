package I0;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f2263r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i) {
        super(1);
        this.f2262q = i;
        this.f2263r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f2262q;
        C1386y c1386y = C1386y.f15098a;
        String str = this.f2263r;
        switch (i) {
            case 0:
                r.c((i) obj, str);
                break;
            case 1:
                r.c((i) obj, str);
                break;
            case 2:
                i iVar = (i) obj;
                H5.k[] kVarArr = r.f2326a;
                s sVar = p.f2305d;
                H5.k[] kVarArr2 = r.f2326a;
                H5.k kVar = kVarArr2[2];
                sVar.a(iVar, str);
                s sVar2 = p.f2316r;
                H5.k kVar2 = kVarArr2[9];
                sVar2.a(iVar, Float.valueOf(0.0f));
                break;
            default:
                i iVar2 = (i) obj;
                r.c(iVar2, str);
                r.d(iVar2, 5);
                break;
        }
        return c1386y;
    }
}
