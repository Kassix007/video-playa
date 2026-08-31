package Z0;

import C0.RunnableC0114z;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f8317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f8318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f8319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f8320u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8321q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f8317r = new b(i, 0);
        f8318s = new b(i, 1);
        f8319t = new b(i, 2);
        f8320u = new b(i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i7) {
        super(i);
        this.f8321q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8321q) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new RunnableC0114z(jVar.f8348G, 2));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C1386y.f15098a;
    }
}
