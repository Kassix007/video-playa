package L0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f3123r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i) {
        super(0);
        this.f3122q = i;
        this.f3123r = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f3122q) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3123r.f3124a;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fC = ((o) obj3).f3163a.i.c();
                    int iU = AbstractC0836n2.u(arrayList);
                    int i = 1;
                    if (1 <= iU) {
                        while (true) {
                            Object obj4 = arrayList.get(i);
                            float fC2 = ((o) obj4).f3163a.i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj3 = obj4;
                                fC = fC2;
                            }
                            if (i != iU) {
                                i++;
                            }
                        }
                    }
                    obj = obj3;
                }
                o oVar = (o) obj;
                return Float.valueOf(oVar != null ? oVar.f3163a.i.c() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f3123r.f3124a;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fC3 = ((o) obj5).f3163a.c();
                    int iU2 = AbstractC0836n2.u(arrayList2);
                    int i7 = 1;
                    if (1 <= iU2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i7);
                            float fC4 = ((o) obj6).f3163a.c();
                            if (Float.compare(fC3, fC4) < 0) {
                                obj5 = obj6;
                                fC3 = fC4;
                            }
                            if (i7 != iU2) {
                                i7++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                o oVar2 = (o) obj2;
                return Float.valueOf(oVar2 != null ? oVar2.f3163a.c() : 0.0f);
        }
    }
}
