package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642e implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9541r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0642e(int i, Object obj) {
        this.f9540q = i;
        this.f9541r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        switch (this.f9540q) {
            case 0:
                new HashMap();
                InterfaceC0647j[] interfaceC0647jArr = (InterfaceC0647j[]) this.f9541r;
                if (interfaceC0647jArr.length > 0) {
                    InterfaceC0647j interfaceC0647j = interfaceC0647jArr[0];
                    throw null;
                }
                if (interfaceC0647jArr.length <= 0) {
                    return;
                }
                InterfaceC0647j interfaceC0647j2 = interfaceC0647jArr[0];
                throw null;
            default:
                if (enumC0652o == EnumC0652o.ON_CREATE) {
                    interfaceC0660x.getLifecycle().c(this);
                    ((Y) this.f9541r).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0652o).toString());
                }
        }
    }
}
