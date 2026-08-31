package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;

/* JADX INFO: renamed from: R4.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0428a1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0428a1 f6911a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0428a1 c0428a1 = new C0428a1();
        f6911a = c0428a1;
        Z5.P p7 = new Z5.P("com.web2native.InterComm", c0428a1, 3);
        p7.k("enable", true);
        p7.k("apiKey", true);
        p7.k("appId", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        V5.a aVarA = C3.a.A(C0577f.f8590a);
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{aVarA, C3.a.A(a0Var), C3.a.A(a0Var)};
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
        Boolean bool = null;
        boolean z5 = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                bool = (Boolean) aVarA.i(fVar, 0, C0577f.f8590a, bool);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new V5.e(iJ);
                }
                str2 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str2);
                i |= 4;
            }
        }
        aVarA.l(fVar);
        return new C0436c1(i, bool, str, str2);
    }
}
