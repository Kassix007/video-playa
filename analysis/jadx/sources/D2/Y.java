package d2;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0963J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12051a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0997w f12052b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(C0997w c0997w) {
        this.f12052b = c0997w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0963J
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f12051a) {
            this.f12051a = false;
            this.f12052b.f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0963J
    public final void b(RecyclerView recyclerView, int i, int i7) {
        if (i == 0 && i7 == 0) {
            return;
        }
        this.f12051a = true;
    }
}
