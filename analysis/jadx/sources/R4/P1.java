package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P1 f6833a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        P1 p12 = new P1();
        f6833a = p12;
        Z5.P p7 = new Z5.P("com.web2native.Page", p12, 3);
        p7.k("elements", true);
        p7.k("showSkipButton", true);
        p7.k("topMarginPercent", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A((V5.a) R1.f6840d[0].getValue()), C3.a.A(C0577f.f8590a), C3.a.A(Z5.C.f8535a)};
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
        InterfaceC1369h[] interfaceC1369hArr = R1.f6840d;
        List list = null;
        boolean z5 = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                bool = (Boolean) aVarA.i(fVar, 1, C0577f.f8590a, bool);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new V5.e(iJ);
                }
                num = (Integer) aVarA.i(fVar, 2, Z5.C.f8535a, num);
                i |= 4;
            }
        }
        aVarA.l(fVar);
        return new R1(i, list, bool, num);
    }
}
