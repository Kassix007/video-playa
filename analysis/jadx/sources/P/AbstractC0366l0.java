package P;

/* JADX INFO: renamed from: P.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0366l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f5422a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0366l0(B5.a aVar) {
        this.f5422a = new Q(aVar);
    }

    public abstract C0368m0 a(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V0 b() {
        return this.f5422a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V0 c(C0368m0 c0368m0, V0 v02) {
        V0 v03 = null;
        v03 = null;
        v03 = null;
        v03 = null;
        v03 = null;
        v03 = null;
        if (v02 instanceof G) {
            if (c0368m0.f5432d) {
                G g7 = (G) v02;
                g7.f5311a.setValue(c0368m0.a());
                v03 = g7;
            }
        } else if (v02 instanceof U0) {
            if ((c0368m0.f5430b || c0368m0.f5433e != null) && !c0368m0.f5432d) {
                U0 u02 = (U0) v02;
                if (kotlin.jvm.internal.m.a(c0368m0.a(), u02.f5379a)) {
                    v03 = u02;
                }
            }
        } else if (v02 instanceof A) {
            c0368m0.getClass();
            kotlin.jvm.internal.n nVar = ((A) v02).f5263a;
        }
        if (v03 != null) {
            return v03;
        }
        if (!c0368m0.f5432d) {
            return new U0(c0368m0.a());
        }
        Object obj = c0368m0.f5433e;
        I0 i02 = c0368m0.f5431c;
        if (i02 == null) {
            i02 = S.f5377v;
        }
        return new G(new C0354f0(obj, i02));
    }
}
