package C0;

import B0.AbstractC0041g;
import M5.AbstractC0263y;
import h0.C1110c;
import i0.C1131c;
import m5.C1386y;

/* JADX INFO: renamed from: C0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0102t extends kotlin.jvm.internal.k implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1109q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102t(int i, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i, i7, cls, obj, str, str2);
        this.f1109q = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        v.J jB0;
        switch (this.f1109q) {
            case 0:
                return Boolean.valueOf(A.k((A) this.receiver, (C1110c) obj, (C1131c) obj2));
            case 1:
                X5.f p02 = (X5.f) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.e(p02, "p0");
                b6.d dVar = (b6.d) this.receiver;
                dVar.getClass();
                boolean z5 = !p02.j(iIntValue) && p02.i(iIntValue).g();
                dVar.f10023b = z5;
                return Boolean.valueOf(z5);
            default:
                h0.n nVar = (h0.n) obj;
                h0.n nVar2 = (h0.n) obj2;
                v.I i = (v.I) this.receiver;
                if (i.f10099D && (zA = nVar2.a()) != nVar.a()) {
                    C0100s c0100s = i.f17245H;
                    if (c0100s != null) {
                        c0100s.invoke(Boolean.valueOf(zA));
                    }
                    if (zA) {
                        AbstractC0263y.t(i.l0(), null, null, new v.H(i, null), 3);
                        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        AbstractC0041g.r(i, new B0.K(yVar, i, 18));
                        E.G g7 = (E.G) yVar.f14268q;
                        if (g7 != null) {
                            g7.a();
                        } else {
                            g7 = null;
                        }
                        i.f17247J = g7;
                        B0.n0 n0Var = i.f17248K;
                        if (n0Var != null && n0Var.B0().f10099D && (jB0 = i.B0()) != null) {
                            jB0.x0(i.f17248K);
                        }
                    } else {
                        E.G g8 = i.f17247J;
                        if (g8 != null) {
                            g8.b();
                        }
                        i.f17247J = null;
                        v.J jB02 = i.B0();
                        if (jB02 != null) {
                            jB02.x0(null);
                        }
                    }
                    AbstractC0041g.n(i);
                    y.i iVar = i.f17244G;
                    if (iVar != null) {
                        if (zA) {
                            y.d dVar2 = i.f17246I;
                            if (dVar2 != null) {
                                i.A0(iVar, new y.e(dVar2));
                                i.f17246I = null;
                            }
                            y.d dVar3 = new y.d();
                            i.A0(iVar, dVar3);
                            i.f17246I = dVar3;
                        } else {
                            y.d dVar4 = i.f17246I;
                            if (dVar4 != null) {
                                i.A0(iVar, new y.e(dVar4));
                                i.f17246I = null;
                            }
                        }
                    }
                }
                return C1386y.f15098a;
        }
    }
}
