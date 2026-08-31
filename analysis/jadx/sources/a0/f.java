package A0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.InterfaceC0048m;
import B0.L;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.I1;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public interface f extends g, InterfaceC0048m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x007d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x008c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0086 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [B5.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [A0.f, B0.m] */
    @Override // A0.g
    default Object e(h hVar) {
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724l = (AbstractC0724l) this;
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.a("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q.f10104u;
        L lU = AbstractC0041g.u(this);
        while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 32) != 0) {
                while (abstractC0724l2 != null) {
                    if ((abstractC0724l2.f10102s & 32) != 0) {
                        ?? F6 = abstractC0724l2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof f) {
                                f fVar = (f) F6;
                                if (fVar.h().O(hVar)) {
                                    return fVar.h().X(hVar);
                                }
                            } else if ((F6.f10102s & 32) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l3 = ((AbstractC0049n) F6).f473F;
                                int i = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC0724l3 != null) {
                                    if ((abstractC0724l3.f10102s & 32) != 0) {
                                        i++;
                                        eVar = eVar;
                                        if (i == 1) {
                                            F6 = abstractC0724l3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar.c(F6);
                                                F6 = 0;
                                            }
                                            eVar.c(abstractC0724l3);
                                        }
                                    }
                                    abstractC0724l3 = abstractC0724l3.f10105v;
                                    F6 = F6;
                                    eVar = eVar;
                                }
                                if (i == 1) {
                                }
                            }
                            F6 = AbstractC0041g.f(eVar);
                        }
                    }
                    abstractC0724l2 = abstractC0724l2.f10104u;
                }
            }
            lU = lU.s();
            abstractC0724l2 = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
        }
        return hVar.f170a.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default I1 h() {
        return b.f162c;
    }
}
