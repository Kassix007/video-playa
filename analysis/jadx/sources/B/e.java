package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import h.AbstractActivityC1106h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0683A f9862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f9863r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(C0683A c0683a, AbstractActivityC1106h abstractActivityC1106h) {
        this.f9862q = c0683a;
        this.f9863r = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        if (enumC0652o == EnumC0652o.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = f.a(this.f9863r);
            C0683A c0683a = this.f9862q;
            c0683a.f9850e = onBackInvokedDispatcherA;
            c0683a.d(c0683a.f9851g);
        }
    }
}
