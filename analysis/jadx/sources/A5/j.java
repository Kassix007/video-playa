package a5;

import Z5.InterfaceC0593w;
import Z5.P;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC0593w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8947a;
    private static final X5.f descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j jVar = new j();
        f8947a = jVar;
        P p7 = new P("com.web2native.feature_secondary_footer.SecondaryFooterDataClass", jVar, 1);
        p7.k("secondaryFooter", true);
        descriptor = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0593w
    public final V5.a[] a() {
        return new V5.a[]{C3.a.A(g.f8944a)};
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
        i iVar = null;
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
                iVar = (i) aVarA.i(fVar, 0, g.f8944a, iVar);
                i = 1;
            }
        }
        aVarA.l(fVar);
        return new l(i, iVar);
    }
}
