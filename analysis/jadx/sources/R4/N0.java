package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f6810a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        N0 n02 = new N0();
        f6810a = n02;
        Z5.P p7 = new Z5.P("com.web2native.GoogleSocialLogin", n02, 6);
        p7.k("clientId", true);
        p7.k("serverClientId", true);
        p7.k("logoutUrl", true);
        p7.k("isLoginFlowEnabled", true);
        p7.k("flowType", true);
        p7.k("callbackFunctionName", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(C0577f.f8590a), C3.a.A(a0Var), C3.a.A(a0Var)};
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
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
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
                    bool = (Boolean) aVarA.i(fVar, 3, C0577f.f8590a, bool);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) aVarA.i(fVar, 4, Z5.a0.f8577a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) aVarA.i(fVar, 5, Z5.a0.f8577a, str5);
                    i |= 32;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new P0(i, str, str2, str3, bool, str4, str5);
    }
}
