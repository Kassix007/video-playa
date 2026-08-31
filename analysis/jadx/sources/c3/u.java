package c3;

import d3.InterfaceC1001a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements d, InterfaceC1001a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10233b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.i f10235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d3.i f10236e;
    public final d3.i f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(j3.b bVar, i3.q qVar) {
        this.f10232a = qVar.f13633e;
        this.f10234c = qVar.f13629a;
        d3.i iVarF = qVar.f13630b.f();
        this.f10235d = iVarF;
        d3.i iVarF2 = qVar.f13631c.f();
        this.f10236e = iVarF2;
        d3.i iVarF3 = qVar.f13632d.f();
        this.f = iVarF3;
        bVar.d(iVarF);
        bVar.d(iVarF2);
        bVar.d(iVarF3);
        iVarF.a(this);
        iVarF2.a(this);
        iVarF3.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10233b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC1001a) arrayList.get(i)).b();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(InterfaceC1001a interfaceC1001a) {
        this.f10233b.add(interfaceC1001a);
    }

    @Override // c3.d
    public final void c(List list, List list2) {
    }
}
