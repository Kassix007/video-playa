package P;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends a0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5313c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H0(long j, Object obj) {
        super(j);
        this.f5313c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f5313c = ((H0) wVar).f5313c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final a0.w b(long j) {
        return new H0(a0.n.k().g(), this.f5313c);
    }
}
