package E;

import B0.j0;
import r.C1548G;

/* JADX INFO: renamed from: E.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0137u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.c f1589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C.j f1590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1548G f1591c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0137u(Z.c cVar, C.j jVar) {
        this.f1589a = cVar;
        this.f1590b = jVar;
        long[] jArr = r.O.f16162a;
        this.f1591c = new C1548G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.e a(int i, Object obj, Object obj2) {
        C1548G c1548g = this.f1591c;
        C0136t c0136t = (C0136t) c1548g.g(obj);
        if (c0136t != null && c0136t.f1586c == i && kotlin.jvm.internal.m.a(c0136t.f1585b, obj2)) {
            X.e eVar = c0136t.f1587d;
            if (eVar != null) {
                return eVar;
            }
            X.e eVar2 = new X.e(1403994769, true, new j0(3, c0136t.f1588e, c0136t));
            c0136t.f1587d = eVar2;
            return eVar2;
        }
        C0136t c0136t2 = new C0136t(this, i, obj, obj2);
        c1548g.l(obj, c0136t2);
        X.e eVar3 = c0136t2.f1587d;
        if (eVar3 != null) {
            return eVar3;
        }
        X.e eVar4 = new X.e(1403994769, true, new j0(3, this, c0136t2));
        c0136t2.f1587d = eVar4;
        return eVar4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C0136t c0136t = (C0136t) this.f1591c.g(obj);
        if (c0136t != null) {
            return c0136t.f1585b;
        }
        InterfaceC0140x interfaceC0140x = (InterfaceC0140x) this.f1590b.invoke();
        int iD = interfaceC0140x.d(obj);
        if (iD != -1) {
            return interfaceC0140x.c(iD);
        }
        return null;
    }
}
