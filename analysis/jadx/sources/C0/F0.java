package C0;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F0 f819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F0 f820s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f821q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f819r = new F0(i, 0);
        f820s = new F0(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(int i, int i7) {
        super(i);
        this.f821q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f821q) {
            case 0:
                return Boolean.FALSE;
            default:
                AbstractC0103t0.b("LocalWindowInfo");
                throw null;
        }
    }
}
