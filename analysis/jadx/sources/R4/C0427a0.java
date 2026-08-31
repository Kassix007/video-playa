package R4;

import Z5.InterfaceC0593w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;

/* JADX INFO: renamed from: R4.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0427a0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0427a0 f6910a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0427a0 c0427a0 = new C0427a0();
        f6910a = c0427a0;
        Z5.P p7 = new Z5.P("com.web2native.Element", c0427a0, 6);
        p7.k("fontSize", true);
        p7.k("fontWeight", true);
        p7.k("textColor", true);
        p7.k("type", true);
        p7.k("fileName", true);
        p7.k(FirebaseAnalytics.Param.VALUE, true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.C c7 = Z5.C.f8535a;
        V5.a aVarA = C3.a.A(c7);
        V5.a aVarA2 = C3.a.A(c7);
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{aVarA, aVarA2, C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var)};
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
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z5 = true;
        while (z5) {
            int iJ = aVarA.j(fVar);
            switch (iJ) {
                case IconicsAnimationProcessor.INFINITE /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    num = (Integer) aVarA.i(fVar, 0, Z5.C.f8535a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) aVarA.i(fVar, 1, Z5.C.f8535a, num2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) aVarA.i(fVar, 3, Z5.a0.f8577a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) aVarA.i(fVar, 4, Z5.a0.f8577a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) aVarA.i(fVar, 5, Z5.a0.f8577a, str4);
                    i |= 32;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new C0435c0(i, num, num2, str, str2, str3, str4);
    }
}
