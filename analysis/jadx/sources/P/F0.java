package P;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends a0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5310c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F0(long j, int i) {
        super(j);
        this.f5310c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f5310c = ((F0) wVar).f5310c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final a0.w b(long j) {
        return new F0(j, this.f5310c);
    }
}
