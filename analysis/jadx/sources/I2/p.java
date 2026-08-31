package I2;

import R4.C0433b2;
import java.util.ArrayList;
import java.util.List;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2370q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E.c0.d():I2.y, I2.y.<init>(I2.t):void] */
    public /* synthetic */ p(int i) {
        this.f2370q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f2370q) {
            case 0:
                return (K2.i) K2.k.f2900a.getValue();
            case 1:
                List listX0 = n5.l.x0((List) Y2.h.f8212a.getValue(), new A(0));
                ArrayList arrayList = new ArrayList();
                int size = listX0.size();
                for (int i = 0; i < size; i++) {
                    kotlin.jvm.internal.m.c((T2.c) listX0.get(i), "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    arrayList.add(new C1371j(new Q2.j(new C0433b2(10)), kotlin.jvm.internal.z.a(B.class)));
                }
                return arrayList;
            default:
                List listX02 = n5.l.x0((List) Y2.h.f8213b.getValue(), new A(1));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listX02.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((X2.a) listX02.get(i7)).getClass();
                    arrayList2.add(new W2.c());
                }
                return arrayList2;
        }
    }
}
