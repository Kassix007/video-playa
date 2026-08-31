package D2;

import M5.InterfaceC0241b0;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0660x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0654q f1358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0241b0 f1359r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(AbstractC0654q abstractC0654q, InterfaceC0241b0 interfaceC0241b0) {
        this.f1358q = abstractC0654q;
        this.f1359r = interfaceC0241b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.q
    public final void a() {
        this.f1358q.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void c(InterfaceC0660x interfaceC0660x) {
        this.f1359r.a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.q
    public final void start() {
        this.f1358q.a(this);
    }
}
