package e3;

/* JADX INFO: renamed from: e3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042e extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1044g f12565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12566s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1042e(C1044g c1044g, int i, int i7) {
        super(1);
        this.f12564q = i7;
        this.f12565r = c1044g;
        this.f12566s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f12564q) {
            case 0:
                return Boolean.valueOf(C1044g.b(this.f12565r, this.f12566s, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(C1044g.b(this.f12565r, this.f12566s, ((Number) obj).longValue()));
        }
    }
}
