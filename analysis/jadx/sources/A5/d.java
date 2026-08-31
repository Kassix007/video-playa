package a5;

import Z5.C;
import Z5.InterfaceC0593w;
import Z5.P;
import Z5.a0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8938a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d dVar = new d();
        f8938a = dVar;
        P p7 = new P("com.web2native.feature_secondary_footer.MenusItems", dVar, 5);
        p7.k(FirebaseAnalytics.Param.ITEMS, true);
        p7.k("regex", true);
        p7.k("textColor", true);
        p7.k("bgColor", true);
        p7.k("bottomMargin", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        V5.a aVarA = C3.a.A((V5.a) f.f[0].getValue());
        a0 a0Var = a0.f8577a;
        return new V5.a[]{aVarA, C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(C.f8535a)};
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
        InterfaceC1369h[] interfaceC1369hArr = f.f;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else if (iJ == 0) {
                list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) aVarA.i(fVar, 1, a0.f8577a, str);
                i |= 2;
            } else if (iJ == 2) {
                str2 = (String) aVarA.i(fVar, 2, a0.f8577a, str2);
                i |= 4;
            } else if (iJ == 3) {
                str3 = (String) aVarA.i(fVar, 3, a0.f8577a, str3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new V5.e(iJ);
                }
                num = (Integer) aVarA.i(fVar, 4, C.f8535a, num);
                i |= 16;
            }
        }
        aVarA.l(fVar);
        return new f(i, list, str, str2, str3, num);
    }
}
