package R4;

import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0485o2 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0485o2 f7147a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0485o2 c0485o2 = new C0485o2();
        f7147a = c0485o2;
        Z5.P p7 = new Z5.P("com.web2native.RichBottomBarTabs", c0485o2, 6);
        p7.k("url", true);
        p7.k("label", true);
        p7.k("icon", true);
        p7.k("type", true);
        p7.k("floatingBtnPosition", true);
        p7.k("expandableIcons", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = C0493q2.f7164g;
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A((V5.a) interfaceC1369hArr[5].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = C0493q2.f7164g;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        boolean z5 = true;
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
                    str2 = (String) aVarA.i(fVar, 1, Z5.a0.f8577a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) aVarA.i(fVar, 4, Z5.a0.f8577a, str5);
                    i |= 16;
                    break;
                case 5:
                    list = (List) aVarA.i(fVar, 5, (V5.a) interfaceC1369hArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new C0493q2(i, str, str2, str3, str4, str5, list);
    }
}
