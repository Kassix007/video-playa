package Z4;

import Z5.InterfaceC0593w;
import Z5.P;
import Z5.a0;

/* JADX INFO: renamed from: Z4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0571m implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0571m f8497a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0571m c0571m = new C0571m();
        f8497a = c0571m;
        P p7 = new P("com.web2native.feature_offer_card.CardDetails", c0571m, 4);
        p7.k("id", true);
        p7.k("action", true);
        p7.k("card", true);
        p7.k("schedule", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(a0.f8577a), C3.a.A(C0559a.f8482a), C3.a.A(C0562d.f8485a), C3.a.A(s.f8504a)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        X5.f fVar = descriptor;
        Y5.a aVarA = bVar.a(fVar);
        int i = 0;
        String str = null;
        C0561c c0561c = null;
        C0564f c0564f = null;
        u uVar = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                c0561c = (C0561c) aVarA.i(fVar, 1, C0559a.f8482a, c0561c);
                i |= 2;
            } else if (iJ == 2) {
                c0564f = (C0564f) aVarA.i(fVar, 2, C0562d.f8485a, c0564f);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                uVar = (u) aVarA.i(fVar, 3, s.f8504a, uVar);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new o(i, str, c0561c, c0564f, uVar);
    }
}
