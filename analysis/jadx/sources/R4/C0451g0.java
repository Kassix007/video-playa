package R4;

import Z5.InterfaceC0593w;

/* JADX INFO: renamed from: R4.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0451g0 implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0451g0 f6961a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0451g0 c0451g0 = new C0451g0();
        f6961a = c0451g0;
        Z5.P p7 = new Z5.P("com.web2native.FacebookSocialLogin", c0451g0, 1);
        p7.k("type", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(Z5.a0.f8577a)};
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
        String str = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iJ = aVarA.j(fVar);
            if (iJ == -1) {
                z5 = false;
            } else {
                if (iJ != 0) {
                    throw new V5.e(iJ);
                }
                str = (String) aVarA.i(fVar, 0, Z5.a0.f8577a, str);
                i = 1;
            }
        }
        aVarA.l(fVar);
        return new C0459i0(i, str);
    }
}
