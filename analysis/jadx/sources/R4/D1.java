package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D1 f6747a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        D1 d12 = new D1();
        f6747a = d12;
        Z5.P p7 = new Z5.P("com.web2native.NoInternetData", d12, 3);
        p7.k("bgColor", true);
        p7.k("pages", true);
        p7.k("actionButtons", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = F1.f6754d;
        return new V5.a[]{C3.a.A(Z5.a0.f8577a), C3.a.A((V5.a) interfaceC1369hArr[1].getValue()), C3.a.A((V5.a) interfaceC1369hArr[2].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = F1.f6754d;
        String str = null;
        boolean z5 = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i |= 1;
            } else if (iJ == 1) {
                list = (List) aVarA.i(fVar, 1, (V5.a) interfaceC1369hArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new V5.e(iJ);
                }
                list2 = (List) aVarA.i(fVar, 2, (V5.a) interfaceC1369hArr[2].getValue(), list2);
                i |= 4;
            }
        }
        aVarA.l(fVar);
        return new F1(i, str, list, list2);
    }
}
