package v;

/* JADX INFO: loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final S f17273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final S f17274s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17275q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f17273r = new S(i, 0);
        f17274s = new S(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(int i, int i7) {
        super(i);
        this.f17275q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f17275q) {
            case 0:
                return C.f17223a;
            default:
                return new b0();
        }
    }
}
