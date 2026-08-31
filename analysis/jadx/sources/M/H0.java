package M;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f3313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W0.c f3314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.c f3315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f3316t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(boolean z5, W0.c cVar, B5.c cVar2, boolean z6) {
        super(1);
        this.f3313q = z5;
        this.f3314r = cVar;
        this.f3315s = cVar2;
        this.f3316t = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        B5.c cVar = this.f3315s;
        boolean z5 = this.f3316t;
        return new I0(this.f3313q, this.f3314r, (J0) obj, cVar, z5);
    }
}
