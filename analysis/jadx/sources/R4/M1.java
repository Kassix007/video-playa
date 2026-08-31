package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M1 f6797a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        M1 m12 = new M1();
        f6797a = m12;
        Z5.P p7 = new Z5.P("com.web2native.Onboarding", m12, 9);
        p7.k("actionButtons", true);
        p7.k("bgColor", true);
        p7.k("pageIndicator", true);
        p7.k("pages", true);
        p7.k("showAlways", true);
        p7.k("skipButton", true);
        p7.k("version", true);
        p7.k("showOnAppUpdate", true);
        p7.k("onboardingShowInterval", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = O1.j;
        V5.a aVarA = C3.a.A((V5.a) interfaceC1369hArr[0].getValue());
        V5.a aVarA2 = C3.a.A(Z5.a0.f8577a);
        V5.a aVarA3 = C3.a.A(S1.f6851a);
        V5.a aVarA4 = C3.a.A((V5.a) interfaceC1369hArr[3].getValue());
        C0577f c0577f = C0577f.f8590a;
        V5.a aVarA5 = C3.a.A(c0577f);
        V5.a aVarA6 = C3.a.A(C0509v.f7197a);
        Z5.C c7 = Z5.C.f8535a;
        return new V5.a[]{aVarA, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, C3.a.A(c7), C3.a.A(c0577f), C3.a.A(c7)};
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
        InterfaceC1369h[] interfaceC1369hArr = O1.j;
        Integer num = null;
        List list = null;
        String str = null;
        U1 u12 = null;
        List list2 = null;
        Boolean bool = null;
        C0517x c0517x = null;
        Integer num2 = null;
        Boolean bool2 = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iJ = aVarA.j(fVar);
            switch (iJ) {
                case IconicsAnimationProcessor.INFINITE /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    list = (List) aVarA.i(fVar, 0, (V5.a) interfaceC1369hArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str);
                    i |= 2;
                    break;
                case 2:
                    u12 = (U1) aVarA.i(fVar, 2, S1.f6851a, u12);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) aVarA.i(fVar, 3, (V5.a) interfaceC1369hArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) aVarA.i(fVar, 4, C0577f.f8590a, bool);
                    i |= 16;
                    break;
                case 5:
                    c0517x = (C0517x) aVarA.i(fVar, 5, C0509v.f7197a, c0517x);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) aVarA.i(fVar, 6, Z5.C.f8535a, num2);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) aVarA.i(fVar, 7, C0577f.f8590a, bool2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) aVarA.i(fVar, 8, Z5.C.f8535a, num);
                    i |= 256;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new O1(i, list, str, u12, list2, bool, c0517x, num2, bool2, num);
    }
}
