package J1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2750e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, Object obj) {
        super(false);
        this.f2749d = i;
        this.f2750e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // b.u
    public final void b() {
        switch (this.f2749d) {
            case 0:
                H h4 = (H) this.f2750e;
                h4.y(true);
                if (!h4.f2531h.f9909a) {
                    h4.f2530g.c();
                } else {
                    h4.M();
                }
                break;
            case 1:
                ((T1.u) this.f2750e).c();
                break;
            default:
                ((kotlin.jvm.internal.n) this.f2750e).invoke(this);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(B5.c cVar) {
        super(true);
        this.f2749d = 2;
        this.f2750e = (kotlin.jvm.internal.n) cVar;
    }
}
