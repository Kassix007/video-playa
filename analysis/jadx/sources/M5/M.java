package M5;

/* JADX INFO: loaded from: classes.dex */
public final class M extends O {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0247h f3816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Q f3817t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Q q7, long j, C0247h c0247h) {
        super(j);
        this.f3817t = q7;
        this.f3816s = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f3816s.C(this.f3817t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.O
    public final String toString() {
        return super.toString() + this.f3816s;
    }
}
