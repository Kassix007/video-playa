package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0482o implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0482o f7140a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0482o c0482o = new C0482o();
        f7140a = c0482o;
        Z5.P p7 = new Z5.P("com.web2native.BiometricAuth", c0482o, 4);
        p7.k("enable", true);
        p7.k("showOnLoad", true);
        p7.k("whiteListDomains", true);
        p7.k("allowOtherMethod", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = C0490q.f7153e;
        C0577f c0577f = C0577f.f8590a;
        return new V5.a[]{C3.a.A(c0577f), C3.a.A(c0577f), C3.a.A((V5.a) interfaceC1369hArr[2].getValue()), C3.a.A(c0577f)};
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
        InterfaceC1369h[] interfaceC1369hArr = C0490q.f7153e;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        Boolean bool3 = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                bool = (Boolean) aVarA.i(fVar, 0, C0577f.f8590a, bool);
                i |= 1;
            } else if (iJ == 1) {
                bool2 = (Boolean) aVarA.i(fVar, 1, C0577f.f8590a, bool2);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) aVarA.i(fVar, 2, (V5.a) interfaceC1369hArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                bool3 = (Boolean) aVarA.i(fVar, 3, C0577f.f8590a, bool3);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new C0490q(i, bool, bool2, list, bool3);
    }
}
