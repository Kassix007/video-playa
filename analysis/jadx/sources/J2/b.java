package J2;

import q6.C1538g;
import q6.G;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q6.o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Exception f2753s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(G g7, int i) {
        super(g7);
        this.f2752r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.o, q6.G
    public final long F(long j, C1538g c1538g) throws Exception {
        switch (this.f2752r) {
            case 0:
                try {
                    return super.F(j, c1538g);
                } catch (Exception e7) {
                    this.f2753s = e7;
                    throw e7;
                }
            default:
                try {
                    return super.F(j, c1538g);
                } catch (Exception e8) {
                    this.f2753s = e8;
                    throw e8;
                }
        }
    }
}
