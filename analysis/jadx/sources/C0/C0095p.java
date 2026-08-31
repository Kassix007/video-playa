package C0;

import m5.C1386y;

/* JADX INFO: renamed from: C0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095p extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0095p f1083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0095p f1084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0095p f1085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0095p f1086u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1087q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f1083r = new C0095p(i, 0);
        f1084s = new C0095p(i, 1);
        f1085t = new C0095p(i, 2);
        f1086u = new C0095p(i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0095p(int i, int i7) {
        super(i);
        this.f1087q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1087q) {
            case 0:
                return C1386y.f15098a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(W.b(obj));
        }
    }
}
