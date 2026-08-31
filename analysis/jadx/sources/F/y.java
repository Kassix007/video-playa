package F;

import java.util.ArrayList;
import java.util.List;
import m5.C1386y;
import z.AbstractC1923a;
import z0.AbstractC1932I;
import z0.AbstractC1933J;
import z0.AbstractC1935L;
import z0.C1934K;

/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1933r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, ArrayList arrayList) {
        super(1);
        this.f1932q = i;
        this.f1933r = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        AbstractC1932I abstractC1932I;
        int i = this.f1932q;
        C1386y c1386y = C1386y.f15098a;
        int i7 = 0;
        ArrayList arrayList = this.f1933r;
        switch (i) {
            case 0:
                AbstractC1932I abstractC1932I2 = (AbstractC1932I) obj;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    C0158l c0158l = (C0158l) arrayList.get(i8);
                    List list = c0158l.f1889b;
                    boolean z5 = c0158l.i;
                    if (c0158l.f1897m == Integer.MIN_VALUE) {
                        AbstractC1923a.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i9 = i7;
                    while (i9 < size2) {
                        AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i9);
                        int[] iArr = c0158l.f1895k;
                        int i10 = i9 * 2;
                        ArrayList arrayList2 = arrayList;
                        long j = (((long) iArr[i10 + 1]) & 4294967295L) | (((long) iArr[i10]) << 32);
                        if (c0158l.f1894h) {
                            int i11 = z5 ? (int) (j >> 32) : (c0158l.f1897m - ((int) (j >> 32))) - (z5 ? abstractC1933J.f18665r : abstractC1933J.f18664q);
                            j = (((long) (z5 ? (c0158l.f1897m - ((int) (j & 4294967295L))) - (z5 ? abstractC1933J.f18665r : abstractC1933J.f18664q) : (int) (j & 4294967295L))) & 4294967295L) | (((long) i11) << 32);
                        }
                        long jC = W0.i.c(j, c0158l.f1890c);
                        if (z5) {
                            AbstractC1932I.i(abstractC1932I2, abstractC1933J, jC);
                            abstractC1932I = abstractC1932I2;
                        } else {
                            int i12 = AbstractC1935L.f18673b;
                            C1934K c1934k = C1934K.f18669r;
                            if (abstractC1932I2.b() == W0.l.f8022q || abstractC1932I2.c() == 0) {
                                abstractC1932I = abstractC1932I2;
                                AbstractC1932I.a(abstractC1932I, abstractC1933J);
                                abstractC1933J.U(W0.i.c(jC, abstractC1933J.f18668u), 0.0f, c1934k);
                            } else {
                                long jC2 = (((long) ((int) (jC & 4294967295L))) & 4294967295L) | (((long) ((abstractC1932I2.c() - abstractC1933J.f18664q) - ((int) (jC >> 32)))) << 32);
                                abstractC1932I = abstractC1932I2;
                                AbstractC1932I.a(abstractC1932I, abstractC1933J);
                                abstractC1933J.U(W0.i.c(jC2, abstractC1933J.f18668u), 0.0f, c1934k);
                            }
                        }
                        i9++;
                        abstractC1932I2 = abstractC1932I;
                        arrayList = arrayList2;
                    }
                    i8++;
                    i7 = 0;
                }
                break;
            case 1:
                AbstractC1932I abstractC1932I3 = (AbstractC1932I) obj;
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    AbstractC1932I.f(abstractC1932I3, (AbstractC1933J) arrayList.get(i13), 0, 0);
                }
                break;
            case 2:
                AbstractC1932I abstractC1932I4 = (AbstractC1932I) obj;
                int size4 = arrayList.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    AbstractC1932I.d(abstractC1932I4, (AbstractC1933J) arrayList.get(i14), 0, 0);
                }
                break;
            default:
                AbstractC1932I abstractC1932I5 = (AbstractC1932I) obj;
                int size5 = arrayList.size();
                while (i7 < size5) {
                    AbstractC1932I.g(abstractC1932I5, (AbstractC1933J) arrayList.get(i7));
                    i7++;
                }
                break;
        }
        return c1386y;
    }
}
