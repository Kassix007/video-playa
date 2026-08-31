package D;

import E.InterfaceC0132o;
import java.util.Collection;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0132o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1196a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(y yVar) {
        this.f1196a = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int a() {
        return this.f1196a.g().f1258o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // E.InterfaceC0132o
    public final int b() {
        return ((p) n5.l.r0(this.f1196a.g().f1255l)).f1262a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final boolean c() {
        return !((Collection) this.f1196a.g().f1255l).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // E.InterfaceC0132o
    public final int d() {
        int i;
        boolean z5;
        long j;
        y yVar = this.f1196a;
        int i7 = 0;
        if (yVar.g().f1255l.isEmpty()) {
            return 0;
        }
        o oVarG = yVar.g();
        EnumC1778d0 enumC1778d0 = oVarG.f1259p;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
        int iG = (int) (enumC1778d0 == enumC1778d02 ? oVarG.g() & 4294967295L : oVarG.g() >> 32);
        o oVarG2 = yVar.g();
        boolean z6 = oVarG2.f1259p == enumC1778d02;
        ?? r8 = oVarG2.f1255l;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < r8.size()) {
            int iQ = Q2.g.Q(z6, oVarG2, i8);
            if (iQ == -1) {
                i8++;
            } else {
                int iMax = i7;
                while (i8 < r8.size() && Q2.g.Q(z6, oVarG2, i8) == iQ) {
                    if (z6) {
                        z5 = z6;
                        j = ((p) r8.get(i8)).f1272n & 4294967295L;
                    } else {
                        z5 = z6;
                        j = ((p) r8.get(i8)).f1272n >> 32;
                    }
                    iMax = Math.max(iMax, (int) j);
                    i8++;
                    z6 = z5;
                }
                i9 += iMax;
                i10++;
                z6 = z6;
                i7 = 0;
            }
        }
        int i11 = (i9 / i10) + oVarG2.f1261r;
        if (i11 != 0 && (i = iG / i11) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int e() {
        return this.f1196a.f1308d.f685b.e();
    }
}
