package Q;

import P.AbstractC0373p;
import P.C0343a;
import P.D0;
import P.InterfaceC0347c;

/* JADX INFO: renamed from: Q.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0419j extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0419j f6504c = new C0419j(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        int i;
        X.f fVar = (X.f) j.d(0);
        int iC = d02.c((C0343a) j.d(1));
        if (d02.f5304t >= iC) {
            AbstractC0373p.c("Check failed");
        }
        C3.a.L(d02, interfaceC0347c, iC);
        int i7 = d02.f5304t;
        int iC2 = d02.f5306v;
        while (iC2 >= 0 && !d02.w(iC2)) {
            iC2 = d02.C(d02.f5289b, iC2);
        }
        int iS = iC2 + 1;
        int I6 = 0;
        while (iS < i7) {
            if (d02.t(i7, iS)) {
                if (d02.w(iS)) {
                    I6 = 0;
                }
                iS++;
            } else {
                I6 += d02.w(iS) ? 1 : d02.f5289b[(d02.q(iS) * 5) + 1] & 67108863;
                iS += d02.s(iS);
            }
        }
        while (true) {
            i = d02.f5304t;
            if (i >= iC) {
                break;
            }
            if (d02.t(iC, i)) {
                int i8 = d02.f5304t;
                if (i8 < d02.f5305u && (d02.f5289b[(d02.q(i8) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0347c.d(d02.B(d02.f5304t));
                    I6 = 0;
                }
                d02.N();
            } else {
                I6 += d02.I();
            }
        }
        if (i != iC) {
            AbstractC0373p.c("Check failed");
        }
        fVar.f8141a = I6;
    }
}
