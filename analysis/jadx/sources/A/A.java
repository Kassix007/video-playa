package A;

import B0.InterfaceC0060z;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EnumC0026x f0E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f1F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!W0.a.d(j) || this.f0E == EnumC0026x.f153q) {
            iJ = W0.a.j(j);
            iH = W0.a.h(j);
        } else {
            int iRound = Math.round(W0.a.h(j) * this.f1F);
            int iJ2 = W0.a.j(j);
            iJ = W0.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!W0.a.c(j) || this.f0E == EnumC0026x.f154r) {
            int i = W0.a.i(j);
            iG = W0.a.g(j);
            iG2 = i;
        } else {
            int iRound2 = Math.round(W0.a.g(j) * this.f1F);
            int i7 = W0.a.i(j);
            iG2 = W0.a.g(j);
            if (iRound2 < i7) {
                iRound2 = i7;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(W0.b.a(iJ, iH, iG2, iG));
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new C0028z(abstractC1933JA, 0));
    }
}
