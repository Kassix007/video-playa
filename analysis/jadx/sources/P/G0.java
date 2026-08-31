package P;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends a0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5312c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G0(long j, long j7) {
        super(j);
        this.f5312c = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f5312c = ((G0) wVar).f5312c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final a0.w b(long j) {
        return new G0(j, this.f5312c);
    }
}
