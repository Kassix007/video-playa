package R4;

import B0.C0050o;
import m5.C1386y;
import org.json.JSONObject;
import y4.C1919c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z0 implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0050o f6907r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Z0(int i, C0050o c0050o) {
        this.f6906q = i;
        this.f6907r = c0050o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f6906q) {
            case 0:
                C0050o c0050o = ((C0468k1) this.f6907r.f499q).f7049I;
                if (c0050o != null) {
                    Y4.d dVar = (Y4.d) c0050o.f500r;
                    S3.k kVarB = dVar.f8278g.b();
                    L0 l02 = new L0(4, new Y4.b(dVar, 0));
                    kVarB.getClass();
                    kVarB.a(S3.f.f7307a, l02);
                }
                return C1386y.f15098a;
            case 1:
                C0050o c0050o2 = ((C0468k1) this.f6907r.f499q).f7049I;
                if (c0050o2 != null) {
                    Y4.d dVar2 = (Y4.d) c0050o2.f500r;
                    if (dVar2.i) {
                        dVar2.f8278g.a();
                    }
                    dVar2.i = false;
                }
                return C1386y.f15098a;
            case 2:
                C0050o c0050o3 = ((C0468k1) this.f6907r.f499q).f7049I;
                if (c0050o3 != null) {
                    Y4.d dVar3 = (Y4.d) c0050o3.f500r;
                    y4.e eVar = dVar3.f8278g;
                    Y4.c cVar = dVar3.f8276d;
                    synchronized (eVar) {
                        C1919c c1919c = eVar.f18634b;
                        synchronized (c1919c) {
                            c1919c.f18626a.e("unregisterListener", new Object[0]);
                            c1919c.f18629d.remove(cVar);
                            c1919c.a();
                        }
                    }
                }
                return C1386y.f15098a;
            default:
                C0050o c0050o4 = this.f6907r;
                JSONObject it = (JSONObject) obj;
                kotlin.jvm.internal.m.e(it, "it");
                l3 l3Var = ((C0468k1) c0050o4.f499q).f7048H;
                if (l3Var != null) {
                    l3Var.a(it);
                }
                return C1386y.f15098a;
        }
    }
}
