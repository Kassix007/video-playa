package v;

import i0.C1131c;
import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class M implements j0.E, Q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M f17259r = new M(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final M f17260s = new M(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final M f17261t = new M(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17262q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [v.I.<clinit>():void, v.J.<clinit>():void, v.M.<clinit>():void] */
    public /* synthetic */ M(int i) {
        this.f17262q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v.Q
    public void a(B0.N n7) {
        n7.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.E
    public AbstractC1145B e(long j, W0.l lVar, W0.c cVar) {
        switch (this.f17262q) {
            case 0:
                float fG = cVar.G(AbstractC1730z.f17424a);
                return new j0.y(new C1131c(0.0f, -fG, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fG));
            default:
                float fG2 = cVar.G(AbstractC1730z.f17424a);
                return new j0.y(new C1131c(-fG2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fG2, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
