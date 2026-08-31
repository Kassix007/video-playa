package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0507u1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0507u1 f7195a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0507u1 c0507u1 = new C0507u1();
        f7195a = c0507u1;
        Z5.P p7 = new Z5.P("com.web2native.MultiWindowSupport", c0507u1, 2);
        p7.k("openWindow", true);
        p7.k("closeWindow", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = C0515w1.f7199c;
        return new V5.a[]{C3.a.A((V5.a) interfaceC1369hArr[0].getValue()), C3.a.A((V5.a) interfaceC1369hArr[1].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = C0515w1.f7199c;
        List list = null;
        boolean z5 = true;
        int i = 0;
        List list2 = null;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new V5.e(iJ);
                }
                list2 = (List) aVarA.i(fVar, 1, (V5.a) interfaceC1369hArr[1].getValue(), list2);
                i |= 2;
            }
        }
        aVarA.l(fVar);
        return new C0515w1(i, list, list2);
    }
}
