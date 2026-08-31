package a0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T.c f8686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8688e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(long j, T.c cVar) {
        super(j);
        this.f8686c = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(w wVar) {
        synchronized (r.f8690a) {
            kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
            this.f8686c = ((p) wVar).f8686c;
            this.f8687d = ((p) wVar).f8687d;
            this.f8688e = ((p) wVar).f8688e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final w b(long j) {
        return new p(j, this.f8686c);
    }
}
