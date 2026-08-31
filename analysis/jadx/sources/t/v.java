package t;

import j0.AbstractC1145B;
import u.AbstractC1644d;
import u.C1660n;

/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f16646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f16647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f16648t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16649q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f16646r = new v(i, 0);
        f16647s = new v(i, 1);
        f16648t = new v(i, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, int i7) {
        super(i);
        this.f16649q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f16649q) {
            case 0:
                long j = ((j0.H) obj).f13695a;
                return new C1660n(j0.H.b(j), j0.H.c(j));
            case 1:
                C1660n c1660n = (C1660n) obj;
                return new j0.H(AbstractC1145B.g(c1660n.f16995a, c1660n.f16996b));
            default:
                return AbstractC1644d.o(7, null);
        }
    }
}
