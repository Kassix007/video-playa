package k0;

import r.AbstractC1561l;
import r.C1570v;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1570v f14010a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q qVar = d.f13986e;
        int i = qVar.f13981c;
        e eVar = new e(qVar, qVar, 1);
        int i7 = qVar.f13981c;
        l lVar = d.f14002x;
        int i8 = (lVar.f13981c << 6) | i7;
        g gVar = new g(qVar, lVar, 0);
        int i9 = (i7 << 6) | lVar.f13981c;
        g gVar2 = new g(lVar, qVar, 0);
        C1570v c1570v = AbstractC1561l.f16221a;
        C1570v c1570v2 = new C1570v();
        c1570v2.h(i | (i << 6), eVar);
        c1570v2.h(i8, gVar);
        c1570v2.h(i9, gVar2);
        f14010a = c1570v2;
    }
}
