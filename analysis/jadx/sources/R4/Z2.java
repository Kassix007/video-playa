package R4;

import Z5.InterfaceC0593w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z2 f6908a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Z2 z22 = new Z2();
        f6908a = z22;
        Z5.P p7 = new Z5.P("com.web2native.TopAppBarMapping", z22, 2);
        p7.k("link", true);
        p7.k("type", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var)};
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
        String str = null;
        boolean z5 = true;
        int i = 0;
        String str2 = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new V5.e(iJ);
                }
                str2 = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str2);
                i |= 2;
            }
        }
        aVarA.l(fVar);
        return new b3(str, str2, i);
    }
}
