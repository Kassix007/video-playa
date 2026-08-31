package R4;

import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0437c2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0437c2 f6930a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0437c2 c0437c2 = new C0437c2();
        f6930a = c0437c2;
        Z5.P p7 = new Z5.P("com.web2native.RichBottomBarData", c0437c2, 9);
        p7.k("regex", true);
        p7.k("mapping", true);
        p7.k("iconColor", true);
        p7.k("bgColor", true);
        p7.k("cornerRadius", true);
        p7.k("activeColor", true);
        p7.k("floatingBtnBgColor", true);
        p7.k("floatingBtnIconColor", true);
        p7.k("tabs", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = C0445e2.j;
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A((V5.a) interfaceC1369hArr[1].getValue()), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(Z5.C.f8535a), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A((V5.a) interfaceC1369hArr[8].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = C0445e2.j;
        List list = null;
        String str = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iJ = aVarA.j(fVar);
            switch (iJ) {
                case IconicsAnimationProcessor.INFINITE /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) aVarA.i(fVar, 1, (V5.a) interfaceC1369hArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) aVarA.i(fVar, 4, Z5.C.f8535a, num);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) aVarA.i(fVar, 5, Z5.a0.f8577a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) aVarA.i(fVar, 6, Z5.a0.f8577a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) aVarA.i(fVar, 7, Z5.a0.f8577a, str6);
                    i |= 128;
                    break;
                case 8:
                    list = (List) aVarA.i(fVar, 8, (V5.a) interfaceC1369hArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new C0445e2(i, str, list2, str2, str3, num, str4, str5, str6, list);
    }
}
