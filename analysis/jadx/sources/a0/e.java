package A0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0035d;
import B0.L;
import C0.A;
import c0.AbstractC0724l;
import java.util.HashSet;
import r.C1544C;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R.e f166b = new R.e(new C0035d[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R.e f167c = new R.e(new h[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R.e f168d = new R.e(new L[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R.e f169e = new R.e(new h[16]);
    public boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(A a7) {
        this.f165a = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0092 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x00a1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x003f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x003f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x009b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(AbstractC0724l abstractC0724l, h hVar, HashSet hashSet) {
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
            if ((abstractC0724l4.f10103t & 32) != 0) {
                for (AbstractC0724l abstractC0724l5 = abstractC0724l4; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                    if ((abstractC0724l5.f10102s & 32) != 0) {
                        ?? F6 = abstractC0724l5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof f) {
                                f fVar = (f) F6;
                                if (fVar instanceof C0035d) {
                                    C0035d c0035d = (C0035d) fVar;
                                    if ((c0035d.f405E instanceof c) && c0035d.f407G.contains(hVar)) {
                                        hashSet.add(fVar);
                                    }
                                }
                                if (fVar.h().O(hVar)) {
                                    break;
                                }
                            } else if ((F6.f10102s & 32) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l6 = ((AbstractC0049n) F6).f473F;
                                int i7 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC0724l6 != null) {
                                    if ((abstractC0724l6.f10102s & 32) != 0) {
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
    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        d dVar = new d(0, this);
        C1544C c1544c = this.f165a.f721J0;
        if (c1544c.f(dVar) >= 0) {
            return;
        }
        c1544c.a(dVar);
    }
}
