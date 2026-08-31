package C;

import B0.K;
import B0.n0;
import C0.AbstractC0065a;
import C0.Z0;
import E.C0128k;
import E.Y;
import M.C0200b0;
import M.I0;
import M.J0;
import M.X;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P.C0371o;
import P.V;
import P.W;
import P.z0;
import Q.C0410a;
import Q.C0411b;
import i0.C1131c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import m5.C1386y;
import r.C1570v;
import w.C1783g;
import w.C1789j;
import w.InterfaceC1775c;
import w.j1;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f613t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0371o c0371o, C0410a c0410a, z0 z0Var, V v6) {
        super(0);
        this.f610q = 6;
        this.f611r = c0371o;
        this.f612s = c0410a;
        this.f613t = z0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        C1386y c1386y;
        switch (this.f610q) {
            case 0:
                g gVar = (g) ((P.C) this.f611r).getValue();
                A a7 = (A) this.f612s;
                return new h(a7, gVar, (C0063c) this.f613t, new Y((G5.d) a7.f566d.f.getValue(), gVar));
            case 1:
                AbstractC0065a abstractC0065a = (AbstractC0065a) this.f611r;
                abstractC0065a.removeOnAttachStateChangeListener((C0.D) this.f612s);
                Z0 listener = (Z0) this.f613t;
                kotlin.jvm.internal.m.e(listener, "listener");
                l6.d.r(abstractC0065a).f534a.remove(listener);
                return C1386y.f15098a;
            case 2:
                return new F.w((B5.g) ((W) this.f611r).getValue(), (B5.c) ((W) this.f612s).getValue(), ((Number) ((B5.a) this.f613t).invoke()).intValue());
            case 3:
                G.e eVar = (G.e) this.f611r;
                C1131c c1131cX0 = G.e.x0(eVar, (n0) this.f612s, (K) this.f613t);
                if (c1131cX0 == null) {
                    return null;
                }
                C1789j c1789j = eVar.f1969E;
                if (W0.k.a(c1789j.f18005M, 0L)) {
                    AbstractC1923a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c1131cX0.e(c1789j.B0(c1131cX0, c1789j.f18005M) ^ (-9223372034707292160L));
            case 4:
                I0 i02 = (I0) this.f611r;
                if (((Boolean) i02.f3322c.f3971d.invoke(J0.f3323q)).booleanValue()) {
                    AbstractC0263y.t((InterfaceC0261w) this.f612s, null, null, new M.W(i02, null), 3).G(new X(i02, (B5.a) this.f613t, 0));
                }
                return C1386y.f15098a;
            case 5:
                if (((Boolean) ((I0) this.f611r).f3322c.f3971d.invoke(J0.f3324r)).booleanValue()) {
                    AbstractC0263y.t((InterfaceC0261w) this.f612s, null, null, new C0200b0((I0) this.f613t, null), 3);
                }
                return Boolean.TRUE;
            case 6:
                C0371o c0371o = (C0371o) this.f611r;
                C0411b c0411b = c0371o.f5450L;
                C0410a c0410a = (C0410a) this.f612s;
                z0 z0Var = (z0) this.f613t;
                C0410a c0410a2 = c0411b.f6488b;
                try {
                    c0411b.f6488b = c0410a;
                    z0 z0Var2 = c0371o.f5444F;
                    int[] iArr = c0371o.f5466n;
                    C1570v c1570v = c0371o.f5473u;
                    c0371o.f5466n = null;
                    c0371o.f5473u = null;
                    try {
                        c0371o.f5444F = z0Var;
                        boolean z5 = c0411b.f6491e;
                        try {
                            c0411b.f6491e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0411b.f6491e = z5;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0371o.f5444F = z0Var2;
                        c0371o.f5466n = iArr;
                        c0371o.f5473u = c1570v;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0411b.f6488b = c0410a2;
                    throw th3;
                }
            case 7:
                List listL = (List) this.f612s;
                l6.d dVar = ((d6.e) this.f611r).f12319b;
                if (dVar != null) {
                    listL = dVar.l((String) this.f613t, listL);
                }
                List<Certificate> list = listL;
                ArrayList arrayList = new ArrayList(n5.m.c0(list, 10));
                for (Certificate certificate : list) {
                    kotlin.jvm.internal.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 8:
                l6.d dVar2 = ((d6.e) this.f611r).f12319b;
                kotlin.jvm.internal.m.b(dVar2);
                return dVar2.l(((d6.a) this.f613t).f12301h.f12371d, ((d6.k) this.f612s).a());
            default:
                C1789j c1789j2 = (C1789j) this.f611r;
                C0128k c0128k = c1789j2.f18001I;
                while (true) {
                    R.e eVar2 = c0128k.f1572a;
                    int i = eVar2.f6678s;
                    c1386y = C1386y.f15098a;
                    if (i != 0) {
                        if (i == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C1131c c1131c = (C1131c) ((C1783g) eVar2.f6676q[i - 1]).f17969a.invoke();
                        if (c1131c == null ? true : c1789j2.z0(c1131c, c1789j2.f18005M)) {
                            R.e eVar3 = c0128k.f1572a;
                            ((C1783g) eVar3.m(eVar3.f6678s - 1)).f17970b.resumeWith(c1386y);
                        }
                    }
                }
                if (c1789j2.f18003K) {
                    C1131c c1131cY0 = c1789j2.y0();
                    if (c1131cY0 != null && c1789j2.z0(c1131cY0, c1789j2.f18005M)) {
                        c1789j2.f18003K = false;
                    }
                }
                ((j1) this.f612s).f18013e = C1789j.x0(c1789j2, (InterfaceC1775c) this.f613t);
                return c1386y;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f610q = i;
        this.f611r = obj;
        this.f612s = obj2;
        this.f613t = obj3;
    }
}
