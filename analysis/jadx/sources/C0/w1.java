package C0;

import P.C0382u;
import P.InterfaceC0375q;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements InterfaceC0375q, InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f1143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0382u f1144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0654q f1146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B5.e f1147u = AbstractC0099r0.f1102a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w1(A a7, C0382u c0382u) {
        this.f1143q = a7;
        this.f1144r = c0382u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (!this.f1145s) {
            this.f1145s = true;
            this.f1143q.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC0654q abstractC0654q = this.f1146t;
            if (abstractC0654q != null) {
                abstractC0654q.c(this);
            }
        }
        this.f1144r.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        if (enumC0652o == EnumC0652o.ON_DESTROY) {
            d();
        } else {
            if (enumC0652o != EnumC0652o.ON_CREATE || this.f1145s) {
                return;
            }
            g(this.f1147u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(B5.e eVar) {
        this.f1143q.setOnViewTreeOwnersAvailable(new A.Y(5, this, eVar));
    }
}
