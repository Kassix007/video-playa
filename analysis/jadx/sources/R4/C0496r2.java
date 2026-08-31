package R4;

import Z5.InterfaceC0593w;

/* JADX INFO: renamed from: R4.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0496r2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0496r2 f7178a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0496r2 c0496r2 = new C0496r2();
        f7178a = c0496r2;
        Z5.P p7 = new Z5.P("com.web2native.Rule", c0496r2, 4);
        p7.k("regex", true);
        p7.k("pageType", true);
        p7.k("label", true);
        p7.k("type", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var)};
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
        String str4 = null;
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
                str3 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str3);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                str4 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str4);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new C0504t2(i, str, str2, str3, str4);
    }
}
