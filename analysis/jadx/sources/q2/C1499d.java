package q2;

import android.view.ViewGroup;

/* JADX INFO: renamed from: q2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1499d extends AbstractC1510o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15935a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f15936b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1499d(ViewGroup viewGroup) {
        this.f15936b = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1510o, q2.InterfaceC1507l
    public final void a() {
        C3.a.T(this.f15936b, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1510o, q2.InterfaceC1507l
    public final void b() {
        C3.a.T(this.f15936b, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
        if (!this.f15935a) {
            C3.a.T(this.f15936b, false);
        }
        abstractC1509n.x(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1510o, q2.InterfaceC1507l
    public final void e(AbstractC1509n abstractC1509n) {
        C3.a.T(this.f15936b, false);
        this.f15935a = true;
    }
}
