package I2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.C1371j;
import t2.C1617b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2353e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(C1617b c1617b) {
        this.f2349a = n5.l.C0(c1617b.f16676a);
        this.f2350b = n5.l.C0(c1617b.f16677b);
        this.f2351c = n5.l.C0(c1617b.f16678c);
        this.f2352d = n5.l.C0(c1617b.f16679d);
        this.f2353e = n5.l.C0(c1617b.f16680e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(A2.a aVar, Class cls) {
        this.f2350b.add(new C1371j(aVar, cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(L2.f fVar, kotlin.jvm.internal.f fVar2) {
        this.f2352d.add(new e(0, fVar, fVar2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(O2.a aVar, kotlin.jvm.internal.f fVar) {
        this.f2350b.add(new C1371j(aVar, fVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(x2.f fVar, Class cls) {
        this.f2352d.add(new C1371j(fVar, cls));
    }

    public f(g gVar) {
        this.f2349a = n5.l.C0(gVar.f2354a);
        this.f2350b = n5.l.C0(gVar.f2355b);
        this.f2351c = n5.l.C0(gVar.f2356c);
        List list = (List) gVar.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new d(0, (C1371j) it.next()));
        }
        this.f2352d = arrayList;
        List list2 = (List) gVar.f2359g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new c((J2.j) it2.next(), 1));
        }
        this.f2353e = arrayList2;
    }
}
