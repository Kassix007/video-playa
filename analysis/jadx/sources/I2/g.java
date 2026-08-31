package I2;

import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1362a;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f2357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2358e;
    public final C1376o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1376o f2359g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(List list, List list2, List list3, List list4, List list5) {
        this.f2354a = list;
        this.f2355b = list2;
        this.f2356c = list3;
        this.f2357d = list4;
        this.f2358e = list5;
        final int i = 0;
        this.f = AbstractC1362a.d(new B5.a(this) { // from class: I2.b

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f2341r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2341r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g gVar = this.f2341r;
                        List list6 = gVar.f2357d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            n5.q.e0(arrayList, (List) ((B5.a) list6.get(i7)).invoke());
                        }
                        gVar.f2357d = n5.s.f15299q;
                        return arrayList;
                    default:
                        g gVar2 = this.f2341r;
                        List list7 = gVar2.f2358e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            n5.q.e0(arrayList2, (List) ((B5.a) list7.get(i8)).invoke());
                        }
                        gVar2.f2358e = n5.s.f15299q;
                        return arrayList2;
                }
            }
        });
        final int i7 = 1;
        this.f2359g = AbstractC1362a.d(new B5.a(this) { // from class: I2.b

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f2341r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2341r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        g gVar = this.f2341r;
                        List list6 = gVar.f2357d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i72 = 0; i72 < size; i72++) {
                            n5.q.e0(arrayList, (List) ((B5.a) list6.get(i72)).invoke());
                        }
                        gVar.f2357d = n5.s.f15299q;
                        return arrayList;
                    default:
                        g gVar2 = this.f2341r;
                        List list7 = gVar2.f2358e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            n5.q.e0(arrayList2, (List) ((B5.a) list7.get(i8)).invoke());
                        }
                        gVar2.f2358e = n5.s.f15299q;
                        return arrayList2;
                }
            }
        });
    }
}
