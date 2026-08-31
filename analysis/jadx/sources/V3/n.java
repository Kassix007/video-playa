package v3;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1764b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f17581a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(e eVar) {
        this.f17581a = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.InterfaceC1764b
    public final void onBackgroundStateChanged(boolean z5) {
        I3.e eVar = this.f17581a.f17574m;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z5)));
    }
}
