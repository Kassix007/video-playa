package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W2 f6882a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W2 w22 = new W2();
        f6882a = w22;
        Z5.P p7 = new Z5.P("com.web2native.TopAppBarData", w22, 3);
        p7.k("regex", true);
        p7.k("headerConfig", true);
        p7.k("mapping", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(Z5.a0.f8577a), C3.a.A(Q0.f6838a), C3.a.A((V5.a) Y2.f6899d[2].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = Y2.f6899d;
        String str = null;
        boolean z5 = true;
        int i = 0;
        S0 s02 = null;
        List list = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                s02 = (S0) aVarA.i(fVar, 1, Q0.f6838a, s02);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new V5.e(iJ);
                }
                list = (List) aVarA.i(fVar, 2, (V5.a) interfaceC1369hArr[2].getValue(), list);
                i |= 4;
            }
        }
        aVarA.l(fVar);
        return new Y2(i, str, s02, list);
    }
}
