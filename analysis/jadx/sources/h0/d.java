package H0;

import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f2048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f2049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f2050t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2051q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f2048r = new d(i, 0);
        f2049s = new d(i, 1);
        f2050t = new d(i, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i7) {
        super(i);
        this.f2051q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f2051q) {
            case 0:
                ((Number) obj).longValue();
                return C1386y.f15098a;
            case 1:
                return Integer.valueOf(((l) obj).f2070b);
            default:
                W0.j jVar = ((l) obj).f2071c;
                return Integer.valueOf(jVar.f8020d - jVar.f8018b);
        }
    }
}
