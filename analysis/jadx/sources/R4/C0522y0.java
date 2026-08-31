package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0522y0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0522y0 f7217a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0522y0 c0522y0 = new C0522y0();
        f7217a = c0522y0;
        Z5.P p7 = new Z5.P("com.web2native.FloatingActionMenuData", c0522y0, 3);
        p7.k("tabs", true);
        p7.k("regex", true);
        p7.k("mapping", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = A0.f6722d;
        return new V5.a[]{C3.a.A((V5.a) interfaceC1369hArr[0].getValue()), C3.a.A(Z5.a0.f8577a), C3.a.A((V5.a) interfaceC1369hArr[2].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = A0.f6722d;
        List list = null;
        boolean z5 = true;
        int i = 0;
        String str = null;
        List list2 = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str);
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
        return new A0(i, str, list, list2);
    }
}
