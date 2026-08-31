package Z4;

import Z5.InterfaceC0593w;
import Z5.P;
import Z5.a0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f8504a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        s sVar = new s();
        f8504a = sVar;
        P p7 = new P("com.web2native.feature_offer_card.OfferCardSchedule", sVar, 2);
        p7.k("duration", true);
        p7.k("unit", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(Z5.I.f8544a), C3.a.A(a0.f8577a)};
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
        Long l7 = null;
        boolean z5 = true;
        int i = 0;
        String str = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                l7 = (Long) aVarA.i(fVar, 0, Z5.I.f8544a, l7);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new V5.e(iJ);
                }
                str = (String) aVarA.i(fVar, 1, a0.f8577a, str);
                i |= 2;
            }
        }
        aVarA.l(fVar);
        return new u(i, l7, str);
    }
}
