package i6;

import L.s;
import a.AbstractC0597a;
import d6.o;
import d6.t;
import d6.u;
import d6.w;
import h6.h;
import h6.j;
import java.io.IOException;
import java.net.ProtocolException;
import k6.C1191a;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import q6.C1541j;
import q6.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.o
    public final u a(f fVar) throws Throwable {
        t tVarF;
        IOException iOException;
        boolean z5;
        s sVar = fVar.f13651d;
        m.b(sVar);
        h hVar = (h) sVar.f3062b;
        d dVar = (d) sVar.f3064d;
        j jVar = (j) sVar.f3065e;
        d6.s sVar2 = fVar.f13652e;
        k3.c cVar = sVar2.f12416d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                dVar.c(sVar2);
                z5 = true;
            } catch (IOException e7) {
                sVar.g(e7);
                throw e7;
            }
        } catch (IOException e8) {
            e = e8;
            tVarF = null;
        }
        try {
            if (!D5.a.A(sVar2.f12414b) || cVar == null) {
                hVar.h(sVar, true, false, null);
                tVarF = null;
            } else {
                if ("100-continue".equalsIgnoreCase(sVar2.f12415c.d("Expect"))) {
                    try {
                        dVar.d();
                        tVarF = sVar.f(true);
                    } catch (IOException e9) {
                        sVar.g(e9);
                        throw e9;
                    }
                } else {
                    tVarF = null;
                }
                if (tVarF == null) {
                    k3.c cVar2 = sVar2.f12416d;
                    m.b(cVar2);
                    long jC = cVar2.c();
                    z zVarI = AbstractC0597a.i(new h6.b(sVar, dVar.a(sVar2, jC), jC));
                    zVarI.i((C1541j) cVar.f14120q);
                    zVarI.close();
                } else {
                    hVar.h(sVar, true, false, null);
                    if (jVar.f13504g == null) {
                        z5 = false;
                    }
                    if (!z5) {
                        dVar.g().k();
                    }
                }
            }
            try {
                dVar.b();
                iOException = null;
            } catch (IOException e10) {
                sVar.g(e10);
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            if ((e instanceof C1191a) || !sVar.f3061a) {
                throw e;
            }
            iOException = e;
        }
        if (tVarF == null) {
            try {
                tVarF = sVar.f(false);
                m.b(tVarF);
            } catch (IOException e12) {
                if (iOException == null) {
                    throw e12;
                }
                AbstractC1362a.a(iOException, e12);
                throw iOException;
            }
        }
        tVarF.f12418a = sVar2;
        tVarF.f12422e = jVar.f13503e;
        tVarF.f12425k = jCurrentTimeMillis;
        tVarF.f12426l = System.currentTimeMillis();
        u uVarA = tVarF.a();
        int i = uVarA.f12435t;
        if (i == 100 || (102 <= i && i < 200)) {
            t tVarF2 = sVar.f(false);
            m.b(tVarF2);
            tVarF2.f12418a = sVar2;
            tVarF2.f12422e = jVar.f13503e;
            tVarF2.f12425k = jCurrentTimeMillis;
            tVarF2.f12426l = System.currentTimeMillis();
            uVarA = tVarF2.a();
            i = uVarA.f12435t;
        }
        t tVarB = uVarA.b();
        try {
            String strA = u.a(uVarA, "Content-Type");
            long jH = dVar.h(uVarA);
            tVarB.f12423g = new g(strA, jH, AbstractC0597a.j(new h6.c(sVar, dVar.e(uVarA), jH)));
            u uVarA2 = tVarB.a();
            if ("close".equalsIgnoreCase(uVarA2.f12432q.f12415c.d("Connection")) || "close".equalsIgnoreCase(u.a(uVarA2, "Connection"))) {
                dVar.g().k();
            }
            if (i == 204 || i == 205) {
                w wVar = uVarA2.f12438w;
                if ((wVar != null ? wVar.a() : -1L) > 0) {
                    StringBuilder sb = new StringBuilder("HTTP ");
                    sb.append(i);
                    sb.append(" had non-zero Content-Length: ");
                    w wVar2 = uVarA2.f12438w;
                    sb.append(wVar2 != null ? Long.valueOf(wVar2.a()) : null);
                    throw new ProtocolException(sb.toString());
                }
            }
            return uVarA2;
        } catch (IOException e13) {
            sVar.g(e13);
            throw e13;
        }
    }
}
