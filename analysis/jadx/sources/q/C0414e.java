package Q;

import P.AbstractC0373p;
import P.C0343a;
import P.D0;
import P.InterfaceC0347c;
import P.x0;

/* JADX INFO: renamed from: Q.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0414e extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0414e f6499c = new C0414e(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        C0343a c0343a = (C0343a) j.d(0);
        Object objD = j.d(1);
        if (objD instanceof x0) {
            jVar.f8151c.c((x0) objD);
        }
        if (d02.f5298n != 0) {
            AbstractC0373p.c("Can only append a slot if not current inserting");
        }
        int i = d02.i;
        int i7 = d02.j;
        int iC = d02.c(c0343a);
        int iF = d02.f(d02.f5289b, d02.q(iC + 1));
        d02.i = iF;
        d02.j = iF;
        d02.v(1, iC);
        if (i >= iF) {
            i++;
            i7++;
        }
        d02.f5290c[iF] = objD;
        d02.i = i;
        d02.j = i7;
    }
}
