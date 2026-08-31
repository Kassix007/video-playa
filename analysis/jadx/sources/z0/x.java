package z0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.D0;
import B0.E0;
import C0.C0106v;
import c0.AbstractC0724l;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC1939P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f18723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18724b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(y yVar, Object obj) {
        this.f18723a = yVar;
        this.f18724b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1939P
    public final void a() {
        y yVar = this.f18723a;
        B0.L l7 = yVar.f18730q;
        yVar.b();
        B0.L l8 = (B0.L) yVar.f18739z.j(this.f18724b);
        if (l8 != null) {
            if (yVar.f18729E <= 0) {
                AbstractC1904a.b("No pre-composed items to dispose");
            }
            int iK = ((R.b) l7.o()).f6670q.k(l8);
            if (iK < ((R.b) l7.o()).f6670q.f6678s - yVar.f18729E) {
                AbstractC1904a.b("Item is not in pre-composed item range");
            }
            yVar.f18728D++;
            yVar.f18729E--;
            int i = (((R.b) l7.o()).f6670q.f6678s - yVar.f18729E) - yVar.f18728D;
            l7.f254G = true;
            l7.J(iK, i, 1);
            l7.f254G = false;
            yVar.a(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1939P
    public final int b() {
        B0.L l7 = (B0.L) this.f18723a.f18739z.g(this.f18724b);
        if (l7 != null) {
            return ((R.b) l7.n()).f6670q.f6678s;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x00a0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00af */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00a9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [C0.v] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // z0.InterfaceC1939P
    public final void c(C0106v c0106v) {
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724l;
        D0 d02;
        B0.L l7 = (B0.L) this.f18723a.f18739z.g(this.f18724b);
        if (l7 == null || (c0042g0 = l7.f268U) == null || (abstractC0724l = c0042g0.f433e) == null) {
            return;
        }
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q;
        AbstractC0724l abstractC0724l3 = abstractC0724l2.f10105v;
        if (abstractC0724l3 == null) {
            AbstractC0041g.b(eVar, abstractC0724l2);
        } else {
            eVar.c(abstractC0724l3);
        }
        while (true) {
            int i = eVar.f6678s;
            if (i == 0) {
                return;
            }
            AbstractC0724l abstractC0724l4 = (AbstractC0724l) eVar.m(i - 1);
            if ((abstractC0724l4.f10103t & 262144) != 0) {
                for (AbstractC0724l abstractC0724l5 = abstractC0724l4; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                    if ((abstractC0724l5.f10102s & 262144) != 0) {
                        ?? F6 = abstractC0724l5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof E0) {
                                E0 e02 = (E0) F6;
                                boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(e02.o());
                                D0 d03 = D0.f222r;
                                if (zEquals) {
                                    c0106v.invoke(e02);
                                    d02 = d03;
                                } else {
                                    d02 = D0.f221q;
                                }
                                if (d02 == D0.f223s) {
                                    return;
                                }
                                if (d02 == d03) {
                                    break;
                                }
                            } else if ((F6.f10102s & 262144) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l6 = ((AbstractC0049n) F6).f473F;
                                int i7 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC0724l6 != null) {
                                    if ((abstractC0724l6.f10102s & 262144) != 0) {
                                        i7++;
                                        eVar2 = eVar2;
                                        if (i7 == 1) {
                                            F6 = abstractC0724l6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.c(F6);
                                                F6 = 0;
                                            }
                                            eVar2.c(abstractC0724l6);
                                        }
                                    }
                                    abstractC0724l6 = abstractC0724l6.f10105v;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F6 = AbstractC0041g.f(eVar2);
                        }
                    }
                }
            }
            AbstractC0041g.b(eVar, abstractC0724l4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1939P
    public final void d(int i, long j) {
        y yVar = this.f18723a;
        B0.L l7 = (B0.L) yVar.f18739z.g(this.f18724b);
        if (l7 == null || !l7.F()) {
            return;
        }
        int i7 = ((R.b) l7.n()).f6670q.f6678s;
        if (i < 0 || i >= i7) {
            AbstractC1904a.d("Index (" + i + ") is out of bound of [0, " + i7 + ')');
        }
        if (l7.G()) {
            AbstractC1904a.a("Pre-measure called on node that is not placed");
        }
        B0.L l8 = yVar.f18730q;
        l8.f254G = true;
        ((C0.A) B0.O.a(l7)).A((B0.L) ((R.b) l7.n()).get(i), j);
        l8.f254G = false;
    }
}
