package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.List;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f6881a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W0 w02 = new W0();
        f6881a = w02;
        Z5.P p7 = new Z5.P("com.web2native.IAPScreenData", w02, 6);
        p7.k("disableOnFirstLoad", true);
        p7.k("disableForDays", true);
        p7.k("enable", true);
        p7.k("bgColor", true);
        p7.k("pages", true);
        p7.k("actionButtons", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        InterfaceC1369h[] interfaceC1369hArr = Y0.f6892g;
        C0577f c0577f = C0577f.f8590a;
        return new V5.a[]{C3.a.A(c0577f), C3.a.A(Z5.C.f8535a), C3.a.A(c0577f), C3.a.A(Z5.a0.f8577a), C3.a.A((V5.a) interfaceC1369hArr[4].getValue()), C3.a.A((V5.a) interfaceC1369hArr[5].getValue())};
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
        InterfaceC1369h[] interfaceC1369hArr = Y0.f6892g;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        String str = null;
        List list = null;
        List list2 = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            switch (iJ) {
                case IconicsAnimationProcessor.INFINITE /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    bool = (Boolean) aVarA.i(fVar, 0, C0577f.f8590a, bool);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) aVarA.i(fVar, 1, Z5.C.f8535a, num);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) aVarA.i(fVar, 2, C0577f.f8590a, bool2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str);
                    i |= 8;
                    break;
                case 4:
                    list = (List) aVarA.i(fVar, 4, (V5.a) interfaceC1369hArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) aVarA.i(fVar, 5, (V5.a) interfaceC1369hArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new Y0(i, bool, num, bool2, str, list, list2);
    }
}
