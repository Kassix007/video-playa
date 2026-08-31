package R4;

import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;

/* JADX INFO: renamed from: R4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0509v implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0509v f7197a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0509v c0509v = new C0509v();
        f7197a = c0509v;
        Z5.P p7 = new Z5.P("com.web2native.Button", c0509v, 7);
        p7.k("borderColor", false);
        p7.k("borderWidth", false);
        p7.k("btnBgColor", false);
        p7.k("roundedCornerPercent", false);
        p7.k("text", false);
        p7.k("textColor", false);
        p7.k("url", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        V5.a aVarA = C3.a.A(a0Var);
        Z5.C c7 = Z5.C.f8535a;
        return new V5.a[]{aVarA, C3.a.A(c7), C3.a.A(a0Var), C3.a.A(c7), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var)};
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
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
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
                    num = (Integer) aVarA.i(fVar, 1, Z5.C.f8535a, num);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) aVarA.i(fVar, 2, Z5.a0.f8577a, str2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) aVarA.i(fVar, 3, Z5.C.f8535a, num2);
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
                case 6:
                    str5 = (String) aVarA.i(fVar, 6, Z5.a0.f8577a, str5);
                    i |= 64;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new C0517x(i, str, num, str2, num2, str3, str4, str5);
    }
}
