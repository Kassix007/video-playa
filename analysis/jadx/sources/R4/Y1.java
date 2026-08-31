package R4;

import Z5.InterfaceC0593w;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y1 f6898a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Y1 y12 = new Y1();
        f6898a = y12;
        Z5.P p7 = new Z5.P("com.web2native.RegexInternalExternal", y12, 1);
        p7.k("rules", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A((V5.a) C0429a2.f6912b[0].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = C0429a2.f6912b;
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
        return new C0429a2(i, list);
    }
}
