package R4;

import Z5.InterfaceC0593w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f6735a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        B b7 = new B();
        f6735a = b7;
        Z5.P p7 = new Z5.P("com.web2native.ConnectButton", b7, 4);
        p7.k("iconPosition", true);
        p7.k("widgetId", true);
        p7.k("pageSetting", true);
        p7.k("fileName", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(H.f6768a), C3.a.A(a0Var)};
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
        J j = null;
        String str3 = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                str2 = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str2);
                i |= 2;
            } else if (iJ == 2) {
                j = (J) aVarA.i(fVar, 2, H.f6768a, j);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                str3 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str3);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new D(i, str, str2, j, str3);
    }
}
