package Z4;

import Z5.InterfaceC0593w;
import Z5.P;
import Z5.a0;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: Z4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0562d implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0562d f8485a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0562d c0562d = new C0562d();
        f8485a = c0562d;
        P p7 = new P("com.web2native.feature_offer_card.Card", c0562d, 4);
        p7.k("size", true);
        p7.k("position", true);
        p7.k("bgColor", true);
        p7.k(FirebaseAnalytics.Param.CONTENT, true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        a0 a0Var = a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(C0568j.f8494a)};
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
        String str2 = null;
        String str3 = null;
        C0570l c0570l = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                str2 = (String) aVarA.i(fVar, 1, a0.f8577a, str2);
                i |= 2;
            } else if (iJ == 2) {
                str3 = (String) aVarA.i(fVar, 2, a0.f8577a, str3);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                c0570l = (C0570l) aVarA.i(fVar, 3, C0568j.f8494a, c0570l);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new C0564f(i, str, str2, str3, c0570l);
    }
}
