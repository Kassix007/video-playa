package H2;

import M5.C0247h;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0643f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0247h f2134r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(C0247h c0247h, int i) {
        this.f2133q = i;
        this.f2134r = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void n(InterfaceC0660x interfaceC0660x) {
        switch (this.f2133q) {
            case 0:
                this.f2134r.resumeWith(C1386y.f15098a);
                break;
            default:
                this.f2134r.resumeWith(C1386y.f15098a);
                break;
        }
    }
}
