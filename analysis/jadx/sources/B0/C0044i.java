package B0;

import C0.AbstractC0103t0;
import C0.b1;
import P.C0345b;
import P.InterfaceC0386w;
import P.T0;
import c0.AbstractC0724l;
import c0.InterfaceC0725m;
import m5.C1386y;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: B0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044i extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0044i f438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0044i f439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0044i f440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0044i f441u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f442q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f438r = new C0044i(i, 0);
        f439s = new C0044i(i, 1);
        f440t = new C0044i(i, 2);
        f441u = new C0044i(i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0044i(int i, int i7) {
        super(i);
        this.f442q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00b3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x00ad */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f442q) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0046k) obj).getClass();
                break;
            case 1:
                ((L) ((InterfaceC0046k) obj)).X((InterfaceC1926C) obj2);
                break;
            case 2:
                ((L) ((InterfaceC0046k) obj)).Y((InterfaceC0725m) obj2);
                break;
            default:
                InterfaceC0386w interfaceC0386w = (InterfaceC0386w) obj2;
                L l7 = (L) ((InterfaceC0046k) obj);
                l7.f264Q = interfaceC0386w;
                C0042g0 c0042g0 = l7.f268U;
                T0 t02 = AbstractC0103t0.f1116h;
                X.i iVar = (X.i) interfaceC0386w;
                iVar.getClass();
                l7.V((W0.c) C0345b.r(iVar, t02));
                W0.l lVar = (W0.l) C0345b.r(iVar, AbstractC0103t0.f1120n);
                if (l7.f262O != lVar) {
                    l7.f262O = lVar;
                    l7.C();
                    L lS = l7.s();
                    if (lS != null) {
                        lS.A();
                    }
                    l7.B();
                    for (AbstractC0724l abstractC0724l = c0042g0.f433e; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
                        abstractC0724l.h0();
                    }
                }
                l7.Z((b1) C0345b.r(iVar, AbstractC0103t0.f1125s));
                AbstractC0724l abstractC0724l2 = c0042g0.f433e;
                if ((abstractC0724l2.f10103t & 32768) != 0) {
                    while (abstractC0724l2 != null) {
                        if ((abstractC0724l2.f10102s & 32768) != 0) {
                            ?? F6 = abstractC0724l2;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC0047l) {
                                    AbstractC0724l abstractC0724l3 = ((AbstractC0724l) ((InterfaceC0047l) F6)).f10100q;
                                    if (abstractC0724l3.f10099D) {
                                        o0.c(abstractC0724l3);
                                    } else {
                                        abstractC0724l3.f10109z = true;
                                    }
                                } else if ((F6.f10102s & 32768) != 0 && (F6 instanceof AbstractC0049n)) {
                                    AbstractC0724l abstractC0724l4 = ((AbstractC0049n) F6).f473F;
                                    int i = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC0724l4 != null) {
                                        if ((abstractC0724l4.f10102s & 32768) != 0) {
                                            i++;
                                            eVar = eVar;
                                            if (i == 1) {
                                                F6 = abstractC0724l4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.c(F6);
                                                    F6 = 0;
                                                }
                                                eVar.c(abstractC0724l4);
                                            }
                                        }
                                        abstractC0724l4 = abstractC0724l4.f10105v;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                F6 = AbstractC0041g.f(eVar);
                            }
                        }
                        if ((abstractC0724l2.f10103t & 32768) != 0) {
                            abstractC0724l2 = abstractC0724l2.f10105v;
                        }
                    }
                }
                break;
        }
        return C1386y.f15098a;
    }
}
