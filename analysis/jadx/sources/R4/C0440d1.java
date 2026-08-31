package R4;

import Z5.C0577f;
import Z5.C0588q;
import Z5.InterfaceC0593w;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;

/* JADX INFO: renamed from: R4.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0440d1 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0440d1 f6934a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0440d1 c0440d1 = new C0440d1();
        f6934a = c0440d1;
        Z5.P p7 = new Z5.P("com.web2native.LoaderConfig", c0440d1, 8);
        p7.k("animationSize", true);
        p7.k("animationShape", true);
        p7.k("animationBgColor", true);
        p7.k("type", true);
        p7.k("loadPercentOffset", true);
        p7.k("loaderColor", true);
        p7.k("bgColor", true);
        p7.k("enableShadow", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        Z5.a0 a0Var = Z5.a0.f8577a;
        return new V5.a[]{C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(C0588q.f8623a), C3.a.A(a0Var), C3.a.A(a0Var), C3.a.A(C0577f.f8590a)};
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
        String str4 = null;
        Double d5 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
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
                    d5 = (Double) aVarA.i(fVar, 4, C0588q.f8623a, d5);
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
                    bool = (Boolean) aVarA.i(fVar, 7, C0577f.f8590a, bool);
                    i |= 128;
                    break;
                default:
                    throw new V5.e(iJ);
            }
        }
        aVarA.l(fVar);
        return new C0448f1(i, str, str2, str3, str4, d5, str5, str6, bool);
    }
}
