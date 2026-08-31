package R4;

import Z5.C0577f;
import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f6880a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W w3 = new W();
        f6880a = w3;
        Z5.P p7 = new Z5.P("com.web2native.DownloadFileManager", w3, 11);
        p7.k("enable", true);
        p7.k("showOfflineOnNoInternetScreen", true);
        p7.k("title", true);
        p7.k("titleBarBgColor", true);
        p7.k("titleBarContentColor", true);
        p7.k("btnBgColor", true);
        p7.k("borderColor", true);
        p7.k("borderWidth", false);
        p7.k("downloadButtonText", true);
        p7.k("roundedCornerPercent", false);
        p7.k("textColor", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        C0577f c0577f = C0577f.f8590a;
        V5.a aVarA = C3.a.A(c0577f);
        Z5.a0 a0Var = Z5.a0.f8577a;
        V5.a aVarA2 = C3.a.A(a0Var);
        V5.a aVarA3 = C3.a.A(a0Var);
        V5.a aVarA4 = C3.a.A(a0Var);
        V5.a aVarA5 = C3.a.A(a0Var);
        V5.a aVarA6 = C3.a.A(a0Var);
        Z5.C c7 = Z5.C.f8535a;
        return new V5.a[]{aVarA, c0577f, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, C3.a.A(c7), C3.a.A(a0Var), C3.a.A(c7), C3.a.A(a0Var)};
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
        Integer num = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        String str7 = null;
        boolean z5 = true;
        int i = 0;
        boolean zC = false;
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
                    zC = aVarA.c(fVar, 1);
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
                    str4 = (String) aVarA.i(fVar, 4, Z5.a0.f8577a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) aVarA.i(fVar, 5, Z5.a0.f8577a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) aVarA.i(fVar, 6, Z5.a0.f8577a, str6);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) aVarA.i(fVar, 7, Z5.C.f8535a, num2);
                    i |= 128;
                    break;
                case 8:
                    str7 = (String) aVarA.i(fVar, 8, Z5.a0.f8577a, str7);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) aVarA.i(fVar, 9, Z5.C.f8535a, num);
                    i |= 512;
                    break;
                case 10:
                    str = (String) aVarA.i(fVar, 10, Z5.a0.f8577a, str);
                    i |= 1024;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new Y(i, bool, zC, str2, str3, str4, str5, str6, num2, str7, num, str);
    }
}
