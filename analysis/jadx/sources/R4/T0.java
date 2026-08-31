package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f6860a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        T0 t02 = new T0();
        f6860a = t02;
        Z5.P p7 = new Z5.P("com.web2native.IAPPage", t02, 4);
        p7.k("elements", true);
        p7.k("topMarginPercent", true);
        p7.k("productId", true);
        p7.k("isProductAutoRenewable", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A((V5.a) V0.f6871e[0].getValue()), C3.a.A(Z5.C.f8535a), C3.a.A(Z5.a0.f8577a), C3.a.A(C0577f.f8590a)};
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
        InterfaceC1369h[] interfaceC1369hArr = V0.f6871e;
        int i = 0;
        List list = null;
        Integer num = null;
        String str = null;
        Boolean bool = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                num = (Integer) aVarA.i(fVar, 1, Z5.C.f8535a, num);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new V5.e(iJ);
                }
                bool = (Boolean) aVarA.i(fVar, 3, C0577f.f8590a, bool);
                i |= 8;
            }
        }
        aVarA.l(fVar);
        return new V0(i, list, num, str, bool);
    }
}
