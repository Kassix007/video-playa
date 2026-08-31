package Q;

import P.AbstractC0373p;
import P.C0;
import P.C0343a;
import P.D0;
import P.InterfaceC0347c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f6518c = new u(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        C0343a c0343a;
        int iC;
        int iC2 = j.c(0);
        if (d02.f5298n != 0) {
            AbstractC0373p.c("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            AbstractC0373p.c("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i = d02.f5304t;
        int i7 = d02.f5306v;
        int i8 = d02.f5305u;
        int i9 = i;
        while (iC2 > 0) {
            i9 += d02.f5289b[(d02.q(i9) * 5) + 3];
            if (i9 > i8) {
                AbstractC0373p.c("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i10 = d02.f5289b[(d02.q(i9) * 5) + 3];
        int iF = d02.f(d02.f5289b, d02.q(d02.f5304t));
        int iF2 = d02.f(d02.f5289b, d02.q(i9));
        int i11 = i9 + i10;
        int iF3 = d02.f(d02.f5289b, d02.q(i11));
        int i12 = iF3 - iF2;
        d02.v(i12, Math.max(d02.f5304t - 1, 0));
        d02.u(i10);
        int[] iArr = d02.f5289b;
        int iQ = d02.q(i11) * 5;
        n5.k.C0(d02.q(i) * 5, iQ, (i10 * 5) + iQ, iArr, iArr);
        if (i12 > 0) {
            Object[] objArr = d02.f5290c;
            int iG = d02.g(iF2 + i12);
            System.arraycopy(objArr, iG, objArr, iF, d02.g(iF3 + i12) - iG);
        }
        int i13 = iF2 + i12;
        int i14 = i13 - iF;
        int i15 = d02.f5295k;
        int i16 = d02.f5296l;
        int length = d02.f5290c.length;
        int i17 = d02.f5297m;
        int i18 = i + i10;
        int i19 = i;
        while (i19 < i18) {
            int iQ2 = d02.q(i19);
            int i20 = i14;
            int[] iArr2 = iArr;
            iArr2[(iQ2 * 5) + 4] = D0.h(D0.h(d02.f(iArr, iQ2) - i20, i17 < iQ2 ? 0 : i15, i16, length), d02.f5295k, d02.f5296l, d02.f5290c.length);
            i19++;
            i14 = i20;
            i15 = i15;
            iArr = iArr2;
        }
        int i21 = i11 + i10;
        int iN = d02.n();
        int iB = C0.b(d02.f5291d, i11, iN);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < d02.f5291d.size() && (iC = d02.c((c0343a = (C0343a) d02.f5291d.get(iB)))) >= i11 && iC < i21) {
                arrayList.add(c0343a);
                d02.f5291d.remove(iB);
            }
        }
        int i22 = i - i11;
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            C0343a c0343a2 = (C0343a) arrayList.get(i23);
            int iC3 = d02.c(c0343a2) + i22;
            if (iC3 >= d02.f5293g) {
                c0343a2.f5384a = -(iN - iC3);
            } else {
                c0343a2.f5384a = iC3;
            }
            d02.f5291d.add(C0.b(d02.f5291d, iC3, iN), c0343a2);
        }
        if (d02.G(i11, i10)) {
            AbstractC0373p.c("Unexpectedly removed anchors");
        }
        d02.l(i7, d02.f5305u, i);
        if (i12 > 0) {
            d02.H(i13, i12, i11 - 1);
        }
    }
}
