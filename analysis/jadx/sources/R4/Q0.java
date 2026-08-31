package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0 f6838a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Q0 q02 = new Q0();
        f6838a = q02;
        Z5.P p7 = new Z5.P("com.web2native.HeaderConfiguration", q02, 5);
        p7.k("headerStyle", true);
        p7.k("spaceFromTop", true);
        p7.k("headerBgColor", true);
        p7.k("spaceFromSides", true);
        p7.k("enableFloatingHeader", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        V5.a aVarA = C3.a.A(a0Var);
        Z5.C c7 = Z5.C.f8535a;
        return new V5.a[]{aVarA, c7, C3.a.A(a0Var), C3.a.A(c7), C3.a.A(C0577f.f8590a)};
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
        int iO = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                iO = aVarA.o(fVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                str2 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str2);
                i |= 4;
            } else if (iJ == 3) {
                num = (Integer) aVarA.i(fVar, 3, Z5.C.f8535a, num);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new V5.e(iJ);
                }
                bool = (Boolean) aVarA.i(fVar, 4, C0577f.f8590a, bool);
                i |= 16;
            }
        }
        aVarA.l(fVar);
        return new S0(i, str, iO, str2, num, bool);
    }
}
