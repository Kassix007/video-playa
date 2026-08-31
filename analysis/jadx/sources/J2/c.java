package J2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.i f2754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f2755b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(U5.i iVar, n nVar) {
        this.f2754a = iVar;
        this.f2755b = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.j
    public final k a(L2.i iVar, U2.n nVar) {
        return new e(iVar.f3260a, nVar, this.f2754a, this.f2755b);
    }
}
