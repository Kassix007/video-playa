package E4;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1735s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, Object obj) {
        this.f1734r = i;
        this.f1735s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E4.g
    public final void a() {
        switch (this.f1734r) {
            case 0:
                k kVar = (k) this.f1735s;
                if (kVar.f1748m != null) {
                    kVar.f1740b.a("Unbind from service.", new Object[0]);
                    kVar.f1739a.unbindService(kVar.f1747l);
                    kVar.f1744g = false;
                    kVar.f1748m = null;
                    kVar.f1747l = null;
                }
                kVar.b();
                break;
            default:
                k kVar2 = (k) ((j) this.f1735s).f1737r;
                kVar2.f1740b.a("unlinkToDeath", new Object[0]);
                kVar2.f1748m.asBinder().unlinkToDeath(kVar2.j, 0);
                kVar2.f1748m = null;
                kVar2.f1744g = false;
                break;
        }
    }
}
