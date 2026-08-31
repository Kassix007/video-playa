package Z5;

import R4.C0433b2;
import m5.AbstractC1362a;
import m5.C1386y;
import m5.EnumC1370i;

/* JADX INFO: loaded from: classes.dex */
public final class M implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8551a = AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m5.h] */
    @Override // V5.a
    public final X5.f b() {
        return (X5.f) this.f8551a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        X5.f fVarB = b();
        Y5.a aVarA = bVar.a(fVarB);
        int iJ = aVarA.j(b());
        if (iJ != -1) {
            throw new V5.d(k1.i.i(iJ, "Unexpected index "));
        }
        aVarA.l(fVarB);
        return C1386y.f15098a;
    }
}
