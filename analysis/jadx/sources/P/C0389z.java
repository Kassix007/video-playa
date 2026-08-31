package P;

/* JADX INFO: renamed from: P.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389z extends AbstractC0366l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5583b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5584c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0389z(B5.a aVar) {
        super(aVar);
        S s6 = S.f5377v;
        this.f5584c = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.AbstractC0366l0
    public final C0368m0 a(Object obj) {
        switch (this.f5583b) {
            case 0:
                return new C0368m0(this, obj, obj == null, null, true);
            default:
                return new C0368m0(this, obj, obj == null, (I0) this.f5584c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.AbstractC0366l0
    public V0 b() {
        switch (this.f5583b) {
            case 0:
                return (A) this.f5584c;
            default:
                return super.b();
        }
    }

    public C0389z(B5.c cVar) {
        super(C0388y.f5578q);
        this.f5584c = new A(cVar);
    }
}
