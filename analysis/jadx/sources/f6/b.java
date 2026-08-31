package f6;

import d6.l;
import d6.o;
import d6.r;
import d6.s;
import d6.t;
import d6.u;
import d6.w;
import i6.f;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.o
    public final u a(f fVar) throws Throwable {
        Throwable th;
        int i;
        System.currentTimeMillis();
        s request = fVar.f13652e;
        m.e(request, "request");
        Throwable th2 = null;
        Z.m mVar = new Z.m(10, request, th2);
        if (request.a().j) {
            mVar = new Z.m(10, th2, th2);
        }
        s sVar = (s) mVar.f8312r;
        u uVar = (u) mVar.f8313s;
        if (sVar == null && uVar == null) {
            ArrayList arrayList = new ArrayList(20);
            return new u(request, r.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) arrayList.toArray(new String[0])), e6.b.f12675c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (sVar == null) {
            m.b(uVar);
            t tVarB = uVar.b();
            u uVarA = a.a(uVar);
            t.b(uVarA, "cacheResponse");
            tVarB.i = uVarA;
            return tVarB.a();
        }
        u uVarB = fVar.b(sVar);
        if (uVar != null) {
            if (uVarB.f12435t == 304) {
                t tVarB2 = uVar.b();
                l lVar = uVar.f12437v;
                l lVar2 = uVarB.f12437v;
                ArrayList arrayList2 = new ArrayList(20);
                int size = lVar.size();
                int i7 = 0;
                while (true) {
                    th = th2;
                    if (i7 >= size) {
                        break;
                    }
                    String name = lVar.g(i7);
                    int i8 = size;
                    String value = lVar.i(i7);
                    l lVar3 = lVar;
                    if ("Warning".equalsIgnoreCase(name)) {
                        i = i7;
                        if (J5.t.G0(value, "1", false)) {
                        }
                        i7 = i + 1;
                        size = i8;
                        th2 = th;
                        lVar = lVar3;
                    } else {
                        i = i7;
                    }
                    if ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || "Content-Type".equalsIgnoreCase(name) || !a.b(name) || lVar2.d(name) == null) {
                        m.e(name, "name");
                        m.e(value, "value");
                        arrayList2.add(name);
                        arrayList2.add(J5.m.n1(value).toString());
                    }
                    i7 = i + 1;
                    size = i8;
                    th2 = th;
                    lVar = lVar3;
                }
                int size2 = lVar2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String name2 = lVar2.g(i9);
                    if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !"Content-Type".equalsIgnoreCase(name2) && a.b(name2)) {
                        String value2 = lVar2.i(i9);
                        m.e(name2, "name");
                        m.e(value2, "value");
                        arrayList2.add(name2);
                        arrayList2.add(J5.m.n1(value2).toString());
                    }
                }
                tVarB2.f = new l((String[]) arrayList2.toArray(new String[0])).h();
                tVarB2.f12425k = uVarB.f12428A;
                tVarB2.f12426l = uVarB.f12429B;
                u uVarA2 = a.a(uVar);
                t.b(uVarA2, "cacheResponse");
                tVarB2.i = uVarA2;
                u uVarA3 = a.a(uVarB);
                t.b(uVarA3, "networkResponse");
                tVarB2.f12424h = uVarA3;
                tVarB2.a();
                w wVar = uVarB.f12438w;
                m.b(wVar);
                wVar.close();
                m.b(th);
                throw th;
            }
            w wVar2 = uVar.f12438w;
            if (wVar2 != null) {
                e6.b.b(wVar2);
            }
        }
        t tVarB3 = uVarB.b();
        u uVarA4 = a.a(uVar);
        t.b(uVarA4, "cacheResponse");
        tVarB3.i = uVarA4;
        u uVarA5 = a.a(uVarB);
        t.b(uVarA5, "networkResponse");
        tVarB3.f12424h = uVarA5;
        return tVarB3.a();
    }
}
