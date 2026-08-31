package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class E extends F implements InterfaceC0658v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0660x f9478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f9479v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g7, InterfaceC0660x interfaceC0660x, K k7) {
        super(g7, k7);
        this.f9479v = g7;
        this.f9478u = interfaceC0660x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        InterfaceC0660x interfaceC0660x2 = this.f9478u;
        EnumC0653p enumC0653pB = interfaceC0660x2.getLifecycle().b();
        if (enumC0653pB == EnumC0653p.f9556q) {
            this.f9479v.j(this.f9480q);
            return;
        }
        EnumC0653p enumC0653p = null;
        while (enumC0653p != enumC0653pB) {
            d(i());
            enumC0653p = enumC0653pB;
            enumC0653pB = interfaceC0660x2.getLifecycle().b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.F
    public final void g() {
        this.f9478u.getLifecycle().c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.F
    public final boolean h(InterfaceC0660x interfaceC0660x) {
        return this.f9478u == interfaceC0660x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.F
    public final boolean i() {
        return this.f9478u.getLifecycle().b().compareTo(EnumC0653p.f9559t) >= 0;
    }
}
