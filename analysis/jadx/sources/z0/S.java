package z0;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f18679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f18680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1940Q f18681c = new C1940Q(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1940Q f18682d = new C1940Q(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1940Q f18683e = new C1940Q(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S(U u6) {
        this.f18679a = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y a() {
        y yVar = this.f18680b;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
