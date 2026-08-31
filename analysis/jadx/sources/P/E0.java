package P;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends a0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5309c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E0(long j, float f) {
        super(j);
        this.f5309c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final void a(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f5309c = ((E0) wVar).f5309c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.w
    public final a0.w b(long j) {
        return new E0(j, this.f5309c);
    }
}
