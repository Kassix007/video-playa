package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H2 f6771a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        H2 h22 = new H2();
        f6771a = h22;
        Z5.P p7 = new Z5.P("com.web2native.StickyFooterData", h22, 2);
        p7.k("enable", true);
        p7.k("data", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(C0577f.f8590a), C3.a.A((V5.a) J2.f6780c[1].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = J2.f6780c;
        Boolean bool = null;
        boolean z5 = true;
        int i = 0;
        List list = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                bool = (Boolean) aVarA.i(fVar, 0, C0577f.f8590a, bool);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new V5.e(iJ);
                }
                list = (List) aVarA.i(fVar, 1, (V5.a) interfaceC1369hArr[1].getValue(), list);
                i |= 2;
            }
        }
        aVarA.l(fVar);
        return new J2(i, bool, list);
    }
}
