package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0438d implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0438d f6932a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0438d c0438d = new C0438d();
        f6932a = c0438d;
        Z5.P p7 = new Z5.P("com.web2native.AdMobAds", c0438d, 1);
        p7.k("data", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A((V5.a) C0446f.f6944b[0].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = C0446f.f6944b;
        List list = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else {
                if (iJ != 0) {
                    throw new V5.e(iJ);
                }
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i = 1;
            }
        }
        aVarA.l(fVar);
        return new C0446f(i, list);
    }
}
