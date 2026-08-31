package R4;

import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K2 f6786a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2 k22 = new K2();
        f6786a = k22;
        Z5.P p7 = new Z5.P("com.web2native.StickyFooterItem", k22, 12);
        p7.k("regEx", true);
        p7.k("mapping", true);
        p7.k("fontFamily", true);
        p7.k("bgColor", true);
        p7.k("iconColor", true);
        p7.k("tabs", true);
        p7.k("fontSize", true);
        p7.k("iconFontSize", true);
        p7.k("textColor", true);
        p7.k("height", false);
        p7.k("activeIconColor", true);
        p7.k("activeTextColor", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = M2.f6798m;
        Z5.a0 a0Var = Z5.a0.f8577a;
        V5.a aVarA = C3.a.A(a0Var);
        V5.a aVarA2 = C3.a.A((V5.a) interfaceC1369hArr[1].getValue());
        V5.a aVarA3 = C3.a.A(a0Var);
        V5.a aVarA4 = C3.a.A(a0Var);
        V5.a aVarA5 = C3.a.A(a0Var);
        V5.a aVarA6 = C3.a.A((V5.a) interfaceC1369hArr[5].getValue());
        Z5.C c7 = Z5.C.f8535a;
        return new V5.a[]{aVarA, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, C3.a.A(c7), C3.a.A(c7), C3.a.A(a0Var), C3.a.A(c7), C3.a.A(a0Var), C3.a.A(a0Var)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        String str;
        X5.f fVar = descriptor;
        Y5.a aVarA = bVar.a(fVar);
        InterfaceC1369h[] interfaceC1369hArr = M2.f6798m;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list2 = null;
        Integer num2 = null;
        Integer num3 = null;
        int i = 0;
        boolean z5 = true;
        while (true) {
            while (z5) {
                InterfaceC1369h[] interfaceC1369hArr2 = interfaceC1369hArr;
                int iJ = aVarA.j(fVar);
                switch (iJ) {
                    case IconicsAnimationProcessor.INFINITE /* -1 */:
                        z5 = false;
                        interfaceC1369hArr = interfaceC1369hArr2;
                        i = i;
                        continue;
                    case 0:
                        str5 = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str5);
                        i |= 1;
                        interfaceC1369hArr = interfaceC1369hArr2;
                        continue;
                    case 1:
                        str = str5;
                        list = (List) aVarA.i(fVar, 1, (V5.a) interfaceC1369hArr2[1].getValue(), list);
                        i |= 2;
                        break;
                    case 2:
                        str = str5;
                        str6 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str6);
                        i |= 4;
                        break;
                    case 3:
                        str = str5;
                        str7 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str7);
                        i |= 8;
                        break;
                    case 4:
                        str = str5;
                        str8 = (String) aVarA.i(fVar, 4, Z5.a0.f8577a, str8);
                        i |= 16;
                        break;
                    case 5:
                        str = str5;
                        list2 = (List) aVarA.i(fVar, 5, (V5.a) interfaceC1369hArr2[5].getValue(), list2);
                        i |= 32;
                        break;
                    case 6:
                        str = str5;
                        num2 = (Integer) aVarA.i(fVar, 6, Z5.C.f8535a, num2);
                        i |= 64;
                        break;
                    case 7:
                        str = str5;
                        num3 = (Integer) aVarA.i(fVar, 7, Z5.C.f8535a, num3);
                        i |= 128;
                        break;
                    case 8:
                        str = str5;
                        str2 = (String) aVarA.i(fVar, 8, Z5.a0.f8577a, str2);
                        i |= 256;
                        break;
                    case 9:
                        str = str5;
                        num = (Integer) aVarA.i(fVar, 9, Z5.C.f8535a, num);
                        i |= 512;
                        break;
                    case 10:
                        str = str5;
                        str4 = (String) aVarA.i(fVar, 10, Z5.a0.f8577a, str4);
                        i |= 1024;
                        break;
                    case 11:
                        str = str5;
                        str3 = (String) aVarA.i(fVar, 11, Z5.a0.f8577a, str3);
                        i |= 2048;
                        break;
                    default:
                        throw new V5.e(iJ);
                }
                interfaceC1369hArr = interfaceC1369hArr2;
                str5 = str;
            }
            aVarA.l(fVar);
            return new M2(i, str5, list, str6, str7, str8, list2, num2, num3, str2, num, str4, str3);
        }
    }
}
